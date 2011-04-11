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

    public int generarID(){
       productos = sistema.getProductos();
       return productos.size() + 1;
    }

    public void crearProductos(ArrayList<Producto> nuevos){
        productos = nuevos;
        sistema.setProductos(productos);
    }

    public ArrayList<Producto> buscarProductos(Producto base){
        productos = sistema.getProductos();
        int j= productos.size();
        for(int i=0;i<j;i++){
            if(base.getEstado().equals(productos.get(i).getEstado())){
                if(base.getNombre().equals(productos.get(i).getNombre())||base.getNombre().equals("")){
                    if(base.getMarca().equals(productos.get(i).getMarca())||base.getMarca().equals("")){
                        if(base.getPrecioCosto() == productos.get(i).getPrecioCosto() || base.getPrecioCosto() == 0){
                            if(base.getPrecioVenta() == productos.get(i).getPrecioVenta() || base.getPrecioVenta() == 0){
                                if(base.getId() == productos.get(i).getId() || base.getId() == 0){
                                    coincidencias.add(productos.get(i));
                                }
                            }
                        }
                    }
                }
            }

        }

        
        return coincidencias;
    }

    public void actualizarProductos(int identificador, Producto nuevo){
        
    }

    public double calcularPrecioVenta(double precioCosto){
        return precioCosto + (precioCosto*25/100);
    }

    private static Sistema sistema = new Sistema();
    private ArrayList<Producto> productos = new ArrayList<Producto>();
    private ArrayList<Producto> coincidencias = new ArrayList<Producto>();

}
