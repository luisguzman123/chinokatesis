package ventanas;

import clases.Conexion;
import clases.Metodos;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class busPedidoCompra extends javax.swing.JFrame {

    public busPedidoCompra() {
        initComponents();
        iniciarComponentes();
        btn_buscar.doClick();
    }

    private void iniciarComponentes() {
        if (busqueda.equals("orden_compra")) {

            DefaultTableModel modelo = (DefaultTableModel) grillaBuscador.getModel();

            modelo.addColumn("Código Proveedor");
            grillaBuscador.setModel(modelo);
        }
        if (busqueda.equals("presupuesto_desdeOrden")) {

            DefaultTableModel modelo = (DefaultTableModel) grillaBuscador.getModel();

            modelo.addColumn("Código Proveedor");
            grillaBuscador.setModel(modelo);
        }
        if (busqueda.equals("presupuesto_proveedor")) {

            DefaultTableModel modelo = (DefaultTableModel) grillaBuscador.getModel();

            modelo.addColumn("Codigo Proveedor");
            grillaBuscador.setModel(modelo);
        }
        //PARA ORDEN DE TRABAJO
//        if (busqueda.equals("orden_trabajo")) {
//
//            DefaultTableModel modelo = (DefaultTableModel) grillaBuscador.getModel();
//
//            modelo.addColumn("Codigo Proveedor");
//            grillaBuscador.setModel(modelo);
//        }
    }

    public static String busqueda = "";

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtBuscar = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        grillaBuscador = new javax.swing.JTable();
        btn_buscar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        txtBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarActionPerformed(evt);
            }
        });

        grillaBuscador.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Código", "Fecha", "Descripción", "Estado", "Código Sucursal", "Código Usuario", "Código Empleado"
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, 591, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_buscar))
                    .addComponent(jScrollPane1))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_buscar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarActionPerformed
        getDatos();
    }//GEN-LAST:event_txtBuscarActionPerformed

    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed
        getDatos();
    }//GEN-LAST:event_btn_buscarActionPerformed

    private void grillaBuscadorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_grillaBuscadorMouseClicked
        switch (busqueda) {
            case "pedido_desdePedido":
                seleccionarPedido();
                break;
            case "pedido_desdePresupuesto":
                seleccionarPedidoDetalle();
                break;
            case "presupuesto_proveedor":
                seleccionarPresupuestoDetalle();
                break;

            case "presupuesto_desdeOrden":
                seleccionarPresupuesto();
                break;

            case "orden_compra":
                seleccionarOrden();
                break;

            case "ordenDesdeCompra":
                seleccionarOrdenDetalles();
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
                Logger.getLogger(busPedidoCompra.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, "No se encuentra " + ex.getMessage());
            } catch (SQLException ex) {
                Logger.getLogger(busPedidoCompra.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }

            presupuesto_de_compra.txtTotal.setText(String.valueOf(Metodos.sumarColumna(presupuesto_de_compra.grilla, 4)));
            presupuesto_de_compra.txtPedido_compra.requestFocus();
            dispose();
        }
    }

    private void seleccionarPedido() {

        int fila = grillaBuscador.getSelectedRow();

        String cod = grillaBuscador.getValueAt(fila, 0).toString();
        String fecha = grillaBuscador.getValueAt(fila, 1).toString();
        String descri = grillaBuscador.getValueAt(fila, 2).toString();
        String estado = grillaBuscador.getValueAt(fila, 3).toString();
        String codSucu = grillaBuscador.getValueAt(fila, 4).toString();
        String codUsu = grillaBuscador.getValueAt(fila, 5).toString();

        if (busqueda.equals("pedido_desdePedido")) {   //primero se realiza esta accion porque de otro modo vacia la variable "operacion"
            pedido_de_compra.txtCod.setText(cod);
//           pedido_de_compra.txtFecha.setDate(fecha);
            pedido_de_compra.txtDescri.setText(descri);
            pedido_de_compra.txtSucursal.setText(codSucu);
            pedido_de_compra.txtUsuarioCod.setText(codUsu);
            pedido_de_compra.txtUsuarioCod.setText(codUsu);
            pedido_de_compra.txtDescri.requestFocus();
            pedido_de_compra.txtFecha.setDate(Metodos.convertirFechaSql(fecha));

            busqueda = "";

        }

        Conexion cn = new Conexion();

        try {
            cn.conectar();
            ResultSet detalles = cn.consultar("select * from v_detalle_pedido_compra where ped_id = " + cod + ""); //order by ordena de menor a mayor, si se quiere de mayor a menor se le agrega desc al final
            Metodos.limpiarTabla(pedido_de_compra.grilla);
            if (detalles.isBeforeFirst()) {
                while (detalles.next()) {
                    Metodos.cargarTabla(pedido_de_compra.grilla, new Object[]{
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
            Logger.getLogger(busPedidoCompra.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "No se encuentra " + ex.getMessage());
        } catch (SQLException ex) {
            Logger.getLogger(busPedidoCompra.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }

        pedido_de_compra.txtTotal.setText(String.valueOf(Metodos.sumarColumna(pedido_de_compra.grilla, 4)));
        dispose();
    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new busPedidoCompra().setVisible(true);
            }
        });
    }

    public void getDatos() {

        switch (busqueda) {
            case "pedido_desdePedido":
                buscarPedido();
                break;
            case "pedido_desdePresupuesto":
                buscarPedido();
                break;
            case "presupuesto_proveedor":
                buscarPresupuesto();
                break;
            case "presupuesto_desdeOrden":
                buscarPresupuesto();
                break;
            case "orden_compra":
                buscarOrden();
                break;
            case "ordenDesdeCompra":
                buscarOrden();
                break;
            case "orden_trabajo":
                buscarPresupuestoTrabajo();
                break;

        }
    }

    /**
     * busca la tabla con pedidos
     */
    private void buscarPedido() {
        Conexion cn = new Conexion();
        try {
            cn.conectar();
            ResultSet pedi = cn.consultar("select * from pedido_compra where ped_descrip ilike '%" + txtBuscar.getText() + "%' and estado!='ANULADO' and estado!='UTILIZADO' order by ped_id"); //order by ordena de menor a mayor, si se quiere de mayor a menor se le agrega desc al final
            Metodos.limpiarTabla(grillaBuscador);
            if (pedi.isBeforeFirst()) {
                while (pedi.next()) {
                    Metodos.cargarTabla(grillaBuscador, new Object[]{pedi.getString("ped_id"), pedi.getString("ped_fecha"), pedi.getString("ped_descrip"), pedi.getString("estado"), pedi.getString("sucur_id"), pedi.getString("usu_id"), pedi.getString("emp_id")});
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
    private void buscarPresupuesto() {
        Conexion cn = new Conexion();
        try {
            cn.conectar();
            ResultSet pedi = cn.consultar("SELECT * from presu_prove\n"
                    + "where pre_pro_nro::varchar(255) LIKE '%" + txtBuscar.getText() + "%' and estado != 'UTILIZADO' and estado != 'ANULADO'\n"
                    + "ORDER BY pre_pro_nro desc"); //order by ordena de menor a mayor, si se quiere de mayor a menor se le agrega desc al final
            Metodos.limpiarTabla(grillaBuscador);
//
//            System.out.println(grillaBuscador.getColumnCount());
//            if (grillaBuscador.getColumnCount() > 8) {
//                grillaBuscador.getColumnModel().removeColumn(grillaBuscador.getColumnModel().getColumn(grillaBuscador.getColumnCount() - 1));
//            }
            if (pedi.isBeforeFirst()) {
                while (pedi.next()) {
                    Metodos.cargarTabla(grillaBuscador, new Object[]{
                        pedi.getString("pre_pro_nro"),
                        pedi.getString("fecha"),
                        "-",
                        pedi.getString("estado"),
                        pedi.getString("sucur_id"),
                        pedi.getString("usu_id"),
                        pedi.getString("emp_id"),
                        pedi.getString("pro_id")
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

    private void buscarOrden() {
        Conexion cn = new Conexion();
        try {
            cn.conectar();
            ResultSet pedi = cn.consultar("SELECT * from orden_compra\n"
                    + "where ord_id::varchar(255) LIKE '%" + txtBuscar.getText() + "%' and estado != 'UTILIZADO' and estado != 'ANULADO'\n"
                    + "ORDER BY ord_id"); //order by ordena de menor a mayor, si se quiere de mayor a menor se le agrega desc al final
            Metodos.limpiarTabla(grillaBuscador);
//
//            System.out.println(grillaBuscador.getColumnCount());
//            if (grillaBuscador.getColumnCount() > 8) {
//                grillaBuscador.getColumnModel().removeColumn(grillaBuscador.getColumnModel().getColumn(grillaBuscador.getColumnCount() - 1));
//            }
            if (pedi.isBeforeFirst()) {
                while (pedi.next()) {
                    Metodos.cargarTabla(grillaBuscador, new Object[]{
                        pedi.getString("ord_id"),
                        pedi.getString("ord_fecha"),
                        "-",
                        pedi.getString("estado"),
                        pedi.getString("sucur_id"),
                        pedi.getString("usu_id"),
                        pedi.getString("emp_id"),
                        pedi.getString("pro_id")
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
                    + "p.estado,\n"
                    + "p.id_empleado,\n"
                    + "p.id_sucu "
                    + "FROM presupuesto_servicio_cabecera p \n"
                    + "JOIN sucursal s\n"
                    + "ON s.sucur_id = p.id_sucu\n"
                    + "JOIN empleado e\n"
                    + "ON e.emp_id =  p.id_empleado\n"
                    + "WHERE p.estado LIKE 'ACTIVO' "
                    + "AND p.id_presupuesto_reparacion_cab::CHARACTER LIKE '%" + txtBuscar.getText().trim() + "%'"); //order by ordena de menor a mayor, si se quiere de mayor a menor se le agrega desc al final
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
                        pedi.getString("presu_descri"),
                        pedi.getString("estado"),
                        pedi.getString("id_sucu"),
                        "-",
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

    private void seleccionarOrden() {

        int fila = grillaBuscador.getSelectedRow();

        String cod = grillaBuscador.getValueAt(fila, 0).toString();
        String fecha = grillaBuscador.getValueAt(fila, 1).toString();
        String descri = grillaBuscador.getValueAt(fila, 2).toString();
        String estado = grillaBuscador.getValueAt(fila, 3).toString();
        String codSucu = grillaBuscador.getValueAt(fila, 4).toString();
        String codUsu = grillaBuscador.getValueAt(fila, 5).toString();
        String codPro = grillaBuscador.getValueAt(fila, 6).toString();

        //primero se realiza esta accion porque de otro modo vacia la variable "operacion"
        orden_compra.txtCod.setText(cod);
        orden_compra.txtSucursal.setText(codSucu);
        orden_compra.txtIdProveedor.setText(codPro);
//           pedido_de_compra.txtFecha.setDate(fecha);
        orden_compra.txtPresupuesto.requestFocus();
        orden_compra.txtIdProveedor.setText(codPro);

        orden_compra.txtNombreProveedor.setText(dameNombrePorCodido(codPro));

        busqueda = "";

        dispose();
        Conexion cn = new Conexion();

        try {
            cn.conectar();
            ResultSet detalles = cn.consultar("select * from v_detalle_orden_compra where ord_id = " + cod + ""); //order by ordena de menor a mayor, si se quiere de mayor a menor se le agrega desc al final
            Metodos.limpiarTabla(orden_compra.grilla);
            if (detalles.isBeforeFirst()) {
                while (detalles.next()) {
                    Metodos.cargarTabla(orden_compra.grilla, new Object[]{
                        detalles.getString("cod_materia"),
                        detalles.getString("mat_desc"),
                        detalles.getString("ord_cantidad"),
                        detalles.getString("ord_precio"),
                        (Integer.parseInt(detalles.getString("ord_precio")) * Integer.parseInt(detalles.getString("ord_cantidad")))
                    });
                }
            } else {
                JOptionPane.showMessageDialog(null, "No hay registros en la base de datos");
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(busPedidoCompra.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "No se encuentra " + ex.getMessage());
        } catch (SQLException ex) {
            Logger.getLogger(busPedidoCompra.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        ResultSet codigo;
        try {
            codigo = cn.consultar("select pre_pro_nro from orden_compra where ord_id = " + cod + "");
            if (codigo.isBeforeFirst()) {
                while (codigo.next()) {
                    orden_compra.txtPresupuesto.setText(codigo.getString("pre_pro_nro"));
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(busPedidoCompra.class.getName()).log(Level.SEVERE, null, ex);
        }
        orden_compra.txtTotal.setText(String.valueOf(Metodos.sumarColumna(orden_compra.grilla, 4)));

    }

    private void seleccionarOrdenDetalles() {

        int fila = grillaBuscador.getSelectedRow();

        String cod = grillaBuscador.getValueAt(fila, 0).toString();
        String fecha = grillaBuscador.getValueAt(fila, 1).toString();
        String descri = grillaBuscador.getValueAt(fila, 2).toString();
        String estado = grillaBuscador.getValueAt(fila, 3).toString();
        String codSucu = grillaBuscador.getValueAt(fila, 4).toString();
        String codUsu = grillaBuscador.getValueAt(fila, 5).toString();
        String codPro = grillaBuscador.getValueAt(fila, 6).toString();

        //primero se realiza esta accion porque de otro modo vacia la variable "operacion"
        compras.txtOrden.setText(cod);
        System.out.println(cod);
        compras.txtCodProvee.setText(codPro);
//           pedido_de_compra.txtFecha.setDate(fecha);
//        compras.chx_contado.requestFocus();

        compras.txtProvee.setText(dameNombrePorCodido(codPro));

        busqueda = "";

        dispose();
        Conexion cn = new Conexion();

        try {
            cn.conectar();
            ResultSet detalles = cn.consultar("select * from v_detalle_orden_compra where ord_id = " + cod + ""); //order by ordena de menor a mayor, si se quiere de mayor a menor se le agrega desc al final
            Metodos.limpiarTabla(compras.grilla);
            if (detalles.isBeforeFirst()) {
                while (detalles.next()) {
                    Metodos.cargarTabla(compras.grilla, new Object[]{
                        detalles.getString("cod_materia"),
                        detalles.getString("mat_desc"),
                        detalles.getString("ord_cantidad"),
                        detalles.getString("ord_precio"),
                        (int) ((dameIva(detalles.getString("cod_materia")).equals("0")) ? (Integer.parseInt(detalles.getString("ord_precio")) * Integer.parseInt(detalles.getString("ord_cantidad"))) * (0) : 0),
                        (int) ((dameIva(detalles.getString("cod_materia")).equals("5")) ? (Integer.parseInt(detalles.getString("ord_precio")) * Integer.parseInt(detalles.getString("ord_cantidad"))) * (0.21) : 0),
                        (int) ((dameIva(detalles.getString("cod_materia")).equals("10")) ? (Integer.parseInt(detalles.getString("ord_precio")) * Integer.parseInt(detalles.getString("ord_cantidad"))) * (0.11) : 0),
                        (Integer.parseInt(detalles.getString("ord_precio")) * Integer.parseInt(detalles.getString("ord_cantidad")))

                    });
                }
            } else {
                JOptionPane.showMessageDialog(null, "No hay registros en la base de datos");
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(busPedidoCompra.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "No se encuentra " + ex.getMessage());
        } catch (SQLException ex) {
            Logger.getLogger(busPedidoCompra.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }

        compras.txt_iva5.setText(String.valueOf(Metodos.sumarColumna(compras.grilla, 5)));
        compras.txt_iva10.setText(String.valueOf(Metodos.sumarColumna(compras.grilla, 6)));
        compras.txt_to_iva.setText(String.valueOf(Metodos.sumarColumna(compras.grilla, 5) + Metodos.sumarColumna(compras.grilla, 6)));
        compras.txtTotal.setText(String.valueOf(Metodos.sumarColumna(compras.grilla, 5) + Metodos.sumarColumna(compras.grilla, 6) + Metodos.sumarColumna(compras.grilla, 7)));

    }

    private void seleccionarPresupuesto() {

        int fila = grillaBuscador.getSelectedRow();

        String cod = grillaBuscador.getValueAt(fila, 0).toString();
        String fecha = grillaBuscador.getValueAt(fila, 1).toString();
        String descri = grillaBuscador.getValueAt(fila, 2).toString();
        String estado = grillaBuscador.getValueAt(fila, 3).toString();
        String codSucu = grillaBuscador.getValueAt(fila, 4).toString();
        String codUsu = grillaBuscador.getValueAt(fila, 5).toString();
        String codPro = grillaBuscador.getValueAt(fila, 7).toString();

        //primero se realiza esta accion porque de otro modo vacia la variable "operacion"
        orden_compra.txtPresupuesto.setText(cod);
        orden_compra.txtSucursal.setText(codSucu);
        orden_compra.txtIdProveedor.setText(codPro);
//           pedido_de_compra.txtFecha.setDate(fecha);
        orden_compra.txtPresupuesto.requestFocus();
        orden_compra.txtIdProveedor.setText(codPro);

        orden_compra.txtNombreProveedor.setText(dameNombrePorCodido(codPro));

        busqueda = "";

        dispose();
        Conexion cn = new Conexion();

        try {
            cn.conectar();
            ResultSet detalles = cn.consultar("select * from v_detalle_presupuesto_compra where pre_pro_nro = " + cod + ""); //order by ordena de menor a mayor, si se quiere de mayor a menor se le agrega desc al final
            Metodos.limpiarTabla(orden_compra.grilla);
            if (detalles.isBeforeFirst()) {
                while (detalles.next()) {
                    Metodos.cargarTabla(orden_compra.grilla, new Object[]{
                        detalles.getString("cod_materia"),
                        detalles.getString("mat_desc"),
                        detalles.getString("cantidad"),
                        detalles.getString("precio"),
                        (Integer.parseInt(detalles.getString("precio")) * Integer.parseInt(detalles.getString("cantidad")))
                    });
                }
            } else {
                JOptionPane.showMessageDialog(null, "No hay registros en la base de datos");
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(busPedidoCompra.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "No se encuentra " + ex.getMessage());
        } catch (SQLException ex) {
            Logger.getLogger(busPedidoCompra.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        orden_compra.txtTotal.setText(String.valueOf(Metodos.sumarColumna(orden_compra.grilla, 4)));

    }

    private void seleccionarPresupuestoDetalle() {

        int fila = grillaBuscador.getSelectedRow();

        String cod = grillaBuscador.getValueAt(fila, 0).toString();
        String fecha = grillaBuscador.getValueAt(fila, 1).toString();
        String descri = grillaBuscador.getValueAt(fila, 2).toString();
        String estado = grillaBuscador.getValueAt(fila, 3).toString();
        String codSucu = grillaBuscador.getValueAt(fila, 4).toString();
        String codUsu = grillaBuscador.getValueAt(fila, 5).toString();
        String codPro = grillaBuscador.getValueAt(fila, 7).toString();

        //primero se realiza esta accion porque de otro modo vacia la variable "operacion"
        presupuesto_de_compra.txtCod.setText(cod);
//           pedido_de_compra.txtFecha.setDate(fecha);
        presupuesto_de_compra.txtSucursal.setText(codSucu);
        presupuesto_de_compra.txtUsuarioCod.setText(codUsu);
        presupuesto_de_compra.txtUsuarioCod.setText(codUsu);
        presupuesto_de_compra.txtCod.requestFocus();
        presupuesto_de_compra.txtFecha.setDate(Metodos.convertirFechaSql(fecha));
        presupuesto_de_compra.txtcodProvee.setText(codPro);

        presupuesto_de_compra.txtProvee.setText(dameNombrePorCodido(codPro));

        busqueda = "";

        Conexion cn = new Conexion();

        try {

            cn.conectar();

            ResultSet detalles = cn.consultar("select * from v_detalle_presupuesto_compra where pre_pro_nro = " + cod + ""); //order by ordena de menor a mayor, si se quiere de mayor a menor se le agrega desc al final
            Metodos.limpiarTabla(presupuesto_de_compra.grilla);
            if (detalles.isBeforeFirst()) {
                while (detalles.next()) {
                    Metodos.cargarTabla(presupuesto_de_compra.grilla, new Object[]{
                        detalles.getString("cod_materia"),
                        detalles.getString("mat_desc"),
                        detalles.getString("cantidad"),
                        detalles.getString("precio"),
                        (Integer.parseInt(detalles.getString("precio")) * Integer.parseInt(detalles.getString("cantidad")))
                    });
                }
            } else {
                JOptionPane.showMessageDialog(null, "No hay registros en la base de datos");
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(busPedidoCompra.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "No se encuentra " + ex.getMessage());
        } catch (SQLException ex) {
            Logger.getLogger(busPedidoCompra.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        presupuesto_de_compra.txtTotal.setText(String.valueOf(Metodos.sumarColumna(presupuesto_de_compra.grilla, 4)));
        ResultSet codigo;
        try {
            codigo = cn.consultar("select ped_id from presu_prove where pre_pro_nro = " + cod + "");
            if (codigo.isBeforeFirst()) {
                while (codigo.next()) {
                    presupuesto_de_compra.txtPedido_compra.setText(codigo.getString("ped_id"));
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(busPedidoCompra.class.getName()).log(Level.SEVERE, null, ex);
        }

        dispose();

    }

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
            Logger.getLogger(busPedidoCompra.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(busPedidoCompra.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(busPedidoCompra.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(busPedidoCompra.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "";

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_buscar;
    private javax.swing.JTable grillaBuscador;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables
}
