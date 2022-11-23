package ventanas;

import Acceso.Menu;
import clases.Conexion;
import clases.Metodos;
import static clases.Metodos.limpiarTabla;
import com.toedter.calendar.JCalendar;
import java.awt.event.ItemEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import static ventanas.TrabajoTerminado.txtCod;



public class reclamos extends javax.swing.JFrame {

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
    
    public reclamos() {
        initComponents();
        btnCancelar.doClick();
        txtFecha.setDate(new JCalendar().getDate());
        txtSucursal.setText(idSucursal);
//        Metodos.cargarComboReferencia(cmbDepo, "depo_desc", "deposito", "sucur_id", Menu.idSucursal);
 
  
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        txtCodEquipo = new javax.swing.JTextField();
        txtEquipo = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        txtCodTipoTrabajo = new javax.swing.JTextField();
        txtTipoTrabajoDesc = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        txtProblema = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtSucursal = new javax.swing.JTextField();
        txtFecha = new com.toedter.calendar.JDateChooser();
        txtCod = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtEmpleadoDes = new javax.swing.JTextField();
        txtEmpleadoCod = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        txtServicioTerminado = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        txtObs = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        grillaReclamos = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        grillaServiciosTerminados = new javax.swing.JTable();
        txtDescriServicioTermi = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        btnAgregar = new javax.swing.JButton();
        btnAnular = new javax.swing.JButton();
        btnGrabar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        txtClienteCodigo = new javax.swing.JTextField();
        txtClienteDescri = new javax.swing.JTextField();

        jLabel5.setText("jLabel5");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("RECLAMOS");

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jLabel9.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Equipo");

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

        jLabel22.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Tipo de trabajo");

        txtCodTipoTrabajo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodTipoTrabajoActionPerformed(evt);
            }
        });
        txtCodTipoTrabajo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCodTipoTrabajoKeyPressed(evt);
            }
        });

        txtTipoTrabajoDesc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTipoTrabajoDescActionPerformed(evt);
            }
        });
        txtTipoTrabajoDesc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtTipoTrabajoDescKeyPressed(evt);
            }
        });

        jLabel24.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("Problema");

        txtProblema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtProblemaActionPerformed(evt);
            }
        });
        txtProblema.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtProblemaKeyPressed(evt);
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
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCodEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtEquipo))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel24)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtProblema))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel22)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCodTipoTrabajo, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTipoTrabajoDesc, javax.swing.GroupLayout.DEFAULT_SIZE, 444, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCodEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(txtEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(txtCodTipoTrabajo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTipoTrabajoDesc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel24)
                    .addComponent(txtProblema, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel13.setText("Sucursal:");

        jLabel2.setFont(new java.awt.Font("Calibri", 0, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 102));
        jLabel2.setText("RECLAMOS");

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

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel17.setText("Servicio terminado");

        txtServicioTerminado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtServicioTerminadoActionPerformed(evt);
            }
        });
        txtServicioTerminado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtServicioTerminadoKeyPressed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel18.setText("Observaciones");

        txtObs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtObsActionPerformed(evt);
            }
        });

        grillaReclamos.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        grillaReclamos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cod. equipo", "Equipo", "Cod Tipo de trabajo", "Tipo de trabajo", "Problema"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        grillaReclamos.setGridColor(new java.awt.Color(153, 153, 153));
        grillaReclamos.setPreferredSize(new java.awt.Dimension(50, 224));
        grillaReclamos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                grillaReclamosMouseClicked(evt);
            }
        });
        grillaReclamos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                grillaReclamosKeyPressed(evt);
            }
        });
        jScrollPane3.setViewportView(grillaReclamos);

        grillaServiciosTerminados.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        grillaServiciosTerminados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código equipo", "Equipo", "Cod tipo trabajo", "Tipo de trabajo", "Cantidad"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        grillaServiciosTerminados.setGridColor(new java.awt.Color(153, 153, 153));
        grillaServiciosTerminados.setPreferredSize(new java.awt.Dimension(50, 224));
        grillaServiciosTerminados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                grillaServiciosTerminadosMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(grillaServiciosTerminados);

        txtDescriServicioTermi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDescriServicioTermiActionPerformed(evt);
            }
        });
        txtDescriServicioTermi.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtDescriServicioTermiKeyPressed(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel21.setText("Descripción");

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

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel19.setText("Cliente");

        txtClienteCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtClienteCodigoActionPerformed(evt);
            }
        });

        txtClienteDescri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtClienteDescriActionPerformed(evt);
            }
        });
        txtClienteDescri.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtClienteDescriKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel18)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtObs, javax.swing.GroupLayout.PREFERRED_SIZE, 528, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGap(289, 289, 289)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(txtCod, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(231, 231, 231)
                                            .addComponent(jLabel13)))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtSucursal, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(449, 449, 449))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btnAgregar)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnGrabar, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnCancelar)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnAnular, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel2)))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 874, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(302, 302, 302)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel17)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtServicioTerminado, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jLabel21)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtDescriServicioTermi, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel19)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtClienteCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtClienteDescri, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jLabel15)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtEmpleadoCod, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtEmpleadoDes, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 870, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtSucursal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel17)
                        .addComponent(txtServicioTerminado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel21))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel19)
                        .addComponent(txtClienteCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtClienteDescri, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtEmpleadoDes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtEmpleadoCod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel15)
                        .addComponent(txtDescriServicioTermi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(txtObs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnGrabar)
                            .addComponent(btnCancelar)
                            .addComponent(btnAnular)
                            .addComponent(btnSalir))
                        .addGap(77, 77, 77))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        setSize(new java.awt.Dimension(938, 568));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents



    
    
    
    
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
        
         
        
        txtCod.setText("");
        txtCodEquipo.setText("");
        txtEquipo.setText("");
        txtServicioTerminado.setText("");
        txtEmpleadoCod.setText("");
        txtEmpleadoDes.setText("");
        txtClienteCodigo.setText("");
        txtClienteDescri.setText("");
        txtObs.setText("");
        txtDescriServicioTermi.setText("");
        
        limpiarTabla(grillaServiciosTerminados);
        limpiarTabla(grillaReclamos);
        
        btnAgregar.setEnabled(true);
        btnAnular.setEnabled(true);
        btnSalir.setEnabled(true);
        btnGrabar.setEnabled(false);
        btnCancelar.setEnabled(false);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        txtServicioTerminado.setEditable(true);
        txtServicioTerminado.requestFocus();
        txtFecha.setEnabled(true);
        
        btnAgregar.setEnabled(false);
        btnAnular.setEnabled(false);
        btnSalir.setEnabled(false);
        btnGrabar.setEnabled(true);
        btnCancelar.setEnabled(true);
        
        
        txtCod.setText(Metodos.siguienteCodigo("id_reclamo_cab", "reclamo_cab"));
        
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
       
    }//GEN-LAST:event_txtEquipoActionPerformed

    
