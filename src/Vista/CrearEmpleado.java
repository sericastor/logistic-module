package Vista;

import Controlador.CAdministrarEmpleado;
import Modelo.Empleado;
import javax.swing.JOptionPane;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * CrearEmpleado.java
 *
 * Created on 8/04/2011, 11:41:06 AM
 */

/**
 *
 * @author USUARIO
 */
public class CrearEmpleado extends javax.swing.JPanel {

    /** Creates new form CrearEmpleado */
    public CrearEmpleado() {
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        documentoTF = new javax.swing.JTextField();
        nombreTF = new javax.swing.JTextField();
        direccionTF = new javax.swing.JTextField();
        telefonoTF = new javax.swing.JTextField();
        usuarioTF = new javax.swing.JTextField();
        guardarB = new javax.swing.JButton();
        fechaNacimientoTF = new javax.swing.JFormattedTextField();
        jLabel7 = new javax.swing.JLabel();
        apellidoTF = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        contrasenaTF = new javax.swing.JPasswordField();
        jLabel9 = new javax.swing.JLabel();
        tipoCB = new javax.swing.JComboBox();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(305, 177));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nro. Documento");

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nombre");

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Fecha de nacimiento");

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Dirección");

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Teléfono");

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Usuario");

        documentoTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                documentoTFActionPerformed(evt);
            }
        });

        guardarB.setBackground(new java.awt.Color(0, 0, 0));
        guardarB.setForeground(new java.awt.Color(255, 255, 255));
        guardarB.setText("Guardar");
        guardarB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarBActionPerformed(evt);
            }
        });

        fechaNacimientoTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fechaNacimientoTFActionPerformed(evt);
            }
        });

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Apellido");

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Contraseña");

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Tipo de empleado");

        tipoCB.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Auxiliar de Bodega", "Gerente de Logistica" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(usuarioTF)
                            .addComponent(direccionTF)
                            .addComponent(documentoTF)
                            .addComponent(nombreTF, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tipoCB, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(7, 7, 7)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(contrasenaTF, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)
                            .addComponent(telefonoTF, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)
                            .addComponent(apellidoTF, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)
                            .addComponent(fechaNacimientoTF, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(guardarB, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(documentoTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fechaNacimientoTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(nombreTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(apellidoTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(direccionTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(telefonoTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(usuarioTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(contrasenaTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tipoCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(guardarB))
                    .addComponent(jLabel9))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 546, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void guardarBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarBActionPerformed

    try{
        if((apellidoTF.getText().equals("") || contrasenaTF.getText().equals("") || direccionTF.getText().equals("") ||
            documentoTF.getText().equals("") || telefonoTF.getText().equals("") ||
            usuarioTF.getText().equals("") || nombreTF.getText().equals("")) || fechaNacimientoTF.getText().equals("")){
            JOptionPane.showMessageDialog(null, "ALERTA Existen campos nulos", "Campos vacios", JOptionPane.WARNING_MESSAGE);
        }
        else{
             nombre = nombreTF.getText();
             apellido = apellidoTF.getText();
             usuario =  usuarioTF.getText();
             contrasena = contrasenaTF.getText();
             direccion = direccionTF.getText();
             telefono = Long.parseLong(telefonoTF.getText());
             documento = Long.parseLong(documentoTF.getText());
             fechaNacimiento = fechaNacimientoTF.getText();
             tipo = (String) tipoCB.getSelectedItem();

             Empleado empleado = new Empleado(nombre, apellido, usuario, contrasena, direccion, telefono, documento, fechaNacimiento, tipo);

             if (CAdministrarEmpleado.crearEmpleado(empleado).equals("Empleado válido")){
                nombreTF.setText("");
                apellidoTF.setText("");
                usuarioTF.setText("");
                contrasenaTF.setText("");
                direccionTF.setText("");
                telefonoTF.setText("");
                documentoTF.setText("");
                fechaNacimientoTF.setText("");

                JOptionPane.showMessageDialog(null, "Usted ha creado un Empleado", "Empleado Creado", JOptionPane.INFORMATION_MESSAGE);
            }
        else{
            JOptionPane.showMessageDialog(null, CAdministrarEmpleado.validarEmpleado(empleado), "Error", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }
    catch(Exception e){
        resultado="Ingrese un valor numerico en el campo Nro. de Documento o Teléfono";
        System.out.println(resultado);
        JOptionPane.showMessageDialog(null, "Ingrese un valor numerico en el campo Nro. de Documento o Teléfono", "Error", JOptionPane.WARNING_MESSAGE);

    }
}//GEN-LAST:event_guardarBActionPerformed

    private void fechaNacimientoTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fechaNacimientoTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fechaNacimientoTFActionPerformed

    private void documentoTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_documentoTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_documentoTFActionPerformed


    private String resultado;
    private String nombre;
    private String apellido;
    private String usuario;
    private String contrasena;
    private String direccion;
    private long telefono;
    private long documento;
    private String fechaNacimiento;
    private String tipo;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField apellidoTF;
    private javax.swing.JPasswordField contrasenaTF;
    private javax.swing.JTextField direccionTF;
    private javax.swing.JTextField documentoTF;
    private javax.swing.JFormattedTextField fechaNacimientoTF;
    private javax.swing.JButton guardarB;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField nombreTF;
    private javax.swing.JTextField telefonoTF;
    private javax.swing.JComboBox tipoCB;
    private javax.swing.JTextField usuarioTF;
    // End of variables declaration//GEN-END:variables

}
