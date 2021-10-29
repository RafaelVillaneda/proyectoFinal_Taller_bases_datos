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
public class Cliente {
    private  String id;
    private  String nombre_compañia;
    private  String nombre_contacto;
    private  String titulo_contacto;
    private  String direccion;
    private  String ciudad;
    private  String region;
    private  String codigo_postal;
    private  String pais;
    private  String telefono;
    private  String fax;

    public Cliente() {}
    public Cliente(String id, String nombre_compañia, String nombre_contacto, String titulo_contacto, String direccion, String ciudad, String region, String codigo_postal, String pais, String telefono, String fax) {
        this.id = id;
        this.nombre_compañia = nombre_compañia;
        this.nombre_contacto = nombre_contacto;
        this.titulo_contacto = titulo_contacto;
        this.direccion = direccion;
        this.ciudad = ciudad;
        this.region = region;
        this.codigo_postal = codigo_postal;
        this.pais = pais;
        this.telefono = telefono;
        this.fax = fax;
    }

    public String getId() {
        return id;
    }

    public String getNombre_compañia() {
        return nombre_compañia;
    }

    public String getNombre_contacto() {
        return nombre_contacto;
    }

    public String getTitulo_contacto() {
        return titulo_contacto;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public String getRegion() {
        return region;
    }

    public String getCodigo_postal() {
        return codigo_postal;
    }

    public String getPais() {
        return pais;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getFax() {
        return fax;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setNombre_compañia(String nombre_compañia) {
        this.nombre_compañia = nombre_compañia;
    }

    public void setNombre_contacto(String nombre_contacto) {
        this.nombre_contacto = nombre_contacto;
    }

    public void setTitulo_contacto(String titulo_contacto) {
        this.titulo_contacto = titulo_contacto;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public void setCodigo_postal(String codigo_postal) {
        this.codigo_postal = codigo_postal;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    @Override
    public String toString() {
        return "Cliente{" + "id=" + id + ", nombre_compa\u00f1ia=" + nombre_compañia + ", nombre_contacto=" + nombre_contacto + ", titulo_contacto=" + titulo_contacto + ", direccion=" + direccion + ", ciudad=" + ciudad + ", region=" + region + ", codigo_postal=" + codigo_postal + ", pais=" + pais + ", telefono=" + telefono + ", fax=" + fax + '}';
    }
    
    
    
    
}
