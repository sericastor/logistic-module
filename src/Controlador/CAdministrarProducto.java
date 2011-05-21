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
public class CAdministrarProducto {

    public static boolean ValidarProducto(Producto producto){
        if(!verificarLongitudNombre(producto.getNombre())){
            JOptionPane.showMessageDialog(null, "El nombre debe ser de longitud mínimo 2, máximo 50 caracteres", "Nombre incorrecto", JOptionPane.WARNING_MESSAGE);
            return (false);
        }else{
            if(!verificarNombre(producto.getNombre())){
                JOptionPane.showMessageDialog(null, "El nombre sólo puede tener letras", "Nombre Incorrecto", JOptionPane.WARNING_MESSAGE);
                return (false);
            }else{
                     if(!verificarLongitudMarca(producto.getMarca())){
                        JOptionPane.showMessageDialog(null, "La marca debe ser de longitud mínimo 1, máximo 30 caracteres", "Marca incorrecta", JOptionPane.WARNING_MESSAGE);
                        return (false);
                     }else{
                         if(!verificarCosto(producto.getPrecioCosto())){
                         JOptionPane.showMessageDialog(null, "El costo debe ser mayor que 0", "Costo incorrecto", JOptionPane.WARNING_MESSAGE);
                         return (false);
                         }
                     }
            }
        }
        return(true);
    }

    public static String TestCrear(Producto producto){

        try{
            if(producto.getNombre().equals("") || producto.getPrecioCosto()==0 || producto.getMarca().equals("")){
                return "Existen campos nulos";
            }
            else{

                if(CAdministrarProducto.ValidarProducto(producto)){
                    if(CAdministrarProducto.crearProducto(producto)){
                        return "El producto ha sido creado";

                    }
                    else{
                        return "El producto ya existe";
                    }
                }
            }
        }
        catch(Exception e){
            return "Ingrese un valor numerico en el campo Precio de Costo";
        }
        return "";

    }

    public static String TestConsultar (Producto producto){

        ArrayList<Producto> consulta = new ArrayList<Producto>();
        consulta.removeAll(consulta);
        try{

            consulta = CAdministrarProducto.buscarProductos(producto);

            if(consulta.size()==0){
                return "No se han encontrado coincidencias";

            }
            else{
                return "Se encontraron coincidencias";
            }
        }catch(Exception e){
            return "";
        }

        //return "";
    }

    public static String TestActualizar(Producto p){

        if(p.getNombre().equals("") || p.getPrecioCosto()==0 || p.getMarca().equals("")){
            return "ALERTA Existen campos nulos";
        }
        else{

            if(CAdministrarProducto.ValidarProducto(p)){
                    if(CAdministrarProducto.actualizarProducto(p.getId(), p)){
                    return "Se ha actualizado el producto";

                    }
            }
            else{
                return "El nombre debe tener longitud mínimo 2, máximo 50";
            }

        }



        return "";
    }

    public static boolean verificarLongitudNombre (String nombre) {
        return (nombre.length()>1 && nombre.length() <= 50);
    }

        public static boolean verificarNombre(String nombre){
        for (int i = 0; i < nombre.length(); i++){
            if (((int)nombre.charAt(i) < 65 && (int)nombre.charAt(i) != 32) ||
                    ((int)nombre.charAt(i) > 90 && (int)nombre.charAt(i) < 97) ||
                    (int)nombre.charAt(i) > 122){
                return false;
            }
        }
        return true;
    }
    public static boolean verificarLongitudMarca (String marca) {
        return (marca.length()>=1 && marca.length() <= 30);
    }

    public static boolean verificarCosto (double costo) {
        return (costo>0);
    }
    
    public static int generarID(){
       return Sistema.getProductos().size() + 1;
    }

    public static boolean crearProducto(Producto producto) {
        if(buscarProductosIguales(producto).isEmpty()){
            Sistema.getProductos().add(producto);
            return true;
        }
        else{
            return false;
        }
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
    public static ArrayList<Producto> buscarProductosIguales(Producto base){
        iguales.clear();
        productos = Sistema.getProductos();
        int j= productos.size();
        for(int i=0;i<j;i++){
            if(base.getEstado().equals(productos.get(i).getEstado())){
                if(base.getNombre().equals(productos.get(i).getNombre())){
                    if(base.getMarca().equals(productos.get(i).getMarca())){


                          iguales.add(productos.get(i));


                    }
                }
            }

        }
        return iguales;
    }

    public static boolean actualizarProducto(int identificador, Producto nuevo){
        Sistema.getProductos().set(identificador - 1, nuevo);
        return true;
    }

    public static void eliminarProducto(int identificador, Producto eliminado){
        eliminado.setEstado("Descontinuado");
        //System.out.println(eliminado.getEstado());
        Sistema.getProductos().set(identificador - 1, eliminado);
    }

    public static String TestEliminar(Producto p){

            return "El producto se ha marcado como Descontinuado";

    }

    public static int verificarID(){
        int IDCorrecto = generarID();
        return IDCorrecto;
    }

    public static double calcularPrecioVenta(double precioCosto){
        return precioCosto + (precioCosto*25/100);
    }

    private static ArrayList<Producto> productos = new ArrayList<Producto>();
    private static ArrayList<Producto> coincidencias = new ArrayList<Producto>();
    private static ArrayList<Producto> iguales = new ArrayList<Producto>();

}
