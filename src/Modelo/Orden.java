/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Modelo;

import java.io.Serializable;
import java.sql.Date;
import java.util.ArrayList;
import javax.persistence.Entity;
import javax.persistence.Id;




/**
 *
 * @author r4wd3r
 */
@Entity
public class Orden implements Serializable {
    private Lugar origen= new Lugar();
    private Lugar destino=new Lugar();
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

    public ArrayList<Producto> getProductos_traslado() {
        return productos_traslado;
    }

    public void setProductos_traslado(ArrayList<Producto> productos_traslado) {
        this.productos_traslado = productos_traslado;
    }

    public double getTotal_traslado() {
        return total_traslado;
    }

    public void setTotal_traslado(double total_traslado) {
        this.total_traslado = total_traslado;
    }
    private ArrayList<Producto> productos_traslado = new ArrayList<Producto>();
    private double total_traslado;
    private String fecha;
    public Orden(){
            }


}
