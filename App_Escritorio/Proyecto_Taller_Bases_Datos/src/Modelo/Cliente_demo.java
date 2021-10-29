/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Rafael Villaneda
 */
public class Cliente_demo {
    private  String idCliente;
    private  String idDemo;

    public Cliente_demo() {
    }

    public Cliente_demo(String idCliente, String idDemo) {
        this.idCliente = idCliente;
        this.idDemo = idDemo;
    }

    public String getIdCliente() {
        return idCliente;
    }

    public String getIdDemo() {
        return idDemo;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    public void setIdDemo(String idDemo) {
        this.idDemo = idDemo;
    }

    @Override
    public String toString() {
        return "Cliente_demo{" + "idCliente=" + idCliente + ", idDemo=" + idDemo + '}';
    }
    
}