//    public void sumarRepetido(){
//        for (int fila = 0; fila <grillaPresupuesto.getRowCount(); fila++) {
//           String codigoEnRenglon = (String)grillaPresupuesto.getValueAt(fila, 0); 
//            if (txtCodEquipo.getText().equals(codigoEnRenglon)) {
//             grillaPresupuesto.setValueAt(Integer.parseInt(txtCantidadEquipo.getText())+(Integer.parseInt(grillaPresupuesto.getValueAt(fila, 2).toString())), fila, 2);
//            }
//        }
//    }
    
    
    
    
    
    private void txtEquipoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEquipoKeyPressed
        if (txtEquipo.getText().equals("") && evt.getKeyCode() == evt.VK_F2){
            equipos.busqueda="recepcion";
            new equipos().setVisible(true);
          
        }
    }//GEN-LAST:event_txtEquipoKeyPressed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

   
//    public int delvolverCodigoPromo(){
//        if (cmbPromociones.getSelectedItem().equals("Selecciona una promoción")) {
//            return 0;
//        }else{
//           int enviar = Integer.parseInt(cmbPromociones.getSelectedItem().toString().split(" - ")[0]); 
//           return enviar;
//        }
//        
//        
//     
//    }
//    public int delvolverCodigoDescuentos(){
//        if (cmbDescuentos.getSelectedItem().equals("Selecciona un descuento")) {
//            return 0;
//        }else{
//           int enviar = Integer.parseInt(cmbDescuentos.getSelectedItem().toString().split(" - ")[0]); 
//           return enviar;
//        }
//        
//        
//     
//    }
//    
    
    private void btnGrabarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGrabarActionPerformed
        int respuesta=5;
        
        respuesta=JOptionPane.showConfirmDialog(null, confirmar);
        
        
      
        int filasTablaDos = grillaReclamos.getRowCount();
         
        
        if(respuesta==0){
            
            String sql="";
            String sql2="";
            String sqldetalle="";
            if(operacion.equals("agregar")){
                sql="Insert into reclamo_cab (estado, fecha_entada, obs, id_sucursal, id_cliente, id_empleado, id_servi_termi_cab)"
                        + " values ('ACTIVO','"+
                        Metodos.dameFechaFormateadaSQL(txtFecha.getDate())+"','"+

                        txtObs.getText().trim()+"',"+
                        txtSucursal.getText().trim()+","+
                        txtClienteCodigo.getText().trim()+","+
                        txtEmpleadoCod.getText().trim()+","+
                        txtClienteCodigo.getText().trim()+")";
                      System.out.println(sql); 
                      
                   sql2=    "update servicio_termi_cab set"
                        + " estado = 'UTILIZADO' "
                        + " where id_servi_termi_cab = "+txtServicioTerminado.getText();
            }
            
            if(operacion.equals("anular")){
                sql="update reclamo_cab set"
                        + " estado = 'ANULADO' "
                        + " where id_reclamo_cab = "+txtCod.getText();
                
            }
            
            
            Conexion cn=new Conexion();
            try {
                cn.conectar();
                System.out.println(sql);
                System.out.println(sql2);
                cn.actualizar(sql);
                cn.actualizar(sql2);
                int cantidadFilas=grillaReclamos.getRowCount();
                if (operacion.equals("agregar")) {
                        for (int i = 0; i < cantidadFilas; i++) {
                            sqldetalle="insert into reclamo_det(id_reclamo_cab, id_equipo, problema, id_tipo_trabajo) values("
                            +Metodos.ultimoCodigo("id_reclamo_cab", "reclamo_cab")+","
                            +grillaReclamos.getValueAt(i, 0)+",'"
                            +grillaReclamos.getValueAt(i, 4)+"',"
                            +grillaReclamos.getValueAt(i, 2)+")";
                           
                            cn.actualizar(sqldetalle);
                            System.out.println(sqldetalle);
                }   
                }
                JOptionPane.showMessageDialog(null, mensaje);
                Metodos.imprimirPorCodigoUnico(
                        "/src/reportes/reporteProblemaServicioCodigo.jasper",
                        Integer.parseInt(txtCod.getText()));
                btnCancelar.doClick();

                
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(reclamos.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, ex.getMessage());
            } catch (SQLException ex) {
                Logger.getLogger(reclamos.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }
            

        }
         btnCancelar.doClick();
        
    }//GEN-LAST:event_btnGrabarActionPerformed

    private void btnAnularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnularActionPerformed
        
        txtCod.setEnabled(true);
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

    private void txtEmpleadoCodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmpleadoCodActionPerformed

    }//GEN-LAST:event_txtEmpleadoCodActionPerformed

    private void txtEmpleadoDesKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmpleadoDesKeyPressed
        
    }//GEN-LAST:event_txtEmpleadoDesKeyPressed

    private void txtCodKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodKeyPressed
        if (txtCod.getText().equals("") && evt.getKeyCode() == evt.VK_F2){
            busReclamos.busqueda="reclamos";
            new busReclamos().setVisible(true);

        }
    }//GEN-LAST:event_txtCodKeyPressed

    private void txtServicioTerminadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtServicioTerminadoActionPerformed
 
    }//GEN-LAST:event_txtServicioTerminadoActionPerformed

    private void txtObsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtObsActionPerformed
        if (txtObs.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Debe cargar una descripción");
        }else{
            JOptionPane.showMessageDialog(rootPane, "Ahora debe seleccionar los registros de la tabla de arriba");
            grillaServiciosTerminados.requestFocus();
        }
    }//GEN-LAST:event_txtObsActionPerformed

    private void grillaReclamosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_grillaReclamosMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_grillaReclamosMouseClicked

    private void grillaReclamosKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_grillaReclamosKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_grillaReclamosKeyPressed

    private void txtServicioTerminadoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtServicioTerminadoKeyPressed
        if (txtServicioTerminado.getText().equals("") && evt.getKeyCode() == evt.VK_F2){
            busServiciosTerminados.busqueda="reclamos";
            new busServiciosTerminados().setVisible(true);

        }
    }//GEN-LAST:event_txtServicioTerminadoKeyPressed

    private void grillaServiciosTerminadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_grillaServiciosTerminadosMouseClicked
       int fila=grillaServiciosTerminados.getSelectedRow();
        
       String codEquipo= grillaServiciosTerminados.getValueAt(fila, 0).toString();
       String nombreEquipo= grillaServiciosTerminados.getValueAt(fila, 1).toString();
       String codTrabajo= grillaServiciosTerminados.getValueAt(fila, 2).toString();
       String tipoTrabajo= grillaServiciosTerminados.getValueAt(fila, 3).toString();
       String cantidad= grillaServiciosTerminados.getValueAt(fila, 4).toString();
       
       if(operacion.equals("agregar")){
           txtCodEquipo.setText(codEquipo);
           txtEquipo.setText(nombreEquipo);
           txtCodTipoTrabajo.setText(codTrabajo);
           txtTipoTrabajoDesc.setText(tipoTrabajo);
           
//           Metodos.eliminarFila(grillaDiagnostico, fila);
           
           txtProblema.setEnabled(true);
           txtProblema.setEditable(true);
           txtProblema.requestFocus();
       }
    }//GEN-LAST:event_grillaServiciosTerminadosMouseClicked

    private void txtDescriServicioTermiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDescriServicioTermiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDescriServicioTermiActionPerformed


