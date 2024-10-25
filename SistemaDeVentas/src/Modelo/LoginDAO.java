package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class LoginDAO {
    
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    
    Conexion cn = new Conexion();
    
    
    public Login log(String correo, String pass){
        Login login = new Login();
        String sql = "SELECT * FROM usuario WHERE correo = ? AND pass = ?";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, correo);
            ps.setString(2, pass);
            rs = ps.executeQuery();
            if (rs.next()){
                login.setId(rs.getInt("id"));
                login.setNombre(rs.getString("nombre"));
                login.setCorreo(rs.getString("correo"));
                login.setPass(rs.getString("pass"));
            }
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        
        return login;
    }
}
