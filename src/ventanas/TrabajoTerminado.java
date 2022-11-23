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
import static ventanas.presupuestoServicios.txtCod;

public class TrabajoTerminado extends javax.swing.JFrame {

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

    public TrabajoTerminado() {
        initComponents();
        btnCancelar.doClick();
        txtFecha.setDate(new JCalendar().getDate());
        fechaVencimientoG.setDate(new JCalendar().getDate());
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
        jLabel10 = new javax.swing.JLabel();
        txtCantidad = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtSucursal = new javax.swing.JTextField();
        txtFecha = new com.toedter.calendar.JDateChooser();
        txtCod = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtEmpleadoDes = new javax.swing.JTextField();
        txtEmpleadoCod = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        txtOrdenTrabajo = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        txtObs = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        grillaTerminados = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        grillaOrdenes = new javax.swing.JTable();
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
        jPanel1 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        txtCodArti = new javax.swing.JTextField();
        txtArticuloDesc = new javax.swing.JTextField();
        txtCantidadInsumo = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        grillaInsumos = new javax.swing.JTable();
        fechaVencimientoG = new com.toedter.calendar.JDateChooser();
        jLabel14 = new javax.swing.JLabel();

        jLabel5.setText("jLabel5");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("TRABAJO TERMINADO E INSUMOS");

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
        jLabel24.setText("Descripción");

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

        jLabel10.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Cantidad");

        txtCantidad.setEditable(false);
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
                        .addComponent(txtProblema, javax.swing.GroupLayout.DEFAULT_SIZE, 391, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel22)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCodTipoTrabajo, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTipoTrabajoDesc)))
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
                    .addComponent(txtProblema, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel10)))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel13.setText("Fecha de vencimiento de garantia");

        jLabel2.setFont(new java.awt.Font("Calibri", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 102));
        jLabel2.setText("TRABAJO TERMINADO");

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
        jLabel17.setText("Orden de trabajo");

        txtOrdenTrabajo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOrdenTrabajoActionPerformed(evt);
            }
        });
        txtOrdenTrabajo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtOrdenTrabajoKeyPressed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel18.setText("Observaciones");

        txtObs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtObsActionPerformed(evt);
            }
        });

        grillaTerminados.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        grillaTerminados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cod. equipo", "Equipo", "Cod Tipo de trabajo", "Tipo de trabajo", "Cantidad", "Descripcion"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        grillaTerminados.setGridColor(new java.awt.Color(153, 153, 153));
        grillaTerminados.setPreferredSize(new java.awt.Dimension(50, 224));
        grillaTerminados.getTableHeader().setReorderingAllowed(false);
        grillaTerminados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                grillaTerminadosMouseClicked(evt);
            }
        });
        grillaTerminados.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                grillaTerminadosKeyPressed(evt);
            }
        });
        jScrollPane3.setViewportView(grillaTerminados);

        grillaOrdenes.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        grillaOrdenes.setModel(new javax.swing.table.DefaultTableModel(
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
        grillaOrdenes.setGridColor(new java.awt.Color(153, 153, 153));
        grillaOrdenes.setPreferredSize(new java.awt.Dimension(50, 224));
        grillaOrdenes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                grillaOrdenesMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(grillaOrdenes);
        if (grillaOrdenes.getColumnModel().getColumnCount() > 0) {
            grillaOrdenes.getColumnModel().getColumn(2).setHeaderValue("Cod tipo trabajo");
            grillaOrdenes.getColumnModel().getColumn(3).setHeaderValue("Tipo de trabajo");
        }

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

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Insumos Utilizados", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        jLabel23.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel23.setText("Articulo");

        txtCodArti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodArtiActionPerformed(evt);
            }
        });
        txtCodArti.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCodArtiKeyPressed(evt);
            }
        });

        txtArticuloDesc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtArticuloDescActionPerformed(evt);
            }
        });
        txtArticuloDesc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtArticuloDescKeyPressed(evt);
            }
        });

        txtCantidadInsumo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCantidadInsumoActionPerformed(evt);
            }
        });
        txtCantidadInsumo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCantidadInsumoKeyPressed(evt);
            }
        });

        jLabel25.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel25.setText("Cantidad");

        grillaInsumos.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        grillaInsumos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Descripción", "Cantidad"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        grillaInsumos.setGridColor(new java.awt.Color(153, 153, 153));
        grillaInsumos.setPreferredSize(new java.awt.Dimension(50, 224));
        grillaInsumos.getTableHeader().setReorderingAllowed(false);
        grillaInsumos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                grillaInsumosMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(grillaInsumos);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtCodArti, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtArticuloDesc, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel23))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel25)
                            .addComponent(txtCantidadInsumo, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(jLabel25))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtArticuloDesc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCodArti, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCantidadInsumo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(62, Short.MAX_VALUE))
        );

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel14.setText("Sucursal:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(txtCod, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel14)
                .addGap(22, 22, 22)
                .addComponent(txtSucursal, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(fechaVencimientoG, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jLabel2))
            .addGroup(layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(jLabel17)
                .addGap(4, 4, 4)
                .addComponent(txtOrdenTrabajo, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(jLabel21)
                .addGap(5, 5, 5)
                .addComponent(txtDescriServicioTermi, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(jLabel19)
                .addGap(1, 1, 1)
                .addComponent(txtClienteCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(txtClienteDescri, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(jLabel15)
                .addGap(5, 5, 5)
                .addComponent(txtEmpleadoCod, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(txtEmpleadoDes, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 630, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel18)
                        .addGap(7, 7, 7)
                        .addComponent(txtObs, javax.swing.GroupLayout.PREFERRED_SIZE, 528, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 640, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(8, 8, 8)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(btnAgregar)
                .addGap(6, 6, 6)
                .addComponent(btnGrabar, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(btnCancelar)
                .addGap(6, 6, 6)
                .addComponent(btnAnular, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(txtCod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(txtSucursal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(fechaVencimientoG, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17)
                    .addComponent(txtOrdenTrabajo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21)
                    .addComponent(txtDescriServicioTermi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19)
                    .addComponent(txtClienteCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtClienteDescri, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15)
                    .addComponent(txtEmpleadoCod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEmpleadoDes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtObs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnGrabar)
                            .addComponent(btnCancelar)
                            .addComponent(btnAnular)
                            .addComponent(btnSalir)))))
        );

        setSize(new java.awt.Dimension(1119, 568));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void traerFechaActual() {
        Calendar cal = Calendar.getInstance();
        String fecha = cal.get(cal.DATE) + "/" + cal.get(cal.MONTH) + "/" + cal.get(cal.YEAR);
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
        txtOrdenTrabajo.setText("");
        txtEmpleadoCod.setText("");
        txtEmpleadoDes.setText("");
        txtClienteCodigo.setText("");
        txtClienteDescri.setText("");
        txtObs.setText("");
        txtDescriServicioTermi.setText("");

        limpiarTabla(grillaOrdenes);
        limpiarTabla(grillaTerminados);
        limpiarTabla(grillaInsumos);

        btnAgregar.setEnabled(true);
        btnAnular.setEnabled(true);
        btnSalir.setEnabled(true);
        btnGrabar.setEnabled(false);
        btnCancelar.setEnabled(false);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        txtOrdenTrabajo.setEditable(true);
        txtOrdenTrabajo.requestFocus();
        txtFecha.setEnabled(true);

        btnAgregar.setEnabled(false);
        btnAnular.setEnabled(false);
        btnSalir.setEnabled(false);
        btnGrabar.setEnabled(true);
        btnCancelar.setEnabled(true);

        txtCod.setText(Metodos.siguienteCodigo("id_servi_termi_cab", "servicio_termi_cab"));

        operacion = "agregar";
        confirmar = "¿Desea grabar el nuevo registro?";
        mensaje = "Registro grabado con exito";
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
        if (txtEquipo.getText().equals("") && evt.getKeyCode() == evt.VK_F2) {
            equipos.busqueda = "recepcion";
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
        int respuesta = 5;
        String cod_insumo = Metodos.siguienteCodigo("id_insumo_utiliz", "insumos_utilizados_cab");

        respuesta = JOptionPane.showConfirmDialog(null, confirmar);

        int filasTablaDos = grillaTerminados.getRowCount();

        if (respuesta == 0) {

            String sql = "";
            String sql2 = "";
            String sqldetalle = "";
            String id_garantia = Metodos.siguienteCodigo("id_contrato", "contrato_servicio_cab");
            if (operacion.equals("agregar")) {

                sql = "INSERT INTO public.servicio_termi_cab(\n"
                        + "id_servi_termi_cab, descri, fecha_entrega, estado, estado_de_cobro, \n"
                        + "id_orden_trabajo_cab, id_cliente, id_empleado, id_sucursal)\n"
                        + "VALUES (" + txtCod.getText() + ", '" + txtObs.getText() + "', "
                        + "'" + Metodos.dameFechaFormateadaSQL(txtFecha.getDate()) + "', 'ACTIVO', "
                        + "'PENDIENTE', \n"
                        + "" + txtOrdenTrabajo.getText() + ", " + txtClienteCodigo.getText() + ", "
                        + "" + Menu.idEmpleado + ", " + Menu.idSucursal + ");";

                sql += "INSERT INTO public.insumos_utilizados_cab(\n"
                        + "id_insumo_utiliz, id_empleado, id_sucursal, id_servi_termi_cab, \n"
                        + "fecha, descripcion, estado)\n"
                        + "VALUES (" + cod_insumo + ", " + txtEmpleadoCod.getText() + ", "
                        + "" + Menu.idSucursal + ", " + txtCod.getText() + ", \n"
                        + "'" + Metodos.dameFechaFormateadaSQL(txtFecha.getDate()) + "', "
                        + "'" + txtObs.getText() + "', 'ACTIVO');";

                sql += "INSERT INTO public.garantia_cab(\n"
                        + "            id_garantia_cab, id_servi_termi_cab, id_empleado, id_cliente, \n"
                        + "            fecha_registro, fecha_expiracion, observacion, estado)\n"
                        + "    VALUES ("+id_garantia+", '"+txtCod.getText().trim()+"', '"+txtEmpleadoCod.getText()+"', '"+txtClienteCodigo.getText()+"', \n"
                        + "            '"+Metodos.dameFechaFormateadaSQL(txtFecha.getDate())+"', '"+Metodos.dameFechaFormateadaSQL(fechaVencimientoG.getDate())+"',"
                        + " '"+txtObs.getText()+"', 'ACTIVO');";

                System.out.println(sql);

            }

            if (operacion.equals("anular")) {
                sql = "update servicio_termi_cab set"
                        + " estado = 'ANULADO' "
                        + " where id_servi_termi_cab = " + txtCod.getText();

            }

            Conexion cn = new Conexion();
            try {
                cn.conectar();
                System.out.println(sql);
                System.out.println(sql2);
                cn.actualizar(sql);
                cn.actualizar(sql2);
                int cantidadFilas = grillaTerminados.getRowCount();
                int cantidadFilas2 = grillaInsumos.getRowCount();
                if (operacion.equals("agregar")) {
                    for (int i = 0; i < cantidadFilas; i++) {

                        sqldetalle = "INSERT INTO public.servicio_termi_det(\n"
                                + "id_servi_termi_cab, id_equipo, "
                                + "id_tipo_trabajo,  "
                                + "servi_termi_descri, cantidad)\n"
                                + "VALUES (" + txtCod.getText() + ","
                                + " " + grillaTerminados.getValueAt(i, 0) + ", "
                                + "" + grillaTerminados.getValueAt(i, 2) + ", "
                                + "'" + grillaTerminados.getValueAt(i, 4) + "', "
                                + "" + grillaTerminados.getValueAt(i, 5) + ");";

                        sqldetalle += "INSERT INTO public.garantia_det(\n"
                                + "    id_garantia_cab, id_equipo, id_tipo_garantia)\n"
                                + "    VALUES ("+id_garantia+", "+grillaTerminados.getValueAt(i, 0)+","
                                + " "+grillaTerminados.getValueAt(i, 2)+");";

                        System.out.println(sqldetalle);
                        cn.actualizar(sqldetalle);
                    }
                    for (int i = 0; i < cantidadFilas2; i++) {

                        sqldetalle = "INSERT INTO public.insumos_utilizados_det(\n"
                                + "id_insumo_utiliz, id_articulo, cantidad)\n"
                                + "VALUES (" + cod_insumo + ", "
                                + "" + grillaInsumos.getValueAt(i, 0) + ","
                                + " " + grillaInsumos.getValueAt(i, 2) + ");";

                        System.out.println(sqldetalle);
                        cn.actualizar(sqldetalle);
                    }
                }
                JOptionPane.showMessageDialog(null, mensaje);
                Metodos.imprimirPorCodigoUnico(
                        "/src/reportes/reporteTerminadoServicioCodigo.jasper",
                        Integer.parseInt(txtCod.getText()));
                btnCancelar.doClick();

            } catch (ClassNotFoundException ex) {
                Logger.getLogger(TrabajoTerminado.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, ex.getMessage());
            } catch (SQLException ex) {
                Logger.getLogger(TrabajoTerminado.class.getName()).log(Level.SEVERE, null, ex);
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

        operacion = "anular";
        confirmar = "¿Desea anular este registro?";
        mensaje = "Registro anulado con exito";
    }//GEN-LAST:event_btnAnularActionPerformed

    private void txtEmpleadoDesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmpleadoDesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmpleadoDesActionPerformed

    private void txtEmpleadoCodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmpleadoCodActionPerformed

    }//GEN-LAST:event_txtEmpleadoCodActionPerformed

    private void txtEmpleadoDesKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmpleadoDesKeyPressed

    }//GEN-LAST:event_txtEmpleadoDesKeyPressed

    private void txtCodKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodKeyPressed
        if (txtCod.getText().equals("") && evt.getKeyCode() == evt.VK_F2) {
            busServiciosTerminados.busqueda = "terminados";
            new busServiciosTerminados().setVisible(true);

        }
    }//GEN-LAST:event_txtCodKeyPressed

    private void txtOrdenTrabajoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOrdenTrabajoActionPerformed

    }//GEN-LAST:event_txtOrdenTrabajoActionPerformed

    private void txtObsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtObsActionPerformed
        if (txtObs.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Debe cargar una descripción");
        } else {
            JOptionPane.showMessageDialog(rootPane, "Ahora debe seleccionar los registros de la tabla de arriba");
            grillaOrdenes.requestFocus();
        }
    }//GEN-LAST:event_txtObsActionPerformed

    private void grillaTerminadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_grillaTerminadosMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_grillaTerminadosMouseClicked

    private void grillaTerminadosKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_grillaTerminadosKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_grillaTerminadosKeyPressed

    private void txtOrdenTrabajoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtOrdenTrabajoKeyPressed
        if (txtOrdenTrabajo.getText().equals("") && evt.getKeyCode() == evt.VK_F2) {
            busOrdenTrabajo2.busqueda = "orden_para_terminados";
            new busOrdenTrabajo2().setVisible(true);

        }
    }//GEN-LAST:event_txtOrdenTrabajoKeyPressed

    private void grillaOrdenesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_grillaOrdenesMouseClicked
        int fila = grillaOrdenes.getSelectedRow();

        String codEquipo = grillaOrdenes.getValueAt(fila, 0).toString();
        String nombreEquipo = grillaOrdenes.getValueAt(fila, 1).toString();
        String codTrabajo = grillaOrdenes.getValueAt(fila, 2).toString();
        String tipoTrabajo = grillaOrdenes.getValueAt(fila, 3).toString();
        String cantidad = grillaOrdenes.getValueAt(fila, 4).toString();

        if (operacion.equals("agregar")) {
            txtCodEquipo.setText(codEquipo);
            txtEquipo.setText(nombreEquipo);
            txtCodTipoTrabajo.setText(codTrabajo);
            txtTipoTrabajoDesc.setText(tipoTrabajo);
            txtCantidad.setText(cantidad);

//           Metodos.eliminarFila(grillaDiagnostico, fila);
            txtProblema.setEnabled(true);
            txtProblema.setEditable(true);
            txtProblema.requestFocus();
        }
    }//GEN-LAST:event_grillaOrdenesMouseClicked

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
        for (int fila = 0; fila < grillaTerminados.getRowCount(); fila++) {
            String codigoTipoEquipo = (String) grillaTerminados.getValueAt(fila, 0);
            String codigoTipoTrabajo = (String) grillaTerminados.getValueAt(fila, 2);

            if ((txtCodEquipo.getText().equals(codigoTipoEquipo))
                    && (txtCodTipoTrabajo.getText().equals(codigoTipoTrabajo))) {
                JOptionPane.showMessageDialog(rootPane, "Ya se utilizó este tipo de trabajo con este equipo");

                return;

            }

        }

        Metodos.cargarTabla(grillaTerminados, new Object[]{
            txtCodEquipo.getText().trim(),
            txtEquipo.getText().trim(),
            txtCodTipoTrabajo.getText().trim(),
            txtTipoTrabajoDesc.getText().trim(),
            txtProblema.getText().trim(),
            txtCantidad.getText()
        });

        txtCodEquipo.setText("");
        txtEquipo.setText("");
        txtTipoTrabajoDesc.setText("");
        txtCodTipoTrabajo.setText("");
        txtProblema.setText("");
        txtCantidad.setText("");
        grillaOrdenes.requestFocus();
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

    private void txtCantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCantidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCantidadActionPerformed

    private void txtCodArtiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodArtiActionPerformed

    }//GEN-LAST:event_txtCodArtiActionPerformed

    private void txtCodArtiKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodArtiKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodArtiKeyPressed

    private void txtArticuloDescActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtArticuloDescActionPerformed

    }//GEN-LAST:event_txtArticuloDescActionPerformed

    private void txtArticuloDescKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtArticuloDescKeyPressed
        if (txtArticuloDesc.getText().equals("") && evt.getKeyCode() == evt.VK_F2) {
            producto.busqueda = "trabajo_terminado";
            new producto().setVisible(true);

        }
    }//GEN-LAST:event_txtArticuloDescKeyPressed

    private void txtCantidadInsumoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCantidadInsumoActionPerformed

        String cod_pro = txtCodArti.getText();
        for (int i = 0; i < grillaInsumos.getRowCount(); i++) {
            if (grillaInsumos.getValueAt(i, 0).toString().equals(cod_pro)) {
                JOptionPane.showMessageDialog(rootPane, "El producto ya fue agregado anteriormente");
                return;
            }
        }

        Metodos.cargarTabla(grillaInsumos, new Object[]{
            txtCodArti.getText().trim(),
            txtArticuloDesc.getText().trim(),
            txtCantidadInsumo.getText().trim()
        });

        txtCodArti.setText("");
        txtArticuloDesc.setText("");
        txtTipoTrabajoDesc.setText("");
        txtCantidadInsumo.setText("");
        txtArticuloDesc.requestFocus();
    }//GEN-LAST:event_txtCantidadInsumoActionPerformed

    private void txtCantidadInsumoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCantidadInsumoKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCantidadInsumoKeyPressed

    private void grillaInsumosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_grillaInsumosMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_grillaInsumosMouseClicked

    public String dameFechaActual() {
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
                new TrabajoTerminado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnAnular;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnGrabar;
    private javax.swing.JButton btnSalir;
    public static com.toedter.calendar.JDateChooser fechaVencimientoG;
    public static javax.swing.JTable grillaInsumos;
    public static javax.swing.JTable grillaOrdenes;
    public static javax.swing.JTable grillaTerminados;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    public static javax.swing.JTextField txtArticuloDesc;
    public static javax.swing.JTextField txtCantidad;
    public static javax.swing.JTextField txtCantidadInsumo;
    public static javax.swing.JTextField txtClienteCodigo;
    public static javax.swing.JTextField txtClienteDescri;
    public static javax.swing.JTextField txtCod;
    public static javax.swing.JTextField txtCodArti;
    public static javax.swing.JTextField txtCodEquipo;
    public static javax.swing.JTextField txtCodTipoTrabajo;
    public static javax.swing.JTextField txtDescriServicioTermi;
    public static javax.swing.JTextField txtEmpleadoCod;
    public static javax.swing.JTextField txtEmpleadoDes;
    public static javax.swing.JTextField txtEquipo;
    public static com.toedter.calendar.JDateChooser txtFecha;
    public static javax.swing.JTextField txtObs;
    public static javax.swing.JTextField txtOrdenTrabajo;
    public static javax.swing.JTextField txtProblema;
    public static javax.swing.JTextField txtSucursal;
    public static javax.swing.JTextField txtTipoTrabajoDesc;
    // End of variables declaration//GEN-END:variables

}
