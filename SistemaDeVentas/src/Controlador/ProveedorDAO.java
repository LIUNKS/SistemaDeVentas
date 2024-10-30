package Controlador;

import Modelo.Proveedor;
import Modelo.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProveedorDAO {

    //DATOS PARA INTERACTUAR CON LA BASE DE DATOS
    Connection connection;
    PreparedStatement declaracion;
    ResultSet resultado;

    //INSTANCIAS
    Conexion conexion = new Conexion();

    //METODO PARA REGISTRAR LOS PROVEEDORES EN LA BASE DE DATOS
    public boolean RegistrarProveedor(Proveedor proveedor) {
        String sql = "INSERT INTO proveedor (ruc, nombre, telefono, direccion, razon) VALUES (?, ?, ?, ?, ?)";
        try {
            
            connection = conexion.getConnection();
            declaracion = connection.prepareStatement(sql);
            declaracion.setInt(1, proveedor.getRuc());
            declaracion.setString(2, proveedor.getNombre());
            declaracion.setInt(3, proveedor.getTelefono());
            declaracion.setString(4, proveedor.getDireccion());
            declaracion.setString(5, proveedor.getRazonSocial());
            declaracion.execute();
            return true;

        } catch (SQLException e) {
            
            System.out.println(e.toString());
            return false;
            
        } finally {
            
            try {
                connection.close();
            } catch (SQLException e) {
                System.out.println(e.toString());
            }
            
        }
    }
    
    //ASIGNA LA INFORMACION DE LA BASE DE DATOS A LA TABLA DE CLIENTES 
    public List listarProveedor(){
        List<Proveedor> listaProveedor = new ArrayList();
        String sql = "SELECT * FROM clientes";
        
        try {
            connection = conexion.getConnection();
            declaracion = connection.prepareStatement(sql);
            resultado = declaracion.executeQuery();
            while (resultado.next()) {
                Proveedor proveedor = new Proveedor();
                proveedor.setId(resultado.getInt("id"));
                proveedor.setRuc(resultado.getInt("dni"));
                proveedor.setNombre(resultado.getString("nombre"));
                proveedor.setTelefono(resultado.getInt("telefono"));
                proveedor.setDireccion(resultado.getString("direccion"));
                proveedor.setRazonSocial(resultado.getString("razon"));
                listarProveedor().add(proveedor);
            }
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        
        return listaProveedor;
    }
}
