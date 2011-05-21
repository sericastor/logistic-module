/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Controlador;

import Modelo.Empleado;
import Modelo.Sistema;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author gonzayo
 */
public class CAdministrarEmpleado {
    
    public static String actualizarEmpleado(Empleado viejo, Empleado nuevo){
        if(nuevo.getNombre().equals("") || nuevo.getApellido().equals("") || nuevo.getUsuario().equals("") ||
            nuevo.getContrasena().equals("") || nuevo.getDireccion().equals("") ||
            nuevo.getTelefono()==0 || nuevo.getDocumento()==0 || nuevo.getFechaNacimiento().equals("")){
            return "ALERTA Existen campos nulos";
        }else{
        if (validarEmpleado(nuevo).equals("Empleado válido")){
            viejo.setNombre(formatoNombre(nuevo.getNombre()));
            viejo.setApellido(formatoNombre(nuevo.getApellido()));
            viejo.setUsuario(nuevo.getUsuario());
            viejo.setContrasena(nuevo.getContrasena());
            viejo.setDireccion(nuevo.getDireccion());
            viejo.setTelefono(nuevo.getTelefono());
            viejo.setDocumento(nuevo.getDocumento());
            viejo.setFechaNacimiento(nuevo.getFechaNacimiento());
            viejo.setTipo(nuevo.getTipo());
            return "Se ha actualizado el empleado";
        }
        return validarEmpleado(nuevo);
        }
    }
    
    public static String eliminarEmpleado(Empleado eliminar) {
      for (Empleado e:Sistema.getEmpleados() ){
            if (e == eliminar){
                Sistema.getEmpleados().remove(eliminar);
                if (e == Sistema.getEmpleadoActual()){
                    System.out.println("Usuario actual: " + Sistema.getEmpleadoActual().getUsuario() +
                            "\nUsuario eliminado: " + e.getUsuario());
                    JOptionPane.showMessageDialog(null, "ha eliminado su propio usuario", "Cerrar Sesión", JOptionPane.WARNING_MESSAGE);
                    Sistema.setEmpleadoActual(new Empleado("","","","","",0,0,null,""));
                    return "Ha eliminado su propio usuario";
                }   
                
            }
      }
      return "El empleado ha sido eliminado";
    }


    public static String crearEmpleado(Empleado empleado) {

        if(empleado.getNombre().equals("") || empleado.getApellido().equals("") || empleado.getUsuario().equals("") ||
            empleado.getContrasena().equals("") || empleado.getDireccion().equals("") ||
            empleado.getTelefono()==0 || empleado.getDocumento()==0 || empleado.getFechaNacimiento().equals("")){
            return "ALERTA Existen campos nulos";
        }else{
        for (Empleado e:Sistema.getEmpleados()){
            if (e.getDocumento()==empleado.getDocumento() || e.getUsuario().equals(empleado.getUsuario())){
                return "Usuario o Documento ya existen";
            }
        }

        if (!(validarEmpleado(empleado).equals("Empleado válido"))){
            return validarEmpleado(empleado);
        }

        Empleado emp = new Empleado(formatoNombre(empleado.getNombre()), formatoNombre(empleado.getApellido()), empleado.getUsuario(), empleado.getContrasena(), empleado.getDireccion(),
                empleado.getTelefono(), empleado.getDocumento(), empleado.getFechaNacimiento(), empleado.getTipo());
        Sistema.getEmpleados().add(Sistema.getEmpleados().size(), empleado);
        return "Usted ha creado un empleado";
        }

    }

    public static String Consultar (Empleado empleado){

        ArrayList<Empleado> consulta = new ArrayList<Empleado>();
        consulta.removeAll(consulta);
        try{

            consulta = CAdministrarEmpleado.buscarEmpleados(empleado);

            if(consulta.size()==0){
                return "No se han encontrado coincidencias";

            }
            else{
                return "Se encontraron coincidencias";
            }
        }catch(Exception e){
            return "";
        }

        //return "";
    }

