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
    
    public static boolean actualizarEmpleado(int identificador, Empleado nuevo){
        Sistema.getEmpleados().set(identificador - 1, nuevo);
        return true;
    }
    
    public static void eliminarEmpleado(String documento) {
        ArrayList<Empleado> empleados = new ArrayList<Empleado>();
        for (Empleado e:empleados ){
            if (e.getDocumento().equals(documento)){
                Sistema.getEmpleados().remove(e);
            }
        }
    }

    public static void crearEmpleado(String nombre, String apellido, String usuario, String contrasena,
            String direccion, String telefono, String documento, String fechaNacimiento, String tipo) {

        Empleado empleado = new Empleado(nombre, apellido, usuario, contrasena,
                direccion, telefono, documento, fechaNacimiento, tipo);
        Sistema.getEmpleados().add(empleado);
    }

    public static ArrayList<Empleado> buscarEmpleados(String nombre, String apellido, String usuario,
            String contrasena, String direccion, String telefono, String documento,
            String fechaNacimiento, String tipo) {

        ArrayList<Empleado> coincidencias = new ArrayList<Empleado>();
        ArrayList<Empleado> empleados = new ArrayList<Empleado>();
        empleados = Sistema.getEmpleados();
        Empleado base = new Empleado(nombre, apellido, usuario, contrasena, direccion,
                telefono, documento, fechaNacimiento, tipo);
        for(int i=0;i<empleados.size();i++){
            System.out.println("Sistema: " + empleados.get(i).getTipo());
            System.out.println("Base: " + base.getTipo());
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
}
