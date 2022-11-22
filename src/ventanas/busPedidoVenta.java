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

public class busPedidoVenta extends javax.swing.JFrame {

    public busPedidoVenta() {
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
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Código", "Fecha", "Estado", "Cliente", "Código Sucursal", "Código Usuario", "Código Empleado"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
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
            case "pediVenta":
                seleccionarPedido();
                break;
            case "pedido_desdePresupuesto":
                seleccionarPedidoDetalle();
                break;
            case "presupuesto_desde_orden":
                seleccionarPresupuestoTrabajo();
                break;
        }

    }//GEN-LAST:event_grillaBuscadorMouseClicked

    private void seleccionarPedidoDetalle() {
        int fila = grillaBuscador.getSelectedRow();

        String cod = grillaBuscador.getValueAt(fila, 0).toString();
        String fecha = grillaBuscador.getValueAt(fila, 1).toString();
        String descri = grillaBuscador.getValueAt(fila, 2).toString();
        String estado = grillaBuscador.getValueAt(fila, 3).toString();
        String codSucu = grillaBuscador.getValueAt(fila, 4).toString();
        String codUsu = grillaBuscador.getValueAt(fila, 5).toString();

        if (busqueda.equals("pedido_desdePresupuesto")) {   //primero se realiza esta accion porque de otro modo vacia la variable "operacion"
            presupuesto_de_compra.txtPedido_compra.setText(cod);

            busqueda = "";

            Conexion cn = new Conexion();

            try {
                cn.conectar();
                ResultSet detalles = cn.consultar("select * from v_detalle_pedido_compra where ped_id = " + cod + ""); //order by ordena de menor a mayor, si se quiere de mayor a menor se le agrega desc al final
                Metodos.limpiarTabla(presupuesto_de_compra.grilla);
                if (detalles.isBeforeFirst()) {
                    while (detalles.next()) {
                        Metodos.cargarTabla(presupuesto_de_compra.grilla, new Object[]{
                            detalles.getString("cod_materia"),
                            detalles.getString("mat_desc"),
                            detalles.getString("cantidad"),
                            detalles.getString("precio"),
                            detalles.getString("precio"),
                            (Integer.parseInt(detalles.getString("precio")) * Integer.parseInt(detalles.getString("cantidad")))
                        });
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "No hay registros en la base de datos");
                }
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(busPedidoVenta.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, "No se encuentra " + ex.getMessage());
            } catch (SQLException ex) {
                Logger.getLogger(busPedidoVenta.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }

            presupuesto_de_compra.txtTotal.setText(String.valueOf(Metodos.sumarColumna(presupuesto_de_compra.grilla, 4)));
            presupuesto_de_compra.txtPedido_compra.requestFocus();
            dispose();
        }
    }

    private void seleccionarPresupuestoTrabajo() {
        int fila = grillaBuscador.getSelectedRow();

        String cod = grillaBuscador.getValueAt(fila, 0).toString();
        String fecha = grillaBuscador.getValueAt(fila, 1).toString();
        String descri = grillaBuscador.getValueAt(fila, 2).toString();
        String cliente = grillaBuscador.getValueAt(fila, 3).toString();
        String codSucu = grillaBuscador.getValueAt(fila, 4).toString();
        String codUsu = grillaBuscador.getValueAt(fila, 5).toString();

        if (busqueda.equals("pedido_desdePresupuesto")) {   //primero se realiza esta accion porque de otro modo vacia la variable "operacion"
            presupuesto_de_compra.txtPedido_compra.setText(cod);

            busqueda = "";

            Conexion cn = new Conexion();

            try {
                cn.conectar();
                ResultSet detalles = cn.consultar("select * from v_detalle_pedido_compra where ped_id = " + cod + ""); //order by ordena de menor a mayor, si se quiere de mayor a menor se le agrega desc al final
                Metodos.limpiarTabla(presupuesto_de_compra.grilla);
                if (detalles.isBeforeFirst()) {
                    while (detalles.next()) {
                        Metodos.cargarTabla(presupuesto_de_compra.grilla, new Object[]{
                            detalles.getString("cod_materia"),
                            detalles.getString("mat_desc"),
                            detalles.getString("cantidad"),
                            detalles.getString("precio"),
                            detalles.getString("precio"),
                            (Integer.parseInt(detalles.getString("precio")) * Integer.parseInt(detalles.getString("cantidad")))
                        });
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "No hay registros en la base de datos");
                }
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(busPedidoVenta.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, "No se encuentra " + ex.getMessage());
            } catch (SQLException ex) {
                Logger.getLogger(busPedidoVenta.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }

            presupuesto_de_compra.txtTotal.setText(String.valueOf(Metodos.sumarColumna(presupuesto_de_compra.grilla, 4)));
            presupuesto_de_compra.txtPedido_compra.requestFocus();
            dispose();
        }

        //------------------------------------------------------------------------------------
        //------------------------------------------------------------------------------------
        //------------------------------------------------------------------------------------
        if (busqueda.equals("presupuesto_desde_orden")) {   //primero se realiza esta accion porque de otro modo vacia la variable "operacion"
            

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
                        + "ON e.id_equipo =  pd.id_equipo\n"
                        + "WHERE pd.id_presupuesto_reparacion_cab = " + cod + ""); //order by ordena de menor a mayor, si se quiere de mayor a menor se le agrega desc al final
                
                ResultSet cabecera = cn.consultar("SELECT\n"
                        + "pc.id_presupuesto_reparacion_cab,\n"
                        + "pc.id_cliente\n"
                        + "FROM presupuesto_servicio_cabecera pc\n"
                        + "WHERE pc.id_presupuesto_reparacion_cab = " + cod + ""); 
                cabecera.next();
                orden_trabajo.txtCodCliente.setText(cabecera.getString("id_cliente"));
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
                Logger.getLogger(busPedidoVenta.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, "No se encuentra " + ex.getMessage());
            } catch (SQLException ex) {
                Logger.getLogger(busPedidoVenta.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }

            orden_trabajo.txtPresupuesto.setText(cod);
            orden_trabajo.txtTotal.setText(String.valueOf(Metodos.sumarColumna(orden_trabajo.grilla, 6)));
            orden_trabajo.txtNombreCliente.setText(cliente);
            orden_trabajo.txtPresupuesto.requestFocus();
            dispose();
        }
    }

    private void seleccionarPedido() {

        int fila = grillaBuscador.getSelectedRow();

        String cod = grillaBuscador.getValueAt(fila, 0).toString();
        String fecha = grillaBuscador.getValueAt(fila, 1).toString();
        String estado = grillaBuscador.getValueAt(fila, 2).toString();
        String cliente = grillaBuscador.getValueAt(fila, 3).toString();
        String codSucu = grillaBuscador.getValueAt(fila, 4).toString();
        String codUsu = grillaBuscador.getValueAt(fila, 5).toString();
        String codEmpleado = grillaBuscador.getValueAt(fila, 6).toString();

        if (busqueda.equals("pediVenta")) {   //primero se realiza esta accion porque de otro modo vacia la variable "operacion"
            pedidoDeVenta.txtCod.setText(cod);
            pedidoDeVenta.txt_cod_cliente.setText(cliente);
//           pedido_de_compra.txtFecha.setDate(fecha);
            pedidoDeVenta.txtCod.requestFocus();
            busqueda = "";

        }

        Conexion cn = new Conexion();

        try {
            cn.conectar();
            ResultSet detalles = cn.consultar("select * from v_detalle_pedido_venta where cod_pedi_ven = " + cod + ""); //order by ordena de menor a mayor, si se quiere de mayor a menor se le agrega desc al final
            Metodos.limpiarTabla(pedidoDeVenta.grilla);
            if (detalles.isBeforeFirst()) {
                while (detalles.next()) {
                    Metodos.cargarTabla(pedidoDeVenta.grilla, new Object[]{
                        detalles.getString("pro_cod"),
                        detalles.getString("pro_desc"),
                        detalles.getString("cantidad"),
                        detalles.getString("ped_precio"),
                        (Integer.parseInt(detalles.getString("ped_precio")) * Integer.parseInt(detalles.getString("cantidad")))
                    });
                }
            } else {
                JOptionPane.showMessageDialog(null, "No hay registros en la base de datos");
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(busPedidoVenta.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "No se encuentra " + ex.getMessage());
        } catch (SQLException ex) {
            Logger.getLogger(busPedidoVenta.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }

        pedidoDeVenta.txtTotal.setText(String.valueOf(Metodos.sumarColumna(pedidoDeVenta.grilla, 4)));
        dispose();
    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new busPedidoVenta().setVisible(true);
            }
        });
    }

    public void getDatos() {

        switch (busqueda) {
            case "pediVenta":
                buscarPedido();
                break;
            case "presupuesto_desde_orden":
                buscarPresupuestoTrabajo();
                break;

        }
    }

    private void buscarPresupuestoTrabajo() {
        Conexion cn = new Conexion();
        try {
            cn.conectar();
            ResultSet pedi = cn.consultar("SELECT\n"
                    + "p.id_presupuesto_reparacion_cab,\n"
                    + "p.fecha,\n"
                    + "p.presu_descri,\n"
                    + "s.sucur_nom,\n"
                    + "e.emp_nom||' '||e.emp_ape as empleado,\n"
                    + "c.cli_nomb||' '||c.cli_apelli as cliente,\n"
                    + "p.estado,\n"
                    + "p.id_empleado,\n"
                    + "p.id_cliente,\n"
                    + "p.id_sucu\n"
                    + "FROM presupuesto_servicio_cabecera p \n"
                    + "JOIN sucursal s\n"
                    + "ON s.sucur_id = p.id_sucu\n"
                    + "JOIN empleado e\n"
                    + "ON e.emp_id =  p.id_empleado\n"
                    + "JOIN cliente c \n"
                    + "ON c.cli_cod = p.id_cliente "
                    + "WHERE p.estado LIKE 'ACTIVO' "); //order by ordena de menor a mayor, si se quiere de mayor a menor se le agrega desc al final
            Metodos.limpiarTabla(grillaBuscador);
//
//            System.out.println(grillaBuscador.getColumnCount());
//            if (grillaBuscador.getColumnCount() > 8) {
//                grillaBuscador.getColumnModel().removeColumn(grillaBuscador.getColumnModel().getColumn(grillaBuscador.getColumnCount() - 1));
//            }
            if (pedi.isBeforeFirst()) {
                while (pedi.next()) {
                    Metodos.cargarTabla(grillaBuscador, new Object[]{
                        pedi.getString("id_presupuesto_reparacion_cab"),
                        pedi.getString("fecha"),
                        pedi.getString("estado"),
                        pedi.getString("cliente"),
                        pedi.getString("id_sucu"),
                        "-",
                        pedi.getString("id_empleado")
                    });
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
    private void buscarPedido() {
        Conexion cn = new Conexion();
        try {
            cn.conectar();
            ResultSet pedi = cn.consultar("select * from pedido_venta where fecha BETWEEN '" + Metodos.dameFechaFormateadaSQL(DESDE.getDate()) + "' and '" + Metodos.dameFechaFormateadaSQL(HASTA.getDate()) + "' and estado !='ANULADO' order by cod_pedi_ven"); //order by ordena de menor a mayor, si se quiere de mayor a menor se le agrega desc al final
            Metodos.limpiarTabla(grillaBuscador);
            if (pedi.isBeforeFirst()) {
                while (pedi.next()) {

                    Metodos.cargarTabla(grillaBuscador, new Object[]{pedi.getString("cod_pedi_ven"), pedi.getString("fecha"), pedi.getString("estado"), pedi.getString("cli_cod"), pedi.getString("sucur_id"), pedi.getString("usu_id"), pedi.getString("emp_id")});
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
    private String dameNombrePorCodido(String codigo) {
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
            Logger.getLogger(busPedidoVenta.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(busPedidoVenta.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(busPedidoVenta.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(busPedidoVenta.class.getName()).log(Level.SEVERE, null, ex);
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
