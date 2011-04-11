/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Modelo;

import java.util.ArrayList;

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
        System.out.println(productos);
    }

    public static ArrayList<Proveedor> getProveedores() {
        return proveedores;
    }

    public static void setProveedores(ArrayList<Proveedor> proveedores) {
        Sistema.proveedores = proveedores;
    }

    public static void inicializacion(){
        Empleado empinicial1= new Empleado("admin","admin","admin","admin","Gerente de Logistica","22-2011-05");
        empleados.add(empinicial1);
        Empleado empinicial2= new Empleado("invitado","invitado","invitado","invitado","Auxiliar de Bodega","22-2011-05");
        empleados.add(empinicial2);
    }
}
