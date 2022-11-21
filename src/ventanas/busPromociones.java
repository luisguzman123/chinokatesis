
package ventanas;

import clases.Conexion;
import clases.Metodos;
import com.toedter.calendar.JCalendar;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class busPromociones extends javax.swing.JFrame {

    public busPromociones() {
        initComponents();
        txtFechaActual.setDate(new JCalendar().getDate());
        txtFechaFinal.setDate(new JCalendar().getDate());
        btn_buscar.doClick();
        traerFechaActual();
        
    }

    public static String busqueda = "";
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        grillaBuscador = new javax.swing.JTable();
        btn_buscar = new javax.swing.JButton();
        txtFechaActual = new com.toedter.calendar.JDateChooser();
        txtFechaFinal = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        grillaBuscador.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Cód. Promo", "Estado", "Descripción", "Obs.", "Fecha Inicio", "Fecha Fin", "Beneficios", "Cód. Sucursal", "Sucursal", "Cód. Cliente", "Cliente"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        grillaBuscador.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                grillaBuscadorMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(grillaBuscador);

        btn_buscar.setText("Buscar");
        btn_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarActionPerformed(evt);
            }
        });

        jLabel1.setText("Desde (Fecha actual)");

        jLabel2.setText("Hasta");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 666, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtFechaActual, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtFechaFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_buscar)))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_buscar)
                            .addComponent(txtFechaFinal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(txtFechaActual, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(47, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed
        getDatos();
    }//GEN-LAST:event_btn_buscarActionPerformed

    private void grillaBuscadorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_grillaBuscadorMouseClicked
        switch (busqueda) {
            case "promociones":
                seleccionarPromociones();
                break;
//            case "recepcion_desde_diagnostico":
//                seleccionarRecepDesdeDiagnostico();
//                break;
        }
      
    }//GEN-LAST:event_grillaBuscadorMouseClicked


    
    
    
    
    private void seleccionarPromociones() {

        int fila = grillaBuscador.getSelectedRow();

        String cod = grillaBuscador.getValueAt(fila, 0).toString();
        String estado = grillaBuscador.getValueAt(fila, 1).toString();
        String desc = grillaBuscador.getValueAt(fila, 2).toString();
        String obs = grillaBuscador.getValueAt(fila, 3).toString();
        String fechaInicio = grillaBuscador.getValueAt(fila, 4).toString();
        String fechaFin = grillaBuscador.getValueAt(fila, 5).toString();
        String beneficios = grillaBuscador.getValueAt(fila, 6).toString();
        String codSucursal = grillaBuscador.getValueAt(fila, 7).toString();
        String sucursal = grillaBuscador.getValueAt(fila, 8).toString();
        String codCliente = grillaBuscador.getValueAt(fila, 9).toString();
        String cliente = grillaBuscador.getValueAt(fila, 10).toString();

        if (busqueda.equals("promociones")) {   //primero se realiza esta accion porque de otro modo vacia la variable "operacion"
            promociones.txtCod.setText(cod);
            promociones.txtClienteCod.setText(codCliente);
            promociones.txtClienteDesc.setText(cliente);
            promociones.txtDescriPromocion.setText(desc);
            promociones.txtObservaciones.setText(obs);
            promociones.txtBeneficios.setText(beneficios);
            promociones.txtInicioFecha.setDateFormatString(fechaInicio);
            promociones.txtFinFecha.setDateFormatString(fechaFin);
            promociones.txtSucursal.setText(sucursal);
            promociones.txtCod.requestFocus();
            busqueda = "";

        }

        Conexion cn = new Conexion();

        try {
            cn.conectar();
            ResultSet detalles = cn.consultar("select * from v_promociones_detalle where id_promociones = " + cod + ""); //order by ordena de menor a mayor, si se quiere de mayor a menor se le agrega desc al final
            Metodos.limpiarTabla(promociones.grilla);
            if (detalles.isBeforeFirst()) {
                while (detalles.next()) {
                    Metodos.cargarTabla(promociones.grilla, new Object[]{
                        detalles.getString("id_tipo_trabajo"),
                        detalles.getString("descri_tipotrabajo"),
                        detalles.getString("monto")
                        
                    });
                }
            } else {
                JOptionPane.showMessageDialog(null, "No hay registros en la base de datos");
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(busPromociones.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "No se encuentra " + ex.getMessage());
        } catch (SQLException ex) {
            Logger.getLogger(busPromociones.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }

       // pedidoDeVenta.txtTotal.setText(String.valueOf(Metodos.sumarColumna(pedidoDeVenta.grilla, 4)));
        dispose();
    }
    
    
    private void seleccionarRecepDesdeDiagnostico() {

        int fila = grillaBuscador.getSelectedRow();

        String cod = grillaBuscador.getValueAt(fila, 0).toString();
        String fecha = grillaBuscador.getValueAt(fila, 1).toString();
        String estado = grillaBuscador.getValueAt(fila, 2).toString();
        String idempleado = grillaBuscador.getValueAt(fila, 3).toString();
        String empleadoDesc = grillaBuscador.getValueAt(fila, 4).toString();
        String idcliente = grillaBuscador.getValueAt(fila, 5).toString();
        String clienteDesc = grillaBuscador.getValueAt(fila, 6).toString();
        String idsusursal = grillaBuscador.getValueAt(fila, 7).toString();
        String susursalDesc = grillaBuscador.getValueAt(fila, 8).toString();

        if (busqueda.equals("recepcion_desde_diagnostico")) {   //primero se realiza esta accion porque de otro modo vacia la variable "operacion"
            diagnostico.txtRecepcionCod.setText(cod);
            diagnostico.txtEmpleadoCod.setText(idempleado);
            diagnostico.txtEmpleadoDes.setText(empleadoDesc);
            diagnostico.txtClienteCod.setText(idcliente);
            diagnostico.txtClienteDesc.setText(clienteDesc);
            diagnostico.txtRecepcionCod.requestFocus();
            busqueda = "";

        }

        Conexion cn = new Conexion();

        try {
            cn.conectar();
            ResultSet detalles = cn.consultar("select * from v_detalle_recepcion where id_recepcion = " + cod + ""); //order by ordena de menor a mayor, si se quiere de mayor a menor se le agrega desc al final
            Metodos.limpiarTabla(diagnostico.grillaRecepcion);
            if (detalles.isBeforeFirst()) {
                while (detalles.next()) {
                    Metodos.cargarTabla(diagnostico.grillaRecepcion, new Object[]{
                        detalles.getString("id_equipo"),
                        detalles.getString("desc_equipo"),
                        detalles.getString("cantidad"),
                        detalles.getString("nro_de_serie"),
                        detalles.getString("descripcion")
                        
                    });
                }
            } else {
                JOptionPane.showMessageDialog(null, "No hay registros en la base de datos");
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(busPromociones.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "No se encuentra " + ex.getMessage());
        } catch (SQLException ex) {
            Logger.getLogger(busPromociones.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }

       // pedidoDeVenta.txtTotal.setText(String.valueOf(Metodos.sumarColumna(pedidoDeVenta.grilla, 4)));
        dispose();
    }
    
    
    
    public void traerFechaActual(){
        Calendar cal = Calendar.getInstance();
        String fecha = cal.get(cal.DATE)+"/"+cal.get(cal.MONTH)+"/"+cal.get(cal.YEAR);
        txtFechaActual.setDateFormatString(fecha);
        txtFechaActual.setEnabled(false);
        txtFechaFinal.setMinSelectableDate(Calendar.getInstance().getTime());
    }
    
    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new busPromociones().setVisible(true);
            }
        });
    }
    
   public void getDatos() {

        switch (busqueda) {
            case "promociones":
                buscarPromociones();
                break;
//            case "recepcion_desde_diagnostico":
//                buscarRecepcionNoUsadas();
//                break;


        }
    }

    /**
     * busca la tabla con pedidos
     */
    private void buscarPromociones() {
        Conexion cn = new Conexion();
        try {
            cn.conectar();
            ResultSet recep = cn.consultar("select * from v_promociones where fecha_fin BETWEEN '" + Metodos.dameFechaFormateadaSQL(txtFechaActual.getDate()) + "' and '"+Metodos.dameFechaFormateadaSQL(txtFechaFinal.getDate())+"' and estado !='ANULADO'  order by id_promociones"); //order by ordena de menor a mayor, si se quiere de mayor a menor se le agrega desc al final
            Metodos.limpiarTabla(grillaBuscador);
            if (recep.isBeforeFirst()) {
                while (recep.next()) {
                    
                    Metodos.cargarTabla(grillaBuscador, new Object[]{recep.getString("id_promociones"), recep.getString("estado"),recep.getString("promo_descri"), recep.getString("observacion"),recep.getString("fecha_ini"), recep.getString("fecha_fin"),recep.getString("beneficio"), recep.getString("id_sucu"), recep.getString("sucur_nom"), recep.getString("id_cliente"), recep.getString("cliente")});
                }
            } else {

                JOptionPane.showMessageDialog(null, "No hay registros en la base de datos");
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(clientes.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "No se encuentra " + ex.getMessage());
        } catch (SQLException ex) {
            Logger.getLogger(clientes.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }
    private void buscarRecepcionNoUsadas() {
        Conexion cn = new Conexion();
        try {
            cn.conectar();
            ResultSet recep = cn.consultar("select * from v_recepcion where fecha BETWEEN '" + Metodos.dameFechaFormateadaSQL(txtFechaActual.getDate()) + "' and '"+Metodos.dameFechaFormateadaSQL(txtFechaFinal.getDate())+"' and estado !='ANULADO' AND estado !='UTILIZADO' order by id_recepcion"); //order by ordena de menor a mayor, si se quiere de mayor a menor se le agrega desc al final
            Metodos.limpiarTabla(grillaBuscador);
            if (recep.isBeforeFirst()) {
                while (recep.next()) {
                    
                    Metodos.cargarTabla(grillaBuscador, new Object[]{recep.getString("id_recepcion"), recep.getString("fecha"),recep.getString("estado"), recep.getString("emp_id"),recep.getString("empleado"), recep.getString("cli_cod"),recep.getString("cliente"), recep.getString("sucur_id"), recep.getString("sucur_nom")});
                }
            } else {

                JOptionPane.showMessageDialog(null, "No hay registros en la base de datos");
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(clientes.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "No se encuentra " + ex.getMessage());
        } catch (SQLException ex) {
            Logger.getLogger(clientes.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }

    /**
     * busca la tabla con pedidos
     */  



    private String dameNombrePorCodigo(String codigo){
        try {
            Conexion cn = new Conexion();
            cn.conectar();
            ResultSet detalles = cn.consultar("select pro_nom from proveedor where pro_id =  "+codigo);
             if (detalles.isBeforeFirst()) {
                while (detalles.next()) {
                    return detalles.getString("pro_nom");
                    
                }
             }
        } catch (SQLException ex) {
            Logger.getLogger(busPromociones.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(busPromociones.class.getName()).log(Level.SEVERE, null, ex);
        }
         return "";
         
    }
    private String dameIva(String codigo){
        try {
            Conexion cn = new Conexion();
            cn.conectar();
            ResultSet detalles = cn.consultar("select iva from materia_prima where cod_materia =  "+codigo);
             if (detalles.isBeforeFirst()) {
                while (detalles.next()) {
                    return detalles.getString("iva");
                    
                }
             }
        } catch (SQLException ex) {
            Logger.getLogger(busPromociones.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(busPromociones.class.getName()).log(Level.SEVERE, null, ex);
        }
         return "";
         
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_buscar;
    private javax.swing.JTable grillaBuscador;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private com.toedter.calendar.JDateChooser txtFechaActual;
    private com.toedter.calendar.JDateChooser txtFechaFinal;
    // End of variables declaration//GEN-END:variables
}
