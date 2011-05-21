/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Controlador;

import Dao.ProductoDAO;
import Modelo.Empleado;
import Modelo.Producto;
import Modelo.Sistema;

/**
 *
 * @author Martin Kanayet
 */
public class CIniciarSesion {

    public CIniciarSesion(){
       
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
}
