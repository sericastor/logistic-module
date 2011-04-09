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
public class Orden {
    private Lugar origen= new Lugar();
    private Lugar destino=new Lugar();

    public Lugar getDestino() {
        return destino;
    }

    public void setDestino(Lugar destino) {
        this.destino = destino;
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
    ArrayList<Producto> productos_traslado= new ArrayList();
    private double total_traslado;


}
