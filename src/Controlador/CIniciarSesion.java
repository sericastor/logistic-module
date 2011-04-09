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

    public int ValidarIngreso(String usuario, String password){

        Sistema sistema = new Sistema();

        ArrayList<Empleado> empleados = new ArrayList<Empleado>();
        empleados = sistema.getEmpleados();

        for(Empleado e:empleados){

            if(e.getUsuario_empleado().equals(usuario)){
                if(e.getPassword_empleado().equals(password)){
                    if(e.getTipo_empleado().equals("Gerente de Logistica")){
                        return 1;
                    }
                    if(e.getTipo_empleado().equals("Auxiliar de Bodega")){
                        return 2;
                    }
                }
            }

        }

        return 0;
    }

}
