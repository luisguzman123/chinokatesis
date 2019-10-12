package ventanas;

import clases.Conexion;
import clases.Metodos;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Nestors
 */
public class etapasDeProduccion extends javax.swing.JFrame {

    String operacion = "";
    String confirmar = "";
    String mensaje = "";
    boolean duplicado;

    public static String busqueda = "";

    public etapasDeProduccion() {
        initComponents();
        btnCancelar.doClick();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtBuscador = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        grillaBanco = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnGrabar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        btnReporte = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        estado_lst = new javax.swing.JComboBox<>();
        ultimo_cbx = new javax.swing.JCheckBox();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tekton Pro Cond", 0, 24)); // NOI18N
        jLabel1.setText("Etapas de Produccion");

        jLabel2.setText("Nombre");

        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });

        txtBuscador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscadorActionPerformed(evt);
            }
        });

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        grillaBanco.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Código", "Nombre", "Estado", "Ultimo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        grillaBanco.getTableHeader().setReorderingAllowed(false);
        grillaBanco.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                grillaBancoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(grillaBanco);
        if (grillaBanco.getColumnModel().getColumnCount() > 0) {
            grillaBanco.getColumnModel().getColumn(0).setPreferredWidth(30);
            grillaBanco.getColumnModel().getColumn(1).setPreferredWidth(250);
            grillaBanco.getColumnModel().getColumn(2).setPreferredWidth(50);
            grillaBanco.getColumnModel().getColumn(3).setPreferredWidth(30);
        }

        jLabel3.setText("Código");

        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
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

        btnReporte.setText("Reporte");
        btnReporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReporteActionPerformed(evt);
            }
        });

        jLabel4.setText("Estado");

        estado_lst.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ACTIVO", "BAJA" }));

        ultimo_cbx.setText("Último");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnBuscar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtBuscador))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnReporte))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(jLabel2)
                                            .addGap(34, 34, 34))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel4)
                                            .addGap(38, 38, 38)))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(estado_lst, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(ultimo_cbx)))))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnAgregar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnEditar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnEliminar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnGrabar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnCancelar)
                                .addGap(4, 4, 4)
                                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(estado_lst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ultimo_cbx))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBuscador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnReporte)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEliminar)
                    .addComponent(btnGrabar)
                    .addComponent(btnCancelar)
                    .addComponent(btnSalir)
                    .addComponent(btnEditar)
                    .addComponent(btnAgregar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        txtNombre.setEditable(true);
        txtNombre.requestFocus();
        txtBuscador.setEditable(false);
        txtCodigo.setEditable(false);
        btnAgregar.setEnabled(false);
        btnEditar.setEnabled(false);
        btnEliminar.setEnabled(false);
        btnSalir.setEnabled(false);
        btnReporte.setEnabled(false);
        btnBuscar.setEnabled(false);

        btnGrabar.setEnabled(true);
        btnCancelar.setEnabled(true);

        txtCodigo.setText(Metodos.siguienteCodigo("cod_etapas", "etapas_produccion"));

        operacion = "agregar";
        confirmar = "¿Desea grabar el nuevo registro?";
        mensaje = "Registro grabado con exito";
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void txtBuscadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscadorActionPerformed
        btnBuscar.doClick();
    }//GEN-LAST:event_txtBuscadorActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        txtBuscador.setEditable(true);
        txtBuscador.requestFocus();
        txtCodigo.setEditable(false);
        btnAgregar.setEnabled(false);
        btnEditar.setEnabled(false);
        btnEliminar.setEnabled(false);
        btnSalir.setEnabled(false);
        btnReporte.setEnabled(false);
        btnBuscar.setEnabled(true);

        txtNombre.setEditable(true);
        btnGrabar.setEnabled(true);
        btnCancelar.setEnabled(true);

        operacion = "modificar";
        confirmar = "Desea modificar el registro";
        mensaje = "Registro modificado con exito";
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        txtBuscador.setEditable(true);
        txtBuscador.requestFocus();
        txtCodigo.setEditable(false);
        btnAgregar.setEnabled(false);
        btnEditar.setEnabled(false);
        btnEliminar.setEnabled(false);
        btnSalir.setEnabled(false);
        btnReporte.setEnabled(false);
        btnBuscar.setEnabled(true);

        txtNombre.setEditable(true);
        btnGrabar.setEnabled(true);
        btnCancelar.setEnabled(true);

        operacion = "borrar";
        confirmar = "Desea borrar el registro";
        mensaje = "Registro eliminado con exito";
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed

        txtNombre.setEditable(false);

        txtBuscador.setEditable(true);
        txtCodigo.setEditable(false);
        btnAgregar.setEnabled(true);
        btnEditar.setEnabled(true);
        btnEliminar.setEnabled(true);
        btnSalir.setEnabled(true);
        btnReporte.setEnabled(true);
        btnBuscar.setEnabled(true);

        btnGrabar.setEnabled(false);
        btnCancelar.setEnabled(false);

        txtBuscador.setText("");
        txtNombre.setText("");

        txtCodigo.setText("");

        operacion = "";
        confirmar = "";
        mensaje = "";

        getDatos();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnGrabarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGrabarActionPerformed
        int respuesta = 5;
        String update = "";
        duplicado = Metodos.evitarDuplicado("etapas_produccion", "eta_desc", txtNombre.getText().trim(), "cod_etapas", txtCodigo.getText());
        if (duplicado && (!operacion.equals("borrar"))) {
            JOptionPane.showMessageDialog(null, "Este registro ya esta en la base de datos");
            btnCancelar.doClick();
        } else {
            respuesta = JOptionPane.showConfirmDialog(null, confirmar);
        }
        if (respuesta == 0) {
            String sql = "";
            if (operacion.equals("agregar")) {
                if(ultimo_cbx.isSelected()){
                    update = "UPDATE etapas_produccion set orden_etapas = '' ";
                    
                }
                sql = "Insert into etapas_produccion (eta_desc, estado, orden_etapas) "
                        + "values ('" + txtNombre.getText().toUpperCase().trim() + "', 'ACTIVO', '"+
                        ((ultimo_cbx.isSelected()) ?  "ULTIMO" : "")+"')";
            }

            if (operacion.equals("modificar")) {
                if(ultimo_cbx.isSelected()){
                    update = "UPDATE etapas_produccion set orden_etapas = '' ";
                    
                }
                sql = "update etapas_produccion set"
                        + " eta_desc = '" + txtNombre.getText().toUpperCase().trim() + "', "
                        + "estado = '" + estado_lst.getSelectedItem().toString() + "', "
                        + "orden_etapas= '"+((ultimo_cbx.isSelected()) ? "ULTIMO" : "")
                        + "' where cod_etapas = " + txtCodigo.getText() + ";";
            }

            if (operacion.equals("borrar")) {
                sql = "Delete from etapas_produccion where cod_etapas = " + txtCodigo.getText();
            }

            Conexion cn = new Conexion();
            try {
                cn.conectar();
                System.out.println(sql);
                if(ultimo_cbx.isSelected()){
                    cn.actualizar(update);
                }
                cn.actualizar(sql);
                JOptionPane.showMessageDialog(null, mensaje);
                btnCancelar.doClick();

            } catch (ClassNotFoundException ex) {
                Logger.getLogger(etapasDeProduccion.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, ex.getMessage());

            } catch (SQLException ex) {
                Logger.getLogger(etapasDeProduccion.class.getName()).log(Level.SEVERE, null, ex);
                if (operacion.equals("borrar") && txtCodigo.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "Primero debe seleccionar una etapa");
                }
                if (operacion.equals("borrar") && !txtCodigo.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "No se puede eliminar, registro referenciado");
                }
