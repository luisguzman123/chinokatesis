
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
import static ventanas.diagnostico.grillaDiagnostico;
import static ventanas.diagnostico.txtRecepcionCod;

public class busDiagnostico extends javax.swing.JFrame {

    public busDiagnostico() {
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
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Código Diagnóstico", "Fecha", "Estado", "Observaciones", "Código Recepción", "Código Empleado", "Empleado", "Código Cliente", "Cliente", "Código Sucursal", "Sucursal"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true, true, false, false, false, false, false, false
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(DESDE, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(HASTA, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_buscar)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 981, Short.MAX_VALUE))
                .addContainerGap())
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
            case "diagnostico":
                seleccionarDiagnostico();
                break;
            case "presupuesto":
                seleccionarDiagnosticoDesdePresupuesto();
                break;
//            case "recepcion_desde_diagnostico":
//                seleccionarRecepDesdeDiagnostico();
//                break;
        }
      
    }//GEN-LAST:event_grillaBuscadorMouseClicked


    
    
    
    
    private void seleccionarDiagnostico() {

        int fila = grillaBuscador.getSelectedRow();

        String cod = grillaBuscador.getValueAt(fila, 0).toString();
        String fecha = grillaBuscador.getValueAt(fila, 1).toString();
        String estado = grillaBuscador.getValueAt(fila, 2).toString();
        String obs = grillaBuscador.getValueAt(fila, 3).toString();
        String codRecepcion = grillaBuscador.getValueAt(fila, 4).toString();
        String codEmpleado = grillaBuscador.getValueAt(fila, 5).toString();
        String empleado = grillaBuscador.getValueAt(fila, 6).toString();
        String codCliente = grillaBuscador.getValueAt(fila, 7).toString();
        String cliente = grillaBuscador.getValueAt(fila, 8).toString();
        String codSucursal = grillaBuscador.getValueAt(fila, 9).toString();
        String sucursal = grillaBuscador.getValueAt(fila, 10).toString();

        if (busqueda.equals("diagnostico")) {   //primero se realiza esta accion porque de otro modo vacia la variable "operacion"
            diagnostico.txtCod.setText(cod);
            diagnostico.txtSucursal.setText(sucursal);
            diagnostico.txtRecepcionCod.setText(codRecepcion);
            diagnostico.txtEmpleadoCod.setText(codEmpleado);
            diagnostico.txtEmpleadoDes.setText(empleado);
            diagnostico.txtClienteCod.setText(codCliente);
            diagnostico.txtClienteDesc.setText(cliente);
            diagnostico.txtObservaciones.setText(obs);


            diagnostico.txtCod.requestFocus();
            busqueda = "";

        }

        Conexion cn = new Conexion();

        try {
            cn.conectar();
            ResultSet detalles = cn.consultar("select * from v_diagnostico_detalle where id_diagnostico_cabecera = " + cod + ""); //order by ordena de menor a mayor, si se quiere de mayor a menor se le agrega desc al final
            Metodos.limpiarTabla(diagnostico.grillaDiagnostico);
            if (detalles.isBeforeFirst()) {
                while (detalles.next()) {
                    Metodos.cargarTabla(diagnostico.grillaDiagnostico, new Object[]{
                        detalles.getString("id_equipo"),
                        detalles.getString("desc_equipo"),
                        "-",
                        "-",
                        "-",
//                        Metodos.traerCantidadDetalleRecepcion(detalles.getString("id_equipo"), cod),
//                        Metodos.traerSerieDetallesRecepcion(detalles.getString("id_equipo"), cod),
//                        Metodos.traerDescDetallesRecepcion(detalles.getString("id_equipo"), cod),
                        detalles.getString("id_tipo_problema"),
                        detalles.getString("tipo_proble_descri"),
                        detalles.getString("cantidad")
                        
                    });
                }
            } else {
                JOptionPane.showMessageDialog(null, "No hay registros en la base de datos");
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(busDiagnostico.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "No se encuentra " + ex.getMessage());
        } catch (SQLException ex) {
            Logger.getLogger(busDiagnostico.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }


        for (int filaa = 0; filaa <diagnostico.grillaDiagnostico.getRowCount(); filaa++) {
            String codigoEnRenglon = (String)diagnostico.grillaDiagnostico.getValueAt(filaa, 0);
                diagnostico.grillaDiagnostico.setValueAt(Metodos.traerCantidadDetalleRecepcion(codigoEnRenglon,diagnostico.txtRecepcionCod.getText()), filaa, 2);
                diagnostico.grillaDiagnostico.setValueAt(Metodos.traerSerieDetallesRecepcion(codigoEnRenglon,diagnostico.txtRecepcionCod.getText()), filaa, 3);
                diagnostico.grillaDiagnostico.setValueAt(Metodos.traerDescDetallesRecepcion(codigoEnRenglon,diagnostico.txtRecepcionCod.getText()), filaa, 4);
        }
       

       dispose();
 
    }
    private void seleccionarDiagnosticoDesdePresupuesto() {

        int fila = grillaBuscador.getSelectedRow();

        String cod = grillaBuscador.getValueAt(fila, 0).toString();
        String fecha = grillaBuscador.getValueAt(fila, 1).toString();
        String estado = grillaBuscador.getValueAt(fila, 2).toString();
        String obs = grillaBuscador.getValueAt(fila, 3).toString();
        String codRecepcion = grillaBuscador.getValueAt(fila, 4).toString();
        String codEmpleado = grillaBuscador.getValueAt(fila, 5).toString();
        String empleado = grillaBuscador.getValueAt(fila, 6).toString();
        String codCliente = grillaBuscador.getValueAt(fila, 7).toString();
        String cliente = grillaBuscador.getValueAt(fila, 8).toString();
        String codSucursal = grillaBuscador.getValueAt(fila, 9).toString();
        String sucursal = grillaBuscador.getValueAt(fila, 10).toString();

        if (busqueda.equals("diagnostico")) {   //primero se realiza esta accion porque de otro modo vacia la variable "operacion"
            diagnostico.txtCod.setText(cod);
            diagnostico.txtSucursal.setText(sucursal);
            diagnostico.txtRecepcionCod.setText(codRecepcion);
            diagnostico.txtEmpleadoCod.setText(codEmpleado);
            diagnostico.txtEmpleadoDes.setText(empleado);
            diagnostico.txtClienteCod.setText(codCliente);
            diagnostico.txtClienteDesc.setText(cliente);
            diagnostico.txtObservaciones.setText(obs);


            diagnostico.txtCod.requestFocus();
            busqueda = "";

        }

        Conexion cn = new Conexion();

        try {
            cn.conectar();
            ResultSet detalles = cn.consultar("select * from v_diagnostico_detalle where id_diagnostico_cabecera = " + cod + ""); //order by ordena de menor a mayor, si se quiere de mayor a menor se le agrega desc al final
            Metodos.limpiarTabla(presupuestoServicios.grillaDiagnostico);
            if (detalles.isBeforeFirst()) {
                while (detalles.next()) {
                    Metodos.cargarTabla(presupuestoServicios.grillaDiagnostico, new Object[]{
                        detalles.getString("id_equipo"),
                        detalles.getString("desc_equipo"),
//                        Metodos.traerCantidadDetalleRecepcion(detalles.getString("id_equipo"), cod),
//                        Metodos.traerSerieDetallesRecepcion(detalles.getString("id_equipo"), cod),
//                        Metodos.traerDescDetallesRecepcion(detalles.getString("id_equipo"), cod),
                        detalles.getString("id_tipo_problema"),
                        detalles.getString("tipo_proble_descri"),
                        detalles.getString("cantidad")
                        
                    });
                }
            } else {
                JOptionPane.showMessageDialog(null, "No hay registros en la base de datos");
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(busDiagnostico.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "No se encuentra " + ex.getMessage());
        } catch (SQLException ex) {
            Logger.getLogger(busDiagnostico.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }


//        for (int filaa = 0; filaa <presupuestoServicios.grillaDiagnostico.getRowCount(); filaa++) {
//            String codigoEnRenglon = (String)presupuestoServicios.grillaDiagnostico.getValueAt(filaa, 0);
//                presupuestoServicios.grillaDiagnostico.setValueAt(Metodos.traerCantidadDetalleDiag(codigoEnRenglon,diagnostico.txtRecepcionCod.getText()), filaa, 2);
//                presupuestoServicios.grillaDiagnostico.setValueAt(Metodos.traerSerieDetallesRecepcion(codigoEnRenglon,diagnostico.txtRecepcionCod.getText()), filaa, 3);
//                presupuestoServicios.grillaDiagnostico.setValueAt(Metodos.traerDescDetallesRecepcion(codigoEnRenglon,diagnostico.txtRecepcionCod.getText()), filaa, 4);
//        }
       

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
            Logger.getLogger(busDiagnostico.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "No se encuentra " + ex.getMessage());
        } catch (SQLException ex) {
            Logger.getLogger(busDiagnostico.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }

       // pedidoDeVenta.txtTotal.setText(String.valueOf(Metodos.sumarColumna(pedidoDeVenta.grilla, 4)));
        dispose();
    }
    
    
    
    
    
    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new busDiagnostico().setVisible(true);
            }
        });
    }
    
   public void getDatos() {

        switch (busqueda) {
            case "diagnostico":
                buscarDiagnostico();
                break;
            case "presupuesto":
                buscarDiagnostico();
                break;
//            case "recepcion_desde_diagnostico":
//                buscarRecepcionNoUsadas();
//                break;


        }
    }

    /**
     * busca la tabla con pedidos
     */
    private void buscarDiagnostico() {
        Conexion cn = new Conexion();
        try {
            cn.conectar();
            ResultSet diagnos = cn.consultar("select * from v_diagnostico where fecha BETWEEN '" + Metodos.dameFechaFormateadaSQL(DESDE.getDate()) + "' and '"+Metodos.dameFechaFormateadaSQL(HASTA.getDate())+"' and estado !='ANULADO'  order by id_diagnostico_cabecera"); //order by ordena de menor a mayor, si se quiere de mayor a menor se le agrega desc al final
            Metodos.limpiarTabla(grillaBuscador);
            if (diagnos.isBeforeFirst()) {
                while (diagnos.next()) {
                    
                    Metodos.cargarTabla(grillaBuscador, new Object[]{diagnos.getString("id_diagnostico_cabecera"), diagnos.getString("fecha"),diagnos.getString("estado"), diagnos.getString("defecto_encontrado"),diagnos.getString("id_recepcion"), diagnos.getString("emp_id"),diagnos.getString("empleado"), diagnos.getString("cli_cod"),diagnos.getString("cliente"),diagnos.getString("sucur_id"), diagnos.getString("sucur_nom")});
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
            Logger.getLogger(busDiagnostico.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(busDiagnostico.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(busDiagnostico.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(busDiagnostico.class.getName()).log(Level.SEVERE, null, ex);
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
