/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import ConexionBD.ConexionBD;
import Modelo.Cliente;
import Modelo.Cliente_demo;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Rafael Villaneda
 */
public class Cliente_demo_DAO {
    public boolean insertarRegistro(Cliente_demo c) {
		boolean resultado=false;
		resultado=ConexionBD.AgregarRegistroTablaClientesDemo(c);
		return resultado;	
	}
    public boolean actualizar(Cliente_demo cli,String cambio){
       boolean resutado=false;
       resutado=ConexionBD.ActualizarRegistroClienteDemo(cli,cambio);
       return resutado;
    }
    
    public boolean borrarRegistro(Cliente_demo c){
        boolean resultado = false;
        System.out.println(c);
        String sql="DELETE FROM customercustomerdemo WHERE CustomerID='"+c.getIdCliente()+"' AND CustomerTypeID='"+c.getIdDemo()+"';";
	resultado = ConexionBD.EliminarRegistro(sql);
	return resultado;
    }
    public Cliente_demo buscar(String filtro,String filtro2){
        
    Cliente_demo cli=new Cliente_demo();
		String sql="SELECT * FROM customercustomerdemo WHERE CustomerID ='"+filtro+"' AND  CustomerTypeID='"+filtro2+"';";
		
		ResultSet rs=ConexionBD.ConsultarRegistro(sql);
		
		try {
			if(rs.next()) {
                            cli.setIdCliente(rs.getString(1));
                            cli.setIdDemo(rs.getString(2));
			}else {
				return null;
			}
		} catch (SQLException e) {
                        System.err.println("No encontro nada");
		}
		return cli;
    }
    
}
