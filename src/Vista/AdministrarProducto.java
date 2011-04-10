package Vista;

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
        CrearPro = new javax.swing.JButton();
        ConsultarPro = new javax.swing.JButton();
        ActualizarPro = new javax.swing.JButton();
        EliminarPro = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        MenuPrincipal = new javax.swing.JButton();
        AdmProPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Administrar productos");
        setBackground(new java.awt.Color(0, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        Adm_Pro.setBackground(new java.awt.Color(0, 0, 0));
        Adm_Pro.setForeground(new java.awt.Color(255, 255, 255));

        CrearPro.setBackground(new java.awt.Color(255, 255, 255));
        CrearPro.setText("Crear Producto");
        CrearPro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CrearProMouseClicked(evt);
            }
        });

        ConsultarPro.setBackground(new java.awt.Color(255, 255, 255));
        ConsultarPro.setText("Consultar Producto");
        ConsultarPro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsultarProActionPerformed(evt);
            }
        });

        ActualizarPro.setBackground(new java.awt.Color(255, 255, 255));
        ActualizarPro.setText("Actualizar Producto");
        ActualizarPro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActualizarProActionPerformed(evt);
            }
        });

        EliminarPro.setBackground(new java.awt.Color(255, 255, 255));
        EliminarPro.setText("Eliminar Producto");
        EliminarPro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarProActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        MenuPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        MenuPrincipal.setText("Regresar al menú principal");
        MenuPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuPrincipalActionPerformed(evt);
            }
        });

        AdmProPanel.setBackground(new java.awt.Color(255, 255, 255));
        AdmProPanel.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        AdmProPanel.setForeground(new java.awt.Color(255, 255, 255));
        AdmProPanel.setPreferredSize(new java.awt.Dimension(305, 177));

        javax.swing.GroupLayout AdmProPanelLayout = new javax.swing.GroupLayout(AdmProPanel);
        AdmProPanel.setLayout(AdmProPanelLayout);
        AdmProPanelLayout.setHorizontalGroup(
            AdmProPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 684, Short.MAX_VALUE)
        );
        AdmProPanelLayout.setVerticalGroup(
            AdmProPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 299, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(298, 298, 298)
                .addComponent(MenuPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 408, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(AdmProPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 686, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(20, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(317, 317, 317)
                .addComponent(MenuPrincipal)
                .addContainerGap(18, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(4, 4, 4)
                    .addComponent(AdmProPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(53, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout Adm_ProLayout = new javax.swing.GroupLayout(Adm_Pro);
        Adm_Pro.setLayout(Adm_ProLayout);
        Adm_ProLayout.setHorizontalGroup(
            Adm_ProLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Adm_ProLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Adm_ProLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(EliminarPro, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                    .addComponent(ActualizarPro, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                    .addComponent(ConsultarPro, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                    .addComponent(CrearPro, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        Adm_ProLayout.setVerticalGroup(
            Adm_ProLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Adm_ProLayout.createSequentialGroup()
                .addGroup(Adm_ProLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Adm_ProLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(CrearPro)
                        .addGap(18, 18, 18)
                        .addComponent(ConsultarPro)
                        .addGap(18, 18, 18)
                        .addComponent(ActualizarPro)
                        .addGap(18, 18, 18)
                        .addComponent(EliminarPro))
                    .addGroup(Adm_ProLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Adm_Pro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Adm_Pro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ConsultarProActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsultarProActionPerformed
        ConsultarProducto consultarProducto = new ConsultarProducto();
        AdmProPanel.setVisible(false);
        AdmProPanel.removeAll();
        consultarProducto.setBounds(0, 0, 0, 0);
        consultarProducto.setBounds(AdmProPanel.getBounds());
        AdmProPanel.add(consultarProducto);
        AdmProPanel.setVisible(true);
    }//GEN-LAST:event_ConsultarProActionPerformed

    private void ActualizarProActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ActualizarProActionPerformed
        ActualizarProducto actualizarProducto = new ActualizarProducto();
        AdmProPanel.setVisible(false);
        AdmProPanel.removeAll();
        actualizarProducto.setBounds(0, 0, 0, 0);
        actualizarProducto.setBounds(AdmProPanel.getBounds());
        AdmProPanel.add(actualizarProducto);
        AdmProPanel.setVisible(true);
    }//GEN-LAST:event_ActualizarProActionPerformed

    private void EliminarProActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarProActionPerformed
        EliminarProducto eliminarProducto = new EliminarProducto();
        AdmProPanel.setVisible(false);
        AdmProPanel.removeAll();
        eliminarProducto.setBounds(0, 0, 0, 0);
        eliminarProducto.setBounds(AdmProPanel.getBounds());
        AdmProPanel.add(eliminarProducto);
        AdmProPanel.setVisible(true);
    }//GEN-LAST:event_EliminarProActionPerformed

    private void CrearProMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CrearProMouseClicked
        CrearProducto crearproducto = new CrearProducto();
        AdmProPanel.setVisible(false);
        AdmProPanel.removeAll();
        crearproducto.setBounds(0, 0, 0, 0);
        crearproducto.setBounds(AdmProPanel.getBounds());
        AdmProPanel.add(crearproducto);
        AdmProPanel.setVisible(true);
    }//GEN-LAST:event_CrearProMouseClicked

    private void MenuPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuPrincipalActionPerformed
        if (IniciarSesión.getTipo()==1){
            this.setVisible(false);
            new Aplicación_GL().setVisible(true);
        }
        else if (IniciarSesión.getTipo()==2){
            this.setVisible(false);
            new Aplicación_AB().setVisible(true);
        }
    }//GEN-LAST:event_MenuPrincipalActionPerformed

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
    private javax.swing.JButton ActualizarPro;
    private javax.swing.JPanel AdmProPanel;
    private javax.swing.JPanel Adm_Pro;
    private javax.swing.JButton ConsultarPro;
    private javax.swing.JButton CrearPro;
    private javax.swing.JButton EliminarPro;
    private javax.swing.JButton MenuPrincipal;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables

}
