/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Modelo;

/**
 *
 * @author r4wd3r
 */
public class Proveedor {
    private int id_proveedor;

    public String getDireccion_proveedor() {
        return direccion_proveedor;
    }

    public void setDireccion_proveedor(String direccion_proveedor) {
        this.direccion_proveedor = direccion_proveedor;
    }

    public int getId_proveedor() {
        return id_proveedor;
    }

    public void setId_proveedor(int id_proveedor) {
        this.id_proveedor = id_proveedor;
    }

    public String getNombre_proveedor() {
        return nombre_proveedor;
    }

    public void setNombre_proveedor(String nombre_proveedor) {
        this.nombre_proveedor = nombre_proveedor;
    }

    public int getTel_proveedor() {
        return tel_proveedor;
    }

    public void setTel_proveedor(int tel_proveedor) {
        this.tel_proveedor = tel_proveedor;
    }
    private String nombre_proveedor;
    private String direccion_proveedor;
    private int tel_proveedor;

    public Proveedor(){}
}
