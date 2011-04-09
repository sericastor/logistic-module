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
   private Proveedor proveedor = new Proveedor();
   private int nro_factura;
   private String fecha_factura;
   double totalp_factura; //Total Parcial
   double total_factura;

    public String getFecha_factura() {
        return fecha_factura;
    }

    public void setFecha_factura(String fecha_factura) {
        this.fecha_factura = fecha_factura;
    }

    public int getNro_factura() {
        return nro_factura;
    }

    public void setNro_factura(int nro_factura) {
        this.nro_factura = nro_factura;
    }

    public ArrayList<Producto> getProductos_factura() {
        return productos_factura;
    }

    public void setProductos_factura(ArrayList<Producto> productos_factura) {
        this.productos_factura = productos_factura;
    }

    public Proveedor getProveedor() {
        return proveedor;
    }

    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }

    public double getTotal_factura() {
        return total_factura;
    }

    public void setTotal_factura(double total_factura) {
        this.total_factura = total_factura;
    }

    public double getTotalp_factura() {
        return totalp_factura;
    }

    public void setTotalp_factura(double totalp_factura) {
        this.totalp_factura = totalp_factura;
    }
   private ArrayList<Producto> productos_factura = new ArrayList();

   public Factura(){}

}
