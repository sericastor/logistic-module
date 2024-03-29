/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Modelo;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 *
 * @author r4wd3r
 */
@Entity
public class Lugar implements Serializable {
    private String nombre;
    private String direccion;
    private long telefono;
    private String tipo;
    @Id
    private int id;
    @OneToMany(mappedBy="origen")
    private Orden orden1;
    @OneToMany(mappedBy="destino")
    private Orden orden2;

    public Lugar(String nombre, String direccion, long telefono, String tipo, int id) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.tipo = tipo;
        this.id = id;
    }

    public Lugar() {}

    public String getDireccion() {
        return direccion;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public long getTelefono() {
        return telefono;
    }

    public String getTipo() {
        return tipo;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
}