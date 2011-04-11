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
    private ArrayList<Empleado> empleados = new ArrayList<Empleado>();
    private ArrayList<Producto> productos = new ArrayList<Producto>();
    private ArrayList<Proveedor> proveedores = new ArrayList<Proveedor>();
    private ArrayList<Lugar> lugares = new ArrayList<Lugar>();
    private ArrayList<Factura> facturas = new ArrayList<Factura>();
    private ArrayList<Orden> ordenes = new ArrayList<Orden>();

    public Sistema (){
        inicializacion();
    }

    public ArrayList<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(ArrayList<Empleado> empleados) {
        this.empleados = empleados;
    }

    public ArrayList<Factura> getFacturas() {
        return facturas;
    }

    public void setFacturas(ArrayList<Factura> facturas) {
        this.facturas = facturas;
    }

    public ArrayList<Lugar> getLugares() {
        return lugares;
    }

    public void setLugares(ArrayList<Lugar> lugares) {
        this.lugares = lugares;
    }

    public ArrayList<Orden> getOrdenes() {
        return ordenes;
    }

    public void setOrdenes(ArrayList<Orden> ordenes) {
        this.ordenes = ordenes;
    }

    public ArrayList<Producto> getProductos() {

        return productos;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
        System.out.println(productos);
    }

    public ArrayList<Proveedor> getProveedores() {
        return proveedores;
    }

    public void setProveedores(ArrayList<Proveedor> proveedores) {
        this.proveedores = proveedores;
    }

    public void inicializacion(){
        Empleado empinicial1= new Empleado("admin","admin","admin","admin","Gerente de Logistica","22-2011-05");
        empleados.add(empinicial1);
        Empleado empinicial2= new Empleado("invitado","invitado","invitado","invitado","Auxiliar de Bodega","22-2011-05");
        empleados.add(empinicial2);
    }
}
