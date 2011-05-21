/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Modelo;

import java.io.Serializable;
import java.util.ArrayList;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 *
 * @author r4wd3r
 */
@Entity
public class Factura implements Serializable {

    
    @Id
    private int numero;
    @ManyToOne
    private Proveedor proveedor;
    private String fecha;
    private double totalParcial;
    private double total;
    @OneToMany(mappedBy = "productosFactura")
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
