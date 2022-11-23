
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

public class busServiciosTerminados extends javax.swing.JFrame {

    public busServiciosTerminados() {
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
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Cod Servicio Terminado", "Descripción", "Fecha entrega", "Estado", "Estado cobro", "Cod Orden trabajo", "Cod Cliente", "Cliente", "Cod Empleado", "Empleado", "Cod Sucursal", "Sucursal"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true, true, false, false, false, false, false, false, false
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
            case "reclamos":
                seleccionarServiciosTermiDetalles();
                break;
            case "terminados":
                seleccionarTerminados();
                break;

//            case "recepcion_desde_diagnostico":
//                seleccionarRecepDesdeDiagnostico();
//                break;
        }
      
    }//GEN-LAST:event_grillaBuscadorMouseClicked


    
    
    
    
    private void seleccionarServiciosTermiDetalles() {

        int fila = grillaBuscador.getSelectedRow();

        String cod = grillaBuscador.getValueAt(fila, 0).toString();
        String descri = grillaBuscador.getValueAt(fila, 1).toString();
        String fechaEntrega = grillaBuscador.getValueAt(fila, 2).toString();
        String estado = grillaBuscador.getValueAt(fila, 3).toString();
        String estadoCobro = grillaBuscador.getValueAt(fila, 4).toString();
        String codOrdenTrabajo = grillaBuscador.getValueAt(fila, 5).toString();
        String codCliente = grillaBuscador.getValueAt(fila, 6).toString();
        String cliente = grillaBuscador.getValueAt(fila, 7).toString();
        String codEmpleado = grillaBuscador.getValueAt(fila, 8).toString();
        String empleado = grillaBuscador.getValueAt(fila, 9).toString();
        String codSucursal = grillaBuscador.getValueAt(fila, 10).toString();
        String sucursal = grillaBuscador.getValueAt(fila, 11).toString();

        if (busqueda.equals("reclamos")) {   //primero se realiza esta accion porque de otro modo vacia la variable "operacion"
            reclamos.txtServicioTerminado.setText(cod);
            reclamos.txtDescriServicioTermi.setText(descri);
            reclamos.txtClienteCodigo.setText(codCliente);
            reclamos.txtClienteDescri.setText(cliente);
            reclamos.txtEmpleadoCod.setText(codEmpleado);
            reclamos.txtEmpleadoDes.setText(empleado);


            reclamos.txtObs.requestFocus();
            busqueda = "";

        }

        Conexion cn = new Conexion();

        try {
            cn.conectar();
            ResultSet detalles = cn.consultar("select * from v_servis_terminados_detalles where id_servi_termi_cab = " + cod + ""); //order by ordena de menor a mayor, si se quiere de mayor a menor se le agrega desc al final
            Metodos.limpiarTabla(reclamos.grillaServiciosTerminados);
            if (detalles.isBeforeFirst()) {
                while (detalles.next()) {
                    Metodos.cargarTabla(reclamos.grillaServiciosTerminados, new Object[]{
                        detalles.getString("id_equipo"),
                        detalles.getString("desc_equipo"),
                        detalles.getString("id_tipo_trabajo"),
                        detalles.getString("descri_tipotrabajo"),
                        detalles.getString("cantidad")
                        
                    });
                }
            } else {
                JOptionPane.showMessageDialog(null, "No hay registros en la base de datos");
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(busServiciosTerminados.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "No se encuentra " + ex.getMessage());
        } catch (SQLException ex) {
            Logger.getLogger(busServiciosTerminados.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }




       dispose();
 
    }
    private void seleccionarTerminados() {

        int fila = grillaBuscador.getSelectedRow();

        String cod = grillaBuscador.getValueAt(fila, 0).toString();
        String descri = grillaBuscador.getValueAt(fila, 1).toString();
        String fechaEntrega = grillaBuscador.getValueAt(fila, 2).toString();
        String estado = grillaBuscador.getValueAt(fila, 3).toString();
        String estadoCobro = grillaBuscador.getValueAt(fila, 4).toString();
        String codOrdenTrabajo = grillaBuscador.getValueAt(fila, 5).toString();
        String codCliente = grillaBuscador.getValueAt(fila, 6).toString();
        String cliente = grillaBuscador.getValueAt(fila, 7).toString();
        String codEmpleado = grillaBuscador.getValueAt(fila, 8).toString();
        String empleado = grillaBuscador.getValueAt(fila, 9).toString();
        String codSucursal = grillaBuscador.getValueAt(fila, 10).toString();
        String sucursal = grillaBuscador.getValueAt(fila, 11).toString();

          //primero se realiza esta accion porque de otro modo vacia la variable "operacion"
            TrabajoTerminado.txtCod.setText(cod);
            TrabajoTerminado.txtClienteCodigo.setText(codCliente);
            TrabajoTerminado.txtObs.setText(cliente);
            TrabajoTerminado.txtEmpleadoCod.setText(codEmpleado);
            TrabajoTerminado.txtEmpleadoDes.setText(empleado);


            TrabajoTerminado.txtObs.requestFocus();
            busqueda = "";

        

        Conexion cn = new Conexion();

        try {
            cn.conectar();
            ResultSet detalles = cn.consultar("select * from v_servis_terminados_detalles where id_servi_termi_cab = " + cod + ""); //order by ordena de menor a mayor, si se quiere de mayor a menor se le agrega desc al final
            Metodos.limpiarTabla(TrabajoTerminado.grillaTerminados);
            if (detalles.isBeforeFirst()) {
                while (detalles.next()) {
                    Metodos.cargarTabla(TrabajoTerminado.grillaTerminados, new Object[]{
                        detalles.getString("id_equipo"),
                        detalles.getString("desc_equipo"),
                        detalles.getString("id_tipo_trabajo"),
                        detalles.getString("descri_tipotrabajo"),
                        detalles.getString("cantidad")
                        
                    });
                }
            } else {
                JOptionPane.showMessageDialog(null, "No hay registros en la base de datos");
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(busServiciosTerminados.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "No se encuentra " + ex.getMessage());
        } catch (SQLException ex) {
            Logger.getLogger(busServiciosTerminados.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex.getMessage());
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

        if (busqueda.equals("presupuesto")) {   //primero se realiza esta accion porque de otro modo vacia la variable "operacion"
            presupuestoServicios.txtCodDiagnostico.setText(cod);
            presupuestoServicios.txtObsDiagnostico.setText(obs);
            presupuestoServicios.txtEmpleadoCod.setText(codEmpleado);
            presupuestoServicios.txtEmpleadoDes.setText(empleado);
            presupuestoServicios.txtClienteCod.setText(codCliente);
            presupuestoServicios.txtClienteDesc.setText(cliente);


            presupuestoServicios.txtFechaVencimiento.requestFocus();
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
            Logger.getLogger(busServiciosTerminados.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "No se encuentra " + ex.getMessage());
        } catch (SQLException ex) {
            Logger.getLogger(busServiciosTerminados.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(busServiciosTerminados.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "No se encuentra " + ex.getMessage());
        } catch (SQLException ex) {
            Logger.getLogger(busServiciosTerminados.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }

       // pedidoDeVenta.txtTotal.setText(String.valueOf(Metodos.sumarColumna(pedidoDeVenta.grilla, 4)));
        dispose();
    }
    
    
    
    
    
    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new busServiciosTerminados().setVisible(true);
            }
        });
    }
    
   public void getDatos() {

        switch (busqueda) {
            case "reclamos":
                buscarServiciosTerminados();
                break;
            case "terminados":
                buscarServiciosTerminados();
                break;

//            case "recepcion_desde_diagnostico":
//                buscarRecepcionNoUsadas();
//                break;


        }
    }

    /**
     * busca la tabla con pedidos
     */
    private void buscarServiciosTerminados() {
        Conexion cn = new Conexion();
        try {
            cn.conectar();
            ResultSet servis = cn.consultar("select * from v_serviciosterminados where fecha_entrega BETWEEN '" + Metodos.dameFechaFormateadaSQL(DESDE.getDate()) + "' and '"+Metodos.dameFechaFormateadaSQL(HASTA.getDate())+"' and estado !='ANULADO'  order by id_servi_termi_cab"); //order by ordena de menor a mayor, si se quiere de mayor a menor se le agrega desc al final
            Metodos.limpiarTabla(grillaBuscador);
            if (servis.isBeforeFirst()) {
                while (servis.next()) {
                    
                    Metodos.cargarTabla(grillaBuscador, new Object[]{servis.getString("id_servi_termi_cab"), servis.getString("descri"),servis.getString("fecha_entrega"), servis.getString("estado"),servis.getString("estado_de_cobro"), servis.getString("id_orden_trabajo_cab"),servis.getString("id_cliente"), servis.getString("cliente"),servis.getString("id_empleado"), servis.getString("empleado"), servis.getString("id_sucursal"), servis.getString("sucur_nom")});
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
            Logger.getLogger(busServiciosTerminados.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(busServiciosTerminados.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(busServiciosTerminados.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(busServiciosTerminados.class.getName()).log(Level.SEVERE, null, ex);
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
