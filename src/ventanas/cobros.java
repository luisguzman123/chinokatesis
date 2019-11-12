

package ventanas;

import Acceso.Menu;
import clases.Conexion;
import clases.Metodos;
import com.toedter.calendar.JCalendar;
import java.awt.Toolkit;
import java.sql.*;
import java.awt.event.ActionEvent.*;
import java.awt.event.KeyEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

// para reportes
import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.view.*;
import net.sf.jasperreports.engine.util.JRLoader;
import java.util.HashMap;
import java.net.URL;
import java.util.Calendar;
import javax.swing.table.DefaultTableModel;

//////



public class cobros extends javax.swing.JFrame {

    String operacion = "";
    String confirmar = "";
    String mensaje = "";
    boolean duplicado;

    public static String busqueda = "";
    public static String estadoParaFactura = "";

    public static String usuario;
    public static String empleado;
    public static String nivel;
    public static String idUsuario;
    public static String idSucursal;
    public static String idPersonal;


    public cobros() {
        initComponents();
        txtFecha.setDate(new JCalendar().getDate());
    }
   
   // @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        grilla_cuentas = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        txt_cob_monto = new javax.swing.JTextField();
        txt_abonado = new javax.swing.JTextField();
        txt_vuelto = new javax.swing.JTextField();
        txt_efectivo = new javax.swing.JTextField();
        cmb_combofcobro = new javax.swing.JComboBox();
        jPanel3 = new javax.swing.JPanel();
        btn_cobrar = new javax.swing.JButton();
        btn_anular = new javax.swing.JButton();
        btn_grabar = new javax.swing.JButton();
        btn_cancelar = new javax.swing.JButton();
        btn_salir = new javax.swing.JButton();
        jLabel22 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        grilla_cheque = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        che_titu = new javax.swing.JTextField();
        txt_che_monto = new javax.swing.JTextField();
        txt_che_nro = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txt_che_banco = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txt_total_che = new javax.swing.JTextField();
        borrar1 = new javax.swing.JButton();
        txt_che_fecha = new com.toedter.calendar.JDateChooser();
        txt_che_banco_desc = new javax.swing.JTextField();
        btn_ok = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        txt_cod_tarjeta = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txt_tar_monto = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        grilla_tarjeta = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        txt_total_tar = new javax.swing.JTextField();
        borrar = new javax.swing.JButton();
        txt_tarjeta = new javax.swing.JTextField();
        btn_ok_tarjeta = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        txt_bauche = new javax.swing.JTextField();
        cliente = new javax.swing.JLabel();
        cmb_factura = new javax.swing.JComboBox();
        jLabel23 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        txtCod = new javax.swing.JTextField();
        txtFecha = new com.toedter.calendar.JDateChooser();
        jLabel20 = new javax.swing.JLabel();
        txtCaja = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        txtCodUsuario = new javax.swing.JTextField();
        txtUsuario = new javax.swing.JTextField();
        txtCodCliente = new javax.swing.JTextField();
        txtCliente = new javax.swing.JTextField();
        txtSucursal = new javax.swing.JTextField();
        txtCajaDesc = new javax.swing.JTextField();
        txt_recibo = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("COBRANZAS");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel7.setText("FORMA COBRO");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 380, 115, -1));

        grilla_cuentas.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        grilla_cuentas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NUMERO", "CUOTA", "VTO", "COBRAR"
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
        grilla_cuentas.setGridColor(new java.awt.Color(153, 153, 153));
        grilla_cuentas.setPreferredSize(new java.awt.Dimension(50, 224));
        grilla_cuentas.getTableHeader().setReorderingAllowed(false);
        grilla_cuentas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                grilla_cuentasMouseClicked(evt);
            }
        });
        grilla_cuentas.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                grilla_cuentasPropertyChange(evt);
            }
        });
        grilla_cuentas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                grilla_cuentasKeyPressed(evt);
            }
        });
        jScrollPane4.setViewportView(grilla_cuentas);

        getContentPane().add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 120, 464, 170));

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txt_cob_monto.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        txt_cob_monto.setBorder(javax.swing.BorderFactory.createTitledBorder("TOTAL A PAGAR"));
        txt_cob_monto.setEnabled(false);
        txt_cob_monto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_cob_montoActionPerformed(evt);
            }
        });

        txt_abonado.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        txt_abonado.setBorder(javax.swing.BorderFactory.createTitledBorder("TOTAL ABONADO"));
        txt_abonado.setEnabled(false);
        txt_abonado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_abonadoActionPerformed(evt);
            }
        });

        txt_vuelto.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        txt_vuelto.setBorder(javax.swing.BorderFactory.createTitledBorder("VUELTO"));
        txt_vuelto.setEnabled(false);
        txt_vuelto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_vueltoActionPerformed(evt);
            }
        });

        txt_efectivo.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        txt_efectivo.setText("0");
        txt_efectivo.setBorder(javax.swing.BorderFactory.createTitledBorder("EFECTIVO"));
        txt_efectivo.setEnabled(false);
        txt_efectivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_efectivoActionPerformed(evt);
            }
        });
        txt_efectivo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_efectivoKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_efectivoKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(txt_efectivo, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_abonado)
                    .addComponent(txt_vuelto)
                    .addComponent(txt_cob_monto, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(txt_cob_monto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_abonado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_vuelto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(txt_efectivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 430, -1, -1));

        cmb_combofcobro.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cmb_combofcobro.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione una forma de pago", "1-EFECTIVO", "2-CHEQUE", "3-TARJETA", "4-EFECTIVO/CHEQUE", "5-EFECTIVO/TARJETA" }));
        cmb_combofcobro.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmb_combofcobroItemStateChanged(evt);
            }
        });
        cmb_combofcobro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cmb_combofcobroMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cmb_combofcobroMousePressed(evt);
            }
        });
        cmb_combofcobro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_combofcobroActionPerformed(evt);
            }
        });
        cmb_combofcobro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cmb_combofcobroKeyPressed(evt);
            }
        });
        getContentPane().add(cmb_combofcobro, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 380, 295, 29));

        jPanel3.setBackground(new java.awt.Color(0, 102, 102));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        btn_cobrar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_cobrar.setForeground(new java.awt.Color(0, 102, 102));
        btn_cobrar.setText("COBRAR");
        btn_cobrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cobrarActionPerformed(evt);
            }
        });

        btn_anular.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_anular.setForeground(new java.awt.Color(0, 102, 102));
        btn_anular.setText("ANULAR");
        btn_anular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_anularActionPerformed(evt);
            }
        });

        btn_grabar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_grabar.setForeground(new java.awt.Color(0, 102, 102));
        btn_grabar.setText("GRABAR");
        btn_grabar.setEnabled(false);
        btn_grabar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_grabarActionPerformed(evt);
            }
        });

        btn_cancelar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_cancelar.setForeground(new java.awt.Color(0, 102, 102));
        btn_cancelar.setText("CANCELAR");
        btn_cancelar.setEnabled(false);
        btn_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelarActionPerformed(evt);
            }
        });

        btn_salir.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_salir.setForeground(new java.awt.Color(0, 102, 102));
        btn_salir.setText("SALIR");
        btn_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btn_cobrar, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(btn_anular, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(btn_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(btn_grabar, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(btn_salir, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(5, 5, 5))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_cobrar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_anular, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_salir, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_grabar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 580, -1, 80));

        jLabel22.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel22.setText("CAJA:");
        getContentPane().add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 10, -1, -1));

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), "CHEQUE"));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));

        grilla_cheque.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        grilla_cheque.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nº", "Cod Banco", "Banco", "Monto", "Fecha", "Titular"
            }
        ));
        grilla_cheque.setGridColor(new java.awt.Color(153, 153, 153));
        grilla_cheque.setPreferredSize(new java.awt.Dimension(50, 224));
        jScrollPane3.setViewportView(grilla_cheque);
        if (grilla_cheque.getColumnModel().getColumnCount() > 0) {
            grilla_cheque.getColumnModel().getColumn(0).setMinWidth(40);
            grilla_cheque.getColumnModel().getColumn(0).setPreferredWidth(40);
            grilla_cheque.getColumnModel().getColumn(0).setMaxWidth(40);
            grilla_cheque.getColumnModel().getColumn(1).setResizable(false);
        }

        jLabel11.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Nº Cheque");

        jLabel12.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Monto");

        jLabel15.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Titular");

        che_titu.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        che_titu.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        che_titu.setEnabled(false);
        che_titu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                che_tituActionPerformed(evt);
            }
        });
        che_titu.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                che_tituKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                che_tituKeyTyped(evt);
            }
        });

        txt_che_monto.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_che_monto.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txt_che_monto.setEnabled(false);
        txt_che_monto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_che_montoActionPerformed(evt);
            }
        });
        txt_che_monto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_che_montoKeyTyped(evt);
            }
        });

        txt_che_nro.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_che_nro.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txt_che_nro.setEnabled(false);
        txt_che_nro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_che_nroActionPerformed(evt);
            }
        });
        txt_che_nro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_che_nroKeyTyped(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Banco");

        txt_che_banco.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_che_banco.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txt_che_banco.setEnabled(false);
        txt_che_banco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_che_bancoActionPerformed(evt);
            }
        });
        txt_che_banco.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_che_bancoKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_che_bancoKeyTyped(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Fecha");

        jLabel16.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("TOTAL CHEQUE");

        txt_total_che.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_total_che.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txt_total_che.setEnabled(false);
        txt_total_che.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_total_cheActionPerformed(evt);
            }
        });

        borrar1.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        borrar1.setText("BORRAR ITEM");
        borrar1.setEnabled(false);
        borrar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrar1ActionPerformed(evt);
            }
        });

        txt_che_fecha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_che_fechaKeyPressed(evt);
            }
        });

        txt_che_banco_desc.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_che_banco_desc.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txt_che_banco_desc.setEnabled(false);
        txt_che_banco_desc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_che_banco_descActionPerformed(evt);
            }
        });
        txt_che_banco_desc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_che_banco_descKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_che_banco_descKeyTyped(evt);
            }
        });

        btn_ok.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        btn_ok.setText("OK");
        btn_ok.setEnabled(false);
        btn_ok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_okActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING, 0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(19, 19, 19)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel12)
                                .addComponent(jLabel11)
                                .addComponent(jLabel15))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txt_che_nro, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txt_che_monto, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(36, 36, 36)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel14)
                                        .addComponent(jLabel13))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txt_che_fecha, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addComponent(txt_che_banco, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(txt_che_banco_desc))))
                                .addComponent(che_titu))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(borrar1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_ok)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                        .addComponent(jLabel16)
                        .addGap(18, 18, 18)
                        .addComponent(txt_total_che, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txt_che_nro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(txt_che_banco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_che_banco_desc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel12)
                        .addComponent(txt_che_monto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel13))
                    .addComponent(txt_che_fecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(che_titu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel16)
                        .addComponent(txt_total_che, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(borrar1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_ok, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, -1, -1));

        jPanel4.setBackground(new java.awt.Color(0, 102, 102));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "TARJETAS"));

        jLabel8.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Tarjeta");

        txt_cod_tarjeta.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_cod_tarjeta.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txt_cod_tarjeta.setEnabled(false);
        txt_cod_tarjeta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_cod_tarjetaActionPerformed(evt);
            }
        });
        txt_cod_tarjeta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_cod_tarjetaKeyTyped(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Monto");

        txt_tar_monto.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_tar_monto.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txt_tar_monto.setEnabled(false);
        txt_tar_monto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_tar_montoActionPerformed(evt);
            }
        });
        txt_tar_monto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_tar_montoKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_tar_montoKeyTyped(evt);
            }
        });

        grilla_tarjeta.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        grilla_tarjeta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nombre", "Monto", "Bauche"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        grilla_tarjeta.setGridColor(new java.awt.Color(153, 153, 153));
        grilla_tarjeta.setPreferredSize(new java.awt.Dimension(50, 224));
        jScrollPane2.setViewportView(grilla_tarjeta);

        jLabel10.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Total");

        txt_total_tar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_total_tar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txt_total_tar.setEnabled(false);
        txt_total_tar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_total_tarActionPerformed(evt);
            }
        });

        borrar.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        borrar.setText("BORRAR ITEM");
        borrar.setEnabled(false);
        borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrarActionPerformed(evt);
            }
        });

        txt_tarjeta.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_tarjeta.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txt_tarjeta.setEnabled(false);
        txt_tarjeta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_tarjetaActionPerformed(evt);
            }
        });
        txt_tarjeta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_tarjetaKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_tarjetaKeyTyped(evt);
            }
        });

        btn_ok_tarjeta.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        btn_ok_tarjeta.setText("OK");
        btn_ok_tarjeta.setEnabled(false);
        btn_ok_tarjeta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ok_tarjetaActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("N° Bauche");

        txt_bauche.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_bauche.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txt_bauche.setEnabled(false);
        txt_bauche.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_baucheActionPerformed(evt);
            }
        });
        txt_bauche.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_baucheKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_baucheKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel17)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt_bauche))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(borrar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_ok_tarjeta)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel10)
                                .addGap(18, 18, 18)
                                .addComponent(txt_total_tar, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                                .addComponent(txt_cod_tarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_tarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt_tar_monto)))
                        .addContainerGap(21, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_cod_tarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(txt_tar_monto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_tarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(txt_bauche, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(borrar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel10)
                        .addComponent(txt_total_tar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_ok_tarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, -1));

        cliente.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        cliente.setText("CLIENTE");
        getContentPane().add(cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(465, 90, 70, -1));

        cmb_factura.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cmb_factura.setToolTipText("elija el numero de factura y presione enter");
        cmb_factura.setEnabled(false);
        cmb_factura.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmb_facturaItemStateChanged(evt);
            }
        });
        cmb_factura.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cmb_facturaMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cmb_facturaMousePressed(evt);
            }
        });
        cmb_factura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_facturaActionPerformed(evt);
            }
        });
        cmb_factura.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cmb_facturaKeyPressed(evt);
            }
        });
        getContentPane().add(cmb_factura, new org.netbeans.lib.awtextra.AbsoluteConstraints(739, 87, 155, -1));

        jLabel23.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel23.setText("Nº Factura");
        getContentPane().add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(797, 58, 93, -1));

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel19.setText("Código");
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

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
        getContentPane().add(txtCod, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, 120, -1));
        getContentPane().add(txtFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 170, -1));

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel20.setText("Sucursal:");
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, -1, -1));

        txtCaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCajaActionPerformed(evt);
            }
        });
        getContentPane().add(txtCaja, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 10, 30, -1));

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel21.setText("N° Recibo");
        getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 80, -1, -1));

        txtCodUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(txtCodUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 20, 30, -1));

        txtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 20, 80, -1));
        getContentPane().add(txtCodCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(539, 90, 30, 22));

        txtCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtClienteActionPerformed(evt);
            }
        });
        txtCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtClienteKeyPressed(evt);
            }
        });
        getContentPane().add(txtCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(579, 89, 150, 23));

        txtSucursal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSucursalActionPerformed(evt);
            }
        });
        getContentPane().add(txtSucursal, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 50, 110, -1));

        txtCajaDesc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCajaDescActionPerformed(evt);
            }
        });
        getContentPane().add(txtCajaDesc, new org.netbeans.lib.awtextra.AbsoluteConstraints(816, 10, 78, -1));
        getContentPane().add(txt_recibo, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 80, 80, -1));

        jLabel24.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel24.setText("Usuario");
        getContentPane().add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, -1, -1));

        setSize(new java.awt.Dimension(936, 704));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txt_cod_tarjetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_cod_tarjetaActionPerformed
   
}//GEN-LAST:event_txt_cod_tarjetaActionPerformed

    private void txt_tar_montoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_tar_montoActionPerformed
       txt_bauche.setEnabled(true);
       txt_bauche.requestFocus();
}//GEN-LAST:event_txt_tar_montoActionPerformed

    private void txt_che_nroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_che_nroActionPerformed
     txt_che_banco_desc.setEnabled(true);
     txt_che_banco_desc.requestFocus();
}//GEN-LAST:event_txt_che_nroActionPerformed

    private void txt_che_montoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_che_montoActionPerformed
      txt_che_fecha.setEnabled(true);
      txt_che_fecha.requestFocus();
      che_titu.setEnabled(true);
}//GEN-LAST:event_txt_che_montoActionPerformed

    private void txt_che_bancoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_che_bancoActionPerformed
      
}//GEN-LAST:event_txt_che_bancoActionPerformed

    private void che_tituActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_che_tituActionPerformed
        for (int fila = 0; fila <grilla_cheque.getRowCount(); fila++) {
         String codigoEnRenglon = (String)grilla_cheque.getValueAt(fila, 0);
         String codigoBanco = (String)grilla_cheque.getValueAt(fila, 1);
        
         if (txt_che_nro.getText().equals(codigoEnRenglon)&&txt_che_banco.getText().equals(codigoBanco)) {
                JOptionPane.showMessageDialog(null, "Este registro ya se encuentra en la tabla");
                txt_che_nro.setText("");
                txt_che_banco.setText("");
                txt_che_banco_desc.setText("");
                txt_che_monto.setText("");
                che_titu.setText("");
                txt_che_nro.requestFocus();
               
                return;
            }
        }
                    Metodos.cargarTabla(grilla_cheque, new Object[]{
                    txt_che_nro.getText().trim(),
                    txt_che_banco.getText().trim(),
                    txt_che_banco_desc.getText().trim(),
                    txt_che_monto.getText().trim(),
                    Metodos.convertirFechaSql(txt_che_fecha.getDate()),
                    che_titu.getText().trim()
                        });
                    btn_ok.setEnabled(true);
                    borrar1.setEnabled(true);
                    txt_total_che.setText(String.valueOf(Metodos.sumarColumna(grilla_cheque, 3)));
                    txt_che_nro.setText("");
                    txt_che_banco.setText("");
                    txt_che_banco_desc.setText("");
                    txt_che_monto.setText("");
                    che_titu.setText("");
                    txt_che_nro.requestFocus();

}//GEN-LAST:event_che_tituActionPerformed

    private void txt_efectivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_efectivoActionPerformed
        if (cmb_combofcobro.getSelectedIndex()==1) {
            if (Integer.parseInt(txt_efectivo.getText().trim())<Integer.parseInt(txt_cob_monto.getText().trim())) {
                JOptionPane.showMessageDialog(null, "El valor del efectivo debe alcanzar el total a pagar");
            }else{
                txt_abonado.setText(txt_efectivo.getText());
                txt_vuelto.setText(String.valueOf(Integer.parseInt(txt_efectivo.getText().trim())-Integer.parseInt(txt_cob_monto.getText().trim())));
            }
            
        }else if (cmb_combofcobro.getSelectedIndex()==4) {
            txt_che_nro.setEnabled(true);
            txt_che_nro.requestFocus();
        }else if (cmb_combofcobro.getSelectedIndex()==5) {
            txt_tarjeta.setEnabled(true);
            txt_tarjeta.requestFocus();
        }
}//GEN-LAST:event_txt_efectivoActionPerformed

    private void txt_cob_montoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_cob_montoActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_txt_cob_montoActionPerformed

    private void txt_abonadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_abonadoActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_txt_abonadoActionPerformed

    private void txt_vueltoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_vueltoActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_txt_vueltoActionPerformed

    private void btn_cobrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cobrarActionPerformed
        txtCliente.setEditable(true);
        txtCliente.requestFocus();
        
        
        txtCod.setText(Metodos.siguienteCodigo("cobro_id", "cobranzas"));
        
        btn_cobrar.setEnabled(false);
        btn_anular.setEnabled(false);
        btn_salir.setEnabled(false);
        btn_grabar.setEnabled(true);
        btn_cancelar.setEnabled(true);
        
        operacion = "agregar";
        confirmar = "¿Desea grabar el nuevo registro?";
        mensaje = "Registro grabado con exito";
    }//GEN-LAST:event_btn_cobrarActionPerformed

    private void btn_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarActionPerformed
        btn_cobrar.setEnabled(true);
        btn_anular.setEnabled(true);
        btn_salir.setEnabled(true);
        btn_grabar.setEnabled(false);
        btn_cancelar.setEnabled(false);
        txtCod.setText("");
        
        Metodos.limpiarTabla(grilla_cuentas);
        Metodos.limpiarTabla(grilla_tarjeta);
        Metodos.limpiarTabla(grilla_cheque);
        
    }//GEN-LAST:event_btn_cancelarActionPerformed

    private void btn_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salirActionPerformed
        dispose();
    }//GEN-LAST:event_btn_salirActionPerformed

 private void cmb_combofcobroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_combofcobroActionPerformed
