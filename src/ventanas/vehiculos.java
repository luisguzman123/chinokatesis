
package ventanas;

import clases.Conexion;
import clases.Metodos;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JRViewer;

/**
 *
 * @author Nestors
 */
public class vehiculos extends javax.swing.JFrame {

    
    String operacion="";
    String confirmar="";
    String mensaje="";
    boolean duplicado;
    
    public static String busqueda = "";

    public vehiculos() {
        initComponents();
        btnCancelar.doClick();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtMarca = new javax.swing.JTextField();
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
        txtModelo = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtChasis = new javax.swing.JTextField();
        btnReporte = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtAño = new javax.swing.JTextField();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tekton Pro Cond", 0, 36)); // NOI18N
        jLabel1.setText("Vehículos");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, -1, 46));

        jLabel2.setText("Marca");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 71, -1, -1));

        txtMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMarcaActionPerformed(evt);
            }
        });
        txtMarca.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtMarcaKeyTyped(evt);
            }
        });
        getContentPane().add(txtMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(81, 68, 369, -1));

        txtBuscador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscadorActionPerformed(evt);
            }
        });
        getContentPane().add(txtBuscador, new org.netbeans.lib.awtextra.AbsoluteConstraints(81, 191, 369, -1));

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, -1, -1));

        grillaBanco.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Código", "Marca", "Modelo", "Chasis", "Año"
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

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 294, 440, 101));

        jLabel3.setText("Código");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(348, 40, -1, -1));
        getContentPane().add(txtCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(399, 37, 51, -1));

        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        getContentPane().add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 253, -1, -1));

        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(87, 253, -1, -1));

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(154, 253, -1, -1));

        btnGrabar.setText("Grabar");
        btnGrabar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGrabarActionPerformed(evt);
            }
        });
        getContentPane().add(btnGrabar, new org.netbeans.lib.awtextra.AbsoluteConstraints(229, 253, -1, -1));

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 253, -1, -1));

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(379, 253, 71, -1));

        jLabel4.setText("Modelo");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 97, -1, -1));

        txtModelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtModeloActionPerformed(evt);
            }
        });
        getContentPane().add(txtModelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(81, 94, 369, -1));

        jLabel5.setText("Chasis");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 128, -1, -1));

        txtChasis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtChasisActionPerformed(evt);
            }
        });
        getContentPane().add(txtChasis, new org.netbeans.lib.awtextra.AbsoluteConstraints(81, 125, 369, -1));

        btnReporte.setText("Reporte");
        btnReporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReporteActionPerformed(evt);
            }
        });
        getContentPane().add(btnReporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(379, 224, -1, -1));

        jLabel6.setText("Año");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 159, -1, -1));

        txtAño.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAñoActionPerformed(evt);
            }
        });
        getContentPane().add(txtAño, new org.netbeans.lib.awtextra.AbsoluteConstraints(81, 156, 369, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        txtMarca.setEditable(true);
        txtMarca.requestFocus();
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
        
        txtCodigo.setText(Metodos.siguienteCodigo("veh_id", "vehiculo"));
        
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
        
        txtMarca.setEditable(true);
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
        
        txtMarca.setEditable(true);
        btnGrabar.setEnabled(true);
        btnCancelar.setEnabled(true);
        
        operacion="borrar";
        confirmar="Desea borrar el registro";
        mensaje="Registro eliminado con exito";
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        
        txtMarca.setEditable(false);
        txtModelo.setEditable(false);
        txtChasis.setEditable(false);
        txtAño.setEditable(false);
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
        txtMarca.setText("");
        txtModelo.setText("");
        txtChasis.setText("");
        txtAño.setText("");
        txtCodigo.setText("");
        
        operacion="";
        confirmar="";
        mensaje="";
        
        getDatos();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnGrabarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGrabarActionPerformed
        int respuesta = 5;
        duplicado = Metodos.evitarDuplicado("vehiculo", "vehi_cha", txtChasis.getText().trim(), "veh_id", txtCodigo.getText());
        if (duplicado && (!operacion.equals("borrar"))) {
            JOptionPane.showMessageDialog(null, "Este registro ya esta en la base de datos");
            btnCancelar.doClick();
        }else{
            respuesta=JOptionPane.showConfirmDialog(null, confirmar);
        }
        if (respuesta==0) {
             String sql="";
            if(operacion.equals("agregar")){
                sql="Insert into vehiculo (veh_mar, veh_mod, vehi_cha, anho) "
                + "values ('"+txtMarca.getText().toUpperCase().trim()+"', '"+txtModelo.getText().toUpperCase()+"','"+txtChasis.getText().toUpperCase()+"','"+txtAño.getText().toUpperCase()+"')";
            }
            
            if(operacion.equals("modificar")){
                sql="update vehiculo set veh_mar = '"+txtMarca.getText().toUpperCase().trim()+"', veh_mod = '"+txtModelo.getText().toUpperCase()+"', vehi_cha = '"+txtChasis.getText().toUpperCase()+"', anho = '"+txtAño.getText().toUpperCase()+"'  where veh_id = "+txtCodigo.getText();
            }
            
            if(operacion.equals("borrar")){
                sql="Delete from vehiculo where veh_id = "+txtCodigo.getText();
            }
            
            Conexion cn=new Conexion();
            try {
                cn.conectar();
                System.out.println(sql);
                cn.actualizar(sql);
                JOptionPane.showMessageDialog(null, mensaje);
                btnCancelar.doClick();

                
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(vehiculos.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, ex.getMessage());
                
            } catch (SQLException ex) {
                Logger.getLogger(vehiculos.class.getName()).log(Level.SEVERE, null, ex);
                if(operacion.equals("borrar") && txtCodigo.getText().equals("")){
                    JOptionPane.showMessageDialog(null, "Primero debe seleccionar un Vehículo");
                }
                if (operacion.equals("borrar") && !txtCodigo.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "No se puede eliminar, registro referenciado");
                }
                if (operacion.equals("modificar")) {
                    JOptionPane.showMessageDialog(null, "Primero debe seleccionar un Vehículo");
                }
//                JOptionPane.showMessageDialog(null, ex.getMessage());
            }
        }else if(respuesta==1 || respuesta==2){
            JOptionPane.showMessageDialog(null, "Cancelado");
            btnCancelar.doClick();
        }
    }//GEN-LAST:event_btnGrabarActionPerformed

    private void txtMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMarcaActionPerformed
        txtMarca.setEditable(false);
        txtModelo.setEditable(true);
        txtModelo.requestFocus();
    }//GEN-LAST:event_txtMarcaActionPerformed

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
       
