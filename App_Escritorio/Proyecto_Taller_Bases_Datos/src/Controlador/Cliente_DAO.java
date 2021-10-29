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
    
}