//    public void cargarComboDescuentos() {
//        Conexion cn = new Conexion();
//        try {
//            cn.conectar();
//           
//            ResultSet datos = cn.consultar(" SELECT d.id_descuentos,\n" +
//"   d.descuento_descri,\n" +
//"   dd.monto,\n" +
//"   d.id_descuentos || ' - '::text || d.descuento_descri ||' - '::text || dd.monto::text  AS descuentos \n" +
//"   FROM descuentos_cabecera d\n" +
//"   JOIN descuentos_detalle dd\n" +
//"   on dd.id_descuentos = d.id_descuentos\n" +
//"   where d.estado = 'ACTIVO' and d.id_descuentos=dd.id_descuentos ");
//
//            cmbDescuentos.removeAllItems();
//            cmbDescuentos.addItem("Selecciona un descuento");
//            if (datos.isBeforeFirst()) {
//                while (datos.next()) {
//                    cmbDescuentos.addItem(datos.getString("descuentos"));  //se le pasa por parametro el alias de la consulta sql "datos" pasado al resultSet
//                }
//            } else {
//                JOptionPane.showMessageDialog(null, "No hay registros");
//            }
//
//        } catch (ClassNotFoundException ex) {
//            Logger.getLogger(Metodos.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (SQLException ex) {
//            Logger.getLogger(Metodos.class.getName()).log(Level.SEVERE, null, ex);
//        }
//    }
    
    
    
    
    
    
    
    private void txtDescriServicioTermiKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDescriServicioTermiKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDescriServicioTermiKeyPressed

    private void txtCodTipoTrabajoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodTipoTrabajoActionPerformed


    }//GEN-LAST:event_txtCodTipoTrabajoActionPerformed

    private void txtCodTipoTrabajoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodTipoTrabajoKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodTipoTrabajoKeyPressed

    private void txtTipoTrabajoDescActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTipoTrabajoDescActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTipoTrabajoDescActionPerformed

    private void txtTipoTrabajoDescKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTipoTrabajoDescKeyPressed
//        if (txtTipoTrabajoDesc.getText().equals("") && evt.getKeyCode() == evt.VK_F2){
//            tipoDeTrabajos.busqueda="presupuesto";
//            new tipoDeTrabajos().setVisible(true);
//          
//        }
    }//GEN-LAST:event_txtTipoTrabajoDescKeyPressed

    private void txtProblemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtProblemaActionPerformed
//       for (int fila = 0; fila <grillaReclamos.getRowCount(); fila++) {
//         String codigoTipoEquipo = (String)grillaReclamos.getValueAt(fila, 0);
//         String codigoTipoTrabajo = (String)grillaReclamos.getValueAt(fila, 2);
//         String codigoArti = (String)grillaReclamos.getValueAt(fila, 4);
//         if ((txtCodEquipo.getText().equals(codigoTipoEquipo))&&(txtCodTipoTrabajo.getText().equals(codigoTipoTrabajo))&&(txtClienteCod.getText().equals(codigoArti))) {
//             JOptionPane.showMessageDialog(rootPane, "Ya se utilizó este tipo de trabajo con este equipo");
//
//             
//             return;
//
//         
//            }         
//         
//        }
        
        
        
        
        
        
        
        Metodos.cargarTabla(grillaReclamos, new Object[]{
                txtCodEquipo.getText().trim(),
                txtEquipo.getText().trim(),
                txtCodTipoTrabajo.getText().trim(),
                txtTipoTrabajoDesc.getText().trim(),
                txtProblema.getText().trim()
                
                });
  
        txtCodEquipo.setText("");
        txtEquipo.setText("");
        txtTipoTrabajoDesc.setText("");
        txtCodTipoTrabajo.setText("");
        txtProblema.setText("");
        grillaServiciosTerminados.requestFocus();
    }//GEN-LAST:event_txtProblemaActionPerformed

    private void txtProblemaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtProblemaKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtProblemaKeyPressed

    private void txtClienteCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtClienteCodigoActionPerformed
        txtEquipo.setEditable(true);
        txtEquipo.requestFocus();
    }//GEN-LAST:event_txtClienteCodigoActionPerformed

    private void txtClienteDescriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtClienteDescriActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtClienteDescriActionPerformed

    private void txtClienteDescriKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtClienteDescriKeyPressed
