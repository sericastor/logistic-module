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
    public void trasladarProducto(Producto producto){
        boolean exist = false;
        for (Producto p:Sistema.getProductos()){
            if(p.getNombre().equals(producto.getNombre()) && p.getMarca().equals(producto.getMarca()) && p.getEstado().equals("En tránsito")){
                exist = true;
            }
        }
        if (exist==false){
            Producto nuevo = new Producto();
            nuevo.setNombre(producto.getNombre());
            nuevo.setMarca(producto.getMarca());
            nuevo.setCantidad(0);
            nuevo.setEstado("En tránsito");
            nuevo.setId(CAdministrarProducto.generarID());
            nuevo.setPrecioCosto(producto.getPrecioCosto());
            nuevo.setPrecioVenta(producto.getPrecioVenta());
            nuevo.setIva(producto.getIva());
            CAdministrarProducto.crearProducto(nuevo);
       }
        for (Producto p:Sistema.getProductos()){
            if(p.getNombre().equals(producto.getNombre()) && p.getMarca().equals(producto.getMarca()) && p.getEstado().equals("En tránsito")){
                if(exist == true){
                        p.setCantidad(p.getCantidad()+producto.getCantidad());
                }
                else{
                    p.setCantidad(producto.getCantidad());
                }
            }
            else if(p.getNombre().equals(producto.getNombre()) && p.getMarca().equals(producto.getMarca()) && p.getEstado().equals("Bloqueado")){
                p.setCantidad(p.getCantidad()-producto.getCantidad());
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
