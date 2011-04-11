/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Modelo;

import java.util.ArrayList;

/**
 *
 * @author r4wd3r
 */
public class Factura {

    private Proveedor proveedor;
    private int numero;
    private String fecha;
    private double totalParcial;
    private double total;
    private ArrayList<Producto> productosFactura = new ArrayList<Producto>();

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setProductosFactura(ArrayList<Producto> productosFactura) {
        this.productosFactura = productosFactura;
    }

    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public void setTotalParcial(double totalParcial) {
        this.totalParcial = totalParcial;
    }

    public String getFecha() {
        return fecha;
    }

    public int getNumero() {
        return numero;
    }

    public ArrayList<Producto> getProductosFactura() {
        return productosFactura;
    }

    public Proveedor getProveedor() {
        return proveedor;
    }

    public double getTotal() {
        return total;
    }

    public double getTotalParcial() {
        return totalParcial;
    }
   
}
