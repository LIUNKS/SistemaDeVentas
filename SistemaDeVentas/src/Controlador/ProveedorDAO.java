package Controlador;

import Modelo.Proveedor;
import Modelo.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProveedorDAO implements _Operaciones{

    //DATOS PARA INTERACTUAR CON LA BASE DE DATOS
    Connection connection;
    PreparedStatement declaracion;
    ResultSet resultado;

    //INSTANCIAS
    Conexion conexion = new Conexion();

    //METODO PARA REGISTRAR LOS PROVEEDORES EN LA BASE DE DATOS
    public boolean registrarProveedor(Proveedor proveedor) {
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
    
    //METODO PARA ACTUALIZAR DATOS DEL PROVEEDOR
    public boolean modificarProveedor(Proveedor proveedor){
        
        String sql = "UPDATE proveedor SET ruc=?, nombre=?, telefono=?, direccion=?, razon=? WHERE id=?";
        try {
            declaracion = connection.prepareStatement(sql);
            declaracion.setInt(1, proveedor.getRuc());
            declaracion.setString(2, proveedor.getNombre());
            declaracion.setInt(3, proveedor.getTelefono());
            declaracion.setString(4, proveedor.getDireccion());
            declaracion.setString(5, proveedor.getRazonSocial());
            declaracion.setInt(6, proveedor.getId());
            declaracion.execute();
            
            return true;
            
        } catch (SQLException e) {
            System.out.println(e.toString());
            
            return false;
            
        } finally {
            try {
                connection.close();
            } catch (SQLException ex) {
                System.out.println(ex.toString());
            }
        }
    }
    
    //ASIGNA LA INFORMACION DE LA BASE DE DATOS A LA TABLA DE PROVEEDOR
    @Override
    public List listar(){
        List<Proveedor> listaProveedor = new ArrayList();
        String sql = "SELECT * FROM proveedor";
        
        try {
            connection = conexion.getConnection();
            declaracion = connection.prepareStatement(sql);
            resultado = declaracion.executeQuery();
            while (resultado.next()) {
                Proveedor proveedor = new Proveedor();
                proveedor.setId(resultado.getInt("id"));
                proveedor.setRuc(resultado.getInt("ruc"));
                proveedor.setNombre(resultado.getString("nombre"));
                proveedor.setTelefono(resultado.getInt("telefono"));
                proveedor.setDireccion(resultado.getString("direccion"));
                proveedor.setRazonSocial(resultado.getString("razon"));
                listaProveedor.add(proveedor);
            }
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        
        return listaProveedor;
    }
    
    //METODO PARA ELIMINAR PROVEEDOR
    @Override
    public boolean eliminar(int id){
        //CONSULTA A LA BASE DE DATOS
        String sql = "DELETE FROM proveedor WHERE id = ?";
        //MANEJO DE EXCEPCIONES
        try {
            declaracion = connection.prepareStatement(sql);
            declaracion.setInt(1, id);
            declaracion.execute();
            return true;
        } catch (SQLException e) {
            System.out.println(e.toString());
            return false;
        } finally {
            try {
                connection.close();
            } catch (SQLException ex) {
                System.out.println(ex.toString());
            }
        }
    }
}
