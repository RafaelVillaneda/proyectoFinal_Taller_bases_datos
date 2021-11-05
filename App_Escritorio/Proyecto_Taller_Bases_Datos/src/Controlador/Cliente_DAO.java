/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;
import Modelo.Cliente;
import ConexionBD.ConexionBD;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Rafael Villaneda
 */
public class Cliente_DAO {
    
    public boolean insertarRegistro(Cliente c) {
		boolean resultado=false;
		resultado=ConexionBD.AgregarRegistroTablaClietes(c);
		return resultado;	
	}
    public boolean modificarRegistro(Cliente a) {
        boolean resultado = false;
	resultado = ConexionBD.ActualizarRegistroCliente(a);
	return resultado;
	}
    public Cliente buscar(String filtro){
        
    Cliente mov=new Cliente();
		String sql="SELECT * FROM customers WHERE CustomerID ='"+filtro+"';";
		
		ResultSet rs=ConexionBD.ConsultarRegistro(sql);
		
		try {
			
			if(rs.next()) {
				mov.setId(rs.getString(1));
                                mov.setNombre_compañia(rs.getString(2));
                                mov.setNombre_contacto(rs.getString(3));
                                mov.setTitulo_contacto(rs.getString(4));
                                mov.setDireccion(rs.getString(5));
                                mov.setCiudad(rs.getString(6));
                                mov.setRegion(rs.getString(7));
                                mov.setCodigo_postal(rs.getString(8));
                                mov.setPais(rs.getString(9));
                                mov.setTelefono(rs.getString(10));
                                mov.setFax(rs.getString(11));
			}else {
				return null;
			}
		} catch (SQLException e) {
                        System.err.println("No encontro nada");
		}
		return mov;
    }
    
}
