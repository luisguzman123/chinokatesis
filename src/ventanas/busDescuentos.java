
package ventanas;

import clases.Conexion;
import clases.Metodos;
import com.toedter.calendar.JCalendar;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class busDescuentos extends javax.swing.JFrame {

    public busDescuentos() {
        initComponents();
        DESDE.setDate(new JCalendar().getDate());
        HASTA.setDate(new JCalendar().getDate());
        btn_buscar.doClick();
        
    }

    public static String busqueda = "";
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        grillaBuscador = new javax.swing.JTable();
        btn_buscar = new javax.swing.JButton();
        DESDE = new com.toedter.calendar.JDateChooser();
        HASTA = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        grillaBuscador.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Cód. Descuentos", "Fecha", "Estado", "Descripción", "Cód. Sucursal", "Sucursal", "Cód. Empleado", "Empleado"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 666, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(DESDE, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(HASTA, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_buscar)))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btn_buscar)
                        .addComponent(HASTA, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(DESDE, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
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
            case "descuentos":
                seleccionarDescuentos();
                break;
//            case "recepcion_desde_diagnostico":
//                seleccionarRecepDesdeDiagnostico();
//                break;
        }
      
    }//GEN-LAST:event_grillaBuscadorMouseClicked


    
    
    
    
    private void seleccionarDescuentos() {

        int fila = grillaBuscador.getSelectedRow();

        String cod = grillaBuscador.getValueAt(fila, 0).toString();
        String fecha = grillaBuscador.getValueAt(fila, 1).toString();
        String estado = grillaBuscador.getValueAt(fila, 2).toString();
        String descripcion = grillaBuscador.getValueAt(fila, 3).toString();
        String idsucursal = grillaBuscador.getValueAt(fila, 4).toString();
        String sucursal = grillaBuscador.getValueAt(fila, 5).toString();
        String idempleado = grillaBuscador.getValueAt(fila, 6).toString();
        String empleado = grillaBuscador.getValueAt(fila, 7).toString();

        if (busqueda.equals("descuentos")) {   //primero se realiza esta accion porque de otro modo vacia la variable "operacion"
            descuentos.txtCod.setText(cod);
            descuentos.txtEmpleadoCod.setText(idempleado);
            descuentos.txtEmpleadoDes.setText(empleado);
            descuentos.txtSucursal.setText(sucursal);
            descuentos.txtDescriDescuento.setText(descripcion);
            descuentos.txtCod.requestFocus();
            busqueda = "";

        }

        Conexion cn = new Conexion();

        try {
            cn.conectar();
            ResultSet detalles = cn.consultar("select * from v_descuentos_detalle where id_descuentos = " + cod + ""); //order by ordena de menor a mayor, si se quiere de mayor a menor se le agrega desc al final
            Metodos.limpiarTabla(descuentos.grilla);
            if (detalles.isBeforeFirst()) {
                while (detalles.next()) {
                    Metodos.cargarTabla(descuentos.grilla, new Object[]{
                        detalles.getString("id_tipo_trabajo"),
                        detalles.getString("descri_tipotrabajo"),
                        detalles.getString("porcentaje"),
                        detalles.getString("monto")
                        
                    });
                }
            } else {
                JOptionPane.showMessageDialog(null, "No hay registros en la base de datos");
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(busDescuentos.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "No se encuentra " + ex.getMessage());
        } catch (SQLException ex) {
            Logger.getLogger(busDescuentos.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(busDescuentos.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "No se encuentra " + ex.getMessage());
        } catch (SQLException ex) {
            Logger.getLogger(busDescuentos.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }

       // pedidoDeVenta.txtTotal.setText(String.valueOf(Metodos.sumarColumna(pedidoDeVenta.grilla, 4)));
        dispose();
    }
    
    
    
    
    
    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new busDescuentos().setVisible(true);
            }
        });
    }
    
   public void getDatos() {

        switch (busqueda) {
            case "descuentos":
                buscarDescuentos();
                break;
//            case "recepcion_desde_diagnostico":
//                buscarRecepcionNoUsadas();
//                break;


        }
    }

    /**
     * busca la tabla con pedidos
     */
    private void buscarDescuentos() {
        Conexion cn = new Conexion();
        try {
            cn.conectar();
            ResultSet recep = cn.consultar("select * from v_descuentos where fecha BETWEEN '" + Metodos.dameFechaFormateadaSQL(DESDE.getDate()) + "' and '"+Metodos.dameFechaFormateadaSQL(HASTA.getDate())+"' and estado !='ANULADO'  order by id_descuentos"); //order by ordena de menor a mayor, si se quiere de mayor a menor se le agrega desc al final
            Metodos.limpiarTabla(grillaBuscador);
            if (recep.isBeforeFirst()) {
                while (recep.next()) {
                    
                    Metodos.cargarTabla(grillaBuscador, new Object[]{recep.getString("id_descuentos"), recep.getString("fecha"),recep.getString("estado"), recep.getString("descuento_descri"),recep.getString("id_sucu"), recep.getString("sucur_nom"),recep.getString("id_empleado"), recep.getString("empleado")});
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
            ResultSet recep = cn.consultar("select * from v_recepcion where fecha BETWEEN '" + Metodos.dameFechaFormateadaSQL(DESDE.getDate()) + "' and '"+Metodos.dameFechaFormateadaSQL(HASTA.getDate())+"' and estado !='ANULADO' AND estado !='UTILIZADO' order by id_recepcion"); //order by ordena de menor a mayor, si se quiere de mayor a menor se le agrega desc al final
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
            Logger.getLogger(busDescuentos.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(busDescuentos.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(busDescuentos.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(busDescuentos.class.getName()).log(Level.SEVERE, null, ex);
        }
         return "";
         
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser DESDE;
    private com.toedter.calendar.JDateChooser HASTA;
    private javax.swing.JButton btn_buscar;
    private javax.swing.JTable grillaBuscador;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
