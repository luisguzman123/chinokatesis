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
import static ventanas.TrabajoTerminado.txtCod;


public class promociones extends javax.swing.JFrame {

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
    
    public promociones() {
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
        jLabel11 = new javax.swing.JLabel();
        btnTipoTrabajo = new javax.swing.JButton();
        txtCodTipoTrabajo = new javax.swing.JTextField();
        txtDescriTrabajo = new javax.swing.JTextField();
        txtMonto = new javax.swing.JTextField();
        txtDescriPromocion = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txtObservaciones = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        txtBeneficios = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        txtFinFecha = new com.toedter.calendar.JDateChooser();
        txtInicioFecha = new com.toedter.calendar.JDateChooser();
        jLabel13 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtSucursal = new javax.swing.JTextField();
        txtFecha = new com.toedter.calendar.JDateChooser();
        txtCod = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtClienteDesc = new javax.swing.JTextField();
        txtClienteCod = new javax.swing.JTextField();

        jLabel5.setText("jLabel5");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("PROMOCIONES");

        grilla.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        grilla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cod. Tipo Trabajo", "Tipo Trabajo", "Monto"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
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
        jLabel8.setText("Código tipo de trabajo");

        jLabel9.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Tipo de trabajo");

        jLabel11.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Monto");

        btnTipoTrabajo.setText("...");
        btnTipoTrabajo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTipoTrabajoActionPerformed(evt);
            }
        });

        txtCodTipoTrabajo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodTipoTrabajoActionPerformed(evt);
            }
        });

        txtDescriTrabajo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDescriTrabajoActionPerformed(evt);
            }
        });
        txtDescriTrabajo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtDescriTrabajoKeyPressed(evt);
            }
        });

        txtMonto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMontoActionPerformed(evt);
            }
        });

        txtDescriPromocion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDescriPromocionActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Descripción - promoción");

        jLabel16.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Observación");

        txtObservaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtObservacionesActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Beneficio");

        txtBeneficios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBeneficiosActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Fecha de fin");

        jLabel19.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Fecha de inicio");

        txtInicioFecha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtInicioFechaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCodTipoTrabajo, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDescriTrabajo, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnTipoTrabajo, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtMonto))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel17)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtBeneficios))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel16)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtObservaciones))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtDescriPromocion, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel19))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtInicioFecha, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(txtFinFecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(txtDescriPromocion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(txtObservaciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel19)
                            .addComponent(txtInicioFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtFinFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel18))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(txtBeneficios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 21, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(txtCodTipoTrabajo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDescriTrabajo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTipoTrabajo)
                    .addComponent(jLabel11)
                    .addComponent(txtMonto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel13.setText("Sucursal:");

        jLabel2.setFont(new java.awt.Font("Calibri", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 102));
        jLabel2.setText("Promociones");

        txtSucursal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSucursalActionPerformed(evt);
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

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel15.setText("Cliente");

        txtClienteDesc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtClienteDescActionPerformed(evt);
            }
        });
        txtClienteDesc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtClienteDescKeyPressed(evt);
            }
        });

        txtClienteCod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtClienteCodActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtCod, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel15)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtClienteCod, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtClienteDesc, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(12, 12, 12)
                                    .addComponent(txtSucursal, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(407, 407, 407)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 866, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtFecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtCod))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtSucursal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13)))
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtClienteDesc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15)
                    .addComponent(txtClienteCod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents



    
    
    
    
    private void grillaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_grillaMouseClicked


    }//GEN-LAST:event_grillaMouseClicked

    private void btnTipoTrabajoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTipoTrabajoActionPerformed
       // equipos.busqueda="recepcion";
       // new equipos().setVisible(true);
    }//GEN-LAST:event_btnTipoTrabajoActionPerformed

    public void traerFechaActual(){
        Calendar cal = Calendar.getInstance();
        String fecha = cal.get(cal.DATE)+"/"+cal.get(cal.MONTH)+"/"+cal.get(cal.YEAR);
        txtFecha.setDateFormatString(fecha);
    }
    
    
    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        txtCod.setEditable(false);
        txtSucursal.setEditable(false);
        txtFecha.setEnabled(false);
        txtCodTipoTrabajo.setEditable(false);
        txtDescriTrabajo.setEditable(false);
        txtMonto.setEditable(false);
        
        txtDescriPromocion.setEditable(false);
        txtObservaciones.setEditable(false);
        txtBeneficios.setEditable(false);
        txtObservaciones.setEditable(false);
        txtInicioFecha.setEnabled(false);
        txtFinFecha.setEnabled(false);
        
        
        
        txtCod.setText("");
        txtSucursal.setText("");
        txtCodTipoTrabajo.setText("");
        txtDescriTrabajo.setText("");
        txtMonto.setText("");
        txtDescriPromocion.setText("");
        txtObservaciones.setText("");
        txtBeneficios.setText("");
        txtClienteCod.setText("");
        txtClienteDesc.setText("");
        
        limpiarTabla(grilla);
        
        btnAgregar.setEnabled(true);
        btnAnular.setEnabled(true);
        btnSalir.setEnabled(true);
        btnGrabar.setEnabled(false);
        btnCancelar.setEnabled(false);
        btnTipoTrabajo.setEnabled(false);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        txtClienteDesc.setEditable(true);
        txtClienteDesc.requestFocus();
        txtFecha.setEnabled(true);
        
        btnAgregar.setEnabled(false);
        btnAnular.setEnabled(false);
        btnSalir.setEnabled(false);
        btnGrabar.setEnabled(true);
        btnCancelar.setEnabled(true);
        
        
        txtCod.setText(Metodos.siguienteCodigo("id_promociones", "promociones_cabecera"));
        
        operacion="agregar";
        confirmar="¿Desea grabar el nuevo registro?";
        mensaje="Registro grabado con exito";
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void txtSucursalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSucursalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSucursalActionPerformed

    private void txtCodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodActionPerformed

    private void txtCodTipoTrabajoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodTipoTrabajoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodTipoTrabajoActionPerformed

    private void txtDescriTrabajoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDescriTrabajoActionPerformed
        txtMonto.setEditable(true);
        txtMonto.requestFocus();
    }//GEN-LAST:event_txtDescriTrabajoActionPerformed

    
    public void sumarRepetido(){
        for (int fila = 0; fila <grilla.getRowCount(); fila++) {
           String codigoEnRenglon = (String)grilla.getValueAt(fila, 0); 
            if (txtCodTipoTrabajo.getText().equals(codigoEnRenglon)) {
             grilla.setValueAt(Integer.parseInt(txtMonto.getText())+(Integer.parseInt(grilla.getValueAt(fila, 2).toString())), fila, 2);
            }
        }
    }
    
    
    
    
    
    private void txtMontoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMontoActionPerformed
        if (!txtMonto.getText().equals("")) {
                   for (int fila = 0; fila <grilla.getRowCount(); fila++) {
                    String codigoEnRenglon = (String)grilla.getValueAt(fila, 0);
                    if (txtCodTipoTrabajo.getText().equals(codigoEnRenglon)) {
                        JOptionPane.showMessageDialog(rootPane, "¡Este tipo de trabajo ya fue cargado en la grilla!");
                        txtCodTipoTrabajo.setText("");
                        txtDescriTrabajo.setText("");
                        txtMonto.setText("");
                        txtDescriPromocion.setEditable(false);
                        txtDescriTrabajo.requestFocus();
                        return;
                          //JOptionPane.showMessageDialog(null, "ya hay");

                       }
         
         
        }
        Metodos.cargarTabla(grilla, new Object[]{
                txtCodTipoTrabajo.getText().trim(),
                txtDescriTrabajo.getText().trim(),
                txtMonto.getText().trim()
                });
        txtCodTipoTrabajo.setText("");
        txtDescriTrabajo.setText("");
        txtMonto.setText("");
        txtDescriPromocion.setEditable(false);
        txtDescriTrabajo.requestFocus(); 
        }else{
            JOptionPane.showMessageDialog(rootPane, "Debe cargar el monto");
        }

 
        
    }//GEN-LAST:event_txtMontoActionPerformed

    private void txtDescriTrabajoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDescriTrabajoKeyPressed
        if (txtDescriTrabajo.getText().equals("") && evt.getKeyCode() == evt.VK_F2){
            tipoDeTrabajos.busqueda="promociones";
            new tipoDeTrabajos().setVisible(true);
          
        }
    }//GEN-LAST:event_txtDescriTrabajoKeyPressed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

   
    
    
    
    private void btnGrabarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGrabarActionPerformed
        int respuesta=5;
        
        respuesta=JOptionPane.showConfirmDialog(null, confirmar);
        
        
        
        if(respuesta==0){
            String sql="";
            String sqldetalle="";
            if(operacion.equals("agregar")){
                sql="Insert into promociones_cabecera (estado, promo_descri, observacion, fecha_ini, fecha_fin, beneficio, id_sucu, id_cliente)"
                        + " values ('ACTIVO', '"+
                        txtDescriPromocion.getText().trim()+"','"+
                        txtObservaciones.getText().trim()+"','"+
                        Metodos.dameFechaFormateadaSQL(txtInicioFecha.getDate())+"','"+
                        Metodos.dameFechaFormateadaSQL(txtFinFecha.getDate())+"','"+
                        txtBeneficios.getText().trim()+"',"+
                        idSucursal+","+
                        txtClienteCod.getText().trim()+")";
                      System.out.println(sql);  
            }
            
            if(operacion.equals("anular")){
                sql="update promociones_cabecera set"
                        + " estado = 'ANULADO' "
                        + " where id_promociones = "+txtCod.getText();
                
            }
            
            
            Conexion cn=new Conexion();
            try {
                cn.conectar();
                System.out.println(sql);
                cn.actualizar(sql);
                int cantidadFilas=grilla.getRowCount();
                if (operacion.equals("agregar")) {
                        for (int i = 0; i < cantidadFilas; i++) {
                            sqldetalle="insert into promociones_detalle(id_tipo_trabajo, id_promociones, monto) values("
                            +grilla.getValueAt(i, 0)+","
                            +Metodos.ultimoCodigo("id_promociones", "promociones_cabecera")+","
                            +grilla.getValueAt(i, 2)+")";
                           
                            cn.actualizar(sqldetalle);
                            System.out.println(sqldetalle);
                }   
                }
                JOptionPane.showMessageDialog(null, mensaje);
                Metodos.imprimirPorCodigoUnico(
                        "/src/reportes/reportePromocionServicioCodigo.jasper",
                        Integer.parseInt(txtCod.getText()));
                btnCancelar.doClick();

                
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(promociones.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, ex.getMessage());
            } catch (SQLException ex) {
                Logger.getLogger(promociones.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }
        }
         btnCancelar.doClick();
        
    }//GEN-LAST:event_btnGrabarActionPerformed

    private void btnAnularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnularActionPerformed
        
        txtFecha.setEnabled(true);
        txtCod.requestFocus();
        btnAgregar.setEnabled(false);
        btnAnular.setEnabled(false);
        btnSalir.setEnabled(false);
        btnGrabar.setEnabled(true);
        btnCancelar.setEnabled(true);
     
        
        operacion="anular";
        confirmar="¿Desea anular este registro?";
        mensaje="Registro anulado con exito";
    }//GEN-LAST:event_btnAnularActionPerformed

    private void txtCodKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodKeyPressed
        if (txtCod.getText().equals("") && evt.getKeyCode() == evt.VK_F2){
            busPromociones.busqueda="promociones";
            new busPromociones().setVisible(true);

        }
    }//GEN-LAST:event_txtCodKeyPressed

    private void txtDescriPromocionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDescriPromocionActionPerformed
        if (!txtDescriPromocion.getText().equals("")) {
            txtObservaciones.setEditable(true);
            txtObservaciones.setEnabled(true);
            txtObservaciones.requestFocus();
        }
    }//GEN-LAST:event_txtDescriPromocionActionPerformed

    private void txtClienteDescKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtClienteDescKeyPressed
        if (txtClienteDesc.getText().equals("") && evt.getKeyCode() == evt.VK_F2){
            clientes.busqueda="promociones";
            new clientes().setVisible(true);

        }
    }//GEN-LAST:event_txtClienteDescKeyPressed

    private void txtClienteDescActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtClienteDescActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtClienteDescActionPerformed

    private void txtClienteCodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtClienteCodActionPerformed
        txtDescriPromocion.setEnabled(true);
        txtDescriPromocion.setEditable(true);
        txtDescriPromocion.requestFocus();
    }//GEN-LAST:event_txtClienteCodActionPerformed

    private void txtObservacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtObservacionesActionPerformed
        if (!txtObservaciones.getText().equals("")) {
            txtBeneficios.setEditable(true);
            txtBeneficios.setEnabled(true);
            txtBeneficios.requestFocus();
        }
    }//GEN-LAST:event_txtObservacionesActionPerformed

    private void txtBeneficiosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBeneficiosActionPerformed
        if (!txtBeneficios.getText().equals("")) {
            txtInicioFecha.setEnabled(true);
            txtFinFecha.setEnabled(true);
            txtDescriTrabajo.setEnabled(true);
            txtDescriTrabajo.setEditable(true);
            txtInicioFecha.requestFocus();
            txtFinFecha.setMinSelectableDate(txtInicioFecha.getMinSelectableDate());
        }
    }//GEN-LAST:event_txtBeneficiosActionPerformed

    private void txtInicioFechaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtInicioFechaMouseClicked
        txtFinFecha.setMinSelectableDate(txtInicioFecha.getMinSelectableDate());
    }//GEN-LAST:event_txtInicioFechaMouseClicked

    
    
    public String dameFechaActual(){
       java.util.Date fecha = new Date();
       SimpleDateFormat formateador = new SimpleDateFormat("dd-MM-yyyy");
       JOptionPane.showMessageDialog(null, formateador.format(fecha));
       return formateador.format(fecha);
    }
    
