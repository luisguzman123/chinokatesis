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

public class busOrdenTrabajo2 extends javax.swing.JFrame {

    public busOrdenTrabajo2() {
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
                "Código", "Fecha", "Vencimiento", "Estado", "Prioridad", "Código Empleado", "Empleado", "Código Cliente", "Cliente", "Código Sucursal", "Sucursal", "Observacion"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        grillaBuscador.getTableHeader().setReorderingAllowed(false);
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
            case "orden_trabajo":
                seleccionarOrdenTrabajo();
                break;
            case "orden_para_terminados":
                seleccionarOrdenTrabajoTerminados();
                break;
        }

    }//GEN-LAST:event_grillaBuscadorMouseClicked

    private void seleccionarOrdenTrabajo() {

        int fila = grillaBuscador.getSelectedRow();

        String cod = grillaBuscador.getValueAt(fila, 0).toString();
        String fecha = grillaBuscador.getValueAt(fila, 1).toString();
        String estado = grillaBuscador.getValueAt(fila, 2).toString();
        String obs = grillaBuscador.getValueAt(fila, 3).toString();
        String codRecepcion = grillaBuscador.getValueAt(fila, 4).toString();
        String codEmpleado = grillaBuscador.getValueAt(fila, 5).toString();
        String empleado = grillaBuscador.getValueAt(fila, 6).toString();
        String codCliente = grillaBuscador.getValueAt(fila, 5).toString();
        String cliente = grillaBuscador.getValueAt(fila, 6).toString();
        String codSucursal = grillaBuscador.getValueAt(fila, 9).toString();
        String sucursal = grillaBuscador.getValueAt(fila, 10).toString();

        if (busqueda.equals("orden_trabajo")) {   //primero se realiza esta accion porque de otro modo vacia la variable "operacion"
            
            busqueda = "";

            Conexion cn = new Conexion();

            try {
                cn.conectar();
                ResultSet detalles = cn.consultar("SELECT \n"
                        + "pd.id_equipo,\n"
                        + "e.desc_equipo,\n"
                        + "pd.id_tipo_trabajo,\n"
                        + "tt.descri_tipotrabajo,\n"
                        + "pd.cantidad,\n"
                        + "pd.monto,\n"
                        + "pd.cantidad * pd.monto as total\n"
                        + "FROM presupuesto_servicio_detalle pd\n"
                        + "JOIN tipos_trabajos tt\n"
                        + "ON tt.id_tipo_trabajo = pd.id_tipo_trabajo\n"
                        + "JOIN equipos e\n"
                        + "ON e.id_equipo =  pd.id_equipo\n "
                        + "JOIN orden_trabajo_cabecera o "
                        + "ON pd.id_presupuesto_reparacion_cab = o.id_presupuesto_reparacion_cab "
                        + "WHERE o.id_orden_trabajo_cab = " + cod + ""); //order by ordena de menor a mayor, si se quiere de mayor a menor se le agrega desc al final
                
                ResultSet cabecera = cn.consultar("SELECT\n"
                        + "pc.id_presupuesto_reparacion_cab,\n"
                        + "pc.id_cliente\n"
                        + "FROM presupuesto_servicio_cabecera pc "
                        + "JOIN orden_trabajo_cabecera o "
                        + "ON pc.id_presupuesto_reparacion_cab = o.id_presupuesto_reparacion_cab "
                        + "WHERE o.id_orden_trabajo_cab = " + cod + ""); 
                cabecera.next();
                orden_trabajo.txtCodCliente.setText(codCliente);
                orden_trabajo.txtNombreCliente.setText(cliente);
                Metodos.limpiarTabla(orden_trabajo.grilla);
                if (detalles.isBeforeFirst()) {
                    while (detalles.next()) {
                        Metodos.cargarTabla(orden_trabajo.grilla, new Object[]{
                            detalles.getString("id_equipo"),
                            detalles.getString("desc_equipo"),
                            detalles.getString("id_tipo_trabajo"),
                            detalles.getString("descri_tipotrabajo"),
                            detalles.getString("cantidad"),
                            detalles.getString("monto"),
                            detalles.getString("total")

                        });
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "No hay registros en la base de datos");
                }
            } catch (ClassNotFoundException ex) {
               
                JOptionPane.showMessageDialog(null, "No se encuentra " + ex.getMessage());
            } catch (SQLException ex) {
                
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }

            orden_trabajo.txtCod.setText(cod);
            orden_trabajo.txtTotal.setText(String.valueOf(Metodos.sumarColumna(orden_trabajo.grilla, 6)));
            orden_trabajo.txtNombreCliente.setText(cliente);
            
            
            
            dispose();

        }

        

    }
    private void seleccionarOrdenTrabajoTerminados() {

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

           //primero se realiza esta accion porque de otro modo vacia la variable "operacion"
            
            busqueda = "";

            Conexion cn = new Conexion();

            try {
                cn.conectar();
                ResultSet detalles = cn.consultar("SELECT \n"
                        + "pd.id_equipo,\n"
                        + "e.desc_equipo,\n"
                        + "pd.id_tipo_trabajo,\n"
                        + "tt.descri_tipotrabajo,\n"
                        + "pd.cantidad,\n"
                        + "pd.monto,\n"
                        + "pd.cantidad * pd.monto as total\n"
                        + "FROM presupuesto_servicio_detalle pd\n"
                        + "JOIN tipos_trabajos tt\n"
                        + "ON tt.id_tipo_trabajo = pd.id_tipo_trabajo\n"
                        + "JOIN equipos e\n"
                        + "ON e.id_equipo =  pd.id_equipo\n "
                        + "JOIN orden_trabajo_cabecera o "
                        + "ON pd.id_presupuesto_reparacion_cab = o.id_presupuesto_reparacion_cab "
                        + "WHERE o.id_orden_trabajo_cab = " + cod + ""); //order by ordena de menor a mayor, si se quiere de mayor a menor se le agrega desc al final
                
                ResultSet cabecera = cn.consultar("SELECT\n"
                        + "pc.id_presupuesto_reparacion_cab,\n"
                        + "pc.id_cliente\n"
                        + "FROM presupuesto_servicio_cabecera pc "
                        + "JOIN orden_trabajo_cabecera o "
                        + "ON pc.id_presupuesto_reparacion_cab = o.id_presupuesto_reparacion_cab "
                        + "WHERE o.id_orden_trabajo_cab = " + cod + ""); 
                cabecera.next();
                TrabajoTerminado.txtClienteCodigo.setText(codCliente);
                TrabajoTerminado.txtClienteDescri.setText(cliente);
                TrabajoTerminado.txtEmpleadoCod.setText(codEmpleado);
                TrabajoTerminado.txtEmpleadoDes.setText(empleado);
                Metodos.limpiarTabla(TrabajoTerminado.grillaOrdenes);
                if (detalles.isBeforeFirst()) {
                    while (detalles.next()) {
                        Metodos.cargarTabla(TrabajoTerminado.grillaOrdenes, new Object[]{
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
               
                JOptionPane.showMessageDialog(null, "No se encuentra " + ex.getMessage());
            } catch (SQLException ex) {
                
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }

            TrabajoTerminado.txtOrdenTrabajo.setText(cod);
            
           
            
            
            
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
            Logger.getLogger(busOrdenTrabajo2.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "No se encuentra " + ex.getMessage());
        } catch (SQLException ex) {
            Logger.getLogger(busOrdenTrabajo2.class.getName()).log(Level.SEVERE, null, ex);
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

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new busOrdenTrabajo2().setVisible(true);
            }
        });
    }

    public void getDatos() {

        switch (busqueda) {
            case "orden_trabajo":
                buscarOrdenTrabajo();
                break;
            case "orden_para_terminados":
                buscarOrdenTrabajoTerminados();
                break;

        }
    }

    /**
     * busca la tabla con pedidos
     */
    private void buscarOrdenTrabajo() {
        Conexion cn = new Conexion();
        try {
            cn.conectar();
            ResultSet diagnos = cn.consultar("SELECT \n"
                    + "o.id_orden_trabajo_cab,\n"
                    + "o.fecha_inicio,\n"
                    + "o.fecha_fin,\n"
                    + "o.prioridad,\n"
                    + "o.id_empleado,\n"
                    + "e.emp_nom ||' '||e.emp_ape as empleado,\n"
                    + "c.cli_cod,\n"
                    + "c.cli_nomb||' '||c.cli_apelli as cliente,\n"
                    + "s.sucur_id,\n"
                    + "s.sucur_nom,\n"
                    + "o.observacion,"
                    + "o.estado \n"
                    + "FROM orden_trabajo_cabecera o\n"
                    + "JOIN empleado e\n"
                    + "ON e.emp_id =  o.id_empleado\n"
                    + "JOIN sucursal s\n"
                    + "ON s.sucur_id = o.id_sucursal\n"
                    + "JOIN presupuesto_servicio_cabecera p\n"
                    + "ON p.id_presupuesto_reparacion_cab = o.id_presupuesto_reparacion_cab\n"
                    + "JOIN cliente c\n"
                    + "ON c.cli_cod = p.id_cliente\n"
                    + "WHERE o.fecha_inicio "
                    + "BETWEEN '" + Metodos.dameFechaFormateadaSQL(DESDE.getDate()) + "' and '" + Metodos.dameFechaFormateadaSQL(HASTA.getDate()) + 
                    "' and o.estado = 'ACTIVO'  order by o.id_orden_trabajo_cab"); //order by ordena de menor a mayor, si se quiere de mayor a menor se le agrega desc al final
            Metodos.limpiarTabla(grillaBuscador);
            if (diagnos.isBeforeFirst()) {
                while (diagnos.next()) {

                    Metodos.cargarTabla(grillaBuscador, new Object[]{
                        diagnos.getString("id_orden_trabajo_cab"),
                        diagnos.getString("fecha_inicio"),
                        diagnos.getString("fecha_fin"),
                        diagnos.getString("estado"),
                        diagnos.getString("prioridad"),
                        diagnos.getString("id_empleado"),
                        diagnos.getString("empleado"),
                        diagnos.getString("cliente"),
                        diagnos.getString("cli_cod"),
                        diagnos.getString("sucur_id"),
                        diagnos.getString("sucur_nom"),
                        diagnos.getString("observacion")});
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
    
    private void buscarOrdenTrabajoTerminados() {
        Conexion cn = new Conexion();
        try {
            cn.conectar();
            ResultSet diagnos = cn.consultar("SELECT \n"
                    + "o.id_orden_trabajo_cab,\n"
                    + "o.fecha_inicio,\n"
                    + "o.fecha_fin,\n"
                    + "o.prioridad,\n"
                    + "o.id_empleado,\n"
                    + "e.emp_nom ||' '||e.emp_ape as empleado,\n"
                    + "c.cli_cod,\n"
                    + "c.cli_nomb||' '||c.cli_apelli as cliente,\n"
                    + "s.sucur_id,\n"
                    + "s.sucur_nom,\n"
                    + "o.observacion,"
                    + "o.estado \n"
                    + "FROM orden_trabajo_cabecera o\n"
                    + "JOIN empleado e\n"
                    + "ON e.emp_id =  o.id_empleado\n"
                    + "JOIN sucursal s\n"
                    + "ON s.sucur_id = o.id_sucursal\n"
                    + "JOIN presupuesto_servicio_cabecera p\n"
                    + "ON p.id_presupuesto_reparacion_cab = o.id_presupuesto_reparacion_cab\n"
                    + "JOIN cliente c\n"
                    + "ON c.cli_cod = p.id_cliente\n"
                    + "WHERE o.fecha_inicio "
                    + "BETWEEN '" + Metodos.dameFechaFormateadaSQL(DESDE.getDate()) + "' and '" + Metodos.dameFechaFormateadaSQL(HASTA.getDate()) + 
                    "' and o.estado = 'ACTIVO'  order by o.id_orden_trabajo_cab"); //order by ordena de menor a mayor, si se quiere de mayor a menor se le agrega desc al final
            Metodos.limpiarTabla(grillaBuscador);
            if (diagnos.isBeforeFirst()) {
                while (diagnos.next()) {

                    Metodos.cargarTabla(grillaBuscador, new Object[]{
                        diagnos.getString("id_orden_trabajo_cab"),
                        diagnos.getString("fecha_inicio"),
                        diagnos.getString("fecha_fin"),
                        diagnos.getString("estado"),
                        diagnos.getString("prioridad"),
                        diagnos.getString("id_empleado"),
                        diagnos.getString("empleado"),
                        diagnos.getString("cli_cod"),
                        diagnos.getString("cliente"),
                        diagnos.getString("sucur_id"),
                        diagnos.getString("sucur_nom"),
                        diagnos.getString("observacion")});
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
    private String dameNombrePorCodigo(String codigo) {
        try {
            Conexion cn = new Conexion();
            cn.conectar();
            ResultSet detalles = cn.consultar("select pro_nom from proveedor where pro_id =  " + codigo);
            if (detalles.isBeforeFirst()) {
                while (detalles.next()) {
                    return detalles.getString("pro_nom");

                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(busOrdenTrabajo2.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(busOrdenTrabajo2.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "";

    }

    private String dameIva(String codigo) {
        try {
            Conexion cn = new Conexion();
            cn.conectar();
            ResultSet detalles = cn.consultar("select iva from materia_prima where cod_materia =  " + codigo);
            if (detalles.isBeforeFirst()) {
                while (detalles.next()) {
                    return detalles.getString("iva");

                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(busOrdenTrabajo2.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(busOrdenTrabajo2.class.getName()).log(Level.SEVERE, null, ex);
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
