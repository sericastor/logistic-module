/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Controlador;

import Modelo.Factura;
import Modelo.Orden;
import Modelo.Producto;
import Modelo.Sistema;
import java.util.ArrayList;
import javax.swing.JTable;

/**
 *
 * @author USUARIO
 */
public class CGenerarTraslado {

    public CGenerarTraslado(){}

    public void definirCantidad(int index, int cantidad){

    }
    public double obtenerCosto(int index){
        return Sistema.getProductos().get(index).getPrecioCosto();
    }

    public double obtenerIva(double costo){
        return costo*0.16;
    }
    public double obtenerCostoTotal(int cantidad, double costo){
        return cantidad*costo;
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
    public double obtenerTotalIva(JTable tabla){
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

    public int generarIDTraslado(){
        return Sistema.getOrdenes().size()+1;
    }

    public int verificarIDTraslado(){
        return this.generarIDTraslado();
    }

    public Producto buscarProducto(String nombre, String marca){
        Producto encontrado = new Producto();
        for(Producto p: Sistema.getProductos()){
            if(p.getNombre().equals(nombre) && p.getMarca().equals(marca) && p.getEstado().equals("Almacenado")){
                //p.setCantidad(cantidad);
                encontrado = p;
                break;
            }
        }
        return encontrado;
    }
    public boolean agregarCantidadProductoTransito(String nombre, String marca, int cantidad){
        boolean ok=false;
        for(Producto p: Sistema.getProductos()){
            if(p.getNombre().equals(nombre) && p.getMarca().equals(marca) && p.getEstado().equals("En tránsito")){
                p.setCantidad(p.getCantidad()+cantidad);
                ok=true;
                break;
            }
        }
        for(Producto p: Sistema.getProductos()){
            if(p.getNombre().equals(nombre) && p.getMarca().equals(marca) && p.getEstado().equals("Almacenado")){
                if((p.getCantidad()-cantidad)<0){
                    return false;
                }
                else{
                p.setCantidad(p.getCantidad()-cantidad);
                almacenado = p;
                break;}
            }
        }
        
        //No existe anteriormente un producto con estado En tránsito
        if(ok==false){
            Producto nuevo = new Producto();
            CAdministrarProducto adm = new CAdministrarProducto();
            nuevo.setCantidad(cantidad);
            nuevo.setEstado("En tránsito");
            nuevo.setId(adm.generarID());
            nuevo.setPrecioCosto(almacenado.getPrecioCosto());
            nuevo.setPrecioVenta(almacenado.getPrecioVenta());
            nuevo.setIva(almacenado.getIva());
            nuevo.setNombre(almacenado.getNombre());
            nuevo.setMarca(almacenado.getMarca());
            Sistema.getProductos().add(nuevo);

        }
        return true;
    }
    public boolean verificarCantidad(String nombre, String marca, int cantidad){
        
        for(Producto p: Sistema.getProductos()){
            if(p.getNombre().equals(nombre) && p.getMarca().equals(marca) && p.getEstado().equals("Almacenado")){
                if((p.getCantidad()-cantidad)<0){
                    return false;
                }
                else{
                    return true;
                }
            }
        }
        return true;
    }

    public ArrayList<Factura> getFacturas(){
        return Sistema.getFacturas();
    }
    public Producto verProductos(int i){
        return Sistema.getProductos().get(i);
    }

    public void agregarOrdenes(Orden o){
        Sistema.getOrdenes().add(o);
    }

    public double obtenerTotalOrden(JTable tabla){
        double tot=0;
        for (int i =0;i<tabla.getRowCount();i++){
            if(tabla.getValueAt(i, 0)==null){}
            else{
                tot = tot + Double.valueOf(tabla.getValueAt(i, 4).toString());
            }
        }
        System.out.println(tot);
        return tot;
    }


    public double ObtenerTotal(double precio, double iva){
        return precio + iva;
    }
    public void agregarProductoEnFactura(Producto nuevo){
        factura.getProductosFactura().add(nuevo);
    }
    public void agregarFacturaEnSistema(Factura factura){
        Sistema.getFacturas().add(factura);
    }
    public Factura getFactura(){
        return factura;
    }
    public int getSizeProductos(){
        return Sistema.getProductos().size();
    }
    public double generarIVA(double precioDeCosto, int cantidad){
        return (precioDeCosto*16/100)*cantidad;
    }

    private Factura factura = new Factura();
    private Producto almacenado = new Producto();

}
