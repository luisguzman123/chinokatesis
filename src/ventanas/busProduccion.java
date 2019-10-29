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

public class busProduccion extends javax.swing.JFrame {

    public busProduccion() {
        initComponents();
        iniciarComponentes();
    }

    private void iniciarComponentes() {
        desde_dt.setDate(new JCalendar().getDate());
        hasta_dt.setDate(new JCalendar().getDate());

        getDatos();

    }

    public static String busqueda = "";

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        grillaBuscador = new javax.swing.JTable();
        desde_dt = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();
        btn_buscar = new javax.swing.JButton();
        hasta_dt = new com.toedter.calendar.JDateChooser();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        grillaBuscador.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Código produccion", "Codigo orden", "Descripción", "Fecha"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
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

        jLabel1.setText("Desde");

        btn_buscar.setText("Buscar");
        btn_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarActionPerformed(evt);
            }
        });

        jLabel2.setText("Hasta");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(desde_dt, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(hasta_dt, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(113, 113, 113))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 666, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(21, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_buscar)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(desde_dt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(hasta_dt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void grillaBuscadorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_grillaBuscadorMouseClicked
        switch (busqueda) {
            case "produccion":
                seleccionarProduccion();
                break;
            case "costoProduccion":
                seleccionarProduccionParaCostos();
                break;

        }

    }//GEN-LAST:event_grillaBuscadorMouseClicked

    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed
        // TODO add your handling code here:
        getDatos();
    }//GEN-LAST:event_btn_buscarActionPerformed

    private void seleccionarProduccion() {
        int fila = grillaBuscador.getSelectedRow();

        String cod = grillaBuscador.getValueAt(fila, 0).toString();
        String cod_orden = grillaBuscador.getValueAt(fila, 1).toString();

        control_de_calidad.cod_produccion_txt.setText(cod);
        control_de_calidad.cod_orden_produccion_txt.setText(cod_orden);
        Conexion cn = new Conexion();
        Metodos.limpiarTabla(control_de_calidad.grilla1);
        try {
            cn.conectar();
            ResultSet pedi = cn.consultar("SELECT  d.pro_cod, \n"
                    + "d.cantidad_realizada,\n"
                    + "d.cantidad_faltante,\n"
                    + "p.pro_desc\n"
                    + "  FROM \"detalle_producción\" d\n"
                    + "  JOIN producto p\n"
                    + "  ON p.pro_cod =  d.pro_cod\n"
                    + "  WHERE \"cod_producción\" = " + cod); //order by ordena de menor a mayor, si se quiere de mayor a menor se le agrega desc al final

            if (pedi.isBeforeFirst()) {
                while (pedi.next()) {
                    Metodos.cargarTabla(control_de_calidad.grilla1, new Object[]{
                        pedi.getInt("pro_cod"),
                        pedi.getString("pro_desc"),
                        pedi.getInt("cantidad_realizada")});
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

        
        dispose();
    }
    private void seleccionarProduccionParaCostos() {
        int fila = grillaBuscador.getSelectedRow();

        String cod = grillaBuscador.getValueAt(fila, 0).toString();
        String cod_orden = grillaBuscador.getValueAt(fila, 1).toString();

        costosDeProduccion.txtProduccion.setText(cod);
        costosDeProduccion.txtOrdenProdu.setText(cod_orden);
        Conexion cn = new Conexion();
        Metodos.limpiarTabla(costosDeProduccion.grilla);
        try {
            cn.conectar();
            ResultSet pedi = cn.consultar("SELECT  d.pro_cod, \n"
                    + "d.cantidad_realizada,\n"
                    + "d.cantidad_faltante,\n"
                    + "p.pro_desc\n,"
                    + "d.sucur_id, "
                    + "d.cod_depo, "
                    + "p.precio "
                    + "  FROM \"detalle_producción\" d\n"
                    + "  JOIN producto p\n"
                    + "  ON p.pro_cod =  d.pro_cod\n"
                    + "  WHERE \"cod_producción\" = " + cod); //order by ordena de menor a mayor, si se quiere de mayor a menor se le agrega desc al final

            if (pedi.isBeforeFirst()) {
                while (pedi.next()) {
                    Metodos.cargarTabla(costosDeProduccion.grilla, new Object[]{
                        pedi.getInt("pro_cod"),
                        pedi.getString("pro_desc"),
                        pedi.getString("cantidad_realizada"),
                        pedi.getInt("precio"),
                        0
                    });
                costosDeProduccion.sucuProdu=pedi.getString("sucur_id");
                costosDeProduccion.depoProdu=pedi.getString("cod_depo");
                }
                costosDeProduccion.txtObs.requestFocus();
                
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

        
        dispose();
    }

    private void seleccionarOrdenProduccion() {
        int fila = grillaBuscador.getSelectedRow();

        String cod = grillaBuscador.getValueAt(fila, 0).toString();
        String fecha = grillaBuscador.getValueAt(fila, 1).toString();
        String cliente = grillaBuscador.getValueAt(fila, 2).toString();
        String sucursal = grillaBuscador.getValueAt(fila, 3).toString();

        Conexion cn = new Conexion();
        Metodos.limpiarTabla(orden_produccion.grilla);
        try {
            cn.conectar();
            ResultSet pedi = cn.consultar("SELECT\n"
                    + "dp.pro_cod, \n"
                    + "p.pro_desc,\n"
                    + "dp.cantidad\n"
                    + "FROM detalle_presupuesto dp\n"
                    + "JOIN producto p\n"
                    + "ON p.pro_cod = dp.pro_cod\n"
                    + "WHERE dp.pre_cod = " + cod); //order by ordena de menor a mayor, si se quiere de mayor a menor se le agrega desc al final

            if (pedi.isBeforeFirst()) {
                while (pedi.next()) {
                    Metodos.cargarTabla(orden_produccion.grilla, new Object[]{
                        pedi.getInt("pro_cod"),
                        pedi.getString("pro_desc"),
                        pedi.getInt("cantidad")});
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

        orden_produccion.nro_presupuesto_txt.setText(cod);
        dispose();
    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new busProduccion().setVisible(true);
            }
        });
    }

    public void getDatos() {

        switch (busqueda) {
            case "produccion":
                buscarProduccion();
                break;
            case "costoProduccion":
                buscarProduccion();
                break;

        }
    }

    /**
     * busca la tabla con pedidos
     */
    private void buscarProduccion() {
        Conexion cn = new Conexion();
        try {
            cn.conectar();
            ResultSet pedi = cn.consultar("SELECT\n"
                    + "p.\"cod_producción\",\n"
                    + "p.cod_or_prod,\n"
                    + "p.observacion,\n"
                    + "p.fecha_pro\n"
                    + "FROM produccion p\n"
                    + "WHERE p.fecha_pro BETWEEN '"
                    + Metodos.dameFechaFormateadaSQL(desde_dt.getDate()) + "' AND"
                    + " '" + Metodos.dameFechaFormateadaSQL(hasta_dt.getDate()) + "'"); //order by ordena de menor a mayor, si se quiere de mayor a menor se le agrega desc al final
            Metodos.limpiarTabla(grillaBuscador);
            if (pedi.isBeforeFirst()) {
                while (pedi.next()) {
                    Metodos.cargarTabla(grillaBuscador, new Object[]{
                        pedi.getInt("cod_producción"),
                        pedi.getInt("cod_or_prod"),
                        pedi.getString("observacion"),
                        Metodos.dameFechaFormateadaSQL(pedi.getDate("fecha_pro"))});
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

    private void Ultimo10() {
        Conexion cn = new Conexion();
        try {
            cn.conectar();
            ResultSet pedi = cn.consultar("SELECT  \n"
                    + "p.pre_cod,\n"
                    + "c.cli_nomb ||' '||c.cli_apelli as cliente,\n"
                    + "p.pre_fecha,\n"
                    + "s.sucur_nom\n"
                    + "FROM presupuesto p \n"
                    + "NATURAL JOIN cliente c\n"
                    + "NATURAL JOIN sucursal s\n "
                    + "where p.pre_estado = 'ACTIVO' "
                    + " ORDER BY p.pre_cod DESC limit 10"); //order by ordena de menor a mayor, si se quiere de mayor a menor se le agrega desc al final
            Metodos.limpiarTabla(grillaBuscador);
            if (pedi.isBeforeFirst()) {
                while (pedi.next()) {
                    Metodos.cargarTabla(grillaBuscador, new Object[]{
                        pedi.getInt("pre_cod"),
                        pedi.getString("cliente"),
                        Metodos.dameFechaFormateadaSQL(pedi.getDate("pre_fecha")),
                        pedi.getString("sucur_nom")});
                }
            } else {

//                JOptionPane.showMessageDialog(null, "No hay registros en la base de datos");
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(clientes.class.getName()).log(Level.SEVERE, null, ex);
//            JOptionPane.showMessageDialog(null, "No se encuentra " + ex.getMessage());
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
            Logger.getLogger(busProduccion.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(busProduccion.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(busProduccion.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(busProduccion.class.getName()).log(Level.SEVERE, null, ex);
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
