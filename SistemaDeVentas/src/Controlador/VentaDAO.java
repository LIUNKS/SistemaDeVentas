package Controlador;

import Modelo.Conexion;
import Modelo.Detalle;
import Modelo.Venta;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class VentaDAO {
    
    //DATOS PARA INTERACTUAR CON LA BASE DE DATOS
    Connection connection;
    PreparedStatement declaracion;
    ResultSet resultado;
    int respuesta;

    //INSTANCIAS
    Conexion conexion = new Conexion();
    
    //METODO PARA BUSCAR EL ID DE LA VENTA
    public int IdVenta(){
        int id = 0;
        String sql = "SELECT MAX(id) FROM ventas";
        try {
            connection = conexion.getConnection();
            declaracion = connection.prepareStatement(sql);
            resultado = declaracion.executeQuery();
            if(resultado.next()){
                id = resultado.getInt(1);
            }
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        
        return id;
    }
    
    //METODO PARA REGISTRAR LA VENTA EN LA BASE DE DATOS
    public int registrarVenta(Venta venta){
        String sql = "INSERT INTO ventas (cliente, vendedor, total, fecha) VALUES (?, ?, ?,?)";
        try {
            connection = conexion.getConnection();
            declaracion = connection.prepareStatement(sql);
            declaracion.setString(1, venta.getCliente());
            declaracion.setString(2, venta.getVendedor());
            declaracion.setDouble(3, venta.getTotal());
            declaracion.setString(4, venta.getFecha());
            declaracion.execute();
        } catch (SQLException e) {
            
            System.out.println(e.toString());
            
        } finally {
            try {
                connection.close();
            } catch (SQLException e) {
                System.out.println(e.toString());
            }
        }
        
        return respuesta;
    }
    
    //METODO PARA REGISTRAR EL DETALLE DE LA VENTA EN LA BASE DE DATOS
    public int registrarDetalle(Detalle detalle){
        String sql = "INSERT INTO detalle (cod_pro, cantidad, precio, id_venta) VALUES (?,?,?,?)";
        try {
            connection = conexion.getConnection();
            declaracion = connection.prepareStatement(sql);
            declaracion.setString(1, detalle.getCod_pro());
            declaracion.setInt(2, detalle.getCantidad());
            declaracion.setDouble(3, detalle.getPrecio());
            declaracion.setInt(4, detalle.getId());
            declaracion.execute();
            
        } catch (SQLException e) {
            
            System.out.println(e.toString());
            
        } finally {
            try {
                connection.close();
            } catch (SQLException e) {
                System.out.println(e.toString());
            }
        }
        
        return respuesta;
    }
    
    //ACTUALIZAR EL NUMERO DE STOCK DISPONIBLE LUEGO DE UNA VENTA
    public boolean actualizarStock(int cantidad, String codigo){
        String sql = "UPDATE productos SET stock = ? WHERE codigo = ?";
        try {
            connection = conexion.getConnection();
            declaracion = connection.prepareStatement(sql);
            declaracion.setInt(1, cantidad);
            declaracion.setString(2, codigo);
            declaracion.execute();
            return true;
        } catch (SQLException e) {
            System.out.println(e.toString());
            return false;
        }
    }
    
    //ASIGNA LA INFORMACION DE LA BASE DE DATOS A LA TABLA DE VENTAS
    public List listarVentas(){
        List<Venta> listaVenta = new ArrayList();
        String sql = "SELECT * FROM ventas";
        
        try {
            connection = conexion.getConnection();
            declaracion = connection.prepareStatement(sql);
            resultado = declaracion.executeQuery();
            while (resultado.next()) {
                Venta venta = new Venta();
                venta.setId(resultado.getInt("id"));
                venta.setCliente(resultado.getString("cliente"));
                venta.setVendedor(resultado.getString("vendedor"));
                venta.setTotal(resultado.getDouble("total"));
                listaVenta.add(venta);
            }
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        
        return listaVenta;
    }
}
