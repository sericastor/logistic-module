package Vista;

import Controlador.CAdministrarProducto;
import Modelo.Producto;
import javax.swing.JOptionPane;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * CrearProducto.java
 *
 * Created on 8/04/2011, 11:37:22 AM
 */

/**
 *
 * @author USUARIO
 */
public class CrearProducto extends javax.swing.JPanel {

    /** Creates new form CrearProducto */
    public CrearProducto() {
        initComponents();
        idTF.setEditable(false);
        precioTF.setEditable(false);
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        idTF = new javax.swing.JTextField();
        nombreTF = new javax.swing.JTextField();
        costoTF = new javax.swing.JTextField();
        estadoCB = new javax.swing.JComboBox();
        precioTF = new javax.swing.JTextField();
        marcaTF = new javax.swing.JTextField();
        guardarB = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(305, 177));

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

        costoTF.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                costoTFFocusLost(evt);
            }
        });

        estadoCB.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Almacenado", "Bloqueado", "En tránsito", "Perdido", "Descontinuado" }));

        guardarB.setBackground(new java.awt.Color(255, 255, 255));
        guardarB.setText("Guardar");
        guardarB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(idTF, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE)
                            .addComponent(costoTF, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE)
                            .addComponent(marcaTF, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE))
                        .addGap(67, 67, 67)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(4, 4, 4)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(guardarB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(estadoCB, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(precioTF, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)))
                    .addComponent(nombreTF, javax.swing.GroupLayout.DEFAULT_SIZE, 453, Short.MAX_VALUE))
                .addGap(136, 136, 136))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(idTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(estadoCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(nombreTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(costoTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(precioTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(marcaTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(guardarB))
                    .addComponent(jLabel6))
                .addContainerGap(203, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 676, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 315, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void guardarBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarBActionPerformed
        
            if(nombreTF.getText().equals("") || costoTF.getText().equals("") || marcaTF.getText().equals("")){
                JOptionPane.showMessageDialog(null, "ALERTA Existen campos nulos", "Campos vacios", JOptionPane.WARNING_MESSAGE);
            }
            else{
                ID = CAdministrarProducto.verificarID();
                nombre = nombreTF.getText();
                pcosto = Integer.parseInt(costoTF.getText());
                pventa = CAdministrarProducto.calcularPrecioVenta(pcosto);
                estado = (String) estadoCB.getSelectedItem();
                marca = marcaTF.getText();

                Producto producto = new Producto(ID, nombre, marca, 0, pcosto, pventa, 0.16, estado);

                if(ID != Integer.parseInt(idTF.getText())){
                    idTF.setText(String.valueOf(producto.getId()));
                    JOptionPane.showMessageDialog(null, "El ID del producto ha cambiado a "+producto.getId(), "Atencion", JOptionPane.WARNING_MESSAGE);
                }
                if(CAdministrarProducto.ValidarProducto(producto)){
                    if(CAdministrarProducto.crearProducto(producto)){
                        JOptionPane.showMessageDialog(null, "El producto ha sido creado", "Producto Creado", JOptionPane.INFORMATION_MESSAGE);
                        idTF.setText(String.valueOf(CAdministrarProducto.generarID()));
                        estadoCB.setSelectedIndex(0);
                        nombreTF.setText("");
                        precioTF.setText("");
                        costoTF.setText("");
                        marcaTF.setText("");
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "El producto ya existe", "Atencion", JOptionPane.WARNING_MESSAGE);
                    }
                }
            }

}//GEN-LAST:event_guardarBActionPerformed

    private void costoTFFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_costoTFFocusLost
        // TODO add your handling code here:
        try{
        pcosto = Double.parseDouble(costoTF.getText());
        pventa = CAdministrarProducto.calcularPrecioVenta(pcosto);
        precioTF.setText(String.valueOf(pventa));
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Ingrese un valor numerico en el campo Precio de Costo", "Error", JOptionPane.WARNING_MESSAGE);
        }

}//GEN-LAST:event_costoTFFocusLost

    public void setID(int consecutivo){
        ID = consecutivo;
        this.idTF.setText(String.valueOf(consecutivo));
    }
    
    private int ID;
    private String nombre;
    private double pcosto;
    private String estado;
    private String marca;
    private double pventa;
    //private static ArrayList<Producto> productos = new ArrayList<Producto>();
    //private static Sistema sistema = new Sistema();
    private CAdministrarProducto administrador = new CAdministrarProducto();
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField costoTF;
    private javax.swing.JComboBox estadoCB;
    private javax.swing.JButton guardarB;
    private javax.swing.JTextField idTF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField marcaTF;
    private javax.swing.JTextField nombreTF;
    private javax.swing.JTextField precioTF;
    // End of variables declaration//GEN-END:variables

}
