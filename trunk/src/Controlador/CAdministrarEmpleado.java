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
    
<<<<<<< .mine
    public static void actualizarEmpleado(Empleado nuevo, Empleado viejo){
        viejo.setNombre(nuevo.getNombre());
        viejo.setApellido(nuevo.getApellido());
        viejo.setUsuario(nuevo.getUsuario());
        viejo.setContrasena(nuevo.getContrasena());
        viejo.setDireccion(nuevo.getDireccion());
        viejo.setTelefono(nuevo.getTelefono());
        viejo.setDocumento(nuevo.getDocumento());
        viejo.setFechaNacimiento(nuevo.getFechaNacimiento());
        viejo.setTipo(nuevo.getTipo());
=======
    public static boolean actualizarEmpleado(Empleado nuevo, Empleado viejo){
        viejo = nuevo;
        return true;
>>>>>>> .r167
    }
    
    public static void eliminarEmpleado(Empleado eliminar) {
        for (Empleado e:Sistema.getEmpleados() ){
            if (e == eliminar){
                Sistema.getEmpleados().remove(eliminar);
                break;
            }
        }
    }

    public static boolean crearEmpleado(String nombre, String apellido, String usuario, String contrasena,
            String direccion, String telefono, String documento, String fechaNacimiento, String tipo) {

        Empleado empleado = new Empleado(nombre, apellido, usuario, contrasena,
                direccion, telefono, documento, fechaNacimiento, tipo);

        for (Empleado e:Sistema.getEmpleados()){
            if (e.getDocumento().equals(empleado.getDocumento()) || e.getUsuario().equals(empleado.getUsuario())){
                return false;
            }
        }
        Sistema.getEmpleados().add(empleado);
        return true;
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