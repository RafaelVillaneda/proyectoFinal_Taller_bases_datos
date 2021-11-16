/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConexionBD;
import Modelo.Cliente;
import Modelo.Cliente_demo;
import Modelo.Demografia_cliente;
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
        public static boolean Transaccion(String instruccion){
		 try{
			pstm = conexion.prepareStatement(instruccion);
		        pstm.executeUpdate();
		        return true;
		 } catch (Exception ex) {
		        System.out.println(ex.toString());
		 }
		 return false;
	}
        
        public static boolean ActualizarRegistroCliente(Cliente a){
		
		 try {
			    pstm = conexion.prepareStatement("UPDATE customers SET CompanyName=?,ContactName=?,ContactTitle=?,Address=?,City=?,Region=?,"
                                    + "PostalCode=?,Country=?,Phone=?,Fax=? WHERE CustomerID='"+a.getId()+"';");
			    pstm.setString(1,a.getNombre_compañia());
                            pstm.setString(2,a.getNombre_contacto());
                            pstm.setString(3,a.getTitulo_contacto());
                            pstm.setString(4,a.getDireccion());
                            pstm.setString(5,a.getCiudad());
                            pstm.setString(6,a.getRegion());
                            pstm.setString(7,a.getCodigo_postal());
                            pstm.setString(8,a.getPais());
                            pstm.setString(9,a.getTelefono());
                            pstm.setString(10,a.getFax());
		        pstm.executeUpdate();
		        
		        return true;
		        
		 } catch (Exception ex) {
		        System.out.println(ex.toString());
		 }
		 return false;
	}
        public static boolean ActualizarRegistroClienteDemo(Cliente_demo a,String cambio){
		
		 try {//Aqui esta el procedimientos almacenado para mostrar en mysql: SHOW CREATE PROCEDURE sp_cambio_cliente_demo;
                    pstm = conexion.prepareStatement("CALL sp_cambio_cliente_demo(?,?,?)");
                        pstm.setString(1,a.getIdCliente());
                        pstm.setString(2,a.getIdDemo());
                        pstm.setString(3,cambio);
                        System.out.println(a);
		        pstm.executeUpdate();
                        
		        return true;
		 } catch (Exception ex) {
		        System.out.println(ex.toString());
		 }
		 return false;
	}
        public static boolean ActualizarRegistroClienteDemografia(Demografia_cliente a){
		
		 try {
			pstm = conexion.prepareStatement("UPDATE customerdemographics SET CustomerDesc=? WHERE CustomerTypeID='"+a.getId()+"'");
                        pstm.setString(1,a.getDesc());
			   
		        pstm.executeUpdate();
		        
		        return true;
		        
		 } catch (Exception ex) {
		        System.out.println(ex.toString());
		 }
		 return false;
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
		   // e.printStackTrace();
		}
		return false;
	}
        
        public static   boolean AgregarRegistroTablaDemografias(Demografia_cliente cliente) {
		try {
		      // Creamos el PreparedStatement si no estaba ya creado.
		        pstm = conexion.prepareStatement("insert into customerdemographics values(?,?)");
		      pstm.setString(1,cliente.getId());
                      pstm.setString(2,cliente.getDesc());
		      
	          pstm.executeUpdate();
 	          return true;
		         
		} catch (SQLException e) {
		    //e.printStackTrace();
		}
		return false;
	}
        
        public static   boolean AgregarRegistroTablaClientesDemo(Cliente_demo cliente) {
		try {
		      // Creamos el PreparedStatement si no estaba ya creado.
		      pstm = conexion.prepareStatement("insert into customercustomerdemo values(?,?)");
		      pstm.setString(1,cliente.getIdCliente());
                      pstm.setString(2,cliente.getIdDemo());
		      
	          pstm.executeUpdate();
 	          return true;
		         
		} catch (SQLException e) {
		    //System.err.println("Me mori");
		}
		return false;
	}
        
      
}

