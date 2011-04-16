/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Modelo;

import java.sql.Date;
import java.util.ArrayList;




/**
 *
 * @author r4wd3r
 */
public class Orden {
    private Lugar origen= new Lugar();
    private Lugar destino=new Lugar();
    private int id_orden;

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

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
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
    private Date fecha;
    public Orden(){
            }


}
