package ventanas;

import clases.Conexion;
import clases.Metodos;
import com.toedter.calendar.JCalendar;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;



public class compras extends javax.swing.JFrame {

    String operacion = "";
    String confirmar = "";
    String mensaje = "";
    boolean duplicado;

    public static String busqueda = "";

    public static String usuario;
    public static String empleado;
    public static String nivel;
    public static String idUsuario;
    public static String idSucursal;
    public static String idPersonal;

    public compras() {
        initComponents();
         txtFecha.setDate(new JCalendar().getDate());
         btnCancelar.doClick();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel2 = new javax.swing.JLabel();
        txtCod = new javax.swing.JTextField();
        txtSucursal = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtFecha = new com.toedter.calendar.JDateChooser();
        cmbDeposito = new javax.swing.JComboBox<>();
        jLabel32 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        cmbOrden = new javax.swing.JComboBox<>();
        jLabel31 = new javax.swing.JLabel();
        txtOrden = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        txtFactura = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        txtCodProvee = new javax.swing.JTextField();
        txtProvee = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        chx_contado = new javax.swing.JCheckBox();
        chx_credito = new javax.swing.JCheckBox();
        cmb_cuota = new javax.swing.JComboBox<>();
        jLabel29 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel35 = new javax.swing.JLabel();
        txt_cod_arti = new javax.swing.JTextField();
        txt_arti = new javax.swing.JTextField();
        jLabel36 = new javax.swing.JLabel();
        txt_precio = new javax.swing.JTextField();
        jLabel37 = new javax.swing.JLabel();
        txt_cantidad = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        grilla = new javax.swing.JTable();
        jLabel38 = new javax.swing.JLabel();
        txt_iva5 = new javax.swing.JTextField();
        jLabel39 = new javax.swing.JLabel();
        txt_iva10 = new javax.swing.JTextField();
        jLabel40 = new javax.swing.JLabel();
        txt_to_iva = new javax.swing.JTextField();
        jLabel41 = new javax.swing.JLabel();
        txtTotal = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        btnAgregar = new javax.swing.JButton();
        btnAnular = new javax.swing.JButton();
        btnGrabar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtCodUsuario = new javax.swing.JTextField();
        txtUsuario = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Calibri", 0, 36)); // NOI18N
        jLabel2.setText("Compras");

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

        txtSucursal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSucursalActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setText("Sucursal:");

        cmbDeposito.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3" }));

        jLabel32.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel32.setText("DEPOSITO");

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel30.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setText("ORDEN DE COMPRA?");

        cmbOrden.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SI", "NO" }));
        cmbOrden.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbOrdenItemStateChanged(evt);
            }
        });
        cmbOrden.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cmbOrdenKeyPressed(evt);
            }
        });

        jLabel31.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(255, 255, 255));
        jLabel31.setText("Nº ORDEN DE COMPRA:");

        txtOrden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOrdenActionPerformed(evt);
            }
        });
        txtOrden.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtOrdenKeyPressed(evt);
            }
        });

        jLabel33.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(255, 255, 255));
        jLabel33.setText("Nº FACTURA:");

        txtFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFacturaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel30)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbOrden, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel31)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtOrden, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel33)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtFactura)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30)
                    .addComponent(cmbOrden, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel31)
                    .addComponent(txtOrden, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel33)
                    .addComponent(txtFactura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));

        jLabel27.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("PROVEEDOR:");

        jLabel28.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("Condición de compra");

        buttonGroup1.add(chx_contado);
        chx_contado.setSelected(true);
        chx_contado.setText("Contado");
        chx_contado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chx_contadoActionPerformed(evt);
            }
        });

        buttonGroup1.add(chx_credito);
        chx_credito.setText("Crédito");
        chx_credito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chx_creditoActionPerformed(evt);
            }
        });

        cmb_cuota.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "6", "12", "18", "24" }));
        cmb_cuota.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmb_cuotaItemStateChanged(evt);
            }
        });
        cmb_cuota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_cuotaActionPerformed(evt);
            }
        });

        jLabel29.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setText("Cuotas");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(chx_contado, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(chx_credito, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel29)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmb_cuota, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel27)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCodProvee, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtProvee, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel28))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27)
                    .addComponent(txtCodProvee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtProvee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel28)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chx_contado)
                    .addComponent(chx_credito)
                    .addComponent(cmb_cuota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel29))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(0, 102, 102));
        jPanel3.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        jLabel35.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(255, 255, 255));
        jLabel35.setText("Articulos");

        txt_arti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_artiActionPerformed(evt);
            }
        });
        txt_arti.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_artiKeyPressed(evt);
            }
        });

        jLabel36.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(255, 255, 255));
        jLabel36.setText("Precio");

        txt_precio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_precioActionPerformed(evt);
            }
        });

        jLabel37.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(255, 255, 255));
        jLabel37.setText("Cantidad");

        txt_cantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_cantidadActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel35)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(txt_cod_arti, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_arti, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel36)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_precio, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel37)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel35)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel37)
                        .addComponent(txt_cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txt_cod_arti, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txt_arti, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel36)
                        .addComponent(txt_precio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        grilla.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        grilla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CODIGO", "DESCRIPCION", "CANTIDAD", "PRECIO UNT.", "EXENTA", "5%", "10%", "SUBTOTAL"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, true, true, false
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
        grilla.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                grillaKeyPressed(evt);
            }
        });
        jScrollPane2.setViewportView(grilla);
        if (grilla.getColumnModel().getColumnCount() > 0) {
            grilla.getColumnModel().getColumn(7).setHeaderValue("SUBTOTAL");
        }

        jLabel38.setBackground(new java.awt.Color(0, 0, 0));
        jLabel38.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel38.setText("Total 5%");

        jLabel39.setBackground(new java.awt.Color(0, 0, 0));
        jLabel39.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel39.setText("Total 10%");

        jLabel40.setBackground(new java.awt.Color(0, 0, 0));
        jLabel40.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel40.setText("Total IVA");

        jLabel41.setBackground(new java.awt.Color(0, 0, 0));
        jLabel41.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel41.setText("Total de la compra");

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

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setText("Código");

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel15.setText("Usuario");

        txtCodUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodUsuarioActionPerformed(evt);
            }
        });

        txtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 647, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel40)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txt_to_iva))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel39)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txt_iva10, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel38)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txt_iva5, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel41)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtFecha, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel14))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCod, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtSucursal))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel32)
                                .addGap(8, 8, 8)
                                .addComponent(cmbDeposito, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCodUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtUsuario)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 133, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addGap(101, 101, 101))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCod, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                            .addComponent(cmbDeposito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel32)
                            .addComponent(jLabel14))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel13)
                                    .addComponent(txtSucursal, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtCodUsuario)
                                    .addComponent(jLabel15)
                                    .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jLabel2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel38)
                    .addComponent(txt_iva5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel41)
                    .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel39)
                    .addComponent(txt_iva10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel40)
                    .addComponent(txt_to_iva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtCodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodActionPerformed
        btnGrabar.doClick();
    }//GEN-LAST:event_txtCodActionPerformed

    private void txtSucursalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSucursalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSucursalActionPerformed

    private void grillaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_grillaMouseClicked

    }//GEN-LAST:event_grillaMouseClicked

    private void grillaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_grillaKeyPressed

    }//GEN-LAST:event_grillaKeyPressed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        cmbDeposito.setEnabled(true);
        cmbOrden.setEnabled(true);
        cmbDeposito.requestFocus();
        cmbDeposito.setPopupVisible(true);

        txtFecha.setEnabled(true);

        btnAgregar.setEnabled(false);
        btnAnular.setEnabled(false);
        btnSalir.setEnabled(false);
        btnGrabar.setEnabled(true);
        btnCancelar.setEnabled(true);

        txtCod.setText(Metodos.siguienteCodigo("ped_id", "pedido_compra"));

        operacion = "agregar";
        confirmar = "¿Desea grabar el nuevo registro?";
        mensaje = "Registro grabado con exito";
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnAnularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnularActionPerformed
        txtCod.setEditable(true);
        txtCod.requestFocus();
        
        btnAgregar.setEnabled(false);
        btnAnular.setEnabled(false);
        btnSalir.setEnabled(false);
        btnGrabar.setEnabled(true);
        btnCancelar.setEnabled(true);

        operacion = "anular";
        confirmar = "¿Desea anular este registro?";
        mensaje = "Registro anulado con exito";
    }//GEN-LAST:event_btnAnularActionPerformed

    private void btnGrabarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGrabarActionPerformed
        int respuesta=5;
        
        respuesta=JOptionPane.showConfirmDialog(null, confirmar);
        
        
        
        if(respuesta==0){
            String sql="";
            String sqldetalle="";
            String sqlStock="";
            String sqlCuentaApagar="";
            String sqlLibroCompras="";
            String sqlOrdenCompras="";
            if(operacion.equals("agregar")){
                sql="Insert into compra (nro_factura, tipo, comp_fecha, cuotas, intervalo, estado, sucur_id, ord_id, pro_id, usu_id, emp_id)"
                        + " values ('"+
                        txtFactura.getText().trim().toUpperCase()+"', '"+
                        ((chx_contado.isSelected())? "CONTADO" : "CREDITO" )+ "', '"+
                        Metodos.dameFechaFormateadaSQL(txtFecha.getDate())+"', "+
                        Integer.parseInt(cmb_cuota.getSelectedItem().toString())+", "
                        + "30,'ACTIVO',"+
                        idSucursal+","+
                        txtOrden.getText().trim()+","+
                        txtCodProvee.getText().trim()+","+
                        idUsuario+","+
                        idPersonal+")";
                
                
                
            
            Conexion cn=new Conexion();
            try {
                cn.conectar();
                System.out.println(sql);
                cn.actualizar(sql);
                sqlOrdenCompras="update orden_compra set estado = 'UTILIZADO' where ord_id = "+txtOrden.getText().trim()+"";
                cn.actualizar(sqlOrdenCompras);
                if (Integer.parseInt(txt_iva5.getText())>0) {
                    sqlLibroCompras = "insert into detalle_lc (compra_id, libro_id, cantidad) values ("+
                        Metodos.ultimoCodigo("compra_id", "compra")+", 1, "+txt_iva5.getText()+")";
                    cn.actualizar(sqlLibroCompras);
                    
                }
                if (Integer.parseInt(txt_iva10.getText())>0) {
                    sqlLibroCompras = "insert into detalle_lc (compra_id, libro_id, cantidad) values ("+
                        Metodos.ultimoCodigo("compra_id", "compra")+", 2, "+txt_iva10.getText()+")";
                    cn.actualizar(sqlLibroCompras);
                }
                
                
                int cantidadFilas=grilla.getRowCount();
                if (operacion.equals("agregar")) {
                        for (int i = 0; i < cantidadFilas; i++) {
                            if (Metodos.estadoStock(cmbDeposito.getSelectedItem().toString(), idSucursal, grilla.getValueAt(i, 0).toString())) {
                                sqlStock = "update stock_materia_prima set cantidad = cantidad + "+grilla.getValueAt(i, 2).toString()+"";
                                cn.actualizar(sqlStock);
                                
                            }else{
                               sqlStock = "insert into stock_materia_prima (cod_depo, sucur_id, cod_materia, cantidad) values (" 
                               +cmbDeposito.getSelectedItem().toString()+", "
                               +idSucursal+", "
                               +grilla.getValueAt(i, 0).toString()+", "
                               +grilla.getValueAt(i, 2).toString()+")";
                               cn.actualizar(sqlStock);
                            }
                            
                            
                            sqldetalle="insert into compra_detalle(compra_id, cod_depo, sucur_id, cod_materia, cantidad, monto, iva_10, iva_5, exenta) values("
                            +Metodos.ultimoCodigo("compra_id", "compra")+", "
                            +cmbDeposito.getSelectedItem().toString()+", "
                            +idSucursal+", "
                            +grilla.getValueAt(i, 0).toString()+", "
                            +grilla.getValueAt(i, 2).toString()+", "
                            +grilla.getValueAt(i, 3).toString()+", "
                            +grilla.getValueAt(i, 6).toString()+", "
                            +grilla.getValueAt(i, 5).toString()+", "
                            +grilla.getValueAt(i, 4).toString()+")";
                           
                            cn.actualizar(sqldetalle);
                            
                }   
                }
                if (chx_credito.isSelected()) {
                    Date fecha = txtFecha.getDate();
                    for (int i = 1; i <=Integer.parseInt(cmb_cuota.getSelectedItem().toString()); i++) {
                        fecha.setMonth(fecha.getMonth()+1);
                        sqlCuentaApagar = "insert into cuenta_pagar(compra_id, nro_cuenta, cuen_vto, cuen_monto, estado) values("+
                            Metodos.ultimoCodigo("compra_id", "compra")+","+
                            (Integer.parseInt(Metodos.ultimoCodigo("nro_cuenta", "cuenta_pagar"))+1)+
                             ",'"+Metodos.dameFechaFormateadaSql(fecha)+"',"
                             +(int)((Integer.parseInt(txtTotal.getText().trim()))/(Integer.parseInt(cmb_cuota.getSelectedItem().toString())))+", 'PENDIENTE')";
                        cn.actualizar(sqlCuentaApagar);
                    }
                    
                  
                }
                
                
                JOptionPane.showMessageDialog(null, mensaje);
                btnCancelar.doClick();

                
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(pedido_de_compra.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, ex.getMessage());
            } catch (SQLException ex) {
                Logger.getLogger(pedido_de_compra.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }    
                
                
                        
            }
            
            
            if(operacion.equals("anular")){
                sql="update compra set"
                        + " estado = 'ANULADO' "
                        + " where compra_id = "+txtCod.getText();
                Conexion cn=new Conexion();
                try {
                    cn.conectar();
                    cn.actualizar(sql);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(compras.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(compras.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
            
            
        }
        JOptionPane.showMessageDialog(null, mensaje);
         btnCancelar.doClick();

    }//GEN-LAST:event_btnGrabarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        cmbDeposito.setEnabled(false);
        cmbOrden.setEnabled(false);
        cmb_cuota.setEnabled(false);

        txtCod.setEditable(false);
        txtSucursal.setEditable(false);
        txtUsuario.setEditable(false);
        
        txtCodUsuario.setEditable(false);
        txtOrden.setEditable(false);
        txtFactura.setEditable(false);
        txt_cod_arti.setEditable(false);
        txt_arti.setEditable(false);
        txt_precio.setEditable(false);
        txt_cantidad.setEditable(false);
        txt_iva5.setEditable(false);
        txt_iva10.setEditable(false);
        txt_to_iva.setEditable(false);
        txtTotal.setEditable(false);
        txtFecha.setEnabled(false);

        
        txtOrden.setText("");
        txtFactura.setText("");
        txt_cod_arti.setText("");
        txt_arti.setText("");
        txt_precio.setText("");
        txt_cantidad.setText("");
        txt_iva5.setText("");
        txt_iva10.setText("");
        txt_to_iva.setText("");
        txtTotal.setText("");

        
        
        txtCod.setText("");

        txtTotal.setText("0");

        btnAgregar.setEnabled(true);
        btnAnular.setEnabled(true);
        btnSalir.setEnabled(true);
        btnGrabar.setEnabled(false);
        btnCancelar.setEnabled(false);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void cmbOrdenKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cmbOrdenKeyPressed

        if (cmbOrden.getSelectedItem().equals("SI")) {

//                 combodeposito();
            txtOrden.setEditable(true);
            txtOrden.requestFocus();
        } else {

//                 combodeposito();
            txtFactura.setEditable(true);
            txtFactura.requestFocus();

        }
        cmbOrden.setEnabled(false);

    }//GEN-LAST:event_cmbOrdenKeyPressed

    private void cmbOrdenItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbOrdenItemStateChanged
        if (cmbOrden.getSelectedIndex() == 0) {
            txtOrden.setEditable(true);
            txtOrden.requestFocus();
        } else if (cmbOrden.getSelectedIndex() == 1) {
            txtOrden.setText("0");
            txtFactura.setEditable(true);
            txtFactura.requestFocus();
        }
    }//GEN-LAST:event_cmbOrdenItemStateChanged

    private void txtOrdenKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtOrdenKeyPressed
        if (txtOrden.getText().equals("") && evt.getKeyCode() == evt.VK_F2) {
            busPedidoCompra.busqueda = "ordenDesdeCompra";
            new busPedidoCompra().setVisible(true);

        }
    }//GEN-LAST:event_txtOrdenKeyPressed

    private void txtCodUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodUsuarioActionPerformed

    private void txtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuarioActionPerformed

    private void txtOrdenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOrdenActionPerformed
        txtFactura.setEditable(true);
        txtFactura.requestFocus();
    }//GEN-LAST:event_txtOrdenActionPerformed

    private void txtFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFacturaActionPerformed
        chx_contado.requestFocus();
        
    }//GEN-LAST:event_txtFacturaActionPerformed

    private void chx_contadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chx_contadoActionPerformed
        txt_arti.setEditable(true);
        txt_arti.requestFocus();
    }//GEN-LAST:event_chx_contadoActionPerformed

    private void chx_creditoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chx_creditoActionPerformed
        cmb_cuota.setEnabled(true);
        cmb_cuota.requestFocus();
        cmb_cuota.setPopupVisible(true);
    }//GEN-LAST:event_chx_creditoActionPerformed

    private void cmb_cuotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_cuotaActionPerformed
      
    }//GEN-LAST:event_cmb_cuotaActionPerformed

    private void txt_artiKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_artiKeyPressed
        if (txt_arti.getText().equals("") && evt.getKeyCode() == evt.VK_F2) {
            materiaPrima.busqueda = "compra";
            new materiaPrima().setVisible(true);

        }


    }//GEN-LAST:event_txt_artiKeyPressed

    private void txt_artiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_artiActionPerformed
        traerPrecio();
        txt_precio.setEditable(true);
        txt_precio.requestFocus();
    }//GEN-LAST:event_txt_artiActionPerformed

    private void txt_precioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_precioActionPerformed
        txt_cantidad.setEditable(true);
        txt_cantidad.requestFocus();
    }//GEN-LAST:event_txt_precioActionPerformed

    private void txt_cantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_cantidadActionPerformed

        int total = 0;
        int pos = -1;
        //buscamos si hay codigos repeditos guardar la posicion
        for (int fila = 0; fila < grilla.getRowCount(); fila++) {
            if (grilla.getValueAt(fila, 0).toString().equals(txt_cod_arti.getText().trim())) {
                pos = fila;
                break;
            }
        }

        if (pos >= 0) {
            grilla.setValueAt(Integer.parseInt(txt_cantidad.getText()) + (Integer.parseInt(grilla.getValueAt(pos, 2).toString())), pos, 2);
            if ((int) (Integer.parseInt(grilla.getValueAt(pos, 5).toString())) > 0) {
                grilla.setValueAt((int) ((Integer.parseInt(grilla.getValueAt(pos, 2).toString()) * Integer.parseInt(grilla.getValueAt(pos, 3).toString())) * 0.21), pos, 5);
            } else if ((int) (Integer.parseInt(grilla.getValueAt(pos, 6).toString())) > 0) {
                grilla.setValueAt((int) ((Integer.parseInt(grilla.getValueAt(pos, 2).toString()) * Integer.parseInt(grilla.getValueAt(pos, 3).toString())) * 0.11), pos, 6);
            }

            grilla.setValueAt(Integer.parseInt(grilla.getValueAt(pos, 2).toString()) * Integer.parseInt(grilla.getValueAt(pos, 3).toString()), pos, 7);
//             txtCodArti.setText("");
//             txtArti.setText("");
//             txtCantidad.setText("");
//             txtPrecio.setText("");
//             txtArti.requestFocus();

            compras.txt_iva5.setText(String.valueOf(Metodos.sumarColumna(compras.grilla, 5)));
            compras.txt_iva10.setText(String.valueOf(Metodos.sumarColumna(compras.grilla, 6)));
            compras.txt_to_iva.setText(String.valueOf(Metodos.sumarColumna(compras.grilla, 5) + Metodos.sumarColumna(compras.grilla, 6)));
            compras.txtTotal.setText(String.valueOf(Metodos.sumarColumna(compras.grilla, 5) + Metodos.sumarColumna(compras.grilla, 6) + Metodos.sumarColumna(compras.grilla, 7)));

            //JOptionPane.showMessageDialog(null, "ya hay");
        } else {
            String codigoEnRenglon = txt_cod_arti.getText();
            if (traerIva(txt_cod_arti.getText()).equals("5") ) {
                Metodos.cargarTabla(grilla, new Object[]{
                    txt_cod_arti.getText().trim(),
                    txt_arti.getText().trim(),
                    txt_cantidad.getText().trim(),
                    txt_precio.getText().trim(),
                    (Integer.parseInt(txt_cantidad.getText().trim()) * Integer.parseInt(txt_precio.getText().trim())) * 0,
                    (int) (Integer.parseInt(txt_cantidad.getText().trim()) * Integer.parseInt(txt_precio.getText().trim()) * 0.21),
                    (Integer.parseInt(txt_cantidad.getText().trim()) * Integer.parseInt(txt_precio.getText().trim())) * 0,
                    Integer.parseInt(txt_cantidad.getText()) * Integer.parseInt(txt_precio.getText())
                });
                

            } else if (traerIva(txt_cod_arti.getText()).equals("10") ) {
                Metodos.cargarTabla(grilla, new Object[]{
                    txt_cod_arti.getText().trim(),
                    txt_arti.getText().trim(),
                    txt_cantidad.getText().trim(),
                    txt_precio.getText().trim(),
                    (Integer.parseInt(txt_cantidad.getText().trim()) * Integer.parseInt(txt_precio.getText().trim())) * 0,
                    (Integer.parseInt(txt_cantidad.getText().trim()) * Integer.parseInt(txt_precio.getText().trim())) * 0,
                    (int) (Integer.parseInt(txt_cantidad.getText().trim()) * Integer.parseInt(txt_precio.getText().trim()) * 0.11),
                    Integer.parseInt(txt_cantidad.getText()) * Integer.parseInt(txt_precio.getText())
                });

            } else if (traerIva(txt_cod_arti.getText()).equals("0") ) {
                Metodos.cargarTabla(grilla, new Object[]{
                    txt_cod_arti.getText().trim(),
                    txt_arti.getText().trim(),
                    txt_cantidad.getText().trim(),
                    txt_precio.getText().trim(),
                    (Integer.parseInt(txt_cantidad.getText().trim()) * Integer.parseInt(txt_precio.getText().trim())) * 0,
                    (Integer.parseInt(txt_cantidad.getText().trim()) * Integer.parseInt(txt_precio.getText().trim())) * 0,
                    (Integer.parseInt(txt_cantidad.getText().trim()) * Integer.parseInt(txt_precio.getText().trim())) * 0,
                    Integer.parseInt(txt_cantidad.getText()) * Integer.parseInt(txt_precio.getText())
                });

            }

        }

