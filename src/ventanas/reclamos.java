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
        cargarComboPromociones();
        cargarComboDescuentos();
  
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        txtCodEquipo = new javax.swing.JTextField();
        txtEquipo = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtTipoProbleDesc = new javax.swing.JTextField();
        txtTipoProbleCod = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        txtCodTipoTrabajo = new javax.swing.JTextField();
        txtTipoTrabajoDesc = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        txtMontoPresu = new javax.swing.JTextField();
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
        txtCodDiagnostico = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        txtDescriPresupuesto = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        grillaPresupuesto = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        grillaDiagnostico = new javax.swing.JTable();
        txtObsDiagnostico = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        btnAgregar = new javax.swing.JButton();
        btnAnular = new javax.swing.JButton();
        btnGrabar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();

        jLabel5.setText("jLabel5");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("PRESUPUESTOS");

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

        jLabel12.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Tipo de problema");

        txtTipoProbleDesc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTipoProbleDescActionPerformed(evt);
            }
        });
        txtTipoProbleDesc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtTipoProbleDescKeyPressed(evt);
            }
        });

        txtTipoProbleCod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTipoProbleCodActionPerformed(evt);
            }
        });
        txtTipoProbleCod.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtTipoProbleCodKeyPressed(evt);
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

        txtMontoPresu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMontoPresuActionPerformed(evt);
            }
        });
        txtMontoPresu.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtMontoPresuKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel22)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCodTipoTrabajo, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTipoTrabajoDesc))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTipoProbleCod, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTipoProbleDesc))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 8, Short.MAX_VALUE)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCodEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jLabel24)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                        .addComponent(txtMontoPresu, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCodEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(txtEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTipoProbleDesc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12)
                            .addComponent(txtTipoProbleCod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTipoTrabajoDesc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel22)
                            .addComponent(txtCodTipoTrabajo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(txtMontoPresu, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel13.setText("Sucursal:");

        jLabel2.setFont(new java.awt.Font("Calibri", 0, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 102));
        jLabel2.setText("Reclamos");

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
        jLabel17.setText("Servicio terminado");

        txtCodDiagnostico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodDiagnosticoActionPerformed(evt);
            }
        });
        txtCodDiagnostico.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCodDiagnosticoKeyPressed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel18.setText("Observaciones");

        txtDescriPresupuesto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDescriPresupuestoActionPerformed(evt);
            }
        });

        grillaPresupuesto.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        grillaPresupuesto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cod. equipo", "Equipo", "Cod Tipo Problema", "Tipo Problema", "Cod Tipo de trabajo", "Tipo de trabajo", "Problema"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        grillaPresupuesto.setGridColor(new java.awt.Color(153, 153, 153));
        grillaPresupuesto.setPreferredSize(new java.awt.Dimension(50, 224));
        grillaPresupuesto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                grillaPresupuestoMouseClicked(evt);
            }
        });
        grillaPresupuesto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                grillaPresupuestoKeyPressed(evt);
            }
        });
        jScrollPane3.setViewportView(grillaPresupuesto);

        grillaDiagnostico.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        grillaDiagnostico.setModel(new javax.swing.table.DefaultTableModel(
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
        grillaDiagnostico.setGridColor(new java.awt.Color(153, 153, 153));
        grillaDiagnostico.setPreferredSize(new java.awt.Dimension(50, 224));
        grillaDiagnostico.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                grillaDiagnosticoMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(grillaDiagnostico);

        txtObsDiagnostico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtObsDiagnosticoActionPerformed(evt);
            }
        });
        txtObsDiagnostico.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtObsDiagnosticoKeyPressed(evt);
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDescriPresupuesto, javax.swing.GroupLayout.PREFERRED_SIZE, 528, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
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
                            .addGap(254, 254, 254)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGap(11, 11, 11)
                            .addComponent(jLabel17)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtCodDiagnostico, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jLabel21)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtObsDiagnostico)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel15)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtEmpleadoCod, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtEmpleadoDes, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jLabel16)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtClienteCod, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtClienteDesc, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(12, 12, 12))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btnAgregar)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnGrabar, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnCancelar)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnAnular, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 870, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtCod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSucursal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel17)
                        .addComponent(txtCodDiagnostico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel21))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtClienteCod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel16)
                        .addComponent(txtClienteDesc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtEmpleadoDes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtEmpleadoCod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel15)
                        .addComponent(txtObsDiagnostico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(txtDescriPresupuesto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGrabar)
                    .addComponent(btnCancelar)
                    .addComponent(btnAnular)
                    .addComponent(btnSalir))
                .addGap(77, 77, 77))
        );

        setSize(new java.awt.Dimension(959, 580));
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
        txtCodDiagnostico.setText("");
        txtEmpleadoCod.setText("");
        txtEmpleadoDes.setText("");
        txtClienteCod.setText("");
        txtClienteDesc.setText("");
        txtDescriPresupuesto.setText("");
        txtObsDiagnostico.setText("");
        
        limpiarTabla(grillaDiagnostico);
        limpiarTabla(grillaPresupuesto);
        
        btnAgregar.setEnabled(true);
        btnAnular.setEnabled(true);
        btnSalir.setEnabled(true);
        btnGrabar.setEnabled(false);
        btnCancelar.setEnabled(false);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        txtCodDiagnostico.setEditable(true);
        txtCodDiagnostico.requestFocus();
        txtFecha.setEnabled(true);
        
        btnAgregar.setEnabled(false);
        btnAnular.setEnabled(false);
        btnSalir.setEnabled(false);
        btnGrabar.setEnabled(true);
        btnCancelar.setEnabled(true);
        
        
        txtCod.setText(Metodos.siguienteCodigo("id_presupuesto_reparacion_cab", "presupuesto_servicio_cabecera"));
        
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
        
        
      
        int filasTablaDos = grillaPresupuesto.getRowCount();
        
        
        if(respuesta==0){
            if (filasTablaDos>=1) {
            String sql="";
            String sql2="";
            String sqldetalle="";
            if(operacion.equals("agregar")){
                sql="Insert into presupuesto_servicio_cabecera (fecha, fecha_vencimiento, estado, presu_descri, id_sucu, id_diagnostico_cabecera, id_empleado, id_cliente, id_promociones, id_descuentos)"
                        + " values ('"+
                        Metodos.dameFechaFormateadaSQL(txtFecha.getDate())+"','"+

                        txtDescriPresupuesto.getText().trim()+"',"+
                        txtSucursal.getText().trim()+","+
                        txtCodDiagnostico.getText().trim()+","+
                        txtEmpleadoCod.getText().trim()+","+
                        txtClienteCod.getText().trim()+")";
                      System.out.println(sql); 
                      
                   sql2=    "update diagnostico_cabecera set"
                        + " estado = 'UTILIZADO' "
                        + " where id_diagnostico_cabecera = "+txtCodDiagnostico.getText();
            }
            
            if(operacion.equals("anular")){
                sql="update presupuesto_servicio_cabecera set"
                        + " estado = 'ANULADO' "
                        + " where id_presupuesto_reparacion_cab = "+txtCod.getText();
                
            }
            
            
            Conexion cn=new Conexion();
            try {
                cn.conectar();
                System.out.println(sql);
                System.out.println(sql2);
                cn.actualizar(sql);
                cn.actualizar(sql2);
                int cantidadFilas=grillaPresupuesto.getRowCount();
                if (operacion.equals("agregar")) {
                        for (int i = 0; i < cantidadFilas; i++) {
                            sqldetalle="insert into presupuesto_servicio_detalle(id_presupuesto_reparacion_cab, id_tipo_trabajo, id_equipo, pro_cod, cantidad, monto) values("
                            +Metodos.ultimoCodigo("id_presupuesto_reparacion_cab", "presupuesto_servicio_cabecera")+","
                            +grillaPresupuesto.getValueAt(i, 4)+","
                            +grillaPresupuesto.getValueAt(i, 0)+","
                            +grillaPresupuesto.getValueAt(i, 6)+","
                            +grillaPresupuesto.getValueAt(i, 8)+","
                            +grillaPresupuesto.getValueAt(i, 9)+")";
                           
                            cn.actualizar(sqldetalle);
                            System.out.println(sqldetalle);
                }   
                }
                JOptionPane.showMessageDialog(null, mensaje);
                btnCancelar.doClick();

                
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(reclamos.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, ex.getMessage());
            } catch (SQLException ex) {
                Logger.getLogger(reclamos.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }
            }else{
                JOptionPane.showMessageDialog(rootPane, "Debe cargar registros en la tabla");
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
//        if (txtCod.getText().equals("") && evt.getKeyCode() == evt.VK_F2){
//            busPresupuestoServicios.busqueda="presupuesto";
//            new busPresupuestoServicios().setVisible(true);
//
//        }
    }//GEN-LAST:event_txtCodKeyPressed

    private void txtCodDiagnosticoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodDiagnosticoActionPerformed
 
    }//GEN-LAST:event_txtCodDiagnosticoActionPerformed

    private void txtDescriPresupuestoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDescriPresupuestoActionPerformed
        if (txtDescriPresupuesto.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Debe cargar una descripción");
        }else{
            JOptionPane.showMessageDialog(rootPane, "Ahora debe seleccionar los registros de la tabla de arriba");
            grillaDiagnostico.requestFocus();
        }
    }//GEN-LAST:event_txtDescriPresupuestoActionPerformed

    private void txtTipoProbleDescActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTipoProbleDescActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTipoProbleDescActionPerformed

    private void txtTipoProbleDescKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTipoProbleDescKeyPressed
        if (txtTipoProbleDesc.getText().equals("") && evt.getKeyCode() == evt.VK_F2){
            tipoDeProblemas.busqueda="diagnostico";
            new tipoDeProblemas().setVisible(true);
          
        }
    }//GEN-LAST:event_txtTipoProbleDescKeyPressed

    private void grillaPresupuestoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_grillaPresupuestoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_grillaPresupuestoMouseClicked

    private void grillaPresupuestoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_grillaPresupuestoKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_grillaPresupuestoKeyPressed

    private void txtTipoProbleCodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTipoProbleCodActionPerformed

    }//GEN-LAST:event_txtTipoProbleCodActionPerformed

    private void txtTipoProbleCodKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTipoProbleCodKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTipoProbleCodKeyPressed

    private void txtCodDiagnosticoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodDiagnosticoKeyPressed
        if (txtCodDiagnostico.getText().equals("") && evt.getKeyCode() == evt.VK_F2){
            busDiagnostico.busqueda="presupuesto";
            new busDiagnostico().setVisible(true);

        }
    }//GEN-LAST:event_txtCodDiagnosticoKeyPressed

    private void grillaDiagnosticoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_grillaDiagnosticoMouseClicked
       int fila=grillaDiagnostico.getSelectedRow();
        
       String codEquipo= grillaDiagnostico.getValueAt(fila, 0).toString();
       String nombreEquipo= grillaDiagnostico.getValueAt(fila, 1).toString();
       String codProblema= grillaDiagnostico.getValueAt(fila, 2).toString();
       String tipoProblema= grillaDiagnostico.getValueAt(fila, 3).toString();
       String cantidad= grillaDiagnostico.getValueAt(fila, 4).toString();
       
       if(operacion.equals("agregar")){
           txtCodEquipo.setText(codEquipo);
           txtEquipo.setText(nombreEquipo);
           txtTipoProbleCod.setText(codProblema);
           txtTipoProbleDesc.setText(tipoProblema);
           
//           Metodos.eliminarFila(grillaDiagnostico, fila);
           
           txtTipoTrabajoDesc.setEnabled(true);
           txtTipoTrabajoDesc.setEditable(true);
           txtTipoTrabajoDesc.requestFocus();
       }
    }//GEN-LAST:event_grillaDiagnosticoMouseClicked

    private void txtObsDiagnosticoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtObsDiagnosticoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtObsDiagnosticoActionPerformed


    public void cargarComboDescuentos() {
        Conexion cn = new Conexion();
        try {
            cn.conectar();
           
            ResultSet datos = cn.consultar(" SELECT d.id_descuentos,\n" +
"   d.descuento_descri,\n" +
"   dd.monto,\n" +
"   d.id_descuentos || ' - '::text || d.descuento_descri ||' - '::text || dd.monto::text  AS descuentos \n" +
"   FROM descuentos_cabecera d\n" +
"   JOIN descuentos_detalle dd\n" +
"   on dd.id_descuentos = d.id_descuentos\n" +
"   where d.estado = 'ACTIVO' and d.id_descuentos=dd.id_descuentos ");

            cmbDescuentos.removeAllItems();
            cmbDescuentos.addItem("Selecciona un descuento");
            if (datos.isBeforeFirst()) {
                while (datos.next()) {
                    cmbDescuentos.addItem(datos.getString("descuentos"));  //se le pasa por parametro el alias de la consulta sql "datos" pasado al resultSet
                }
            } else {
                JOptionPane.showMessageDialog(null, "No hay registros");
            }

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Metodos.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Metodos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    
    
    
    
    
    private void txtObsDiagnosticoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtObsDiagnosticoKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtObsDiagnosticoKeyPressed

    private void txtCodTipoTrabajoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodTipoTrabajoActionPerformed

        txtArticuloDesc.setEnabled(true);
        txtArticuloDesc.requestFocus();

    }//GEN-LAST:event_txtCodTipoTrabajoActionPerformed

    private void txtCodTipoTrabajoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodTipoTrabajoKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodTipoTrabajoKeyPressed

    private void txtTipoTrabajoDescActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTipoTrabajoDescActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTipoTrabajoDescActionPerformed

    private void txtTipoTrabajoDescKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTipoTrabajoDescKeyPressed
        if (txtTipoTrabajoDesc.getText().equals("") && evt.getKeyCode() == evt.VK_F2){
            tipoDeTrabajos.busqueda="presupuesto";
            new tipoDeTrabajos().setVisible(true);
          
        }
    }//GEN-LAST:event_txtTipoTrabajoDescKeyPressed

    private void txtMontoPresuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMontoPresuActionPerformed
       for (int fila = 0; fila <grillaPresupuesto.getRowCount(); fila++) {
         String codigoTipoEquipo = (String)grillaPresupuesto.getValueAt(fila, 0);
         String codigoTipoTrabajo = (String)grillaPresupuesto.getValueAt(fila, 2);
         String codigoArti = (String)grillaPresupuesto.getValueAt(fila, 4);
         if ((txtCodEquipo.getText().equals(codigoTipoEquipo))&&(txtCodTipoTrabajo.getText().equals(codigoTipoTrabajo))&&(txtCodArti.getText().equals(codigoArti))) {
             JOptionPane.showMessageDialog(rootPane, "Ya se utilizó este tipo de trabajo con este equipo");
             txtArticuloDesc.setText("");
             txtCodArti.setText("");
             txtArticuloDesc.requestFocus();
             
             return;

         
            }         
         
        }
        
        
        
        
        
        
        
        Metodos.cargarTabla(grillaPresupuesto, new Object[]{
                txtCodEquipo.getText().trim(),
                txtEquipo.getText().trim(),
                txtTipoProbleCod.getText().trim(),
                txtTipoProbleDesc.getText().trim(),
                txtCodTipoTrabajo.getText().trim(),
                txtTipoTrabajoDesc.getText().trim(),
                txtCodArti.getText().trim(),
                txtArticuloDesc.getText().trim(),
                txtCantidadArti.getText().trim(),
                txtMontoPresu.getText().trim()
                
                });
       txtTOTAL.setText(String.valueOf(Metodos.sumarColumna(grillaPresupuesto, 9))); 
        calcularTotaless();
        txtCodEquipo.setText("");
        txtTipoProbleDesc.setText("");
        txtEquipo.setText("");
        txtTipoProbleCod.setText("");
        txtTipoTrabajoDesc.setText("");
        txtTipoProbleDesc.setText("");
        txtCantidadArti.setText("");
        txtCodTipoTrabajo.setText("");
        txtCodArti.setText("");
        txtArticuloDesc.setText("");
        txtMontoPresu.setText("");
        grillaDiagnostico.requestFocus();
    }//GEN-LAST:event_txtMontoPresuActionPerformed

    private void txtMontoPresuKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMontoPresuKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMontoPresuKeyPressed

    
    public void calcularTotaless(){
          int totalColumna = Metodos.sumarColumna(grillaPresupuesto, 9); 
          String montoPromo = (cmbPromociones.getSelectedIndex() <= 0) ? "0" : (String) cmbPromociones.getSelectedItem().toString().split(" - ")[3];
          String montoDesc = (cmbDescuentos.getSelectedIndex() <= 0) ? "0" : (String) cmbDescuentos.getSelectedItem().toString().split(" - ")[2];
          
          txtTOTAL.setText(String.valueOf(totalColumna-(Integer.parseInt(montoPromo))-(Integer.parseInt(montoDesc))));
    }
    
    
    
    
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
    public static javax.swing.JTable grillaDiagnostico;
    public static javax.swing.JTable grillaPresupuesto;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    public static javax.swing.JTextField txtClienteCod;
    public static javax.swing.JTextField txtClienteDesc;
    public static javax.swing.JTextField txtCod;
    public static javax.swing.JTextField txtCodDiagnostico;
    public static javax.swing.JTextField txtCodEquipo;
    public static javax.swing.JTextField txtCodTipoTrabajo;
    public static javax.swing.JTextField txtDescriPresupuesto;
    public static javax.swing.JTextField txtEmpleadoCod;
    public static javax.swing.JTextField txtEmpleadoDes;
    public static javax.swing.JTextField txtEquipo;
    public static com.toedter.calendar.JDateChooser txtFecha;
    public static javax.swing.JTextField txtMontoPresu;
    public static javax.swing.JTextField txtObsDiagnostico;
    public static javax.swing.JTextField txtSucursal;
    public static javax.swing.JTextField txtTipoProbleCod;
    public static javax.swing.JTextField txtTipoProbleDesc;
    public static javax.swing.JTextField txtTipoTrabajoDesc;
    // End of variables declaration//GEN-END:variables
 
}
