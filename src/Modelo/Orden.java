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
    private ArrayList<Producto> productos_traslado = new ArrayList<Producto>();
    private double total_traslado;

    public Orden(){}

}
