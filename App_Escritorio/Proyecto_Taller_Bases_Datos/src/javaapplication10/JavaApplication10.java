/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication10;
import Vistas.Login;
import Modelo.Graficos;
import Vistas.PantallaPrincipal;
import ConexionBD.ConexionBD;
import java.sql.Connection;


/**
 *
 * @author Rafael Villaneda
 */
public class JavaApplication10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //new Login().setVisible(true);
        Connection a = ConexionBD.getConexion();
        new PantallaPrincipal().setVisible(true);
       // llamarReporte llamado=new llamarReporte();
        //llamado.mostrarReporte();
        //Graficos gr=new Graficos();
        //gr.dibujar();
    }
    
}
