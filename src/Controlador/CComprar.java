/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Controlador;

import Modelo.Sistema;
import javax.swing.JTable;

/**
 *
 * @author USUARIO
 */
public class CComprar {

    public CComprar() {

    }
    public void definirCantidad(int index, int cantidad){
        return ;
    }
    public double obtenerCosto(int index){
        return Sistema.getProductos().get(index).getPrecioCosto();
    }

    public double obtenerIva(double costo){
        return costo*0.16;
    }
    public double obtenerCostoTotal(int cantidad, double costo){
        return cantidad*costo;
    }
    public double obtenerTotalParcial(JTable tabla){
        int j = tabla.getRowCount();
        double suma = 0;
        for(int i = 0; i<j; i++){
            Object valor = tabla.getValueAt(i, 5);
            suma=suma+Double.valueOf(valor.toString());
        }
        return suma;
    }

    public double obtenerTotalIva(JTable tabla){
        int j = tabla.getRowCount();
        double suma = 0;
        for(int i = 0; i<j; i++){
            Object valor = tabla.getValueAt(i, 4);
            suma=suma+Double.valueOf(valor.toString());
        }
        return suma;
    }

    public double ObtenerTotal(double costo, double iva){
        return costo+iva;
    }


}
