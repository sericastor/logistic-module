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
    
    public boolean actualizarEmpleado(int identificador, Empleado nuevo){
        Sistema.getEmpleados().set(identificador - 1, nuevo);
        return true;
    }
    
    public void eliminarEmpleado(String documento) {
        ArrayList<Empleado> empleados = new ArrayList<Empleado>();
        for (Empleado e:empleados ){
            if (e.getDocumento().equals(documento)){
                Sistema.getEmpleados().remove(e);
            }
        }
    }

    public void crearEmpleado(String apellido, String contrasena, String direccion, String tipo,
            String documento, String fechaNacimiento, String telefono, String usuario, String nombre) {

        Empleado empleado = new Empleado(apellido, contrasena, direccion,
                documento, fechaNacimiento, telefono, usuario, nombre, tipo);
        Sistema.getEmpleados().add(empleado);
    }

    public ArrayList<Empleado> buscarEmpleados(String nombre, String apellido, String usuario,
            String contrasena, String direccion, String telefono, String documento,
            String fechaNacimiento, String tipo) {

        ArrayList<Empleado> coincidencias = new ArrayList<Empleado>();
        ArrayList<Empleado> empleados = new ArrayList<Empleado>();
        empleados = Sistema.getEmpleados();
        Empleado base = new Empleado(nombre, apellido, usuario, contrasena, direccion,
                telefono, documento, fechaNacimiento, tipo);
        for(int i=0;i<empleados.size();i++){
            if(base.getTipo().equals(empleados.get(i).getTipo())){
                System.out.println("1");
                if(base.getNombre().equals(empleados.get(i).getNombre())||base.getNombre().equals("")){
                    System.out.println("2");
                    if(base.getApellido().equals(empleados.get(i).getApellido())||base.getApellido().equals("")){
                        System.out.println("3");
                        if(base.getUsuario().equals(empleados.get(i).getUsuario()) || base.getUsuario().equals("")){
                            System.out.println("4");
                            if(base.getContrasena().equals(empleados.get(i).getContrasena()) || base.getContrasena().equals("")){
                                System.out.println("5");
                                if(base.getDocumento().equals(empleados.get(i).getDocumento()) || base.getDocumento().equals("")){
                                    System.out.println("6");
                                    if(base.getDireccion().equals(empleados.get(i).getDireccion()) || base.getDireccion().equals("")){
                                        System.out.println("7");
                                        if(base.getFechaNacimiento().equals(empleados.get(i).getFechaNacimiento())
                                                || base.getFechaNacimiento().equals("")){
                                            System.out.println("8");
                                            if(base.getTelefono().equals(empleados.get(i).getTelefono())
                                                    || base.getTelefono().equals("")){
                                                System.out.println("9");
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
