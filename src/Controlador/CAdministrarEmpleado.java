/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Controlador;

import Modelo.Empleado;
import Modelo.Sistema;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author gonzayo
 */
public class CAdministrarEmpleado {
    
    public static boolean actualizarEmpleado(Empleado viejo, String nombre, String apellido,
        String usuario, String contrasena, String direccion, String telefono, String documento,
        String nacimiento, String tipo){
        for (Empleado e:Sistema.getEmpleados()){
            if (e.getUsuario().equals(usuario)){
                JOptionPane.showMessageDialog(null, "Usuario o Documento ya existen", "Error", JOptionPane.WARNING_MESSAGE);
                return false;
            }
        }
        if (CAdministrarEmpleado.validarDatos(nombre, apellido, usuario, contrasena,
                    direccion, telefono, documento, nacimiento)){
            Date fecha = CAdministrarEmpleado.formatoFecha(nacimiento);
            Empleado nuevo = new Empleado(nombre, apellido, usuario, contrasena,
                    direccion, Integer.parseInt(telefono), Integer.parseInt(documento), fecha, tipo);
            viejo.setNombre(formatoNombre(nuevo.getNombre()));
            viejo.setApellido(formatoNombre(nuevo.getApellido()));
            viejo.setUsuario(nuevo.getUsuario());
            viejo.setContrasena(nuevo.getContrasena());
            viejo.setDireccion(nuevo.getDireccion());
            viejo.setTelefono(nuevo.getTelefono());
            viejo.setDocumento(nuevo.getDocumento());
            viejo.setFechaNacimiento(nuevo.getFechaNacimiento());
            viejo.setTipo(nuevo.getTipo());
            return true;
        }
        return false;
    }
    
    public static void eliminarEmpleado(Empleado eliminar) {
        for (Empleado e:Sistema.getEmpleados() ){
            if (e == eliminar){
                Sistema.getEmpleados().remove(eliminar);
                if (e == Sistema.getEmpleadoActual()){
                    JOptionPane.showMessageDialog(null, "ha eliminado su propio usuario", "Cerrar Sesión", JOptionPane.WARNING_MESSAGE);
                    Sistema.setEmpleadoActual(new Empleado("","","","","",0,0,null,""));
                }   
                break;
            }
        }
    }

    public static boolean crearEmpleado(String nombre, String apellido, String usuario, String contrasena,
            String direccion, String telefono, String documento, String fechaNacimiento, String tipo) {

        if (!validarDatos(nombre, apellido, usuario, contrasena, direccion, telefono, documento, fechaNacimiento)){
            return false;
        }
        for (Empleado e:Sistema.getEmpleados()){
            if (String.valueOf(e.getDocumento()).equals(documento) || e.getUsuario().equals(usuario)){
                JOptionPane.showMessageDialog(null, "Usuario o Documento ya existen", "Error", JOptionPane.WARNING_MESSAGE);
                return false;
            }
        }
        Empleado empleado = new Empleado(formatoNombre(nombre), formatoNombre(apellido), usuario, contrasena, direccion,
                Integer.parseInt(telefono), Integer.parseInt(documento), formatoFecha(fechaNacimiento), tipo);
        Sistema.getEmpleados().add(Sistema.getEmpleados().size(), empleado);
        return true;
    }

    public static boolean validarDatos(String nombre, String apellido, String usuario, String contrasena,
            String direccion, String telefono, String documento, String fechaNacimiento) {
        if (validarNombre(nombre) && validarApellido(apellido) && validarUsuario(usuario) && validarContrasena(contrasena) &&
                validarDireccion(direccion) && validarTelefono(telefono) && validarDocumento(documento) &&
                validarNacimiento(fechaNacimiento)){
            return true;
        }
        return false;
    }

