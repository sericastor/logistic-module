/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Controlador;

import Modelo.Orden;
import Modelo.Producto;
import Modelo.Sistema;
import java.util.ArrayList;
import javax.swing.JTable;

/**
 *
 * @author USUARIO
 */
public class CTransportar {

    public CTransportar() {}
    public void trasladarProducto(String nombre, String marca, int cantidad){
        boolean exist = false;
        Producto bloqueado = new Producto();
        for (Producto p:Sistema.getProductos()){
            if(p.getNombre().equals(nombre) && p.getMarca().equals(marca) && p.getEstado().equals("En tránsito")){
                exist = true;
                break;
            }
        }
        for (Producto p:Sistema.getProductos()){
            if(p.getNombre().equals(nombre) && p.getMarca().equals(marca) && p.getEstado().equals("Bloqueado")){
                bloqueado = p;
                break;
            }
        }
        if (exist==false){
            Producto nuevo = new Producto();
            nuevo.setNombre(nombre);
            nuevo.setMarca(marca);
            nuevo.setCantidad(0);
            nuevo.setEstado("En tránsito");
            nuevo.setId(CAdministrarProducto.generarID());
            nuevo.setPrecioCosto(bloqueado.getPrecioCosto());
            nuevo.setPrecioVenta(bloqueado.getPrecioVenta());
            nuevo.setIva(bloqueado.getIva());            
            CAdministrarProducto.crearProducto(nuevo);
       }
        for (Producto p:Sistema.getProductos()){
            if(p.getNombre().equals(nombre) && p.getMarca().equals(marca) && p.getEstado().equals("En tránsito")){
                    System.out.println("sadasdsd" + p.getCantidad());
                    p.setCantidad(p.getCantidad()+cantidad);                    
            }            
        }
        for (Producto p:Sistema.getProductos()){
            if(p.getNombre().equals(nombre) && p.getMarca().equals(marca) && p.getEstado().equals("Bloqueado")){
                System.out.println("asdasdds"+p.getCantidad());
                p.setCantidad(p.getCantidad()- cantidad);               
            }
        }
    }
    public double obtenerTotal(JTable tabla){
        int j = tabla.getRowCount();
        double suma = 0;
        for(int i = 0; i<j; i++){
            if(tabla.getValueAt(i, 4)==null){}
            else{
                Object valor = tabla.getValueAt(i, 4);
                suma=suma+Double.valueOf(valor.toString());}
            }
        return suma;
    }

    public double costoTotal(int cantidad, double costo){

        return cantidad*costo;
    }
   public boolean cambiarEstadoOrden(Orden orden){
       boolean ok = false;
       if(!orden.isEstado()){
           ok = true;
           orden.setEstado(ok);
       }
       else{
           return ok;
       }
       return ok;
   }
   public Orden buscarOrden(int id){
       Orden resultado = new Orden();
       for (Orden o:Sistema.getOrdenes()){
           if(!o.isEstado() && o.getId_orden() == id){
               resultado = o;
           }
       }
       return resultado;
   }
}
