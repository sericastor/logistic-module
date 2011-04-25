/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Controlador;

import Modelo.Factura;
import Modelo.Producto;
import Modelo.Sistema;
import Modelo.Proveedor;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;

/**
 *
 * @author USUARIO
 */
public class CComprar {

    public CComprar() {

    }
    public void definirCantidad(int index, int cantidad){
        
    }
    public boolean validarFactura(Factura factura){
        if(validarProveedor(factura.getProveedor()) && validarNumero(factura.getNumero()) && validarFecha(factura.getFecha())){
            return true;
            }
    return false;
    }

    public boolean validarProveedor(Proveedor proveedor){
        if(validarIdProv(proveedor.getId()) && validarDirProv(proveedor.getDireccion()) && validarTelProv(proveedor.getTelefono()) && validarNomProv(proveedor.getNombre())){
            return true;

                }
        return false;

  }

  public boolean validarProv(int id, String direccion, String nombre, long telefono){
        if(validarIdProv(id) && validarDirProv(direccion) && validarTelProv(telefono) && validarNomProv(nombre)){
            return true;
            }
        return false;

  }

  public boolean validarTablaVacia(JTable tabla){
      for(int i = 0;i == tabla.getRowCount(); i++){
          for(int j=0; j == 5; j++){
              if(tabla.getValueAt(i, j)==null){
                JOptionPane.showMessageDialog(null, "La tabla está vacía", "Error", JOptionPane.WARNING_MESSAGE);
                return true;
              }
          }
      }
      return false;
  }
    public static boolean validarNomProv(String nombre){
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



   public boolean validarDirProv(String direccion){
        if (direccion.length() > 49 || direccion.length() < 1){
            JOptionPane.showMessageDialog(null, "La dirección debe ser de longitud mínimo 1, máximo 49 caracteres", "Dirección Incorrecto", JOptionPane.WARNING_MESSAGE);
            return false;
        }
        return true;
    }

   public boolean validarTelProv(Long telefono){
       if (telefono<1000000 || telefono>1000000000){
           JOptionPane.showMessageDialog(null, "El teléfono debe tomar valores entra 1000000 y 1000000000", "Teléfono Incorrecto", JOptionPane.WARNING_MESSAGE);
           return false;
       }
       return true;
   }

    public boolean validarIdProv(Integer numero){
        if(numero<0){
                JOptionPane.showMessageDialog(null, "El Id debe ser mayor a 0", "Id Incorrecto", JOptionPane.WARNING_MESSAGE);
                return (false);
        }
        return true;
    }

    public boolean validarNumero(Integer numero){
        if(numero<1){
                JOptionPane.showMessageDialog(null, "El número de la factura debe ser mayor a 0", "Número Incorrecto", JOptionPane.WARNING_MESSAGE);
                return (false);
        }
        return true;
    }
public static boolean validarFecha(String fecha){
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
            if(tabla.getValueAt(i, 5)==null){}
            else{
            Object valor = tabla.getValueAt(i, 5);
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

    
    public Producto buscarProductoAlmacenado(String nombre, String marca){
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

    public ArrayList<Producto> buscarProductosPorMarca(String marca){
        ArrayList<Producto> encontrados = new ArrayList<Producto>();
        for(Producto p: Sistema.getProductos()){
            if(p.getMarca().equals(marca) && p.getEstado().equals("Almacenado")){
                //p.setCantidad(cantidad);
                encontrados.add(p);
            }
        }
        return encontrados;
    }

    public ArrayList<Producto> buscarProductosPorNombre(String nombre){
        ArrayList<Producto> encontrados = new ArrayList<Producto>();
        for(Producto p: Sistema.getProductos()){
            if(p.getNombre().equals(nombre) && p.getEstado().equals("Almacenado")){
                //p.setCantidad(cantidad);
                encontrados.add(p);
            }
        }
        return encontrados;
    }
    public void agregarCantidadProducto(String nombre, String marca, int cantidad){
        
        for(Producto p: Sistema.getProductos()){
            if(p.getNombre().equals(nombre) && p.getMarca().equals(marca) && p.getEstado().equals("Almacenado")){
                p.setCantidad(p.getCantidad()+cantidad);
                break;
            }
        }

    }
    public ArrayList<Factura> getFacturas(){
        return Sistema.getFacturas();
    }
    public Producto verProductos(int i){
        return Sistema.getProductos().get(i);
    }

    public double ObtenerTotal(double precio, double iva){
        return precio + iva;
    }
    public Factura agregarProductoEnFactura(Producto nuevo, Factura fact){
        Producto agregar = new Producto();
        agregar.setCantidad(nuevo.getCantidad());
        agregar.setEstado(nuevo.getEstado());
        agregar.setId(nuevo.getId());
        agregar.setIva(nuevo.getIva());
        agregar.setMarca(nuevo.getMarca());
        agregar.setNombre(nuevo.getNombre());
        agregar.setPrecioCosto(nuevo.getPrecioCosto());
        //System.out.println(nuevo.getPrecioCosto());
        agregar.setPrecioVenta(nuevo.getPrecioVenta());
        fact.getProductosFactura().add(agregar);
        return fact;
        
    }
    public void agregarFacturaEnSistema(Factura factura){
        Sistema.getFacturas().add(factura);
        for(int i=0;i<Sistema.getFacturas().size();i++){
            System.out.println(Sistema.getFacturas().get(i).getFecha());
        }
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

    private Factura factura = new Factura();
    }



