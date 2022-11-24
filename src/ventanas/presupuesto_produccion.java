package ventanas;

//import java.util.Date;
import Acceso.Menu;
import clases.Conexion;
import clases.Metodos;
import com.toedter.calendar.JCalendar;
import java.awt.event.KeyEvent;
import java.lang.String;
import javax.swing.*;
import java.sql.Connection;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

//para los reportes
import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.view.*;
import net.sf.jasperreports.engine.util.JRLoader;
import java.util.HashMap;
import java.net.URL;
import java.sql.Timestamp;
import java.util.Calendar;
import java.util.Date;
import static ventanas.pedido_de_compra.grilla;
import static ventanas.pedido_de_compra.idPersonal;
import static ventanas.pedido_de_compra.idSucursal;
import static ventanas.pedido_de_compra.idUsuario;
import static ventanas.pedido_de_compra.txtArti;
import static ventanas.pedido_de_compra.txtCod;
import static ventanas.pedido_de_compra.txtCodArti;
import static ventanas.pedido_de_compra.txtDescri;
import static ventanas.pedido_de_compra.txtFecha;

public class presupuesto_produccion extends javax.swing.JFrame {

    javax.swing.table.DefaultTableModel cursor;

    String operacion = "";
    String mensaje = "";
    String confirmar = "";

    public presupuesto_produccion() {
        initComponents();
        iniciarComponentes();
        pernom1.setText(Menu.empleado);
        codper.setText(Menu.idEmpleado);
        su1.setText(Menu.Sucursal);
        su2.setText(Menu.idSucursal);

    }

