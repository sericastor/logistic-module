/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Controlador;

import Modelo.Empleado;
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
                        Sistema.iniciarDatos();
                        return 1;
                    }
                    if(emp.getTipo().equals("Auxiliar de Bodega")){
                        Sistema.iniciarDatos();
                        return 2;
                    }
                }
            }

        }

        return 0;
    }
}