//                JOptionPane.showMessageDialog(null, ex.getMessage());
            }
        } else if (respuesta == 1 || respuesta == 2) {
            JOptionPane.showMessageDialog(null, "Cancelado");
            btnCancelar.doClick();
        }
    }//GEN-LAST:event_btnGrabarActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        txtNombre.setEditable(false);

    }//GEN-LAST:event_txtNombreActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void grillaBancoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_grillaBancoMouseClicked
        int fila = grillaBanco.getSelectedRow();

        String cod = grillaBanco.getValueAt(fila, 0).toString();
        String nombre = grillaBanco.getValueAt(fila, 1).toString();
        String estado = grillaBanco.getValueAt(fila, 2).toString();
        boolean ultimo = Boolean.parseBoolean(grillaBanco.getValueAt(fila, 3).toString());

//      

        if (operacion.equals("modificar") || operacion.equals("borrar")) {
            txtCodigo.setText(cod);
            txtNombre.setText(nombre);
            estado_lst.setSelectedItem(estado);
            ultimo_cbx.setSelected(ultimo);

        }

        if (operacion.equals("modificar")) {
            txtNombre.requestFocus();

        }
        if (operacion.equals("borrar")) {
            btnGrabar.doClick();
        }
    }//GEN-LAST:event_grillaBancoMouseClicked

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        getDatos();
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped
        char c = evt.getKeyChar();
        if (Character.isDigit(c)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(null, "Ingrese solo letras");
            txtNombre.setCursor(null);
        }
    }//GEN-LAST:event_txtNombreKeyTyped

    private void btnReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReporteActionPerformed
        vehiculos.reporteImprimir("reporteSucursal.jasper");
    }//GEN-LAST:event_btnReporteActionPerformed

//    ResultSet sucursal=cn.consultar("select * from v_sucursal where sucur_nom ilike '%"+txtBuscador.getText()+"%' order by sucur_id");
//Metodos.cargarTabla(grillaBanco, new Object[]{sucursal.getString("sucur_id"), sucursal.getString("sucur_nom"), sucursal.getString("sucur_num"), sucursal.getString("ciudad")});    
    public void getDatos() {
        Conexion cn = new Conexion();

        try {
            cn.conectar();
            ResultSet etapas = cn.consultar("select * from etapas_produccion where eta_desc ilike '%" + txtBuscador.getText() + "%' order by cod_etapas"); //order by ordena de menor a mayor, si se quiere de mayor a menor se le agrega desc al final

            Metodos.limpiarTabla(grillaBanco);
            if (etapas.isBeforeFirst()) {
                while (etapas.next()) {
                    Metodos.cargarTabla(grillaBanco, new Object[]{etapas.getString("cod_etapas"), etapas.getString("eta_desc"), etapas.getString("estado"),
                        (etapas.getString("orden_etapas") == null) ? false :
                                (etapas.getString("orden_etapas").contains("ULTIMO")?  true : false )});
                }
            } else {
                JOptionPane.showMessageDialog(null, "No hay registros en la base de datos");
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(empleados.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "No se encuentra " + ex.getMessage());
        } catch (SQLException ex) {
            Logger.getLogger(empleados.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Metal".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(etapasDeProduccion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(etapasDeProduccion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(etapasDeProduccion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(etapasDeProduccion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new etapasDeProduccion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGrabar;
    private javax.swing.JButton btnReporte;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox<String> estado_lst;
    private javax.swing.JTable grillaBanco;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField txtBuscador;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JCheckBox ultimo_cbx;
    // End of variables declaration//GEN-END:variables
}
