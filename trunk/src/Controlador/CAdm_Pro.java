/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Controlador;

import Modelo.Producto;
import Modelo.Sistema;
import java.util.ArrayList;

/**
 *
 * @author USUARIO
 */
public class CAdm_Pro {

    public CAdm_Pro() {
    }

    public int generarID(){
       productos = sistema.getProductos();
       return productos.size() + 1;
    }

    public void setProductos(ArrayList<Producto> nuevos){
        productos = nuevos;
        sistema.setProductos(productos);
    }

    public double calcularPrecioVenta(double pcosto){

        return pcosto + (pcosto*25/100);

    }
    private static Sistema sistema = new Sistema();
    private ArrayList<Producto> productos = new ArrayList<Producto>();
}
