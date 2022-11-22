
package Acceso;

import clases.Conexion;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Acceso extends javax.swing.JDialog {

    public Acceso(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        des_text();
        txtUsuario.requestFocus();
        inicio();
    }

    int contador=0;

   

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jLabel2 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtClave = new javax.swing.JPasswordField();
        btnSalir = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtHost = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtUser = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtBd = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtPass = new javax.swing.JPasswordField();
        btnConectar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtSucursal = new javax.swing.JTextField();
        btnIngresar = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        txt_personal = new javax.swing.JTextField();
        cmb_cambio = new javax.swing.JButton();

        jLabel4.setFont(new java.awt.Font("DejaVu Sans", 3, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(249, 249, 249));
        jLabel4.setText("ACCESO");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jDesktopPane1.setBackground(new java.awt.Color(16, 90, 174));

        jLabel2.setFont(new java.awt.Font("DejaVu Sans", 3, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(249, 249, 249));
        jLabel2.setText("ACCESO");
        jDesktopPane1.add(jLabel2);
        jLabel2.setBounds(130, 10, 120, 32);

        txtUsuario.setFont(new java.awt.Font("DejaVu Sans", 1, 12)); // NOI18N
        txtUsuario.setText("LUIS");
        txtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioActionPerformed(evt);
            }
        });
        jDesktopPane1.add(txtUsuario);
        txtUsuario.setBounds(570, 100, 210, 30);

        jLabel3.setFont(new java.awt.Font("DejaVu Sans", 3, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(249, 249, 249));
        jLabel3.setText("Sucursal");
        jDesktopPane1.add(jLabel3);
        jLabel3.setBounds(460, 230, 60, 20);

        jLabel5.setFont(new java.awt.Font("DejaVu Sans", 3, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(249, 249, 249));
        jLabel5.setText("Personal");
        jDesktopPane1.add(jLabel5);
        jLabel5.setBounds(460, 190, 100, 19);

        txtClave.setText("123");
        txtClave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtClaveActionPerformed(evt);
            }
        });
        jDesktopPane1.add(txtClave);
        txtClave.setBounds(570, 140, 210, 30);

        btnSalir.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        jDesktopPane1.add(btnSalir);
        btnSalir.setBounds(690, 360, 90, 28);

        btnCancelar.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        jDesktopPane1.add(btnCancelar);
        btnCancelar.setBounds(680, 270, 100, 28);

        jButton2.setText("Configuracion");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jDesktopPane1.add(jButton2);
        jButton2.setBounds(40, 70, 106, 23);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("HOST --->");
        jDesktopPane1.add(jLabel7);
        jLabel7.setBounds(20, 120, 62, 15);

        txtHost.setText("localhost");
        txtHost.setEnabled(false);
        txtHost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHostActionPerformed(evt);
            }
        });
        jDesktopPane1.add(txtHost);
        txtHost.setBounds(100, 120, 100, 30);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("USER --->");
        jDesktopPane1.add(jLabel8);
        jLabel8.setBounds(20, 170, 61, 15);

        txtUser.setText("postgres");
        txtUser.setEnabled(false);
        txtUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserActionPerformed(evt);
            }
        });
        jDesktopPane1.add(txtUser);
        txtUser.setBounds(100, 170, 100, 30);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("B. D. --->");
        jDesktopPane1.add(jLabel10);
        jLabel10.setBounds(20, 220, 58, 15);

        txtBd.setText("servis");
        txtBd.setEnabled(false);
        txtBd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBdActionPerformed(evt);
            }
        });
        jDesktopPane1.add(txtBd);
        txtBd.setBounds(100, 220, 100, 30);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setText("PASS --->");
        jDesktopPane1.add(jLabel11);
        jLabel11.setBounds(20, 260, 62, 15);

        txtPass.setText("123");
        txtPass.setEnabled(false);
        txtPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPassActionPerformed(evt);
            }
        });
        jDesktopPane1.add(txtPass);
        txtPass.setBounds(100, 260, 100, 30);

        btnConectar.setMnemonic('c');
        btnConectar.setText("CONECTAR");
        btnConectar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConectarActionPerformed(evt);
            }
        });
        jDesktopPane1.add(btnConectar);
        btnConectar.setBounds(50, 300, 92, 23);

        jLabel6.setFont(new java.awt.Font("DejaVu Sans", 3, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(249, 249, 249));
        jLabel6.setText("Usuario");
        jDesktopPane1.add(jLabel6);
        jLabel6.setBounds(460, 110, 60, 19);

        txtSucursal.setFont(new java.awt.Font("DejaVu Sans", 1, 12)); // NOI18N
        txtSucursal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSucursalActionPerformed(evt);
            }
        });
        jDesktopPane1.add(txtSucursal);
        txtSucursal.setBounds(570, 220, 210, 30);

        btnIngresar.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        btnIngresar.setText("Ingresar");
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });
        jDesktopPane1.add(btnIngresar);
        btnIngresar.setBounds(580, 360, 100, 28);

        jLabel9.setFont(new java.awt.Font("DejaVu Sans", 3, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(249, 249, 249));
        jLabel9.setText("Contraseña");
        jDesktopPane1.add(jLabel9);
        jLabel9.setBounds(460, 150, 100, 19);
        jDesktopPane1.add(txt_personal);
        txt_personal.setBounds(570, 180, 210, 30);

        cmb_cambio.setFont(new java.awt.Font("Calibri Light", 0, 11)); // NOI18N
        cmb_cambio.setText("¿Desea cambiar su contraseña?");
        cmb_cambio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_cambioActionPerformed(evt);
            }
        });
        jDesktopPane1.add(cmb_cambio);
        cmb_cambio.setBounds(10, 383, 168, 10);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 798, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 408, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void verificarUsuario(){
        Conexion cn=new Conexion();
        try {
            cn.conectar();
            ResultSet usuario=cn.consultar("select * from v_usuarios " +
                                            "where " +
                                            " usu_login = '"+txtUsuario.getText().toUpperCase()+"' and " +
                                            " usu_contra = md5('"+txtClave.getText()+"') and " +
                                            " usu_esta = 'ACTIVO'");
            if(usuario.isBeforeFirst()){
                usuario.next();
                Menu.empleado=usuario.getString("nombre");
                Menu.usuario=usuario.getString("usu_login");
                Menu.nivel=usuario.getString("usu_nivel");
                Menu.idUsuario=usuario.getString("usu_id");
                Menu.idSucursal=usuario.getString("sucur_id");
                Menu.Sucursal=usuario.getString("sucur_nom");
                Menu.idEmpleado=usuario.getString("emp_id");

                dispose();
                new Menu().setVisible(true);
                
            }else{
                JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrecta");
            }
            
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Acceso.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Acceso.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    
    private void txtClaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtClaveActionPerformed
        Conexion cn=new Conexion();
        try {
            cn.conectar();
            ResultSet sucu=cn.consultar("select * from v_usuarios " +
                                            "where " +
                                            " usu_login = '"+txtUsuario.getText().toUpperCase()+"' and " +
                                            " usu_contra = md5('"+txtClave.getText()+"') and " +
                                            " usu_esta = 'ACTIVO'");
            if(sucu.isBeforeFirst()){
                sucu.next();
                txtSucursal.setText(sucu.getString("sucur_nom"));
                txt_personal.setText(sucu.getString("nombre"));
                txtSucursal.requestFocus();
                btnIngresar.setEnabled(true);
                
            }else{
                JOptionPane.showMessageDialog(null, "Vuelva a ingresar sus datos");
                contador=contador+1;
                System.out.println(contador);
                
                
            }
            if (contador==3) {
                    cn.conectar();
                    String sql="update usuario set usu_esta ='BLOQUEADO' where usu_login ='"+txtUsuario.getText().toUpperCase()+"'";
                    cn.actualizar(sql);
                    JOptionPane.showMessageDialog(null, "Este usuario ha sido bloqueado, comuniquese con el administrador");
                    System.out.println(sql);
                    dispose();
                }
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Acceso.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Acceso.class.getName()).log(Level.SEVERE, null, ex);
        }
        btnIngresar.doClick();
    }//GEN-LAST:event_txtClaveActionPerformed

    private void txtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioActionPerformed
        if (txtUsuario.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Debe ingresar usuario");
            txtUsuario.requestFocus();
        }else if (!txtUsuario.getText().equals("")) {
            txtClave.setEditable(true);
            txtClave.setEnabled(true);
            txtClave.requestFocus();
            txtUsuario.setEditable(false);
        }
    }//GEN-LAST:event_txtUsuarioActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        cancelar();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        hab_text();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void cancelar(){
        txtUsuario.setText("");
        txtClave.setText("");
        txtSucursal.setText("");
        txt_personal.setText("");
        txtUsuario.setEditable(true);
        txtUsuario.requestFocus();
        txtClave.setEditable(false);
        txtSucursal.setEditable(false);
        btnIngresar.setEnabled(false);
        contador=0;
    }
    
    private void des_text(){    
    this.txtHost.setEnabled(false);
    this.txtUser.setEnabled(false);
    this.txtBd.setEnabled(false);
    this.txtPass.setEnabled(false);
}
private void hab_text(){    
    this.txtHost.setEnabled(true);
    this.txtUser.setEnabled(true);
    this.txtBd.setEnabled(true);
    this.txtPass.setEnabled(true);
}

