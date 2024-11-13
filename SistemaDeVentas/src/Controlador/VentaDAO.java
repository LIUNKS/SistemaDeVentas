package Controlador;

import Modelo.Conexion;
import Modelo.Detalle;
import Modelo.Venta;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class VentaDAO {
    
    //DATOS PARA INTERACTUAR CON LA BASE DE DATOS
    Connection connection;
    PreparedStatement declaracion;
    ResultSet resultado;
    int respuesta;

    //INSTANCIAS
    Conexion conexion = new Conexion();
    
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
        String sql = "INSERT INTO ventas (cliente, vendedor, total) VALUES (?, ?, ?)";
        try {
            connection = conexion.getConnection();
            declaracion = connection.prepareStatement(sql);
            declaracion.setString(1, venta.getCliente());
            declaracion.setString(2, venta.getVendedor());
            declaracion.setDouble(3, venta.getTotal());
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
}
