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
import static ventanas.pedido_de_compra.txtCod;


public class presupuesto_de_compra extends javax.swing.JFrame {

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
    
    public presupuesto_de_compra() {
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
        jLabel15 = new javax.swing.JLabel();
        txtPedido_compra = new javax.swing.JTextField();
        con_pedido_cbx = new javax.swing.JCheckBox();

        jLabel5.setText("jLabel5");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("PRESUPUESTO DE COMPRA");

        grilla.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        grilla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CODIGO", "DESCRIPCION", "CANTIDAD", "PRECIO UNT.", "SUBTOTAL"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true, false
            };

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
        grilla.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                grillaPropertyChange(evt);
            }
        });
        grilla.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                grillaKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                grillaKeyReleased(evt);
            }
        });
        jScrollPane2.setViewportView(grilla);

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
        jLabel11.setText("CANT.");

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
                .addComponent(txtArti, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBuscarArti)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPrecio, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(txtCodArti)
                    .addComponent(txtArti)
                    .addComponent(btnBuscarArti, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel10)
                    .addComponent(txtPrecio)
                    .addComponent(jLabel11)
                    .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel12.setText("Usuario:");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel13.setText("Sucursal:");

        jLabel2.setFont(new java.awt.Font("Calibri", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 102));
        jLabel2.setText("Presupuesto de compra");

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel14.setText("Proveedor");

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

        txtUsuarioCod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioCodActionPerformed(evt);
            }
        });

        txtSucursal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSucursalActionPerformed(evt);
            }
        });

        txtTotal.setText("0");
        txtTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalActionPerformed(evt);
            }
        });

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

        txtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioActionPerformed(evt);
            }
        });

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

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel15.setText("Pedido");

        txtPedido_compra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPedido_compraActionPerformed(evt);
            }
        });
        txtPedido_compra.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPedido_compraKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPedido_compraKeyReleased(evt);
            }
        });

        con_pedido_cbx.setSelected(true);
        con_pedido_cbx.setText("Con Pedido");
        con_pedido_cbx.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                con_pedido_cbxMouseClicked(evt);
            }
        });
        con_pedido_cbx.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                con_pedido_cbxKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtCod, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtFecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel14))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtSucursal)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtUsuarioCod)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(txtcodProvee, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtProvee, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtPedido_compra)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(con_pedido_cbx)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(89, 89, 89)
                                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 647, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jScrollPane2)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtFecha, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtCod, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(txtUsuarioCod, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(txtSucursal, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtProvee, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtcodProvee, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPedido_compra, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(con_pedido_cbx))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)))
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(949, 549));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents



    
    
    
    
    private void grillaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_grillaKeyPressed
    }//GEN-LAST:event_grillaKeyPressed

    private void grillaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_grillaMouseClicked
     
    }//GEN-LAST:event_grillaMouseClicked

    private void btnBuscarArtiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarArtiActionPerformed
        materiaPrima.busqueda="pediCompra";
        new materiaPrima().setVisible(true);
    }//GEN-LAST:event_btnBuscarArtiActionPerformed

    private void txtProveeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtProveeActionPerformed
        txtPedido_compra.setEditable(true);
        txtPedido_compra.requestFocus();
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
        txtCantidad.setEditable(false);
        txtTotal.setEditable(false);
        txtUsuario.setEditable(false);
        txtcodProvee.setEditable(false);
        txtPedido_compra.setEditable(false);
        
        
        
        txtCod.setText("");
        txtcodProvee.setText("");
        txtUsuarioCod.setText("");
        txtPedido_compra.setText("");
        txtUsuario.setText("");
        txtSucursal.setText("");
        txtProvee.setText("");
        txtCodArti.setText("");
        txtArti.setText("");
        txtPrecio.setText("");
        txtCantidad.setText("");
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
        txtProvee.setEditable(true);
        txtProvee.requestFocus();
        txtFecha.setEnabled(true);
        
        btnAgregar.setEnabled(false);
        btnAnular.setEnabled(false);
        btnSalir.setEnabled(false);
        btnGrabar.setEnabled(true);
        btnCancelar.setEnabled(true);
        
        
        txtCod.setText(Metodos.siguienteCodigo("pre_pro_nro", "presu_prove"));
        
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
        txtCantidad.setEditable(true);
        txtCantidad.requestFocus();
    }//GEN-LAST:event_txtPrecioActionPerformed

    
    public void sumarRepetido(){
        for (int fila = 0; fila <grilla.getRowCount(); fila++) {
           String codigoEnRenglon = (String)grilla.getValueAt(fila, 0); 
            if (txtCodArti.getText().equals(codigoEnRenglon)) {
             grilla.setValueAt(Integer.parseInt(txtCantidad.getText())+(Integer.parseInt(grilla.getValueAt(fila, 2).toString())), fila, 2);
            }
        }
    }
    
    
    
    
    
    private void txtCantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCantidadActionPerformed
       
        int total=0;
        for (int fila = 0; fila <grilla.getRowCount(); fila++) {
         String codigoEnRenglon = (String)grilla.getValueAt(fila, 0);
         if (txtCodArti.getText().equals(codigoEnRenglon)) {
             grilla.setValueAt(Integer.parseInt(txtCantidad.getText())+(Integer.parseInt(grilla.getValueAt(fila, 2).toString())), fila, 2);
             grilla.setValueAt(Integer.parseInt(txtPrecio.getText()), fila, 3);
             grilla.setValueAt(Integer.parseInt(grilla.getValueAt(fila, 2).toString())*Integer.parseInt(txtPrecio.getText()), fila, 4);
             txtCodArti.setText("");
             txtArti.setText("");
             txtCantidad.setText("");
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
                txtCantidad.getText().trim(),
                txtPrecio.getText().trim(),
                Integer.parseInt(txtCantidad.getText())*Integer.parseInt(txtPrecio.getText())
                });
        txtCodArti.setText("");
        txtArti.setText("");
        txtCantidad.setText("");
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
        
        
        
    }//GEN-LAST:event_txtCantidadActionPerformed

    private void txtArtiKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtArtiKeyPressed
        if (txtArti.getText().equals("") && evt.getKeyCode() == evt.VK_F2){
            materiaPrima.busqueda="presuProvee";
            new materiaPrima().setVisible(true);
          
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
            if(operacion.equals("agregar")){
                sql="Insert into presu_prove (estado, fecha, pro_id, usu_id, emp_id, sucur_id, ped_id)"
                        + " values ('ACTIVO', '"+
                        Metodos.dameFechaFormateadaSQL(txtFecha.getDate())+"', "+
                        txtcodProvee.getText().trim()+", "+
                        idUsuario+","+
                        idPersonal+","+
                        idSucursal+","+
                        txtPedido_compra.getText().trim()+")";
                        
            }
            
            if(operacion.equals("anular")){
                sql="update presu_prove set"
                        + " estado = 'ANULADO' "
                        + " where pre_pro_nro = "+txtCod.getText();
                
            }
            
            
            Conexion cn=new Conexion();
            try {
                cn.conectar();
                System.out.println(sql);
                cn.actualizar(sql);
                int cantidadFilas=grilla.getRowCount();
                if (operacion.equals("agregar")) {
                        for (int i = 0; i < cantidadFilas; i++) {
                            sqldetalle="insert into detalle_presupuesto_pro (pre_pro_nro, cod_materia, cantidad, precio) values("
                            +Metodos.ultimoCodigo("pre_pro_nro", "presu_prove")+","
                            +grilla.getValueAt(i, 0)+","
                            +grilla.getValueAt(i, 2)+","
                            +grilla.getValueAt(i, 3)+")";
                           
                            cn.actualizar(sqldetalle);
                            
                }   
                }
                cn.actualizar("update pedido_compra set estado = 'UTILIZADO' where ped_id = "+txtPedido_compra.getText());
                JOptionPane.showMessageDialog(null, mensaje);
                Metodos.imprimirPorCodigoUnico("/src/reportes/reportePresupuestoCompraCodigoUnico.jasper", 
                        Integer.parseInt(txtCod.getText()));
                btnCancelar.doClick();

                
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(presupuesto_de_compra.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, ex.getMessage());
            } catch (SQLException ex) {
                Logger.getLogger(presupuesto_de_compra.class.getName()).log(Level.SEVERE, null, ex);
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

    private void txtPedido_compraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPedido_compraActionPerformed
        txtArti.setEditable(true);
        txtArti.requestFocus();
        btnBuscarArti.setEnabled(true);
    }//GEN-LAST:event_txtPedido_compraActionPerformed

    private void txtPedido_compraKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPedido_compraKeyPressed
        if (txtPedido_compra.getText().equals("") && evt.getKeyCode() == evt.VK_F2){
            busPedidoCompra.busqueda="pedido_desdePresupuesto";
            new busPedidoCompra().setVisible(true);
          
        }
    }//GEN-LAST:event_txtPedido_compraKeyPressed

    private void txtPedido_compraKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPedido_compraKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPedido_compraKeyReleased

    private void txtCodKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodKeyPressed
        if (txtCod.getText().equals("") && evt.getKeyCode() == evt.VK_F2){
            busPedidoCompra.busqueda="presupuesto_proveedor";
            new busPedidoCompra().setVisible(true);
          
        }
    }//GEN-LAST:event_txtCodKeyPressed

    private void grillaPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_grillaPropertyChange
        
    }//GEN-LAST:event_grillaPropertyChange

    private void grillaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_grillaKeyReleased
        if(grilla.getSelectedColumn() == 3){
            int cantidad = Integer.parseInt(grilla.getValueAt(grilla.getSelectedRow(), 2).toString()) ;
            int precio = Integer.parseInt(grilla.getValueAt(grilla.getSelectedRow(),3).toString()) ;
            grilla.setValueAt( cantidad * precio ,grilla.getSelectedRow(), 4);
            int total= 0;
            for (int fila2 = 0; fila2 <grilla.getRowCount(); fila2++) {
                    total = total+Integer.parseInt((grilla.getValueAt(fila2, 4).toString()));
                 
                }
                txtTotal.setText(Integer.toString(total));
             return;
        }
    }//GEN-LAST:event_grillaKeyReleased

    private void con_pedido_cbxKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_con_pedido_cbxKeyReleased
       
    }//GEN-LAST:event_con_pedido_cbxKeyReleased

    private void con_pedido_cbxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_con_pedido_cbxMouseClicked
         if(con_pedido_cbx.isSelected()){
            txtPedido_compra.setText("");
            txtPedido_compra.requestFocus();
            txtPedido_compra.setEnabled(true);
        }else{
            txtPedido_compra.setText("0");
            txtPedido_compra.setEnabled(false);
            
        }
    }//GEN-LAST:event_con_pedido_cbxMouseClicked

    
    
    public String dameFechaActual(){
       java.util.Date fecha = new Date();
       SimpleDateFormat formateador = new SimpleDateFormat("dd-MM-yyyy");
       JOptionPane.showMessageDialog(null, formateador.format(fecha));
       return formateador.format(fecha);
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
                new presupuesto_de_compra().setVisible(true);
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
    private javax.swing.JCheckBox con_pedido_cbx;
    public static javax.swing.JTable grilla;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
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
    public static com.toedter.calendar.JDateChooser txtFecha;
    public static javax.swing.JTextField txtPedido_compra;
    private javax.swing.JTextField txtPrecio;
    public static javax.swing.JTextField txtProvee;
    public static javax.swing.JTextField txtSucursal;
    public static javax.swing.JTextField txtTotal;
    public static javax.swing.JTextField txtUsuario;
    public static javax.swing.JTextField txtUsuarioCod;
    public static javax.swing.JTextField txtcodProvee;
    // End of variables declaration//GEN-END:variables
 
}
