package Vista;

import Controlador.CGenerarTraslado;
import Modelo.Lugar;
import Modelo.Orden;
import Modelo.Producto;
import Modelo.Sistema;
import java.lang.String;
import java.util.ArrayList;
import javax.swing.DefaultCellEditor;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableColumn;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * OrdendeTraslado.java
 *
 * Created on 8/04/2011, 10:39:00 AM
 */

/**
 *
 * @author USUARIO
 */
public class OrdendeTraslado extends javax.swing.JFrame implements TableModelListener {


    /** Creates new form OrdendeTraslado */
    public OrdendeTraslado() {

        initComponents();
        IDTraslado.setEditable(false);
        this.setID(admin.generarIDTraslado());
        //Nombre de Producto se selecciona de la lista de productos creados
        TableColumn nombreProd = ListaTraslado.getColumnModel().getColumn(1);
        TableColumn marcaProd = ListaTraslado.getColumnModel().getColumn(2);
        ListaTraslado.getModel().addTableModelListener(this);

        JComboBox listaNombrep = new JComboBox();
        JComboBox listaMarcap = new JComboBox();
        String[] nombrep = null;
        String[] marcap = null;
        int almacenados =0;
        for(Producto p:Sistema.getProductos()){
            if(p.getEstado().equals("Almacenado")){
            almacenados = almacenados +1;
            }
        }
        nombrep = new String[almacenados];
        marcap = new String[Sistema.getProductos().size()];
        int i = 0;
        for (Producto p:Sistema.getProductos()){
            if(p.getEstado().equals("Almacenado")){
                nombrep[i] = p.getNombre();
                marcap[i]= p.getMarca();
                i++;
            }

        }

        //productos.setModel(new javax.swing.DefaultComboBoxModel(new String[] { nombres.toString() }));
        listaNombrep.setModel(new javax.swing.DefaultComboBoxModel(nombrep));
        nombreProd.setCellEditor(new DefaultCellEditor(listaNombrep));
        listaMarcap.setModel(new javax.swing.DefaultComboBoxModel(marcap));
        marcaProd.setCellEditor(new DefaultCellEditor(listaMarcap));
    }
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Adm_Pro = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        MontoTraslado = new javax.swing.JTextField();
        MenuPrincipal = new javax.swing.JButton();
        GuardarTraslado = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        FuenteTraslado = new javax.swing.JFormattedTextField();
        DestinoTraslado = new javax.swing.JFormattedTextField();
        jLabel11 = new javax.swing.JLabel();
        FechaTraslado = new javax.swing.JFormattedTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        ListaTraslado = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        IDTraslado = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Adm_Pro.setBackground(new java.awt.Color(0, 0, 0));
        Adm_Pro.setForeground(new java.awt.Color(255, 255, 255));

        jLabel8.setBackground(new java.awt.Color(0, 0, 0));
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Fecha");

        MenuPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        MenuPrincipal.setText("Cerrar esta ventana");
        MenuPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuPrincipalActionPerformed(evt);
            }
        });

        GuardarTraslado.setBackground(new java.awt.Color(255, 255, 255));
        GuardarTraslado.setText("Guardar");
        GuardarTraslado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarTrasladoActionPerformed(evt);
            }
        });

        jLabel9.setBackground(new java.awt.Color(0, 0, 0));
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Destino");

        jLabel10.setBackground(new java.awt.Color(0, 0, 0));
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Fuente");

        FuenteTraslado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FuenteTrasladoActionPerformed(evt);
            }
        });

        DestinoTraslado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DestinoTrasladoActionPerformed(evt);
            }
        });

        jLabel11.setBackground(new java.awt.Color(0, 0, 0));
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Total");

        FechaTraslado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FechaTrasladoActionPerformed(evt);
            }
        });

        ListaTraslado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Cantidad", "Nombre del producto", "Marca del producto", "Costo unitario", "Costo total"
            }
        ));
        jScrollPane1.setViewportView(ListaTraslado);

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Ingresar Fila");

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Eliminar Fila");

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ID");

        javax.swing.GroupLayout Adm_ProLayout = new javax.swing.GroupLayout(Adm_Pro);
        Adm_Pro.setLayout(Adm_ProLayout);
        Adm_ProLayout.setHorizontalGroup(
            Adm_ProLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Adm_ProLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Adm_ProLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Adm_ProLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(IDTraslado, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(FechaTraslado, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel10)
                        .addGap(18, 18, 18)
                        .addComponent(FuenteTraslado, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel9)
                        .addGap(18, 18, 18)
                        .addComponent(DestinoTraslado, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 642, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Adm_ProLayout.createSequentialGroup()
                        .addGroup(Adm_ProLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jButton2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(Adm_ProLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(GuardarTraslado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(MenuPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(63, 63, 63)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(MontoTraslado, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)))
                .addGap(18, 18, 18))
        );
        Adm_ProLayout.setVerticalGroup(
            Adm_ProLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Adm_ProLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(Adm_ProLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DestinoTraslado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(FuenteTraslado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(FechaTraslado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel1)
                    .addComponent(IDTraslado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(Adm_ProLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Adm_ProLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(Adm_ProLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(MontoTraslado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(Adm_ProLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(Adm_ProLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(MenuPrincipal)
                            .addComponent(jButton1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(Adm_ProLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(GuardarTraslado)
                            .addComponent(jButton2))))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Adm_Pro, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Adm_Pro, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void GuardarTrasladoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarTrasladoActionPerformed
        // TODO add your handling code here:
        ArrayList<Producto> productos = new ArrayList<Producto>();
        boolean ok = true;
        Orden orden = new Orden();
        Lugar origen = new Lugar();
        Lugar destino = new Lugar();
        if(FechaTraslado.getText().equals("")){
            JOptionPane.showMessageDialog(null, "El campo Fecha esta vacio", "Atencion", JOptionPane.WARNING_MESSAGE);
        }
        else if(FuenteTraslado.getText().equals("")){
            JOptionPane.showMessageDialog(null, "El campo Fuente esta vacio", "Atencion", JOptionPane.WARNING_MESSAGE);
        }
        else if(DestinoTraslado.getText().equals("")){
            JOptionPane.showMessageDialog(null, "El campo Destino esta vacio", "Atencion", JOptionPane.WARNING_MESSAGE);
        }
        else{
            Producto producto = new Producto();
            origen.setNombre(FuenteTraslado.getText());
            destino.setNombre(DestinoTraslado.getText());
            for(int i=0; i<ListaTraslado.getRowCount();i++){
                if(ListaTraslado.getValueAt(i, 0)==null && ListaTraslado.getValueAt(i, 1)==null && ListaTraslado.getValueAt(i, 2)==null){}
                else{
                    producto.setNombre(ListaTraslado.getValueAt(i, 1).toString());
                    producto.setMarca(ListaTraslado.getValueAt(i,2).toString());
                    producto.setCantidad(Integer.parseInt(ListaTraslado.getValueAt(i,0).toString()));
                    ok = administrador.agregarCantidadProductoTransito(producto.getNombre(), producto.getMarca(), producto.getCantidad());
                }
                if(ok == false){
                    break;
                }
                else{
                    for(Producto p:Sistema.getProductos()){
                        if(p.getNombre().equals(producto.getNombre()) && p.getMarca().equals(producto.getMarca()) && p.getEstado().equals("Bloqueado")){
                            productos.add(p);
                        }
                    }
               }
            }
            if (ok){
                    orden.setProductos_traslado(productos);
                    orden.setOrigen(origen);
                    orden.setDestino(destino);
                    orden.setFecha(null);
                    orden.setId_orden(Integer.parseInt(IDTraslado.getText()));
                    orden.setTotal_traslado(administrador.obtenerTotalOrden(ListaTraslado));
                    administrador.agregarOrdenes(orden);
                    JOptionPane.showMessageDialog(null, "Se ha creado la orden de traslado","Creación de Orden de Traslado",JOptionPane.INFORMATION_MESSAGE);
                    for(int i=0;i<ListaTraslado.getRowCount();i++){
                        for(int j=0;j<ListaTraslado.getColumnCount();j++){
                            ListaTraslado.setValueAt(null, i, j);
                        }
                    }
                    IDTraslado.setText(String.valueOf(admin.generarIDTraslado()));
                    FuenteTraslado.setText("");
                    DestinoTraslado.setText("");
                    FechaTraslado.setText("");

            }
            else{
                JOptionPane.showMessageDialog(null, "La cantidad de productos que se desea transportar, excede la cantidad de productos almacenados","Error",JOptionPane.WARNING_MESSAGE);
                productos.removeAll(productos);
            }
        }

}//GEN-LAST:event_GuardarTrasladoActionPerformed
    
    
    public void setID(int id){
        this.IDTraslado.setText(String.valueOf(id));
    }
    private void FuenteTrasladoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FuenteTrasladoActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_FuenteTrasladoActionPerformed

    private void DestinoTrasladoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DestinoTrasladoActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_DestinoTrasladoActionPerformed

    private void MenuPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuPrincipalActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_MenuPrincipalActionPerformed

    private void FechaTrasladoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FechaTrasladoActionPerformed

    }//GEN-LAST:event_FechaTrasladoActionPerformed
    public void tableChanged(TableModelEvent e) {
        int fila = e.getFirstRow();
        int columna = e.getColumn();

        if(ListaTraslado.getValueAt(fila, 1)==null || ListaTraslado.getValueAt(fila, 2)==null || ListaTraslado.getValueAt(fila, 0) == null){

        }
        else{
            String nombre = (String) ListaTraslado.getValueAt(fila, 1);
            String marca = (String) ListaTraslado.getValueAt(fila, 2);
            Object cant = ListaTraslado.getValueAt(fila, 0);
            int c = Integer.parseInt(cant.toString());
            
            //System.out.println(nombre+" - "+marca+" - "+c);
            encontrado = administrador.buscarProducto(nombre, marca);
            double precioCosto = encontrado.getPrecioCosto();
            double iva = administrador.generarIVA(precioCosto, c);
            double costoTotal = administrador.obtenerCostoTotal(c,precioCosto);
            if(!(nombreActual.equals(nombre)) || !(marcaActual.equals(marca)) || costoActual != c){
                nombreActual = nombre;
                marcaActual = marca;
                costoActual = c;
                ListaTraslado.setValueAt(encontrado.getPrecioCosto(), fila, 3);
                ListaTraslado.setValueAt(administrador.obtenerCostoTotal(c, encontrado.getPrecioCosto()), fila, 4);
                MontoTraslado.setText(String.valueOf(administrador.obtenerTotal(ListaTraslado)));
            }

        }
        
    }
    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OrdendeTraslado().setVisible(true);
            }
        });
    }
    private int cantidad;
    private int costoActual = 0;
    private String nombreActual = "";
    private String marcaActual = "";
    private CGenerarTraslado administrador = new CGenerarTraslado();
    private Producto encontrado = new Producto();
    private CGenerarTraslado admin = new CGenerarTraslado();
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Adm_Pro;
    private javax.swing.JFormattedTextField DestinoTraslado;
    private javax.swing.JFormattedTextField FechaTraslado;
    private javax.swing.JFormattedTextField FuenteTraslado;
    private javax.swing.JButton GuardarTraslado;
    private javax.swing.JTextField IDTraslado;
    private javax.swing.JTable ListaTraslado;
    private javax.swing.JButton MenuPrincipal;
    private javax.swing.JTextField MontoTraslado;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables



}
