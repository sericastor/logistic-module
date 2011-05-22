/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Modelo;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

/**
 *
 * @author r4wd3r
 */
@Entity
public class Factura implements Serializable {

    
    @Id
    private int numero;
    @OneToMany(mappedBy="factura")
    private Proveedor proveedor;
    private String fecha;
    private double totalParcial;
    private double total;
    @ManyToMany
    private List<Producto> productos;

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setProductosFactura(List<Producto> productos) {
        this.productos = productos;
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

    public List<Producto> getProductosFactura() {
        return productos;
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
