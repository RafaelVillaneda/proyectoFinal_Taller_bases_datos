/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import ConexionBD.ConexionBD;
import Modelo.*;

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
    
}
