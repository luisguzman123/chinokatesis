package ventanas;

import Acceso.Menu;
import clases.Conexion;
import clases.Metodos;
import com.toedter.calendar.JCalendar;
import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import java.lang.String;
import java.net.URL;
import javax.swing.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRResultSetDataSource;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

public class aper_cie_arqueo extends javax.swing.JFrame {

    private Connection conn;
    private ResultSet recur, rs;
    String Buscar;
    Statement snt;
    String operacion = "";
    String mensaje = "";
    String confirmacion = "";
    ventanas.arqueo_caja ventana_arquero = new arqueo_caja(null, rootPaneCheckingEnabled);

    public aper_cie_arqueo() {
        initComponents();
        this.setLocationRelativeTo(null);
        iniciarComponentes();
    }

    private void iniciarComponentes() {
        JCalendar fecha = new JCalendar();
        pernom1.setText(Menu.empleado);
        codper.setText(Menu.idUsuario);
        su1.setText(Menu.idSucursal);
        su2.setText(Menu.Sucursal);

        cargarListaCajasActivas();
        fecha_lbl.setText(Metodos.dameFechaFormateada(new JCalendar().getDate()));
        hora_lbl.setText(fecha.getDate().getHours() + ":" + fecha.getDate().getMinutes());
        cajaAbierta();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        nuevo = new javax.swing.JButton();
        grabar = new javax.swing.JButton();
        salir = new javax.swing.JButton();
        salir1 = new javax.swing.JButton();
        cancelar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        aper_monto = new javax.swing.JTextField();
        cie_efectivo = new javax.swing.JTextField();
        cie_tarjeta = new javax.swing.JTextField();
        cie_cheque = new javax.swing.JTextField();
        fecha_lbl = new javax.swing.JLabel();
        hora_lbl = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        num = new javax.swing.JLabel();
        combocaja = new javax.swing.JComboBox();
        jLabel12 = new javax.swing.JLabel();
        pernom1 = new javax.swing.JLabel();
        codper = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        su1 = new javax.swing.JLabel();
        su2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        arq_efectivo = new javax.swing.JTextField();
        arq_cheque = new javax.swing.JTextField();
        arq_tarjeta = new javax.swing.JTextField();
        generar_arquero_btn = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        total_general_lbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("GESTIONAR CAJA");

        jLabel1.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel1.setText("ARQUEO");

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        nuevo.setFont(new java.awt.Font("Tempus Sans ITC", 1, 11)); // NOI18N
        nuevo.setForeground(new java.awt.Color(0, 102, 102));
        nuevo.setText("ABRIR");
        nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevoActionPerformed(evt);
            }
        });

        grabar.setFont(new java.awt.Font("Tempus Sans ITC", 1, 11)); // NOI18N
        grabar.setForeground(new java.awt.Color(0, 102, 102));
        grabar.setText("GRABAR");
        grabar.setEnabled(false);
        grabar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                grabarActionPerformed(evt);
            }
        });

        salir.setFont(new java.awt.Font("Tempus Sans ITC", 1, 11)); // NOI18N
        salir.setForeground(new java.awt.Color(0, 102, 102));
        salir.setText("SALIR");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });

        salir1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 11)); // NOI18N
        salir1.setForeground(new java.awt.Color(0, 102, 102));
        salir1.setText("CERRAR");
        salir1.setEnabled(false);
        salir1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salir1ActionPerformed(evt);
            }
        });

        cancelar.setFont(new java.awt.Font("Tempus Sans ITC", 1, 11)); // NOI18N
        cancelar.setForeground(new java.awt.Color(0, 102, 102));
        cancelar.setText("CANCELAR");
        cancelar.setEnabled(false);
        cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(nuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(grabar, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(salir1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(salir, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(grabar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(salir1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(salir, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(0, 153, 153));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel9.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel9.setText("FECHA:");

        jLabel10.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel10.setText("HORA:");

        aper_monto.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        aper_monto.setBorder(javax.swing.BorderFactory.createTitledBorder("MONTO APERTURA"));
        aper_monto.setEnabled(false);
        aper_monto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aper_montoActionPerformed(evt);
            }
        });
        aper_monto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                aper_montoKeyTyped(evt);
            }
        });

        cie_efectivo.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        cie_efectivo.setBorder(javax.swing.BorderFactory.createTitledBorder("MONTO CIERRE EFECTIVO"));
        cie_efectivo.setEnabled(false);
        cie_efectivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cie_efectivoActionPerformed(evt);
            }
        });

        cie_tarjeta.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        cie_tarjeta.setBorder(javax.swing.BorderFactory.createTitledBorder("MONTO CIERRE TARJETA"));
        cie_tarjeta.setEnabled(false);
        cie_tarjeta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cie_tarjetaActionPerformed(evt);
            }
        });

        cie_cheque.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        cie_cheque.setBorder(javax.swing.BorderFactory.createTitledBorder("MONTO CIERRE CHEQUE"));
        cie_cheque.setEnabled(false);
        cie_cheque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cie_chequeActionPerformed(evt);
            }
        });

        fecha_lbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        fecha_lbl.setText("fecha");

        hora_lbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        hora_lbl.setText("hora");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(fecha_lbl, javax.swing.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE))
                    .addComponent(aper_monto)
                    .addComponent(cie_efectivo))
                .addGap(46, 46, 46)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(hora_lbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(92, 92, 92))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(cie_cheque, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE)
                            .addComponent(cie_tarjeta, javax.swing.GroupLayout.Alignment.LEADING))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(hora_lbl))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cie_tarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cie_cheque, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(fecha_lbl))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(aper_monto, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cie_efectivo, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(0, 153, 153));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel2.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel2.setText("Nº APER:");

        jLabel3.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel3.setText("CAJA");

        num.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        num.setText("NUMERO");

        combocaja.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        combocaja.setEnabled(false);
        combocaja.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                combocajaKeyPressed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel12.setText("Usuario:");

        pernom1.setText("nom");

        codper.setText("codper");

        jLabel13.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel13.setText("Sucursal:");

        su1.setText("nom");

        su2.setText("codper");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(num, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(combocaja, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(59, 59, 59)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pernom1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(su1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(su2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(codper))
                .addContainerGap(144, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(codper)
                        .addGap(7, 7, 7)
                        .addComponent(su2))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(pernom1)
                            .addComponent(jLabel12))
                        .addGap(7, 7, 7)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(su1)
                            .addComponent(jLabel13)))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(num))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(combocaja, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );

        jLabel6.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 102, 102));
        jLabel6.setText("   APERTURA CIERRE CAJA");

        jPanel4.setBackground(new java.awt.Color(0, 153, 153));
        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        arq_efectivo.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        arq_efectivo.setBorder(javax.swing.BorderFactory.createTitledBorder("MONTO EFECTIVO"));
        arq_efectivo.setEnabled(false);
        arq_efectivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                arq_efectivoActionPerformed(evt);
            }
        });

        arq_cheque.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        arq_cheque.setBorder(javax.swing.BorderFactory.createTitledBorder("MONTO CHEQUE"));
        arq_cheque.setEnabled(false);
        arq_cheque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                arq_chequeActionPerformed(evt);
            }
        });

        arq_tarjeta.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        arq_tarjeta.setBorder(javax.swing.BorderFactory.createTitledBorder("MONTO TARJETA"));
        arq_tarjeta.setEnabled(false);
        arq_tarjeta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                arq_tarjetaActionPerformed(evt);
            }
        });

        generar_arquero_btn.setText("MODIFICAR ARQUEO");
        generar_arquero_btn.setEnabled(false);
        generar_arquero_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generar_arquero_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(arq_efectivo, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                    .addComponent(arq_cheque)
                    .addComponent(arq_tarjeta)
                    .addComponent(generar_arquero_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(arq_efectivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(arq_cheque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(arq_tarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addComponent(generar_arquero_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel5.setBackground(new java.awt.Color(0, 51, 51));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Total General", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel5.setForeground(new java.awt.Color(0, 51, 51));

        total_general_lbl.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        total_general_lbl.setForeground(new java.awt.Color(255, 255, 255));
        total_general_lbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        total_general_lbl.setText("0");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(total_general_lbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(total_general_lbl, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(77, 77, 77)
                        .addComponent(jLabel1))
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(34, 34, 34))
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(933, 491));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void nuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevoActionPerformed
        combocaja.setEnabled(true);
        aper_monto.setEnabled(true);
        aper_monto.setText("0");
        combocaja.setPopupVisible(true);
        combocaja.requestFocus();
        grabar.setEnabled(true);
        operacion = "apertura";
        mensaje = "Estas seguro de realizar una apertura de caja?";
        confirmacion = "Apertura de caja creada correctamente";
    }//GEN-LAST:event_nuevoActionPerformed

    private void grabarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_grabarActionPerformed

        if (JOptionPane.showConfirmDialog(rootPane, mensaje, "ATENCION",
                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {

            if (operacion.equals("apertura")) {
                try {
                    if (combocaja.getSelectedIndex() == 0) {
                        JOptionPane.showMessageDialog(rootPane, "Debes selecciona una caja disponible");
                        combocaja.requestFocus();
                        combocaja.setPopupVisible(true);
                        return;
                    }

                    if (aper_monto.getText().trim().isEmpty()) {
                        JOptionPane.showMessageDialog(rootPane, "Debes ingresar un monto de apertura");
                        aper_monto.requestFocus();
                        return;
                    }

                    Date fecha = new JCalendar().getDate();
                    String insersion = "INSERT INTO aper_cierre(\n"
                            + " cod_caja, sucur_id, tipo, aper_fecha, aper_hora, \n"
                            + "aper_monto, cie_efec, cie_tarj, cie_cheque, \n"
                            + "estado, usu_id, emp_id)\n"
                            + "VALUES ( "
                            + combocaja.getSelectedItem().toString().split("-")[0] + ", "
                            + su1.getText() + ", "
                            + "'APERTURA', '"
                            + Metodos.dameFechaFormateadaSQL(fecha) + "', '"
                            + fecha.getHours() + ":" + fecha.getMinutes() + ":00" + "', \n"
                            + aper_monto.getText() + ", "
                            + "0, "
                            + "0, "
                            + "0, \n"
                            + "'ACTIVO', "
                            + codper.getText() + ", "
                            + Menu.idEmpleado + ");";

                    Conexion cn = new Conexion();

                    cn.conectar();
                    cn.actualizar(insersion);

                    String caja_utilizada = "UPDATE caja set caja_estado = 'OCUPADO'  WHERE cod_caja = "
                            + combocaja.getSelectedItem().toString().split("-")[0];
                    cn.actualizar(caja_utilizada);
                    JOptionPane.showMessageDialog(rootPane, "Caja abierta correctamente");
                    cajaAbierta();

                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(aper_cie_arqueo.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(aper_cie_arqueo.class.getName()).log(Level.SEVERE, null, ex);
                }

            }

            if (operacion.equals("cierre")) {
                if (!ventana_arquero.getArqueo_lbl().getText().equals(ventana_arquero.getTotal_efectivo_lbl().getText())) {
                    JOptionPane.showMessageDialog(rootPane, "El arqueo no coincide.");
                    return;
                }
                try {
                    Date fecha = new Date();
                    //guardamos el arqueo cabecera
                    String arqueo = "INSERT INTO arqueo( cod_aper_cierre, cod_caja, sucur_id, fecha, hora, \n"
                            + "monto_efectivo, monto_tarjeta, monto_cheque, usu_id, emp_id)\n"
                            + "VALUES ("
                            + Metodos.cajaAbierta() + ", "
                            + Metodos.dameCodcaja() + ", "
                            + Menu.idSucursal + ", '"
                            + Metodos.dameFechaFormateadaSQL(fecha) + "', '"
                            + fecha.getHours() + ":" + fecha.getMinutes() + ":00" + "', "
                            + arq_efectivo.getText() + ", "
                            + arq_tarjeta.getText() + ", "
                            + arq_cheque.getText() + ", "
                            + Menu.idUsuario + ", "
                            + Menu.idEmpleado + ");";

                    Conexion cn = new Conexion();

                    cn.conectar();
                    cn.actualizar(arqueo);
                    String nro_arqueo = Metodos.ultimoCodigo("nro_arqueo", "arqueo");
                    int cod_aper_cierre = Metodos.cajaAbierta();
                    int cod_caja = Metodos.dameCodcaja();
                    JTable tabla_arque = ventana_arquero.getGrilla();
                    String detalle_arqueo = "";
                    for (int i = 0; i < tabla_arque.getRowCount(); i++) {
                        detalle_arqueo = "INSERT INTO arqueo_detalle(\n"
                                + "nro_arqueo, cod_aper_cierre, cod_caja, sucur_id, cod_deno, cantidad)\n"
                                + "VALUES ("
                                + nro_arqueo + ", "
                                + cod_aper_cierre + ", "
                                + cod_caja + ", "
                                + Menu.idSucursal + ", "
                                + tabla_arque.getValueAt(i, 0).toString().split("-")[0] + ", "
                                + tabla_arque.getValueAt(i, 1).toString() + ");";
                        cn.actualizar(detalle_arqueo);
                    }
                    //liberamos la caja
                    String caja_actualizar = "UPDATE caja \n"
                            + "SET caja_estado = 'ACTIVO' \n"
                            + "WHERE cod_caja = " + cod_caja;

                    cn.actualizar(caja_actualizar);
                    //recaudaciones
                    String recaudaciones = "INSERT INTO recaudaciones(\n"
                            + " monto_efectivo, monto_cheque, fecha, estado, cod_aper_cierre, \n"
                            + "cod_caja, sucur_id, usu_id, emp_id)\n"
                            + " VALUES ("
                            + arq_efectivo.getText()+", "
                            + arq_cheque.getText()+", '"
                            + Metodos.dameFechaFormateadaSQL(fecha)+"', "
                            + "'ACTIVO', "
                            + cod_aper_cierre+", "
                            + cod_caja+", "
                            + Menu.idSucursal+", "
                            + Menu.idUsuario+", "
                            + Menu.idEmpleado+");";
                    cn.actualizar(recaudaciones);

                    //cerramos la caja
                    String apertura_actualizar = "UPDATE aper_cierre \n"
                            + "SET \n"
                            + "cierre_fecha = '" + Metodos.dameFechaFormateadaSQL(fecha) + "',\n"
                            + "cierre_hora = '" + fecha.getHours() + ":" + fecha.getMinutes() + ":00" + "',\n"
                            + "cie_efec = " + arq_efectivo.getText() + ",\n"
                            + "cie_tarj = " + arq_tarjeta.getText() + ",\n"
                            + "cie_cheque = " + arq_cheque.getText() + ",\n"
                            + "tipo = 'CERRADO'\n"
                            + "WHERE cod_aper_cierre = " + cod_aper_cierre;
                    cn.actualizar(apertura_actualizar);
                    JOptionPane.showMessageDialog(rootPane, "Caja cerrada correctamente");
                    cajaAbierta();
                    dispose();
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(aper_cie_arqueo.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(aper_cie_arqueo.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        }


    }//GEN-LAST:event_grabarActionPerformed

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed

}//GEN-LAST:event_salirActionPerformed

    private void aper_montoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aper_montoActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_aper_montoActionPerformed

    private void generar_arquero_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generar_arquero_btnActionPerformed

        ventana_arquero.getTotal_efectivo_lbl().setText(cie_efectivo.getText());
        ventana_arquero.setVisible(true);

}//GEN-LAST:event_generar_arquero_btnActionPerformed

    private void salir1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salir1ActionPerformed

        grabar.setEnabled(true);
        arq_cheque.setText(cie_cheque.getText());
        arq_efectivo.setText(cie_efectivo.getText());
        arq_tarjeta.setText(cie_tarjeta.getText());
        generar_arquero_btn.setEnabled(true);
        arq_cheque.setEnabled(true);
        arq_efectivo.setEnabled(true);
        arq_tarjeta.setEnabled(true);
        salir1.setEnabled(false);
        operacion = "cierre";
        mensaje = "Estas seguro de cerrar la caja?";

        if (JOptionPane.showConfirmDialog(rootPane, "Deseas realizar el arqueo de caja?", "ATENCION",
                JOptionPane.YES_NO_OPTION)
                == JOptionPane.YES_OPTION) {
            ventana_arquero.getTotal_efectivo_lbl().setText(cie_efectivo.getText());
            ventana_arquero.setVisible(true);
        }


}//GEN-LAST:event_salir1ActionPerformed

    private void cie_efectivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cie_efectivoActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_cie_efectivoActionPerformed

    private void combocajaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_combocajaKeyPressed
        if (evt.getKeyCode() == 10) {
            this.aper_monto.setEnabled(true);
            this.aper_monto.requestFocus();
            this.aper_monto.setText("");
        }
}//GEN-LAST:event_combocajaKeyPressed

    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed

}//GEN-LAST:event_cancelarActionPerformed

    private void aper_montoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_aper_montoKeyTyped
        char caracter = evt.getKeyChar();
        int k = (int) evt.getKeyChar();
        if (((caracter < '0') || (caracter > '9')) && (k != 10) && (caracter != KeyEvent.VK_BACK_SPACE)) {
            JOptionPane.showMessageDialog(null, "No Puede Ingresar Letras");
            evt.consume();
        }
        if (aper_monto.getText().length() == 10) {
            evt.consume();
        } else {
            if (k == 10) {
                if (aper_monto.getText().equals("") == false) {

                    grabar.setEnabled(true);
                    grabar.requestFocus();

                } else {
                    JOptionPane.showMessageDialog(null, "No Puede dejar El Campo Vacio");
                    evt.consume();

                }

            }
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_aper_montoKeyTyped

    private void cie_tarjetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cie_tarjetaActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_cie_tarjetaActionPerformed

    private void cie_chequeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cie_chequeActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_cie_chequeActionPerformed

    private void arq_efectivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_arq_efectivoActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_arq_efectivoActionPerformed

    private void arq_chequeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_arq_chequeActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_arq_chequeActionPerformed

    private void arq_tarjetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_arq_tarjetaActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_arq_tarjetaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new aper_cie_arqueo().setVisible(true);
            }
        });
    }

    public static String pasarnumapertura() {
        return numaper;
    }
    private static String numaper;

    public String grabar_arqueo = "";
    public String montoapertura = "";
    public ResultSet resu;
    public String num_apertura = "";
    public String opcion = "";
    public int monto_efectivototal = 0, monto_tarjeta_total = 0, monto_cheque_total = 0, monto_efectivo_arqueo = 0, monto_tarjeta_arqueo = 0, monto_cheque_arqueo = 0, num_arqueo = 0;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField aper_monto;
    private javax.swing.JTextField arq_cheque;
    private javax.swing.JTextField arq_efectivo;
    private javax.swing.JTextField arq_tarjeta;
    private javax.swing.JButton cancelar;
    private javax.swing.JTextField cie_cheque;
    private javax.swing.JTextField cie_efectivo;
    private javax.swing.JTextField cie_tarjeta;
    private javax.swing.JLabel codper;
    private javax.swing.JComboBox combocaja;
    private javax.swing.JLabel fecha_lbl;
    private javax.swing.JButton generar_arquero_btn;
    javax.swing.JButton grabar;
    private javax.swing.JLabel hora_lbl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    javax.swing.JButton nuevo;
    private javax.swing.JLabel num;
    private javax.swing.JLabel pernom1;
    private javax.swing.JButton salir;
    private javax.swing.JButton salir1;
    private javax.swing.JLabel su1;
    private javax.swing.JLabel su2;
    private javax.swing.JLabel total_general_lbl;
    // End of variables declaration//GEN-END:variables

    //funciones de la clase venntana
    private void cargarListaCajasActivas() {
        combocaja.removeAllItems();
        Conexion cn = new Conexion();

        try {
            cn.conectar();
            ResultSet deposito = cn.consultar("SELECT\n"
                    + "cod_caja,\n"
                    + "caja_desc\n"
                    + "FROM caja\n"
                    + "where caja_estado = 'ACTIVO'");

            combocaja.addItem("Selecciona una caja");
            if (deposito.isBeforeFirst()) {
                while (deposito.next()) {
                    combocaja.addItem(deposito.getInt("cod_caja") + "-"
                            + deposito.getString("caja_desc").trim());
                }
            }
        } catch (ClassNotFoundException ex) {

            Logger.getLogger(orden_produccion.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(orden_produccion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void cajaAbierta() {
        Conexion cn = new Conexion();

        try {
            cn.conectar();
            ResultSet caja = cn.consultar("SELECT\n"
                    + "*\n"
                    + "FROM aper_cierre ac\n"
                    + "WHERE ac.cierre_fecha is null OR ac.cierre_fecha::CHARACTER = '' \n"
                    + "AND ac.usu_id = " + codper.getText() + "\n"
                    + "and ac.sucur_id = " + su1.getText() + "\n"
                    + "and ac.tipo = 'ABIERTO'\n"
                    + "AND ac.estado = 'ACTIVO'\n"
                    + "LIMIT 1");

            //en el caso que exista una caja abierta
            if (caja.isBeforeFirst()) {
                while (caja.next()) {
                    num.setText(String.valueOf(caja.getInt("cod_aper_cierre")));
                    fecha_lbl.setText(Metodos.dameFechaFormateadaSQL(caja.getDate("aper_fecha")));
                    hora_lbl.setText(caja.getTime("aper_hora").toString());
                    aper_monto.setText(String.valueOf(caja.getInt("aper_monto")));
                    cie_cheque.setText(String.valueOf(caja.getInt("cie_cheque")));
                    cie_efectivo.setText(String.valueOf(caja.getInt("cie_efec")));
                    cie_tarjeta.setText(String.valueOf(caja.getInt("cie_tarj")));

                }

                nuevo.setEnabled(false);
                grabar.setEnabled(false);
                salir1.setEnabled(true);
                dameEfectivo();
                dameTarjeta();
                dameCheque();
                sumarTotales();
            } else {
                //en el caso que no esta abierta
                nuevo.setEnabled(true);
                salir1.setEnabled(false);

            }
        } catch (ClassNotFoundException ex) {

            Logger.getLogger(orden_produccion.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(orden_produccion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void dameEfectivo() {
        Conexion cn = new Conexion();

        try {
            cn.conectar();
            ResultSet caja = cn.consultar("SELECT \n"
                    + "sum(dc.saldo) as efectivo\n"
                    + "FROM cobranzas c \n"
                    + "JOIN detalle_cobranzas dc \n"
                    + "ON dc.cobro_id = c.cobro_id\n"
                    + "WHERE c.cod_aper_cierre = " + Metodos.cajaAbierta() + " \n"
                    + "and c.co_estado = 'ACTIVO'");

            //en el caso que exista una caja abierta
            if (caja.isBeforeFirst()) {
                while (caja.next()) {
                    cie_efectivo.setText(String.valueOf(caja.getInt("efectivo")));

                }

                sumarTotales();
            }
        } catch (ClassNotFoundException ex) {

            Logger.getLogger(orden_produccion.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(orden_produccion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void dameTarjeta() {
        Conexion cn = new Conexion();

        try {
            cn.conectar();
            ResultSet caja = cn.consultar("SELECT \n"
                    + "sum(dc.co_monto) as tarjeta\n"
                    + "FROM cobranzas c \n"
                    + "JOIN cobro_tarjeta dc \n"
                    + "ON dc.cobro_id = c.cobro_id\n"
                    + "WHERE c.cod_aper_cierre = " + Metodos.cajaAbierta() + " \n"
                    + "and c.co_estado = 'ACTIVO'");

            //en el caso que exista una caja abierta
            if (caja.isBeforeFirst()) {
                while (caja.next()) {
                    cie_tarjeta.setText(String.valueOf(caja.getInt("tarjeta")));

                }

                sumarTotales();
            }
        } catch (ClassNotFoundException ex) {

            Logger.getLogger(orden_produccion.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(orden_produccion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void dameCheque() {
        Conexion cn = new Conexion();

        try {
            cn.conectar();
            ResultSet caja = cn.consultar("SELECT \n"
                    + "sum(dc.co_monto) as cheque\n"
                    + "FROM cobranzas c \n"
                    + "JOIN cobro_cheque dc \n"
                    + "ON dc.cobro_id = c.cobro_id\n"
                    + "WHERE c.cod_aper_cierre = " + Metodos.cajaAbierta() + " \n"
                    + "and c.co_estado = 'ACTIVO'");

            //en el caso que exista una caja abierta
            if (caja.isBeforeFirst()) {
                while (caja.next()) {
                    cie_cheque.setText(String.valueOf(caja.getInt("cheque")));

                }

                sumarTotales();
            }
        } catch (ClassNotFoundException ex) {

            Logger.getLogger(orden_produccion.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(orden_produccion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void sumarTotales() {
        int efectivo = Integer.parseInt(cie_efectivo.getText());
        int cheque = Integer.parseInt(cie_cheque.getText());
        int tarjeta = Integer.parseInt(cie_tarjeta.getText());
        int apertura = Integer.parseInt(aper_monto.getText());

        total_general_lbl.setText(String.valueOf(efectivo + cheque + tarjeta + apertura));
    }

}
