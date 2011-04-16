package Vista;

import Modelo.Producto;
import Modelo.Sistema;
import java.lang.String;
import java.util.ArrayList;
import javax.swing.DefaultCellEditor;
import javax.swing.JComboBox;
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
public class OrdendeTraslado extends javax.swing.JFrame {


    /** Creates new form OrdendeTraslado */
    public OrdendeTraslado() {
        
        initComponents();
        //Nombre de Producto se selecciona de la lista de productos creados
        TableColumn nombreProd = ListaTraslado.getColumnModel().getColumn(1);
        TableColumn marcaProd = ListaTraslado.getColumnModel().getColumn(2);
        //System.out.println(Nombre.getHeaderValue());
        JComboBox listaNombrep = new JComboBox();
        JComboBox listaMarcap = new JComboBox();
        String[] nombrep = null;
        String[] marcap = null;
        ArrayList<Producto> productos = new ArrayList();
        nombrep = new String[Sistema.getProductos().size()];
        marcap = new String[Sistema.getProductos().size()];
        int i = 0;
        for (Producto p:Sistema.getProductos()){
            nombrep[i] = p.getNombre();
            marcap[i]= p.getMarca();
            i++;
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

        javax.swing.GroupLayout Adm_ProLayout = new javax.swing.GroupLayout(Adm_Pro);
        Adm_Pro.setLayout(Adm_ProLayout);
        Adm_ProLayout.setHorizontalGroup(
            Adm_ProLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Adm_ProLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Adm_ProLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Adm_ProLayout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FechaTraslado, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel10)
                        .addGap(18, 18, 18)
                        .addComponent(FuenteTraslado, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel9)
                        .addGap(18, 18, 18)
                        .addComponent(DestinoTraslado, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Adm_ProLayout.createSequentialGroup()
                        .addGroup(Adm_ProLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 598, Short.MAX_VALUE)
                            .addGroup(Adm_ProLayout.createSequentialGroup()
                                .addComponent(MenuPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 234, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(GuardarTraslado, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(48, 48, 48)
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(MontoTraslado, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)))
                        .addGap(18, 18, 18)))
                .addContainerGap())
        );
        Adm_ProLayout.setVerticalGroup(
            Adm_ProLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Adm_ProLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(Adm_ProLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(DestinoTraslado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FechaTraslado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(FuenteTraslado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(Adm_ProLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MenuPrincipal)
                    .addComponent(GuardarTraslado)
                    .addComponent(jLabel11)
                    .addComponent(MontoTraslado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Adm_Pro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Adm_Pro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void GuardarTrasladoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarTrasladoActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_GuardarTrasladoActionPerformed

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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Adm_Pro;
    private javax.swing.JFormattedTextField DestinoTraslado;
    private javax.swing.JFormattedTextField FechaTraslado;
    private javax.swing.JFormattedTextField FuenteTraslado;
    private javax.swing.JButton GuardarTraslado;
    private javax.swing.JTable ListaTraslado;
    private javax.swing.JButton MenuPrincipal;
    private javax.swing.JTextField MontoTraslado;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

}
