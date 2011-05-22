/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Controlador;

import Dao.ProductoDAO;
import Modelo.Empleado;
import Modelo.Producto;
import Modelo.Sistema;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Martin Kanayet
 */
public class CIniciarSesion {

    public CIniciarSesion(){
        inicializar();
        

    }

    public static Empleado ValidarIngreso(String usuario, String password){

        for(Empleado emp:Sistema.getEmpleados()){
            if(emp.getUsuario().equals(usuario)){
                if(emp.getContrasena().equals(password)){
                    return emp;
                }
            }

        }
        return new Empleado("","","","","",0,0,null,"");
    }

    public static String TestIniciarSesion(String usuario, String password){

        Sistema.inicializacion();
        Sistema.setEmpleadoActual(CIniciarSesion.ValidarIngreso(usuario, password));
        System.out.println(Sistema.getEmpleadoActual().getUsuario());
        if(Sistema.getEmpleadoActual().getTipo().equals("Gerente de Logistica")){
            return "Gerente de logistica";
        }
        else if(Sistema.getEmpleadoActual().getTipo().equals("Auxiliar de Bodega")){
            return "Auxiliar de bodega";
        }
        else{
            return "Inicio de sesión incorrecto, debe ingresar unas credenciales válidas.";
        }


    }

    private void inicializar() {

        ProductoDAO dao = new ProductoDAO();
        
        ArrayList<Producto> productos = new ArrayList<Producto>();


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

        for (Producto u : productos) {
            
            dao.crear(u);

        }

    }
}


