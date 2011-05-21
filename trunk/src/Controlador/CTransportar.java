/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Controlador;

import Modelo.Orden;
import Modelo.Producto;
import Modelo.Sistema;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;

/**
 *
 * @author USUARIO
 */
public class CTransportar {

    ArrayList<Orden> consulta = new ArrayList();
    Orden orden = new Orden();

    public String testTransportar(String fecha){

        if (fecha.length() != 10 || fecha.charAt(2) != '/' || fecha.charAt(5) != '/'){
            return "El formato de la fecha debe ser dd/mm/aaaa";
        }
        for (int i = 0; i < fecha.length(); i++){
            if ((int)fecha.charAt(i) < 48 || (int)fecha.charAt(i) > 57){
                return "El formato de la fecha debe ser dd/mm/aaaa";
            }
            if (i == 1 || i == 4){
                i++;
            }
        }
        if(Long.parseLong(fecha.substring(3,5))==4 || Long.parseLong(fecha.substring(3,5))==6 || Long.parseLong(fecha.substring(3,5))==9 || Long.parseLong(fecha.substring(3,5))==11){
            if (Long.parseLong(fecha.substring(0, 2)) < 1 || Long.parseLong(fecha.substring(0, 2)) > 30){
                return "El día debe ser menor a 31 y mayor que 0";
            }
        }else{
                if(Long.parseLong(fecha.substring(3,5))==2){
                    if (Long.parseLong(fecha.substring(0, 2)) < 1 || Long.parseLong(fecha.substring(0, 2)) > 28){
                    return "El día debe ser menor a 29 y mayor que 0";
                }
                }else{
                    if (Long.parseLong(fecha.substring(0, 2)) < 1 || Long.parseLong(fecha.substring(0, 2)) > 31){
                        return "El día debe ser menor a 32 y mayor que 0";
                    }
            }
        }

        Orden o = new Orden();
        o=null;
        for (int i=1;i<=Sistema.getOrdenes().size();i++){
            o = buscarOrden(i);
            if(o!=null){
                consulta.add(o);
            }
        }
        if(consulta.size()==0){

            return "No se han encontrado coincidencias";
        } boolean ok = true;

        ok = cambiarEstadoOrden(orden);
        if(ok){
            return "Se ha dado la orden de transportar la mercancía";
        }
        else if(!ok){
            return "No se ha podido dar la orden de transportar la mercancía.";
        }
        return "No se ha podido dar la orden de transportar la mercancía.";
    }
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