//        if (txtClienteDesc.getText().equals("") && evt.getKeyCode() == evt.VK_F2){
//            clientes.busqueda="recepcion";
//            new clientes().setVisible(true);
//
//        }
    }//GEN-LAST:event_txtClienteDescriKeyPressed

    
    
    
    
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
                new reclamos().setVisible(true);
            }
        });
    }
 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnAnular;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnGrabar;
    private javax.swing.JButton btnSalir;
    public static javax.swing.JTable grillaReclamos;
    public static javax.swing.JTable grillaServiciosTerminados;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    public static javax.swing.JTextField txtClienteCodigo;
    public static javax.swing.JTextField txtClienteDescri;
    public static javax.swing.JTextField txtCod;
    public static javax.swing.JTextField txtCodEquipo;
    public static javax.swing.JTextField txtCodTipoTrabajo;
    public static javax.swing.JTextField txtDescriServicioTermi;
    public static javax.swing.JTextField txtEmpleadoCod;
    public static javax.swing.JTextField txtEmpleadoDes;
    public static javax.swing.JTextField txtEquipo;
    public static com.toedter.calendar.JDateChooser txtFecha;
    public static javax.swing.JTextField txtObs;
    public static javax.swing.JTextField txtProblema;
    public static javax.swing.JTextField txtServicioTerminado;
    public static javax.swing.JTextField txtSucursal;
    public static javax.swing.JTextField txtTipoTrabajoDesc;
    // End of variables declaration//GEN-END:variables
 
}