//       if(busqueda.equals("alumno") && operacion.equals("")){   //primero se realiza esta accion porque de otro modo vacia la variable "operacion"
//           Alumnos.txtCiudad.setText(cod+"-"+descri);
//           Alumnos.txtCiudad.requestFocus();
//           busqueda = "";
//           dispose();
//       }
       
       
      
       
       if(operacion.equals("modificar") || operacion.equals("borrar")){
           txtCodigo.setText(cod);
           txtMarca.setText(marca);
           txtModelo.setText(modelo);
           txtChasis.setText(chasis);
           txtAño.setText(año);
       }
       
       if(operacion.equals("modificar")){
           txtMarca.requestFocus();
           
       }
       if(operacion.equals("borrar")){
           btnGrabar.doClick();
       }
    }//GEN-LAST:event_grillaBancoMouseClicked

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        getDatos();
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void txtModeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtModeloActionPerformed
        txtModelo.setEditable(false);
        txtChasis.setEditable(true);
        txtChasis.requestFocus();
    }//GEN-LAST:event_txtModeloActionPerformed

    private void txtChasisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtChasisActionPerformed
        txtChasis.setEditable(false);
        txtAño.setEditable(true);
        txtAño.requestFocus();
    }//GEN-LAST:event_txtChasisActionPerformed

    private void txtMarcaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMarcaKeyTyped
        char c = evt.getKeyChar();
        if (Character.isDigit(c)) {
           getToolkit().beep();
           evt.consume();
           JOptionPane.showMessageDialog(null, "Ingrese solo letras");
           txtMarca.setCursor(null);
        }
    }//GEN-LAST:event_txtMarcaKeyTyped

    private void btnReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReporteActionPerformed
        
        reporteImprimir("reporteVehiculos.jasper");
        
        
        
        