//fcobros();
    
}//GEN-LAST:event_cmb_combofcobroActionPerformed
 
        private void txt_tar_montoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_tar_montoKeyPressed


        }//GEN-LAST:event_txt_tar_montoKeyPressed

        private void cmb_combofcobroKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cmb_combofcobroKeyPressed

        }//GEN-LAST:event_cmb_combofcobroKeyPressed

        private void cmb_combofcobroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmb_combofcobroMouseClicked

        }//GEN-LAST:event_cmb_combofcobroMouseClicked

        private void cmb_combofcobroMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmb_combofcobroMousePressed

        }//GEN-LAST:event_cmb_combofcobroMousePressed

        private void grilla_cuentasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_grilla_cuentasMouseClicked
      
        }//GEN-LAST:event_grilla_cuentasMouseClicked

        private void txt_efectivoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_efectivoKeyPressed

        }//GEN-LAST:event_txt_efectivoKeyPressed

        private void grilla_cuentasKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_grilla_cuentasKeyPressed
   
        }//GEN-LAST:event_grilla_cuentasKeyPressed

        private void txt_total_tarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_total_tarActionPerformed
          
}//GEN-LAST:event_txt_total_tarActionPerformed

        private void txt_total_cheActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_total_cheActionPerformed

}//GEN-LAST:event_txt_total_cheActionPerformed

        private void borrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrarActionPerformed
            int fila  = grilla_tarjeta.getSelectedRow();
            Metodos.eliminarFila(grilla_tarjeta, fila);
            txt_total_tar.setText(String.valueOf(Metodos.sumarColumna(grilla_tarjeta, 2)));
}//GEN-LAST:event_borrarActionPerformed

        private void borrar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrar1ActionPerformed
             int fila  = grilla_cheque.getSelectedRow();
            Metodos.eliminarFila(grilla_cheque, fila);
            txt_total_che.setText(String.valueOf(Metodos.sumarColumna(grilla_cheque, 3)));
        }//GEN-LAST:event_borrar1ActionPerformed

        private void cmb_facturaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmb_facturaMouseClicked
            // TODO add your handling code here:
}//GEN-LAST:event_cmb_facturaMouseClicked

        private void cmb_facturaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmb_facturaMousePressed
            // TODO add your handling code here:
}//GEN-LAST:event_cmb_facturaMousePressed

        private void cmb_facturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_facturaActionPerformed
        grilla_cuentas.setEnabled(true);
        dameDetallesDeCuentaCobrar();
}//GEN-LAST:event_cmb_facturaActionPerformed

        private void cmb_facturaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cmb_facturaKeyPressed
        grilla_cuentas.setEnabled(true);
        dameDetallesDeCuentaCobrar();
}//GEN-LAST:event_cmb_facturaKeyPressed

        private void txt_efectivoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_efectivoKeyTyped

        }//GEN-LAST:event_txt_efectivoKeyTyped

        private void txt_cod_tarjetaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_cod_tarjetaKeyTyped

        }//GEN-LAST:event_txt_cod_tarjetaKeyTyped

        private void txt_tar_montoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_tar_montoKeyTyped

        }//GEN-LAST:event_txt_tar_montoKeyTyped

        private void txt_che_nroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_che_nroKeyTyped

        }//GEN-LAST:event_txt_che_nroKeyTyped

        private void txt_che_bancoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_che_bancoKeyTyped
        }//GEN-LAST:event_txt_che_bancoKeyTyped

        private void txt_che_montoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_che_montoKeyTyped

        }//GEN-LAST:event_txt_che_montoKeyTyped

        private void che_tituKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_che_tituKeyTyped


        }//GEN-LAST:event_che_tituKeyTyped

        private void che_tituKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_che_tituKeyPressed

        }//GEN-LAST:event_che_tituKeyPressed

        private void btn_anularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_anularActionPerformed
            txtCod.setEditable(true);
        txtCod.requestFocus();
        
        btn_cobrar.setEnabled(false);
        btn_anular.setEnabled(false);
        btn_salir.setEnabled(false);
        btn_grabar.setEnabled(true);
        btn_cancelar.setEnabled(true);

        operacion = "anular";
        confirmar = "¿Desea anular este registro?";
        mensaje = "Registro anulado con exito";
        }//GEN-LAST:event_btn_anularActionPerformed

    private void txtCodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodActionPerformed
        if (txtCod.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Debe cargar el código de cobranza");
        }else if (estadoAnulado().equals("anulado")) {
            JOptionPane.showMessageDialog(null, "Esta cobranza ya está anulada");
        }else{
                //traerfactura();
                cmb_factura.addItem(traerfactura());
                btn_grabar.doClick();
            }
    }//GEN-LAST:event_txtCodActionPerformed

    private void txtCodKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodKeyPressed
        if (txtCod.getText().equals("") && evt.getKeyCode() == evt.VK_F2) {
            busCompras.busqueda = "compra";
            new busCompras().setVisible(true);

        }
    }//GEN-LAST:event_txtCodKeyPressed

    private void txtCajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCajaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCajaActionPerformed

    private void txtCodUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodUsuarioActionPerformed

    private void txtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuarioActionPerformed

    private void txtClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtClienteActionPerformed
        dameFacturasDelCliente();
        cmb_combofcobro.setEnabled(true);
    }//GEN-LAST:event_txtClienteActionPerformed

    private void txtClienteKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtClienteKeyPressed
        if (txtCliente.getText().equals("") && evt.getKeyCode() == evt.VK_F2) {
            clientes.busqueda = "cobros";
            new clientes().setVisible(true);
            cmb_factura.removeAllItems();

        }
    }//GEN-LAST:event_txtClienteKeyPressed

    private void txtSucursalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSucursalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSucursalActionPerformed

    private void txtCajaDescActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCajaDescActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCajaDescActionPerformed

    private void cmb_facturaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmb_facturaItemStateChanged
