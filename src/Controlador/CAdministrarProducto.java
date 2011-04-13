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
public class CAdministrarProducto {

    public int generarID(){
       productos = Sistema.getProductos();
       return productos.size() + 1;
    }

    public void crearProducto(Producto producto) {
        Sistema.getProductos().add(producto);
    }
    
    public ArrayList<Producto> buscarProductos(Producto base){
        productos = Sistema.getProductos();
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

    public boolean actualizarProducto(int identificador, Producto nuevo){
        Sistema.getProductos().set(identificador - 1, nuevo);
        return true;
    }

    public void eliminarProducto(int identificador, Producto eliminado){
        eliminado.setEstado("Descontinuado");
        System.out.println(eliminado.getEstado());
        Sistema.getProductos().set(identificador - 1, eliminado);
    }
    public int verificarID(){
        int IDCorrecto = this.generarID();
        return IDCorrecto;
    }

    public double calcularPrecioVenta(double precioCosto){
        return precioCosto + (precioCosto*25/100);
    }

    private ArrayList<Producto> productos = new ArrayList<Producto>();
    private ArrayList<Producto> coincidencias = new ArrayList<Producto>();

}
