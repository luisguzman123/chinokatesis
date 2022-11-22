package ventanas;

import Acceso.Menu;
import clases.Conexion;
import clases.Metodos;
import com.toedter.calendar.JCalendar;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class busNotas extends javax.swing.JFrame {

    public busNotas() {
        initComponents();
        iniciarComponentes();
        btn_buscar.doClick();
    }

    private void iniciarComponentes() {
        desde_dt.setDate(new JCalendar().getDate());
        hasta_dt.setDate(new JCalendar().getDate());

    }

    public static String busqueda = "";

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        grillaBuscador = new javax.swing.JTable();
        btn_buscar = new javax.swing.JButton();
        desde_dt = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        hasta_dt = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        grillaBuscador.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Código", "Fecha", "Monto Descuento"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
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
        if (grillaBuscador.getColumnModel().getColumnCount() > 0) {
            grillaBuscador.getColumnModel().getColumn(0).setPreferredWidth(50);
            grillaBuscador.getColumnModel().getColumn(1).setPreferredWidth(120);
            grillaBuscador.getColumnModel().getColumn(2).setPreferredWidth(290);
        }

        btn_buscar.setText("Buscar");
        btn_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarActionPerformed(evt);
            }
        });

        jLabel1.setText("Desde");

        jLabel2.setText("Hasta");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 731, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(desde_dt, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(hasta_dt, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(144, 144, 144))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(hasta_dt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(desde_dt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(btn_buscar))
                        .addGap(24, 24, 24)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(44, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed
        getDatos();
    }//GEN-LAST:event_btn_buscarActionPerformed

    private void grillaBuscadorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_grillaBuscadorMouseClicked
        switch (busqueda) {
            case "nota_venta":
                seleccionarNotaVenta();
                break;
            case "nota_compra":
                seleccionarNotaCompra();
                break;

        }

    }//GEN-LAST:event_grillaBuscadorMouseClicked

    private void seleccionarNotaVenta() {
        int fila = grillaBuscador.getSelectedRow();

        String cod = grillaBuscador.getValueAt(fila, 0).toString();
        nota_ventas.num.setText(cod);
        dispose();

    }
    private void seleccionarNotaCompra() {
        int fila = grillaBuscador.getSelectedRow();

        String cod = grillaBuscador.getValueAt(fila, 0).toString();
        nota_compras.num.setText(cod);
        dispose();

    }

    private void seleccionarProduccion() {
        int fila = grillaBuscador.getSelectedRow();

        String cod = grillaBuscador.getValueAt(fila, 0).toString();
       
        dispose();

    }

    private void seleccionarCompra() {

        int fila = grillaBuscador.getSelectedRow();

        String cod = grillaBuscador.getValueAt(fila, 0).toString();
        String nroFactura = grillaBuscador.getValueAt(fila, 1).toString();
        String tipo = grillaBuscador.getValueAt(fila, 2).toString();
        String fecha = grillaBuscador.getValueAt(fila, 3).toString();
        String cuotas = grillaBuscador.getValueAt(fila, 4).toString();
        String idsucu = grillaBuscador.getValueAt(fila, 5).toString();
        String idOrden = grillaBuscador.getValueAt(fila, 6).toString();
        String idProveedor = grillaBuscador.getValueAt(fila, 7).toString();
        String idusuario = grillaBuscador.getValueAt(fila, 8).toString();
        String idEmpleado = grillaBuscador.getValueAt(fila, 9).toString();

        if (busqueda.equals("compra")) {   //primero se realiza esta accion porque de otro modo vacia la variable "operacion"
            compras.txtCod.setText(cod);
            compras.txtFactura.setText(nroFactura);
            compras.txtCodProvee.setText(idProveedor);
            compras.txtOrden.setText(idOrden);
            compras.txtSucursal.setText(idsucu);

            compras.txtFecha.setDate(Metodos.convertirFechaSql(fecha));

            busqueda = "";

        }

//        Conexion cn = new Conexion();
//
//        try {
//            cn.conectar();
//            ResultSet detalles = cn.consultar("select * from v_detalle_pedido_compra where ped_id = " + cod + ""); //order by ordena de menor a mayor, si se quiere de mayor a menor se le agrega desc al final
//            Metodos.limpiarTabla(pedido_de_compra.grilla);
//            if (detalles.isBeforeFirst()) {
//                while (detalles.next()) {
//                    Metodos.cargarTabla(pedido_de_compra.grilla, new Object[]{
//                        detalles.getString("cod_materia"),
//                        detalles.getString("mat_desc"),
//                        detalles.getString("cantidad"),
//                        detalles.getString("precio"),
//                        detalles.getString("precio"),
//                        (Integer.parseInt(detalles.getString("precio")) * Integer.parseInt(detalles.getString("cantidad")))
//                    });
//                }
//            } else {
//                JOptionPane.showMessageDialog(null, "No hay registros en la base de datos");
//            }
//        } catch (ClassNotFoundException ex) {
//            Logger.getLogger(busCompras.class.getName()).log(Level.SEVERE, null, ex);
//            JOptionPane.showMessageDialog(null, "No se encuentra " + ex.getMessage());
//        } catch (SQLException ex) {
//            Logger.getLogger(busCompras.class.getName()).log(Level.SEVERE, null, ex);
//            JOptionPane.showMessageDialog(null, ex.getMessage());
//        }
//        pedido_de_compra.txtTotal.setText(String.valueOf(Metodos.sumarColumna(pedido_de_compra.grilla, 4)));
        dispose();
    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new busNotas().setVisible(true);
            }
        });
    }

    public void getDatos() {

        switch (busqueda) {
            case "nota_venta":
                buscarNotaVenta();
                break;
            case "nota_compra":
                buscarNotaCompra();
                break;

        }
    }

    /**
     * busca la tabla con pedidos
     */
    /**
     * busca la tabla con pedidos
     */
    private void buscarNotaVenta() {
        Conexion cn = new Conexion();
        try {
            cn.conectar();
            ResultSet pedi = cn.consultar("SELECT\n"
                    + "nv.not_cred_id,\n"
                    + "nv.nota_cred_fecha,\n"
                    + "nv.nota_cred_monto "
                    + "FROM notas_de_ventas nv\n"
                    + "WHERE nv.nota_cred_fecha \n"
                    + "BETWEEN '"+Metodos.dameFechaFormateadaSQL(desde_dt.getDate())+"' "
                            + "AND '"+Metodos.dameFechaFormateadaSQL(hasta_dt.getDate())+"' \n"
                    + "AND estado = 'ACTIVO'"); //order by ordena de menor a mayor, si se quiere de mayor a menor se le agrega desc al final
            Metodos.limpiarTabla(grillaBuscador);
//
//            System.out.println(grillaBuscador.getColumnCount());
//            if (grillaBuscador.getColumnCount() > 8) {
//                grillaBuscador.getColumnModel().removeColumn(grillaBuscador.getColumnModel().getColumn(grillaBuscador.getColumnCount() - 1));
//            }
            if (pedi.isBeforeFirst()) {
                while (pedi.next()) {
                    Metodos.cargarTabla(grillaBuscador, new Object[]{
                        pedi.getString("not_cred_id"),
                        Metodos.dameFechaFormateada(pedi.getDate("nota_cred_fecha")),
                        pedi.getString("nota_cred_monto")
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
    private void buscarNotaCompra() {
        Conexion cn = new Conexion();
        try {
            cn.conectar();
            ResultSet pedi = cn.consultar("SELECT\n"
                    + "nv.cod_nota,\n"
                    + "nv.nota_fecha,\n"
                    + "nv.monto "
                    + "FROM nota_de_compras nv\n"
                    + "WHERE nv.nota_fecha \n"
                    + "BETWEEN '"+Metodos.dameFechaFormateadaSQL(desde_dt.getDate())+"' "
                            + "AND '"+Metodos.dameFechaFormateadaSQL(hasta_dt.getDate())+"' \n"
                    + "AND estado = 'ACTIVO'"); //order by ordena de menor a mayor, si se quiere de mayor a menor se le agrega desc al final
            Metodos.limpiarTabla(grillaBuscador);
//
//            System.out.println(grillaBuscador.getColumnCount());
//            if (grillaBuscador.getColumnCount() > 8) {
//                grillaBuscador.getColumnModel().removeColumn(grillaBuscador.getColumnModel().getColumn(grillaBuscador.getColumnCount() - 1));
//            }
            if (pedi.isBeforeFirst()) {
                while (pedi.next()) {
                    Metodos.cargarTabla(grillaBuscador, new Object[]{
                        pedi.getString("cod_nota"),
                        Metodos.dameFechaFormateada(pedi.getDate("nota_fecha")),
                        pedi.getString("monto")
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
            Logger.getLogger(busNotas.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(busNotas.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(busNotas.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(busNotas.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "";

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_buscar;
    private com.toedter.calendar.JDateChooser desde_dt;
    private javax.swing.JTable grillaBuscador;
    private com.toedter.calendar.JDateChooser hasta_dt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
