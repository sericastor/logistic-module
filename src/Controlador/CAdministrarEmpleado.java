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
        Sistema.getEmpleados().add(empleado);
        return true;
    }

    private static boolean validarDatos(String nombre, String apellido, String usuario, String contrasena,
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
                                if(base.getDocumento() == empleados.get(i).getDocumento() || base.getDocumento() == 0){
                                    if(base.getDireccion().equals(empleados.get(i).getDireccion()) || base.getDireccion().equals("")){
                                        if(base.getFechaNacimiento() == (empleados.get(i).getFechaNacimiento())
                                                || base.getFechaNacimiento() == null){
                                            if(base.getTelefono() == empleados.get(i).getTelefono()
                                                    || base.getTelefono() == 0){
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
    public static boolean validarNombre(String nombre){        
        for (int i = 0; i < nombre.length(); i++){
            System.out.println((int)nombre.charAt(i));
            if (((int)nombre.charAt(i) < 65 && (int)nombre.charAt(i) != 32) ||
                    ((int)nombre.charAt(i) > 90 && (int)nombre.charAt(i) < 97) ||
                    (int)nombre.charAt(i) > 122){
                JOptionPane.showMessageDialog(null, "El nombre sólo puede tener letras", "Nombre Incorrecto", JOptionPane.WARNING_MESSAGE);
                return false;
            }
        }
        if (nombre.length() > 29 || nombre.length() < 2){
            JOptionPane.showMessageDialog(null, "El nombre debe ser de longitud mínimo 2, máximo 29 caracteres", "Nombre Incorrecto", JOptionPane.WARNING_MESSAGE);
            return false;
        }
        return true;
    }
    public static boolean validarApellido(String apellido){
        for (int i = 0; i < apellido.length(); i++){
            System.out.println((int)apellido.charAt(i));
            if (((int)apellido.charAt(i) < 65 && (int)apellido.charAt(i) != 32) ||
                    ((int)apellido.charAt(i) > 90 && (int)apellido.charAt(i) < 97) ||
                    (int)apellido.charAt(i) > 122){
                JOptionPane.showMessageDialog(null, "El apellido sólo puede tener letras", "Apellido Incorrecto", JOptionPane.WARNING_MESSAGE);
                return false;
            }
        }
        if (apellido.length() > 29 || apellido.length() < 2){
            JOptionPane.showMessageDialog(null, "El apellido debe ser de longitud mínimo 2, máximo 29 caracteres", "Apellido Incorrecto", JOptionPane.WARNING_MESSAGE);
            return false;
        }
        return true;
    }
    public static boolean validarUsuario(String usuario){
        for (int i = 0; i < usuario.length(); i++){
            if (((int)usuario.charAt(i) < 48 ) ||
                    ((int)usuario.charAt(i) > 57 && (int)usuario.charAt(i) < 65) ||
                    ((int)usuario.charAt(i) > 90 && (int)usuario.charAt(i) < 97) ||
                    (int)usuario.charAt(i) > 122){
                JOptionPane.showMessageDialog(null, "El usuario sólo puede tener caracteres alfanuméricos", "Usuario Incorrecto", JOptionPane.WARNING_MESSAGE);
                return false;
            }
        }
        if (usuario.length() > 14 || usuario.length() < 7){
            JOptionPane.showMessageDialog(null, "El usuario debe ser de longitud mínimo 7, máximo 14 caracteres", "Usuario Incorrecto", JOptionPane.WARNING_MESSAGE);
            return false;
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
        if (telefono.length() < 1000000 && telefono.length() > 1111111110){
            JOptionPane.showMessageDialog(null, "El teléfono debe ser numérico y menor que 1111111111", "Teléfono Incorrecto", JOptionPane.WARNING_MESSAGE);
            return false;
        }
        try{
            Integer.parseInt(telefono);
        }
        catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "El teléfono debe ser numérico y menor que 1111111111", "Teléfono Incorrecto", JOptionPane.WARNING_MESSAGE);
            return false;
        }
        return true;
    }
    public static boolean validarDocumento(String documento){
        if (documento.length() < 1000000 && documento.length() > 1111111110){
            JOptionPane.showMessageDialog(null, "El documento debe ser numérico, mayor que 1000000 y menor que 1111111111", "Documento Incorrecto", JOptionPane.WARNING_MESSAGE);
            return false;
        }
        try{
            Integer.parseInt(documento);
        }
        catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "El documento debe ser numérico, /n mayor que 1000000 y menor que 1111111111", "Documento Incorrecto", JOptionPane.WARNING_MESSAGE);
            return false;
        }
        return true;
    }
    public static boolean validarNacimiento(String nacimiento){
        if (nacimiento.length() != 10 || nacimiento.charAt(2) != '/' || nacimiento.charAt(5) != '/'){
            JOptionPane.showMessageDialog(null, "El formato de la fecha de nacimiento debe ser dd/mm/aaaa", "Fecha de Nacimiento Incorrecta", JOptionPane.WARNING_MESSAGE);
            return false;
        }
        try{
            Integer.parseInt(nacimiento.substring(0, 2));
            Integer.parseInt(nacimiento.substring(3, 5));
            Integer.parseInt(nacimiento.substring(6, 10));
        }
        catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "El formato de la fecha de nacimiento debe ser dd/mm/aaaa", "Fecha de Nacimiento Incorrecta", JOptionPane.WARNING_MESSAGE);
            return false;
        }
        return true;
    }

    private static String formatoNombre(String nombre) {
        System.out.println("Nombre: " + nombre);
        String nuevoNombre = "";
        int i = 0;
        while (nombre.substring(i, i+1).equals(" ")){
            i++;
        }       
        while (i < nombre.length()){
            nuevoNombre = nuevoNombre + nombre.substring(i, i+1).toUpperCase();
            System.out.println("Mayúscula: " + nombre.substring(i, i+1));
            i++;
            while (i < nombre.length() && (int)nombre.charAt(i) != 32){
                nuevoNombre = nuevoNombre + nombre.substring(i, i+1).toLowerCase();
                System.out.println("Minúscula: " + nombre.substring(i, i+1));
                i++;
            }
            nuevoNombre = nuevoNombre + " ";
            i++;
        }
        return nuevoNombre;
    }

    private static Date formatoFecha(String fecha){
        Date nuevaFecha = new Date(Integer.parseInt(fecha.substring(0, 2)),
                Integer.parseInt(fecha.substring(3, 5)),
                Integer.parseInt(fecha.substring(6, 10)));
        return nuevaFecha;
    }



}