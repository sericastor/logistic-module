/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Modelo;

/**
 *
 * @author r4wd3r
 */
public class Lugar {
    private String nombre_lugar;
    private String direccion_lugar;

    public String getDireccion_lugar() {
        return direccion_lugar;
    }

    public void setDireccion_lugar(String direccion_lugar) {
        this.direccion_lugar = direccion_lugar;
    }

    public int getId_lugar() {
        return id_lugar;
    }

    public void setId_lugar(int id_lugar) {
        this.id_lugar = id_lugar;
    }

    public String getNombre_lugar() {
        return nombre_lugar;
    }

    public void setNombre_lugar(String nombre_lugar) {
        this.nombre_lugar = nombre_lugar;
    }

    public int getTel_lugar() {
        return tel_lugar;
    }

    public void setTel_lugar(int tel_lugar) {
        this.tel_lugar = tel_lugar;
    }

    public String getTipo_lugar() {
        return tipo_lugar;
    }

    public void setTipo_lugar(String tipo_lugar) {
        this.tipo_lugar = tipo_lugar;
    }
    private int tel_lugar;
    private String tipo_lugar;
    private int id_lugar;

    public Lugar (){}
}
