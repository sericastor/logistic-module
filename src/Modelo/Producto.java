/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Modelo;


import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


@Entity
public class Producto implements Serializable {

    
    @Id
    private int id;
    @ManyToOne
    private String nombre;
    private String marca;
    private int cantidad;
    private double precioCosto;
    private double precioVenta;
    private double iva;
    private String estado;



    public Producto() {
    }

    public Producto(int id, String nombre, String marca, int cantidad, double precioC,
            double precioV, double iva, String estado) {
        this.id = id;
        this.nombre = nombre;
        this.marca = marca;
        this.cantidad = cantidad;
        this.precioCosto = precioC;
        this.precioVenta = precioV;
        this.iva = iva;
        this.estado = estado;
    }

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
