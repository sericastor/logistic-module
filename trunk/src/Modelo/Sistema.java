/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Modelo;

import Controlador.CAdministrarProducto;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author r4wd3r
 */
public class Sistema {
    private static ArrayList<Empleado> empleados = new ArrayList<Empleado>();
    private static ArrayList<Producto> productos = new ArrayList<Producto>();
    private static ArrayList<Proveedor> proveedores = new ArrayList<Proveedor>();
    private static ArrayList<Lugar> lugares = new ArrayList<Lugar>();
    private static ArrayList<Factura> facturas = new ArrayList<Factura>();
    private static ArrayList<Orden> ordenes = new ArrayList<Orden>();
    private static Empleado empleadoActual = new Empleado("","","","","",0,0,null,"");

    public static void iniciarProductos() {

    }

    private static void iniciarEmpleados() {
    }

    public static void iniciarDatos() {
        iniciarProductos();
        iniciarEmpleados();
    }

    public static boolean formatoFechaCorrecto(String fecha) {
        try{
            if (Integer.parseInt(fecha.substring(6, 10)) > 2000 || Integer.parseInt(fecha.substring(6, 10)) < 1900 ||
                    Integer.parseInt(fecha.substring(3, 5)) > 12 || Integer.parseInt(fecha.substring(3, 5)) < 1 ||
                    Integer.parseInt(fecha.substring(0, 2)) > 31 || Integer.parseInt(fecha.substring(0, 2)) < 1){
                JOptionPane.showMessageDialog(null, "Valores de año, mes o día incorrectos", "Atención", JOptionPane.WARNING_MESSAGE);
                return false;
            }
            else{
                if (fecha.length() != 10 || !fecha.substring(2, 3).equals("/") || !fecha.substring(5, 6).equals("/")){
                    JOptionPane.showMessageDialog(null, "Formato de fecha mal ingresado: debe ser dd/mm/aaaa", "Atención", JOptionPane.WARNING_MESSAGE);
                    return false;
                }
            }

        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Formato de fecha mal ingresado: debe ser dd/mm/aaaa", "Atención", JOptionPane.WARNING_MESSAGE);
            return false;
        }
        return true;
    }

    public Sistema (){
        inicializacion();
    }

    public static ArrayList<Empleado> getEmpleados() {
        return empleados;
    }

    public static void setEmpleados(ArrayList<Empleado> empleados) {
        Sistema.empleados = empleados;
    }

    public static ArrayList<Factura> getFacturas() {
        return facturas;
    }

    public static void setFacturas(ArrayList<Factura> facturas) {
        Sistema.facturas = facturas;
    }

    public static ArrayList<Lugar> getLugares() {
        return lugares;
    }

    public static void setLugares(ArrayList<Lugar> lugares) {
        Sistema.lugares = lugares;
    }

    public static ArrayList<Orden> getOrdenes() {
        return ordenes;
    }

    public static void setOrdenes(ArrayList<Orden> ordenes) {
        Sistema.ordenes = ordenes;
    }

    public static ArrayList<Producto> getProductos() {

        return productos;
    }

   

    public static void setProductos(ArrayList<Producto> productos) {
        Sistema.productos = productos;
        //System.out.println(productos);
    }

    public static ArrayList<Proveedor> getProveedores() {
        return proveedores;
    }

    public static void setProveedores(ArrayList<Proveedor> proveedores) {
        Sistema.proveedores = proveedores;
    }

    public static Empleado getEmpleadoActual() {
        return empleadoActual;
    }

    public static void setEmpleadoActual(Empleado empleadoActual) {
        Sistema.empleadoActual = empleadoActual;
    }


    public static void inicializacion(){
        Empleado emp = new Empleado("admin","admin","admin","admin", "Calle falsa 123",
                2777777, 1020102010,new Date(1990, 5, 22),"Gerente de Logistica");
        empleados.add(emp);
        emp = new Empleado("invitado","invitado","invitado", "invitado","Calle falsa 124",
                2777778, 1020102020,new Date(1990, 6, 22),"Auxiliar de Bodega");
        empleados.add(emp);
        emp = new Empleado("sebastian","sebastian","sebas", "","Calle falsa 124",
                2777778, 1020102021,new Date(1990, 6, 22),"Gerente de Logistica");
        empleados.add(emp);
        emp = new Empleado("invitado","invitado","invitado2", "invitado","Calle falsa 124",
                2777778, 1020102022,new Date(1990, 6, 22),"Auxiliar de Bodega");
        empleados.add(emp);
        emp = new Empleado("invitado","invitado","invitado3", "invitado","Calle falsa 124",
                2777778, 1020102023,new Date(1990, 6, 22),"Auxiliar de Bodega");
        empleados.add(emp);
        emp = new Empleado("invitado","invitado","invitado4", "invitado","Calle falsa 124",
                2777778, 1020102024,new Date(1990, 6, 22),"Auxiliar de Bodega");
        empleados.add(emp);



        Producto p = new Producto(CAdministrarProducto.generarID(), "Sal", "Refisal",
                0, 1000, 1000 * (1 + 25/100),0.16, "Almacenado");
        productos.add(p);
        p = new Producto(CAdministrarProducto.generarID(), "Chocolate", "Luker",
                0, 2000, 2000 * (1 + 25/100),0.16, "Almacenado");
        productos.add(p);
        p = new Producto(CAdministrarProducto.generarID(), "Arroz", "Diana",
                0, 1300, 1300 * (1 + 25/100),0.16, "Bloqueado");
        productos.add(p);
        p = new Producto(CAdministrarProducto.generarID(), "Aceite", "Girasol",
                0, 7000, 7000 * (1 + 25/100),0.16, "En tránsito");
        productos.add(p);
        p = new Producto(CAdministrarProducto.generarID(), "Café", "Nescafé",
                0, 3000, 3000 * (1 + 25/100),0.16, "Perdido");
        productos.add(p);
        p = new Producto(CAdministrarProducto.generarID(), "Leche", "Alqueria",
                0, 2300, 2300 * (1 + 25/100),0.16, "Descontinuado");
        productos.add(p);
        p = new Producto(CAdministrarProducto.generarID(), "Shampoo", "Pantene",
                0, 10000, 10000 * (1 + 25/100),0.16, "Almacenado");
        productos.add(p);

    }
}