//        grilla_cuentas.setEnabled(true);
//        dameDetallesDeCuentaCobrar();
    }//GEN-LAST:event_cmb_facturaItemStateChanged

    private void grilla_cuentasPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_grilla_cuentasPropertyChange
       int t= Metodos.sumarColumnaBooleana(grilla_cuentas, 1, 3);
       txt_cob_monto.setText(String.valueOf(t));
    }//GEN-LAST:event_grilla_cuentasPropertyChange

    private void cmb_combofcobroItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmb_combofcobroItemStateChanged
        if (cmb_combofcobro.getSelectedIndex()==1) {
             txt_efectivo.setText("");
            txt_efectivo.setEnabled(true);
            txt_efectivo.requestFocus();
        }else if (cmb_combofcobro.getSelectedIndex()==2) {
            txt_che_nro.setEnabled(true);
            txt_che_nro.requestFocus();
        }else if (cmb_combofcobro.getSelectedIndex()==3) {
            txt_tarjeta.setEnabled(true);
            txt_tarjeta.requestFocus();
        }else if (cmb_combofcobro.getSelectedIndex()==4) {
            txt_efectivo.setEnabled(true);
            txt_efectivo.requestFocus();
        }else if (cmb_combofcobro.getSelectedIndex()==5) {
            txt_efectivo.setEnabled(true);
            txt_efectivo.requestFocus();
        }
    }//GEN-LAST:event_cmb_combofcobroItemStateChanged

    private void txt_che_bancoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_che_bancoKeyPressed
  
    }//GEN-LAST:event_txt_che_bancoKeyPressed

    private void txt_che_banco_descActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_che_banco_descActionPerformed
        txt_che_monto.setEnabled(true);
        txt_che_monto.requestFocus();
    }//GEN-LAST:event_txt_che_banco_descActionPerformed

    private void txt_che_banco_descKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_che_banco_descKeyPressed
        if (txt_che_banco.getText().equals("") && evt.getKeyCode() == evt.VK_F2) {
            bancos.busqueda = "cobros";
            new bancos().setVisible(true);

        }
    }//GEN-LAST:event_txt_che_banco_descKeyPressed

    private void txt_che_banco_descKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_che_banco_descKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_che_banco_descKeyTyped

    private void txt_che_fechaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_che_fechaKeyPressed
       che_titu.setEnabled(true);
       che_titu.requestFocus();
    }//GEN-LAST:event_txt_che_fechaKeyPressed

    private void btn_okActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_okActionPerformed
        if (cmb_combofcobro.getSelectedIndex()==2) {
            if (Integer.parseInt(txt_total_che.getText().trim())==Integer.parseInt(txt_cob_monto.getText().trim())) {
                txt_abonado.setText(txt_total_che.getText());
                txt_vuelto.setText(String.valueOf(Integer.parseInt(txt_total_che.getText().trim())-Integer.parseInt(txt_cob_monto.getText().trim())));
                
            }else{
                JOptionPane.showMessageDialog(null, "El valor del cheque debe ser igual al total a pagar");
            }
            
        }else if (cmb_combofcobro.getSelectedIndex()==4) {
            if ((Integer.parseInt(txt_efectivo.getText().trim())+Integer.parseInt(txt_total_che.getText().trim()))<Integer.parseInt(txt_cob_monto.getText())) {
                JOptionPane.showMessageDialog(null, "Debe alcanzar el pago total");
                txt_che_nro.requestFocus();
            }else if((Integer.parseInt(txt_efectivo.getText().trim())+Integer.parseInt(txt_total_che.getText().trim()))==Integer.parseInt(txt_cob_monto.getText())){
                txt_abonado.setText(String.valueOf(Integer.parseInt(txt_efectivo.getText().trim())+Integer.parseInt(txt_total_che.getText().trim())));
                txt_vuelto.setText(String.valueOf((Integer.parseInt(txt_efectivo.getText().trim())+Integer.parseInt(txt_total_che.getText().trim()))-Integer.parseInt(txt_cob_monto.getText().trim())));
            }else if ((Integer.parseInt(txt_efectivo.getText().trim())+Integer.parseInt(txt_total_che.getText().trim()))>Integer.parseInt(txt_cob_monto.getText())) {
                JOptionPane.showMessageDialog(null, "No debe pasar el total a pagar");
                txt_che_nro.requestFocus();
            }
        }
    }//GEN-LAST:event_btn_okActionPerformed

    private void txt_tarjetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_tarjetaActionPerformed
        txt_tar_monto.setEnabled(true);
        txt_tar_monto.requestFocus();
    }//GEN-LAST:event_txt_tarjetaActionPerformed

    private void txt_tarjetaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_tarjetaKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_tarjetaKeyTyped

    private void txt_tarjetaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_tarjetaKeyPressed
        if (txt_tarjeta.getText().equals("") && evt.getKeyCode() == evt.VK_F2) {
            tarjeta.busqueda = "cobros";
            new tarjeta().setVisible(true);

        }
    }//GEN-LAST:event_txt_tarjetaKeyPressed

    private void btn_ok_tarjetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ok_tarjetaActionPerformed
        if (cmb_combofcobro.getSelectedIndex()==3) {
            if (Integer.parseInt(txt_total_tar.getText().trim())==Integer.parseInt(txt_cob_monto.getText().trim())) {
                txt_abonado.setText(txt_total_tar.getText());
                txt_vuelto.setText(String.valueOf(Integer.parseInt(txt_total_tar.getText().trim())-Integer.parseInt(txt_cob_monto.getText().trim())));
                
            }else{
                JOptionPane.showMessageDialog(null, "El valor debe alcanzar el pago total");
            }
            
        }else if (cmb_combofcobro.getSelectedIndex()==5) {
            if ((Integer.parseInt(txt_efectivo.getText().trim())+Integer.parseInt(txt_total_tar.getText().trim()))<Integer.parseInt(txt_cob_monto.getText())) {
                JOptionPane.showMessageDialog(null, "Debe alcanzar el pago total");
                txt_tarjeta.requestFocus();
            }else if((Integer.parseInt(txt_efectivo.getText().trim())+Integer.parseInt(txt_total_tar.getText().trim()))==Integer.parseInt(txt_cob_monto.getText())){
                txt_abonado.setText(String.valueOf(Integer.parseInt(txt_efectivo.getText().trim())+Integer.parseInt(txt_total_tar.getText().trim())));
                txt_vuelto.setText(String.valueOf((Integer.parseInt(txt_efectivo.getText().trim())+Integer.parseInt(txt_total_tar.getText().trim()))-Integer.parseInt(txt_cob_monto.getText().trim())));
            }else if ((Integer.parseInt(txt_efectivo.getText().trim())+Integer.parseInt(txt_total_tar.getText().trim()))>Integer.parseInt(txt_cob_monto.getText())) {
                JOptionPane.showMessageDialog(null, "No debe pasar el total a pagar");
                txt_tarjeta.requestFocus();
            }
        }
    }//GEN-LAST:event_btn_ok_tarjetaActionPerformed

    
    public String verTipoDepago(){
        if (cmb_combofcobro.getSelectedIndex()==0) {
            return "";
        }else if (cmb_combofcobro.getSelectedIndex()==1) {
            return "1";
        }else if (cmb_combofcobro.getSelectedIndex()==2) {
            return "2";
        }else if (cmb_combofcobro.getSelectedIndex()==3) {
            return "3";
        }else if (cmb_combofcobro.getSelectedIndex()==4) {
            return "4";
        }else if (cmb_combofcobro.getSelectedIndex()==5) {
            return "5";
        }
        return "";
    }
    
    
    private void btn_grabarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_grabarActionPerformed
        int respuesta=5;
        
        respuesta=JOptionPane.showConfirmDialog(null, confirmar);
        
        
        
        if(respuesta==0){
            String sql="";
            
            String sqlCheque="";
            String sqlTarjeta="";
            String sqlDetalleCobros="";
            String sqlCuentasACobrar="";
            if(operacion.equals("agregar")){
                sql="Insert into cobranzas (cobro_id, co_fecha, co_estado, monto, for_pago_id, cod_aper_cierre, cod_caja, sucur_id, usu_id, emp_id, cli_cod, nro_recibo)"
                        + " values ("+
                        Metodos.siguienteCodigo("cobro_id", "cobranzas")+", '"+
                        Metodos.dameFechaFormateadaSQL(txtFecha.getDate())+"','ACTIVO', "+
                        txt_efectivo.getText().trim()+", "+
                        verTipoDepago()+", "+
                        Metodos.cajaAbierta()+", "+
                        Metodos.dameCodcaja()+", "+
                        Menu.idSucursal+", "+
                        Menu.idUsuario+", "+
                        Menu.idEmpleado+", "+
                        txtCodCliente.getText().trim()+", "+
                        txt_recibo.getText().trim()+")";
                
//             String factura = "update timbrado set numeracion_actual = numeracion_actual+1";
             
                
            
            Conexion cn=new Conexion();
            try {
                cn.conectar();
                System.out.println(sql);
                cn.actualizar(sql);
              
                if (cmb_combofcobro.getSelectedIndex()==2||cmb_combofcobro.getSelectedIndex()==4) {
                int cantidadFilasCheque=grilla_cheque.getRowCount();
                        for (int i = 0; i < cantidadFilasCheque; i++) {
                            sqlCheque = "insert into cobro_cheque (ban_id, cobro_id, nro_cheque, co_monto, titular, co_fecha) values (" 
                            +grilla_cheque.getValueAt(i, 1)+", "
                            +Metodos.ultimoCodigo("cobro_id", "cobranzas")+", "
                            +grilla_cheque.getValueAt(i, 0)+", "
                            +grilla_cheque.getValueAt(i, 3)+", '"
                            +grilla_cheque.getValueAt(i, 5)+"', '"
                            +grilla_cheque.getValueAt(i, 4)+"')";
                            System.out.println(sqlCheque);
                            cn.actualizar(sqlCheque);
   
                        }   
                }else if (cmb_combofcobro.getSelectedIndex()==3||cmb_combofcobro.getSelectedIndex()==5) {
                    int cantidadFilasTarjeta=grilla_tarjeta.getRowCount();
                            for (int i = 0; i < cantidadFilasTarjeta; i++) {
                                sqlTarjeta = "insert into cobro_tarjeta (cod_cob_tarj, tar_cod, cobro_id, co_fecha, co_monto, nro_bauche) values (" 
                                +Metodos.siguienteCodigo("cod_cob_tarj", "cobro_tarjeta")+", "
                                +grilla_tarjeta.getValueAt(i, 0)+", "
                                +Metodos.ultimoCodigo("cobro_id", "cobranzas")+", '"
                                +Metodos.dameFechaFormateadaSQL(txtFecha.getDate())+"', "
                                +grilla_tarjeta.getValueAt(i, 2)+", '"
                                +grilla_tarjeta.getValueAt(i, 3)+"')";
                                System.out.println(sqlTarjeta);
                                cn.actualizar(sqlTarjeta);

                            } 
                }
                
                
                int cantidadFilas=grilla_cuentas.getRowCount();
                
                for (int i = 0; i < cantidadFilas; i++) {
                    System.out.println(grilla_cuentas.getValueAt(i, 3).toString());
                    if (Boolean.parseBoolean(grilla_cuentas.getValueAt(i, 3).toString())) {
                        sqlDetalleCobros = "insert into detalle_cobranzas (nro_cuota, ventas_id, cobro_id, saldo) values (" 
                        +grilla_cuentas.getValueAt(i, 0)+", "
                        +dameVentaId()+", "
                        +Metodos.ultimoCodigo("cobro_id", "cobranzas")+", 0)";
                        System.out.println(sqlDetalleCobros);
                        cn.actualizar(sqlDetalleCobros);
                        
                        
                        
                        sqlCuentasACobrar = "update cuenta_cobrar set estado = 'COBRADO' where ventas_id ="+dameVentaId()+" and nro_cuota = "+grilla_cuentas.getValueAt(i, 0)+"";
                        System.out.println(sqlCuentasACobrar);
                        cn.actualizar(sqlCuentasACobrar);
                        
                        
                    }
                    
                }
                
                
                
                
                JOptionPane.showMessageDialog(null, mensaje);
                btn_cancelar.doClick();

                
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(cobros.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, ex.getMessage());
            } catch (SQLException ex) {
                Logger.getLogger(cobros.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }    
            

                        
            }
            
            
            if(operacion.equals("anular")){
                sql="update cobranzas set"
                        + " co_estado = 'ANULADO' "
                        + " where cobro_id = "+txtCod.getText();
                Conexion cn=new Conexion();
                try {
                    cn.conectar();
                    cn.actualizar(sql);
                    actualizarCuentasAcobrar();
                    //actualizarCuentasAcobrar();
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(ventas.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(ventas.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
            
            
        }
        JOptionPane.showMessageDialog(null, mensaje);
        if (estadoParaFactura.equals("efectivoDesdeVentas")) {
            new Metodos().imprimirFactura(Integer.parseInt(dameVentaId()));
        }else if (estadoParaFactura.equals("usarRecibo")) {
            new Metodos().imprimirComprobanteCobranza(txtCliente.getText().trim(), txt_cob_monto.getText().trim(), "Pago por cuotas por venta a crédito", txt_recibo.getText().trim(), Metodos.dameFechaFormateadaSQL(txtFecha.getDate()));
        }
        btn_cancelar.doClick();
        dispose();
        
        
        
        
    }//GEN-LAST:event_btn_grabarActionPerformed

    
    public void actualizarCuentasAcobrar(){
        String sqllll = "";
        try {
            Conexion cn = new Conexion();
            cn.conectar();
            ResultSet detalles = cn.consultar("select * from detalle_cobranzas where cobro_id = "+txtCod.getText().trim()+" and ventas_id = "+dameVentaId()+"");
            if (detalles.isBeforeFirst()) {
                while (detalles.next()) {   
                   sqllll = "update cuenta_cobrar set estado = 'PENDIENTE' where ventas_id = "+dameVentaId()+" and nro_cuota = "+detalles.getString("nro_cuota");
                    System.out.println(sqllll);
                    cn.actualizar(sqllll);
                }
             }
        } catch (SQLException ex) {
            Logger.getLogger(busPedidoCompra.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(busPedidoCompra.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }
    public String estadoAnulado(){
        String sqllll = "";
        try {
            Conexion cn = new Conexion();
            cn.conectar();
            ResultSet detalles = cn.consultar("select * from cobranzas where cobro_id = "+txtCod.getText().trim()+" and co_estado = 'ANULADO'");
            if (detalles.isBeforeFirst()) {
                while (detalles.next()) {   
                   return "anulado";
                }
             }
        } catch (SQLException ex) {
            Logger.getLogger(busPedidoCompra.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(busPedidoCompra.class.getName()).log(Level.SEVERE, null, ex);
        } 
        return "";
    }
    
    
    
    
    
    private void txt_baucheActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_baucheActionPerformed
                for (int fila = 0; fila <grilla_tarjeta.getRowCount(); fila++) {
         String codigoEnRenglon = (String)grilla_tarjeta.getValueAt(fila, 0);
        
         if (txt_cod_tarjeta.getText().equals(codigoEnRenglon)) {
                JOptionPane.showMessageDialog(null, "Este registro ya se encuentra en la tabla");
                txt_cod_tarjeta.setText("");
                txt_tarjeta.setText("");
                txt_tar_monto.setText("");
                txt_bauche.setText("");
               
                return;
            }
        }
        
            Metodos.cargarTabla(grilla_tarjeta, new Object[]{
            txt_cod_tarjeta.getText().trim(),
            txt_tarjeta.getText().trim(),
            txt_tar_monto.getText().trim(),
            txt_bauche.getText().trim()
            });
            btn_ok_tarjeta.setEnabled(true);
            borrar.setEnabled(true);
            txt_total_tar.setText(String.valueOf(Metodos.sumarColumna(grilla_tarjeta, 2)));
            txt_cod_tarjeta.setText("");
            txt_tarjeta.setText("");
            txt_tar_monto.setText("");
            txt_bauche.setText("");
    }//GEN-LAST:event_txt_baucheActionPerformed

    private void txt_baucheKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_baucheKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_baucheKeyPressed

    private void txt_baucheKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_baucheKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_baucheKeyTyped

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new cobros().setVisible(true);
            }
        });
    }


    private void dameFacturasDelCliente(){
        try {
            Conexion cn = new Conexion();
            cn.conectar();
            ResultSet detalles = cn.consultar("select * from ventas where ven_tipo = 'CREDITO' and estado != 'ANULADO' and cli_cod ="+txtCodCliente.getText().trim()+"");
            cmb_factura.setEnabled(true);
            cmb_factura.removeAllItems();
            if (detalles.isBeforeFirst()) {
                while (detalles.next()) {   
                    cmb_factura.addItem(detalles.getString("nro_factura"));
                }
             }else{
                JOptionPane.showMessageDialog(null, "Este cliente no cuenta con facturas pendientes, por favor seleccione otro cliente.");
                txtCodCliente.setText("");
                txtCliente.setText("");
            }
        } catch (SQLException ex) {
            Logger.getLogger(busPedidoCompra.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(busPedidoCompra.class.getName()).log(Level.SEVERE, null, ex);
        }   
    }

    private void dameDetallesDeCuentaCobrar(){
        try {
            Conexion cn = new Conexion();
            cn.conectar();
            ResultSet detalles = cn.consultar("select * from cuenta_cobrar where estado = 'PENDIENTE' and ventas_id = "+dameVentaId()+"");
            Metodos.limpiarTabla(grilla_cuentas);
            if (detalles.isBeforeFirst()) {
                while (detalles.next()) {   
                    Metodos.cargarTabla(grilla_cuentas, new Object[]{
                    detalles.getString("nro_cuota"),
                    detalles.getString("monto"),
                    detalles.getString("fecha_vto"),
                    false
                    });
                }
             }
        } catch (SQLException ex) {
            Logger.getLogger(busPedidoCompra.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(busPedidoCompra.class.getName()).log(Level.SEVERE, null, ex);
        }   
    }
    
    
    private String dameVentaId(){
           String nn ="";
           String cod="";
        try {
            Conexion cn = new Conexion();
            cn.conectar();
            nn="select * from ventas where estado != 'ANULADO' and nro_factura = '"+cmb_factura.getSelectedItem().toString()+"'";
            ResultSet detalles = cn.consultar(nn);
            if (detalles.isBeforeFirst()) {
                while (detalles.next()) { 
                    cod=detalles.getString("ventas_id");
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
    private String traerfactura(){
           String nn ="";
           String cod="";
        try {
            Conexion cn = new Conexion();
            cn.conectar();
            nn="select \n" +
                "v.nro_factura\n" +
                "from\n" +
                "cobranzas co join\n" +
                "detalle_cobranzas dc\n" +
                " on co.cobro_id = dc.cobro_id\n" +
                " JOIN ventas v\n" +
                " on v.ventas_id = dc.ventas_id\n" +
                " WHERE co.cobro_id = "+txtCod.getText().trim()+"\n" +
                " LIMIT 1";
            ResultSet detalles = cn.consultar(nn);
            if (detalles.isBeforeFirst()) {
                while (detalles.next()) { 
                    cod=detalles.getString("nro_factura");
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

      
 

  //  Object dprecun  =cuotas.getValueAt(cuotas.getSelectedRow(),3);




     
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton borrar;
    private javax.swing.JButton borrar1;
    private javax.swing.JButton btn_anular;
    private javax.swing.JButton btn_cancelar;
    public static javax.swing.JButton btn_cobrar;
    private javax.swing.JButton btn_grabar;
    private javax.swing.JButton btn_ok;
    private javax.swing.JButton btn_ok_tarjeta;
    private javax.swing.JButton btn_salir;
    private javax.swing.JTextField che_titu;
    private javax.swing.JLabel cliente;
    private javax.swing.JComboBox cmb_combofcobro;
    public static javax.swing.JComboBox cmb_factura;
    private javax.swing.JTable grilla_cheque;
    private javax.swing.JTable grilla_cuentas;
    private javax.swing.JTable grilla_tarjeta;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    public static javax.swing.JTextField txtCaja;
    public static javax.swing.JTextField txtCajaDesc;
    public static javax.swing.JTextField txtCliente;
    public static javax.swing.JTextField txtCod;
    public static javax.swing.JTextField txtCodCliente;
    public static javax.swing.JTextField txtCodUsuario;
    public static com.toedter.calendar.JDateChooser txtFecha;
    public static javax.swing.JTextField txtSucursal;
    public static javax.swing.JTextField txtUsuario;
    private javax.swing.JTextField txt_abonado;
    private javax.swing.JTextField txt_bauche;
    public static javax.swing.JTextField txt_che_banco;
    public static javax.swing.JTextField txt_che_banco_desc;
    public static com.toedter.calendar.JDateChooser txt_che_fecha;
    private javax.swing.JTextField txt_che_monto;
    private javax.swing.JTextField txt_che_nro;
    private javax.swing.JTextField txt_cob_monto;
    public static javax.swing.JTextField txt_cod_tarjeta;
    private javax.swing.JTextField txt_efectivo;
    public static javax.swing.JTextField txt_recibo;
    private javax.swing.JTextField txt_tar_monto;
    public static javax.swing.JTextField txt_tarjeta;
    private javax.swing.JTextField txt_total_che;
    private javax.swing.JTextField txt_total_tar;
    private javax.swing.JTextField txt_vuelto;
    // End of variables declaration//GEN-END:variables


  
}
