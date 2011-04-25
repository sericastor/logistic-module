/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Controlador;

import Modelo.Factura;
import Modelo.Lugar;
import Modelo.Orden;
import Modelo.Producto;
import Modelo.Sistema;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;

/**
 *
 * @author USUARIO
 */
public class CGenerarTraslado {

    public CGenerarTraslado(){}

  public boolean validarTablaVacia(JTable tabla){
      for(int i = 0;i <= tabla.getRowCount(); i++){
          for(int j=0; j <= 5; j++){
              if(j==1){return false;}
              if(tabla.getValueAt(i, j)==null){
                JOptionPane.showMessageDialog(null, "La tabla está vacía", "Error", JOptionPane.WARNING_MESSAGE);
                return true;
              }
          }
      }
      return false;
  }

public boolean validarFecha(String fecha){
        if (fecha.length() != 10 || fecha.charAt(2) != '/' || fecha.charAt(5) != '/'){
            JOptionPane.showMessageDialog(null, "El formato de la fecha de nacimiento debe ser dd/mm/aaaa", "Fecha de Nacimiento Incorrecta", JOptionPane.WARNING_MESSAGE);
            return false;
        }
        for (int i = 0; i < fecha.length(); i++){
            if ((int)fecha.charAt(i) < 48 || (int)fecha.charAt(i) > 57){
                JOptionPane.showMessageDialog(null, "El formato de la fecha de nacimiento debe ser dd/mm/aaaa", "Fecha de Nacimiento Incorrecta", JOptionPane.WARNING_MESSAGE);
                return false;
            }
            if (i == 1 || i == 4){
                i++;
            }
        }
        if(Long.parseLong(fecha.substring(3,5))==4 || Long.parseLong(fecha.substring(3,5))==6 || Long.parseLong(fecha.substring(3,5))==9 || Long.parseLong(fecha.substring(3,5))==11){
            if (Long.parseLong(fecha.substring(0, 2)) < 1 || Long.parseLong(fecha.substring(0, 2)) > 30){
                JOptionPane.showMessageDialog(null, "El día debe ser menor a 31 y mayor que 0", "Fecha de Nacimiento Incorrecta", JOptionPane.WARNING_MESSAGE);
                return false;
            }
        }else{
                if(Long.parseLong(fecha.substring(3,5))==2){
                    if (Long.parseLong(fecha.substring(0, 2)) < 1 || Long.parseLong(fecha.substring(0, 2)) > 28){
                    JOptionPane.showMessageDialog(null, "El día debe ser menor a 29 y mayor que 0", "Fecha de Nacimiento Incorrecta", JOptionPane.WARNING_MESSAGE);
                    return false;
                }
                }else{
                    if (Long.parseLong(fecha.substring(0, 2)) < 1 || Long.parseLong(fecha.substring(0, 2)) > 31){
                    JOptionPane.showMessageDialog(null, "El día debe ser menor a 32 y mayor que 0", "Fecha de Nacimiento Incorrecta", JOptionPane.WARNING_MESSAGE);
                    return false;
                    }
            }
        }
        return true;
}

