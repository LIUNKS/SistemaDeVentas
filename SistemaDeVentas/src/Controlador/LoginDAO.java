package Controlador;

import Modelo.Conexion;
import Modelo.Login;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginDAO {
    
    //DATOS PARA INTERACTUAR CON LA BASE DE DATOS
    Connection connection;
    PreparedStatement declaracion;
    ResultSet resultado;
    
    //INSTANCIA
    Conexion conexion = new Conexion();
    
    
    public Login log(String correo, String pass){
        //INSTANCIA
        Login login = new Login();
        //CONSULTA A LA BASE DE DATOS
        String sql = "SELECT * FROM usuario WHERE correo = ? AND pass = ?";
        
        //MANEJO DE EXCEPCIONES
        try {
            //METODO PARA MANTENER LA CONECCION ACTIVA CON LA BASE DE DATOS
            connection = conexion.getConnection();
            //CONSULTA PREPARADA PARA LA BASE DE DATOS
            declaracion = connection.prepareStatement(sql);
            //ASIGNACION DE VALORES (CORREO Y CONTRASEÑA)
            declaracion.setString(1, correo);
            declaracion.setString(2, pass);
            //VERIFICA SI HAY UNA FILA QUE COINCIDA CON LA CONSULTA
            resultado = declaracion.executeQuery();
            if (resultado.next()){
                //ASIGNACION DE DATOS AL OBJETO LOGIN
                login.setId(resultado.getInt("id"));
                login.setNombre(resultado.getString("nombre"));
                login.setCorreo(resultado.getString("correo"));
                login.setPass(resultado.getString("pass"));
            }
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        
        return login;
    }
    
}
