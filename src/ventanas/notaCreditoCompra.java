package ventanas;

import Acceso.Menu;
import clases.Conexion;
import clases.Metodos;
import static clases.Metodos.limpiarTabla;
import com.toedter.calendar.JCalendar;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class notaCreditoCompra extends javax.swing.JFrame {

    String operacion="";
    String confirmar="";
    String mensaje="";
    boolean duplicado;
    
    public static String busqueda = "";

    
    public static String usuario; 
    public static String empleado;
    public static String nivel;
    public static String idUsuario;
    public static String idSucursal;
    public static String idPersonal;
    
    public notaCreditoCompra() {
        initComponents();
        btnCancelar.doClick();
        txtFecha.setDate(new JCalendar().getDate());
//        Metodos.cargarComboReferencia(cmbDepo, "depo_desc", "deposito", "sucur_id", Menu.idSucursal);
        
  
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        grilla = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        btnAgregar = new javax.swing.JButton();
        btnAnular = new javax.swing.JButton();
        btnGrabar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        btnBuscarArti = new javax.swing.JButton();
        txtCodArti = new javax.swing.JTextField();
        txtArti = new javax.swing.JTextField();
        txtPrecio = new javax.swing.JTextField();
        txtDescuento = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtCantidad = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtProvee = new javax.swing.JTextField();
        txtUsuarioCod = new javax.swing.JTextField();
        txtSucursal = new javax.swing.JTextField();
        txtTotal = new javax.swing.JTextField();
        txtFecha = new com.toedter.calendar.JDateChooser();
        txtCod = new javax.swing.JTextField();
        txtUsuario = new javax.swing.JTextField();
        txtcodProvee = new javax.swing.JTextField();
        cmb_nota_tipo = new javax.swing.JComboBox();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        cmb_motivo = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        txt_factura = new javax.swing.JTextField();
        txt_idCompra = new javax.swing.JTextField();

        jLabel5.setText("jLabel5");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Nota de compras");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        grilla.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        grilla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CODIGO", "DESCRIPCION", "CANTIDAD", "PRECIO UNT.", "EXENTA", "5%", "10%", "DESCUENTO", "SELECCIONAR"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        grilla.setGridColor(new java.awt.Color(153, 153, 153));
        grilla.setPreferredSize(new java.awt.Dimension(50, 224));
        grilla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                grillaMouseClicked(evt);
            }
        });
        grilla.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                grillaKeyPressed(evt);
            }
        });
        jScrollPane2.setViewportView(grilla);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 920, 111));

        jPanel6.setBackground(new java.awt.Color(0, 102, 102));
        jPanel6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 102, 102), null, null));

        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnAnular.setText("Anular");
        btnAnular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnularActionPerformed(evt);
            }
        });

        btnGrabar.setText("Grabar");
        btnGrabar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGrabarActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAnular, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnGrabar, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                    .addComponent(btnAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAnular, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnGrabar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(99, 450, 647, -1));

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jLabel8.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("COD");

        jLabel9.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("ARTICULO");

        jLabel10.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("PRECIO");

        jLabel11.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("DESCUENTO");

        btnBuscarArti.setText("...");
        btnBuscarArti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarArtiActionPerformed(evt);
            }
        });

        txtCodArti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodArtiActionPerformed(evt);
            }
        });

        txtArti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtArtiActionPerformed(evt);
            }
        });
        txtArti.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtArtiKeyPressed(evt);
            }
        });

        txtPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecioActionPerformed(evt);
            }
        });

        txtDescuento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDescuentoActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("CANTIDAD");

        txtCantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCantidadActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addGap(6, 6, 6)
                .addComponent(txtCodArti, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtArti, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBuscarArti)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtDescuento, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel15)
                        .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8)
                        .addComponent(jLabel9)
                        .addComponent(txtCodArti)
                        .addComponent(txtArti)
                        .addComponent(btnBuscarArti, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel10)
                        .addComponent(txtPrecio)
                        .addComponent(jLabel11)
                        .addComponent(txtDescuento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 213, 920, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel12.setText("Usuario:");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 60, -1, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel13.setText("Sucursal:");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 100, -1, -1));

        jLabel2.setFont(new java.awt.Font("Calibri", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 102));
        jLabel2.setText("Nota de compras");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 150, -1, 40));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel14.setText("Proveedor");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, -1, -1));

        txtProvee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtProveeActionPerformed(evt);
            }
        });
        txtProvee.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtProveeKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtProveeKeyReleased(evt);
            }
        });
        getContentPane().add(txtProvee, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 120, 150, 30));

        txtUsuarioCod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioCodActionPerformed(evt);
            }
        });
        getContentPane().add(txtUsuarioCod, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 50, 33, 30));

        txtSucursal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSucursalActionPerformed(evt);
            }
        });
        getContentPane().add(txtSucursal, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 90, 178, 30));

        txtTotal.setText("0");
        txtTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalActionPerformed(evt);
            }
        });
        getContentPane().add(txtTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 399, 159, 30));
        getContentPane().add(txtFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(721, 20, 180, -1));

        txtCod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodActionPerformed(evt);
            }
        });
        txtCod.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCodKeyPressed(evt);
            }
        });
        getContentPane().add(txtCod, new org.netbeans.lib.awtextra.AbsoluteConstraints(73, 11, 59, -1));

        txtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 50, 139, 30));

        txtcodProvee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcodProveeActionPerformed(evt);
            }
        });
        txtcodProvee.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtcodProveeKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtcodProveeKeyReleased(evt);
            }
        });
        getContentPane().add(txtcodProvee, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, 41, 30));

        cmb_nota_tipo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "...", "CREDITO", "DEBITO" }));
        cmb_nota_tipo.setEnabled(false);
        cmb_nota_tipo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmb_nota_tipoItemStateChanged(evt);
            }
        });
        cmb_nota_tipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_nota_tipoActionPerformed(evt);
            }
        });
        getContentPane().add(cmb_nota_tipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 10, 100, -1));

        jLabel24.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel24.setText("Nota Tipo:");
        getContentPane().add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(142, 13, -1, -1));

        jLabel25.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel25.setText("Código");
        getContentPane().add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 13, -1, -1));

        jLabel19.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel19.setText("Motivo Nota:");
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, -1, -1));

        cmb_motivo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "...", "DEVOLUCION", "DESCUENTO" }));
        cmb_motivo.setEnabled(false);
        cmb_motivo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmb_motivoItemStateChanged(evt);
            }
        });
        cmb_motivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_motivoActionPerformed(evt);
            }
        });
        getContentPane().add(cmb_motivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, 200, -1));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel3.setText("N°. Factura");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

        txt_factura.setText("<--F12");
        txt_factura.setEnabled(false);
        txt_factura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_facturaActionPerformed(evt);
            }
        });
        txt_factura.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_facturaKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_facturaKeyTyped(evt);
            }
        });
        getContentPane().add(txt_factura, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, 150, -1));
        getContentPane().add(txt_idCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 90, 50, -1));

        setSize(new java.awt.Dimension(957, 549));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents



    
    
    
    
    private void grillaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_grillaKeyPressed
    }//GEN-LAST:event_grillaKeyPressed

    private void grillaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_grillaMouseClicked
        int respuesta=5;
        respuesta=JOptionPane.showConfirmDialog(null, "¿Desea devolver este producto?");
        int fila = grilla.getSelectedRow();
        if (respuesta==0) {
        
            String cod = grilla.getValueAt(fila, 0).toString();
            String descri = grilla.getValueAt(fila, 1).toString();
            String cantidad = grilla.getValueAt(fila, 2).toString();
            String precio = grilla.getValueAt(fila, 3).toString();
            String exenta = grilla.getValueAt(fila, 4).toString();
            String iva5 = grilla.getValueAt(fila, 5).toString();
            String iva10 = grilla.getValueAt(fila, 6).toString();
            
            txtCodArti.setText(cod);
            txtArti.setText(descri);
            txtPrecio.setText(precio);
            txtCantidad.setText(cantidad);
            txtCantidad.requestFocus();
        }else if (respuesta==1){
            Metodos.eliminarFila(grilla, fila);
        }else if (respuesta==2) {
            txt_factura.requestFocus();
        }
        
        
        
        
    }//GEN-LAST:event_grillaMouseClicked

    private void btnBuscarArtiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarArtiActionPerformed
        producto.busqueda="pediCompra";
        new producto().setVisible(true);
    }//GEN-LAST:event_btnBuscarArtiActionPerformed

    private void txtProveeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtProveeActionPerformed
        
    }//GEN-LAST:event_txtProveeActionPerformed

    public void traerFechaActual(){
        Calendar cal = Calendar.getInstance();
        String fecha = cal.get(cal.DATE)+"/"+cal.get(cal.MONTH)+"/"+cal.get(cal.YEAR);
        txtFecha.setDateFormatString(fecha);
    }
    
    
    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        txtCod.setEditable(false);
        txtSucursal.setEditable(false);
        txtFecha.setEnabled(false);
        txtUsuarioCod.setEditable(false);
        txtProvee.setEditable(false);
        txtCodArti.setEditable(false);
        txtArti.setEditable(false);
        txtPrecio.setEditable(false);
        txtDescuento.setEditable(false);
        txtTotal.setEditable(false);
        txtUsuario.setEditable(false);
        txtcodProvee.setEditable(false);
        
        
        
        txtCod.setText("");
        txtcodProvee.setText("");
        txtUsuarioCod.setText("");
        txtUsuario.setText("");
        txtSucursal.setText("");
        txtProvee.setText("");
        txtCodArti.setText("");
        txtArti.setText("");
        txtPrecio.setText("");
        txtDescuento.setText("");
        txtTotal.setText("0");
        
        limpiarTabla(grilla);
        
        btnAgregar.setEnabled(true);
        btnAnular.setEnabled(true);
        btnSalir.setEnabled(true);
        btnGrabar.setEnabled(false);
        btnCancelar.setEnabled(false);
        btnBuscarArti.setEnabled(false);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        cmb_nota_tipo.setEnabled(true);
        cmb_nota_tipo.requestFocus();
        
        
        btnAgregar.setEnabled(false);
        btnAnular.setEnabled(false);
        btnSalir.setEnabled(false);
        btnGrabar.setEnabled(true);
        btnCancelar.setEnabled(true);
        
        
        txtCod.setText(Metodos.siguienteCodigo("cod_nota", "nota_de_compras"));
        
        operacion="agregar";
        confirmar="¿Desea grabar el nuevo registro?";
        mensaje="Registro grabado con exito";
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void txtUsuarioCodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioCodActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuarioCodActionPerformed

    private void txtSucursalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSucursalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSucursalActionPerformed

    private void txtTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotalActionPerformed

    private void txtCodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodActionPerformed
        btnGrabar.doClick();
    }//GEN-LAST:event_txtCodActionPerformed

    private void txtCodArtiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodArtiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodArtiActionPerformed

    private void txtArtiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtArtiActionPerformed
        traerPrecio();
        txtPrecio.setEditable(true);
        txtPrecio.requestFocus();
    }//GEN-LAST:event_txtArtiActionPerformed

    private void txtPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecioActionPerformed
        txtDescuento.setEditable(true);
        txtDescuento.requestFocus();
    }//GEN-LAST:event_txtPrecioActionPerformed

    
    public void sumarRepetido(){
        for (int fila = 0; fila <grilla.getRowCount(); fila++) {
           String codigoEnRenglon = (String)grilla.getValueAt(fila, 0); 
            if (txtCodArti.getText().equals(codigoEnRenglon)) {
             grilla.setValueAt(Integer.parseInt(txtDescuento.getText())+(Integer.parseInt(grilla.getValueAt(fila, 2).toString())), fila, 2);
            }
        }
    }
    
    
    
    
    
    private void txtDescuentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDescuentoActionPerformed
       
        int total=0;
        for (int fila = 0; fila <grilla.getRowCount(); fila++) {
         String codigoEnRenglon = (String)grilla.getValueAt(fila, 0);
         if (txtCodArti.getText().equals(codigoEnRenglon)) {
             grilla.setValueAt(Integer.parseInt(txtDescuento.getText())+(Integer.parseInt(grilla.getValueAt(fila, 2).toString())), fila, 2);
             grilla.setValueAt(Integer.parseInt(txtPrecio.getText()), fila, 3);
             grilla.setValueAt(Integer.parseInt(grilla.getValueAt(fila, 2).toString())*Integer.parseInt(txtPrecio.getText()), fila, 4);
             txtCodArti.setText("");
             txtArti.setText("");
             txtDescuento.setText("");
             txtPrecio.setText("");
             txtArti.requestFocus();
             
             
                for (int fila2 = 0; fila2 <grilla.getRowCount(); fila2++) {
                    total = total+Integer.parseInt((grilla.getValueAt(fila2, 4).toString()));
                 
                }
                txtTotal.setText(Integer.toString(total));
             return;
               //JOptionPane.showMessageDialog(null, "ya hay");
         
            }
         
         
        }
        Metodos.cargarTabla(grilla, new Object[]{
                txtCodArti.getText().trim(),
                txtArti.getText().trim(),
                txtDescuento.getText().trim(),
                txtPrecio.getText().trim(),
                Integer.parseInt(txtDescuento.getText())*Integer.parseInt(txtPrecio.getText())
                });
        txtCodArti.setText("");
        txtArti.setText("");
        txtDescuento.setText("");
        txtPrecio.setText("");
        txtArti.requestFocus();
        
       for (int fila2 = 0; fila2 <grilla.getRowCount(); fila2++) {
                    total = total+Integer.parseInt((grilla.getValueAt(fila2, 4).toString()));
                 
        }
       txtTotal.setText(Integer.toString(total));
        
