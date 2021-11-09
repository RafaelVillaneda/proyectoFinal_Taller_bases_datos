/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import ConexionBD.ConexionBD;
import Modelo.Cliente_demo;

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
}
