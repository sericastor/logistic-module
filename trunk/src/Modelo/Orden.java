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
import javax.persistence.ManyToOne;




/**
 *
 * @author r4wd3r
 */
@Entity
public class Orden implements Serializable {
    @ManyToOne()
    private Lugar origen;
    @ManyToOne
    private Lugar destino;
    @Id
    private int id_orden;
    private boolean estado;     //0 si no se ha transportado, 1 si se ha transportado//

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public int getId_orden() {
        return id_orden;
    }

    public void setId_orden(int id_orden) {
        this.id_orden = id_orden;
    }
    public Lugar getDestino() {
        return destino;
    }

    public void setDestino(Lugar destino) {
        this.destino = destino;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public Lugar getOrigen() {
        return origen;
    }

    public void setOrigen(Lugar origen) {
        this.origen = origen;
    }

    public List<Producto> getProductos_traslado() {
        return productos_traslado;
    }

    public void setProductos_traslado(List<Producto> productos_traslado) {
        this.productos_traslado = productos_traslado;
    }

    public double getTotal_traslado() {
        return total_traslado;
    }

    public void setTotal_traslado(double total_traslado) {
        this.total_traslado = total_traslado;
    }
    @ManyToMany
    private List<Producto> productos_traslado;
    private double total_traslado;
    private String fecha;
    public Orden(){
            }


}