//        for (int fila2 = 0; fila2 <grilla.getRowCount(); fila2++) {
//             total = Integer.parseInt((grilla.getValueAt(fila2, 4).toString()));
//             total = total+inicio;
//             
//        }
//        txtTotal.setText(Integer.toString(Integer.parseInt(txtTotal.getText())+(total)));
         
        
        
//        for (int fila2 = 0; fila2 <grilla.getRowCount(); fila2++) {
//            for (int dos = 0; dos <grilla.getRowCount(); dos++) {
//                 total = total+Integer.parseInt(grilla.getValueAt(fila2, 4).toString());
//                 
//             }
//             txtTotal.setText(Integer.toString(total));
//        }
        
        
        
    }//GEN-LAST:event_txtDescuentoActionPerformed

    private void txtArtiKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtArtiKeyPressed
        if (txtArti.getText().equals("") && evt.getKeyCode() == evt.VK_F2){
            producto.busqueda="presuProvee";
            new producto().setVisible(true);
          
        }
    }//GEN-LAST:event_txtArtiKeyPressed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void txtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuarioActionPerformed

   
    
    
    
    private void btnGrabarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGrabarActionPerformed
        int respuesta=5;
        
        respuesta=JOptionPane.showConfirmDialog(null, confirmar);
        
        
        
        if(respuesta==0){
            String sql="";
            String sqldetalle="";
            String sqlStock="";
            if(operacion.equals("agregar")){
                sql="Insert into nota_de_compras (nota_fecha, nota_tipo, nota_motivo, compra_id, usu_id, emp_id, sucur_id, pro_id)"
                        + " values ('"+
                        Metodos.dameFechaFormateadaSQL(txtFecha.getDate())+"', '"+
                        cmb_nota_tipo.getSelectedItem().toString()+"', '"+
                        cmb_motivo.getSelectedItem().toString()+"', "+
                        txt_idCompra.getText().trim()+", "+
                        idUsuario+","+
                        idPersonal+","+
                        idSucursal+","+
                        txtcodProvee.getText().trim()+")";        
            }
            
//            if(operacion.equals("anular")){
//                sql="update presu_prove set"
//                        + " estado = 'ANULADO' "
//                        + " where pre_pro_nro = "+txtCod.getText();
//                
//            }
            
            
            Conexion cn=new Conexion();
            try {
                cn.conectar();
                System.out.println(sql);
                cn.actualizar(sql);
                int cantidadFilas=grilla.getRowCount();
                if (operacion.equals("agregar")) {
                        for (int i = 0; i < cantidadFilas; i++) {
                            sqldetalle="insert into detalle_nc (cod_nota, cod_depo, sucur_id, cod_materia, det_nota_cant, "
                                    + "det_not_precio, det_not_exenta, det_iva_5, det_iva_10) values("
                            +Metodos.ultimoCodigo("cod_nota", "nota_de_compras")+","
                            +traerDeposito(txt_idCompra.getText().trim())+","
                            +idSucursal+","
                            +grilla.getValueAt(i, 0)+","
                            +grilla.getValueAt(i, 2)+","
                            +grilla.getValueAt(i, 3)+","
                            +grilla.getValueAt(i, 4)+","
                            +grilla.getValueAt(i, 5)+","
                            +grilla.getValueAt(i, 6)+")";
                           
                            cn.actualizar(sqldetalle);
                            
                            sqlStock= "update stock_materia_prima set cantidad = cantidad+"+grilla.getValueAt(i, 2)+" where sucur_id = "+idSucursal+" and cod_materia = "+grilla.getValueAt(i, 0)+" and cod_depo = "+traerDeposito(txt_idCompra.getText().trim())+"";
                            cn.actualizar(sqlStock);
                }   
                }
//                cn.actualizar("update pedido_compra set estado = 'UTILIZADO' where ped_id = "+txtPedido_compra.getText());
                JOptionPane.showMessageDialog(null, mensaje);
                btnCancelar.doClick();

                
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(notaCreditoCompra.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, ex.getMessage());
            } catch (SQLException ex) {
                Logger.getLogger(notaCreditoCompra.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }
        }
         btnCancelar.doClick();
        
    }//GEN-LAST:event_btnGrabarActionPerformed

    private void btnAnularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnularActionPerformed
        txtCod.setEditable(true);
        txtCod.requestFocus();
        txtFecha.setEnabled(true);
        
        btnAgregar.setEnabled(false);
        btnAnular.setEnabled(false);
        btnSalir.setEnabled(false);
        btnGrabar.setEnabled(true);
        btnCancelar.setEnabled(true);
     
        
        operacion="anular";
        confirmar="¿Desea anular este registro?";
        mensaje="Registro anulado con exito";
    }//GEN-LAST:event_btnAnularActionPerformed

    private void txtProveeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtProveeKeyPressed
        if (txtProvee.getText().equals("") && evt.getKeyCode() == evt.VK_F2){
            proveedor.busqueda="presupuesto_proveedor";
            new proveedor().setVisible(true);
          
        }
    }//GEN-LAST:event_txtProveeKeyPressed

    private void txtProveeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtProveeKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtProveeKeyReleased

    private void txtcodProveeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcodProveeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcodProveeActionPerformed

    private void txtcodProveeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcodProveeKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcodProveeKeyPressed

    private void txtcodProveeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcodProveeKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcodProveeKeyReleased

    private void txtCodKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodKeyPressed
        if (txtCod.getText().equals("") && evt.getKeyCode() == evt.VK_F2){
            busPedidoCompra.busqueda="presupuesto_proveedor";
            new busPedidoCompra().setVisible(true);
          
        }
    }//GEN-LAST:event_txtCodKeyPressed

    private void cmb_motivoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmb_motivoItemStateChanged
        if (cmb_motivo.getSelectedItem().equals("DEVOLUCION"))   {
            this.txt_factura.setEnabled(true);
            this.txt_factura.requestFocus();
            cmb_motivo.setEnabled(false);
            txt_factura.setText("");
        }
        else{//descuento
            this.txt_factura.setEnabled(true);
            this.txt_factura.requestFocus();
            cmb_motivo.setEnabled(false);
            txt_factura.setText("");
        }
    }//GEN-LAST:event_cmb_motivoItemStateChanged

    private void cmb_motivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_motivoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmb_motivoActionPerformed

    private void txt_facturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_facturaActionPerformed
         Conexion cn = new Conexion();
        try {
            cn.conectar();
            ResultSet pedi = cn.consultar("SELECT * from compra\n"
                    + "where nro_factura LIKE '%" + txt_factura.getText() + "%' and estado != 'ANULADO'\n"
                    + "ORDER BY compra_id"); //order by ordena de menor a mayor, si se quiere de mayor a menor se le agrega desc al final
            Metodos.limpiarTabla(grilla);
            
            if (pedi.isBeforeFirst()) {
                while (pedi.next()) {
                    txtcodProvee.setText(pedi.getString("pro_id"));
                    txtProvee.setText(traerNombreProveedor(pedi.getString("pro_id")));
                    txt_idCompra.setText(pedi.getString("compra_id"));
                }
            } else {

                JOptionPane.showMessageDialog(null, "No hay registros en la base de datos");
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(clientes.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "No se encuentra " + ex.getMessage());
        } catch (SQLException ex) {
            Logger.getLogger(clientes.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        seleccionarCompraDetalles();
        
    }//GEN-LAST:event_txt_facturaActionPerformed

    private void txt_facturaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_facturaKeyPressed

    }//GEN-LAST:event_txt_facturaKeyPressed

    private void txt_facturaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_facturaKeyTyped
        
    }//GEN-LAST:event_txt_facturaKeyTyped

    private void cmb_nota_tipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_nota_tipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmb_nota_tipoActionPerformed

    private void cmb_nota_tipoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmb_nota_tipoItemStateChanged
        cmb_motivo.setEnabled(true);
        cmb_motivo.requestFocus();
    }//GEN-LAST:event_cmb_nota_tipoItemStateChanged

    private void txtCantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCantidadActionPerformed
        int total = 0;
        int pos = -1;
        //buscamos si hay codigos repeditos guardar la posicion
        for (int fila = 0; fila < grilla.getRowCount(); fila++) {
            if (grilla.getValueAt(fila, 0).toString().equals(txtCodArti.getText().trim())) {
                pos = fila;
                break;
            }
        }

        if (pos >= 0) {
            grilla.setValueAt((Integer.parseInt(grilla.getValueAt(pos, 2).toString()))-(Integer.parseInt(txtCantidad.getText())), pos, 2);
            if ((int) (Integer.parseInt(grilla.getValueAt(pos, 5).toString())) > 0) {
                grilla.setValueAt((int) ((Integer.parseInt(grilla.getValueAt(pos, 2).toString()) * Integer.parseInt(grilla.getValueAt(pos, 3).toString())) * 0.21), pos, 5);
            } else if ((int) (Integer.parseInt(grilla.getValueAt(pos, 6).toString())) > 0) {
                grilla.setValueAt((int) ((Integer.parseInt(grilla.getValueAt(pos, 2).toString()) * Integer.parseInt(grilla.getValueAt(pos, 3).toString())) * 0.11), pos, 6);
            }
           
        } 