//        try {
//            new llamadorReferenciales().genreporte("reporteBancos.jasper", "select ban_cod, ban_desc, ban_telef, ban_direcc from banco");
//        } catch (ClassNotFoundException ex) {
//            Logger.getLogger(vehiculos.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (SQLException ex) {
//            Logger.getLogger(vehiculos.class.getName()).log(Level.SEVERE, null, ex);
//        }
    }//GEN-LAST:event_btnReporteActionPerformed

    private void txtAñoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAñoActionPerformed
        txtAño.setEditable(false);
        btnGrabar.doClick();
    }//GEN-LAST:event_txtAñoActionPerformed

    public void getDatos(){
        Conexion cn=new Conexion();
        
        try {
            cn.conectar();
            ResultSet vehiculo=cn.consultar("select * from vehiculo where veh_mar ilike '%"+txtBuscador.getText()+"%' order by veh_id"); //order by ordena de menor a mayor, si se quiere de mayor a menor se le agrega desc al final
            Metodos.limpiarTabla(grillaBanco);
            if(vehiculo.isBeforeFirst()){
                while(vehiculo.next()){
                    Metodos.cargarTabla(grillaBanco, new Object[]{vehiculo.getString("veh_id"), vehiculo.getString("veh_mar"), vehiculo.getString("veh_mod"), vehiculo.getString("vehi_cha"), vehiculo.getString("anho")});
                }
            }else{
                JOptionPane.showMessageDialog(null, "No hay registros en la base de datos");
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(vehiculos.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "No se encuentra "+ex.getMessage());
        } catch (SQLException ex) {
            Logger.getLogger(vehiculos.class.getName()).log(Level.SEVERE, null, ex);
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
            java.util.logging.Logger.getLogger(vehiculos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(vehiculos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(vehiculos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(vehiculos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new vehiculos().setVisible(true);
            }
        });
    }

    
    
    
    
    public static void reporteImprimir(String nombre){
//        ventana.principal.Cargando cargando = new Cargando();
//        cargando.setVisible(true);
//        int fila;
//        String datos = "";
//        List Resultados = new ArrayList();
//        Resultados.clear();
        String ruta = System.getProperty("user.dir")+"\\src\\reportes\\"+nombre+"";
        //cargamos nuestra tabla en un modelo list
//        Resultados.add(new modelos.reportes.Pagare("A", "a"));
         
        
        //creamos un mapa
        Map map = new HashMap();
        System.out.println(ruta);
        JasperPrint jprint;
        //configuramos el Cuadro de dialogo
        JDialog reporte = new JDialog();
        reporte.setModal(true);
        reporte.setSize(1200,700);
        reporte.setLocationRelativeTo(null);
        reporte.setTitle("Reporte de referencial");
//        new Util.JframeUtil().maximizarJdialog(reporte);
//        Util.Valores valores = new Valores();
        //agregamos los parametros
        
//        map.put("Fecha_Inicio", "1");
//        map.put("Fecha_Final", hasta);
//        map.put("sucursal", sucursal);
        
//        System.out.println(this.getClass().getClassLoader().getResourceAsStream("src/reportes/facturaCuota.jasper"));
        try {
            //coleccion de datos
            jprint = JasperFillManager.fillReport(ruta, map, new Conexion().conectar());
            
//            jprint = JasperFillManager.fillReport(
//                    this.getClass().getClassLoader().getResourceAsStream("../reportes/reporteProveedor.jasper"),
//                    map,
//                    new JRBeanCollectionDataSource(reporte));
            
//            cargando.setVisible(false);
            JRViewer jv = new JRViewer(jprint);
            
            
            reporte.getContentPane().add(jv);
            if(jprint.getPages().size() == 0){
                return;
            }
            reporte.setVisible(true);
            
        } catch (JRException ex) {
                    System.out.println("ERROR EN: "+ex.getMessage());
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(proveedor.class.getName()).log(Level.SEVERE, null, ex);
        }
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
    private javax.swing.JTextField txtAño;
    private javax.swing.JTextField txtBuscador;
    private javax.swing.JTextField txtChasis;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtMarca;
    private javax.swing.JTextField txtModelo;
    // End of variables declaration//GEN-END:variables
}
