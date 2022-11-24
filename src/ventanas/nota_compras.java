package ventanas;

import Acceso.Menu;
import clases.Conexion;
import clases.Metodos;
import com.toedter.calendar.JCalendar;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.*;

/**
 *
 * @author Nestor Salinas
 */
public class nota_compras extends javax.swing.JFrame {

    String mensaje = "";
    String operacion = "";

    public nota_compras() {
        initComponents();
        this.setLocationRelativeTo(null);
        iniciarComponentes();
    }

    private void iniciarComponentes() {
        num.setText(Metodos.siguienteCodigo("not_cred_id", "notas_de_ventas"));
        fecha.setText(Metodos.dameFechaFormateada(new JCalendar().getDate()));
        motivo_cbx.setEnabled(false);
        descuento_txt.setEnabled(false);
        descuento_txt.setEnabled(false);
        grabar.setEnabled(false);
        modificar.setEnabled(true);
        nuevo.setEnabled(true);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        num = new javax.swing.JTextField();
        fecha = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        num_fac = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        combotipo = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        id_venta_lbl = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        cod_proveedor = new javax.swing.JLabel();
        proveedortxt = new javax.swing.JLabel();
        cod_cli1 = new javax.swing.JLabel();
        asd = new javax.swing.JLabel();
        suc2 = new javax.swing.JLabel();
        motivo_cbx = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        deposito_lbl = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        txtTimbrado = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        to_iva5 = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        grava = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        totaliva = new javax.swing.JTextField();
        txttotal = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        nuevo = new javax.swing.JButton();
        modificar = new javax.swing.JButton();
        cancelar = new javax.swing.JButton();
        grabar = new javax.swing.JButton();
        salir = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        pernom = new javax.swing.JLabel();
        codper = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        su1 = new javax.swing.JLabel();
        su2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        grilla = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        descuento_txt = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("NOTAS CREDITO Y DEBITO");

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

        fecha.setBackground(new java.awt.Color(240, 240, 240));
        fecha.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        fecha.setBorder(javax.swing.BorderFactory.createTitledBorder("fecha"));
        fecha.setEnabled(false);
        fecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fechaActionPerformed(evt);
            }
        });
        fecha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                fechaKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                fechaKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                fechaKeyTyped(evt);
            }
        });
        fecha.addVetoableChangeListener(new java.beans.VetoableChangeListener() {
            public void vetoableChange(java.beans.PropertyChangeEvent evt)throws java.beans.PropertyVetoException {
                fechaVetoableChange(evt);
            }
        });

        jLabel29.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(0, 102, 102));
        jLabel29.setText("NOTAS DE COMPRAS");
        jLabel29.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jPanel2.setBackground(new java.awt.Color(0, 153, 153));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        num_fac.setBackground(new java.awt.Color(240, 240, 240));
        num_fac.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        num_fac.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        num_fac.setEnabled(false);
        num_fac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num_facActionPerformed(evt);
            }
        });
        num_fac.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                num_facKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                num_facKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                num_facKeyTyped(evt);
            }
        });

        jLabel30.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setText("FACTURA Nº");

        jLabel16.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("TIPO DOCUMENTO");

        combotipo.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        combotipo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "CREDITO", "DEBITO" }));
        combotipo.setEnabled(false);
        combotipo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                combotipoMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                combotipoMousePressed(evt);
            }
        });
        combotipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combotipoActionPerformed(evt);
            }
        });
        combotipo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                combotipoKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                combotipoKeyReleased(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ID");

        id_venta_lbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        id_venta_lbl.setForeground(new java.awt.Color(255, 255, 255));
        id_venta_lbl.setText("0");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(combotipo, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel30)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(num_fac, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(id_venta_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel16)
                        .addComponent(jLabel30)
                        .addComponent(combotipo, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(num_fac, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2)
                        .addComponent(id_venta_lbl)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(0, 153, 153));
        jPanel3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        cod_proveedor.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        cod_proveedor.setForeground(new java.awt.Color(255, 255, 255));
        cod_proveedor.setText("    ");

        proveedortxt.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        proveedortxt.setForeground(new java.awt.Color(255, 255, 255));
        proveedortxt.setText("  ");

        cod_cli1.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        cod_cli1.setForeground(new java.awt.Color(255, 255, 255));
        cod_cli1.setText("COD");

        asd.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        asd.setForeground(new java.awt.Color(255, 255, 255));
        asd.setText("Proveedor");

        suc2.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        suc2.setForeground(new java.awt.Color(255, 255, 255));
        suc2.setText("MOTIVO");

        motivo_cbx.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "DESCUENTO", "DEVOLUCION" }));
        motivo_cbx.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                motivo_cbxKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                motivo_cbxKeyReleased(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("DEPOSITO");

        deposito_lbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        deposito_lbl.setForeground(new java.awt.Color(255, 255, 255));
        deposito_lbl.setText("  ");

        jLabel31.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(255, 255, 255));
        jLabel31.setText("TIMBRADO Nº");

        txtTimbrado.setBackground(new java.awt.Color(240, 240, 240));
        txtTimbrado.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtTimbrado.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txtTimbrado.setEnabled(false);
        txtTimbrado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTimbradoActionPerformed(evt);
            }
        });
        txtTimbrado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtTimbradoKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTimbradoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTimbradoKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(suc2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(motivo_cbx, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(deposito_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(63, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(cod_cli1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cod_proveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(asd, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(proveedortxt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel31)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtTimbrado, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cod_proveedor)
                        .addComponent(proveedortxt)
                        .addComponent(cod_cli1)
                        .addComponent(asd))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel31)
                        .addComponent(txtTimbrado, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(suc2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(motivo_cbx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(deposito_lbl))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        to_iva5.setBackground(new java.awt.Color(240, 240, 240));
        to_iva5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        to_iva5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        to_iva5.setEnabled(false);
        to_iva5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                to_iva5ActionPerformed(evt);
            }
        });
        to_iva5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                to_iva5KeyPressed(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel21.setText("TOTAL DEL IVA(5%):");

        jLabel24.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel24.setText("(10%):");

        grava.setBackground(new java.awt.Color(240, 240, 240));
        grava.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        grava.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        grava.setEnabled(false);
        grava.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gravaActionPerformed(evt);
            }
        });
        grava.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                gravaKeyPressed(evt);
            }
        });

        jLabel25.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel25.setText("TOTAL IVA:");

        totaliva.setBackground(new java.awt.Color(240, 240, 240));
        totaliva.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        totaliva.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        totaliva.setEnabled(false);
        totaliva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalivaActionPerformed(evt);
            }
        });
        totaliva.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                totalivaKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jLabel21)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(to_iva5, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel24)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(grava, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel25)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(totaliva, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(grava, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24)
                    .addComponent(jLabel25)
                    .addComponent(to_iva5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(totaliva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(144, 144, 144))
        );

        txttotal.setBackground(new java.awt.Color(153, 153, 153));
        txttotal.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txttotal.setForeground(new java.awt.Color(51, 51, 51));
        txttotal.setToolTipText("total");
        txttotal.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "TOTAL", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("DigifaceWide", 0, 18))); // NOI18N
        txttotal.setEnabled(false);
        txttotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttotalActionPerformed(evt);
            }
        });

        jPanel6.setBackground(new java.awt.Color(0, 153, 153));
        jPanel6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 102, 102), null, null));

        nuevo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        nuevo.setForeground(new java.awt.Color(0, 102, 102));
        nuevo.setText("AGREGAR");
        nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevoActionPerformed(evt);
            }
        });

        modificar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        modificar.setForeground(new java.awt.Color(0, 102, 102));
        modificar.setText("ANULAR");
        modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarActionPerformed(evt);
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
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(nuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(modificar, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(grabar, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(salir, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(modificar, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(grabar, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(salir, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel14.setText("Usuario:");

        pernom.setText("nom");

        codper.setText("codper");

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel17.setText("Sucursal:");

        su1.setText("nom");

        su2.setText("codper");

        grilla.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        grilla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "COD", "ARTICULO", "CANTIDAD", "PRECIO", "EXENTA", "5%", "10%", "DEVOLUCION", "CONFIRMAR"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, true, true
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
        grilla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                grillaMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(grilla);

        jLabel1.setText("Descuento");

        descuento_txt.setBackground(new java.awt.Color(240, 240, 240));
        descuento_txt.setText("0");
        descuento_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                descuento_txtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(num, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel29)
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addGap(8, 8, 8))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jLabel17)))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(su1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pernom, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(49, 49, 49)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(codper, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(su2, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(descuento_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(42, 42, 42)
                            .addComponent(txttotal, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 831, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel29)
                        .addComponent(num, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17)
                            .addComponent(su1)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(codper)
                            .addComponent(pernom))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(su2)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txttotal, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(descuento_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(48, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(880, 731));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void numActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numActionPerformed

}//GEN-LAST:event_numActionPerformed

    private void numKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_numKeyPressed

}//GEN-LAST:event_numKeyPressed

    private void numKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_numKeyReleased

        if (evt.getKeyCode() == KeyEvent.VK_F2) {
            busNotas ventana = new busNotas();
            ventana.busqueda = "nota_compra";
            ventana.setVisible(true);
        }
}//GEN-LAST:event_numKeyReleased

    private void numKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_numKeyTyped

}//GEN-LAST:event_numKeyTyped

    private void numVetoableChange(java.beans.PropertyChangeEvent evt)throws java.beans.PropertyVetoException {//GEN-FIRST:event_numVetoableChange

}//GEN-LAST:event_numVetoableChange

    private void fechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fechaActionPerformed

}//GEN-LAST:event_fechaActionPerformed

    private void fechaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fechaKeyPressed
        // TODO add your handling code here:
}//GEN-LAST:event_fechaKeyPressed

    private void fechaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fechaKeyReleased
        // TODO add your handling code here:
}//GEN-LAST:event_fechaKeyReleased

    private void fechaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fechaKeyTyped
        // TODO add your handling code here:
}//GEN-LAST:event_fechaKeyTyped

    private void fechaVetoableChange(java.beans.PropertyChangeEvent evt)throws java.beans.PropertyVetoException {//GEN-FIRST:event_fechaVetoableChange
        // TODO add your handling code here:
}//GEN-LAST:event_fechaVetoableChange

    private void num_facActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num_facActionPerformed
        // TODO add your handling code here:
        String buscarCliente = "SELECT\n"
                + "c.pro_id,\n"
                + "c.pro_nom  proveedor,\n"
                + "v.compra_id "
                + "FROM compra v\n"
                + "JOIN proveedor c\n"
                + "ON c.pro_id = v.pro_id\n"
                + "WHERE v.nro_factura = '" + num_fac.getText().trim() + "'";
