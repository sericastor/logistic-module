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

    public static int generarID(){
       return Sistema.getProductos().size() + 1;
    }

    public static boolean crearProducto(Producto producto) {
        if(buscarProductosIguales(producto).isEmpty()){
            Sistema.getProductos().add(producto);
            return true;
        }
        else{
            return false;
        }
    }
    
    public static ArrayList<Producto> buscarProductos(Producto base){
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
    public static ArrayList<Producto> buscarProductosIguales(Producto base){
        iguales.clear();
        productos = Sistema.getProductos();
        int j= productos.size();
        for(int i=0;i<j;i++){
            if(base.getEstado().equals(productos.get(i).getEstado())){
                if(base.getNombre().equals(productos.get(i).getNombre())){
                    if(base.getMarca().equals(productos.get(i).getMarca())){


                          iguales.add(productos.get(i));


                    }
                }
            }

        }
        return iguales;
    }

    public static boolean actualizarProducto(int identificador, Producto nuevo){
        Sistema.getProductos().set(identificador - 1, nuevo);
        return true;
    }

    public static void eliminarProducto(int identificador, Producto eliminado){
        eliminado.setEstado("Descontinuado");
        //System.out.println(eliminado.getEstado());
        Sistema.getProductos().set(identificador - 1, eliminado);
    }
    public static int verificarID(){
        int IDCorrecto = generarID();
        return IDCorrecto;
    }

    public static double calcularPrecioVenta(double precioCosto){
        return precioCosto + (precioCosto*25/100);
    }

    private static ArrayList<Producto> productos = new ArrayList<Producto>();
    private static ArrayList<Producto> coincidencias = new ArrayList<Producto>();
    private static ArrayList<Producto> iguales = new ArrayList<Producto>();

}