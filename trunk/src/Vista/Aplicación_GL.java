package Vista;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Aplicación_GL.java
 *
 * Created on 27/03/2011, 12:25:14 PM
 */

/**
 *
 * @author USUARIO
 */
public class Aplicación_GL extends javax.swing.JFrame {

    /** Creates new form Aplicación_GL */
    public Aplicación_GL() {
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

        Adm_Pro3 = new javax.swing.JPanel();
        Transportar = new javax.swing.JButton();
        Conciliar = new javax.swing.JButton();
        Ver_Kardex = new javax.swing.JButton();
        Cerrar_Sesion = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        Generar_Reporte = new javax.swing.JButton();
        Comprar = new javax.swing.JButton();
        Adm_Emp = new javax.swing.JButton();
        Adm_Pro = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        Generar_Traslado = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menú principal - GL");

        Adm_Pro3.setBackground(new java.awt.Color(0, 0, 0));
        Adm_Pro3.setForeground(new java.awt.Color(255, 255, 255));

        Transportar.setBackground(new java.awt.Color(255, 255, 255));
        Transportar.setText("Transportar mercancía");
        Transportar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TransportarActionPerformed(evt);
            }
        });

        Conciliar.setBackground(new java.awt.Color(255, 255, 255));
        Conciliar.setText("Conciliar mercancía");
        Conciliar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConciliarActionPerformed(evt);
            }
        });

        Ver_Kardex.setBackground(new java.awt.Color(255, 255, 255));
        Ver_Kardex.setText("Visualizar Kárdex");
        Ver_Kardex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ver_KardexActionPerformed(evt);
            }
        });

        Cerrar_Sesion.setBackground(new java.awt.Color(255, 255, 255));
        Cerrar_Sesion.setText("Cerrar sesión");
        Cerrar_Sesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cerrar_SesionActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Rol: Gerente de logística");

        Generar_Reporte.setBackground(new java.awt.Color(255, 255, 255));
        Generar_Reporte.setText("Generar reporte");
        Generar_Reporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Generar_ReporteActionPerformed(evt);
            }
        });

        Comprar.setBackground(new java.awt.Color(255, 255, 255));
        Comprar.setText("Comprar mercancía");
        Comprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComprarActionPerformed(evt);
            }
        });

        Adm_Emp.setBackground(new java.awt.Color(255, 255, 255));
        Adm_Emp.setText("Administrar empleado");
        Adm_Emp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Adm_EmpActionPerformed(evt);
            }
        });

        Adm_Pro.setBackground(new java.awt.Color(255, 255, 255));
        Adm_Pro.setText("Administrar producto");
        Adm_Pro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Adm_ProActionPerformed(evt);
            }
        });

        jLabel11.setBackground(new java.awt.Color(0, 0, 0));
        jLabel11.setFont(new java.awt.Font("Felix Titling", 1, 14));
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Sistema de logística");

        jLabel12.setBackground(new java.awt.Color(0, 0, 0));
        jLabel12.setFont(new java.awt.Font("Felix Titling", 1, 24));
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("SLS");

        Generar_Traslado.setBackground(new java.awt.Color(255, 255, 255));
        Generar_Traslado.setText("Generar orden de traslado");
        Generar_Traslado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Generar_TrasladoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Adm_Pro3Layout = new javax.swing.GroupLayout(Adm_Pro3);
        Adm_Pro3.setLayout(Adm_Pro3Layout);
        Adm_Pro3Layout.setHorizontalGroup(
            Adm_Pro3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Adm_Pro3Layout.createSequentialGroup()
                .addGroup(Adm_Pro3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Adm_Pro3Layout.createSequentialGroup()
                        .addContainerGap(85, Short.MAX_VALUE)
                        .addComponent(jLabel1))
                    .addGroup(Adm_Pro3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel11)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Adm_Pro3Layout.createSequentialGroup()
                .addContainerGap(87, Short.MAX_VALUE)
                .addComponent(jLabel12)
                .addGap(78, 78, 78))
            .addGroup(Adm_Pro3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Generar_Traslado, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(Adm_Pro3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Adm_Pro, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(Adm_Pro3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Conciliar, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(Adm_Pro3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Adm_Emp, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(Adm_Pro3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Comprar, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(Adm_Pro3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Generar_Reporte, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(Adm_Pro3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Transportar, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(Adm_Pro3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Ver_Kardex, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(Adm_Pro3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Cerrar_Sesion, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE)
                .addContainerGap())
        );
        Adm_Pro3Layout.setVerticalGroup(
            Adm_Pro3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Adm_Pro3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12)
                .addGap(18, 18, 18)
                .addComponent(Adm_Pro)
                .addGap(18, 18, 18)
                .addComponent(Adm_Emp)
                .addGap(18, 18, 18)
                .addComponent(Comprar)
                .addGap(18, 18, 18)
                .addComponent(Generar_Traslado)
                .addGap(18, 18, 18)
                .addComponent(Generar_Reporte)
                .addGap(18, 18, 18)
                .addComponent(Transportar)
                .addGap(18, 18, 18)
                .addComponent(Conciliar)
                .addGap(18, 18, 18)
                .addComponent(Ver_Kardex)
                .addGap(18, 18, 18)
                .addComponent(Cerrar_Sesion)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Adm_Pro3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Adm_Pro3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void TransportarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TransportarActionPerformed
        //setVisible(false);
        TransportarMercancía transportarmercancia = new TransportarMercancía();
        transportarmercancia.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        transportarmercancia.setVisible(true);

}//GEN-LAST:event_TransportarActionPerformed

    private void ConciliarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConciliarActionPerformed
        //setVisible(false);
        ConciliarMercancía conciliarmercancia = new ConciliarMercancía();
        conciliarmercancia.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        conciliarmercancia.setVisible(true);
}//GEN-LAST:event_ConciliarActionPerformed

    private void Cerrar_SesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cerrar_SesionActionPerformed
        this.setVisible(false);
        IniciarSesión.setTipo(0);
        new IniciarSesión().setVisible(true);
}//GEN-LAST:event_Cerrar_SesionActionPerformed

    private void Generar_ReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Generar_ReporteActionPerformed
        //setVisible(false);
        GenerarReporte generarReporte = new GenerarReporte();
        generarReporte.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        generarReporte.setVisible(true);
    }//GEN-LAST:event_Generar_ReporteActionPerformed

    private void ComprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComprarActionPerformed
        //setVisible(false);
        ComprarMercancía comprarmercancia = new ComprarMercancía();
        comprarmercancia.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        comprarmercancia.setVisible(true);
    }//GEN-LAST:event_ComprarActionPerformed

    private void Adm_EmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Adm_EmpActionPerformed
        //setVisible(false);
        AdministrarEmpleado administrarempleado = new AdministrarEmpleado();
        administrarempleado.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        administrarempleado.setVisible(true);
    }//GEN-LAST:event_Adm_EmpActionPerformed

    private void Adm_ProActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Adm_ProActionPerformed
        //setVisible(false);
        AdministrarProducto admproducto = new AdministrarProducto();
        admproducto.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        admproducto.setVisible(true);
    }//GEN-LAST:event_Adm_ProActionPerformed

    private void Generar_TrasladoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Generar_TrasladoActionPerformed
        //setVisible(false);
        OrdendeTraslado ordendetraslado = new OrdendeTraslado();
        ordendetraslado.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        ordendetraslado.setVisible(true);
    }//GEN-LAST:event_Generar_TrasladoActionPerformed

    private void Ver_KardexActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ver_KardexActionPerformed
        //setVisible(false);
        VisualizarKárdex visualizarKardex = new VisualizarKárdex();
        visualizarKardex.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        visualizarKardex.setVisible(true);
    }//GEN-LAST:event_Ver_KardexActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Aplicación_GL().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Adm_Emp;
    private javax.swing.JButton Adm_Pro;
    private javax.swing.JPanel Adm_Pro3;
    private javax.swing.JButton Cerrar_Sesion;
    private javax.swing.JButton Comprar;
    private javax.swing.JButton Conciliar;
    private javax.swing.JButton Generar_Reporte;
    private javax.swing.JButton Generar_Traslado;
    private javax.swing.JButton Transportar;
    private javax.swing.JButton Ver_Kardex;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    // End of variables declaration//GEN-END:variables

}
