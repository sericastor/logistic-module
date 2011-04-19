package Vista;

import Controlador.CAdministrarProducto;
import Controlador.CConciliar;
import Modelo.Producto;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * ConciliarMercancía.java
 *
 * Created on 27/03/2011, 05:11:21 PM
 */

/**
 *
 * @author USUARIO
 */
public class ConciliarMercancía extends javax.swing.JFrame {

    /** Creates new form ConciliarMercancía */
    CConciliar conciliar = new CConciliar();
    public ConciliarMercancía() {
        initComponents();
        IDPro.setEditable(false);
        NombrePro.setEditable(false);
        MarcaPro.setEditable(false);
        EstadoPro.setEnabled(false);
        PrecioPro.setEditable(false);
        CostoPro.setEditable(false);
        CantidadSPro.setEditable(false);
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
        jPanel5 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        ListaPro = new javax.swing.JList();
        jLabel18 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        CIDPro = new javax.swing.JTextField();
        CNombrePro = new javax.swing.JTextField();
        CCostoPro = new javax.swing.JTextField();
        CEstadoPro = new javax.swing.JComboBox();
        CPrecioPro = new javax.swing.JTextField();
        CMarcaPro = new javax.swing.JTextField();
        ConsultarPro = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        IDPro = new javax.swing.JTextField();
        NombrePro = new javax.swing.JTextField();
        CostoPro = new javax.swing.JTextField();
        EstadoPro = new javax.swing.JComboBox();
        PrecioPro = new javax.swing.JTextField();
        MarcaPro = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        CantidadSPro = new javax.swing.JTextField();
        CantidadFPro = new javax.swing.JTextField();
        MenuPrincipal = new javax.swing.JButton();
        ConciliarPro = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Conciliar mercancía");

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel17.setText("Resultado de la búsqueda :");

        ListaPro.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        ListaPro.setSelectionBackground(new java.awt.Color(255, 0, 0));
        ListaPro.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                ListaProValueChanged(evt);
            }
        });
        jScrollPane3.setViewportView(ListaPro);

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel18.setText("Características del producto:");

        jPanel6.setBackground(new java.awt.Color(0, 0, 0));
        jPanel6.setForeground(new java.awt.Color(255, 255, 255));
        jPanel6.setPreferredSize(new java.awt.Dimension(305, 177));

        jLabel19.setBackground(new java.awt.Color(0, 0, 0));
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("ID");

        jLabel20.setBackground(new java.awt.Color(0, 0, 0));
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Nombre");

        jLabel21.setBackground(new java.awt.Color(0, 0, 0));
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Estado");

        jLabel22.setBackground(new java.awt.Color(0, 0, 0));
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Precio de costo");

        jLabel23.setBackground(new java.awt.Color(0, 0, 0));
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Precio de venta");

        jLabel24.setBackground(new java.awt.Color(0, 0, 0));
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("Marca");

        CIDPro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CIDProActionPerformed(evt);
            }
        });

        CNombrePro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CNombreProActionPerformed(evt);
            }
        });

        CCostoPro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CCostoProActionPerformed(evt);
            }
        });

        CEstadoPro.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Almacenado", "Bloqueado", "En tránsito", "Perdido", "Descontinuado" }));

        CPrecioPro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CPrecioProActionPerformed(evt);
            }
        });

        CMarcaPro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CMarcaProActionPerformed(evt);
            }
        });

        ConsultarPro.setBackground(new java.awt.Color(255, 255, 255));
        ConsultarPro.setForeground(new java.awt.Color(51, 51, 51));
        ConsultarPro.setText("Consultar");
        ConsultarPro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsultarProActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Ingrese dato(s) del producto que desea buscar:");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel22)
                            .addComponent(jLabel24))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(CIDPro, javax.swing.GroupLayout.DEFAULT_SIZE, 309, Short.MAX_VALUE)
                                    .addComponent(CCostoPro, javax.swing.GroupLayout.DEFAULT_SIZE, 309, Short.MAX_VALUE)
                                    .addComponent(CMarcaPro, javax.swing.GroupLayout.DEFAULT_SIZE, 309, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 256, Short.MAX_VALUE)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel23)
                                            .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(CEstadoPro, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(CPrecioPro, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)))
                                    .addComponent(ConsultarPro, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(CNombrePro, javax.swing.GroupLayout.DEFAULT_SIZE, 759, Short.MAX_VALUE)))
                    .addComponent(jLabel1))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(CIDPro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CEstadoPro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(CNombrePro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CCostoPro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22)
                    .addComponent(CPrecioPro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(CMarcaPro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(ConsultarPro))
                    .addComponent(jLabel24))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setForeground(new java.awt.Color(255, 255, 255));
        jPanel7.setPreferredSize(new java.awt.Dimension(305, 177));

        jLabel25.setBackground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("ID");

        jLabel26.setBackground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("Nombre");

        jLabel27.setBackground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("Estado");

        jLabel28.setBackground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("Precio de costo");

        jLabel29.setBackground(new java.awt.Color(255, 255, 255));
        jLabel29.setText("Precio de venta");

        jLabel30.setBackground(new java.awt.Color(255, 255, 255));
        jLabel30.setText("Marca");

        IDPro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IDProActionPerformed(evt);
            }
        });

        NombrePro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NombreProActionPerformed(evt);
            }
        });

        CostoPro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CostoProActionPerformed(evt);
            }
        });

        EstadoPro.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Almacenado", "Bloqueado", "En tránsito", "Perdido", "Descontinuado" }));

        PrecioPro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrecioProActionPerformed(evt);
            }
        });

        MarcaPro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MarcaProActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel28)
                    .addComponent(jLabel30))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(IDPro, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                            .addComponent(CostoPro, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                            .addComponent(MarcaPro, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel29)
                            .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(EstadoPro, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(PrecioPro, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)))
                    .addComponent(NombrePro, javax.swing.GroupLayout.DEFAULT_SIZE, 340, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(IDPro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EstadoPro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel27))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(NombrePro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CostoPro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel28)
                    .addComponent(PrecioPro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel29))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(MarcaPro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel30))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 178, Short.MAX_VALUE)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 437, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, 856, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel17)
                .addGap(88, 88, 88)
                .addComponent(jLabel18)
                .addContainerGap(445, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(jLabel18))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jLabel32.setBackground(new java.awt.Color(0, 0, 0));
        jLabel32.setForeground(new java.awt.Color(255, 255, 255));
        jLabel32.setText("Cantidad de unidades en Inventario del sistema");

        jLabel33.setBackground(new java.awt.Color(0, 0, 0));
        jLabel33.setForeground(new java.awt.Color(255, 255, 255));
        jLabel33.setText("Cantidad de unidades en Inventario físico");

        CantidadSPro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CantidadSProActionPerformed(evt);
            }
        });

        CantidadFPro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CantidadFProActionPerformed(evt);
            }
        });

        MenuPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        MenuPrincipal.setText("Cerrar esta ventana");
        MenuPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuPrincipalActionPerformed(evt);
            }
        });

        ConciliarPro.setBackground(new java.awt.Color(255, 255, 255));
        ConciliarPro.setText("Conciliar mercancía");
        ConciliarPro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConciliarProActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel33, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel32, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CantidadSPro, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CantidadFPro, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 245, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(MenuPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ConciliarPro, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CantidadSPro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ConciliarPro))
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CantidadFPro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MenuPrincipal))
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

    private void CantidadFProActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CantidadFProActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_CantidadFProActionPerformed

    private void CantidadSProActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CantidadSProActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_CantidadSProActionPerformed

    private void MarcaProActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MarcaProActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_MarcaProActionPerformed

    private void PrecioProActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrecioProActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_PrecioProActionPerformed

    private void CostoProActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CostoProActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_CostoProActionPerformed

    private void NombreProActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NombreProActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_NombreProActionPerformed

    private void IDProActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IDProActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_IDProActionPerformed

    private void ConsultarProActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsultarProActionPerformed
        // TODO add your handling code here:

        consulta.removeAll(consulta);

        if(CCostoPro.getText().equals("")){precioCosto = 0;}
        else{precioCosto = Integer.parseInt(CCostoPro.getText());}
        if(CPrecioPro.getText().equals("")){precioVenta = 0;}
        else{precioVenta = Integer.parseInt(CPrecioPro.getText());}
        if(CIDPro.getText().equals("")){ID = 0;}
        else{ID = Integer.parseInt(CIDPro.getText());}

        nombre = CNombrePro.getText();
        marca = CMarcaPro.getText();
        estado = (String) CEstadoPro.getSelectedItem();
        Producto producto = new Producto();

        producto.setEstado(estado);
        producto.setId(ID);
        producto.setMarca(marca);
        producto.setNombre(nombre);
        producto.setPrecioCosto(precioCosto);
        producto.setPrecioVenta(precioVenta);

        consulta = administrador.buscarProductos(producto);
        //Agregar elementos de la consulta a la Lista
        if(consulta.size()==0){
            JOptionPane.showMessageDialog(null, "No se han encontrado coincidencias", "Atención", JOptionPane.WARNING_MESSAGE);
            DefaultListModel elementos = new DefaultListModel();
            ListaPro.setModel(elementos);
            IDPro.setText("");
            NombrePro.setText("");
            MarcaPro.setText("");
            PrecioPro.setText("");
            CostoPro.setText("");
            EstadoPro.setSelectedIndex(0);
        }
        else{
            DefaultListModel elementos = new DefaultListModel();
            int j = consulta.size();
            for(int i = 0; i<j;i++){
                elementos.addElement(consulta.get(i).getNombre()+" - "+consulta.get(i).getMarca());
            }
            ListaPro.setModel(elementos);
        }
}//GEN-LAST:event_ConsultarProActionPerformed

    private void CMarcaProActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CMarcaProActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_CMarcaProActionPerformed
   
    private void CPrecioProActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CPrecioProActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_CPrecioProActionPerformed

    private void CCostoProActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CCostoProActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_CCostoProActionPerformed

    private void CNombreProActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CNombreProActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_CNombreProActionPerformed

    private void CIDProActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CIDProActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_CIDProActionPerformed

    private void ConciliarProActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConciliarProActionPerformed
        if(CantidadSPro.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Debe realizar una consulta y seleccionar un objeto de la lista para conciliar la mercancía","Atención",JOptionPane.WARNING_MESSAGE);
        }
        else if(CantidadFPro.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Debe ingresar la cantidad de mercancía disponible en el inventario físico para conciliar","Atención",JOptionPane.WARNING_MESSAGE);
        }
        else{
        int[] resultado = new int[5];
        resultado = conciliar.numeroProductosAlmacenados(NombrePro.getText(),MarcaPro.getText(),Integer.parseInt(CantidadFPro.getText()));
        if (resultado == null){
            JOptionPane.showMessageDialog(null,"La cantidad de objetos perdidos no coincide con los encontrados, No sea ladrón!","NO EVADA IMPUESTOS",JOptionPane.WARNING_MESSAGE);
        }
        else{
        JOptionPane.showMessageDialog(null, "Hay " + resultado[0] + " productos almacenados, " + resultado[1] + " productos bloqueados, "+ resultado[2] + " productos en tránsito, "+ resultado[3]+" productos perdidos y " + resultado[4] + " productos descontinuados.", "Conciliar Mercancía", JOptionPane.INFORMATION_MESSAGE);
        CantidadSPro.setText(String.valueOf(conciliar.totalCantidadPro(consulta.get(index).getNombre(),consulta.get(index).getMarca())));
        }
    }//GEN-LAST:event_ConciliarProActionPerformed
}
    private void MenuPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuPrincipalActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_MenuPrincipalActionPerformed

    private void ListaProValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_ListaProValueChanged
        // TODO add your handling code here:
        index = ListaPro.getSelectedIndex();
        if(index>=0){
            IDPro.setText(String.valueOf(consulta.get(index).getId()));
            NombrePro.setText(String.valueOf(consulta.get(index).getNombre()));
            MarcaPro.setText(String.valueOf(consulta.get(index).getMarca()));
            EstadoPro.setSelectedItem(consulta.get(index).getEstado());
            CostoPro.setText(String.valueOf(consulta.get(index).getPrecioCosto()));
            PrecioPro.setText(String.valueOf(consulta.get(index).getPrecioVenta()));
            CantidadSPro.setText(String.valueOf(conciliar.totalCantidadPro(consulta.get(index).getNombre(),consulta.get(index).getMarca())));
        }
    }//GEN-LAST:event_ListaProValueChanged

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConciliarMercancía().setVisible(true);
            }
        });
    }

    private int ID;
    private double precioCosto;
    private double precioVenta;
    private String nombre;
    private String marca;
    private String estado;
    private CAdministrarProducto administrador = new CAdministrarProducto();
    private ArrayList<Producto> consulta = new ArrayList<Producto>();
    private int index;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CCostoPro;
    private javax.swing.JComboBox CEstadoPro;
    private javax.swing.JTextField CIDPro;
    private javax.swing.JTextField CMarcaPro;
    private javax.swing.JTextField CNombrePro;
    private javax.swing.JTextField CPrecioPro;
    private javax.swing.JTextField CantidadFPro;
    private javax.swing.JTextField CantidadSPro;
    private javax.swing.JButton ConciliarPro;
    private javax.swing.JButton ConsultarPro;
    private javax.swing.JTextField CostoPro;
    private javax.swing.JComboBox EstadoPro;
    private javax.swing.JTextField IDPro;
    private javax.swing.JList ListaPro;
    private javax.swing.JTextField MarcaPro;
    private javax.swing.JButton MenuPrincipal;
    private javax.swing.JTextField NombrePro;
    private javax.swing.JTextField PrecioPro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane3;
    // End of variables declaration//GEN-END:variables

}
