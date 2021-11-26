/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;
import ConexionBD.ConexionBD;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperDesignViewer;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author Rafael Villaneda
 */
public class llamarReporte {

    public llamarReporte() {}
    
    public void mostrarReporte(){
        
        try {
            String ruta=System.getProperty("user.dir")+"/src/Reportes/report1.jasper";
            JasperReport jaspe=(JasperReport)JRLoader.loadObjectFromFile(ruta);
            JasperPrint print=JasperFillManager.fillReport(jaspe, null,ConexionBD.getConexion());
            JasperViewer view= new JasperViewer(print,false);
            view.setVisible(true);
        } catch (Exception e) {
            System.err.println("Error al generar el reporte---->"+e.getMessage());
        }
        
    }
    
}
