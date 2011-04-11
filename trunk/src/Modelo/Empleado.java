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
    private String password;
    private String tipo;
    private String fechaNacimiento;

    public Empleado (String nombre, String apellido, String usuario, String password,String tipo, String fechaNacimiento){
        this.nombre = nombre;
        this.apellido = apellido;
        this.usuario= usuario;
        this.password= password;
        this.tipo = tipo;
        this.fechaNacimiento = fechaNacimiento;
    }
    
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPassword(String password) {
        this.password = password;
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

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPassword() {
        return password;
    }

    public String getTipo() {
        return tipo;
    }

    public String getUsuario() {
        return usuario;
    }
}
