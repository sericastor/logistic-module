package Vista;

import Controlador.CAdministrarProducto;
import Modelo.Producto;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * ActualizarProducto.java
 *
 * Created on 8/04/2011, 11:39:20 AM
 */

/**
 *
 * @author USUARIO
 */
public class ActualizarProducto extends javax.swing.JPanel {

    /** Creates new form ActualizarProducto */
    public ActualizarProducto() {
        initComponents();
        idTF2.setEditable(false);
        precioRes.setEditable(false);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaPro = new javax.swing.JList();
        jLabel13 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        idTF = new javax.swing.JTextField();
        nombreTF = new javax.swing.JTextField();
        costoTF = new javax.swing.JTextField();
        estadoTF = new javax.swing.JComboBox();
        precioTF = new javax.swing.JTextField();
        marcaTF = new javax.swing.JTextField();
        consultarB = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        idTF2 = new javax.swing.JTextField();
        nombreRes = new javax.swing.JTextField();
        costoRes = new javax.swing.JTextField();
        estadoCB = new javax.swing.JComboBox();
        precioRes = new javax.swing.JTextField();
        marcaRes = new javax.swing.JTextField();
        guardarB = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel12.setText("Resultado de la búsqueda :");

        listaPro.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        listaPro.setSelectionBackground(new java.awt.Color(255, 0, 0));
        listaPro.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listaProValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(listaPro);

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel13.setText("Características del producto:");

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(305, 177));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ID");

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nombre");

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Estado");

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Precio de costo");

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Precio de venta");

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Marca");

        estadoTF.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Almacenado", "Bloqueado", "En tránsito", "Perdido", "Descontinuado" }));

