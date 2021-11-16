/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;
import ConexionBD.ConexionBD;
import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;

/**
 *
 * @author Rafael Villaneda
 */
public class Graficos {
    
        Connection c = ConexionBD.getConexion();
        
    
        public void dibujar(){
            try {
                String consulta="SELECT city,COUNT(City)AS Cantidad FROM CUSTOMERS WHERE (city IS NOT null) GROUP BY city;";
                
                //Statement statement=c.createStatement();
                ResultSet rs=ConexionBD.ConsultarRegistro(consulta);
                
                DefaultPieDataset dataset=new DefaultPieDataset();
                
                try {
                    while(rs.next()){
                        dataset.setValue(rs.getString("City"), Integer.parseInt(rs.getString("Cantidad")));
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(Graficos.class.getName()).log(Level.SEVERE, null, ex);
                }

                //dibujamos el grafico
                
                JFreeChart chart= ChartFactory.createPieChart("Grafico de cantidad de clientes por ciudad", dataset, true, true, false);
                
                //tamano para la imgen
                int ancho=1000;
                int alto=1000;
                File f=new File("Grafico.png");
                ChartUtilities.saveChartAsPNG(f, chart, alto, ancho);
            } catch (IOException ex) {
                Logger.getLogger(Graficos.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
}
