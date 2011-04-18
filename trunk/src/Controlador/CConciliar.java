/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Controlador;

import Modelo.Producto;
import Modelo.Sistema;

/**
 *
 * @author USUARIO
 */
public class CConciliar {
   CAdministrarProducto administrar = new CAdministrarProducto();
   public int[] numeroProductosAlmacenados(String nombre, String marca, int cant){
       int [] cantidad = new int[5];
       int total = 0;
       Producto producto = new Producto();
       for(Producto p: Sistema.getProductos()){
            if(p.getNombre().equals(nombre) && p.getMarca().equals(marca)){
                if (p.getEstado().equals("Almacenado")){
                    cantidad[0] = p.getCantidad();
                    total = total + p.getCantidad();
                }
                else if (p.getEstado().equals("Bloqueado")){
                    cantidad[1] = p.getCantidad();
                    total = total + p.getCantidad();
                }
                else if (p.getEstado().equals("En tránsito")){
                    cantidad[2] = p.getCantidad();
                    total = total + p.getCantidad();
                }
                else if (p.getEstado().equals("Perdido")){
                    cantidad[3] = p.getCantidad();
                    total = total + p.getCantidad();
                }
                else if (p.getEstado().equals("Descontinuado")){
                    cantidad[4] = p.getCantidad();
                    total = total + p.getCantidad();
                }
            }
        }
       
        if (cant <= cantidad[0]){

            int i = 0;
            for (Producto p: Sistema.getProductos()){
                if(p.getNombre().equals(nombre) && p.getMarca().equals(marca) && p.getEstado().equals("Perdido")){
                    i = 1;
                }
            }
            if (i == 0){
                for (Producto p: Sistema.getProductos()){
                    if (p.getNombre().equals(nombre) && p.getMarca().equals(marca)){
                        producto.setEstado("Perdido");
                        producto.setId(administrar.generarID());
                        producto.setIva(p.getIva());
                        producto.setMarca(marca);
                        producto.setNombre(nombre);
                        producto.setPrecioCosto(p.getPrecioCosto());
                        producto.setPrecioVenta(p.getPrecioVenta());
                        producto.setCantidad(0);
                    }
                }

                administrar.crearProducto(producto);
            }
        }
       for (Producto p: Sistema.getProductos()){
                if(p.getNombre().equals(nombre) && p.getMarca().equals(marca) && p.getEstado().equals("Perdido")){
                    producto = p;
                }
            }
       if (cant >= cantidad[0]){

            for(Producto p: Sistema.getProductos()){
                if (p.getNombre().equals(nombre) && p.getMarca().equals(marca) && p.getEstado().equals("Almacenado") && (cant - cantidad[0])<= producto.getCantidad()){
                    p.setCantidad(cant);
                    cantidad[0] = cant;
                }
                else if(p.getNombre().equals(nombre) && p.getMarca().equals(marca) && p.getEstado().equals("Perdido")){
                    if(p.getCantidad() <= cant - cantidad[0]){
                        p.setCantidad(p.getCantidad() - cant);
                        cantidad[3] = p.getCantidad() - cant;
                    }
                    else{
                        return null;
                    }
                }
            }

       }
       cantidad[3] = producto.getCantidad() + (cantidad[0] - cant);
       if (cantidad[3] < 0){
            return null;
       }
       return cantidad;
    }
   public CConciliar(){}
}