//        public void traerPrecio(){
//        Conexion cn=new Conexion();
//        
//        try {
//            cn.conectar();
//            ResultSet sucursal=cn.consultar("select mat_precio from materia_prima where cod_materia = "+txtCodEquipo.getText()); //order by ordena de menor a mayor, si se quiere de mayor a menor se le agrega desc al final
//            
//            if(sucursal.isBeforeFirst()){
//                while(sucursal.next()){
//                  txtSerie.setText(sucursal.getString("mat_precio"));
//                }
//            }else{
//                JOptionPane.showMessageDialog(null, "No hay registros en la base de datos");
//            }
//        } catch (ClassNotFoundException ex) {
//            Logger.getLogger(cajas.class.getName()).log(Level.SEVERE, null, ex);
//            JOptionPane.showMessageDialog(null, "No se encuentra "+ex.getMessage());
//        } catch (SQLException ex) {
//            Logger.getLogger(cajas.class.getName()).log(Level.SEVERE, null, ex);
//            JOptionPane.showMessageDialog(null,ex.getMessage());
//        }
//    }
//
    
    
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
                new promociones().setVisible(true);
            }
        });
    }
 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnAnular;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnGrabar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnTipoTrabajo;
    public static javax.swing.JTable grilla;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane2;
    public static javax.swing.JTextField txtBeneficios;
    public static javax.swing.JTextField txtClienteCod;
    public static javax.swing.JTextField txtClienteDesc;
    public static javax.swing.JTextField txtCod;
    public static javax.swing.JTextField txtCodTipoTrabajo;
    public static javax.swing.JTextField txtDescriPromocion;
    public static javax.swing.JTextField txtDescriTrabajo;
    public static com.toedter.calendar.JDateChooser txtFecha;
    public static com.toedter.calendar.JDateChooser txtFinFecha;
    public static com.toedter.calendar.JDateChooser txtInicioFecha;
    private javax.swing.JTextField txtMonto;
    public static javax.swing.JTextField txtObservaciones;
    public static javax.swing.JTextField txtSucursal;
    // End of variables declaration//GEN-END:variables
 
}