//        for (int fila = 0; fila < grilla.getRowCount(); fila++) {
//            String codigoEnRenglon = (String) grilla.getValueAt(fila, 0);
//            if (txt_cod_arti.getText().equals(codigoEnRenglon)) {
//                grilla.setValueAt(Integer.parseInt(txt_cantidad.getText()) + (Integer.parseInt(grilla.getValueAt(fila, 2).toString())), fila, 2);
//                if ((int) (Integer.parseInt(grilla.getValueAt(fila, 5).toString())) > 0) {
//                    grilla.setValueAt((int) ((Integer.parseInt(grilla.getValueAt(fila, 2).toString()) * Integer.parseInt(grilla.getValueAt(fila, 3).toString())) * 0.21), fila, 5);
//                } else if ((int) (Integer.parseInt(grilla.getValueAt(fila, 6).toString())) > 0) {
//                    grilla.setValueAt((int) ((Integer.parseInt(grilla.getValueAt(fila, 2).toString()) * Integer.parseInt(grilla.getValueAt(fila, 3).toString())) * 0.11), fila, 6);
//                }
//
//                grilla.setValueAt(Integer.parseInt(grilla.getValueAt(fila, 2).toString()) * Integer.parseInt(grilla.getValueAt(fila, 3).toString()), fila, 7);
////             txtCodArti.setText("");
////             txtArti.setText("");
////             txtCantidad.setText("");
////             txtPrecio.setText("");
////             txtArti.requestFocus();
//
//                compras.txt_iva5.setText(String.valueOf(Metodos.sumarColumna(compras.grilla, 5)));
//                compras.txt_iva10.setText(String.valueOf(Metodos.sumarColumna(compras.grilla, 6)));
//                compras.txt_to_iva.setText(String.valueOf(Metodos.sumarColumna(compras.grilla, 5) + Metodos.sumarColumna(compras.grilla, 6)));
//                compras.txtTotal.setText(String.valueOf(Metodos.sumarColumna(compras.grilla, 5) + Metodos.sumarColumna(compras.grilla, 6) + Metodos.sumarColumna(compras.grilla, 7)));
//
//                break;
//
//                //JOptionPane.showMessageDialog(null, "ya hay");
//            } else if (traerIva(txt_cod_arti.getText()).equals("5") && !txt_cod_arti.getText().equals(codigoEnRenglon)) {
//                Metodos.cargarTabla(grilla, new Object[]{
//                    txt_cod_arti.getText().trim(),
//                    txt_arti.getText().trim(),
//                    txt_cantidad.getText().trim(),
//                    txt_precio.getText().trim(),
//                    (Integer.parseInt(txt_cantidad.getText().trim()) * Integer.parseInt(txt_precio.getText().trim())) * 0,
//                    (int) (Integer.parseInt(txt_cantidad.getText().trim()) * Integer.parseInt(txt_precio.getText().trim())) * 0.21,
//                    (Integer.parseInt(txt_cantidad.getText().trim()) * Integer.parseInt(txt_precio.getText().trim())) * 0,
//                    Integer.parseInt(txt_cantidad.getText()) * Integer.parseInt(txt_precio.getText())
//                });
//                break;
//
//            } else if (traerIva(txt_cod_arti.getText()).equals("10") && !txt_cod_arti.getText().equals(codigoEnRenglon)) {
//                Metodos.cargarTabla(grilla, new Object[]{
//                    txt_cod_arti.getText().trim(),
//                    txt_arti.getText().trim(),
//                    txt_cantidad.getText().trim(),
//                    txt_precio.getText().trim(),
//                    (Integer.parseInt(txt_cantidad.getText().trim()) * Integer.parseInt(txt_precio.getText().trim())) * 0,
//                    (Integer.parseInt(txt_cantidad.getText().trim()) * Integer.parseInt(txt_precio.getText().trim())) * 0,
//                    (int) (Integer.parseInt(txt_cantidad.getText().trim()) * Integer.parseInt(txt_precio.getText().trim())) * 0.11,
//                    Integer.parseInt(txt_cantidad.getText()) * Integer.parseInt(txt_precio.getText())
//                });
//                break;
//
//            } else if (traerIva(txt_cod_arti.getText()).equals("0") && !txt_cod_arti.getText().equals(codigoEnRenglon)) {
//                Metodos.cargarTabla(grilla, new Object[]{
//                    txt_cod_arti.getText().trim(),
//                    txt_arti.getText().trim(),
//                    txt_cantidad.getText().trim(),
//                    txt_precio.getText().trim(),
//                    (Integer.parseInt(txt_cantidad.getText().trim()) * Integer.parseInt(txt_precio.getText().trim())) * 0,
//                    (Integer.parseInt(txt_cantidad.getText().trim()) * Integer.parseInt(txt_precio.getText().trim())) * 0,
//                    (Integer.parseInt(txt_cantidad.getText().trim()) * Integer.parseInt(txt_precio.getText().trim())) * 0,
//                    Integer.parseInt(txt_cantidad.getText()) * Integer.parseInt(txt_precio.getText())
//                });
//                break;
//
//            }
//
//        }

        compras.txt_iva5.setText(String.valueOf(Metodos.sumarColumna(compras.grilla, 5)));
        compras.txt_iva10.setText(String.valueOf(Metodos.sumarColumna(compras.grilla, 6)));
        compras.txt_to_iva.setText(String.valueOf(Metodos.sumarColumna(compras.grilla, 5) + Metodos.sumarColumna(compras.grilla, 6)));
        compras.txtTotal.setText(String.valueOf(Metodos.sumarColumna(compras.grilla, 5) + Metodos.sumarColumna(compras.grilla, 6) + Metodos.sumarColumna(compras.grilla, 7)));

        txt_cod_arti.setText("");
        txt_arti.setText("");
        txt_cantidad.setText("");
        txt_precio.setText("");
        txt_arti.requestFocus();


    }//GEN-LAST:event_txt_cantidadActionPerformed

    private void cmb_cuotaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmb_cuotaItemStateChanged
        txt_arti.setEditable(true);
        txt_arti.requestFocus();
    }//GEN-LAST:event_cmb_cuotaItemStateChanged

    private void txtCodKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodKeyPressed
        if (txtCod.getText().equals("") && evt.getKeyCode() == evt.VK_F2) {
            busCompras.busqueda = "compra";
            new busCompras().setVisible(true);

        }
    }//GEN-LAST:event_txtCodKeyPressed

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

    public void traerPrecio() {
        Conexion cn = new Conexion();

        try {
            cn.conectar();
            ResultSet sucursal = cn.consultar("select mat_precio from materia_prima where cod_materia = " + txt_cod_arti.getText()); //order by ordena de menor a mayor, si se quiere de mayor a menor se le agrega desc al final

            if (sucursal.isBeforeFirst()) {
                while (sucursal.next()) {
                    txt_precio.setText(sucursal.getString("mat_precio"));
                }
            } else {
                JOptionPane.showMessageDialog(null, "No hay registros en la base de datos");
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(cajas.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "No se encuentra " + ex.getMessage());
        } catch (SQLException ex) {
            Logger.getLogger(cajas.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }
 

   
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new compras().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnAnular;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnGrabar;
    private javax.swing.JButton btnSalir;
    private javax.swing.ButtonGroup buttonGroup1;
    public static javax.swing.JCheckBox chx_contado;
    public static javax.swing.JCheckBox chx_credito;
    private javax.swing.JComboBox<String> cmbDeposito;
    private javax.swing.JComboBox<String> cmbOrden;
    private javax.swing.JComboBox<String> cmb_cuota;
    public static javax.swing.JTable grilla;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane2;
    public static javax.swing.JTextField txtCod;
    public static javax.swing.JTextField txtCodProvee;
    public static javax.swing.JTextField txtCodUsuario;
    public static javax.swing.JTextField txtFactura;
    public static com.toedter.calendar.JDateChooser txtFecha;
    public static javax.swing.JTextField txtOrden;
    public static javax.swing.JTextField txtProvee;
    public static javax.swing.JTextField txtSucursal;
    public static javax.swing.JTextField txtTotal;
    public static javax.swing.JTextField txtUsuario;
    public static javax.swing.JTextField txt_arti;
    private javax.swing.JTextField txt_cantidad;
    public static javax.swing.JTextField txt_cod_arti;
    public static javax.swing.JTextField txt_iva10;
    public static javax.swing.JTextField txt_iva5;
    private javax.swing.JTextField txt_precio;
    public static javax.swing.JTextField txt_to_iva;
    // End of variables declaration//GEN-END:variables
}
