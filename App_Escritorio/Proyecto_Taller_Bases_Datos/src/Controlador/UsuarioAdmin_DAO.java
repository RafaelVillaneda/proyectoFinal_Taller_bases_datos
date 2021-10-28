/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;
import  Modelo.UsuarioAdmin;
import java.sql.ResultSet;
import java.sql.SQLException;

import ConexionBD.ConexionBD;


/**
 *
 * @author Rafael Villaneda
 */
public class UsuarioAdmin_DAO {
    
    public UsuarioAdmin buscar(String filtro){
        
    UsuarioAdmin mov=new UsuarioAdmin();
		String sql="SELECT * FROM usuarios_administradores WHERE usuario ='"+filtro+"';";
		
		ResultSet rs=ConexionBD.ConsultarRegistro(sql);
		
		try {
			
			if(rs.next()) {
				mov.setUsuario(rs.getString(1));
				mov.setContraseña(rs.getString(2));
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
