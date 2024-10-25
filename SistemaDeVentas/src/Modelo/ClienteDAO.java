package Modelo;

import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import java.sql.SQLException;

public class ClienteDAO {

    //DATOS PARA INTERACTUAR CON LA BASE DE DATOS
    Connection connection;
    PreparedStatement declaracion;
    ResultSet resultado;
    
    //INSTANCIAS
    Conexion conexion = new Conexion();
    
    //METODO PARA REGISTRAR LOS CLIENTES EN LA BASE DE DATOS
    public boolean RegistrarCliente(Cliente cliente){
        String sql = "INSERT INTO clientes (dni, nombre, telefono, direccion, razon) VALUES (?, ?, ?, ?, ?)";
        try {
            connection = conexion.getConnection();
            declaracion = connection.prepareStatement(sql);
            declaracion.setInt(1, cliente.getDni());
            declaracion.setString(2, cliente.getNombre());
            declaracion.setInt(3, cliente.getTelefono());
            declaracion.setString(4, cliente.getDireccion());
            declaracion.setString(5, cliente.getRazonSocial());
            declaracion.execute();
            return true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.toString());
            return false;
        } finally {
            try {
                connection.close();
            } catch (Exception e) {
                System.out.println(e.toString());
            }
        }
    }
    
    //ASIGNA LA INFORMACION DE LA BASE DE DATOS A LA TABLA DE CLIENTES 
    public List listarCliente(){
        List<Cliente> listaCliente = new ArrayList();
        String sql = "SELECT * FROM clientes";
        
        try {
            connection = conexion.getConnection();
            declaracion = connection.prepareStatement(sql);
            resultado = declaracion.executeQuery();
            while (resultado.next()) {
                Cliente cliente = new Cliente();
                cliente.setIdCliente(resultado.getInt("id"));
                cliente.setDni(resultado.getInt("dni"));
                cliente.setNombre(resultado.getString("nombre"));
                cliente.setTelefono(resultado.getInt("telefono"));
                cliente.setDireccion(resultado.getString("direccion"));
                cliente.setRazonSocial(resultado.getString("razon"));
                listaCliente.add(cliente);
            }
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        
        return listaCliente;
    }
    
    //METODO PARA ELIMINAR CLIENTE
    public boolean eliminarCliente(int id){
        //CONSULTA A LA BASE DE DATOS
        String sql = "DELETE FROM clientes WHERE id = ?";
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