    private void iniciarComponentes() {
        num.setText(Metodos.siguienteCodigo("pre_cod", "presupuesto"));
        txtfecha.setDate(new JCalendar().getDate());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        cli_cod = new javax.swing.JTextField();
        cli = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        grilla = new javax.swing.JTable();
        num = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        nuevo = new javax.swing.JButton();
        anular = new javax.swing.JButton();
        cancelar = new javax.swing.JButton();
        grabar = new javax.swing.JButton();
        salir = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        cod_art = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        art_des = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        art_pre = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        art_cant = new javax.swing.JTextField();
        cliente = new javax.swing.JTextField();
        textotal = new javax.swing.JTextField();
        borrar = new javax.swing.JButton();
        txtfecha = new com.toedter.calendar.JDateChooser();
        jLabel12 = new javax.swing.JLabel();
        pernom1 = new javax.swing.JLabel();
        codper = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        su1 = new javax.swing.JLabel();
        su2 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        cod_pedido = new javax.swing.JTextField();

        jLabel5.setText("jLabel5");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("PRESUPUESTO");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setText("PRESUPUESTO");
        jLabel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel7.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        jLabel7.setText("Cliente");

        cli_cod.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        cli_cod.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        cli_cod.setEnabled(false);
        cli_cod.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cli_codKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cli_codKeyTyped(evt);
            }
        });

        cli.setText("...");
        cli.setEnabled(false);
        cli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cliActionPerformed(evt);
            }
        });

        grilla.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        grilla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CODIGO", "DESCRIPCION", "CANTIDAD", "PRECIO UNT.", "SUBTOTAL"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
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

        num.setBackground(new java.awt.Color(240, 240, 240));
        num.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        num.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "N°", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP));
        num.setEnabled(false);
        num.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numActionPerformed(evt);
            }
        });
        num.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                numKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                numKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                numKeyTyped(evt);
            }
        });
        num.addVetoableChangeListener(new java.beans.VetoableChangeListener() {
            public void vetoableChange(java.beans.PropertyChangeEvent evt)throws java.beans.PropertyVetoException {
                numVetoableChange(evt);
            }
        });

        jPanel6.setBackground(new java.awt.Color(0, 102, 102));
        jPanel6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 102, 102), null, null));

        nuevo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        nuevo.setForeground(new java.awt.Color(0, 102, 102));
        nuevo.setText("AGREGAR");
        nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevoActionPerformed(evt);
            }
        });

        anular.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        anular.setForeground(new java.awt.Color(0, 102, 102));
        anular.setText("ANULAR");
        anular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anularActionPerformed(evt);
            }
        });

        cancelar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        cancelar.setForeground(new java.awt.Color(0, 102, 102));
        cancelar.setText("CANCELAR");
        cancelar.setEnabled(false);
        cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarActionPerformed(evt);
            }
        });

        grabar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        grabar.setForeground(new java.awt.Color(0, 102, 102));
        grabar.setText("GRABAR");
        grabar.setEnabled(false);
        grabar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                grabarActionPerformed(evt);
            }
        });

        salir.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        salir.setForeground(new java.awt.Color(0, 102, 102));
        salir.setText("SALIR");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(nuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(anular, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(grabar, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(salir, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(anular, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(grabar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(salir, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jLabel8.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("COD");

        cod_art.setEditable(false);
        cod_art.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        cod_art.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        cod_art.setEnabled(false);
        cod_art.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cod_artActionPerformed(evt);
            }
        });
        cod_art.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cod_artKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cod_artKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cod_artKeyTyped(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("ARTICULO");

        art_des.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        art_des.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        art_des.setEnabled(false);
        art_des.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                art_desActionPerformed(evt);
            }
        });
        art_des.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                art_desKeyPressed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("PRECIO");

        art_pre.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        art_pre.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        art_pre.setEnabled(false);
        art_pre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                art_preActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("CANT.");

        art_cant.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        art_cant.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        art_cant.setEnabled(false);
        art_cant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                art_cantActionPerformed(evt);
            }
        });
        art_cant.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                art_cantKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                art_cantKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                art_cantKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cod_art, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(art_des, javax.swing.GroupLayout.DEFAULT_SIZE, 313, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(art_pre, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(art_cant, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel10)
                        .addComponent(art_pre, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(art_cant, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8)
                        .addComponent(cod_art, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel9)
                        .addComponent(art_des, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        cliente.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        cliente.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        cliente.setEnabled(false);
        cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clienteActionPerformed(evt);
            }
        });

        textotal.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        textotal.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED), "total"));
        textotal.setEnabled(false);
        textotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textotalActionPerformed(evt);
            }
        });
        textotal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                textotalKeyPressed(evt);
            }
        });

        borrar.setText("BORRAR ITEM");
        borrar.setEnabled(false);
        borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrarActionPerformed(evt);
            }
        });

        txtfecha.setDateFormatString("dd-MM-yyyy");
        txtfecha.setEnabled(false);
        txtfecha.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtfecha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtfechaMousePressed(evt);
            }
        });
        txtfecha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtfechaKeyPressed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel12.setText("Usuario:");

        pernom1.setText("nom");

        codper.setText("codper");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel13.setText("Sucursal:");

        su1.setText("nom");

        su2.setText("codper");

        jLabel14.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        jLabel14.setText("Pedido");

        cod_pedido.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        cod_pedido.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        cod_pedido.setEnabled(false);
        cod_pedido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cod_pedidoKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cod_pedidoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cod_pedidoKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(borrar, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(textotal, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtfecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(num, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cli_cod, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 457, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cli, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cod_pedido, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(102, 102, 102))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(336, 336, 336)
                        .addComponent(jLabel1)
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(su1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addGap(18, 18, 18)
                                .addComponent(pernom1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(codper, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(su2, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 881, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(182, 182, 182))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(codper)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(su2))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel12)
                                        .addComponent(pernom1))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel13)
                                        .addComponent(su1)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(cod_pedido, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(cli_cod, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cli, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(num, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtfecha, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(24, 24, 24)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(borrar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(textotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(949, 501));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cliActionPerformed
//new clientes().setVisible(true);
}//GEN-LAST:event_cliActionPerformed

    private void numActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numActionPerformed

}//GEN-LAST:event_numActionPerformed

    private void numKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_numKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_F2){
//            busPresupuestoProduccion.busqueda = "presupuesto";
//            new busPresupuestoProduccion().setVisible(true);
        }
}//GEN-LAST:event_numKeyPressed

    private void numKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_numKeyReleased

}//GEN-LAST:event_numKeyReleased

    private void numKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_numKeyTyped

}//GEN-LAST:event_numKeyTyped

    private void numVetoableChange(java.beans.PropertyChangeEvent evt)throws java.beans.PropertyVetoException {//GEN-FIRST:event_numVetoableChange

}//GEN-LAST:event_numVetoableChange

    private void nuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevoActionPerformed
        art_cant.setEnabled(false);
        cod_art.setEnabled(true);
        cod_art.requestFocus();
        txtfecha.setEnabled(true);
        cli_cod.setEnabled(true);
        cod_pedido.setEnabled(true);
        cod_pedido.requestFocus();
        cliente.setEnabled(true);
        grabar.setEnabled(true);
        operacion = "agregar";
        confirmar = "¿Desea grabar el nuevo registro?";
        mensaje = "Registro grabado con exito";


}//GEN-LAST:event_nuevoActionPerformed

    private void borrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrarActionPerformed
        Metodos.eliminarFila(grilla, grilla.getSelectedRow());

        art_cant.setEnabled(false);
        cod_art.setEnabled(true);
        cod_art.requestFocus();
        txtfecha.setEnabled(true);
        cli_cod.setEnabled(true);
        cli_cod.requestFocus();
        cliente.setEnabled(true);


}//GEN-LAST:event_borrarActionPerformed

    private void anularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anularActionPerformed

        num.setEnabled(true);
        num.setText("");
        num.requestFocus();
        grabar.setEnabled(true);
        operacion =  "anular";
        confirmar = "¿Desea anular este registro?";
        mensaje = "Registro anulado con exito";
}//GEN-LAST:event_anularActionPerformed

    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed

          
}//GEN-LAST:event_cancelarActionPerformed

    private void grabarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_grabarActionPerformed
        int respuesta = 5;

        respuesta = JOptionPane.showConfirmDialog(null, confirmar);

        Date fecha = txtfecha.getDate();
        if (respuesta == 0) {
            String sql = "";
            String sqldetalle = "";
            if (operacion.equals("agregar")) {
                sql = "INSERT INTO presupuesto(\n"
                        + " pre_hora, pre_fecha, pre_estado, "
                        + "usu_id, emp_id, sucur_id, \n"
                        + "cli_cod, cod_pedi_ven)\n"
                        + "VALUES ( "
                        + "'" + fecha.getHours() + ":" + fecha.getMinutes() + ":" + fecha.getSeconds() + "-04', "
                        + "'" + Metodos.dameFechaFormateadaSQL(fecha) + "', "
                        + "'ACTIVO', "
                        + "" + Menu.idUsuario + ", "
                        + "" + Menu.idEmpleado + ", "
                        + "" + Menu.idSucursal + ", "
                        + "" + cli_cod.getText() + ", "
                        + "" + cod_pedido.getText() + ");";

            }

            if (operacion.equals("anular")) {
                sql = "update presupuesto set"
                        + " pre_estado = 'ANULADO' "
                        + " where pre_cod = " + num.getText();
                
                num.setText("");
                num.setEnabled(false);
                grabar.setEnabled(false);
                

            }

            Conexion cn = new Conexion();
            try {
                cn.conectar();
                System.out.println(sql);
                cn.actualizar(sql);
                int cantidadFilas = grilla.getRowCount();
                String ultimo_id = Metodos.ultimoCodigo("pre_cod", "presupuesto");
                int iva5 = 0;
                int iva10 = 0;
                if (operacion.equals("agregar")) {
                    for (int i = 0; i < cantidadFilas; i++) {
                        iva10 = 0;
                        iva5 = 0;
                        if(Metodos.traerIvaProducto(grilla.getValueAt(i, 0).toString()).equals("5")){
                            iva5 = (int)(Integer.parseInt(grilla.getValueAt(i, 2).toString()) * 
                                    (Integer.parseInt(grilla.getValueAt(i, 3).toString())) * 0.21);
                        }else if(Metodos.traerIvaProducto(grilla.getValueAt(i, 0).toString()).equals("10")){
                            
                            iva10 = (int)(Integer.parseInt(grilla.getValueAt(i, 2).toString()) * 
                                    (Integer.parseInt(grilla.getValueAt(i, 3).toString())) * 0.11);
                        }
                        sqldetalle = "INSERT INTO detalle_presupuesto(\n"
                                + "pre_cod, pro_cod, cantidad, exenta, iva_5, iva_10, precio)\n"
                                + "VALUES ("
                                + "" + ultimo_id + ", "
                                + "" + grilla.getValueAt(i, 0).toString() + ", "
                                + "" + grilla.getValueAt(i, 2).toString() + ", "
                                + "0, "
                                + "" + iva5 + ", "
                                + "" + iva10 + ", "
                                + "" + grilla.getValueAt(i, 3).toString() + ");";

                        cn.actualizar(sqldetalle);

                    }
                }
                JOptionPane.showMessageDialog(null, mensaje);
                limpiar();
               
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(pedido_de_compra.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, ex.getMessage());
            } catch (SQLException ex) {
                Logger.getLogger(pedido_de_compra.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }
        }

}//GEN-LAST:event_grabarActionPerformed

    
    
    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        //        salir();
        dispose();
}//GEN-LAST:event_salirActionPerformed

    private void cod_artActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cod_artActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_cod_artActionPerformed

    private void cod_artKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cod_artKeyPressed


}//GEN-LAST:event_cod_artKeyPressed

    private void art_desActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_art_desActionPerformed
        // TODO add your handling code here:
        art_pre.requestFocus();
}//GEN-LAST:event_art_desActionPerformed

    private void art_preActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_art_preActionPerformed
        // TODO add your handling code here:
        art_cant.requestFocus();
}//GEN-LAST:event_art_preActionPerformed

    private void art_cantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_art_cantActionPerformed
        // TODO add your handling code here:
        int total = 0;
        for (int fila = 0; fila < grilla.getRowCount(); fila++) {
            String codigoEnRenglon = grilla.getValueAt(fila, 0).toString().trim();
            if (cod_art.getText().equals(codigoEnRenglon)) {
                grilla.setValueAt(Integer.parseInt(art_cant.getText()) + (Integer.parseInt(grilla.getValueAt(fila, 2).toString())), fila, 2);
                grilla.setValueAt(Integer.parseInt(grilla.getValueAt(fila, 2).toString()) * Integer.parseInt(art_pre.getText()), fila, 4);
                cod_art.setText("");
                art_cant.setText("");
                art_des.setText("");
                art_pre.setText("");
                art_des.requestFocus();

                for (int fila2 = 0; fila2 < grilla.getRowCount(); fila2++) {
                    total = total + Integer.parseInt((grilla.getValueAt(fila2, 4).toString()));

                }
                textotal.setText(Integer.toString(total));
                return;
                //JOptionPane.showMessageDialog(null, "ya hay");

            }

        }
        Metodos.cargarTabla(grilla, new Object[]{
            cod_art.getText().trim(),
            art_des.getText().trim(),
            art_cant.getText().trim(),
            art_pre.getText().trim(),
            Integer.parseInt(art_cant.getText()) * Integer.parseInt(art_pre.getText())
        });
        cod_art.setText("");
        art_cant.setText("");
        art_des.setText("");
        art_pre.setText("");
        art_des.requestFocus();

        textotal.setText(String.valueOf(Metodos.sumarColumna(grilla, 4)));

}//GEN-LAST:event_art_cantActionPerformed

    private void art_cantKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_art_cantKeyPressed

    }//GEN-LAST:event_art_cantKeyPressed

    private void clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clienteActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_clienteActionPerformed

    private void textotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textotalActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_textotalActionPerformed

    private void textotalKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textotalKeyPressed
        // TODO add your handling code here:
}//GEN-LAST:event_textotalKeyPressed

    private void art_cantKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_art_cantKeyTyped

    }//GEN-LAST:event_art_cantKeyTyped

    private void cli_codKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cli_codKeyTyped

}//GEN-LAST:event_cli_codKeyTyped

    private void art_cantKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_art_cantKeyReleased

    }//GEN-LAST:event_art_cantKeyReleased

    private void cod_artKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cod_artKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_cod_artKeyReleased

    private void txtfechaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtfechaMousePressed
        // TODO add your handling code here:
}//GEN-LAST:event_txtfechaMousePressed

    private void txtfechaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtfechaKeyPressed

}//GEN-LAST:event_txtfechaKeyPressed

    private void grillaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_grillaMouseClicked
        borrar.setEnabled(true);
    }//GEN-LAST:event_grillaMouseClicked

    private void cod_artKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cod_artKeyTyped

    }//GEN-LAST:event_cod_artKeyTyped

    private void cli_codKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cli_codKeyReleased
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_F2) {

            new clientes().setVisible(true);
            clientes.operacion = "presupuesto";
        }
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (cli_cod.getText().trim().isEmpty()) {
                JOptionPane.showMessageDialog(rootPane, "Debes buscar un cliente con (F2)");
                cli_cod.requestFocus();
                return;
            } else {
                art_des.requestFocus();
                art_des.setEnabled(true);
            }
        }
    }//GEN-LAST:event_cli_codKeyReleased

    private void art_desKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_art_desKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_F2) {

            new producto().setVisible(true);
            producto.operacion = "presupuesto";
        }
    }//GEN-LAST:event_art_desKeyPressed

    private void cod_pedidoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cod_pedidoKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_cod_pedidoKeyReleased

    private void cod_pedidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cod_pedidoKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_cod_pedidoKeyTyped

    private void cod_pedidoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cod_pedidoKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (cod_pedido.getText().trim().isEmpty()) {
                JOptionPane.showMessageDialog(rootPane, "Ingresa un codigo de pedido");
                return;
            }

            //datos de cliente
            Conexion cn = new Conexion();
            try {
                cn.conectar();
                ResultSet pedi = cn.consultar("SELECT\n"
                        + "c.cli_nomb ||' '||c.cli_apelli as nombre,\n"
                        + "c.cli_cod\n"
                        + "FROM pedido_venta  p \n"
                        + "NATURAL JOIN cliente c\n"
                        + "WHERE p.cod_pedi_ven = " + cod_pedido.getText().trim()); //order by ordena de menor a mayor, si se quiere de mayor a menor se le agrega desc al final

                if (pedi.isBeforeFirst()) {
                    while (pedi.next()) {
                        cli_cod.setText(String.valueOf(pedi.getInt("cli_cod")));
                        cliente.setText(pedi.getString("nombre"));
                    }
                } else {

                    JOptionPane.showMessageDialog(null, "No existe pedido");
                    return;
                }
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(clientes.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, "No se encuentra " + ex.getMessage());
            } catch (SQLException ex) {
                Logger.getLogger(clientes.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }

            //cargamos los detalles
            try {
                cn.conectar();
                ResultSet detalle = cn.consultar("SELECT\n"
                        + "dp.pro_cod,\n"
                        + "dp.cantidad,\n"
                        + "dp.ped_precio, \n"
                        + "pro.pro_desc\n"
                        + "FROM pedido_venta  p \n"
                        + "NATURAL JOIN  det_pedi_venta dp\n"
                        + "NATURAL JOIN producto pro\n"
                        + "WHERE p.cod_pedi_ven =" + cod_pedido.getText().trim()); //order by ordena de menor a mayor, si se quiere de mayor a menor se le agrega desc al final
                Metodos.limpiarTabla(grilla);
                if (detalle.isBeforeFirst()) {
                    while (detalle.next()) {
                        Metodos.cargarTabla(grilla, new Object[]{
                            detalle.getInt("pro_cod"),
                            detalle.getString("pro_desc"),
                            detalle.getInt("cantidad"),
                            detalle.getInt("ped_precio"),
                            (detalle.getInt("ped_precio") * detalle.getInt("cantidad"))
                        });
                    }
                } else {

                    JOptionPane.showMessageDialog(null, "No existe pedido");
                }
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(clientes.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, "No se encuentra " + ex.getMessage());
            } catch (SQLException ex) {
                Logger.getLogger(clientes.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }
            textotal.setText(String.valueOf(Metodos.sumarColumna(grilla, 4)));
            art_des.setEnabled(true);
            art_des.requestFocus();
            art_cant.setEnabled(true);
            art_pre.setEnabled(true);
        }
    }//GEN-LAST:event_cod_pedidoKeyPressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new presupuesto_produccion().setVisible(true);
            }
        });
    }

    private long Valororiginal = 0;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton anular;
    public static javax.swing.JTextField art_cant;
    public static javax.swing.JTextField art_des;
    public static javax.swing.JTextField art_pre;
    private javax.swing.JButton borrar;
    private javax.swing.JButton cancelar;
    private javax.swing.JButton cli;
    public static javax.swing.JTextField cli_cod;
    public static javax.swing.JTextField cliente;
    public static javax.swing.JTextField cod_art;
    public static javax.swing.JTextField cod_pedido;
    private javax.swing.JLabel codper;
    private javax.swing.JButton grabar;
    private javax.swing.JTable grilla;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton nuevo;
    public static javax.swing.JTextField num;
    private javax.swing.JLabel pernom1;
    private javax.swing.JButton salir;
    private javax.swing.JLabel su1;
    private javax.swing.JLabel su2;
    private javax.swing.JTextField textotal;
    private com.toedter.calendar.JDateChooser txtfecha;
    // End of variables declaration//GEN-END:variables

    private void limpiar(){
        iniciarComponentes();
        cod_pedido.setText("");
        cliente.setText("");
        cli_cod.setText("");
        Metodos.limpiarTabla(grilla);
        nuevo.setEnabled(true);
        anular.setEnabled(true);
        grabar.setEnabled(false);
        cancelar.setEnabled(false);
        salir.setEnabled(true);
    }
}
