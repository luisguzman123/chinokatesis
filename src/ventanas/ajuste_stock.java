/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;

import clases.Conexion;
import clases.Metodos;
import com.toedter.calendar.JCalendar;
import java.awt.event.ItemEvent;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


public class ajuste_stock extends javax.swing.JFrame {

    /**
     * Creates new form ajuste_stock
     */
    public ajuste_stock() {
        initComponents();
        this.setLocationRelativeTo(null);//centrar
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
    public static String pestaña;
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        combo_motivo = new javax.swing.JComboBox<>();
        tab_modos = new javax.swing.JTabbedPane();
        pestaña_materia = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        txt_cod_materia = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txt_ajuste_canti_materia = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        grilla_materia = new javax.swing.JTable();
        jdescri = new javax.swing.JLabel();
        txt_materia_prima = new javax.swing.JTextField();
        txt_canti_materia = new javax.swing.JTextField();
        jdescri3 = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        txtNroDeposito = new javax.swing.JTextField();
        txt_deposito = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        jPanel5 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel19 = new javax.swing.JLabel();
        txtSucu = new javax.swing.JTextField();
        txtFecha = new com.toedter.calendar.JDateChooser();
        jLabel17 = new javax.swing.JLabel();
        txtCodUsuario = new javax.swing.JTextField();
        txtUsuario = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        txtCod = new javax.swing.JTextField();
        jPanel8 = new javax.swing.JPanel();
        Bnuevo = new javax.swing.JButton();
        Bgrabar = new javax.swing.JButton();
        bcancelar = new javax.swing.JButton();
        Bsalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel2.setText("N°. Deposito:");

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel8.setText("Motivo_Ajuste:");

        combo_motivo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "...", "Entrada", "Salida" }));
        combo_motivo.setEnabled(false);
        combo_motivo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                combo_motivoItemStateChanged(evt);
            }
        });

        pestaña_materia.setPreferredSize(new java.awt.Dimension(1176, 300));

        jPanel4.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        jLabel12.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel12.setText("N°. Materia Prima:");

        txt_cod_materia.setEnabled(false);

        jLabel15.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel15.setText("Ajuste Cantidad:");

        txt_ajuste_canti_materia.setEnabled(false);
        txt_ajuste_canti_materia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_ajuste_canti_materiaActionPerformed(evt);
            }
        });
        txt_ajuste_canti_materia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_ajuste_canti_materiaKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_ajuste_canti_materiaKeyTyped(evt);
            }
        });

        grilla_materia.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Descripción", "Cantidad Stock", "Codigo_Motivo", "Motivo", "Cantidad Ajuste", "Diferencia", "Selecciona"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        grilla_materia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                grilla_materiaMouseClicked(evt);
            }
        });
        grilla_materia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                grilla_materiaKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(grilla_materia);
        if (grilla_materia.getColumnModel().getColumnCount() > 0) {
            grilla_materia.getColumnModel().getColumn(0).setResizable(false);
            grilla_materia.getColumnModel().getColumn(0).setPreferredWidth(10);
            grilla_materia.getColumnModel().getColumn(1).setResizable(false);
            grilla_materia.getColumnModel().getColumn(2).setResizable(false);
            grilla_materia.getColumnModel().getColumn(3).setResizable(false);
            grilla_materia.getColumnModel().getColumn(4).setResizable(false);
            grilla_materia.getColumnModel().getColumn(5).setResizable(false);
            grilla_materia.getColumnModel().getColumn(6).setResizable(false);
            grilla_materia.getColumnModel().getColumn(7).setPreferredWidth(10);
        }

        jdescri.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jdescri.setText("Descripcion:");

        txt_materia_prima.setEnabled(false);
        txt_materia_prima.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_materia_primaKeyReleased(evt);
            }
        });

        txt_canti_materia.setEnabled(false);
        txt_canti_materia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_canti_materiaActionPerformed(evt);
            }
        });

        jdescri3.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jdescri3.setText("Cantidad:");

        jSeparator7.setAlignmentX(1.0F);
        jSeparator7.setAlignmentY(1.0F);
        jSeparator7.setPreferredSize(new java.awt.Dimension(0, 3));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_cod_materia, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jdescri)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_materia_prima, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jdescri3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_canti_materia, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_ajuste_canti_materia, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(318, Short.MAX_VALUE))
            .addComponent(jSeparator7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jdescri3)
                        .addComponent(txt_canti_materia, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel15)
                        .addComponent(txt_ajuste_canti_materia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jdescri)
                        .addComponent(txt_materia_prima)
                        .addComponent(txt_cod_materia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel12)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout pestaña_materiaLayout = new javax.swing.GroupLayout(pestaña_materia);
        pestaña_materia.setLayout(pestaña_materiaLayout);
        pestaña_materiaLayout.setHorizontalGroup(
            pestaña_materiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pestaña_materiaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pestaña_materiaLayout.setVerticalGroup(
            pestaña_materiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pestaña_materiaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(115, Short.MAX_VALUE))
        );

        tab_modos.addTab("Stock Materia Prima", pestaña_materia);

        txtNroDeposito.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txtNroDeposito.setEnabled(false);
        txtNroDeposito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNroDepositoActionPerformed(evt);
            }
        });
        txtNroDeposito.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNroDepositoKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNroDepositoKeyTyped(evt);
            }
        });

        txt_deposito.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txt_deposito.setEnabled(false);
        txt_deposito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_depositoActionPerformed(evt);
            }
        });
        txt_deposito.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_depositoKeyReleased(evt);
            }
        });

        jSeparator6.setAlignmentX(1.0F);
        jSeparator6.setAlignmentY(1.0F);
        jSeparator6.setPreferredSize(new java.awt.Dimension(0, 3));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tab_modos)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNroDeposito, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_deposito, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(combo_motivo, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addComponent(jSeparator6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txt_deposito, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtNroDeposito, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(combo_motivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8))
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tab_modos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel20.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLabel20.setText("Sucursal:");

        jSeparator4.setAlignmentX(1.0F);
        jSeparator4.setAlignmentY(1.0F);
        jSeparator4.setPreferredSize(new java.awt.Dimension(0, 3));

        jLabel19.setFont(new java.awt.Font("Calibri", 0, 36)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(0, 102, 102));
        jLabel19.setText("Ajuste de Stock");

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel17.setText("Usuario");

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

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel18.setText("Código");

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

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jLabel19)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCod, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtSucu, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCodUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtCod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel18))
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel20)
                        .addComponent(txtSucu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtCodUsuario)
                        .addComponent(jLabel17)
                        .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel19)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel8.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray));

        Bnuevo.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        Bnuevo.setText("Nuevo");
        Bnuevo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Bnuevo.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        Bnuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BnuevoActionPerformed(evt);
            }
        });

        Bgrabar.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        Bgrabar.setText("Grabar");
        Bgrabar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Bgrabar.setEnabled(false);
        Bgrabar.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        Bgrabar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BgrabarActionPerformed(evt);
            }
        });

        bcancelar.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        bcancelar.setText("Cancelar");
        bcancelar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bcancelar.setEnabled(false);
        bcancelar.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        bcancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bcancelarActionPerformed(evt);
            }
        });

        Bsalir.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        Bsalir.setText("Salir");
        Bsalir.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Bsalir.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        Bsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BsalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Bnuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Bgrabar, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bcancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Bsalir, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Bnuevo)
                    .addComponent(Bgrabar)
                    .addComponent(bcancelar)
                    .addComponent(Bsalir))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BnuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BnuevoActionPerformed
        if (tab_modos.getSelectedIndex()==0) {
            pestaña = "materia";
        }else if(tab_modos.getSelectedIndex()==1){
            pestaña= "producto";   
        }
        operacion="agregar";
        confirmar = "¿Desea agregar este registro?";
        mensaje = "Operación exitosa";
           txtNroDeposito.setEnabled(true);
           txtNroDeposito.requestFocus();
           
           txtCod.setText(Metodos.siguienteCodigo("ajustes_id", "ajustes"));
           
           
           Bnuevo.setEnabled(false);
           Bsalir.setEnabled(false);
           
           Bgrabar.setEnabled(true);
           bcancelar.setEnabled(true);
    }//GEN-LAST:event_BnuevoActionPerformed

    private void BgrabarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BgrabarActionPerformed
       
        int respuesta=5;
        
        respuesta=JOptionPane.showConfirmDialog(null, confirmar);
        
        
        
        if(respuesta==0){
            String sql="";
            String sqldetalle="";
            String sqlStockagg="";
            String sqlStockresta="";
            if(operacion.equals("agregar")){
                sql="Insert into ajustes (ajus_fecha, estado, sucur_id, usu_id, emp_id)"
                        + " values ('"+
                        Metodos.dameFechaFormateadaSQL(txtFecha.getDate())+"', '"
                        + "ACTIVO', "+
                        idSucursal+", "+
                        idUsuario+","+
                        idPersonal+")";
                        
            }
            
//            if(operacion.equals("anular")){
//                sql="update presu_prove set"
//                        + " estado = 'ANULADO' "
//                        + " where pre_pro_nro = "+txtCod.getText();
//                
//            }
            
            int fila = grilla_materia.getSelectedRow();
            Conexion cn=new Conexion();
            try {
                cn.conectar();
                System.out.println(sql);
                cn.actualizar(sql);
                int cantidadFilas=grilla_materia.getRowCount();
                if (operacion.equals("agregar")) {
                        for (int i = 0; i < cantidadFilas; i++) {
                            if (grilla_materia.getValueAt(i, 5) != null) {
                                sqldetalle="insert into detalle_ajuste(ajustes_id, cod_depo, sucur_id, cod_materia, cantidad, moti_id) values("
                                +Metodos.ultimoCodigo("ajustes_id", "ajustes")+","
                                +txtNroDeposito.getText().trim()+","
                                +idSucursal+","
                                +grilla_materia.getValueAt(i, 0)+","
                                +grilla_materia.getValueAt(i, 5)+","
                                +grilla_materia.getValueAt(i, 3)+")";
                           
                                cn.actualizar(sqldetalle);
                                System.out.println(sqldetalle);
                                if (grilla_materia.getValueAt(i, 4).equals("Entrada"))   {
                                    sqlStockagg=("UPDATE stock_materia_prima set cantidad= cantidad + " + grilla_materia.getValueAt(i, 5) + " WHERE  cod_materia=" + grilla_materia.getValueAt(i, 0)+ " and sucur_id ="+idSucursal+" and cod_depo ="+txtNroDeposito.getText().trim()+"");
                                    System.out.println(sqlStockagg);
                                    cn.actualizar(sqlStockagg);
                                }if (grilla_materia.getValueAt(i, 4).equals("Salida"))   {
                                    sqlStockresta=("UPDATE stock_materia_prima set cantidad= cantidad - " + grilla_materia.getValueAt(i, 5) + " WHERE  cod_materia=" + grilla_materia.getValueAt(i, 0)+ " and sucur_id ="+idSucursal+" and cod_depo ="+txtNroDeposito.getText().trim()+"");
                                    System.out.println(sqlStockresta);
                                    cn.actualizar(sqlStockresta);
                      
                                }
                            }
                          
                        }   
                }
                
                JOptionPane.showMessageDialog(null, mensaje);
//                btnCancelar.doClick();

                
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(presupuesto_de_compra.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, ex.getMessage());
            } catch (SQLException ex) {
                Logger.getLogger(presupuesto_de_compra.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }
        }        
    }//GEN-LAST:event_BgrabarActionPerformed

    private void bcancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bcancelarActionPerformed
         Bnuevo.setEnabled(true);
         Bsalir.setEnabled(true);
         
         Bgrabar.setEnabled(false);
         bcancelar.setEnabled(false);
         Metodos.limpiarTabla(grilla_materia);
         
         txtNroDeposito.setText("");
         txtCod.setText("");
         txtCod.setEditable(false);
    }//GEN-LAST:event_bcancelarActionPerformed

    private void BsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BsalirActionPerformed
       dispose();
    }//GEN-LAST:event_BsalirActionPerformed

    private void grilla_materiaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_grilla_materiaMouseClicked
        int fila = grilla_materia.getSelectedRow();
        Integer opcion = JOptionPane.showConfirmDialog(null, "¿Desea cargar cantidad fisica de esta materia?");
        System.out.println(opcion);
        if (opcion==0) {
            txt_cod_materia.setText(grilla_materia.getValueAt(fila, 0).toString());
            txt_materia_prima.setText(grilla_materia.getValueAt(fila, 1).toString());
            txt_canti_materia.setText(grilla_materia.getValueAt(fila, 2).toString());
            combo_motivo.setEnabled(true);
            combo_motivo.requestFocus();
        }else{
            JOptionPane.showMessageDialog(null, "Puede elegir otra opción");
        }
    }//GEN-LAST:event_grilla_materiaMouseClicked

    private void grilla_materiaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_grilla_materiaKeyPressed
        
    }//GEN-LAST:event_grilla_materiaKeyPressed

    private void txt_ajuste_canti_materiaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_ajuste_canti_materiaKeyTyped

 
        
    }//GEN-LAST:event_txt_ajuste_canti_materiaKeyTyped

    private void txt_ajuste_canti_materiaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_ajuste_canti_materiaKeyPressed
     
          
          
    }//GEN-LAST:event_txt_ajuste_canti_materiaKeyPressed

    private void txt_canti_materiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_canti_materiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_canti_materiaActionPerformed

    private void combo_motivoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_combo_motivoItemStateChanged
        txt_ajuste_canti_materia.setEnabled(true);
        txt_ajuste_canti_materia.requestFocus();
    }//GEN-LAST:event_combo_motivoItemStateChanged

    private void txtNroDepositoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNroDepositoActionPerformed
        cargarDetalles();   
    }//GEN-LAST:event_txtNroDepositoActionPerformed

    private void txtNroDepositoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNroDepositoKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNroDepositoKeyPressed

    private void txtNroDepositoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNroDepositoKeyTyped

    }//GEN-LAST:event_txtNroDepositoKeyTyped

    private void txtCodUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodUsuarioActionPerformed

    private void txtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuarioActionPerformed

    private void txtCodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodActionPerformed
        
    }//GEN-LAST:event_txtCodActionPerformed

    private void txtCodKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodKeyPressed
    
    }//GEN-LAST:event_txtCodKeyPressed

    private void txt_depositoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_depositoKeyReleased
        if (txt_deposito.getText().equals("") && evt.getKeyCode() == evt.VK_F2) {
            deposito.busqueda = "ajuste";
            new deposito().setVisible(true);

        }
    }//GEN-LAST:event_txt_depositoKeyReleased

    private void txt_depositoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_depositoActionPerformed
        
    }//GEN-LAST:event_txt_depositoActionPerformed

    private void txt_materia_primaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_materia_primaKeyReleased
        if (txt_materia_prima.getText().equals("") && evt.getKeyCode() == evt.VK_F2) {
            materiaPrima.busqueda = "ajuste";
            new materiaPrima().setVisible(true);

        }
    }//GEN-LAST:event_txt_materia_primaKeyReleased

    private void txt_ajuste_canti_materiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_ajuste_canti_materiaActionPerformed
        if (txt_ajuste_canti_materia.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Debe ingresar cantidad");
        }else{
            if (combo_motivo.getSelectedItem().equals("Entrada")) {
            int fila = grilla_materia.getSelectedRow();
            Metodos.cargarTabla(grilla_materia, new Object[]{
                            grilla_materia.getValueAt(fila, 0).toString(),
                            grilla_materia.getValueAt(fila, 1).toString(),
                            grilla_materia.getValueAt(fila, 2).toString(),
                            1,
                            "Entrada",
                            txt_ajuste_canti_materia.getText().trim(),
                            (Integer.parseInt(grilla_materia.getValueAt(fila, 2).toString()))+(Integer.parseInt(txt_ajuste_canti_materia.getText().trim()))
                        });
                Metodos.eliminarFila(grilla_materia, fila);
                txt_cod_materia.setText("");
                txt_materia_prima.setText("");
                txt_canti_materia.setText("");
                txt_ajuste_canti_materia.setText("");
                combo_motivo.setSelectedItem("...");
        }else if (combo_motivo.getSelectedItem().equals("Salida")) {
            int fila = grilla_materia.getSelectedRow();
            Metodos.cargarTabla(grilla_materia, new Object[]{
                            grilla_materia.getValueAt(fila, 0).toString(),
                            grilla_materia.getValueAt(fila, 1).toString(),
                            grilla_materia.getValueAt(fila, 2).toString(),
                            2,
                            "Salida",
                            txt_ajuste_canti_materia.getText().trim(),
                            (Integer.parseInt(grilla_materia.getValueAt(fila, 2).toString()))-(Integer.parseInt(txt_ajuste_canti_materia.getText().trim()))
                        });
                Metodos.eliminarFila(grilla_materia, fila);
                txt_cod_materia.setText("");
                txt_materia_prima.setText("");
                txt_canti_materia.setText("");
                txt_ajuste_canti_materia.setText("");
                combo_motivo.setSelectedItem("...");
        }
            
       }
    }//GEN-LAST:event_txt_ajuste_canti_materiaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ajuste_stock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ajuste_stock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ajuste_stock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ajuste_stock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ajuste_stock().setVisible(true);
            }
        });
    }
  
      public void cargarDetalles() {
        Conexion cn = new Conexion();

        try {
            cn.conectar();
            ResultSet sucursal = cn.consultar("select * from v_stock_materias where cod_depo = " + txtNroDeposito.getText()); //order by ordena de menor a mayor, si se quiere de mayor a menor se le agrega desc al final

            if (sucursal.isBeforeFirst()) {
                while (sucursal.next()) {
                    Metodos.cargarTabla(grilla_materia, new Object[]{sucursal.getString("cod_materia"), sucursal.getString("mat_desc"), sucursal.getString("cantidad")});
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
     





    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bgrabar;
    private javax.swing.JButton Bnuevo;
    private javax.swing.JButton Bsalir;
    private javax.swing.JButton bcancelar;
    private javax.swing.JComboBox<String> combo_motivo;
    private javax.swing.JTable grilla_materia;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JLabel jdescri;
    private javax.swing.JLabel jdescri3;
    private javax.swing.JPanel pestaña_materia;
    private javax.swing.JTabbedPane tab_modos;
    public static javax.swing.JTextField txtCod;
    public static javax.swing.JTextField txtCodUsuario;
    public static com.toedter.calendar.JDateChooser txtFecha;
    public static javax.swing.JTextField txtNroDeposito;
    public static javax.swing.JTextField txtSucu;
    public static javax.swing.JTextField txtUsuario;
    private javax.swing.JTextField txt_ajuste_canti_materia;
    private javax.swing.JTextField txt_canti_materia;
    public static javax.swing.JTextField txt_cod_materia;
    public static javax.swing.JTextField txt_deposito;
    public static javax.swing.JTextField txt_materia_prima;
    // End of variables declaration//GEN-END:variables

  


}