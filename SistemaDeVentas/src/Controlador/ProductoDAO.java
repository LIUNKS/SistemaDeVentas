package Controlador;

import Modelo.Conexion;
import Modelo.Producto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JComboBox;

public class ProductoDAO {
    
    //DATOS PARA INTERACTUAR CON LA BASE DE DATOS
    Connection connection;
    PreparedStatement declaracion;
    ResultSet resultado;

    //INSTANCIAS
    Conexion conexion = new Conexion();
    
    
    //METODO PARA REGISTRAR LOS PROVEEDORES EN LA BASE DE DATOS
    public boolean RegistrarProducto(Producto producto) {
        String sql = "INSERT INTO productos (codigo, nombre, proveedor, stock, precio) VALUES (?, ?, ?, ?, ?)";
        try {
            
            connection = conexion.getConnection();
            declaracion = connection.prepareStatement(sql);
            declaracion.setString(1, producto.getCodigo());
            declaracion.setString(2, producto.getNombre());
            declaracion.setString(3, producto.getProveedor());
            declaracion.setInt(4, producto.getStock());
            declaracion.setDouble(5, producto.getPrecio());
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
    
    //METODO PARA CONSULTAR PROVEEDOR EN LA SECCION DE PRODUCTOS
    public void ConsultarProveedor(JComboBox proveedor ){
        String sql = "SELECT nombre FROM proveedor";
        
        try {
            
            connection = conexion.getConnection();
            declaracion = connection.prepareStatement(sql);
            resultado = declaracion.executeQuery();
            while (resultado.next()) {                
                proveedor.addItem(resultado.getString("nombre"));
            }
            
        } catch (Exception e) {
            
            System.out.println(e.toString());
            
        }
    }
    
    //ASIGNA LA INFORMACION DE LA BASE DE DATOS A LA TABLA DE CLIENTES 
    public List listarProductos(){
        List<Producto> listaProducto = new ArrayList();
        String sql = "SELECT * FROM productos";
        
        try {
            connection = conexion.getConnection();
            declaracion = connection.prepareStatement(sql);
            resultado = declaracion.executeQuery();
            while (resultado.next()) {
                Producto producto = new Producto();
                producto.setId(resultado.getInt("id"));
                producto.setCodigo(resultado.getString("codigo"));
                producto.setNombre(resultado.getString("nombre"));
                producto.setProveedor(resultado.getString("proveedor"));
                producto.setStock(resultado.getInt("stock"));
                producto.setPrecio(resultado.getDouble("precio"));
                listaProducto.add(producto);
            }
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        
        return listaProducto;
    }
}