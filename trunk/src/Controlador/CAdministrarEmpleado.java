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
 * @author gonzayo
 */
public class CAdministrarEmpleado {
    private ArrayList<Empleado> empleados = new ArrayList<Empleado>();

    public void crearProductos(ArrayList<Empleado> nuevos) {
        empleados = nuevos;
        Sistema.setEmpleados(empleados);
    }

}
