
package ventanas;

import clases.Conexion;
import clases.Metodos;
import com.toedter.calendar.JCalendar;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.net.URL;
import javax.swing.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRResultSetDataSource;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperPrintManager;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

public class notaRemision extends javax.swing.JFrame
 {

    public notaRemision() {
        
        initComponents();
        txtFecha.setDate(new JCalendar().getDate());

    }

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
    
    
    
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        grilla = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        can = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txt_nombre_arti = new javax.swing.JTextField();
        txtcodigo = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        fecha_inicio = new com.toedter.calendar.JDateChooser();
        fecha_fin = new com.toedter.calendar.JDateChooser();
        jLabel20 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        cod_vehiculo = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        cod_conductor = new javax.swing.JTextField();
        txtChasis = new javax.swing.JTextField();
        txtConductor = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel14 = new javax.swing.JLabel();
        combo_motivo_nota = new javax.swing.JComboBox();
        jLabel19 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        cli = new javax.swing.JLabel();
        cli_nom = new javax.swing.JTextField();
        cli1 = new javax.swing.JLabel();
        ci_cli = new javax.swing.JTextField();
        factura_n = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        combo_sucursal_salida = new javax.swing.JComboBox();
        jLabel24 = new javax.swing.JLabel();
        combo_deposito_llegada = new javax.swing.JComboBox();
        jLabel21 = new javax.swing.JLabel();
        sucursal_receptora = new javax.swing.JComboBox();
        jLabel28 = new javax.swing.JLabel();
        combo_deposito_emisor = new javax.swing.JComboBox();
        jToolBar5 = new javax.swing.JToolBar();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        btnAnular = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnEnviar = new javax.swing.JButton();
        btnRecibir = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnGrabar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        txtCod = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        txtSucu = new javax.swing.JTextField();
        txtFecha = new com.toedter.calendar.JDateChooser();
        jLabel27 = new javax.swing.JLabel();
        txtCodUsuario = new javax.swing.JTextField();
        txtUsuario = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        jLabel5.setText("jLabel5");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("NOTA DE REMISION");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        grilla.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        grilla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CODÍGO", "DESCRIPCIÓN DE LA MERCADERÍA", "CANTIDAD", "CONFIRMAR"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, true
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
        jScrollPane2.setViewportView(grilla);
        if (grilla.getColumnModel().getColumnCount() > 0) {
            grilla.getColumnModel().getColumn(0).setResizable(false);
            grilla.getColumnModel().getColumn(0).setPreferredWidth(120);
            grilla.getColumnModel().getColumn(1).setResizable(false);
            grilla.getColumnModel().getColumn(1).setPreferredWidth(510);
            grilla.getColumnModel().getColumn(2).setPreferredWidth(120);
            grilla.getColumnModel().getColumn(3).setResizable(false);
            grilla.getColumnModel().getColumn(3).setPreferredWidth(80);
        }

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Artículos", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 10))); // NOI18N

        can.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        can.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        can.setEnabled(false);
        can.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                canActionPerformed(evt);
            }
        });
        can.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                canKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                canKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                canKeyTyped(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Cantidad:");

        txt_nombre_arti.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txt_nombre_arti.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txt_nombre_arti.setEnabled(false);
        txt_nombre_arti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nombre_artiActionPerformed(evt);
            }
        });
        txt_nombre_arti.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_nombre_artiKeyPressed(evt);
            }
        });

        txtcodigo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtcodigo.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtcodigo.setEnabled(false);
        txtcodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtcodigoKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtcodigoKeyReleased(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Código:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_nombre_arti, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(can, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_nombre_arti, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(can, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(0, 102, 102));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Fecha de Traslado", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 10))); // NOI18N

        fecha_inicio.setDateFormatString("dd-MM-yyyy");
        fecha_inicio.setEnabled(false);
        fecha_inicio.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        fecha_inicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                fecha_inicioMousePressed(evt);
            }
        });
        fecha_inicio.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                fecha_inicioPropertyChange(evt);
            }
        });
        fecha_inicio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                fecha_inicioKeyPressed(evt);
            }
        });

        fecha_fin.setDateFormatString("dd-MM-yyyy");
        fecha_fin.setEnabled(false);
        fecha_fin.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        fecha_fin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                fecha_finMousePressed(evt);
            }
        });
        fecha_fin.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                fecha_finPropertyChange(evt);
            }
        });
        fecha_fin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                fecha_finKeyPressed(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Inicio:");

        jLabel22.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Término:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel20)
                    .addComponent(jLabel22))
                .addGap(4, 4, 4)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fecha_inicio, javax.swing.GroupLayout.DEFAULT_SIZE, 324, Short.MAX_VALUE)
                    .addComponent(fecha_fin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fecha_inicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fecha_fin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(0, 102, 102));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Vehiculo p/ Traslado", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 10), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Vehículo:");
        jPanel4.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 15, 80, 30));

        cod_vehiculo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cod_vehiculo.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        cod_vehiculo.setEnabled(false);
        cod_vehiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cod_vehiculoActionPerformed(evt);
            }
        });
        cod_vehiculo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cod_vehiculoKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cod_vehiculoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cod_vehiculoKeyTyped(evt);
            }
        });
        jPanel4.add(cod_vehiculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(73, 20, 180, 20));

        jLabel16.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Código");
        jPanel4.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 56, -1, 20));

        cod_conductor.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cod_conductor.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        cod_conductor.setEnabled(false);
        cod_conductor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cod_conductorActionPerformed(evt);
            }
        });
        cod_conductor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cod_conductorKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cod_conductorKeyTyped(evt);
            }
        });
        jPanel4.add(cod_conductor, new org.netbeans.lib.awtextra.AbsoluteConstraints(73, 55, 180, 20));

        txtChasis.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtChasis.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtChasis.setEnabled(false);
        txtChasis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtChasisActionPerformed(evt);
            }
        });
        jPanel4.add(txtChasis, new org.netbeans.lib.awtextra.AbsoluteConstraints(335, 19, 270, 20));

        txtConductor.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtConductor.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtConductor.setEnabled(false);
        txtConductor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtConductorActionPerformed(evt);
            }
        });
        jPanel4.add(txtConductor, new org.netbeans.lib.awtextra.AbsoluteConstraints(336, 56, 270, 20));

        jLabel18.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Chasis:");
        jPanel4.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(271, 15, 54, 30));

        jLabel23.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Conductor:");
        jPanel4.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(271, 51, -1, 30));

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel14.setText("Motivo:");

        combo_motivo_nota.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        combo_motivo_nota.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Ventas", "Traslados", "Compras" }));
        combo_motivo_nota.setEnabled(false);
        combo_motivo_nota.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                combo_motivo_notaItemStateChanged(evt);
            }
        });
        combo_motivo_nota.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                combo_motivo_notaKeyPressed(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel19.setText("FACTURA Nº:");

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos de Proveedor o Cliente", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 10))); // NOI18N

        cli.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        cli.setForeground(new java.awt.Color(255, 255, 255));
        cli.setText("Razón Social:");

        cli_nom.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cli_nom.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        cli_nom.setEnabled(false);

        cli1.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        cli1.setForeground(new java.awt.Color(255, 255, 255));
        cli1.setText("Código");

        ci_cli.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ci_cli.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        ci_cli.setEnabled(false);
        ci_cli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ci_cliActionPerformed(evt);
            }
        });
        ci_cli.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ci_cliKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(cli1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ci_cli, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cli)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cli_nom, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cli_nom, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cli, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cli1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ci_cli, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        factura_n.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        factura_n.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        factura_n.setEnabled(false);
        factura_n.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                factura_nActionPerformed(evt);
            }
        });
        factura_n.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                factura_nKeyTyped(evt);
            }
        });

        jPanel5.setBackground(new java.awt.Color(0, 102, 102));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Entrada y Saldia de Mercaderías", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 10))); // NOI18N

        jLabel17.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Salida:");

        combo_sucursal_salida.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        combo_sucursal_salida.setEnabled(false);
        combo_sucursal_salida.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                combo_sucursal_salidaKeyPressed(evt);
            }
        });

        jLabel24.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("Deposito Receptor:");

        combo_deposito_llegada.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        combo_deposito_llegada.setEnabled(false);
        combo_deposito_llegada.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                combo_deposito_llegadaKeyPressed(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Sucursal Receptora:");

        sucursal_receptora.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        sucursal_receptora.setEnabled(false);
        sucursal_receptora.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                sucursal_receptoraKeyPressed(evt);
            }
        });

        jLabel28.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("Deposito Emisor");

        combo_deposito_emisor.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        combo_deposito_emisor.setEnabled(false);
        combo_deposito_emisor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                combo_deposito_emisorKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(combo_sucursal_salida, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sucursal_receptora, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 1, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(combo_deposito_emisor, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(combo_deposito_llegada, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addGap(1, 1, 1)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(combo_sucursal_salida, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sucursal_receptora, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel21))
                .addGap(23, 23, 23)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel24)
                        .addGap(1, 1, 1)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(combo_deposito_llegada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(combo_deposito_emisor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel28))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jToolBar5.setBackground(new java.awt.Color(0, 0, 0));
        jToolBar5.setFloatable(false);

        jLabel29.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setText("<html> Presione:      Enter/ <b>Buscador- </b>Esc<b>/Salir</b> </html>");
        jLabel29.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel29.setFocusable(false);
        jLabel29.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        jLabel29.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar5.add(jLabel29);

        jLabel30.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setText("<html>\nPresione:  \n  F12 o FIN/ <b>Grabar Registro </b>\n</html>");
        jLabel30.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel30.setFocusable(false);
        jLabel30.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        jLabel30.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar5.add(jLabel30);

        jPanel6.setBackground(new java.awt.Color(0, 102, 102));

        btnAnular.setText("Anular");
        btnAnular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnularActionPerformed(evt);
            }
        });
        btnAnular.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                btnAnularKeyTyped(evt);
            }
        });

        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnEnviar.setText("Enviar");
        btnEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviarActionPerformed(evt);
            }
        });

        btnRecibir.setText("Recibir");
        btnRecibir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRecibirActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnGrabar.setText("Grabar");
        btnGrabar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGrabarActionPerformed(evt);
            }
        });

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        btnNuevo.setText("Traslados");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnNuevo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAnular)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnModificar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEnviar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRecibir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCancelar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnGrabar)
                .addGap(10, 10, 10)
                .addComponent(btnSalir)
                .addGap(4, 4, 4))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalir)
                    .addComponent(btnGrabar)
                    .addComponent(btnCancelar)
                    .addComponent(btnRecibir)
                    .addComponent(btnEnviar)
                    .addComponent(btnModificar)
                    .addComponent(btnAnular)
                    .addComponent(btnNuevo))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 102));
        jLabel2.setText("NOTA DE REMISIÓN");

        jLabel25.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel25.setText("Código");

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

        jLabel26.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLabel26.setText("Sucursal:");

        jLabel27.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel27.setText("Usuario");

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

        jButton1.setText("Borrar Item");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel25)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtCod, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel26)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtSucu, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel27)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtCodUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(8, 8, 8)
                                        .addComponent(combo_motivo_nota, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(10, 10, 10)
                                        .addComponent(jLabel19)
                                        .addGap(12, 12, 12)
                                        .addComponent(factura_n, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton1))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator1)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel2)))
                        .addGap(53, 53, 53))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtCod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel25))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel26)
                                .addComponent(txtSucu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtCodUsuario)
                                .addComponent(jLabel27)
                                .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(16, 16, 16))
                    .addComponent(jLabel2))
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel14))
                    .addComponent(combo_motivo_nota, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel19))
                    .addComponent(factura_n, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(23, 23, 23)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(102, 102, 102)
                .addComponent(jToolBar5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        setSize(new java.awt.Dimension(1132, 640));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txt_nombre_artiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nombre_artiActionPerformed
               can.setEnabled(true);
               can.requestFocus();
               
}//GEN-LAST:event_txt_nombre_artiActionPerformed

    private void txtConductorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtConductorActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_txtConductorActionPerformed

    private void txtChasisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtChasisActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_txtChasisActionPerformed

    private void combo_sucursal_salidaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_combo_sucursal_salidaKeyPressed
        sucursal_receptora.setEnabled(true);
        sucursal_receptora.requestFocus();
      
    }//GEN-LAST:event_combo_sucursal_salidaKeyPressed

    private void combo_motivo_notaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_combo_motivo_notaKeyPressed

      
    }//GEN-LAST:event_combo_motivo_notaKeyPressed

    private void factura_nKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_factura_nKeyTyped

    }//GEN-LAST:event_factura_nKeyTyped

    private void cod_vehiculoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cod_vehiculoKeyTyped

    }//GEN-LAST:event_cod_vehiculoKeyTyped

    private void cod_conductorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cod_conductorKeyTyped

    }//GEN-LAST:event_cod_conductorKeyTyped

    private void txtcodigoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcodigoKeyPressed

}//GEN-LAST:event_txtcodigoKeyPressed

    private void txtcodigoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcodigoKeyReleased
        // TODO add your handling code here:
}//GEN-LAST:event_txtcodigoKeyReleased

    private void canKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_canKeyTyped

    }//GEN-LAST:event_canKeyTyped

    private void fecha_finMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fecha_finMousePressed

}//GEN-LAST:event_fecha_finMousePressed

    private void fecha_inicioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fecha_inicioMousePressed

}//GEN-LAST:event_fecha_inicioMousePressed

    private void fecha_inicioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fecha_inicioKeyPressed
        fecha_fin.setEnabled(true);
        fecha_fin.requestFocus();
    }//GEN-LAST:event_fecha_inicioKeyPressed

    private void fecha_finKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fecha_finKeyPressed
        if (combo_motivo_nota.getSelectedItem().toString().equals("Compras")) {
            combo_sucursal_salida.setEnabled(true);
            combo_sucursal_salida.requestFocus();
        }else if (combo_motivo_nota.getSelectedItem().toString().equals("Traslados")) {
            buscadorStockProductos.busqueda="notaRemision";
            buscadorStockProductos.depo = dameIdDeposito();
            buscadorStockProductos.sucu = dameIdSucursal(combo_sucursal_salida.getSelectedItem().toString());
            new buscadorStockProductos().setVisible(true);
          
        
        }else if (combo_motivo_nota.getSelectedItem().toString().equals("Ventas")) {
            combo_sucursal_salida.setEnabled(true);
            combo_sucursal_salida.requestFocus();
        }
    }//GEN-LAST:event_fecha_finKeyPressed

    private void sucursal_receptoraKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_sucursal_receptoraKeyPressed
       if (combo_motivo_nota.getSelectedItem().toString().equals("Compras")) {
            dameDeposito();
            combo_deposito_emisor.setEnabled(true);
            combo_deposito_emisor.requestFocus();
        }else if (combo_motivo_nota.getSelectedItem().toString().equals("Traslados")) {
            combo_deposito_llegada.setEnabled(true);
            combo_deposito_llegada.requestFocus();
            dameDepositoTraslados();
        }else if (combo_motivo_nota.getSelectedItem().toString().equals("Ventas")) {
            dameDeposito();
            combo_deposito_emisor.setEnabled(true);
            combo_deposito_emisor.requestFocus();
        }
        
       
}//GEN-LAST:event_sucursal_receptoraKeyPressed

    private void combo_deposito_llegadaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_combo_deposito_llegadaKeyPressed
        if (combo_motivo_nota.getSelectedItem().toString().equals("Compras")) {
            btnGrabar.doClick();
        }else if (combo_motivo_nota.getSelectedItem().toString().equals("Traslados")) {
              cod_vehiculo.setEnabled(true);
              cod_vehiculo.requestFocus();
        }else if (combo_motivo_nota.getSelectedItem().toString().equals("Ventas")) {
            btnGrabar.doClick();
        }
}//GEN-LAST:event_combo_deposito_llegadaKeyPressed

    private void canKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_canKeyReleased

    }//GEN-LAST:event_canKeyReleased

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
          limpiar_text();
          Metodos.cargarCombo(combo_sucursal_salida, "sucur_nom", "sucursal");
          Metodos.cargarCombo(sucursal_receptora, "sucur_nom", "sucursal");
          Metodos.limpiarTabla(grilla);
          
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnGrabarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGrabarActionPerformed
         int respuesta=5;
        
        respuesta=JOptionPane.showConfirmDialog(null, confirmar);
        
        
        Date fecha = txtFecha.getDate();
        if(respuesta==0){
            String sql="";
            String sqldetalle="";
            String sqlstocklocal="";
            String sqlstockfinal="";
            if(operacion.equals("Traslados")||operacion.equals("Ventas")||operacion.equals("Compras")){
                sql="Insert into nota_remision (remi_estado, remi_fecha_partida, remi_motivo, emp_id, sucur_id, veh_id, usu_id, sucu_id_llegada, remi_fecha_llegada, id_chofer)"
                        + " values ('ACTIVO', '"+
                        Metodos.dameFechaFormateadaSQL(fecha_inicio.getDate())+"', '"+
                        combo_motivo_nota.getSelectedItem().toString()+"', "+
                        idPersonal+", "+
                        dameIdSucursal(combo_sucursal_salida.getSelectedItem().toString())+", "+
                        cod_vehiculo.getText().trim()+","+
                        idUsuario+","+
                        dameIdSucursal(sucursal_receptora.getSelectedItem().toString())+",'"+
                        Metodos.dameFechaFormateadaSQL(fecha_fin.getDate())+"', "+
                        cod_conductor.getText().trim()+")";
                        
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
//                int cantidadFilas=grilla.getRowCount();
                if (operacion.equals("Compras")) {
                            sqldetalle="insert into remision_compra (remi_id, compra_id, estado) values("
                            +Metodos.ultimoCodigo("remi_id", "nota_remision")+", "
                             +dameIdCompra()
                             +",'ACTIVO')";
                           
                            cn.actualizar(sqldetalle);
                            actualizarProStockMaterias();
                }else if (combo_motivo_nota.getSelectedItem().toString().trim().equals("Ventas")) {
                            sqldetalle="insert into remision_venta (remi_id, ventas_id, estado) values("
                            +Metodos.ultimoCodigo("remi_id", "nota_remision")+", "
                             +dameIdVenta()
                             +",'ACTIVO')";
                           
                            cn.actualizar(sqldetalle);
                            
                            actualizarProStock();
                }else if (operacion.equals("Traslados")) {
//                    Conexion cn=new Conexion();
                        try {
                            cn.conectar();
                            int cantidadFilas=grilla.getRowCount();
                            if (operacion.equals("Traslados")) {
                                    for (int i = 0; i < cantidadFilas; i++) {
                                        sqldetalle="insert into remision_traslado (remi_id, cod_depo, sucur_id, cantidad, pro_cod) values("
                                        +txtCod.getText().trim()+","
                                        +dameIdDeposito()+","
                                        +idSucursal+","
                                        +grilla.getValueAt(i, 2)+","
                                        +grilla.getValueAt(i, 0)+")";
                                        System.out.println(sqldetalle);
                                        cn.actualizar(sqldetalle);
                                        
                                        sqlstocklocal = "update stock_productos set cantidad = cantidad-"+grilla.getValueAt(i, 2)+" where cod_depo = "+dameIdDeposito()+" and sucur_id = "+idSucursal+" and pro_cod = "+grilla.getValueAt(i, 0);
                                        System.out.println(sqlstocklocal);
                                        cn.actualizar(sqlstocklocal);
                                        
                                        sqlstockfinal = "update stock_productos set cantidad = cantidad+"+grilla.getValueAt(i, 2)+" where cod_depo = "+dameDepositoLlegada()+" and sucur_id = "+dameIdSucursal(sucursal_receptora.getSelectedItem().toString())+" and pro_cod = "+grilla.getValueAt(i, 0);
                                        System.out.println(sqlstockfinal);
                                        cn.actualizar(sqlstockfinal);
                            }   
                            }
                            



                        } catch (ClassNotFoundException ex) {
                            Logger.getLogger(presupuesto_de_compra.class.getName()).log(Level.SEVERE, null, ex);
                            JOptionPane.showMessageDialog(null, ex.getMessage());
                        } catch (SQLException ex) {
                            Logger.getLogger(presupuesto_de_compra.class.getName()).log(Level.SEVERE, null, ex);
                            JOptionPane.showMessageDialog(null, ex.getMessage());
                        }
                }
                            JOptionPane.showMessageDialog(null, mensaje);
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

    
    

    
    
    
    private void btnRecibirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRecibirActionPerformed
        btnNuevo.setEnabled(false);
        btnAnular.setEnabled(false);
        btnSalir.setEnabled(false);
        btnModificar.setEnabled(false);
        btnEnviar.setEnabled(false);
        btnRecibir.setEnabled(false);
        
        btnGrabar.setEnabled(true);
        btnCancelar.setEnabled(true);
        
        txtCod.setText(Metodos.siguienteCodigo("remi_id", "nota_remision"));
//        combomotivo();
        
        
        operacion = "Compras";
        confirmar = "¿Desea grabar el nuevo registro?";
        mensaje = "Registro grabado con exito"; 
        
        
        combo_motivo_nota.setSelectedItem("Compras");
        factura_n.setEnabled(true);
        factura_n.requestFocus();
    }//GEN-LAST:event_btnRecibirActionPerformed

    private void btnEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviarActionPerformed
        btnNuevo.setEnabled(false);
        btnAnular.setEnabled(false);
        btnSalir.setEnabled(false);
        btnModificar.setEnabled(false);
        btnEnviar.setEnabled(false);
        btnRecibir.setEnabled(false);
        
        btnGrabar.setEnabled(true);
        btnCancelar.setEnabled(true);
        
        txtCod.setText(Metodos.siguienteCodigo("remi_id", "nota_remision"));
        combo_motivo_nota.setSelectedItem("Ventas");
        operacion = "Ventas";
        confirmar = "¿Desea grabar el nuevo registro?";
        mensaje = "Registro grabado con exito"; 
        
        
        factura_n.setEnabled(true);
        factura_n.requestFocus();
        combo_motivo_nota.setSelectedItem("Ventas");
    }//GEN-LAST:event_btnEnviarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed

    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnAnularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnularActionPerformed

    }//GEN-LAST:event_btnAnularActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        btnNuevo.setEnabled(false);
        btnAnular.setEnabled(false);
        btnSalir.setEnabled(false);
        btnModificar.setEnabled(false);
        btnEnviar.setEnabled(false);
        btnRecibir.setEnabled(false);
        
        btnGrabar.setEnabled(true);
        btnCancelar.setEnabled(true);
        
        combo_motivo_nota.setEnabled(false);
        combo_motivo_nota.requestFocus();
      
        txtCod.setText(Metodos.siguienteCodigo("remi_id", "nota_remision"));
