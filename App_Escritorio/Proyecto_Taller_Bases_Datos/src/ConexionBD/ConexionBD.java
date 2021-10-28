/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConexionBD;
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
      
}

