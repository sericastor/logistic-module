package Vista;

import Modelo.Empleado;
import Modelo.Sistema;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Aplicación_AB.java
 *
 * Created on 27/03/2011, 11:46:29 AM
 */

/**
 *
 * @author USUARIO
 */
public class Aplicación_AB extends javax.swing.JFrame {

    /** Creates new form Aplicación_AB */
    public Aplicación_AB() {
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

        menuABP = new javax.swing.JPanel();
        transportarB = new javax.swing.JButton();
        conciliarB = new javax.swing.JButton();
        verKardexB = new javax.swing.JButton();
        cerrarSesionB = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menú principal - AB");

        menuABP.setBackground(new java.awt.Color(0, 0, 0));
        menuABP.setForeground(new java.awt.Color(255, 255, 255));

        transportarB.setBackground(new java.awt.Color(255, 255, 255));
        transportarB.setText("Transportar mercancía");
        transportarB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transportarBActionPerformed(evt);
            }
        });

        conciliarB.setBackground(new java.awt.Color(255, 255, 255));
        conciliarB.setText("Conciliar mercancía");
        conciliarB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                conciliarBActionPerformed(evt);
            }
        });

        verKardexB.setBackground(new java.awt.Color(255, 255, 255));
        verKardexB.setText("Visualizar Kárdex");
        verKardexB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verKardexBActionPerformed(evt);
            }
        });

        cerrarSesionB.setBackground(new java.awt.Color(255, 255, 255));
        cerrarSesionB.setText("Cerrar sesión");
        cerrarSesionB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cerrarSesionBActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Rol: Auxiliar de bodega");

        jLabel11.setBackground(new java.awt.Color(0, 0, 0));
        jLabel11.setFont(new java.awt.Font("Felix Titling", 1, 14));
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Sistema de logística");

        jLabel12.setBackground(new java.awt.Color(0, 0, 0));
        jLabel12.setFont(new java.awt.Font("Felix Titling", 1, 24));
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("SLS");

        javax.swing.GroupLayout menuABPLayout = new javax.swing.GroupLayout(menuABP);
        menuABP.setLayout(menuABPLayout);
        menuABPLayout.setHorizontalGroup(
            menuABPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuABPLayout.createSequentialGroup()
                .addGroup(menuABPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(menuABPLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(menuABPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(menuABPLayout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(jLabel12))
                    .addGroup(menuABPLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(transportarB, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE))
                    .addGroup(menuABPLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(conciliarB, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE))
                    .addGroup(menuABPLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(verKardexB, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE))
                    .addGroup(menuABPLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(cerrarSesionB, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)))
                .addContainerGap())
        );
        menuABPLayout.setVerticalGroup(
            menuABPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuABPLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12)
                .addGap(18, 18, 18)
                .addComponent(transportarB)
                .addGap(18, 18, 18)
                .addComponent(conciliarB)
                .addGap(18, 18, 18)
                .addComponent(verKardexB)
                .addGap(18, 18, 18)
                .addComponent(cerrarSesionB)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menuABP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menuABP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void transportarBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transportarBActionPerformed
        //setVisible(false);
        TransportarMercancía transportarMercancia = new TransportarMercancía();
        transportarMercancia.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        transportarMercancia.setVisible(true);
    }//GEN-LAST:event_transportarBActionPerformed

    private void conciliarBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_conciliarBActionPerformed
        //setVisible(false);
        ConciliarMercancía conciliarMercancia = new ConciliarMercancía();
        conciliarMercancia.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        conciliarMercancia.setVisible(true);
    }//GEN-LAST:event_conciliarBActionPerformed

    private void cerrarSesionBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerrarSesionBActionPerformed
        this.setVisible(false);
        Sistema.setEmpleadoActual(new Empleado ("","","","","",0,0,null,""));
        new IniciarSesión().setVisible(true);
    }//GEN-LAST:event_cerrarSesionBActionPerformed

    private void verKardexBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verKardexBActionPerformed
        //setVisible(false);
        Kardex verkardex = new Kardex();
        verkardex.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        verkardex.setVisible(true);
    }//GEN-LAST:event_verKardexBActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Aplicación_AB().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cerrarSesionB;
    private javax.swing.JButton conciliarB;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JPanel menuABP;
    private javax.swing.JButton transportarB;
    private javax.swing.JButton verKardexB;
    // End of variables declaration//GEN-END:variables

}
