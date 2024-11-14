package Reportes;

import Modelo.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;

public class reporteGrafico {

    public static void Graficar(String fecha) {
        //DATOS PARA INTERACTUAR CON LA BASE DE DATOS
        Connection connection;
        PreparedStatement declaracion;
        ResultSet resultado;

        //INSTANCIAS
        Conexion conexion = new Conexion();
        
        try {
            String sql = "SELECT total FROM ventas WHERE fecha=?";
            connection = conexion.getConnection();
            declaracion = connection.prepareStatement(sql);
            declaracion.setString(1, fecha);
            resultado = declaracion.executeQuery();
            DefaultPieDataset dataset = new DefaultPieDataset();
            while (resultado.next()) {                
                dataset.setValue(resultado.getString("total"), resultado.getDouble("total"));
            }
            JFreeChart jfree = ChartFactory.createPieChart("Reporte de Venta", dataset);
            ChartFrame frame = new ChartFrame("Total de ventas por día", jfree);
            frame.setSize(1000,500);
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
    }
}
