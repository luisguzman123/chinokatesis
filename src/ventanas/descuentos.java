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


public class descuentos extends javax.swing.JFrame {

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
    
    public descuentos() {
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
        btnTipoTrabajo = new javax.swing.JButton();
        txtCodTipoTrabajo = new javax.swing.JTextField();
        txtDescriTrabajo = new javax.swing.JTextField();
        txtPorcentaje = new javax.swing.JTextField();
        txtMonto = new javax.swing.JTextField();
        txtDescriDescuento = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtSucursal = new javax.swing.JTextField();
        txtFecha = new com.toedter.calendar.JDateChooser();
        txtCod = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtEmpleadoDes = new javax.swing.JTextField();
        txtEmpleadoCod = new javax.swing.JTextField();

        jLabel5.setText("jLabel5");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("DESCUENTOS");

        grilla.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        grilla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cod. Tipo Trabajo", "Tipo Trabajo", "Porcentaje", "Monto"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
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

        jLabel10.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Porcentaje");

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

        txtPorcentaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPorcentajeActionPerformed(evt);
            }
        });

        txtMonto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMontoActionPerformed(evt);
            }
        });

        txtDescriDescuento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDescriDescuentoActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Descripción - descuento");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDescriDescuento, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPorcentaje, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtMonto, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(txtDescriDescuento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(txtCodTipoTrabajo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDescriTrabajo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTipoTrabajo)
                    .addComponent(jLabel10)
                    .addComponent(txtPorcentaje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(txtMonto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel13.setText("Sucursal:");

        jLabel2.setFont(new java.awt.Font("Calibri", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 102));
        jLabel2.setText("Descuentos");

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
        jLabel15.setText("Empleado");

        txtEmpleadoDes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmpleadoDesActionPerformed(evt);
            }
        });
        txtEmpleadoDes.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtEmpleadoDesKeyPressed(evt);
            }
        });

        txtEmpleadoCod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmpleadoCodActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
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
                                    .addComponent(txtEmpleadoCod, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtEmpleadoDes, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(12, 12, 12)
                                    .addComponent(txtSucursal, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(431, 431, 431)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(125, 125, 125)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
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
                            .addComponent(jLabel13))
                        .addGap(13, 13, 13))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEmpleadoDes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15)
                    .addComponent(txtEmpleadoCod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
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
        txtPorcentaje.setEditable(false);
        txtMonto.setEditable(false);
        
        
        
        txtCod.setText("");
        txtSucursal.setText("");
        txtCodTipoTrabajo.setText("");
        txtDescriTrabajo.setText("");
        txtPorcentaje.setText("");
        txtMonto.setText("");
        txtDescriDescuento.setText("");
        
        limpiarTabla(grilla);
        
        btnAgregar.setEnabled(true);
        btnAnular.setEnabled(true);
        btnSalir.setEnabled(true);
        btnGrabar.setEnabled(false);
        btnCancelar.setEnabled(false);
        btnTipoTrabajo.setEnabled(false);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        txtEmpleadoDes.setEditable(true);
        txtEmpleadoDes.requestFocus();
        txtFecha.setEnabled(true);
        
        btnAgregar.setEnabled(false);
        btnAnular.setEnabled(false);
        btnSalir.setEnabled(false);
        btnGrabar.setEnabled(true);
        btnCancelar.setEnabled(true);
        
        
        txtCod.setText(Metodos.siguienteCodigo("id_descuentos", "descuentos_cabecera"));
        
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
        txtPorcentaje.setEditable(true);
        txtPorcentaje.requestFocus();
    }//GEN-LAST:event_txtDescriTrabajoActionPerformed

    private void txtPorcentajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPorcentajeActionPerformed
        txtMonto.setEditable(true);
        txtMonto.requestFocus();
    }//GEN-LAST:event_txtPorcentajeActionPerformed

    
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
             txtPorcentaje.setText("");
             txtDescriDescuento.setEditable(false);
             txtDescriTrabajo.requestFocus();
             return;
               //JOptionPane.showMessageDialog(null, "ya hay");
         
            }
         
         
        }
        Metodos.cargarTabla(grilla, new Object[]{
                txtCodTipoTrabajo.getText().trim(),
                txtDescriTrabajo.getText().trim(),
                txtPorcentaje.getText().trim(),
                txtMonto.getText().trim()
                });
        txtCodTipoTrabajo.setText("");
        txtDescriTrabajo.setText("");
        txtMonto.setText("");
        txtPorcentaje.setText("");
        txtDescriDescuento.setEditable(false);
        txtDescriTrabajo.requestFocus(); 
        }else{
            JOptionPane.showMessageDialog(rootPane, "Debe cargar el monto");
        }

 
        
    }//GEN-LAST:event_txtMontoActionPerformed

    private void txtDescriTrabajoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDescriTrabajoKeyPressed
        if (txtDescriTrabajo.getText().equals("") && evt.getKeyCode() == evt.VK_F2){
            tipoDeTrabajos.busqueda="descuentos";
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
                sql="Insert into descuentos_cabecera (fecha, estado, descuento_descri, id_sucu, id_empleado)"
                        + " values ('"+
                        Metodos.dameFechaFormateadaSQL(txtFecha.getDate())+"','ACTIVO','"+
                        txtDescriDescuento.getText().trim()+"',"+
                        idSucursal+","+
                        txtEmpleadoCod.getText().trim()+")";
                      System.out.println(sql);  
            }
            
            if(operacion.equals("anular")){
                sql="update descuentos_cabecera set"
                        + " estado = 'ANULADO' "
                        + " where id_descuentos = "+txtCod.getText();
                
            }
            
            
            Conexion cn=new Conexion();
            try {
                cn.conectar();
                System.out.println(sql);
                cn.actualizar(sql);
                int cantidadFilas=grilla.getRowCount();
                if (operacion.equals("agregar")) {
                        for (int i = 0; i < cantidadFilas; i++) {
                            sqldetalle="insert into descuentos_detalle(id_tipo_trabajo, id_descuentos, porcentaje, monto) values("
                            +grilla.getValueAt(i, 0)+","
                            +Metodos.ultimoCodigo("id_descuentos", "descuentos_cabecera")+","
                            +grilla.getValueAt(i, 2)+","
                            +grilla.getValueAt(i, 3)+")";
                           
                            cn.actualizar(sqldetalle);
                            System.out.println(sqldetalle);
                }   
                }
                JOptionPane.showMessageDialog(null, mensaje);
                Metodos.imprimirPorCodigoUnico(
                        "/src/reportes/reporteDescuentoServicioCodigo.jasper",
                        Integer.parseInt(txtCod.getText()));
                btnCancelar.doClick();

                
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(descuentos.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, ex.getMessage());
            } catch (SQLException ex) {
                Logger.getLogger(descuentos.class.getName()).log(Level.SEVERE, null, ex);
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

    private void txtEmpleadoDesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmpleadoDesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmpleadoDesActionPerformed

    private void txtEmpleadoDesKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmpleadoDesKeyPressed
        if (txtEmpleadoDes.getText().equals("") && evt.getKeyCode() == evt.VK_F2){
            empleados.busqueda="descuentos";
            new empleados().setVisible(true);
          
        }
    }//GEN-LAST:event_txtEmpleadoDesKeyPressed

    private void txtCodKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodKeyPressed
        if (txtCod.getText().equals("") && evt.getKeyCode() == evt.VK_F2){
            busDescuentos.busqueda="descuentos";
            new busDescuentos().setVisible(true);

        }
    }//GEN-LAST:event_txtCodKeyPressed

    private void txtEmpleadoCodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmpleadoCodActionPerformed
        txtDescriDescuento.setEnabled(true);
        txtDescriDescuento.setEditable(true);
        txtDescriDescuento.requestFocus();
    }//GEN-LAST:event_txtEmpleadoCodActionPerformed

    private void txtDescriDescuentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDescriDescuentoActionPerformed
        if (!txtDescriDescuento.getText().equals("")) {
            txtDescriTrabajo.setEditable(true);
            txtDescriTrabajo.setEnabled(true);
            txtDescriTrabajo.requestFocus();
        }
    }//GEN-LAST:event_txtDescriDescuentoActionPerformed

    
    
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
                new descuentos().setVisible(true);
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
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
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
    public static javax.swing.JTextField txtCod;
    public static javax.swing.JTextField txtCodTipoTrabajo;
    public static javax.swing.JTextField txtDescriDescuento;
    public static javax.swing.JTextField txtDescriTrabajo;
    public static javax.swing.JTextField txtEmpleadoCod;
    public static javax.swing.JTextField txtEmpleadoDes;
    public static com.toedter.calendar.JDateChooser txtFecha;
    private javax.swing.JTextField txtMonto;
    public static javax.swing.JTextField txtPorcentaje;
    public static javax.swing.JTextField txtSucursal;
    // End of variables declaration//GEN-END:variables
 
}
