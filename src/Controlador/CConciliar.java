/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Controlador;

import Modelo.Producto;
import Modelo.Sistema;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author USUARIO
 */
public class CConciliar {

   public String testConciliar(ArrayList<Producto> consulta, String CantidadSPro, String CantidadFPro, String NombrePro, String MarcaPro){
   try{
        //Agregar elementos de la consulta a la Lista
        if(consulta.size()==0){            
            return "No se han encontrado coincidencias";
        }
        else{

        }
        }catch(Exception e){            
            return "Ingrese un valor numerico en el campo";

        }
   if(CantidadSPro.equals("")){
            return "Debe realizar una consulta y seleccionar un objeto de la lista para conciliar la mercancía";
        }
        else if(CantidadFPro.equals("")){
            return "Debe ingresar la cantidad de mercancía disponible en el inventario físico para conciliar";
        }
        else{
        int[] resultado = new int[5];
        resultado = numeroProductosAlmacenados(NombrePro,MarcaPro,Integer.parseInt(CantidadFPro));

        if (resultado == null){
            return "La cantidad de objetos perdidos no coincide con los encontrados, No sea ladrón!";
        }
        else{
            return "Conciliación Exitosa";
        }
   }

   }
   public int totalCantidadPro(String nombre, String marca){
   int total = 0;
   for(Producto p: Sistema.getProductos()){
            if(p.getNombre().equals(nombre) && p.getMarca().equals(marca)){
                if (p.getEstado().equals("Almacenado")){
                    total = total + p.getCantidad();
                }
                else if (p.getEstado().equals("Bloqueado")){
                    total = total + p.getCantidad();
                }
                else if (p.getEstado().equals("En tránsito")){
                    total = total + p.getCantidad();
                }
                else if (p.getEstado().equals("Perdido")){
                    total = total + p.getCantidad();
                }
                else if (p.getEstado().equals("Descontinuado")){
                }
            }
        }
   return total;
   }
   public int[] numeroProductosAlmacenados(String nombre, String marca, int cant){
       int [] cantidad = new int[5];
       int total = 0;
       Producto producto = new Producto();
       for(Producto p: Sistema.getProductos()){
            if(p.getNombre().equals(nombre) && p.getMarca().equals(marca)){
                if (p.getEstado().equals("Almacenado")){
                    cantidad[0] = p.getCantidad();                    
                }
                else if (p.getEstado().equals("Bloqueado")){
                    cantidad[1] = p.getCantidad();                    
                }
                else if (p.getEstado().equals("En tránsito")){
                    cantidad[2] = p.getCantidad();                    
                }
                else if (p.getEstado().equals("Perdido")){
                    cantidad[3] = p.getCantidad();
                }
                else if (p.getEstado().equals("Descontinuado")){
                    cantidad[4] = p.getCantidad();                    
                }
            }
        }
        total = totalCantidadPro(nombre,marca);
        if(total == 0){
            return null;
       }
        if (cant < cantidad[0]){
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
                        producto.setId(CAdministrarProducto.generarID());
                        producto.setIva(p.getIva());
                        producto.setMarca(marca);
                        producto.setNombre(nombre);
                        producto.setPrecioCosto(p.getPrecioCosto());
                        producto.setPrecioVenta(p.getPrecioVenta());
                        producto.setCantidad(0);
                    }
                }

                CAdministrarProducto.crearProducto(producto);
            }
        cantidad[0]=cant;
        for (Producto p:Sistema.getProductos()){
            if(p.getNombre().equals(nombre) && p.getMarca().equals(marca) && p.getEstado().equals("Almacenado")){
                p.setCantidad(cant);
            }
        }
        int j = 0;
              for (Producto p: Sistema.getProductos()){
                   if(p.getNombre().equals(nombre) && p.getMarca().equals(marca) && p.getEstado().equals("Perdido")){
                       cantidad[3] = p.getCantidad();
                       while((cantidad[0]+cantidad[1]+cantidad[2]+cantidad[3]) < total){
                            p.setCantidad(p.getCantidad()+1);
                            cantidad[3]=p.getCantidad();
                            j++;
                        }
                   }
               }              
        }
       if (cant > cantidad[0]){
           int perdidos = cant - cantidad[0];
           int j = 0;
           for (Producto p: Sistema.getProductos()){
               if(p.getNombre().equals(nombre) && p.getMarca().equals(marca) && p.getEstado().equals("Perdido")){
                   j = 1;
               }
           }
           if (j == 0){
              if(perdidos > 0){
                return null;
              }
           }

           for (Producto p: Sistema.getProductos()){
               if (p.getNombre().equals(nombre) && p.getMarca().equals(marca) && p.getEstado().equals("Perdido")){
                    cantidad[3]= p.getCantidad() - perdidos;
               }

           }
           if (cantidad[3] < 0){
                return null;
           }
           else{
               for(Producto p:Sistema.getProductos()){
                    if (p.getNombre().equals(nombre) && p.getMarca().equals(marca) && p.getEstado().equals("Perdido")){
                        p.setCantidad(cantidad[3]);
                    }
                    if (p.getNombre().equals(nombre) && p.getMarca().equals(marca) && p.getEstado().equals("Almacenado")){
                        p.setCantidad(cant);
                        cantidad[0] = p.getCantidad();
                    }
               }
           }
       
       }
       return cantidad;
    }
   public CConciliar(){}
}
