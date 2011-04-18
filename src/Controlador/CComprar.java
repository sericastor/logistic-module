/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Controlador;

import Modelo.Factura;
import Modelo.Producto;
import Modelo.Sistema;
import java.util.ArrayList;
import javax.swing.JTable;

/**
 *
 * @author USUARIO
 */
public class CComprar {

    public CComprar() {

    }
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
    public double obtenerTotalParcial(JTable tabla){
        int j = tabla.getRowCount();
        double suma = 0;
        for(int i = 0; i<j; i++){
            if(tabla.getValueAt(i, 5)==null){}
            else{
            Object valor = tabla.getValueAt(i, 5);
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
    public void agregarCantidadProducto(String nombre, String marca, int cantidad){
        
        for(Producto p: Sistema.getProductos()){
            if(p.getNombre().equals(nombre) && p.getMarca().equals(marca) && p.getEstado().equals("Almacenado")){
                p.setCantidad(p.getCantidad()+cantidad);
                break;
            }
        }

    }
    public ArrayList<Factura> getFacturas(){
        return Sistema.getFacturas();
    }
    public Producto verProductos(int i){
        return Sistema.getProductos().get(i);
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
    }