        consultarB.setBackground(new java.awt.Color(255, 255, 255));
        consultarB.setForeground(new java.awt.Color(51, 51, 51));
        consultarB.setText("Consultar");
        consultarB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultarBActionPerformed(evt);
            }
        });

        jLabel15.setBackground(new java.awt.Color(0, 0, 0));
        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Ingrese dato(s) del producto que desea buscar:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(idTF, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)
                                    .addComponent(costoTF, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)
                                    .addComponent(marcaTF, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 159, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(estadoTF, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(precioTF, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)))
                                    .addComponent(consultarB, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(nombreTF, javax.swing.GroupLayout.DEFAULT_SIZE, 639, Short.MAX_VALUE)))
                    .addComponent(jLabel15))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(idTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(estadoTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(nombreTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(costoTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(precioTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(marcaTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(consultarB))
                    .addComponent(jLabel6))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setForeground(new java.awt.Color(255, 255, 255));
        jPanel3.setPreferredSize(new java.awt.Dimension(305, 177));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("ID");

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Nombre");

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Estado");

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Precio de costo");

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Precio de venta");

        jLabel14.setBackground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Marca");

        costoRes.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                costoResFocusLost(evt);
            }
        });

        estadoCB.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Almacenado", "Bloqueado", "En tránsito", "Perdido", "Descontinuado" }));

        guardarB.setBackground(new java.awt.Color(0, 0, 0));
        guardarB.setForeground(new java.awt.Color(255, 255, 255));
        guardarB.setText("Guardar");
        guardarB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                guardarBMouseClicked(evt);
            }
        });
        guardarB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(idTF2, javax.swing.GroupLayout.DEFAULT_SIZE, 15, Short.MAX_VALUE)
                            .addComponent(costoRes, javax.swing.GroupLayout.DEFAULT_SIZE, 15, Short.MAX_VALUE)
                            .addComponent(marcaRes, javax.swing.GroupLayout.DEFAULT_SIZE, 15, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(estadoCB, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(precioRes, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)))
                            .addComponent(guardarB, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(nombreRes, javax.swing.GroupLayout.DEFAULT_SIZE, 292, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(idTF2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(estadoCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(nombreRes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(costoRes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(precioRes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(marcaRes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(guardarB)
                        .addContainerGap())))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12)
                .addGap(88, 88, 88)
                .addComponent(jLabel13)
                .addContainerGap(323, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 102, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 437, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 784, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void consultarBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultarBActionPerformed
        consulta.removeAll(consulta);

        if(costoTF.getText().equals("")){precioCosto = 0;}
        else{precioCosto = Integer.parseInt(costoTF.getText());}
        if(precioTF.getText().equals("")){precioVenta = 0;}
        else{precioVenta = Integer.parseInt(precioTF.getText());}
        if(idTF.getText().equals("")){id = 0;}
        else{id = Integer.parseInt(idTF.getText());}

        nombre = nombreTF.getText();
        marca = marcaTF.getText();
        estado = (String) estadoTF.getSelectedItem();

        Producto producto = new Producto();

        producto.setEstado(estado);
        producto.setId(id);
        producto.setMarca(marca);
        producto.setNombre(nombre);
        producto.setPrecioCosto(precioCosto);
        producto.setPrecioVenta(precioVenta);

        consulta = administrador.buscarProductos(producto);
        //Agregar elementos de la consulta a la Lista
        if(consulta.size()==0){
            JOptionPane.showMessageDialog(null, "No se han encontrado coincidencias", "Atención", JOptionPane.WARNING_MESSAGE);
            DefaultListModel elementos = new DefaultListModel();
            listaPro.setModel(elementos);
            idTF2.setText("");
            nombreRes.setText("");
            marcaRes.setText("");
            costoRes.setText("");
            precioRes.setText("");
            estadoCB.setSelectedIndex(0);
        }
        else{
            DefaultListModel elementos = new DefaultListModel();
            int j = consulta.size();
            for(int i = 0; i<j;i++){
                elementos.addElement(consulta.get(i).getNombre()+" - "+consulta.get(i).getMarca());
            }
            listaPro.setModel(elementos);

        }
}//GEN-LAST:event_consultarBActionPerformed

    private void guardarBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarBActionPerformed
        Producto producto = new Producto();

        if(nombreRes.getText().equals("") || costoRes.getText().equals("") || marcaRes.getText().equals("")){
            JOptionPane.showMessageDialog(null, "ALERTA Existen campos nulos", "Campos vacios", JOptionPane.WARNING_MESSAGE);
        }
        else{
            producto.setEstado((String) estadoCB.getSelectedItem());
            producto.setId(Integer.parseInt(idTF2.getText()));
            producto.setMarca(marcaRes.getText());
            producto.setNombre(nombreRes.getText());
            producto.setPrecioCosto(Double.valueOf(costoRes.getText()));
            producto.setPrecioVenta(Double.valueOf(precioRes.getText()));

            if(!producto.getEstado().equals(consulta.get(index).getEstado())){consulta.get(index).setEstado(producto.getEstado());}
            if(!producto.getMarca().equals(consulta.get(index).getMarca())){consulta.get(index).setMarca(producto.getMarca());}
            if(!producto.getNombre().equals(consulta.get(index).getNombre())){consulta.get(index).setNombre(producto.getNombre());}
            if(!(producto.getPrecioCosto() == consulta.get(index).getPrecioCosto())){consulta.get(index).setPrecioCosto(producto.getPrecioCosto());}
            if(!(producto.getPrecioVenta() == consulta.get(index).getPrecioVenta())){consulta.get(index).setPrecioVenta(producto.getPrecioVenta());}

            if(administrador.actualizarProducto(producto.getId(), producto)){
                JOptionPane.showMessageDialog(null, "Se ha actualizado el producto", "Atencion", JOptionPane.INFORMATION_MESSAGE);
            }

        }
}//GEN-LAST:event_guardarBActionPerformed

        private void listaProValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listaProValueChanged
            // TODO add your handling code here:
        index = listaPro.getSelectedIndex();
        if(index>=0){
        idTF2.setText(String.valueOf(consulta.get(index).getId()));
        nombreRes.setText(String.valueOf(consulta.get(index).getNombre()));
        marcaRes.setText(String.valueOf(consulta.get(index).getMarca()));
        estadoRes = consulta.get(index).getEstado();
        estadoCB.setSelectedIndex(consulta.get(index).getEstado().indexOf(estadoRes));
        costoRes.setText(String.valueOf(consulta.get(index).getPrecioCosto()));
        precioRes.setText(String.valueOf(consulta.get(index).getPrecioVenta()));}
        }//GEN-LAST:event_listaProValueChanged

        private void guardarBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_guardarBMouseClicked
            // TODO add your handling code here:
            

        }//GEN-LAST:event_guardarBMouseClicked

        private void costoResFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_costoResFocusLost
            precioRes.setText(String.valueOf(administrador.calcularPrecioVenta(Integer.parseInt(costoRes.getText()))));
        }//GEN-LAST:event_costoResFocusLost
    
    private int id;
    private double precioCosto;
    private double precioVenta;
    private String nombre;
    private String marca;
    private String estado;
    private String estadoRes;
    private CAdministrarProducto administrador = new CAdministrarProducto();
    private ArrayList<Producto> consulta = new ArrayList<Producto>();
    private int index;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton consultarB;
    private javax.swing.JTextField costoRes;
    private javax.swing.JTextField costoTF;
    private javax.swing.JComboBox estadoCB;
    private javax.swing.JComboBox estadoTF;
    private javax.swing.JButton guardarB;
    private javax.swing.JTextField idTF;
    private javax.swing.JTextField idTF2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList listaPro;
    private javax.swing.JTextField marcaRes;
    private javax.swing.JTextField marcaTF;
    private javax.swing.JTextField nombreRes;
    private javax.swing.JTextField nombreTF;
    private javax.swing.JTextField precioRes;
    private javax.swing.JTextField precioTF;
    // End of variables declaration//GEN-END:variables

}