private void inicio(){
    txtUsuario.setEnabled(false);
    txtClave.setEnabled(false);
    txtSucursal.setEnabled(false);
    txt_personal.setEditable(false);
    
}

    private void txtHostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHostActionPerformed
        this.txtUser.setEnabled(true);
        this.txtUser.requestFocus();
    }//GEN-LAST:event_txtHostActionPerformed

    private void txtUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserActionPerformed
        this.txtBd.setEnabled(true);
        this.txtBd.requestFocus();
    }//GEN-LAST:event_txtUserActionPerformed

    private void txtBdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBdActionPerformed
        this.txtPass.setEnabled(true);
        this.txtPass.requestFocus();
    }//GEN-LAST:event_txtBdActionPerformed

    private void txtPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPassActionPerformed
        this.btnConectar.setEnabled(true);
        this.btnConectar.requestFocus();
    }//GEN-LAST:event_txtPassActionPerformed

    private void btnConectarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConectarActionPerformed
        Conexion.host=txtHost.getText();
        Conexion.user=txtUser.getText();
        Conexion.bd=txtBd.getText();
        Conexion.pss=txtPass.getText();
        Conexion cn = new Conexion();
        try {
            cn.conectar();
            JOptionPane.showMessageDialog(null, "Conectado a la base de datos");
            txtClave.setEnabled(false);
            txtUsuario.setEnabled(true);
            des_text();
            txtUsuario.requestFocus();
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Acceso.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Acceso.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Ocurrio algun error, vuelva a intentarlo");
        }
    }//GEN-LAST:event_btnConectarActionPerformed

    private void txtSucursalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSucursalActionPerformed
        btnIngresar.doClick();
    }//GEN-LAST:event_txtSucursalActionPerformed

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed
        verificarUsuario();
    }//GEN-LAST:event_btnIngresarActionPerformed

    private void cmb_cambioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_cambioActionPerformed
        new cambioPass().setVisible(true);
        dispose();
    }//GEN-LAST:event_cmb_cambioActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Acceso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Acceso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Acceso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Acceso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Acceso dialog = new Acceso(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnConectar;
    private javax.swing.JButton btnIngresar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton cmb_cambio;
    private javax.swing.JButton jButton2;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtBd;
    private javax.swing.JPasswordField txtClave;
    private javax.swing.JTextField txtHost;
    private javax.swing.JPasswordField txtPass;
    private javax.swing.JTextField txtSucursal;
    private javax.swing.JTextField txtUser;
    private javax.swing.JTextField txtUsuario;
    private javax.swing.JTextField txt_personal;
    // End of variables declaration//GEN-END:variables
}