    public static ArrayList<Empleado> buscarEmpleados(String nombre, String apellido, String usuario,
            String contrasena, String direccion, int telefono, int documento,
            Date fechaNacimiento, String tipo) {

        ArrayList<Empleado> coincidencias = new ArrayList<Empleado>();
        for(Empleado emp: Sistema.getEmpleados()){
//            System.out.println("Sistema: " + empleados.get(i).getTipo());
//            System.out.println("Base: " + base.getTipo());
            if(tipo.equals(emp.getTipo())){
                if(nombre.equals(emp.getNombre())||nombre.equals("")){
                    if(apellido.equals(emp.getApellido())||apellido.equals("")){
                        if(usuario.equals(emp.getUsuario()) || usuario.equals("")){
                            if(contrasena.equals(emp.getContrasena()) || contrasena.equals("")){
                                if(documento == emp.getDocumento() || documento == 0){
                                    if(direccion.equals(emp.getDireccion()) || direccion.equals("")){
                                        if(fechaNacimiento == (emp.getFechaNacimiento())
                                                || fechaNacimiento == null){
                                            if(telefono == emp.getTelefono()
                                                    || telefono == 0){
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
    
    public static boolean validarNombre(String nombre){        
        if (nombre.length() > 29 || nombre.length() < 2){
            JOptionPane.showMessageDialog(null, "El nombre debe ser de longitud mínimo 2, máximo 29 caracteres", "Nombre Incorrecto", JOptionPane.WARNING_MESSAGE);
            return false;
        }
        for (int i = 0; i < nombre.length(); i++){
            if (((int)nombre.charAt(i) < 65 && (int)nombre.charAt(i) != 32) ||
                    ((int)nombre.charAt(i) > 90 && (int)nombre.charAt(i) < 97) ||
                    (int)nombre.charAt(i) > 122){
                JOptionPane.showMessageDialog(null, "El nombre sólo puede tener letras", "Nombre Incorrecto", JOptionPane.WARNING_MESSAGE);
                return false;
            }
        }
        return true;
    }
    
    public static boolean validarApellido(String apellido){
        if (apellido.length() > 29 || apellido.length() < 2){
            JOptionPane.showMessageDialog(null, "El apellido debe ser de longitud mínimo 2, máximo 29 caracteres", "Apellido Incorrecto", JOptionPane.WARNING_MESSAGE);
            return false;
        }
        for (int i = 0; i < apellido.length(); i++){
            if (((int)apellido.charAt(i) < 65 && (int)apellido.charAt(i) != 32) ||
                    ((int)apellido.charAt(i) > 90 && (int)apellido.charAt(i) < 97) ||
                    (int)apellido.charAt(i) > 122){
                JOptionPane.showMessageDialog(null, "El apellido sólo puede tener letras", "Apellido Incorrecto", JOptionPane.WARNING_MESSAGE);
                return false;
            }
        }
        return true;
    }
    
    public static boolean validarUsuario(String usuario){
        if (usuario.length() > 14 || usuario.length() < 7){
            JOptionPane.showMessageDialog(null, "El usuario debe ser de longitud mínimo 7, máximo 14 caracteres", "Usuario Incorrecto", JOptionPane.WARNING_MESSAGE);
            return false;
        }
        for (int i = 0; i < usuario.length(); i++){
            if (((int)usuario.charAt(i) < 48 ) ||
                    ((int)usuario.charAt(i) > 57 && (int)usuario.charAt(i) < 65) ||
                    ((int)usuario.charAt(i) > 90 && (int)usuario.charAt(i) < 97) ||
                    (int)usuario.charAt(i) > 122){
                JOptionPane.showMessageDialog(null, "El usuario sólo puede tener caracteres alfanuméricos", "Usuario Incorrecto", JOptionPane.WARNING_MESSAGE);
                return false;
            }
        }
        return true;
    }
    
    public static boolean validarContrasena(String contrasena){
        if (contrasena.length() < 9){
            JOptionPane.showMessageDialog(null, "La contraseña debe ser de longitud mínimo 9 caracteres", "Contrasena Incorrecto", JOptionPane.WARNING_MESSAGE);
            return false;
        }
        return true;
    }
    
    public static boolean validarDireccion(String direccion){
        if (direccion.length() > 49 || direccion.length() < 1){
            JOptionPane.showMessageDialog(null, "La dirección debe ser de longitud mínimo 1, máximo 49 caracteres", "Dirección Incorrecto", JOptionPane.WARNING_MESSAGE);
            return false;
        }
        return true;
    }
    
    public static boolean validarTelefono(String telefono){
        if (telefono.length() < 7 || telefono.length() > 10){
            JOptionPane.showMessageDialog(null, "El teléfono debe tener mínimo 7 números y máximo 10", "Teléfono Incorrecto", JOptionPane.WARNING_MESSAGE);
            return false;
        }
        for (int i = 0; i < telefono.length(); i++){
            if ((int)telefono.charAt(i) < 48 || (int)telefono.charAt(i) > 57){
                JOptionPane.showMessageDialog(null, "El teléfono sólo puede tener caracteres numéricos", "Teléfono Incorrecto", JOptionPane.WARNING_MESSAGE);
                return false;
            }
        }
        return true;
    }
    
    public static boolean validarDocumento(String documento){
        if (documento.length() < 7 || documento.length() > 10){
            JOptionPane.showMessageDialog(null, "El documento debe tener mínimo 7 números y máximo 10", "Documento Incorrecto", JOptionPane.WARNING_MESSAGE);
            return false;
        }
        for (int i = 0; i < documento.length(); i++){
            if ((int)documento.charAt(i) < 48 || (int)documento.charAt(i) > 57){
                JOptionPane.showMessageDialog(null, "El documento sólo puede tener caracteres numéricos", "Documento Incorrecto", JOptionPane.WARNING_MESSAGE);
                return false;
            }
        }
        return true;
    }
    
    public static boolean validarNacimiento(String nacimiento){
        if (nacimiento.length() != 10 || nacimiento.charAt(2) != '/' || nacimiento.charAt(5) != '/'){               
            JOptionPane.showMessageDialog(null, "El formato de la fecha de nacimiento debe ser dd/mm/aaaa", "Fecha de Nacimiento Incorrecta", JOptionPane.WARNING_MESSAGE);
            return false;
        }
        for (int i = 0; i < nacimiento.length(); i++){
            if ((int)nacimiento.charAt(i) < 48 || (int)nacimiento.charAt(i) > 57){
                JOptionPane.showMessageDialog(null, "El formato de la fecha de nacimiento debe ser dd/mm/aaaa", "Fecha de Nacimiento Incorrecta", JOptionPane.WARNING_MESSAGE);
                return false;
            }
            if (i == 1 || i == 4){
                i++;
            }
        }
        if (Integer.parseInt(nacimiento.substring(0, 2)) < 1 || Integer.parseInt(nacimiento.substring(0, 2)) > 31){
            JOptionPane.showMessageDialog(null, "El día debe ser menor a 32 y mayor que 0", "Fecha de Nacimiento Incorrecta", JOptionPane.WARNING_MESSAGE);
            return false;
        }
        if (Integer.parseInt(nacimiento.substring(3, 5)) < 1 || Integer.parseInt(nacimiento.substring(3, 5)) > 12){
            JOptionPane.showMessageDialog(null, "El mes debe ser menor a 13 y mayor que 0", "Fecha de Nacimiento Incorrecta", JOptionPane.WARNING_MESSAGE);
            return false;
        }
        if (Integer.parseInt(nacimiento.substring(6, 10)) < 1901 || Integer.parseInt(nacimiento.substring(6, 10)) > 2000){
            JOptionPane.showMessageDialog(null, "El año debe ser menor a 2001 y mayor que 1900", "Fecha de Nacimiento Incorrecta", JOptionPane.WARNING_MESSAGE);
            return false;
        }
        return true;
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

    public static Date formatoFecha(String fecha){
        Date nuevaFecha = new Date(Integer.parseInt(fecha.substring(6, 10)),
                Integer.parseInt(fecha.substring(3, 5)),
                Integer.parseInt(fecha.substring(0, 2)));
        return nuevaFecha;
    }
}