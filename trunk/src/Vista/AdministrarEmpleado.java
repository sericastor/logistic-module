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

        Adm_Emp = new javax.swing.JPanel();
        CrearEmp = new javax.swing.JButton();
        ConsultarEmp = new javax.swing.JButton();
        ActualizarEmp = new javax.swing.JButton();
        EliminarEmp = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        AdmEmpPanel = new javax.swing.JPanel();
        MenuPrincipal = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Administrar empleado");

        Adm_Emp.setBackground(new java.awt.Color(0, 0, 0));
        Adm_Emp.setForeground(new java.awt.Color(255, 255, 255));

        CrearEmp.setBackground(new java.awt.Color(255, 255, 255));
        CrearEmp.setText("Crear Empleado");
        CrearEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CrearEmpActionPerformed(evt);
            }
        });

        ConsultarEmp.setBackground(new java.awt.Color(255, 255, 255));
        ConsultarEmp.setText("Consultar Empleado");
        ConsultarEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsultarEmpActionPerformed(evt);
            }
        });

        ActualizarEmp.setBackground(new java.awt.Color(255, 255, 255));
        ActualizarEmp.setText("Actualizar Empleado");
        ActualizarEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActualizarEmpActionPerformed(evt);
            }
        });

        EliminarEmp.setBackground(new java.awt.Color(255, 255, 255));
        EliminarEmp.setText("Eliminar Empleado");
        EliminarEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarEmpActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        AdmEmpPanel.setBackground(new java.awt.Color(255, 255, 255));
        AdmEmpPanel.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        AdmEmpPanel.setForeground(new java.awt.Color(255, 255, 255));
        AdmEmpPanel.setPreferredSize(new java.awt.Dimension(305, 177));

        javax.swing.GroupLayout AdmEmpPanelLayout = new javax.swing.GroupLayout(AdmEmpPanel);
        AdmEmpPanel.setLayout(AdmEmpPanelLayout);
        AdmEmpPanelLayout.setHorizontalGroup(
            AdmEmpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 778, Short.MAX_VALUE)
        );
        AdmEmpPanelLayout.setVerticalGroup(
            AdmEmpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 351, Short.MAX_VALUE)
        );

        MenuPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        MenuPrincipal.setText("Regresar al menú principal");
        MenuPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuPrincipalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(AdmEmpPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 780, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(350, 350, 350)
                .addComponent(MenuPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 420, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(AdmEmpPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(MenuPrincipal))
        );

        javax.swing.GroupLayout Adm_EmpLayout = new javax.swing.GroupLayout(Adm_Emp);
        Adm_Emp.setLayout(Adm_EmpLayout);
        Adm_EmpLayout.setHorizontalGroup(
            Adm_EmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Adm_EmpLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(Adm_EmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(EliminarEmp, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
                    .addComponent(ActualizarEmp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ConsultarEmp, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
                    .addComponent(CrearEmp, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
        );
        Adm_EmpLayout.setVerticalGroup(
            Adm_EmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Adm_EmpLayout.createSequentialGroup()
                .addGroup(Adm_EmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Adm_EmpLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(CrearEmp)
                        .addGap(18, 18, 18)
                        .addComponent(ConsultarEmp)
                        .addGap(18, 18, 18)
                        .addComponent(ActualizarEmp)
                        .addGap(18, 18, 18)
                        .addComponent(EliminarEmp))
                    .addGroup(Adm_EmpLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Adm_Emp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Adm_Emp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ConsultarEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsultarEmpActionPerformed
        AdmEmpPanel.setVisible(false);
        AdmEmpPanel.removeAll();
        ConsultarEmpleado consultarEmpleado = new ConsultarEmpleado();
        consultarEmpleado.setBounds(0, 0, 0, 0);
        consultarEmpleado.setBounds(AdmEmpPanel.getBounds());
        AdmEmpPanel.add(consultarEmpleado);
        AdmEmpPanel.setVisible(true);
}//GEN-LAST:event_ConsultarEmpActionPerformed

    private void ActualizarEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ActualizarEmpActionPerformed
        AdmEmpPanel.setVisible(false);
        AdmEmpPanel.removeAll();
        ActualizarEmpleado actualizarEmpleado = new ActualizarEmpleado();
        actualizarEmpleado.setBounds(0, 0, 0, 0);
        actualizarEmpleado.setBounds(AdmEmpPanel.getBounds());
        AdmEmpPanel.add(actualizarEmpleado);
        AdmEmpPanel.setVisible(true);
}//GEN-LAST:event_ActualizarEmpActionPerformed

    private void EliminarEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarEmpActionPerformed
        AdmEmpPanel.setVisible(false);
        AdmEmpPanel.removeAll();
        EliminarEmpleado eliminarEmpleado = new EliminarEmpleado();
        eliminarEmpleado.setBounds(0, 0, 0, 0);
        eliminarEmpleado.setBounds(AdmEmpPanel.getBounds());
        AdmEmpPanel.add(eliminarEmpleado);
        AdmEmpPanel.setVisible(true);
}//GEN-LAST:event_EliminarEmpActionPerformed

    private void CrearEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CrearEmpActionPerformed
        AdmEmpPanel.setVisible(false);
        AdmEmpPanel.removeAll();
        CrearEmpleado crearEmpleado = new CrearEmpleado();
        crearEmpleado.setBounds(0, 0, 0, 0);
        crearEmpleado.setBounds(AdmEmpPanel.getBounds());
        AdmEmpPanel.add(crearEmpleado);
        AdmEmpPanel.setVisible(true);
    }//GEN-LAST:event_CrearEmpActionPerformed

    private void MenuPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuPrincipalActionPerformed
        if (IniciarSesión.getTipo()==1){
            this.setVisible(false);
            
        }
        else if (IniciarSesión.getTipo()==2){
            this.setVisible(false);
            
        }
    }//GEN-LAST:event_MenuPrincipalActionPerformed

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
    private javax.swing.JButton ActualizarEmp;
    private javax.swing.JPanel AdmEmpPanel;
    private javax.swing.JPanel Adm_Emp;
    private javax.swing.JButton ConsultarEmp;
    private javax.swing.JButton CrearEmp;
    private javax.swing.JButton EliminarEmp;
    private javax.swing.JButton MenuPrincipal;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables

}
