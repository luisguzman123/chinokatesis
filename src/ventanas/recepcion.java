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


public class recepcion extends javax.swing.JFrame {

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
    
    public recepcion() {
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
        txtCodEquipo = new javax.swing.JTextField();
        txtEquipo = new javax.swing.JTextField();
        txtSerie = new javax.swing.JTextField();
        txtCantidad = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtDescri = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtSucursal = new javax.swing.JTextField();
        txtFecha = new com.toedter.calendar.JDateChooser();
        txtCod = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtEmpleadoDes = new javax.swing.JTextField();
        txtClienteCod = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txtClienteDesc = new javax.swing.JTextField();
        txtEmpleadoCod = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();

        jLabel5.setText("jLabel5");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("RECEPCIÓN");

        grilla.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        grilla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CODIGO", "EQUIPO", "CANTIDAD", "N° SERIE", "DESCRIPCIÓN"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true
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
                .addContainerGap(68, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jLabel8.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("COD");

        jLabel9.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Equipo");

        jLabel10.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("N° serie");

        jLabel11.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("CANT.");

        btnBuscarArti.setText("...");
        btnBuscarArti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarArtiActionPerformed(evt);
            }
        });

        txtCodEquipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodEquipoActionPerformed(evt);
            }
        });

        txtEquipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEquipoActionPerformed(evt);
            }
        });
        txtEquipo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtEquipoKeyPressed(evt);
            }
        });

        txtSerie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSerieActionPerformed(evt);
            }
        });

        txtCantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCantidadActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Descripción");

        txtDescri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDescriActionPerformed(evt);
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
                .addComponent(txtCodEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBuscarArti)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDescri))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSerie, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(txtCodEquipo)
                    .addComponent(txtEquipo)
                    .addComponent(btnBuscarArti, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel10)
                    .addComponent(txtSerie)
                    .addComponent(jLabel11)
                    .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(txtDescri))
                .addGap(15, 15, 15))
        );

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel13.setText("Sucursal:");

        jLabel2.setFont(new java.awt.Font("Calibri", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 102));
        jLabel2.setText("Recepción");

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

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel15.setText("BUSCAR F2");

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

        txtClienteCod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtClienteCodActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel16.setText("Cliente");

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

        txtEmpleadoCod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmpleadoCodActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel17.setText("Empleado");

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel18.setText("BUSCAR F2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(117, 117, 117)
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCod, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSucursal, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(388, 388, 388)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(400, 400, 400)
                        .addComponent(jLabel18)
                        .addGap(199, 199, 199)
                        .addComponent(jLabel15))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(283, 283, 283)
                        .addComponent(jLabel17)
                        .addGap(4, 4, 4)
                        .addComponent(txtEmpleadoCod, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(txtEmpleadoDes, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtClienteCod, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtClienteDesc, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 883, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtCod, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(14, 14, 14)
                                .addComponent(jLabel13))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(11, 11, 11)
                                .addComponent(txtSucursal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel18)
                    .addComponent(jLabel15))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtEmpleadoCod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEmpleadoDes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel17)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel16)
                                .addComponent(txtClienteCod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtClienteDesc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(949, 500));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents



    
    
    
    
    private void grillaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_grillaMouseClicked


    }//GEN-LAST:event_grillaMouseClicked

    private void btnBuscarArtiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarArtiActionPerformed
       // equipos.busqueda="recepcion";
       // new equipos().setVisible(true);
    }//GEN-LAST:event_btnBuscarArtiActionPerformed

    public void traerFechaActual(){
        Calendar cal = Calendar.getInstance();
        String fecha = cal.get(cal.DATE)+"/"+cal.get(cal.MONTH)+"/"+cal.get(cal.YEAR);
        txtFecha.setDateFormatString(fecha);
    }
    
    
    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        txtCod.setEditable(false);
        txtSucursal.setEditable(false);
        txtFecha.setEnabled(false);
        txtCodEquipo.setEditable(false);
        txtEquipo.setEditable(false);
        txtSerie.setEditable(false);
        txtCantidad.setEditable(false);
        txtClienteCod.setText("");
        txtClienteDesc.setText("");
        
        
        txtCod.setText("");
        txtSucursal.setText("");
        txtCodEquipo.setText("");
        txtEquipo.setText("");
        txtSerie.setText("");
        txtCantidad.setText("");
        
        limpiarTabla(grilla);
        
        btnAgregar.setEnabled(true);
        btnAnular.setEnabled(true);
        btnSalir.setEnabled(true);
        btnGrabar.setEnabled(false);
        btnCancelar.setEnabled(false);
        btnBuscarArti.setEnabled(false);
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
        
        
        txtCod.setText(Metodos.siguienteCodigo("id_recepcion", "recepcion_cabecera"));
        
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

    private void txtCodEquipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodEquipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodEquipoActionPerformed

    private void txtEquipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEquipoActionPerformed
        txtSerie.setEditable(true);
        txtSerie.requestFocus();
    }//GEN-LAST:event_txtEquipoActionPerformed

    private void txtSerieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSerieActionPerformed
        txtDescri.setEditable(true);
        txtDescri.requestFocus();
    }//GEN-LAST:event_txtSerieActionPerformed

    
    public void sumarRepetido(){
        for (int fila = 0; fila <grilla.getRowCount(); fila++) {
           String codigoEnRenglon = (String)grilla.getValueAt(fila, 0); 
            if (txtCodEquipo.getText().equals(codigoEnRenglon)) {
             grilla.setValueAt(Integer.parseInt(txtCantidad.getText())+(Integer.parseInt(grilla.getValueAt(fila, 2).toString())), fila, 2);
            }
        }
    }
    
    
    
    
    
    private void txtCantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCantidadActionPerformed
       
        
        for (int fila = 0; fila <grilla.getRowCount(); fila++) {
         String codigoEnRenglon = (String)grilla.getValueAt(fila, 0);
         if (txtCodEquipo.getText().equals(codigoEnRenglon)) {
             grilla.setValueAt(Integer.parseInt(txtCantidad.getText())+(Integer.parseInt(grilla.getValueAt(fila, 2).toString())), fila, 2);
             txtCodEquipo.setText("");
             txtEquipo.setText("");
             txtCantidad.setText("");
             txtSerie.setText("");
             txtDescri.setText("");
             txtEquipo.requestFocus();
             return;
               //JOptionPane.showMessageDialog(null, "ya hay");
         
            }
         
         
        }
        Metodos.cargarTabla(grilla, new Object[]{
                txtCodEquipo.getText().trim(),
                txtEquipo.getText().trim(),
                txtCantidad.getText().trim(),
                txtSerie.getText().trim(),
                txtDescri.getText().trim()
                });
        txtCodEquipo.setText("");
        txtEquipo.setText("");
        txtCantidad.setText("");
        txtSerie.setText("");
        txtDescri.setText("");
        txtEquipo.requestFocus();
 
        
    }//GEN-LAST:event_txtCantidadActionPerformed

    private void txtEquipoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEquipoKeyPressed
        if (txtEquipo.getText().equals("") && evt.getKeyCode() == evt.VK_F2){
            equipos.busqueda="recepcion";
            new equipos().setVisible(true);
          
        }
    }//GEN-LAST:event_txtEquipoKeyPressed

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
                sql="Insert into recepcion_cabecera (fecha, estado, emp_id, cli_cod, sucur_id)"
                        + " values ('"+
                        Metodos.dameFechaFormateadaSQL(txtFecha.getDate())+"','ACTIVO',"+
                        txtEmpleadoCod.getText().trim()+","+
                        txtClienteCod.getText().trim()+","+
                        idSucursal+")";
                      System.out.println(sql);  
            }
            
            if(operacion.equals("anular")){
                sql="update recepcion_cabecera set"
                        + " estado = 'ANULADO' "
                        + " where id_recepcion = "+txtCod.getText();
                
            }
            
            
            Conexion cn=new Conexion();
            try {
                cn.conectar();
                System.out.println(sql);
                cn.actualizar(sql);
                int cantidadFilas=grilla.getRowCount();
                if (operacion.equals("agregar")) {
                        for (int i = 0; i < cantidadFilas; i++) {
                            sqldetalle="insert into recepcion_detalle(id_equipo, id_recepcion, descripcion, cantidad, nro_de_serie) values("
                            +grilla.getValueAt(i, 0)+","
                            +Metodos.ultimoCodigo("id_recepcion", "recepcion_cabecera")+",'"
                            +grilla.getValueAt(i, 4)+"',"
                            +grilla.getValueAt(i, 2)+",'"
                            +grilla.getValueAt(i, 3)+"')";
                           
                            cn.actualizar(sqldetalle);
                            System.out.println(sqldetalle);
                }   
                }
                JOptionPane.showMessageDialog(null, mensaje);
                Metodos.imprimirPorCodigoUnico(
                        "/src/reportes/reporteRecepcionServicioCodigo.jasper",
                        Integer.parseInt(txtCod.getText()));
                btnCancelar.doClick();

                
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(recepcion.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, ex.getMessage());
            } catch (SQLException ex) {
                Logger.getLogger(recepcion.class.getName()).log(Level.SEVERE, null, ex);
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

    private void txtDescriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDescriActionPerformed
               txtCantidad.setEditable(true);
        txtCantidad.requestFocus();
    }//GEN-LAST:event_txtDescriActionPerformed

    private void txtEmpleadoDesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmpleadoDesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmpleadoDesActionPerformed

    private void txtClienteCodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtClienteCodActionPerformed
        txtEquipo.setEditable(true);
        txtEquipo.requestFocus();
    }//GEN-LAST:event_txtClienteCodActionPerformed

    private void txtClienteDescActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtClienteDescActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtClienteDescActionPerformed

    private void txtEmpleadoCodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmpleadoCodActionPerformed
        txtClienteDesc.setEditable(true);
        txtClienteDesc.requestFocus();
    }//GEN-LAST:event_txtEmpleadoCodActionPerformed

    private void txtEmpleadoDesKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmpleadoDesKeyPressed
        if (txtEmpleadoDes.getText().equals("") && evt.getKeyCode() == evt.VK_F2){
            empleados.busqueda="recepcion";
            new empleados().setVisible(true);
          
        }
    }//GEN-LAST:event_txtEmpleadoDesKeyPressed

    private void txtClienteDescKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtClienteDescKeyPressed
        if (txtClienteDesc.getText().equals("") && evt.getKeyCode() == evt.VK_F2){
            clientes.busqueda="recepcion";
            new clientes().setVisible(true);
          
        } 
    }//GEN-LAST:event_txtClienteDescKeyPressed

    private void txtCodKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodKeyPressed
        if (txtCod.getText().equals("") && evt.getKeyCode() == evt.VK_F2){
            busRecepcion.busqueda="recepcion";
            new busRecepcion().setVisible(true);

        }
    }//GEN-LAST:event_txtCodKeyPressed

    
    
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
                new recepcion().setVisible(true);
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
    public static javax.swing.JTable grilla;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField txtCantidad;
    public static javax.swing.JTextField txtClienteCod;
    public static javax.swing.JTextField txtClienteDesc;
    public static javax.swing.JTextField txtCod;
    public static javax.swing.JTextField txtCodEquipo;
    public static javax.swing.JTextField txtDescri;
    public static javax.swing.JTextField txtEmpleadoCod;
    public static javax.swing.JTextField txtEmpleadoDes;
    public static javax.swing.JTextField txtEquipo;
    public static com.toedter.calendar.JDateChooser txtFecha;
    public static javax.swing.JTextField txtSerie;
    public static javax.swing.JTextField txtSucursal;
    // End of variables declaration//GEN-END:variables
 
}
