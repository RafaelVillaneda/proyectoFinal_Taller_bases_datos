/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import ConexionBD.ConexionBD;
import Modelo.*;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Rafael Villaneda
 */
public class Demografia_cliente_DAO {
    
    public boolean insertarRegistro(Demografia_cliente c) {
		boolean resultado=false;
		resultado=ConexionBD.AgregarRegistroTablaDemografias(c);
		return resultado;	
	}
    public boolean actualizar(Demografia_cliente c) {
		boolean resultado=false;
		resultado=ConexionBD.ActualizarRegistroClienteDemografia(c);
		return resultado;	
	}
    public boolean borrarRegistro(Demografia_cliente c){
        boolean resultado = false;
        System.out.println(c);
        String sql="DELETE FROM customerdemographics WHERE CustomerTypeID='"+c.getId()+"'";
	resultado = ConexionBD.EliminarRegistro(sql);
	return resultado;
    }
    public Demografia_cliente buscar(String filtro) {
        
        
    Demografia_cliente mov=new Demografia_cliente();
		String sql="SELECT * FROM customerdemographics WHERE CustomerTypeID ='"+filtro+"';";
		
		ResultSet rs=ConexionBD.ConsultarRegistro(sql);
		
		try {
			
			if(rs.next()) {
				mov.setId(rs.getString(1));
				mov.setDesc(rs.getString(2));
			}else {
				return null;
			}
		} catch (SQLException e) {
			//e.printStackTrace();
                        System.err.println("No encontro nada");
		}//0==no 1==si
		return mov;
    
    }
    
}
