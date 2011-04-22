/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Modelo;

import java.util.Date;


/**
 *
 * @author r4wd3r
 */
public class Empleado {
    private String nombre;
    private String apellido;
    private String usuario;
    private String contrasena;
    private String direccion;
    private int telefono;
    private int documento;
    private Date fechaNacimiento;
    private String tipo;


    public Empleado(String nombre, String apellido, String usuario, String contrasena,
            String direccion, int telefono, int documento, Date fechaNacimiento, String tipo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.usuario = usuario;
        this.contrasena = contrasena;
        this.direccion = direccion;
        this.telefono = telefono;
        this.documento = documento;
        this.fechaNacimiento = fechaNacimiento;
        this.tipo = tipo;
    }
    
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setContrasena(String password) {
        this.contrasena = password;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getApellido() {
        return apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public int getDocumento() {
        return documento;
    }

    public int getTelefono() {
        return telefono;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public String getContrasena() {
        return contrasena;
    }

    public String getTipo() {
        return tipo;
    }

    public String getUsuario() {
        return usuario;
    }
}
