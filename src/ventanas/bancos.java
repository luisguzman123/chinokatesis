
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
public class bancos extends javax.swing.JFrame {

    
    String operacion="";
    String confirmar="";
    String mensaje="";
    boolean duplicado;
    
    public static String busqueda = "";

    public bancos() {
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
        jLabel4 = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtTelef = new javax.swing.JTextField();
        btnReporte = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tekton Pro Cond", 0, 36)); // NOI18N
        jLabel1.setText("Bancos");

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
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Código", "Nombre", "Dirección", "Teléfono", "Correo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        grillaBanco.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                grillaBancoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(grillaBanco);

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

        jLabel4.setText("Dirección");

        txtDireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDireccionActionPerformed(evt);
            }
        });

        jLabel5.setText("Teléfono");

        txtTelef.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefActionPerformed(evt);
            }
        });

        btnReporte.setText("Reporte");
        btnReporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReporteActionPerformed(evt);
            }
        });

        jLabel6.setText("Correo");

        txtCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCorreoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel1)
                .addGap(219, 219, 219)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel2)
                .addGap(34, 34, 34)
                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel4)
                .addGap(28, 28, 28)
                .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel5)
                .addGap(29, 29, 29)
                .addComponent(txtTelef, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel6)
                .addGap(38, 38, 38)
                .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(btnBuscar)
                .addGap(6, 6, 6)
                .addComponent(txtBuscador, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(379, 379, 379)
                .addComponent(btnReporte))
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(btnAgregar)
                .addGap(6, 6, 6)
                .addComponent(btnEditar)
                .addGap(6, 6, 6)
                .addComponent(btnEliminar)
                .addGap(6, 6, 6)
                .addComponent(btnGrabar)
                .addGap(6, 6, 6)
                .addComponent(btnCancelar)
                .addGap(4, 4, 4)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel2))
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel4))
                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel5))
                    .addComponent(txtTelef, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel6))
                    .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBuscar)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(txtBuscador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(11, 11, 11)
                .addComponent(btnReporte)
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAgregar)
                    .addComponent(btnEditar)
                    .addComponent(btnEliminar)
                    .addComponent(btnGrabar)
                    .addComponent(btnCancelar)
                    .addComponent(btnSalir))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
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
        
        txtCodigo.setText(Metodos.siguienteCodigo("ban_id", "banco"));
        
        operacion="agregar";
        confirmar="¿Desea grabar el nuevo registro?";
        mensaje="Registro grabado con exito";
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
        
        operacion="modificar";
        confirmar="Desea modificar el registro";
        mensaje="Registro modificado con exito";
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
        
        operacion="borrar";
        confirmar="Desea borrar el registro";
        mensaje="Registro eliminado con exito";
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        
        txtNombre.setEditable(false);
        txtDireccion.setEditable(false);
        txtTelef.setEditable(false);
        txtCorreo.setEditable(false);
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
        txtDireccion.setText("");
        txtTelef.setText("");
        txtCorreo.setText("");
        txtCodigo.setText("");
        
        operacion="";
        confirmar="";
        mensaje="";
        
        getDatos();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnGrabarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGrabarActionPerformed
        int respuesta = 5;
        duplicado = Metodos.evitarDuplicado("banco", "ban_nom", txtTelef.getText().trim(), "ban_id", txtCodigo.getText());
        if (duplicado && (!operacion.equals("borrar"))) {
            JOptionPane.showMessageDialog(null, "Este registro ya esta en la base de datos");
            btnCancelar.doClick();
        }else{
            respuesta=JOptionPane.showConfirmDialog(null, confirmar);
        }
        if (respuesta==0) {
             String sql="";
            if(operacion.equals("agregar")){
                sql="Insert into banco (ban_id, ban_nom, ban_dire, ban_telef, ban_correo) "
                + "values ("+txtCodigo.getText()+",'"+txtNombre.getText().toUpperCase().trim()+"', '"+txtDireccion.getText().toUpperCase()+"','"+txtTelef.getText().toUpperCase()+"','"+txtCorreo.getText().toUpperCase()+"')";
            }
            
            if(operacion.equals("modificar")){
                sql="update banco set ban_nom = '"+txtNombre.getText().toUpperCase().trim()+"', ban_dire = '"+txtDireccion.getText().toUpperCase()+"', ban_telef = '"+txtTelef.getText().toUpperCase()+"', ban_correo = '"+txtCorreo.getText().toUpperCase()+"'  where ban_id = "+txtCodigo.getText();
            }
            
            if(operacion.equals("borrar")){
                sql="Delete from banco where ban_id = "+txtCodigo.getText();
            }
            
            Conexion cn=new Conexion();
            try {
                cn.conectar();
                System.out.println(sql);
                cn.actualizar(sql);
                JOptionPane.showMessageDialog(null, mensaje);
                btnCancelar.doClick();

                
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(bancos.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, ex.getMessage());
                
            } catch (SQLException ex) {
                Logger.getLogger(bancos.class.getName()).log(Level.SEVERE, null, ex);
                if(operacion.equals("borrar") && txtCodigo.getText().equals("")){
                    JOptionPane.showMessageDialog(null, "Primero debe seleccionar un Banco");
                }
                if (operacion.equals("borrar") && !txtCodigo.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "No se puede eliminar, registro referenciado");
                }
                if (operacion.equals("modificar")) {
                    JOptionPane.showMessageDialog(null, "Primero debe seleccionar un Banco");
                }
//                JOptionPane.showMessageDialog(null, ex.getMessage());
            }
        }else if(respuesta==1 || respuesta==2){
            JOptionPane.showMessageDialog(null, "Cancelado");
            btnCancelar.doClick();
        }
    }//GEN-LAST:event_btnGrabarActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        txtNombre.setEditable(false);
        txtDireccion.setEditable(true);
        txtDireccion.requestFocus();
    }//GEN-LAST:event_txtNombreActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void grillaBancoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_grillaBancoMouseClicked
       int fila=grillaBanco.getSelectedRow();
        
       String cod= grillaBanco.getValueAt(fila, 0).toString();
       String marca= grillaBanco.getValueAt(fila, 1).toString();
       String modelo= grillaBanco.getValueAt(fila, 2).toString();
       String chasis= grillaBanco.getValueAt(fila, 3).toString();
       String año= grillaBanco.getValueAt(fila, 4).toString();
       
       if(busqueda.equals("cobros") && operacion.equals("")){   //primero se realiza esta accion porque de otro modo vacia la variable "operacion"
           cobros.txt_che_banco.setText(cod);
           cobros.txt_che_banco_desc.setText(marca);
           cobros.txt_che_banco_desc.requestFocus();
           busqueda = "";
           dispose();
       }
       
       
      
       
       if(operacion.equals("modificar") || operacion.equals("borrar")){
           txtCodigo.setText(cod);
           txtNombre.setText(marca);
           txtDireccion.setText(modelo);
           txtTelef.setText(chasis);
           txtCorreo.setText(año);
       }
       
       if(operacion.equals("modificar")){
           txtNombre.requestFocus();
           
       }
       if(operacion.equals("borrar")){
           btnGrabar.doClick();
       }
    }//GEN-LAST:event_grillaBancoMouseClicked

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        getDatos();
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void txtDireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDireccionActionPerformed
        txtDireccion.setEditable(false);
        txtTelef.setEditable(true);
        txtTelef.requestFocus();
    }//GEN-LAST:event_txtDireccionActionPerformed

    private void txtTelefActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefActionPerformed
        txtTelef.setEditable(false);
        txtCorreo.setEditable(true);
        txtCorreo.requestFocus();
    }//GEN-LAST:event_txtTelefActionPerformed

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
        vehiculos.reporteImprimir("reporteBancos.jasper");
    }//GEN-LAST:event_btnReporteActionPerformed

    private void txtCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCorreoActionPerformed
        txtCorreo.setEditable(false);
        btnGrabar.doClick();
    }//GEN-LAST:event_txtCorreoActionPerformed

    public void getDatos(){
        Conexion cn=new Conexion();
        
        try {
            cn.conectar();
            ResultSet vehiculo=cn.consultar("select * from banco where ban_nom ilike '%"+txtBuscador.getText()+"%' order by ban_id"); //order by ordena de menor a mayor, si se quiere de mayor a menor se le agrega desc al final
            Metodos.limpiarTabla(grillaBanco);
            if(vehiculo.isBeforeFirst()){
                while(vehiculo.next()){
                    Metodos.cargarTabla(grillaBanco, new Object[]{vehiculo.getString("ban_id"), vehiculo.getString("ban_nom"), vehiculo.getString("ban_dire"), vehiculo.getString("ban_telef"), vehiculo.getString("ban_correo")});
                }
            }else{
                JOptionPane.showMessageDialog(null, "No hay registros en la base de datos");
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(bancos.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "No se encuentra "+ex.getMessage());
        } catch (SQLException ex) {
            Logger.getLogger(bancos.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,ex.getMessage());
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
            java.util.logging.Logger.getLogger(bancos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(bancos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(bancos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(bancos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new bancos().setVisible(true);
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
    private javax.swing.JTable grillaBanco;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField txtBuscador;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelef;
    // End of variables declaration//GEN-END:variables
}