    public void definirCantidad(int index, int cantidad){

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
    public double obtenerTotal(JTable tabla){
        int j = tabla.getRowCount();
        double suma = 0;
        for(int i = 0; i<j; i++){
            if(tabla.getValueAt(i, 4)==null){}
            else{
            Object valor = tabla.getValueAt(i, 4);
            suma=suma+Double.valueOf(valor.toString());}
        }
        return suma;
    }
    public double obtenerTotalIva(JTable tabla){
        int j = tabla.getRowCount();
        double suma = 0;
        for(int i = 0; i<j; i++){
            if(tabla.getValueAt(i, 4)==null){}
            else{
            Object valor = tabla.getValueAt(i, 4);
            suma=suma+Double.valueOf(valor.toString());}
        }
        return suma;
    }

    public int generarIDTraslado(){
        return Sistema.getOrdenes().size()+1;
    }

    public int verificarIDTraslado(){
        return this.generarIDTraslado();
    }

    public Producto buscarProducto(String nombre, String marca){
        Producto encontrado = new Producto();
        for(Producto p: Sistema.getProductos()){
            if(p.getNombre().equals(nombre) && p.getMarca().equals(marca) && p.getEstado().equals("Almacenado")){
                //p.setCantidad(cantidad);
                encontrado = p;
                break;
            }
        }
        return encontrado;
    }
   public boolean agregarCantidadProductoTransito(String nombre, String marca, int cant){
       boolean ok = true, exist=false;
       Producto productoAlmacenado = new Producto();
       for (Producto p:Sistema.getProductos()){
            if(p.getNombre().equals(nombre) && p.getMarca().equals(marca) && p.getEstado().equals("Almacenado")){
                productoAlmacenado = p;
            }
            if(p.getNombre().equals(nombre) && p.getMarca().equals(marca) && p.getEstado().equals("Bloqueado")){
                exist = true;
            }
       }
       if (exist==false){
            Producto producto = new Producto();
            producto.setNombre(nombre);
            producto.setMarca(marca);
            producto.setCantidad(0);
            producto.setEstado("Bloqueado");
            producto.setId(CAdministrarProducto.generarID());
            producto.setPrecioCosto(productoAlmacenado.getPrecioCosto());
            producto.setPrecioVenta(productoAlmacenado.getPrecioVenta());
            producto.setIva(productoAlmacenado.getIva());
            CAdministrarProducto.crearProducto(producto);            
       }
       ok = verificarCantidad(nombre,marca,cant);
       if (ok){
            for (Producto p:Sistema.getProductos()){
                if(p.getNombre().equals(nombre) && p.getMarca().equals(marca) && p.getEstado().equals("Almacenado")){
                   p.setCantidad(p.getCantidad()-cant);
                }
                else if(p.getNombre().equals(nombre) && p.getMarca().equals(marca) && p.getEstado().equals("Bloqueado")){
                    if(exist == true){
                        p.setCantidad(p.getCantidad()+cant);
                    }
                    else{
                        p.setCantidad(cant);
                    }
                }
            }
       }
       return ok;
    }
    public boolean verificarCantidad(String nombre, String marca, int cantidad){
        
        for(Producto p: Sistema.getProductos()){
            if(p.getNombre().equals(nombre) && p.getMarca().equals(marca) && p.getEstado().equals("Almacenado")){
                if((p.getCantidad()-cantidad)<0){
                    return false;
                }
                else{
                    return true;
                }
            }
        }
        return true;
    }

    public ArrayList<Factura> getFacturas(){
        return Sistema.getFacturas();
    }
    public Producto verProductos(int i){
        return Sistema.getProductos().get(i);
    }

    public void agregarOrdenes(Orden o){
        Sistema.getOrdenes().add(o);
    }

    public double obtenerTotalOrden(JTable tabla){
        double tot=0;
        for (int i =0;i<tabla.getRowCount();i++){
            if(tabla.getValueAt(i, 0)==null){}
            else{
                tot = tot + Double.valueOf(tabla.getValueAt(i, 4).toString());
            }
        }
        System.out.println(tot);
        return tot;
    }


    public double ObtenerTotal(double precio, double iva){
        return precio + iva;
    }
    public void agregarProductoEnFactura(Producto nuevo){
        factura.getProductosFactura().add(nuevo);
    }
    public void agregarFacturaEnSistema(Factura factura){
        Sistema.getFacturas().add(factura);
    }
    public Factura getFactura(){
        return factura;
    }
    public int getSizeProductos(){
        return Sistema.getProductos().size();
    }
    public double generarIVA(double precioDeCosto, int cantidad){
        return (precioDeCosto*16/100)*cantidad;
    }
    public Orden crearOrden(String fuenteTraslado, String destinoTraslado, int IDTraslado){
        Orden orden = new Orden();
        Lugar fuente = new Lugar();
        Lugar destino = new Lugar();
        fuente.setNombre(fuenteTraslado);
        destino.setNombre(destinoTraslado);
        orden.setId_orden(IDTraslado);
        orden.setDestino(destino);
        orden.setOrigen(fuente);

        return orden;
    }

    private Factura factura = new Factura();
    private Producto almacenado = new Producto();

}
