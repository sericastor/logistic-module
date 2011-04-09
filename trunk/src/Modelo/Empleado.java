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

    public String getApellido_empleado() {
        return apellido_empleado;
    }

    public void setApellido_empleado(String apellido_empleado) {
        this.apellido_empleado = apellido_empleado;
    }

    public String getFnacimiento_empleado() {
        return fnacimiento_empleado;
    }

    public void setFnacimiento_empleado(String fnacimiento_empleado) {
        this.fnacimiento_empleado = fnacimiento_empleado;
    }

    public String getNombre_empleado() {
        return nombre_empleado;
    }

    public void setNombre_empleado(String nombre_empleado) {
        this.nombre_empleado = nombre_empleado;
    }

    public String getPassword_empleado() {
        return password_empleado;
    }

    public void setPassword_empleado(String password_empleado) {
        this.password_empleado = password_empleado;
    }

    public String getTipo_empleado() {
        return tipo_empleado;
    }

    public void setTipo_empleado(String tipo_empleado) {
        this.tipo_empleado = tipo_empleado;
    }

    public String getUsuario_empleado() {
        return usuario_empleado;
    }

    public void setUsuario_empleado(String usuario_empleado) {
        this.usuario_empleado = usuario_empleado;
    }

    private String nombre_empleado;
    private String apellido_empleado;
    private String usuario_empleado;
    private String password_empleado;
    private String tipo_empleado;
    private String fnacimiento_empleado;


}
