/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Modelo;

import Controlador.CAdministrarProducto;
import Controlador.CIniciarSesion;
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
    private static int tipo;

    public static void setTipo(int i) {
        tipo = i;
    }

    public static void iniciarProductos() {
        Producto p = new Producto(CAdministrarProducto.generarID(), "Sal", "Refisal",
                1, 1000, 1000 * (1 + 25/100),0.16, "Almacenado");
        productos.add(p);
        p = new Producto(CAdministrarProducto.generarID(), "Chocolate", "Luker",
                1, 2000, 2000 * (1 + 25/100),0.16, "Almacenado");
        productos.add(p);
        p = new Producto(CAdministrarProducto.generarID(), "Arroz", "Diana",
                1, 1300, 1300 * (1 + 25/100),0.16, "Bloqueado");
        productos.add(p);
        p = new Producto(CAdministrarProducto.generarID(), "Aceite", "Girasol",
                1, 7000, 7000 * (1 + 25/100),0.16, "En tránsito");
        productos.add(p);
        p = new Producto(CAdministrarProducto.generarID(), "Café", "Nescafé",
                1, 3000, 3000 * (1 + 25/100),0.16, "Perdido");
        productos.add(p);
        p = new Producto(CAdministrarProducto.generarID(), "Leche", "Alqueria",
                1, 2300, 2300 * (1 + 25/100),0.16, "Descontinuado");
        productos.add(p);
        p = new Producto(CAdministrarProducto.generarID(), "Shampoo", "Pantene",
                1, 10000, 10000 * (1 + 25/100),0.16, "Almacenado");
        productos.add(p);

    }

    private static void iniciarEmpleados() {
    }

    public static void iniciarDatos() {
        iniciarProductos();
        iniciarEmpleados();
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

    public static void inicializacion(){
        Empleado empinicial1= new Empleado("admin","admin","admin","admin", "Calle falsa 123", "2777777", "1020102010","22-2011-05","Gerente de Logistica");
        empleados.add(empinicial1);
        Empleado empinicial2= new Empleado("invitado","invitado","invitado", "invitado","Calle falsa 124", "2777778", "1020102020","21-2011-05","Auxiliar de Bodega");
        empleados.add(empinicial2);
    }
}