    public static ArrayList<Empleado> buscarEmpleados(Empleado e) {

        ArrayList<Empleado> coincidencias = new ArrayList<Empleado>();
        for(Empleado emp: Sistema.getEmpleados()){
//            System.out.println("Sistema: " + empleados.get(i).getTipo());
//            System.out.println("Base: " + base.getTipo());
            if(e.getTipo().equals(emp.getTipo())){
                if(e.getNombre().equals(emp.getNombre())||e.getNombre().equals("")){
                    if(e.getApellido().equals(emp.getApellido())||e.getApellido().equals("")){
                        if(e.getUsuario().equals(emp.getUsuario()) || e.getUsuario().equals("")){
                            if(e.getContrasena().equals(emp.getContrasena()) || e.getContrasena().equals("")){
                                if(e.getDocumento() == emp.getDocumento() || e.getDocumento() == 0){
                                    if(e.getDireccion().equals(emp.getDireccion()) || e.getDireccion().equals("")){
                                        if(e.getFechaNacimiento().equals(emp.getFechaNacimiento())
                                                || e.getFechaNacimiento().equals("")){
                                            if(e.getTelefono() == emp.getTelefono()
                                                    || e.getTelefono() == 0){
                                                coincidencias.add(emp);                                                
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
    
    public static boolean validarLongNombre(String nombre){
        if (nombre == null || nombre.length() > 29 || nombre.length() < 2){
            return false;
        }
        return true;
    }
    
    public static boolean validarContNombre(String nombre){
        for (int i = 0; i < nombre.length(); i++){
            if (((int)nombre.charAt(i) < 65 && (int)nombre.charAt(i) != 32) ||
                    ((int)nombre.charAt(i) > 90 && (int)nombre.charAt(i) < 97) ||
                    (int)nombre.charAt(i) > 122){
                return false;
            }
        }
        return true;
    }

public static String validarEmpleado(Empleado empleado){
        if (!(validarLongNombre(empleado.getNombre()))){
            return "El nombre debe ser de longitud mínimo 2, máximo 29 caracteres";
        }
        if(!(validarContNombre(empleado.getNombre()))){
            return "El nombre sólo puede tener letras";
        }
        if (!(validarLongApellido(empleado.getApellido()))){
            return "El apellido debe ser de longitud mínimo 2, máximo 29 caracteres";
        }
        if(!(validarContApellido(empleado.getApellido()))){
           return "El apellido sólo puede tener letras";
        }
        if (!(validarLongUsuario(empleado.getUsuario()))){
            return "El usuario debe ser de longitud mínimo 7, máximo 14 caracteres";
        }
        if(!(validarContUsuario(empleado.getUsuario()))){
            return "El usuario sólo puede tener caracteres alfanuméricos";
        }
        if (!(validarContrasena(empleado.getContrasena()))){
            return "La contraseña debe ser de longitud mínimo 9 caracteres";
        }
        if (!(validarDireccion(empleado.getDireccion()))){
            return "La dirección debe ser de longitud mínimo 1, máximo 49 caracteres";
        }
       if (!(validarTelefono(empleado.getTelefono()))){
           return "El teléfono debe tomar valores entre 1000000 y 1000000000";
        }
        if(!(validarDocumento(empleado.getDocumento()))){
           return "El documento debe tomar valores entre 1000000 y 1000000000";
        }
        if (!(validarNacimiento(empleado.getFechaNacimiento())).equals("Fecha válida")){
            return validarNacimiento(empleado.getFechaNacimiento());
        }
  return "Empleado válido";
}
    public static boolean validarLongApellido(String apellido){
        if (apellido == null || apellido.length() > 29 || apellido.length() < 2){
            return false;
        }
        return true;
    }
    public static boolean validarContApellido(String apellido){
        for (int i = 0; i < apellido.length(); i++){
            if (((int)apellido.charAt(i) < 65 && (int)apellido.charAt(i) != 32) ||
                    ((int)apellido.charAt(i) > 90 && (int)apellido.charAt(i) < 97) ||
                    (int)apellido.charAt(i) > 122){
                return false;
            }
        }
        return true;
    }
    
    public static boolean validarLongUsuario(String usuario){
        if (usuario == null || usuario.length() > 14 || usuario.length() < 7){
            return false;
        }
        return true;
    }

    public static boolean validarContUsuario(String usuario){
        for (int i = 0; i < usuario.length(); i++){
            if (((int)usuario.charAt(i) < 48 ) ||
                    ((int)usuario.charAt(i) > 57 && (int)usuario.charAt(i) < 65) ||
                    ((int)usuario.charAt(i) > 90 && (int)usuario.charAt(i) < 97) ||
                    (int)usuario.charAt(i) > 122){
                return false;
            }
        }
        return true;
    }
    
    public static boolean validarContrasena(String contrasena){
        if (contrasena == null || contrasena.length() < 9){
            return false;
        }
        return true;
    }
    
    public static boolean validarDireccion(String direccion){
        if (direccion == null || direccion.length() > 49 || direccion.length() < 1){
            return false;
        }
        return true;
    }
    
    public static boolean validarTelefono(Long telefono){
       if (telefono<1000000 || telefono>1000000000){
           return false;
       }
       return true;
   }
    
   public static boolean validarDocumento(Long documento){
       if (documento<1000000 || documento>1000000000){
           return false;
       }
       return true;
   }
    
    public static String validarNacimiento(String nacimiento){
        if (nacimiento == null || nacimiento.length() != 10 || nacimiento.charAt(2) != '/' || nacimiento.charAt(5) != '/'){
            return "El formato de la fecha de nacimiento debe ser dd/mm/aaaa";
        }
        for (int i = 0; i < nacimiento.length(); i++){
            if ((int)nacimiento.charAt(i) < 48 || (int)nacimiento.charAt(i) > 57){
                return "El formato de la fecha de nacimiento debe ser dd/mm/aaaa";
            }
            if (i == 1 || i == 4){
                i++;
            }
        }

        if(Long.parseLong(nacimiento.substring(3,5))==4 || Long.parseLong(nacimiento.substring(3,5))==6 || Long.parseLong(nacimiento.substring(3,5))==9 || Long.parseLong(nacimiento.substring(3,5))==11){
            if (Long.parseLong(nacimiento.substring(0, 2)) < 1 || Long.parseLong(nacimiento.substring(0, 2)) > 30){
                return "El día debe ser menor a 31 y mayor que 0";
            }
        }else{
                if(Long.parseLong(nacimiento.substring(3,5))==2){
                    if (Long.parseLong(nacimiento.substring(0, 2)) < 1 || Long.parseLong(nacimiento.substring(0, 2)) > 28){
                    return "El día debe ser menor a 29 y mayor que 0";
                }
                }else{
                    if (Long.parseLong(nacimiento.substring(0, 2)) < 1 || Long.parseLong(nacimiento.substring(0, 2)) > 31){
                    return "El día debe ser menor a 32 y mayor que 0";
                }
            }
        }

                    
        if (Long.parseLong(nacimiento.substring(3, 5)) < 1 || Long.parseLong(nacimiento.substring(3, 5)) > 12){
            return "El mes debe ser menor a 13 y mayor que 0";
        }

        if (Long.parseLong(nacimiento.substring(6, 10)) < 1901 || Long.parseLong(nacimiento.substring(6, 10)) > 2000){
            return "El año debe ser menor a 2001 y mayor que 1900";
        }
        return "Fecha válida";
    }

    public static String formatoNombre(String nombre) {
        String nuevoNombre = "";
        int i = 0;
        while (nombre.substring(i, i+1).equals(" ")){
            i++;
        }       
        while (i < nombre.length()){
            nuevoNombre = nuevoNombre + nombre.substring(i, i+1).toUpperCase();
            i++;
            while (i < nombre.length() && (int)nombre.charAt(i) != 32){
                nuevoNombre = nuevoNombre + nombre.substring(i, i+1).toLowerCase();
                i++;
            }
            nuevoNombre = nuevoNombre + " ";
            i++;
        }
        return nuevoNombre;
    }
}