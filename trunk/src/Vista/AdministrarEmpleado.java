package Vista;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * AdministrarEmpleado.java
 *
 * Created on 26/03/2011, 11:50:06 PM
 */

/**
 *
 * @author USUARIO
 */
public class AdministrarEmpleado extends javax.swing.JFrame {

    /** Creates new form AdministrarEmpleado */
    public AdministrarEmpleado() {
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

        jPanel1 = new javax.swing.JPanel();
        crearEmpleadoB = new javax.swing.JButton();
        consultarEmpleadoB = new javax.swing.JButton();
        actualizarEmpleadoB = new javax.swing.JButton();
        eliminarEmpleadoB = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        administrarEmpleadoP = new javax.swing.JPanel();
        cerrarVentanaB = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Administrar empleado");

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        crearEmpleadoB.setBackground(new java.awt.Color(255, 255, 255));
        crearEmpleadoB.setText("Crear Empleado");
        crearEmpleadoB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearEmpleadoBActionPerformed(evt);
            }
        });

        consultarEmpleadoB.setBackground(new java.awt.Color(255, 255, 255));
        consultarEmpleadoB.setText("Consultar Empleado");
        consultarEmpleadoB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultarEmpleadoBActionPerformed(evt);
            }
        });

        actualizarEmpleadoB.setBackground(new java.awt.Color(255, 255, 255));
        actualizarEmpleadoB.setText("Actualizar Empleado");
        actualizarEmpleadoB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actualizarEmpleadoBActionPerformed(evt);
            }
        });

        eliminarEmpleadoB.setBackground(new java.awt.Color(255, 255, 255));
        eliminarEmpleadoB.setText("Eliminar Empleado");
        eliminarEmpleadoB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarEmpleadoBActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        administrarEmpleadoP.setBackground(new java.awt.Color(255, 255, 255));
        administrarEmpleadoP.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        administrarEmpleadoP.setForeground(new java.awt.Color(255, 255, 255));
        administrarEmpleadoP.setPreferredSize(new java.awt.Dimension(305, 177));

        javax.swing.GroupLayout administrarEmpleadoPLayout = new javax.swing.GroupLayout(administrarEmpleadoP);
        administrarEmpleadoP.setLayout(administrarEmpleadoPLayout);
        administrarEmpleadoPLayout.setHorizontalGroup(
            administrarEmpleadoPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 782, Short.MAX_VALUE)
        );
        administrarEmpleadoPLayout.setVerticalGroup(
            administrarEmpleadoPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 351, Short.MAX_VALUE)
        );

        cerrarVentanaB.setBackground(new java.awt.Color(255, 255, 255));
        cerrarVentanaB.setText("Cerrar esta ventana");
        cerrarVentanaB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cerrarVentanaBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(administrarEmpleadoP, javax.swing.GroupLayout.DEFAULT_SIZE, 784, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(350, 350, 350)
                .addComponent(cerrarVentanaB, javax.swing.GroupLayout.DEFAULT_SIZE, 422, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(administrarEmpleadoP, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(cerrarVentanaB))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(eliminarEmpleadoB, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
                    .addComponent(actualizarEmpleadoB, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
                    .addComponent(consultarEmpleadoB, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
                    .addComponent(crearEmpleadoB, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(crearEmpleadoB)
                        .addGap(18, 18, 18)
                        .addComponent(consultarEmpleadoB)
                        .addGap(18, 18, 18)
                        .addComponent(actualizarEmpleadoB)
                        .addGap(18, 18, 18)
                        .addComponent(eliminarEmpleadoB))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void consultarEmpleadoBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultarEmpleadoBActionPerformed
        administrarEmpleadoP.setVisible(false);
        administrarEmpleadoP.removeAll();
        ConsultarEmpleado consultarEmpleado = new ConsultarEmpleado();
        consultarEmpleado.setBounds(administrarEmpleadoP.getBounds());
        administrarEmpleadoP.add(consultarEmpleado);
        administrarEmpleadoP.setVisible(true);
}//GEN-LAST:event_consultarEmpleadoBActionPerformed

    private void actualizarEmpleadoBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualizarEmpleadoBActionPerformed
        administrarEmpleadoP.setVisible(false);
        administrarEmpleadoP.removeAll();
        ActualizarEmpleado actualizarEmpleado = new ActualizarEmpleado();
        actualizarEmpleado.setBounds(administrarEmpleadoP.getBounds());
        administrarEmpleadoP.add(actualizarEmpleado);
        administrarEmpleadoP.setVisible(true);
}//GEN-LAST:event_actualizarEmpleadoBActionPerformed

    private void eliminarEmpleadoBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarEmpleadoBActionPerformed
        administrarEmpleadoP.setVisible(false);
        administrarEmpleadoP.removeAll();
        EliminarEmpleado eliminarEmpleado = new EliminarEmpleado();
        eliminarEmpleado.setBounds(administrarEmpleadoP.getBounds());
        administrarEmpleadoP.add(eliminarEmpleado);
        administrarEmpleadoP.setVisible(true);
}//GEN-LAST:event_eliminarEmpleadoBActionPerformed

    private void crearEmpleadoBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearEmpleadoBActionPerformed
        administrarEmpleadoP.setVisible(false);
        administrarEmpleadoP.removeAll();
        CrearEmpleado crearEmpleado = new CrearEmpleado();
        crearEmpleado.setBounds(administrarEmpleadoP.getBounds());
        administrarEmpleadoP.add(crearEmpleado);
        administrarEmpleadoP.setVisible(true);
    }//GEN-LAST:event_crearEmpleadoBActionPerformed

    private void cerrarVentanaBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerrarVentanaBActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_cerrarVentanaBActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdministrarEmpleado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton actualizarEmpleadoB;
    private javax.swing.JPanel administrarEmpleadoP;
    private javax.swing.JButton cerrarVentanaB;
    private javax.swing.JButton consultarEmpleadoB;
    private javax.swing.JButton crearEmpleadoB;
    private javax.swing.JButton eliminarEmpleadoB;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables

}