package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    
    //CONEXION CON LA BASE DE DATOS
    Connection conexion;
    public Connection getConnection(){
        try{
            String baseDatos = "jdbc:ucanaccess://src/Documentos/sistemaventaferreteria.accdb";
            conexion = DriverManager.getConnection(baseDatos);
            return conexion;
        } catch (SQLException e){
            System.out.println(e.toString());
        }
        
        return null;
    }
}