//        System.out.println(buscarCliente);
        Conexion cn = new Conexion();

        String cargarDetalles = "SELECT DISTINCT \n"
                + "dv.cod_materia,\n"
                + "p.cod_materia as materia,\n"
                + "dv.cantidad,\n"
                + "dv.monto,\n"
                + "dv.exenta,\n"
                + "dv.iva_5,\n"
                + "dv.iva_10,\n"
                + "CONCAT(dv.cod_depo, '-', d.depo_desc) as deposito "
                + "FROM compra v \n"
                + "JOIN compra_detalle dv\n"
                + "ON dv.compra_id = v.compra_id\n"
                + "JOIN materia_prima p \n"
                + "ON dv.cod_materia = p.cod_materia "
                + "JOIN deposito d "
                + "on d.cod_depo =  dv.cod_depo\n "
                + ""
                + "WHERE v.nro_factura LIKE '" + num_fac.getText().trim() + "' "
                + " ";
//        System.out.println(cargarDetalles);

        try {
            cn.conectar();
            ResultSet cliente = cn.consultar(buscarCliente);

            if (cliente.isBeforeFirst()) {
                while (cliente.next()) {
                    cod_proveedor.setText(cliente.getString("pro_id"));
                    proveedortxt.setText(cliente.getString("proveedor"));
                    id_venta_lbl.setText(cliente.getString("compra_id"));

                }
            }

            if (existeFactura()) {
                JOptionPane.showMessageDialog(rootPane, "La factura ya esta siendo utilizada.");
                limpiar();
                return;
            }
            int total = 0;
            ResultSet detalle = cn.consultar(cargarDetalles);
            if (detalle.isBeforeFirst()) {
                Metodos.limpiarTabla(grilla);
                while (detalle.next()) {
                    Metodos.cargarTabla(grilla, new Object[]{
                        detalle.getInt("cod_materia"),
                        detalle.getString("materia"),
                        detalle.getString("cantidad"),
                        detalle.getInt("monto"),
                        detalle.getInt("exenta"),
                        detalle.getInt("iva_5"),
                        detalle.getInt("iva_10"),
                        0,
                        false

                    });
                    total += detalle.getInt("cantidad")
                            * detalle.getInt("monto");
                    deposito_lbl.setText(detalle.getString("deposito"));

                }
            }
            txttotal.setText(String.valueOf(total));
            motivo_cbx.setEnabled(true);
            motivo_cbx.setPopupVisible(true);
            motivo_cbx.requestFocus();
            to_iva5.setText(String.valueOf((int) (Metodos.sumarColumna(grilla, 5) * 0.21)));
            grava.setText(String.valueOf((int) (Metodos.sumarColumna(grilla, 6) * 0.11)));
            totaliva.setText(String.valueOf(((int) (Metodos.sumarColumna(grilla, 6) * 0.11))
                    + ((int) (Metodos.sumarColumna(grilla, 5) * 0.21))));
//            limpiar();

        } catch (ClassNotFoundException ex) {

        } catch (SQLException ex) {
        }

        txtTimbrado.requestFocus();
}//GEN-LAST:event_num_facActionPerformed

    private void num_facKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_num_facKeyPressed
        // TODO add your handling code here:
}//GEN-LAST:event_num_facKeyPressed

    private void num_facKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_num_facKeyReleased
        // TODO add your handling code here:
}//GEN-LAST:event_num_facKeyReleased

    private void num_facKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_num_facKeyTyped


    }//GEN-LAST:event_num_facKeyTyped

    private void txttotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttotalActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_txttotalActionPerformed

    private void nuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevoActionPerformed
        num_fac.setEnabled(true);
        modificar.setEnabled(false);
        cancelar.setEnabled(true);
        salir.setEnabled(true);
        combotipo.setEnabled(true);
        combotipo.requestFocus();
        combotipo.setPopupVisible(true);
        grabar.setEnabled(true);
        mensaje = "Desea grabar la nota de compra?";
        operacion = "agregar";


    }//GEN-LAST:event_nuevoActionPerformed

    private void modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarActionPerformed

        operacion = "anular";
        mensaje = "Estas seguro de anular la la nota?";
        num.requestFocus();
        num.setEnabled(true);
        grabar.setEnabled(true);
        modificar.setEnabled(false);
        cancelar.setEnabled(true);
    }//GEN-LAST:event_modificarActionPerformed

    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed
        iniciarComponentes();
        limpiar();
}//GEN-LAST:event_cancelarActionPerformed

    private void grabarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_grabarActionPerformed

        if (JOptionPane.showConfirmDialog(rootPane, mensaje,
                "ATENCION", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            if (operacion.equals("agregar")) {

                if (motivo_cbx.getSelectedIndex() == 0) {
                    int des = Integer.parseInt(descuento_txt.getText());
                    if (des <= 0) {
                        JOptionPane.showMessageDialog(rootPane, "Descuento no valido");
                        return;
                    }
                }
                try {
                    String guardar_cabecera = "";
                    if (motivo_cbx.getSelectedIndex() == 0) {

                        guardar_cabecera = "INSERT INTO nota_de_compras(\n"
                                + " nota_tipo, nota_fecha, monto, nota_motivo,  compra_id, usu_id, \n"
                                + " sucur_id, emp_id, pro_id, estado, timbado)\n"
                                + "    VALUES ('"
                                + combotipo.getSelectedItem().toString() + "', '"
                                + Metodos.dameFechaFormateadaSQL(new JCalendar().getDate()) + "', "
                                + descuento_txt.getText() + ", '"
                                + motivo_cbx.getSelectedItem().toString() + "', "
                                + id_venta_lbl.getText() + ", "
                                + Menu.idUsuario + ", "
                                + Menu.idSucursal + ", "
                                + Menu.idEmpleado + ", "
                                + cod_proveedor.getText() + ", 'ACTIVO', "
                                + "'"+txtTimbrado.getText()+"');";
                    } else {
                        guardar_cabecera = "INSERT INTO nota_de_compras(\n"
                                + " nota_tipo, nota_fecha, monto, nota_motivo,  compra_id, usu_id, \n"
                                + "  sucur_id, emp_id, pro_id, estado)\n"
                                + "    VALUES ('"
                                + combotipo.getSelectedItem().toString() + "', '"
                                + Metodos.dameFechaFormateadaSQL(new JCalendar().getDate()) + "', "
                                + dameTotalDevolucion() + ", '"
                                + motivo_cbx.getSelectedItem() + "', "
                                + id_venta_lbl.getText() + ", "
                                + Menu.idUsuario + ", "
                                + Menu.idSucursal + ", "
                                + Menu.idEmpleado + ", "
                                + cod_proveedor.getText() + ", 'ACTIVO');";

                    }

                    Conexion cn = new Conexion();

                    cn.conectar();
                    cn.actualizar(guardar_cabecera);
                    String detalle = "";
                    //guardamos el detalle
                    for (int i = 0; i < grilla.getRowCount(); i++) {
                        if (Boolean.parseBoolean(grilla.getValueAt(i, 8).toString())) {

                            detalle = "INSERT INTO detalle_nc(\n"
                                    + "cod_nota, cod_depo, sucur_id, cod_materia, det_nota_cant, det_not_precio, \n"
                                    + "det_not_exenta, det_iva_5, det_iva_10)\n"
                                    + "VALUES ("
                                    + Metodos.ultimoCodigo("cod_nota", "nota_de_compras") + ", "
                                    + deposito_lbl.getText().split("-")[0] + ", "
                                    + Menu.idSucursal + ", "
                                    + grilla.getValueAt(i, 0).toString() + ", "
                                    + grilla.getValueAt(i, 2).toString() + ", "
                                    + grilla.getValueAt(i, 3).toString() + ", "
                                    + grilla.getValueAt(i, 4).toString() + ", "
                                    + grilla.getValueAt(i, 5).toString() + ", "
                                    + grilla.getValueAt(i, 6).toString() + ");";
                            cn.actualizar(detalle);
                        }
                    }

                    String actualizar_stock = "";
                    if (motivo_cbx.getSelectedIndex() == 1) {
                        for (int i = 0; i < grilla.getRowCount(); i++) {
                            if (Boolean.parseBoolean(grilla.getValueAt(i, 8).toString())) {
                                actualizar_stock = "UPDATE stock_materia_prima  \n"
                                        + "SET cantidad = cantidad - " + grilla.getValueAt(i, 7).toString() + "\n"
                                        + "WHERE cod_depo = " + deposito_lbl.getText().split("-")[0] + " \n"
                                        + "and sucur_id  = " + Menu.idSucursal + " \n"
                                        + "and cod_materia = " + grilla.getValueAt(i, 0).toString();
                                cn.actualizar(actualizar_stock);
                            }
                        }
                    }

                    JOptionPane.showMessageDialog(rootPane, "Guardado correctamente.");
                    limpiar();

                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(nota_compras.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(nota_compras.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            if (operacion.equals("anular")) {
                try {
                    String anulacion = "UPDATE nota_de_compras SET estado = 'ANULADO' WHERE  cod_nota = "+num.getText();
                    Conexion cn = new Conexion();

                    cn.conectar();
                    cn.actualizar(anulacion);
                    JOptionPane.showMessageDialog(rootPane, "Anulado correctamente");
                    iniciarComponentes();
                    limpiar();
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(nota_ventas.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(nota_ventas.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }


    }//GEN-LAST:event_grabarActionPerformed

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed

        salir();

}//GEN-LAST:event_salirActionPerformed

    private void grillaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_grillaMouseClicked

}//GEN-LAST:event_grillaMouseClicked

    private void combotipoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_combotipoMouseClicked
        // TODO add your handling code here:
}//GEN-LAST:event_combotipoMouseClicked

    private void combotipoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_combotipoMousePressed
        // TODO add your handling code here:
}//GEN-LAST:event_combotipoMousePressed

    private void combotipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combotipoActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_combotipoActionPerformed

    private void combotipoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_combotipoKeyPressed


}//GEN-LAST:event_combotipoKeyPressed

    private void totalivaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_totalivaKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_totalivaKeyPressed

    private void totalivaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalivaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_totalivaActionPerformed

    private void gravaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_gravaKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_gravaKeyPressed

    private void gravaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gravaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gravaActionPerformed

    private void to_iva5KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_to_iva5KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_to_iva5KeyPressed

    private void to_iva5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_to_iva5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_to_iva5ActionPerformed

    private void combotipoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_combotipoKeyReleased
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            num_fac.requestFocus();
        }
    }//GEN-LAST:event_combotipoKeyReleased

    private void motivo_cbxKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_motivo_cbxKeyReleased
        // TODO add your handling code here:

    }//GEN-LAST:event_motivo_cbxKeyReleased

    private void motivo_cbxKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_motivo_cbxKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (motivo_cbx.getSelectedIndex() == 0) {
                descuento_txt.requestFocus();
                descuento_txt.setEnabled(true);
            } else {
                descuento_txt.setEnabled(false);
            }
        }
    }//GEN-LAST:event_motivo_cbxKeyPressed

    private void descuento_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_descuento_txtActionPerformed
        if (Integer.parseInt(descuento_txt.getText()) > Integer.parseInt(txttotal.getText())) {
            JOptionPane.showMessageDialog(rootPane, "El descuento no puede ser mayor al total");
            descuento_txt.requestFocus();
            descuento_txt.selectAll();
            return;
        } else {
            grabar.doClick();
        }
    }//GEN-LAST:event_descuento_txtActionPerformed

    private void txtTimbradoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTimbradoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTimbradoActionPerformed

    private void txtTimbradoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTimbradoKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTimbradoKeyPressed

    private void txtTimbradoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTimbradoKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTimbradoKeyReleased

    private void txtTimbradoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTimbradoKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTimbradoKeyTyped

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new nota_compras().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel asd;
    private javax.swing.JButton cancelar;
    private javax.swing.JLabel cod_cli1;
    private javax.swing.JLabel cod_proveedor;
    public static javax.swing.JLabel codper;
    private javax.swing.JComboBox combotipo;
    private javax.swing.JLabel deposito_lbl;
    private javax.swing.JTextField descuento_txt;
    private javax.swing.JTextField fecha;
    private javax.swing.JButton grabar;
    private javax.swing.JTextField grava;
    private javax.swing.JTable grilla;
    private javax.swing.JLabel id_venta_lbl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton modificar;
    private javax.swing.JComboBox<String> motivo_cbx;
    private javax.swing.JButton nuevo;
    public static javax.swing.JTextField num;
    private javax.swing.JTextField num_fac;
    public static javax.swing.JLabel pernom;
    private javax.swing.JLabel proveedortxt;
    private javax.swing.JButton salir;
    public static javax.swing.JLabel su1;
    public static javax.swing.JLabel su2;
    private javax.swing.JLabel suc2;
    private javax.swing.JTextField to_iva5;
    private javax.swing.JTextField totaliva;
    private javax.swing.JTextField txtTimbrado;
    private javax.swing.JTextField txttotal;
    // End of variables declaration//GEN-END:variables

    private void salir() {
        int mensaje = JOptionPane.showConfirmDialog(this, "¿Deseas salir?", "Salida", JOptionPane.YES_NO_OPTION);

        if (mensaje == JOptionPane.YES_OPTION) {
            dispose();
        }
    }

    private int dameTotalDevolucion() {
        int total = 0;
        int cantidad;
        int precio;
        for (int i = 0; i < grilla.getRowCount(); i++) {
            if (Boolean.parseBoolean(grilla.getValueAt(i, 8).toString())) {
                if (!grilla.getValueAt(i, 7).toString().equals("0")) {
                    cantidad = Integer.parseInt(
                            grilla.getValueAt(i, 7).toString());
                    precio = Integer.parseInt(
                            grilla.getValueAt(i, 7).toString());
                    total += (cantidad * precio);

                }
            }
        }
        return total;
    }

    private void limpiar() {
        iniciarComponentes();
        combotipo.setSelectedIndex(0);
        motivo_cbx.setSelectedIndex(0);
        num_fac.setText("");
        id_venta_lbl.setText("0");
        cod_proveedor.setText("");
        proveedortxt.setText("");
        deposito_lbl.setText("");
        Metodos.limpiarTabla(grilla);
        to_iva5.setText("0");
        totaliva.setText("0");
        txttotal.setText("0");
        grava.setText("0");
        grabar.setEnabled(false);
        cancelar.setEnabled(false);
        salir.setEnabled(true);
        nuevo.setEnabled(true);
        modificar.setEnabled(true);

    }

    public boolean existeFactura() {
        Conexion cn = new Conexion();

        try {
            cn.conectar();
            ResultSet caja = cn.consultar("select *\n"
                    + "from nota_de_compras\n"
                    + "where estado = 'ACTIVO' AND  compra_id = " + id_venta_lbl.getText());
            if (caja.isBeforeFirst()) {
                return true;
            }

        } catch (ClassNotFoundException ex) {

        } catch (SQLException ex) {
        }
        return false;
    }

}