//        compras.txt_iva5.setText(String.valueOf(Metodos.sumarColumna(compras.grilla, 5)));
//        compras.txt_iva10.setText(String.valueOf(Metodos.sumarColumna(compras.grilla, 6)));
//        compras.txt_to_iva.setText(String.valueOf(Metodos.sumarColumna(compras.grilla, 5) + Metodos.sumarColumna(compras.grilla, 6)));
//        compras.txtTotal.setText(String.valueOf(Metodos.sumarColumna(compras.grilla, 5) + Metodos.sumarColumna(compras.grilla, 6) + Metodos.sumarColumna(compras.grilla, 7)));

        txtCodArti.setText("");
        txtArti.setText("");
        txtPrecio.setText("");
        txtDescuento.setText("");
        txtCantidad.setText("");
        txtCantidad.requestFocus();
    }//GEN-LAST:event_txtCantidadActionPerformed

    
    
    public String dameFechaActual(){
       java.util.Date fecha = new Date();
       SimpleDateFormat formateador = new SimpleDateFormat("dd-MM-yyyy");
       JOptionPane.showMessageDialog(null, formateador.format(fecha));
       return formateador.format(fecha);
    }
    
    public String traerIva(String cod) {
        try {
            Conexion cn = new Conexion();
            cn.conectar();
            ResultSet ivaa = cn.consultar("select iva from materia_prima where cod_materia = " + cod);
            if (ivaa.isBeforeFirst()) {
                while (ivaa.next()) {
                    String iva = ivaa.getString("iva");
                    return iva;
                }
            } else {
                JOptionPane.showMessageDialog(null, "No hay registros en la base de datos");
            }

        } catch (SQLException ex) {
            Logger.getLogger(compras.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(compras.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "";
    }
    public String cantidadEnStock(String cod_sucu, String cod_materia, String cod_depo ) {
        try {
            Conexion cn = new Conexion();
            cn.conectar();
            ResultSet ivaa = cn.consultar("select cantidad from stock_materia_prima where sucur_id = "+cod_sucu+" and cod_materia = "+cod_materia+" and cod_depo = "+cod_depo+"");
            if (ivaa.isBeforeFirst()) {
                while (ivaa.next()) {
                    String iva = ivaa.getString("cantidad");
                    return iva;
                }
            } else {
                JOptionPane.showMessageDialog(null, "No hay registros en la base de datos");
            }

        } catch (SQLException ex) {
            Logger.getLogger(compras.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(compras.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "";
    }
    
    public String traerNombreProveedor(String codProvee){
        Conexion cn=new Conexion();
        String proveedor;
        try {
            cn.conectar();
            ResultSet sucursal=cn.consultar("select pro_nom from proveedor where pro_id = "+codProvee); //order by ordena de menor a mayor, si se quiere de mayor a menor se le agrega desc al final
            
            if(sucursal.isBeforeFirst()){
                while(sucursal.next()){
                  proveedor=sucursal.getString("pro_nom");
                    return proveedor;
                }
            }else{
                JOptionPane.showMessageDialog(null, "No hay registros en la base de datos");
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(cajas.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "No se encuentra "+ex.getMessage());
        } catch (SQLException ex) {
            Logger.getLogger(cajas.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,ex.getMessage());
        }
        return "";
    }
    public String traerDeposito(String compraid){
        Conexion cn=new Conexion();
        String deposito;
        try {
            cn.conectar();
            ResultSet depo=cn.consultar("select cod_depo from compra_detalle where compra_id = "+compraid); //order by ordena de menor a mayor, si se quiere de mayor a menor se le agrega desc al final
            
            if(depo.isBeforeFirst()){
                while(depo.next()){
                  deposito=depo.getString("cod_depo");
                    return deposito;
                }
            }else{
                JOptionPane.showMessageDialog(null, "No hay registros en la base de datos");
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(cajas.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "No se encuentra "+ex.getMessage());
        } catch (SQLException ex) {
            Logger.getLogger(cajas.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,ex.getMessage());
        }
        return "";
    }
    
    
    public void traerPrecio(){
        Conexion cn=new Conexion();
        
        try {
            cn.conectar();
            ResultSet sucursal=cn.consultar("select mat_precio from materia_prima where cod_materia = "+txtCodArti.getText()); //order by ordena de menor a mayor, si se quiere de mayor a menor se le agrega desc al final
            
            if(sucursal.isBeforeFirst()){
                while(sucursal.next()){
                  txtPrecio.setText(sucursal.getString("mat_precio"));
                }
            }else{
                JOptionPane.showMessageDialog(null, "No hay registros en la base de datos");
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(cajas.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "No se encuentra "+ex.getMessage());
        } catch (SQLException ex) {
            Logger.getLogger(cajas.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,ex.getMessage());
        }
    }
    
   
    private void seleccionarCompraDetalles() {
//        compras.txtProvee.setText(dameNombrePorCodido(codPro));
        Conexion cn = new Conexion();

        try {
            cn.conectar();
            ResultSet detalles = cn.consultar("select * from v_detalle_compra where nro_factura ilike '" + txt_factura.getText().trim() + "'"); //order by ordena de menor a mayor, si se quiere de mayor a menor se le agrega desc al final
            Metodos.limpiarTabla(grilla);
            if (detalles.isBeforeFirst()) {
                while (detalles.next()) {
                    Metodos.cargarTabla(grilla, new Object[]{
                        detalles.getString("cod_materia"),
                        detalles.getString("mat_desc"),
                        detalles.getString("cantidad"),
                        detalles.getString("monto"),
                        detalles.getString("exenta"),
                        detalles.getString("iva_5"),
                        detalles.getString("iva_10")
                    });
                }
            } else {
                JOptionPane.showMessageDialog(null, "No hay registros en la base de datos");
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(busPedidoCompra.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "No se encuentra " + ex.getMessage());
        } catch (SQLException ex) {
            Logger.getLogger(busPedidoCompra.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        
        
        
        
        

    } 
    
    
    
//    public String idCombo(){
//        Conexion cn = new Conexion();
//        String cod="";
//        try {
//            cn.conectar();
//            ResultSet resultado=cn.consultar("select cod_depo from deposito where depo_desc = '"+cmbDepo.getSelectedItem().toString()+"'"); //order by ordena de menor a mayor, si se quiere de mayor a menor se le agrega desc al final
//            System.out.println("select cod_depo from deposito where depo_desc = '"+cmbDepo.getSelectedItem().toString()+"'");
//            if (resultado.isBeforeFirst()){
//                while(resultado.next()){
//                  return cod = resultado.getString("cod_depo");
//                }
//            }
//            
//           
//            
//            
//        } catch (ClassNotFoundException ex) {
//            Logger.getLogger(pedido_de_compra.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (SQLException ex) {
//            Logger.getLogger(pedido_de_compra.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        return cod;
//    }
    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new notaCreditoCompra().setVisible(true);
            }
        });
    }
 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnAnular;
    private javax.swing.JButton btnBuscarArti;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnGrabar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox cmb_motivo;
    private javax.swing.JComboBox cmb_nota_tipo;
    public static javax.swing.JTable grilla;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane2;
    public static javax.swing.JTextField txtArti;
    private javax.swing.JTextField txtCantidad;
    public static javax.swing.JTextField txtCod;
    public static javax.swing.JTextField txtCodArti;
    private javax.swing.JTextField txtDescuento;
    public static com.toedter.calendar.JDateChooser txtFecha;
    private javax.swing.JTextField txtPrecio;
    public static javax.swing.JTextField txtProvee;
    public static javax.swing.JTextField txtSucursal;
    public static javax.swing.JTextField txtTotal;
    public static javax.swing.JTextField txtUsuario;
    public static javax.swing.JTextField txtUsuarioCod;
    private javax.swing.JTextField txt_factura;
    private javax.swing.JTextField txt_idCompra;
    public static javax.swing.JTextField txtcodProvee;
    // End of variables declaration//GEN-END:variables
 
}
