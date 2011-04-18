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
   public int[] numeroProductosAlmacenados(String nombre, String marca){
       int [] cantidad = new int[5];
       int i = 0;
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
        return cantidad;
    }
   public CConciliar(){}
}
