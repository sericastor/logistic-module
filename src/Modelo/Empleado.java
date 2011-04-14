/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Modelo;


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
    private String telefono;
    private String documento;
    private String fechaNacimiento;
    private String tipo;


    public Empleado(String nombre, String apellido, String usuario, String contrasena,
            String direccion, String telefono, String documento, String fechaNacimiento, String tipo) {
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

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
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

    public String getDocumento() {
        return documento;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getFechaNacimiento() {
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
