/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Controlador;

import Modelo.Empleado;
import Modelo.Producto;
import Modelo.Sistema;
import java.util.ArrayList;

/**
 *
 * @author Martin Kanayet
 */
public class CIniciarSesion {

    public CIniciarSesion(){}

    public static int ValidarIngreso(String usuario, String password){

        ArrayList<Empleado> empleados = new ArrayList<Empleado>();
        empleados = Sistema.getEmpleados();

        for(Empleado emp:empleados){

            if(emp.getUsuario().equals(usuario)){
                if(emp.getContrasena().equals(password)){
                    if(emp.getTipo().equals("Gerente de Logistica")){
                        inicializarProductos();
                        return 1;
                    }
                    if(emp.getTipo().equals("Auxiliar de Bodega")){
                        return 2;
                    }
                }
            }

        }

        return 0;
    }

    public static void inicializarProductos(){
        producto1.setEstado("Almacenado");
        producto1.setId(1);
        producto1.setMarca("Refisal");
        producto1.setNombre("Sal");
        producto1.setPrecioCosto(1000);
        producto1.setPrecioVenta(1000 + 1000*25/100);
        inicial.add(producto1);
        producto2.setEstado("Almacenado");
        producto2.setId(2);
        producto2.setMarca("Luker");
        producto2.setNombre("Chocolate");
        producto2.setPrecioCosto(2000);
        producto2.setPrecioVenta(2000 + 2000*25/100);
        inicial.add(producto2);
        producto3.setEstado("Bloqueado");
        producto3.setId(3);
        producto3.setMarca("Diana");
        producto3.setNombre("Arroz");
        producto3.setPrecioCosto(1300);
        producto3.setPrecioVenta(1300 + 1300*25/100);
        inicial.add(producto3);
        producto4.setEstado("En tránsito");
        producto4.setId(4);
        producto4.setMarca("Girasol");
        producto4.setNombre("Aceite");
        producto4.setPrecioCosto(7000);
        producto4.setPrecioVenta(7000 + 7000*25/100);
        inicial.add(producto4);
        producto5.setEstado("Perdido");
        producto5.setId(5);
        producto5.setMarca("Nescafé");
        producto5.setNombre("Café");
        producto5.setPrecioCosto(3000);
        producto5.setPrecioVenta(3000 + 3000*25/100);
        inicial.add(producto5);
        producto6.setEstado("Descontinuado");
        producto6.setId(6);
        producto6.setMarca("Alqueria");
        producto6.setNombre("Leche");
        producto6.setPrecioCosto(2300);
        producto6.setPrecioVenta(2300 + 2300*25/100);
        inicial.add(producto6);
        producto7.setEstado("Almacenado");
        producto7.setId(7);
        producto7.setMarca("Pantene");
        producto7.setNombre("Shampoo");
        producto7.setPrecioCosto(10000);
        producto7.setPrecioVenta(10000 + 10000*25/100);
        inicial.add(producto7);
        Sistema.setProductos(inicial);
    }

    private static ArrayList<Producto> inicial = new ArrayList<Producto>();
    private static Producto producto1 = new Producto();
    private static Producto producto2 = new Producto();
    private static Producto producto3 = new Producto();
    private static Producto producto4 = new Producto();
    private static Producto producto5 = new Producto();
    private static Producto producto6 = new Producto();
    private static Producto producto7 = new Producto();
    }
