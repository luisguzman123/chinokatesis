package informes;



import clases.Metodos;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.view.JasperViewer;

public class buscador_compras extends javax.swing.JFrame {

    public buscador_compras() {
        initComponents();

    }

    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jSeparator1 = new javax.swing.JSeparator();
        jbSalir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jbExportar = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jtDesde = new com.toedter.calendar.JDateChooser();
        jtHasta = new com.toedter.calendar.JDateChooser();
        jLabel9 = new javax.swing.JLabel();
        jrPorFecha = new javax.swing.JRadioButton();
        jrCodigo = new javax.swing.JRadioButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jtCodigo_desde = new javax.swing.JTextField();
        jtCodigo_hasta = new javax.swing.JTextField();
        jrEstado = new javax.swing.JRadioButton();
        jcEstado = new javax.swing.JComboBox();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();

        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jbSalir.setBackground(new java.awt.Color(69, 99, 123));
        jbSalir.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
        jbSalir.setForeground(new java.awt.Color(255, 255, 255));
        jbSalir.setText("SALIR");
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Calibri Light", 0, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Compras");

        jbExportar.setBackground(new java.awt.Color(69, 99, 123));
        jbExportar.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
        jbExportar.setForeground(new java.awt.Color(255, 255, 255));
        jbExportar.setText("EXPORTAR");
        jbExportar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbExportarActionPerformed(evt);
            }
        });

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 0)), "Rango de Fechas", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Monospaced", 0, 13), new java.awt.Color(51, 51, 51))); // NOI18N

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Desde:");

        jtDesde.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 0)));

        jtHasta.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 0)));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Hasta:");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtDesde, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtHasta, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jtHasta, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jtDesde, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5))
        );

        jrPorFecha.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup2.add(jrPorFecha);
        jrPorFecha.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jrPorFecha.setText("Por Fecha");
        jrPorFecha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jrPorFechaMouseReleased(evt);
            }
        });
        jrPorFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrPorFechaActionPerformed(evt);
            }
        });

        jrCodigo.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup2.add(jrCodigo);
        jrCodigo.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jrCodigo.setText("Por Código");
        jrCodigo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jrCodigoMouseReleased(evt);
            }
        });
        jrCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrCodigoActionPerformed(evt);
            }
        });

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 0)), "Rango de Fechas", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Monospaced", 0, 13), new java.awt.Color(51, 51, 51))); // NOI18N

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Desde:");

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Hasta:");

        jtCodigo_desde.setFont(new java.awt.Font("Calibri", 1, 13)); // NOI18N
        jtCodigo_desde.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtCodigo_desde.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 0)));
        jtCodigo_desde.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtCodigo_desdeKeyTyped(evt);
            }
        });

        jtCodigo_hasta.setFont(new java.awt.Font("Calibri", 1, 13)); // NOI18N
        jtCodigo_hasta.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtCodigo_hasta.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 0)));
        jtCodigo_hasta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtCodigo_hastaKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtCodigo_desde, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtCodigo_hasta, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtCodigo_hasta, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addComponent(jtCodigo_desde, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5))
        );

        jrEstado.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup2.add(jrEstado);
        jrEstado.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jrEstado.setText("Por Estado");
        jrEstado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jrEstadoMouseReleased(evt);
            }
        });
        jrEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrEstadoActionPerformed(evt);
            }
        });

        jcEstado.setFont(new java.awt.Font("Calibri", 1, 13)); // NOI18N
        jcEstado.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "ACTIVO", "ANULADO" }));
        jcEstado.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 0)));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pedido de compras", "Presupuesto de Proveedor", "Ordenes de compras", "Compras", "Ajustes de Inventario", "Notas de Créditos", "Notas de Débitos", "Notas de Remisión" }));
        jComboBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox1ItemStateChanged(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Calibri Light", 0, 24)); // NOI18N
        jLabel2.setText("Elija una opción");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 711, Short.MAX_VALUE)
                    .addComponent(jSeparator1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jrCodigo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jrPorFecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbExportar, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(68, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jrEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jcEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(1, 1, 1)
                            .addComponent(jrPorFecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jbExportar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(1, 1, 1)
                            .addComponent(jrCodigo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jcEstado)
                    .addComponent(jrEstado))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
            dispose();
    }//GEN-LAST:event_jbSalirActionPerformed

    private void jbExportarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbExportarActionPerformed
        if (jrPorFecha.isSelected() && jComboBox1.getSelectedIndex()==3) {
            Metodos.imprimirPorFecha("/src/reportes/reporteCompraPeriodo.jasper", jtDesde.getDate(), jtHasta.getDate());
        }else if (jrCodigo.isSelected() && jComboBox1.getSelectedIndex()==3) {
            Metodos.imprimirPorCodigo("/src/reportes/reporteCompraCodigo.jasper", Integer.parseInt(jtCodigo_desde.getText()), Integer.parseInt(jtCodigo_hasta.getText()));
        }else if (jrEstado.isSelected() && jComboBox1.getSelectedIndex()==3) {
            Metodos.imprimirPorEstado("/src/reportes/reporteCompraEstado.jasper", jcEstado.getSelectedItem().toString());
        }else if (jrPorFecha.isSelected() && jComboBox1.getSelectedIndex()==0) {
            Metodos.imprimirPorFecha("/src/reportes/reportePedidoCompraPeriodo.jasper", jtDesde.getDate(), jtHasta.getDate());
        }else if (jrCodigo.isSelected() && jComboBox1.getSelectedIndex()==0) {
            Metodos.imprimirPorCodigo("/src/reportes/reportePedidoCompraCodigo.jasper", Integer.parseInt(jtCodigo_desde.getText()), Integer.parseInt(jtCodigo_hasta.getText()));
        }else if (jrEstado.isSelected() && jComboBox1.getSelectedIndex()==0) {
            Metodos.imprimirPorEstado("/src/reportes/reportePedidoCompraEstado.jasper", jcEstado.getSelectedItem().toString());
        }else if (jrPorFecha.isSelected() && jComboBox1.getSelectedIndex()==1) {
             Metodos.imprimirPorFecha("/src/reportes/reportePresupuestoCompraPeriodo.jasper", jtDesde.getDate(), jtHasta.getDate());
        }else if (jrCodigo.isSelected() && jComboBox1.getSelectedIndex()==1) {
            Metodos.imprimirPorCodigo("/src/reportes/reportePresupuestoCompraCodigo.jasper", Integer.parseInt(jtCodigo_desde.getText()), Integer.parseInt(jtCodigo_hasta.getText())); 
        }else if (jrEstado.isSelected() && jComboBox1.getSelectedIndex()==1) {
            Metodos.imprimirPorEstado("/src/reportes/reportePresupuestoCompraEstado.jasper", jcEstado.getSelectedItem().toString());
        }else if (jrPorFecha.isSelected() && jComboBox1.getSelectedIndex()==2) {
            Metodos.imprimirPorFecha("/src/reportes/reporteOrdenCompraPeriodo.jasper", jtDesde.getDate(), jtHasta.getDate());
        }else if (jrCodigo.isSelected() && jComboBox1.getSelectedIndex()==2) {
            Metodos.imprimirPorCodigo("/src/reportes/reporteOrdenCompraCodigo.jasper", Integer.parseInt(jtCodigo_desde.getText()), Integer.parseInt(jtCodigo_hasta.getText()));
        }else if (jrEstado.isSelected() && jComboBox1.getSelectedIndex()==2) {
             Metodos.imprimirPorEstado("/src/reportes/reporteOrdenCompraEstado.jasper", jcEstado.getSelectedItem().toString());
        }else if (jrPorFecha.isSelected() && jComboBox1.getSelectedIndex()==4) {
            Metodos.imprimirPorFecha("/src/reportes/reporteAjusteInventarioPeriodo.jasper", jtDesde.getDate(), jtHasta.getDate());
        }else if (jrCodigo.isSelected() && jComboBox1.getSelectedIndex()==4) {
            Metodos.imprimirPorCodigo("/src/reportes/reporteAjusteInventarioCodigo.jasper", Integer.parseInt(jtCodigo_desde.getText()), Integer.parseInt(jtCodigo_hasta.getText()));
        }else if (jrEstado.isSelected() && jComboBox1.getSelectedIndex()==4) {
            Metodos.imprimirPorEstado("/src/reportes/reporteAjusteInventarioEstado.jasper", jcEstado.getSelectedItem().toString());
        }else if (jrPorFecha.isSelected() && jComboBox1.getSelectedIndex()==5) {
            Metodos.imprimirPorFecha("/src/reportes/reporteNotaCreditoPeriodo.jasper", jtDesde.getDate(), jtHasta.getDate());
        }else if (jrCodigo.isSelected() && jComboBox1.getSelectedIndex()==5) {
            Metodos.imprimirPorCodigo("/src/reportes/reporteNotaCreditoCodigo.jasper", Integer.parseInt(jtCodigo_desde.getText()), Integer.parseInt(jtCodigo_hasta.getText()));
        }else if (jrEstado.isSelected() && jComboBox1.getSelectedIndex()==5) {
            Metodos.imprimirPorEstado("/src/reportes/reporteNotaCreditoEstado.jasper", jcEstado.getSelectedItem().toString());
        }else if (jrPorFecha.isSelected() && jComboBox1.getSelectedIndex()==6) {
            Metodos.imprimirPorFecha("/src/reportes/reporteNotaDebitoPeriodo.jasper", jtDesde.getDate(), jtHasta.getDate());
        }else if (jrCodigo.isSelected() && jComboBox1.getSelectedIndex()==6) {
           Metodos.imprimirPorCodigo("/src/reportes/reporteNotaDebiitoCodigo.jasper", Integer.parseInt(jtCodigo_desde.getText()), Integer.parseInt(jtCodigo_hasta.getText())); 
        }else if (jrEstado.isSelected() && jComboBox1.getSelectedIndex()==6) {
            Metodos.imprimirPorEstado("/src/reportes/reporteNotaDebitoEstado.jasper", jcEstado.getSelectedItem().toString());
        }else if (jrPorFecha.isSelected() && jComboBox1.getSelectedIndex()==7) {
            Metodos.imprimirPorFecha("/src/reportes/reporteNotaRemisionCompraPeriodo.jasper", jtDesde.getDate(), jtHasta.getDate());
        }
    }//GEN-LAST:event_jbExportarActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        
    }//GEN-LAST:event_formWindowClosing

    private void jrPorFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrPorFechaActionPerformed
        
    }//GEN-LAST:event_jrPorFechaActionPerformed

    private void jrCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrCodigoActionPerformed
        
    }//GEN-LAST:event_jrCodigoActionPerformed

    private void jrEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrEstadoActionPerformed
        
    }//GEN-LAST:event_jrEstadoActionPerformed

    private void jtCodigo_desdeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtCodigo_desdeKeyTyped
 
    }//GEN-LAST:event_jtCodigo_desdeKeyTyped

    private void jtCodigo_hastaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtCodigo_hastaKeyTyped
  
    }//GEN-LAST:event_jtCodigo_hastaKeyTyped

    private void jrPorFechaMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jrPorFechaMouseReleased
        jtDesde.setEnabled(true);
        jtHasta.setEnabled(true);
        
        jtCodigo_desde.setEnabled(false);
        jtCodigo_hasta.setEnabled(false);
        jcEstado.setEnabled(false);
        
        jrCodigo.isSelected();
    }//GEN-LAST:event_jrPorFechaMouseReleased

    private void jrCodigoMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jrCodigoMouseReleased
        jtDesde.setEnabled(false);
        jtHasta.setEnabled(false);
        
        jtCodigo_desde.setEnabled(true);
        jtCodigo_hasta.setEnabled(true);
        jcEstado.setEnabled(false);
    }//GEN-LAST:event_jrCodigoMouseReleased

    private void jrEstadoMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jrEstadoMouseReleased
        jtDesde.setEnabled(false);
        jtHasta.setEnabled(false);
        
        jtCodigo_desde.setEnabled(false);
        jtCodigo_hasta.setEnabled(false);
        jcEstado.setEnabled(true);
    }//GEN-LAST:event_jrEstadoMouseReleased

    private void jComboBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox1ItemStateChanged
        if (jComboBox1.getSelectedIndex()==7) {
            jtCodigo_desde.setEnabled(false);
            jtCodigo_hasta.setEnabled(false);
            jcEstado.setEnabled(false);
        }
    }//GEN-LAST:event_jComboBox1ItemStateChanged
   
 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton jbExportar;
    private javax.swing.JButton jbSalir;
    private javax.swing.JComboBox jcEstado;
    private javax.swing.JRadioButton jrCodigo;
    private javax.swing.JRadioButton jrEstado;
    private javax.swing.JRadioButton jrPorFecha;
    private javax.swing.JTextField jtCodigo_desde;
    private javax.swing.JTextField jtCodigo_hasta;
    private com.toedter.calendar.JDateChooser jtDesde;
    private com.toedter.calendar.JDateChooser jtHasta;
    // End of variables declaration//GEN-END:variables
}
