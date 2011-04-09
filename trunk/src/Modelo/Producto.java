/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Modelo;

/**
 *
 * @author r4wd3r
 */
public class Producto {
    private int id_producto;
    private String nombre_producto;
    private String marca_producto;
    private double pcosto_producto;
    private int cantidad_producto;
    private double iva_producto;

    public String getEstado_producto() {
        return estado_producto;
    }

    public void setEstado_producto(String estado_producto) {
        this.estado_producto = estado_producto;
    }

    public int getId_producto() {
        return id_producto;
    }

    public void setId_producto(int id_producto) {
        this.id_producto = id_producto;
    }

    public String getMarca_producto() {
        return marca_producto;
    }

    public void setMarca_producto(String marca_producto) {
        this.marca_producto = marca_producto;
    }

    public String getNombre_producto() {
        return nombre_producto;
    }

    public void setNombre_producto(String nombre_producto) {
        this.nombre_producto = nombre_producto;
    }

    public double getPcosto_producto() {
        return pcosto_producto;
    }

    public void setPcosto_producto(double pcosto_producto) {
        this.pcosto_producto = pcosto_producto;
    }

    public double getPventa_producto() {
        return pventa_producto;
    }

    public void setPventa_producto(double pventa_producto) {
        this.pventa_producto = pventa_producto;
    }
    private double pventa_producto;
    private String estado_producto;

}
