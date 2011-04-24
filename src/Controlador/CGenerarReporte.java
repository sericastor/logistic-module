/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Controlador;

import Modelo.Factura;
import Modelo.Producto;
import Modelo.Sistema;
import java.util.ArrayList;


/**
 *
 * @author USUARIO
 */
public class CGenerarReporte {

    public double obtenerCostoTotal(int cantidad, double costo){
        return cantidad*costo;
    }
   public static int totalCantidadPro(String nombre, String marca){
   int total = 0;
   for(Producto p: Sistema.getProductos()){
            if(p.getNombre().equals(nombre) && p.getMarca().equals(marca)){
                if (p.getEstado().equals("Almacenado")){
                    total = total + p.getCantidad();
                }
            }
        }
   return total;
   }

    public static ArrayList<Producto> buscarProductos(Producto base){
        productos = Sistema.getProductos();
        coincidencias.clear();
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
   public static double precioCostoPro(String nombre, String marca){
   double costo = 0;
   for(Producto p: Sistema.getProductos()){
            if(p.getNombre().equals(nombre) && p.getMarca().equals(marca)){
                if (p.getEstado().equals("Almacenado")){
                    costo = costo + p.getPrecioCosto();
                }
            }
        }
   return costo;
   }

   public static double precioVentaPro(String nombre, String marca){
   double venta = 0;
   for(Producto p: Sistema.getProductos()){
            if(p.getNombre().equals(nombre) && p.getMarca().equals(marca)){
                if (p.getEstado().equals("Almacenado")){
                    venta = venta + p.getPrecioCosto();
                }
            }
        }
   return venta;
   }
   public static double precioTotal(int cantidad, double costo){
        return cantidad*costo;
   }

   public static ArrayList<Factura> getFacturasOrdenadas(){
       ArrayList<Factura> aux = new ArrayList<Factura>();

       aux = Sistema.getFacturas();

       for(int i=0;i+1<aux.size();i++){
           System.out.println(aux.get(i).getFecha());
            if(Integer.parseInt(aux.get(i+1).getFecha().substring(6, 10))<Integer.parseInt(aux.get(i).getFecha().substring(6, 10))){
                Factura fact = new Factura();
                fact = aux.get(i);
                aux.set(i, aux.get(i+1));
                aux.set(i+1,fact);
                for(int j=i;j>0;j--){
                    if(Integer.parseInt(aux.get(j-1).getFecha().substring(6, 10))<Integer.parseInt(aux.get(j).getFecha().substring(6, 10))){
                        break;
                    }
                    else{
                        Factura fact2 = new Factura();
                        fact2 = aux.get(j);
                        aux.set(j, aux.get(j-1));
                        aux.set(j-1,fact2);
                    }
                }

            }
       }

       for(int i=0;i<aux.size();i++){
            System.out.println(aux.get(i).getFecha());
       }
       return aux;
   }
    private static ArrayList<Factura> factOrd = new ArrayList<Factura>();
    private static ArrayList<Producto> productos = new ArrayList<Producto>();
    private static ArrayList<Producto> coincidencias = new ArrayList<Producto>();
}
