package Vista;

import Controlador.CAdministrarProducto;
import Modelo.Sistema;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * AdministrarProducto.java
 *
 * Created on 19/03/2011, 04:21:19 PM
 */

/**
 *
 * @author USUARIO
 */
public class AdministrarProducto extends javax.swing.JFrame {

    /** Creates new form AdministrarProducto */
    public AdministrarProducto() {
        initComponents();
        //System.out.println(Sistema.getFacturas().size());
        //for(int i=0;i<Sistema.getFacturas().size();i++){
        //System.out.println(Sistema.getFacturas().get(i).getProductosFactura().get(i).getNombre()+Sistema.getFacturas().get(i).getProductosFactura().get(i).getCantidad());}
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
        crearProductoB = new javax.swing.JButton();
        consultarProductoB = new javax.swing.JButton();
        actualizarProductoB = new javax.swing.JButton();
        eliminarProductoB = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        cerrarVentanaB = new javax.swing.JButton();
        administrarProductoP = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Administrar productos");
        setBackground(new java.awt.Color(0, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        crearProductoB.setBackground(new java.awt.Color(255, 255, 255));
        crearProductoB.setText("Crear Producto");
        crearProductoB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                crearProductoBMouseClicked(evt);
            }
        });

        consultarProductoB.setBackground(new java.awt.Color(255, 255, 255));
        consultarProductoB.setText("Consultar Producto");
        consultarProductoB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultarProductoBActionPerformed(evt);
            }
        });

        actualizarProductoB.setBackground(new java.awt.Color(255, 255, 255));
        actualizarProductoB.setText("Actualizar Producto");
        actualizarProductoB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actualizarProductoBActionPerformed(evt);
            }
        });

        eliminarProductoB.setBackground(new java.awt.Color(255, 255, 255));
        eliminarProductoB.setText("Eliminar Producto");
        eliminarProductoB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarProductoBActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        cerrarVentanaB.setBackground(new java.awt.Color(255, 255, 255));
        cerrarVentanaB.setText("Cerrar esta ventana");
        cerrarVentanaB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cerrarVentanaBActionPerformed(evt);
            }
        });

        administrarProductoP.setBackground(new java.awt.Color(255, 255, 255));
        administrarProductoP.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        administrarProductoP.setForeground(new java.awt.Color(255, 255, 255));
        administrarProductoP.setPreferredSize(new java.awt.Dimension(305, 177));

        javax.swing.GroupLayout administrarProductoPLayout = new javax.swing.GroupLayout(administrarProductoP);
        administrarProductoP.setLayout(administrarProductoPLayout);
        administrarProductoPLayout.setHorizontalGroup(
            administrarProductoPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 694, Short.MAX_VALUE)
        );
        administrarProductoPLayout.setVerticalGroup(
            administrarProductoPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 299, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(298, 298, 298)
                .addComponent(cerrarVentanaB, javax.swing.GroupLayout.DEFAULT_SIZE, 408, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                    .addComponent(administrarProductoP, javax.swing.GroupLayout.PREFERRED_SIZE, 696, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(20, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(317, 317, 317)
                .addComponent(cerrarVentanaB)
                .addContainerGap(32, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(4, 4, 4)
                    .addComponent(administrarProductoP, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(67, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(eliminarProductoB, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                    .addComponent(actualizarProductoB, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                    .addComponent(consultarProductoB, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                    .addComponent(crearProductoB, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(crearProductoB)
                        .addGap(18, 18, 18)
                        .addComponent(consultarProductoB)
                        .addGap(18, 18, 18)
                        .addComponent(actualizarProductoB)
                        .addGap(18, 18, 18)
                        .addComponent(eliminarProductoB))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void consultarProductoBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultarProductoBActionPerformed
        ConsultarProducto consultarProducto = new ConsultarProducto();
        administrarProductoP.setVisible(false);
        administrarProductoP.removeAll();
        consultarProducto.setBounds(administrarProductoP.getBounds());
        administrarProductoP.add(consultarProducto);
        administrarProductoP.setVisible(true);
    }//GEN-LAST:event_consultarProductoBActionPerformed

    private void actualizarProductoBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualizarProductoBActionPerformed
        ActualizarProducto actualizarProducto = new ActualizarProducto();
        administrarProductoP.setVisible(false);
        administrarProductoP.removeAll();
        actualizarProducto.setBounds(administrarProductoP.getBounds());
        administrarProductoP.add(actualizarProducto);
        administrarProductoP.setVisible(true);
    }//GEN-LAST:event_actualizarProductoBActionPerformed

    private void eliminarProductoBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarProductoBActionPerformed
        EliminarProducto eliminarProducto = new EliminarProducto();
        administrarProductoP.setVisible(false);
        administrarProductoP.removeAll();
        eliminarProducto.setBounds(administrarProductoP.getBounds());
        administrarProductoP.add(eliminarProducto);
        administrarProductoP.setVisible(true);
    }//GEN-LAST:event_eliminarProductoBActionPerformed

    private void crearProductoBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_crearProductoBMouseClicked

        //Panel crear producto con ID por defecto
        CrearProducto crearproducto = new CrearProducto();
        crearproducto.setID(CAdministrarProducto.generarID());

        //Visualizacion del panel
        administrarProductoP.setVisible(false);
        administrarProductoP.removeAll();
        crearproducto.setBounds(administrarProductoP.getBounds());
        administrarProductoP.add(crearproducto);
        administrarProductoP.setVisible(true);

    }//GEN-LAST:event_crearProductoBMouseClicked

    private void cerrarVentanaBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerrarVentanaBActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_cerrarVentanaBActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdministrarProducto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton actualizarProductoB;
    private javax.swing.JPanel administrarProductoP;
    private javax.swing.JButton cerrarVentanaB;
    private javax.swing.JButton consultarProductoB;
    private javax.swing.JButton crearProductoB;
    private javax.swing.JButton eliminarProductoB;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables

}
