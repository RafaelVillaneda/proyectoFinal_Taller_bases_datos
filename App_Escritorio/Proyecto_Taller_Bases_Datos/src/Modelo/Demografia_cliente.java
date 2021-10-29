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
public class Demografia_cliente {
    private String id;
    private String desc;

    public Demografia_cliente() {
    }

    public Demografia_cliente(String id, String desc) {
        this.id = id;
        this.desc = desc;
    }

    public String getId() {
        return id;
    }

    public String getDesc() {
        return desc;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Override
    public String toString() {
        return "Demografia_cliente{" + "id=" + id + ", desc=" + desc + '}';
    }
    
    
    
}
