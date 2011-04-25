/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Controlador;

import Modelo.Factura;
import Modelo.Producto;
import Modelo.Sistema;
import java.util.ArrayList;
import javax.swing.JOptionPane;
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

    public boolean validarFecha(String nacimiento){
        if (nacimiento.length() != 10 || nacimiento.charAt(2) != '/' || nacimiento.charAt(5) != '/'){
            JOptionPane.showMessageDialog(null, "El formato de la fecha de nacimiento debe ser dd/mm/aaaa", "Fecha de Nacimiento Incorrecta", JOptionPane.WARNING_MESSAGE);
            return false;
        }
        for (int i = 0; i < nacimiento.length(); i++){
            if ((int)nacimiento.charAt(i) < 48 || (int)nacimiento.charAt(i) > 57){
                JOptionPane.showMessageDialog(null, "El formato de la fecha de nacimiento debe ser dd/mm/aaaa", "Fecha de Nacimiento Incorrecta", JOptionPane.WARNING_MESSAGE);
                return false;
            }
            if (i == 1 || i == 4){
                i++;
            }
        }
        if (Integer.parseInt(nacimiento.substring(0, 2)) < 1 || Integer.parseInt(nacimiento.substring(0, 2)) > 31){
            JOptionPane.showMessageDialog(null, "El día debe ser menor a 32 y mayor que 0", "Fecha de Nacimiento Incorrecta", JOptionPane.WARNING_MESSAGE);
            return false;
        }
        if (Integer.parseInt(nacimiento.substring(3, 5)) < 1 || Integer.parseInt(nacimiento.substring(3, 5)) > 12){
            JOptionPane.showMessageDialog(null, "El mes debe ser menor a 13 y mayor que 0", "Fecha de Nacimiento Incorrecta", JOptionPane.WARNING_MESSAGE);
            return false;
        }
        if (Integer.parseInt(nacimiento.substring(6, 10)) < 1901){
            JOptionPane.showMessageDialog(null, "El año debe ser mayor que 1900", "Fecha de Nacimiento Incorrecta", JOptionPane.WARNING_MESSAGE);
            return false;
        }
        return true;
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

    
    public Producto buscarProductoAlmacenado(String nombre, String marca){
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

    public ArrayList<Producto> buscarProductosPorMarca(String marca){
        ArrayList<Producto> encontrados = new ArrayList<Producto>();
        for(Producto p: Sistema.getProductos()){
            if(p.getMarca().equals(marca) && p.getEstado().equals("Almacenado")){
                //p.setCantidad(cantidad);
                encontrados.add(p);
            }
        }
        return encontrados;
    }

    public ArrayList<Producto> buscarProductosPorNombre(String nombre){
        ArrayList<Producto> encontrados = new ArrayList<Producto>();
        for(Producto p: Sistema.getProductos()){
            if(p.getNombre().equals(nombre) && p.getEstado().equals("Almacenado")){
                //p.setCantidad(cantidad);
                encontrados.add(p);
            }
        }
        return encontrados;
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
    public Factura agregarProductoEnFactura(Producto nuevo, Factura fact){
        Producto agregar = new Producto();
        agregar.setCantidad(nuevo.getCantidad());
        agregar.setEstado(nuevo.getEstado());
        agregar.setId(nuevo.getId());
        agregar.setIva(nuevo.getIva());
        agregar.setMarca(nuevo.getMarca());
        agregar.setNombre(nuevo.getNombre());
        agregar.setPrecioCosto(nuevo.getPrecioCosto());
        //System.out.println(nuevo.getPrecioCosto());
        agregar.setPrecioVenta(nuevo.getPrecioVenta());
        fact.getProductosFactura().add(agregar);
        return fact;
        
    }
    public void agregarFacturaEnSistema(Factura factura){
        Sistema.getFacturas().add(factura);
        for(int i=0;i<Sistema.getFacturas().size();i++){
            System.out.println(Sistema.getFacturas().get(i).getFecha());
        }
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



