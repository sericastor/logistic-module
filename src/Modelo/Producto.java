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

    private int id;
    private String nombre;
    private String marca;
    private double precioCosto;
    private int cantidad;
    private double iva;
    private double precioVenta;
    private String estado;

    public int getCantidad() {
        return cantidad;
    }

    public String getEstado() {
        return estado;
    }

    public int getId() {
        return id;
    }

    public double getIva() {
        return iva;
    }

    public String getMarca() {
        return marca;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecioCosto() {
        return precioCosto;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setIva(double iva) {
        this.iva = iva;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecioCosto(double precioCosto) {
        this.precioCosto = precioCosto;
    }

    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }
    
}