//        combomotivo();
        dameDepositoParaTranslado();
        combo_deposito_emisor.setEnabled(true);
        combo_deposito_emisor.requestFocus();
        dameSucursal();
        
        combo_motivo_nota.setSelectedItem("Traslados");
        operacion = "Traslados";
        confirmar = "¿Desea grabar el nuevo registro?";
        mensaje = "Registro grabado con exito";
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void ci_cliKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ci_cliKeyPressed

    }//GEN-LAST:event_ci_cliKeyPressed

    private void btnAnularKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnAnularKeyTyped
       
    }//GEN-LAST:event_btnAnularKeyTyped

    private void canKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_canKeyPressed

    }//GEN-LAST:event_canKeyPressed

    private void txtCodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodActionPerformed

    }//GEN-LAST:event_txtCodActionPerformed

    private void txtCodKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodKeyPressed

    }//GEN-LAST:event_txtCodKeyPressed

    private void txtCodUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodUsuarioActionPerformed

    private void txtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuarioActionPerformed

    private void combo_motivo_notaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_combo_motivo_notaItemStateChanged
        if(combo_motivo_nota.getItemCount() == 0)return;
        if (combo_motivo_nota.getSelectedItem().equals("Compras")){

           factura_n.setEnabled(true);
           factura_n.requestFocus();
//           combo_motivo_nota.setEnabled(false);

        }else if (combo_motivo_nota.getSelectedItem().equals("Traslados")) {
            dameDepositoParaTranslado();
            combo_deposito_llegada.setEnabled(true);
            combo_deposito_llegada.requestFocus();
            dameSucursal();
        }else if (combo_motivo_nota.getSelectedItem().equals("Ventas")) {
           factura_n.setEnabled(true);
           factura_n.requestFocus();
        }
    }//GEN-LAST:event_combo_motivo_notaItemStateChanged

    private void ci_cliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ci_cliActionPerformed
        
    }//GEN-LAST:event_ci_cliActionPerformed

    private void factura_nActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_factura_nActionPerformed
        if (combo_motivo_nota.getSelectedItem().toString().equals("Compras")) {
            dameProveedor();
            dameDetallesCompra();
            cod_vehiculo.setEnabled(true);
            cod_vehiculo.requestFocus();
            factura_n.setEnabled(false);
        }else if (combo_motivo_nota.getSelectedItem().toString().equals("Ventas")) {
            dameCliente();
            dameDetallesVentas();
            cod_vehiculo.setEnabled(true);
            cod_vehiculo.requestFocus();
            factura_n.setEnabled(false);
        }
        
    }//GEN-LAST:event_factura_nActionPerformed

    private void cod_vehiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cod_vehiculoActionPerformed
        cod_conductor.setEnabled(true);
        cod_conductor.requestFocus();
        cod_vehiculo.setEnabled(false);
    }//GEN-LAST:event_cod_vehiculoActionPerformed

    private void cod_vehiculoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cod_vehiculoKeyReleased
        
    }//GEN-LAST:event_cod_vehiculoKeyReleased

    private void cod_vehiculoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cod_vehiculoKeyPressed
        if (cod_vehiculo.getText().equals("") && evt.getKeyCode() == evt.VK_F2){
            vehiculos.busqueda="notaRemision";
            new vehiculos().setVisible(true);
          
        }
    }//GEN-LAST:event_cod_vehiculoKeyPressed

    private void cod_conductorKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cod_conductorKeyPressed
        if (cod_conductor.getText().equals("") && evt.getKeyCode() == evt.VK_F2){
            empleados.busqueda="notaRemision";
            new empleados().setVisible(true);
          
        }
    }//GEN-LAST:event_cod_conductorKeyPressed

    private void cod_conductorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cod_conductorActionPerformed
        if (combo_motivo_nota.getSelectedItem().toString().equals("Traslados")) {
            fecha_inicio.setEnabled(true);
            fecha_inicio.requestFocus();
            
        }else if (combo_motivo_nota.getSelectedItem().toString().equals("Ventas")) {
            fecha_inicio.setEnabled(true);
            fecha_inicio.requestFocus();
            Metodos.cargarCombo(combo_sucursal_salida, "sucur_nom", "sucursal");
            Metodos.cargarCombo(sucursal_receptora, "sucur_nom", "sucursal");
        }else if (combo_motivo_nota.getSelectedItem().toString().equals("Compras")) {
            fecha_inicio.setEnabled(true);
            fecha_inicio.requestFocus();
            Metodos.cargarCombo(combo_sucursal_salida, "sucur_nom", "sucursal");
            Metodos.cargarCombo(sucursal_receptora, "sucur_nom", "sucursal");
        }
    }//GEN-LAST:event_cod_conductorActionPerformed

    private void txt_nombre_artiKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_nombre_artiKeyPressed
        if (txt_nombre_arti.getText().equals("") && evt.getKeyCode() == evt.VK_F2){
            buscadorStockProductos.busqueda="notaRemision";
            buscadorStockProductos.depo = dameIdDeposito();
            buscadorStockProductos.sucu = dameIdSucursal(combo_sucursal_salida.getSelectedItem().toString());
            new buscadorStockProductos().setVisible(true);
            
          
        }
    }//GEN-LAST:event_txt_nombre_artiKeyPressed

    private void canActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_canActionPerformed
           int total=0;
        for (int fila = 0; fila <grilla.getRowCount(); fila++) {
         String codigoEnRenglon = (String)grilla.getValueAt(fila, 0);
         if (txtcodigo.getText().equals(codigoEnRenglon)) {
             grilla.setValueAt(Integer.parseInt(can.getText())+(Integer.parseInt(grilla.getValueAt(fila, 2).toString())), fila, 2);
             txtcodigo.setText("");
             txt_nombre_arti.setText("");
             can.setText("");
             txt_nombre_arti.requestFocus();
             return;
            }
        }
        Metodos.cargarTabla(grilla, new Object[]{
                txtcodigo.getText().trim(),
                txt_nombre_arti.getText().trim(),
                can.getText().trim()
                });
        txtcodigo.setText("");
        txt_nombre_arti.setText("");
        can.setText("");
        txt_nombre_arti.requestFocus();
    }//GEN-LAST:event_canActionPerformed

    private void fecha_inicioPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_fecha_inicioPropertyChange
        // TODO add your handling code here:
        if(fecha_inicio.getDate() == null) return;
        
        fecha_inicio.requestFocus();
    }//GEN-LAST:event_fecha_inicioPropertyChange

    private void fecha_finPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_fecha_finPropertyChange
        if(fecha_fin.getDate() == null) return;
        fecha_fin.requestFocus();
    }//GEN-LAST:event_fecha_finPropertyChange

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Metodos.eliminarFila(grilla, grilla.getSelectedRow());
    }//GEN-LAST:event_jButton1ActionPerformed

    private void combo_deposito_emisorKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_combo_deposito_emisorKeyPressed
        if (combo_motivo_nota.getSelectedItem().toString().equals("Traslados")) {
            Metodos.cargarCombo(sucursal_receptora, "sucur_nom", "sucursal");
            sucursal_receptora.setEnabled(true);
            sucursal_receptora.requestFocus();
        }else if (combo_motivo_nota.getSelectedItem().toString().equals("Ventas")) {
            combo_deposito_llegada.setEnabled(true);
            combo_deposito_llegada.requestFocus();
            dameDepositoFin();
        }else if (combo_motivo_nota.getSelectedItem().toString().equals("Compras")) {
            combo_deposito_llegada.setEnabled(true);
            combo_deposito_llegada.requestFocus();
            dameDepositoFin();
        }
    }//GEN-LAST:event_combo_deposito_emisorKeyPressed


    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new notaRemision().setVisible(true);
            }
        });
    }

    
    
    
       private void dameProveedor(){
        try {
            Conexion cn = new Conexion();
            cn.conectar();
            ResultSet detalles = cn.consultar("select * from v_proveedor_por_factura where nro_factura =  '"+factura_n.getText().trim()+"'");
             if (detalles.isBeforeFirst()) {
                while (detalles.next()) {   
                    ci_cli.setText(detalles.getString("pro_id"));
                    cli_nom.setText(detalles.getString("pro_nom"));
                    
                }
             }
        } catch (SQLException ex) {
            Logger.getLogger(busPedidoCompra.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(busPedidoCompra.class.getName()).log(Level.SEVERE, null, ex);
        }   
    }
       private void actualizarProStock(){
        try {
            Conexion cn = new Conexion();
            cn.conectar();
            String sql1 = "";
            for (int fila = 0; fila < grilla.getRowCount(); fila++) {
                try {
                    sql1 = "update stock_productos set cantidad = cantidad-"+ grilla.getValueAt(fila, 2)+" where sucur_id ="+dameIdSucursal(combo_sucursal_salida.getSelectedItem().toString())+" and cod_depo = "+dameIdDeposito()+" and pro_cod = "+grilla.getValueAt(fila, 0);
                    System.out.println(sql1);
                    cn.actualizar(sql1);
                    
                    sql1 = "update stock_productos set cantidad = cantidad+"+ grilla.getValueAt(fila, 2)+" where sucur_id ="+dameIdSucursal(sucursal_receptora.getSelectedItem().toString())+" and cod_depo = "+dameIdDeposito2()+" and pro_cod = "+grilla.getValueAt(fila, 0);
                    System.out.println(sql1);
                    cn.actualizar(sql1);
                    
                    
                } catch (SQLException ex) {
                    Logger.getLogger(notaRemision.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(notaRemision.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(notaRemision.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
       private void actualizarProStockMaterias(){
        try {
            Conexion cn = new Conexion();
            cn.conectar();
            String sql1 = "";
            for (int fila = 0; fila < grilla.getRowCount(); fila++) {
                try {
                    sql1 = "update stock_materia_prima set cantidad = cantidad-"+ grilla.getValueAt(fila, 2)+" where sucur_id ="+dameIdSucursal(combo_sucursal_salida.getSelectedItem().toString())+" and cod_depo = "+dameIdDeposito()+" and cod_materia = "+grilla.getValueAt(fila, 0);
                    System.out.println(sql1);
                    cn.actualizar(sql1);
                    
                    sql1 = "update stock_materia_prima set cantidad = cantidad+"+ grilla.getValueAt(fila, 2)+" where sucur_id ="+dameIdSucursal(sucursal_receptora.getSelectedItem().toString())+" and cod_depo = "+dameIdDeposito2()+" and cod_materia = "+grilla.getValueAt(fila, 0);
                    System.out.println(sql1);
                    cn.actualizar(sql1);
                    
                    
                } catch (SQLException ex) {
                    Logger.getLogger(notaRemision.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(notaRemision.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(notaRemision.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
       
       
       private void dameCliente(){
        try {
            Conexion cn = new Conexion();
            cn.conectar();
            ResultSet detalles = cn.consultar("select * from v_cliente_por_factura where nro_factura =  '"+factura_n.getText().trim()+"'");
             if (detalles.isBeforeFirst()) {
                while (detalles.next()) {   
                    ci_cli.setText(detalles.getString("cli_cod"));
                    cli_nom.setText(detalles.getString("cli_nomb"));
                    
                }
             }
        } catch (SQLException ex) {
            Logger.getLogger(busPedidoCompra.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(busPedidoCompra.class.getName()).log(Level.SEVERE, null, ex);
        }   
    }
       
       private void dameDetallesCompra(){
        try {
            Conexion cn = new Conexion();
            cn.conectar();
            ResultSet detalles = cn.consultar("select * from v_detalle_compra where nro_factura =  '"+factura_n.getText().trim()+"'");
             if (detalles.isBeforeFirst()) {
                while (detalles.next()) {   
                    Metodos.cargarTabla(grilla, new Object[]{
                detalles.getString("cod_materia"),
                detalles.getString("mat_desc"),
                detalles.getString("cantidad")
                });
                }
             }
        } catch (SQLException ex) {
            Logger.getLogger(busPedidoCompra.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(busPedidoCompra.class.getName()).log(Level.SEVERE, null, ex);
        }
       
         
    }
       private void dameDetallesVentas(){
        try {
            Conexion cn = new Conexion();
            cn.conectar();
            ResultSet detalles = cn.consultar("select * from v_detalle_ventas where nro_factura =  '"+factura_n.getText().trim()+"'");
             if (detalles.isBeforeFirst()) {
                while (detalles.next()) {   
                    Metodos.cargarTabla(grilla, new Object[]{
                detalles.getString("pro_cod"),
                detalles.getString("pro_desc"),
                detalles.getString("det_cantidad")
                });
                }
             }
        } catch (SQLException ex) {
            Logger.getLogger(busPedidoCompra.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(busPedidoCompra.class.getName()).log(Level.SEVERE, null, ex);
        }
       
         
    }
       private void dameDeposito(){
        try {
            Conexion cn = new Conexion();
            cn.conectar();
            ResultSet detalles = cn.consultar("select * from v_deposito where sucur_nom =  '"+combo_sucursal_salida.getSelectedItem().toString()+"'");
             
            combo_deposito_llegada.removeAllItems();
            if (detalles.isBeforeFirst()) {
                
                while (detalles.next()) {   
                    combo_deposito_emisor.addItem(detalles.getString("depo_desc"));
                }
             }
        } catch (SQLException ex) {
            Logger.getLogger(busPedidoCompra.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(busPedidoCompra.class.getName()).log(Level.SEVERE, null, ex);
        }
       
         
    }
       private void dameDepositoTraslados(){
        try {
            Conexion cn = new Conexion();
            cn.conectar();
            ResultSet detalles = cn.consultar("select * from v_deposito where sucur_nom =  '"+sucursal_receptora.getSelectedItem().toString()+"'");
             
            combo_deposito_llegada.removeAllItems();
            if (detalles.isBeforeFirst()) {
                
                while (detalles.next()) {   
                    combo_deposito_llegada.addItem(detalles.getString("depo_desc"));
                }
             }
        } catch (SQLException ex) {
            Logger.getLogger(busPedidoCompra.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(busPedidoCompra.class.getName()).log(Level.SEVERE, null, ex);
        }
       
         
    }
       private void dameDepositoFin(){
        try {
            Conexion cn = new Conexion();
            cn.conectar();
            ResultSet detalles = cn.consultar("select * from v_deposito where sucur_nom =  '"+sucursal_receptora.getSelectedItem().toString()+"'");
             
            combo_deposito_llegada.removeAllItems();
            if (detalles.isBeforeFirst()) {
                
                while (detalles.next()) {   
                    combo_deposito_llegada.addItem(detalles.getString("depo_desc"));
                }
             }
        } catch (SQLException ex) {
            Logger.getLogger(busPedidoCompra.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(busPedidoCompra.class.getName()).log(Level.SEVERE, null, ex);
        }
       
         
    }
       private String dameDepositoLlegada(){
           String nn ="";
           String cod="";
        try {
            Conexion cn = new Conexion();
            cn.conectar();
            nn="select * from deposito where depo_desc =  '"+combo_deposito_llegada.getSelectedItem().toString()+"'";
            System.out.println("este es "+nn);
            ResultSet detalles = cn.consultar(nn);
            if (detalles.isBeforeFirst()) {
                while (detalles.next()) { 
                    cod=detalles.getString("cod_depo");
                    return cod;
                }
             }
        } catch (SQLException ex) {
            Logger.getLogger(busPedidoCompra.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(busPedidoCompra.class.getName()).log(Level.SEVERE, null, ex);
        }
       return "";
         
    }
       private void dameDepositoParaTranslado(){
        try {
            Conexion cn = new Conexion();
            cn.conectar();
            ResultSet detalles = cn.consultar("select * from v_deposito where sucur_id =  "+idSucursal+"");
             
            combo_deposito_emisor.removeAllItems();
            if (detalles.isBeforeFirst()) {
                
                while (detalles.next()) {   
                    combo_deposito_emisor.addItem(detalles.getString("depo_desc"));
                }
             }
        } catch (SQLException ex) {
            Logger.getLogger(busPedidoCompra.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(busPedidoCompra.class.getName()).log(Level.SEVERE, null, ex);
        }  
    }
       private void dameDepositoEmisor(){
        try {
            Conexion cn = new Conexion();
            cn.conectar();
            ResultSet detalles = cn.consultar("select * from v_deposito where sucur_id =  "+idSucursal+"");
             
            combo_deposito_llegada.removeAllItems();
            if (detalles.isBeforeFirst()) {
                
                while (detalles.next()) {   
                    combo_deposito_llegada.addItem(detalles.getString("depo_desc"));
                }
             }
        } catch (SQLException ex) {
            Logger.getLogger(busPedidoCompra.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(busPedidoCompra.class.getName()).log(Level.SEVERE, null, ex);
        }  
    }
       private String dameIdDeposito(){
        try {
            Conexion cn = new Conexion();
            cn.conectar();
            ResultSet detalles = cn.consultar("select * from v_deposito where sucur_id =  "+idSucursal+"");
             String cod;
            if (detalles.isBeforeFirst()) {
                
                while (detalles.next()) {   
                    cod = detalles.getString("cod_depo");
                    return cod;
                }
             }
        } catch (SQLException ex) {
            Logger.getLogger(busPedidoCompra.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(busPedidoCompra.class.getName()).log(Level.SEVERE, null, ex);
        } 
        return "";
    }
       private String dameIdDeposito2(){
        try {
            Conexion cn = new Conexion();
            cn.conectar();
            ResultSet detalles = cn.consultar("select * from v_deposito where depo_desc =  '"+combo_deposito_llegada.getSelectedItem().toString()+"'");
             String cod;
            if (detalles.isBeforeFirst()) {
                
                while (detalles.next()) {   
                    cod = detalles.getString("cod_depo");
                    return cod;
                }
             }
        } catch (SQLException ex) {
            Logger.getLogger(busPedidoCompra.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(busPedidoCompra.class.getName()).log(Level.SEVERE, null, ex);
        } 
        return "";
    }
       private void dameSucursal(){
        try {
            Conexion cn = new Conexion();
            cn.conectar();
            ResultSet detalles = cn.consultar("select * from sucursal where sucur_id =  "+idSucursal+"");
            combo_sucursal_salida.removeAllItems();
            if (detalles.isBeforeFirst()) {
                
                while (detalles.next()) {   
                    combo_sucursal_salida.addItem(detalles.getString("sucur_nom"));
                }
             }
        } catch (SQLException ex) {
            Logger.getLogger(busPedidoCompra.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(busPedidoCompra.class.getName()).log(Level.SEVERE, null, ex);
        }
       
         
    }
       private String dameIdSucursal(String sucu){
           String id="";
        try {
            Conexion cn = new Conexion();
            cn.conectar();
            ResultSet detalles = cn.consultar("select * from sucursal where sucur_nom =  '"+sucu+"'");
            if (detalles.isBeforeFirst()) {
                while (detalles.next()) {   
                    id = detalles.getString("sucur_id");
                    return id;
                }
             }
        } catch (SQLException ex) {
            Logger.getLogger(busPedidoCompra.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(busPedidoCompra.class.getName()).log(Level.SEVERE, null, ex);
        }
       return "";
         
    }
       private String dameIdCompra(){
           String id="";
        try {
            Conexion cn = new Conexion();
            cn.conectar();
            ResultSet detalles = cn.consultar("select * from compra where nro_factura =  '"+factura_n.getText().trim()+"'");
            if (detalles.isBeforeFirst()) {
                while (detalles.next()) {   
                    id = detalles.getString("compra_id");
                    return id;
                }
             }
        } catch (SQLException ex) {
            Logger.getLogger(busPedidoCompra.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(busPedidoCompra.class.getName()).log(Level.SEVERE, null, ex);
        }
       return "";
         
    }
       private String dameIdVenta(){
           String id="";
        try {
            Conexion cn = new Conexion();
            cn.conectar();
            ResultSet detalles = cn.consultar("select * from ventas where nro_factura =  '"+factura_n.getText().trim()+"'");
            if (detalles.isBeforeFirst()) {
                while (detalles.next()) {   
                    id = detalles.getString("ventas_id");
                    return id;
                }
             }
        } catch (SQLException ex) {
            Logger.getLogger(busPedidoCompra.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(busPedidoCompra.class.getName()).log(Level.SEVERE, null, ex);
        }
       return "";
         
    }
    
    public void combomotivo(){

                    combo_motivo_nota.removeAllItems();
                    String items[]=new String[]{"Ventas","Traslados","Compras"};
                    javax.swing.DefaultComboBoxModel jcbm= new javax.swing.DefaultComboBoxModel(items);
                    combo_motivo_nota.setModel(jcbm);
                    combo_motivo_nota.setEnabled(true);
                    combo_motivo_nota.requestFocus();

    }

    
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnular;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEnviar;
    private javax.swing.JButton btnGrabar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnRecibir;
    private javax.swing.JButton btnSalir;
    public static javax.swing.JTextField can;
    private javax.swing.JTextField ci_cli;
    private javax.swing.JLabel cli;
    private javax.swing.JLabel cli1;
    private javax.swing.JTextField cli_nom;
    public static javax.swing.JTextField cod_conductor;
    public static javax.swing.JTextField cod_vehiculo;
    private javax.swing.JComboBox combo_deposito_emisor;
    private javax.swing.JComboBox combo_deposito_llegada;
    private javax.swing.JComboBox combo_motivo_nota;
    private javax.swing.JComboBox combo_sucursal_salida;
    private javax.swing.JTextField factura_n;
    private com.toedter.calendar.JDateChooser fecha_fin;
    private com.toedter.calendar.JDateChooser fecha_inicio;
    private javax.swing.JTable grilla;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
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
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JToolBar jToolBar5;
    private javax.swing.JComboBox sucursal_receptora;
    public static javax.swing.JTextField txtChasis;
    public static javax.swing.JTextField txtCod;
    public static javax.swing.JTextField txtCodUsuario;
    public static javax.swing.JTextField txtConductor;
    public static com.toedter.calendar.JDateChooser txtFecha;
    public static javax.swing.JTextField txtSucu;
    public static javax.swing.JTextField txtUsuario;
    public static javax.swing.JTextField txt_nombre_arti;
    public static javax.swing.JTextField txtcodigo;
    // End of variables declaration//GEN-END:variables

    private void limpiar_text()
{

           combo_motivo_nota.removeAllItems();
           combo_motivo_nota.setEnabled(false);
           combo_sucursal_salida.removeAllItems();
           combo_sucursal_salida.setEnabled(false);
           combo_deposito_llegada.removeAllItems();
           combo_deposito_llegada.setEnabled(false);
           sucursal_receptora.setEnabled(false);
           sucursal_receptora.removeAllItems();
           ci_cli.setText("");
           factura_n.setText("");
           factura_n.setEnabled(false);
           cli_nom.setText("");
           fecha_inicio.setCalendar(null);
           fecha_fin.setCalendar(null);
           txtcodigo.setText("");
           txtcodigo.setEnabled(false);
           cod_vehiculo.setText("");
           cod_vehiculo.setEnabled(false);
           txtChasis.setText("");
           txtChasis.setEnabled(false);
           cod_conductor.setText("");
           cod_conductor.setEnabled(false);
           txtConductor.setText("");
           txtConductor.setEnabled(false);
           txt_nombre_arti.setText("");
           txt_nombre_arti.setEnabled(false);
           can.setText("");
           txtCod.setText("");
           can.setEnabled(false);
           fecha_inicio.setEnabled(false);
           fecha_fin.setEnabled(false);
           btnNuevo.setEnabled(true);
           btnAnular.setEnabled(true);
           btnModificar.setEnabled(true);
           btnEnviar.setEnabled(true);
           btnRecibir.setEnabled(true);
           btnCancelar.setEnabled(false);
           btnGrabar.setEnabled(false);
           btnSalir.setEnabled(true);
           combo_deposito_emisor.removeAllItems();
           combo_deposito_llegada.removeAllItems();
           sucursal_receptora.removeAllItems();
           combo_sucursal_salida.removeAllItems();
 }
}
