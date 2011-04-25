/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Controlador;

import Modelo.Factura;
import Modelo.Producto;
import Modelo.Sistema;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JTable;

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

    public static ArrayList<Factura> obtenerFacturasDelProducto(String nombre, String marca){

        ArrayList<Factura> facturas = new ArrayList<Factura>();
        getFacturasOrdenadas();
        facturas = Sistema.getFacturas();
        encontrados.clear();
        ArrayList<Producto> pro = new ArrayList<Producto>();
        for(int i=0;i<facturas.size();i++){
            pro.clear();
            pro = facturas.get(i).getProductosFactura();
            int j= pro.size();
            for(int k=0;k<j;k++){
                if(pro.get(k).getNombre().equals(nombre)&&pro.get(k).getMarca().equals(marca)||pro.get(k).getEstado().equals("Almacenado")){
                    encontrados.add(facturas.get(i));
                }
            }
        }
        return encontrados;
   }

    public static String obtenerFechaFactura(Factura factura){
        return factura.getFecha();
    }

    public static double precioCostoProductoEnFactura(Factura factura, String nombre, String marca){

        for(int i=0;i<factura.getProductosFactura().size();i++){
            if(factura.getProductosFactura().get(i).getNombre().equals(nombre)&&factura.getProductosFactura().get(i).getMarca().equals(marca)){
                System.out.println(factura.getProductosFactura().get(i).getPrecioCosto());
                return factura.getProductosFactura().get(i).getPrecioCosto();
            }
        }

        return 0;
    }

    public static double cantidadProductoEnFactura(Factura factura, String nombre, String marca){

        for(int i=0;i<factura.getProductosFactura().size();i++){
            if(factura.getProductosFactura().get(i).getNombre().equals(nombre)&&factura.getProductosFactura().get(i).getMarca().equals(marca)){
                return factura.getProductosFactura().get(i).getCantidad();
            }
        }

        return 0;
    }

   public static double obtenerSaldo(JTable table,int i){
       double resultado=0;
       for (int j=0; j<i ;j++){
           resultado=resultado+Double.valueOf(table.getValueAt(j, 3).toString());
       }
       return resultado;
   }

   public static ArrayList<Factura> getFacturasOrdenadas(){
       ArrayList<Factura> aux = new ArrayList<Factura>();
       ArrayList<Integer> fecha = new ArrayList<Integer>();

       aux = Sistema.getFacturas();
       System.out.println(aux);

       for(int i=0;i<aux.size();i++){
            int f = Integer.parseInt(aux.get(i).getFecha().substring(6, 10))*10000;
            f = f + Integer.parseInt(aux.get(i).getFecha().substring(3, 5))*100;
            f = f + Integer.parseInt(aux.get(i).getFecha().substring(0, 2));
            fecha.add(f);
       }
//  for(int i=0;i<aux.size();i++){
//            System.out.println(fecha.get(i));
//       }
       for(int i=0;i+1<aux.size();i++){
                if(fecha.get(i+1)<fecha.get(i)){
                Factura fact = new Factura();
                Collections.swap(fecha, i, i+1);
                Collections.swap(aux, i, i+1);
                for(int j=i;j>0;j--){
                    if(fecha.get(j-1)<fecha.get(j)){
                        break;
                    }
                    else{
                        Collections.swap(aux, j, j-1);
                        Collections.swap(fecha, j, j-1);
                    }
                }

            }
       }

  //Collections.sort(fecha);

  for(int i=0;i<aux.size();i++){
            System.out.println(aux.get(i).getFecha());
       }
       return aux;
   }
    private static ArrayList<Factura> encontrados = new ArrayList<Factura>();
    private static ArrayList<Factura> factOrd = new ArrayList<Factura>();
    private static ArrayList<Producto> productos = new ArrayList<Producto>();
    private static ArrayList<Producto> coincidencias = new ArrayList<Producto>();
}
