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
    ArrayList<Empleado> empleados = new ArrayList();
    ArrayList<Producto> productos = new ArrayList();
    ArrayList<Proveedor> proveedores = new ArrayList();
    ArrayList<Lugar> lugares = new ArrayList();
    ArrayList<Factura> facturas = new ArrayList();
    ArrayList<Orden> ordenes = new ArrayList();

    public void inicializacion(){
        Empleado empinicial1= new Empleado("admin","admin","admin","admin","Gerente de Logistica","22-2011-05");
        empleados.add(empinicial1);
        Empleado empinicial2= new Empleado("invitado","invitado","invitado","invitado","Auxiliar de Bodega","22-2011-05");
        empleados.add(empinicial2);
    }
    public Sistema (){
        inicializacion();
    }


}
