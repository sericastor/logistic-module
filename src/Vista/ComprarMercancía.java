package Vista;

import Controlador.CComprar;
import Modelo.Factura;
import Modelo.Producto;
import Modelo.Proveedor;
import Modelo.Sistema;
import java.util.ArrayList;
import javax.swing.DefaultCellEditor;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.TableColumn;
import javax.swing.event.*;
import javax.swing.table.DefaultTableModel;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * ComprarMercancía.java
 *
 * Created on 27/03/2011, 11:00:05 AM
 */

/**
 *
 * @author USUARIO
 */
public class ComprarMercancía extends javax.swing.JFrame implements TableModelListener {

    /** Creates new form ComprarMercancía */
    public ComprarMercancía() {
        initComponents();
        TotalconIva.setEditable(false);
        TotalsinIva.setEditable(false);
        IvaTotal.setEditable(false);
        modelo = (DefaultTableModel) CompraPro.getModel();
        CompraPro.setModel(modelo);
        CompraPro.getModel().addTableModelListener(this);
        for (int i = 0; i < 6; i++){
            datos.add("lol");
        }

        //Nombre de Producto se selecciona de la lista de productos creados
        TableColumn nombreProd = CompraPro.getColumnModel().getColumn(1);
        TableColumn marcaProd = CompraPro.getColumnModel().getColumn(2);
       
        JComboBox listaNombrep = new JComboBox();
        JComboBox listaMarcap = new JComboBox();
        String[] nombrep = new String[Sistema.getProductos().size()];
        String[] marcap = new String[Sistema.getProductos().size()];
        int i = 0;
        for (Producto p:Sistema.getProductos()){
            if(p.getEstado().equals("Almacenado")){
                nombrep[i] = p.getNombre();
                marcap[i]= p.getMarca();
                i++;
            }
           
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        IDProv = new javax.swing.JTextField();
        NombreProv = new javax.swing.JTextField();
        TelefonoProv = new javax.swing.JTextField();
        DireccionProv = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        FechaFactura = new javax.swing.JFormattedTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        CompraPro = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        TotalsinIva = new javax.swing.JTextField();
        IvaTotal = new javax.swing.JTextField();
        TotalconIva = new javax.swing.JTextField();
        MenuPrincipalB = new javax.swing.JButton();
        GuardarFactura = new javax.swing.JButton();
        NumFactura = new javax.swing.JTextField();
        eliminarFila = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Comprar mercancía");

        Adm_Pro.setBackground(new java.awt.Color(0, 0, 0));
        Adm_Pro.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Datos del proveedor");

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ID");

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nombre");

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Dirección");

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Teléfono");

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Datos de la compra");

        jLabel7.setBackground(new java.awt.Color(0, 0, 0));
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Factura número");

        jLabel8.setBackground(new java.awt.Color(0, 0, 0));
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Fecha");

        CompraPro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Cantidad", "Nombre del producto", "Marca del producto", "Precio de costo unitario", "Iva", "Precio de costo total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                true, true, true, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(CompraPro);

        jLabel9.setBackground(new java.awt.Color(0, 0, 0));
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Total parcial");

        jLabel10.setBackground(new java.awt.Color(0, 0, 0));
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("IVA total");

        jLabel11.setBackground(new java.awt.Color(0, 0, 0));
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Factura total");

        MenuPrincipalB.setBackground(new java.awt.Color(255, 255, 255));
        MenuPrincipalB.setText("Cerrar esta ventana");
        MenuPrincipalB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuPrincipalBActionPerformed(evt);
            }
        });

        GuardarFactura.setBackground(new java.awt.Color(255, 255, 255));
        GuardarFactura.setText("Guardar");
        GuardarFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarFacturaActionPerformed(evt);
            }
        });

        eliminarFila.setBackground(new java.awt.Color(255, 255, 255));
        eliminarFila.setText("Eliminar fila");
        eliminarFila.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarFilaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Adm_ProLayout = new javax.swing.GroupLayout(Adm_Pro);
        Adm_Pro.setLayout(Adm_ProLayout);
        Adm_ProLayout.setHorizontalGroup(
            Adm_ProLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Adm_ProLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Adm_ProLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(Adm_ProLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(IDProv, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(NombreProv, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(DireccionProv, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TelefonoProv, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(773, Short.MAX_VALUE))
            .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 1523, Short.MAX_VALUE)
            .addGroup(Adm_ProLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addContainerGap(1387, Short.MAX_VALUE))
            .addGroup(Adm_ProLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(NumFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(FechaFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(1053, Short.MAX_VALUE))
            .addGroup(Adm_ProLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1499, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Adm_ProLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(eliminarFila, javax.swing.GroupLayout.DEFAULT_SIZE, 234, Short.MAX_VALUE)
                .addGap(560, 560, 560)
                .addComponent(GuardarFactura, javax.swing.GroupLayout.DEFAULT_SIZE, 233, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(MenuPrincipalB, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addGroup(Adm_ProLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Adm_ProLayout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(TotalsinIva, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(Adm_ProLayout.createSequentialGroup()
                        .addGroup(Adm_ProLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(6, 6, 6)
                        .addGroup(Adm_ProLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(IvaTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TotalconIva, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())))
        );
        Adm_ProLayout.setVerticalGroup(
            Adm_ProLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Adm_ProLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Adm_ProLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(IDProv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NombreProv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TelefonoProv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(DireccionProv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Adm_ProLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(FechaFactura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(NumFactura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Adm_ProLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(TotalsinIva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Adm_ProLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(IvaTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MenuPrincipalB)
                    .addComponent(GuardarFactura)
                    .addComponent(eliminarFila))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Adm_ProLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(TotalconIva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void GuardarFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarFacturaActionPerformed
       //TODO a esto se le quita el comentario

       if(administrador.validarFecha(FechaFactura.getText())){
       
       

       if(IDProv.getText().equals("") || NombreProv.getText().equals("") || DireccionProv.getText().equals("") || TelefonoProv.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Existen campos nulos en los datos de Proveedor", "Atencion", JOptionPane.WARNING_MESSAGE);
       }
       else{
          try{
              nfactura=Integer.parseInt(NumFactura.getText());
            if(administrador.validarNumero(nfactura)){
           try{
               id=Integer.parseInt(IDProv.getText());
           }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Ingrese un dato numérico", "Id incorrecto", JOptionPane.WARNING_MESSAGE);
            }
           direccion=DireccionProv.getText();
           nombre=NombreProv.getText();
           try{
               telefono=Long.parseLong(TelefonoProv.getText());
           }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Ingrese un dato numérico", "Teléfono incorrecto", JOptionPane.WARNING_MESSAGE);
           }

            if(administrador.validarIdProv(id) && administrador.validarDirProv(direccion) && administrador.validarNomProv(nombre) && administrador.validarTelProv(telefono)){
            proveedor.setId(id);
            proveedor.setDireccion(direccion);
            proveedor.setNombre(nombre);
            proveedor.setTelefono(telefono);
            

       Factura factura = new Factura();

       if(NumFactura.getText().equals("") || FechaFactura.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Existen campos nulos en los datos de Factura", "Atencion", JOptionPane.WARNING_MESSAGE);
       }
       
       else{
            Factura f = new Factura();
            factura.setNumero(Integer.parseInt(NumFactura.getText()));
            factura.setFecha(FechaFactura.getText());
            factura.setProveedor(proveedor);
            TotalsinIva.setText(String.valueOf(administrador.obtenerTotalParcial(CompraPro)));
            IvaTotal.setText(String.valueOf(administrador.obtenerTotalIva(CompraPro)));
            TotalconIva.setText(String.valueOf(administrador.ObtenerTotal(Double.valueOf(TotalsinIva.getText()),Double.valueOf(IvaTotal.getText()) )));
            administrador.agregarCantidadProducto(nombreActual, marcaActual,cantidad);
            for(int i=0;i<CompraPro.getRowCount();i++){
                if(CompraPro.getValueAt(i, 0)==null || CompraPro.getValueAt(i, 1)==null || CompraPro.getValueAt(i,2)==null){}
                else{
                   
                    Producto encontrado = administrador.buscarProductoAlmacenado(CompraPro.getValueAt(i, 1).toString(), CompraPro.getValueAt(i,2).toString());
                    Producto comprado = new Producto();
                    comprado.setCantidad(Integer.parseInt(CompraPro.getValueAt(i, 0).toString()));
                    System.out.println(Integer.parseInt(CompraPro.getValueAt(i, 0).toString()));
                    comprado.setEstado(encontrado.getEstado());
                    comprado.setId(encontrado.getId());
                    comprado.setIva(encontrado.getIva());
                    comprado.setMarca(encontrado.getMarca());
                    comprado.setNombre(encontrado.getNombre());
                    comprado.setPrecioCosto(encontrado.getPrecioCosto());
                    System.out.println(encontrado.getPrecioCosto());
                    comprado.setPrecioVenta(encontrado.getPrecioVenta());
                    administrador.agregarCantidadProducto((String) CompraPro.getValueAt(i, 1),(String) CompraPro.getValueAt(i, 2) , Integer.parseInt(CompraPro.getValueAt(i, 0).toString()));
                    f = administrador.agregarProductoEnFactura(comprado,factura);


                }
            }
            for(int i=0;i<f.getProductosFactura().size();i++){
                System.out.println(f.getProductosFactura().get(i).getNombre()+"-"+f.getProductosFactura().get(i).getCantidad());
            }
            f.setFecha(factura.getFecha());
            f.setNumero(factura.getNumero());
            f.setProveedor(factura.getProveedor());
            f.setTotal(factura.getTotal());
            f.setTotalParcial(factura.getTotalParcial());
            administrador.agregarFacturaEnSistema(f);
            if(!administrador.validarTablaVacia(CompraPro)){
            JOptionPane.showMessageDialog(null, "Se ha guardado la compra de mercancia", "Compra", JOptionPane.INFORMATION_MESSAGE);
            this.setVisible(false);
            ComprarMercancía compra = new ComprarMercancía();
            compra.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            compra.setVisible(true);
            primeraFilaIncompleta = 0;
            }
       }
       }
       }
          }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Ingrese un dato numérico", "Factura incorrecto", JOptionPane.WARNING_MESSAGE);

          }
       }
       }
       
       //System.out.println(administrador.getFacturas().get(0).getProductosFactura());
       //for(int i=0;i<administrador.getSizeProductos();i++){
       //    System.out.println(administrador.verProductos(i).getCantidad());
       //}
       


    }//GEN-LAST:event_GuardarFacturaActionPerformed

    public void tableChanged(TableModelEvent e) {
        if (editable){
            int fila = e.getFirstRow();
            int columna = CompraPro.getSelectedColumn();
            if (primeraFilaIncompleta != fila){
                JOptionPane.showMessageDialog(null, "No puede modificar esa fila", "Error", JOptionPane.WARNING_MESSAGE);
                try{
                    editable = false;
                    if (!datos.get((6*fila) + columna).equals("lol")){
                        CompraPro.setValueAt(datos.get((6*fila) + columna),
                        fila, columna);
                    }
                   
                    editable = true;
                }
                catch(Exception ex){
                    editable = false;
                    CompraPro.setValueAt(null, fila, columna);
                    editable = true;
                }
            }
        else{
            String nombre = "";
            String marca = "";
            int costo = 0;
            if (CompraPro.getValueAt(fila, 1) != null){
                nombre = (String) CompraPro.getValueAt(fila, 1);
            }
            if (CompraPro.getValueAt(fila, 2) != null){
                marca = (String) CompraPro.getValueAt(fila, 2);
            }
            if (CompraPro.getValueAt(fila, 0) != null){
                costo = Integer.parseInt(CompraPro.getValueAt(fila, 0).toString());
            }


            if(!(nombreActual.equals(nombre) && marcaActual.equals(marca) && costoActual == costo)){
                marcaActual = marca;
                //System.out.println(nombre+" - "+marca+" - "+c);
                if (costoActual == costo){
                    String[] nombrep = new String[Sistema.getProductos().size()];
                    String[] marcap = new String[Sistema.getProductos().size()];
                    //Nombre de Producto se selecciona de la lista de productos creados
                    TableColumn nombreProd = CompraPro.getColumnModel().getColumn(1);
                    TableColumn marcaProd = CompraPro.getColumnModel().getColumn(2);
                    JComboBox listaNombrep = new JComboBox();
                    JComboBox listaMarcap = new JComboBox();
                    ArrayList<Producto> prods = new ArrayList<Producto>();
                    if (CompraPro.getValueAt(fila, 1) == null || CompraPro.getValueAt(fila, 2) == null){

                        if (nombreActual.equals(nombre)){
                            prods = administrador.buscarProductosPorMarca(marca);
                            for (int i = 0; i < nombrep.length; i++){
                                nombrep[i] = "";
                            }
                            for(int i = 0; i < prods.size(); i++){
                                nombrep[i] = prods.get(i).getNombre();
                            }
                        }
                        else{
                            nombreActual = nombre;
                            prods = administrador.buscarProductosPorNombre(nombre);
                            for (int i = 0; i < marcap.length; i++){
                                marcap[i]= "";
                            }
                            for(int i = 0; i < prods.size(); i++){
                                marcap[i] = prods.get(i).getMarca();
                            }
                        }
                    }
                    else{
                        if (hayProducto(administrador.buscarProductoAlmacenado((String)CompraPro.getValueAt(fila, 1), (String)CompraPro.getValueAt(fila, 2)))){
                            int i = 0;
                            for (Producto p:Sistema.getProductos()){
                                if(p.getEstado().equals("Almacenado")){
                                    nombrep[i] = p.getNombre();
                                    marcap[i]= p.getMarca();
                                    i++;
                                }
                            }
                            nombreActual = nombre;
                        }
                        else{
                            if (nombreActual.equals(nombre)){
                                nombreActual = "";
                                editable = false;
                                CompraPro.setValueAt("", fila, 1);
                                editable = true;
                                prods = administrador.buscarProductosPorMarca(marca);
                                for (int i = 0; i < nombrep.length; i++){
                                    nombrep[i] = "";
                                }
                                for(int i = 0; i < prods.size(); i++){
                                    nombrep[i] = prods.get(i).getNombre();
                                }
                            }
                            else{
                                nombreActual = nombre;
                                marcaActual = "";
                                editable = false;
                                CompraPro.setValueAt("", fila, 2);
                                editable = true;
                                prods = administrador.buscarProductosPorNombre(nombre);
                                for (int i = 0; i < marcap.length; i++){
                                    marcap[i] = "";
                                }
                                for(int i = 0; i < prods.size(); i++){
                                    marcap[i] = prods.get(i).getMarca();
                                }
                            }
                        }
                        if (CompraPro.getValueAt(fila, 1) != null){
                            nombreActual = (String) CompraPro.getValueAt(fila, 1);
                        }
                        if (CompraPro.getValueAt(fila, 2) != null){
                            marcaActual = (String) CompraPro.getValueAt(fila, 2);
                        }
                        if (CompraPro.getValueAt(fila, 0) != null){
                            costoActual = Integer.parseInt(CompraPro.getValueAt(fila, 0).toString());
                        }
                        editable = false;
                        CompraPro.setValueAt(null, fila, 3);
                        CompraPro.setValueAt(null, fila, 4);
                        CompraPro.setValueAt(null, fila, 5);
                        editable = true;

                    }

                    //productos.setModel(new javax.swing.DefaultComboBoxModel(new String[] { nombres.toString() }));
                    listaNombrep.setModel(new javax.swing.DefaultComboBoxModel(nombrep));
                    nombreProd.setCellEditor(new DefaultCellEditor(listaNombrep));
                    listaMarcap.setModel(new javax.swing.DefaultComboBoxModel(marcap));
                    marcaProd.setCellEditor(new DefaultCellEditor(listaMarcap));

                }
                costoActual = costo;
                if (!(nombreActual.equals("") || marcaActual.equals("") || costoActual == 0)){
                    Producto encontrado = administrador.buscarProductoAlmacenado(nombre, marca);
                    double precioCosto = encontrado.getPrecioCosto();
                    double iva = administrador.generarIVA(precioCosto, costo);
                    CompraPro.setValueAt(administrador.obtenerCostoTotal(costo,precioCosto),fila,5);
                    CompraPro.setValueAt(precioCosto, fila, 3);
                    CompraPro.setValueAt(iva, fila, 4);
                    for (int i = 6*fila; i < (6*fila)+12; i++){
                        datos.add("lol");
                    }
                    primeraFilaIncompleta++;
                    TotalsinIva.setText(String.valueOf(administrador.obtenerTotalParcial(CompraPro)));
                    IvaTotal.setText(String.valueOf(administrador.obtenerTotalIva(CompraPro)));
                    TotalconIva.setText(String.valueOf(administrador.ObtenerTotal(Double.valueOf(TotalsinIva.getText()),Double.valueOf(IvaTotal.getText()) )));
                    TableColumn nombreProd = CompraPro.getColumnModel().getColumn(1);
                    TableColumn marcaProd = CompraPro.getColumnModel().getColumn(2);

                    JComboBox listaNombrep = new JComboBox();
                    JComboBox listaMarcap = new JComboBox();
                    String[] nombrep = new String[Sistema.getProductos().size()];
                    String[] marcap = new String[Sistema.getProductos().size()];
                    int i = 0;
                    for (Producto p:Sistema.getProductos()){
                        if(p.getEstado().equals("Almacenado")){
                            nombrep[i] = p.getNombre();
                            marcap[i]= p.getMarca();
                            i++;
                        }

                    }

                    //productos.setModel(new javax.swing.DefaultComboBoxModel(new String[] { nombres.toString() }));
                    listaNombrep.setModel(new javax.swing.DefaultComboBoxModel(nombrep));
                    nombreProd.setCellEditor(new DefaultCellEditor(listaNombrep));
                    listaMarcap.setModel(new javax.swing.DefaultComboBoxModel(marcap));
                    marcaProd.setCellEditor(new DefaultCellEditor(listaMarcap));

                }
            }
            try{
                datos.set((6*fila) + columna,new String((String)CompraPro.getValueAt(fila, columna)));
            }
            catch(ClassCastException ex){
                datos.set((6*fila) + columna,new String(String.valueOf(CompraPro.getValueAt(fila, columna))));
            }
            if (tablaLlena()){
                editable = false;
                modelo.setRowCount(modelo.getRowCount() + 1);
                editable = true;
                TableColumn nombreProd = CompraPro.getColumnModel().getColumn(1);
                TableColumn marcaProd = CompraPro.getColumnModel().getColumn(2);

                JComboBox listaNombrep = new JComboBox();
                JComboBox listaMarcap = new JComboBox();
                String[] nombrep = new String[Sistema.getProductos().size()];
                String[] marcap = new String[Sistema.getProductos().size()];
                int i = 0;
                for (Producto p:Sistema.getProductos()){
                    if(p.getEstado().equals("Almacenado")){
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
            }
        }
    }
}

    private boolean tablaLlena(){
        for (int i = 0; i < CompraPro.getRowCount(); i++){
            if (CompraPro.getValueAt(i, 5) == null || CompraPro.getValueAt(i, 5).equals("")){
                return false;
            }
        }
        return true;
    }
    private void MenuPrincipalBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuPrincipalBActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_MenuPrincipalBActionPerformed

    private void eliminarFilaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarFilaActionPerformed
        if (CompraPro.getSelectedRow() < primeraFilaIncompleta){
            editable = false;
            for (int i = CompraPro.getSelectedRow(); i < primeraFilaIncompleta + 1 ||
                    CompraPro.getValueAt(i, 1) != null ||
                    CompraPro.getValueAt(i, 2) != null; i++){
                for (int j = 0; j < 6; j++){
                    try{
                        datos.set((i*6)+j, String.valueOf(CompraPro.getValueAt(i, j)));
                        CompraPro.setValueAt(CompraPro.getValueAt(i+1, j), i, j);
                    }
                    catch(NullPointerException ex){

                    }
                }
            }
            primeraFilaIncompleta--;
            CompraPro.setRowSelectionInterval(primeraFilaIncompleta, primeraFilaIncompleta);
            editable = true;
        }
     
    }//GEN-LAST:event_eliminarFilaActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ComprarMercancía().setVisible(true);
            }
        });
    }

    private int nfactura;
    private int id;
    private String direccion;
    private String nombre;
    private long telefono;
    private CComprar administrador = new CComprar();
    private int cantidad;
    private int costoActual = 0;
    private String nombreActual = "";
    private String marcaActual = "";
    private Proveedor proveedor = new Proveedor();
    private static DefaultTableModel modelo;
    private static int primeraFilaIncompleta = 0;
    private ArrayList<String> datos = new ArrayList<String>();
    private static boolean editable = true;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Adm_Pro;
    private javax.swing.JTable CompraPro;
    private javax.swing.JTextField DireccionProv;
    private javax.swing.JFormattedTextField FechaFactura;
    private javax.swing.JButton GuardarFactura;
    private javax.swing.JTextField IDProv;
    private javax.swing.JTextField IvaTotal;
    private javax.swing.JButton MenuPrincipalB;
    private javax.swing.JTextField NombreProv;
    private javax.swing.JTextField NumFactura;
    private javax.swing.JTextField TelefonoProv;
    private javax.swing.JTextField TotalconIva;
    private javax.swing.JTextField TotalsinIva;
    private javax.swing.JButton eliminarFila;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables

    private boolean hayProducto(Producto producto) {
        for (Producto p:Sistema.getProductos()){
            if (producto == p){
                return true;
            }
        }
        return false;
    }
}


