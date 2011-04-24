/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Controlador;

import Modelo.Empleado;
import Modelo.Sistema;

/**
 *
 * @author Martin Kanayet
 */
public class CIniciarSesion {

    public CIniciarSesion(){}

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
}
