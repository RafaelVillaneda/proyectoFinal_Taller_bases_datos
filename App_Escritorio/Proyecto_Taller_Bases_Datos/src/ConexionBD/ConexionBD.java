/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConexionBD;
import Modelo.Cliente;
import java.sql.*;

/**
 *
 * @author Rafael Villaneda
 */
public class ConexionBD {

	private static Connection conexion=null;
	private static PreparedStatement pstm; 
	private static ResultSet rs;
	
	private ConexionBD() {
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
			
		String URL = "jdbc:mysql://localhost:3306/northwind";
			
		conexion = DriverManager.getConnection(URL, "rafa", "rafaferrari01");
			
		} catch (ClassNotFoundException e) {
			System.out.println("Error de DRIVER");
		} catch (SQLException e) {
			System.out.println("Error de conexion en MySQL");
		}
	}
	public static Connection getConexion(){
		 
		 if (conexion == null){
		     new ConexionBD();
		 }
		  
		 return conexion;
   }

	
	static void cerrarConexion() {
		try {
			pstm.close();
			conexion.close();
		} catch (SQLException e) {
			System.out.println("Error al cerrar la conexion");
			e.printStackTrace();
		}
	}
        //-----------------------------------------------------------
      public static boolean EliminarRegistro(String instruccion){
		 try {
			    String consulta = instruccion;
			    pstm = conexion.prepareStatement(consulta);
		        pstm.executeUpdate();
		        return true;
		 } catch (Exception ex) {
		        System.out.println(ex.toString());
		 }
		 return false;
	}
	
	public static  ResultSet ConsultarRegistro(String consulta){
		
		 try {
		pstm = conexion.prepareStatement(consulta);
		return pstm.executeQuery();
		        
		 } catch (Exception ex) {
                    System.out.println("aqui estoy");
		       // System.out.println(ex.toString());
		 }
		 return null;
	}
        
        public static   boolean AgregarRegistroTablaClietes(Cliente cliente) {
		try {
		      // Creamos el PreparedStatement si no estaba ya creado.
		        pstm = conexion.prepareStatement("insert into customers values(?,?,?,?,?"
                                + ",?,?,?,?,?,"
                                + "?)");
		      pstm.setString(1,cliente.getId());//---
                      pstm.setString(2,cliente.getNombre_compañia());
                      pstm.setString(3,cliente.getNombre_contacto());
                      pstm.setString(4,cliente.getTitulo_contacto());
                      pstm.setString(5,cliente.getDireccion());
                      pstm.setString(6,cliente.getCiudad());
                      pstm.setString(7,cliente.getRegion());
                      pstm.setString(8,cliente.getCodigo_postal());
                      pstm.setString(9,cliente.getPais());
                      pstm.setString(10,cliente.getTelefono());
                      pstm.setString(11,cliente.getFax());
		      
	          pstm.executeUpdate();
 	          return true;
		         
		} catch (SQLException e) {
		    e.printStackTrace();
		}
		return false;
	}
      
}

