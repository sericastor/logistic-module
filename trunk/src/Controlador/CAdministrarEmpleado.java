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

    public void crearEmpleado(Empleado empleado) {
        empleados.add(empleado);
    }
    
    public ArrayList<Empleado> buscarEmpleados(Empleado base){
        empleados = Sistema.getEmpleados();
        int j = empleados.size();
        for(int i=0;i<j;i++){
            if(base.getTipo().equals(empleados.get(i).getTipo())){
                if(base.getNombre().equals(empleados.get(i).getNombre())||base.getNombre().equals("")){
                    if(base.getApellido().equals(empleados.get(i).getApellido())||base.getApellido().equals("")){
                        if(base.getUsuario().equals(empleados.get(i).getUsuario()) || base.getUsuario().equals("")){
                            if(base.getContrasena().equals(empleados.get(i).getContrasena()) || base.getContrasena().equals("")){
                                if(base.getDocumento().equals(empleados.get(i).getDocumento()) || base.getDocumento().equals("")){
                                    if(base.getDireccion().equals(empleados.get(i).getDireccion()) || base.getDireccion().equals("")){
                                        if(base.getFechaNacimiento().equals(empleados.get(i).getFechaNacimiento())
                                                || base.getFechaNacimiento().equals("")){
                                            if(base.getTelefono().equals(empleados.get(i).getTelefono())
                                                    || base.getTelefono().equals("")){
                                                coincidencias.add(empleados.get(i));
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }

        }

        
        return coincidencias;
    }

    public boolean actualizarEmpleado(int identificador, Empleado nuevo){
        empleados.set(identificador - 1, nuevo);
        Sistema.getEmpleados().set(identificador - 1, nuevo);
        return true;
    }

    private ArrayList<Empleado> empleados = new ArrayList<Empleado>();
    private ArrayList<Empleado> coincidencias = new ArrayList<Empleado>();

}
