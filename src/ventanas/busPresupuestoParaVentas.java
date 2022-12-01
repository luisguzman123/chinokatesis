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

public class busPresupuestoParaVentas extends javax.swing.JFrame {

    public busPresupuestoParaVentas() {
        initComponents();
        iniciarComponentes();
    }

    private void iniciarComponentes() {
        fecha_dt.setDate(new JCalendar().getDate());
        Ultimo10();
        if (busqueda.equals("presupuesto")) {

        }

    }

    public static String busqueda = "";

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        grillaBuscador = new javax.swing.JTable();
        fecha_dt = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();
        btn_buscar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        clientetxt = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        grillaBuscador.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Código", "Código Cliente", "Cliente", "Fecha", "Sucursal"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
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

        jLabel1.setText("Fecha");

        btn_buscar.setText("Buscar");
        btn_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarActionPerformed(evt);
            }
        });

        jLabel2.setText("Cliente");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(clientetxt)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(fecha_dt, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
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
                            .addComponent(fecha_dt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel1)
                                .addComponent(jLabel2)
                                .addComponent(clientetxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void grillaBuscadorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_grillaBuscadorMouseClicked
        switch (busqueda) {
            case "presupuesto":
                seleccionarPresupuesto();
                break;
            case "orden_produccion":
                seleccionarOrdenProduccion();
                break;
            case "ventas":
                seleccionarPresupuestoDetalles();
                break;


        }

    }//GEN-LAST:event_grillaBuscadorMouseClicked

    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed
        // TODO add your handling code here:
        getDatos();
    }//GEN-LAST:event_btn_buscarActionPerformed

    private void seleccionarPresupuesto() {
        int fila = grillaBuscador.getSelectedRow();

        String cod = grillaBuscador.getValueAt(fila, 0).toString();
        String fecha = grillaBuscador.getValueAt(fila, 1).toString();
        String cliente = grillaBuscador.getValueAt(fila, 2).toString();
        String sucursal = grillaBuscador.getValueAt(fila, 3).toString();

        
        dispose();
    }

    private void seleccionarOrdenProduccion() {
        int fila = grillaBuscador.getSelectedRow();

        String cod = grillaBuscador.getValueAt(fila, 0).toString();
        String cliCod = grillaBuscador.getValueAt(fila, 1).toString();
        String fecha = grillaBuscador.getValueAt(fila, 2).toString();
        String cliente = grillaBuscador.getValueAt(fila, 3).toString();
        String sucursal = grillaBuscador.getValueAt(fila, 4).toString();

        Conexion cn = new Conexion();
       
        try {
            cn.conectar();
            ResultSet pedi = cn.consultar("SELECT\n"
                    + "dp.pro_cod, \n"
                    + "p.pro_desc,\n"
                    + "dp.cantidad\n"
                    + "FROM detalle_presupuesto dp\n"
                    + "JOIN producto p\n"
                    + "ON p.pro_cod = dp.pro_cod\n"
                    + "WHERE dp.pre_cod = "+cod); //order by ordena de menor a mayor, si se quiere de mayor a menor se le agrega desc al final
            
            if (pedi.isBeforeFirst()) {
                
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
    
    
        

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new busPresupuestoParaVentas().setVisible(true);
            }
        });
    }

    public void getDatos() {

        switch (busqueda) {
            case "presupuesto":
                buscarPresupuesto();
                break;
            case "orden_produccion":
                buscarPresupuesto();
                break;
            case "ventas":
                buscarPresupuesto();
                break;

        }
    }

    /**
     * busca la tabla con pedidos
     */
    private void buscarPresupuesto() {
        Conexion cn = new Conexion();
        try {
            cn.conectar();
            ResultSet pedi = cn.consultar("SELECT  \n"
                    + "p.pre_cod,\n"
                    + "c.cli_nomb ||' '||c.cli_apelli as cliente,\n"
                    + "p.pre_fecha,\n"
                    + "c.cli_cod,\n"
                    + "s.sucur_nom\n"
                    + "FROM presupuesto p \n"
                    + "NATURAL JOIN cliente c\n"
                    + "NATURAL JOIN sucursal s\n"
                    + "WHERE p.pre_estado = 'ACTIVO' AND "
                    + " c.cli_nomb ||' '||c.cli_apelli ILIKE '%" + clientetxt.getText() + "%' and \n"
                    + " p.pre_fecha = '" + Metodos.dameFechaFormateadaSQL(fecha_dt.getDate()) + "'"); //order by ordena de menor a mayor, si se quiere de mayor a menor se le agrega desc al final
            Metodos.limpiarTabla(grillaBuscador);
            if (pedi.isBeforeFirst()) {
                while (pedi.next()) {
                    Metodos.cargarTabla(grillaBuscador, new Object[]{
                        pedi.getInt("pre_cod"),
                        pedi.getInt("cli_cod"),
                        pedi.getString("cliente"),
                        Metodos.dameFechaFormateadaSQL(pedi.getDate("pre_fecha")),
                        pedi.getString("sucur_nom")});
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
                    + "c.cli_cod,\n"
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
                        pedi.getInt("cli_cod"),
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
            Logger.getLogger(busPresupuestoParaVentas.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(busPresupuestoParaVentas.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "";

    }

    private String dameIva(String codigo) {
        try {
            Conexion cn = new Conexion();
            cn.conectar();
            ResultSet detalles = cn.consultar("select pro_iva from producto where pro_cod =  " + codigo);
            if (detalles.isBeforeFirst()) {
                while (detalles.next()) {
                    return detalles.getString("pro_iva");

                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(busPresupuestoParaVentas.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(busPresupuestoParaVentas.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "";

    }


    
    private void seleccionarPresupuestoDetalles() {

        int fila = grillaBuscador.getSelectedRow();

        String cod = grillaBuscador.getValueAt(fila, 0).toString();
        String cliCod = grillaBuscador.getValueAt(fila, 1).toString();
        String cliente = grillaBuscador.getValueAt(fila, 2).toString();
        String fecha = grillaBuscador.getValueAt(fila, 3).toString();
        String sucursal = grillaBuscador.getValueAt(fila, 4).toString();
        
        
        if (retornarUtilizadoVentas()) {
            JOptionPane.showMessageDialog(null, "Este presupuesto ya se utilizó, por favor elija otro presupuesto");
        }else if (!retornarUtilizadoVentas()) {
                       
                ventas.txtPresu.setText(cod);
                System.out.println(cod);
                ventas.txtCodCliente.setText(cliCod);
                ventas.txtCliente.setText(cliente);

                busqueda = "";

                dispose();
                Conexion cn = new Conexion();

                try {
                    cn.conectar();
                    ResultSet detalles = cn.consultar("select * from v_detalle_presu_venta where pre_cod = " + cod + ""); //order by ordena de menor a mayor, si se quiere de mayor a menor se le agrega desc al final
                    Metodos.limpiarTabla(ventas.grilla);
                    if (detalles.isBeforeFirst()) {
                        while (detalles.next()) {
                            Metodos.cargarTabla(ventas.grilla, new Object[]{
                                detalles.getString("pro_cod"),
                                detalles.getString("pro_desc"),
                                detalles.getString("cantidad"),
                                detalles.getString("precio"),
                                (int)((dameIva(detalles.getString("pro_cod")).equals("0")) ? (Integer.parseInt(detalles.getString("precio")) * Integer.parseInt(detalles.getString("cantidad")))*(0) : 0), 
                                (int)((dameIva(detalles.getString("pro_cod")).equals("5")) ? (Integer.parseInt(detalles.getString("precio")) * Integer.parseInt(detalles.getString("cantidad")))*(0.21) : 0), 
                                (int)((dameIva(detalles.getString("pro_cod")).equals("10")) ? (Integer.parseInt(detalles.getString("precio")) * Integer.parseInt(detalles.getString("cantidad")))*(0.11) : 0), 
                                (Integer.parseInt(detalles.getString("precio")) * Integer.parseInt(detalles.getString("cantidad"))),
                                "Articulos"

                            });
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "No hay registros en la base de datos");
                    }
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(busPresupuestoParaVentas.class.getName()).log(Level.SEVERE, null, ex);
                    JOptionPane.showMessageDialog(null, "No se encuentra " + ex.getMessage());
                } catch (SQLException ex) {
                    Logger.getLogger(busPresupuestoParaVentas.class.getName()).log(Level.SEVERE, null, ex);
                    JOptionPane.showMessageDialog(null, ex.getMessage());
                }



                ventas.txt_iva5.setText(String.valueOf(Metodos.sumarColumna(ventas.grilla, 5)));
                ventas.txt_iva10.setText(String.valueOf(Metodos.sumarColumna(ventas.grilla, 6)));
                ventas.txt_to_iva.setText(String.valueOf(Metodos.sumarColumna(ventas.grilla, 5)+Metodos.sumarColumna(ventas.grilla, 6)));
                ventas.txtTotal.setText(String.valueOf(Metodos.sumarColumna(ventas.grilla, 5)+Metodos.sumarColumna(ventas.grilla, 6)+Metodos.sumarColumna(ventas.grilla, 7)));


        }

    
    }
    
      private boolean retornarUtilizadoVentas() {
        int fila = grillaBuscador.getSelectedRow();
        try {
            Conexion cn = new Conexion();
            cn.conectar();
            ResultSet detalles = cn.consultar("select * from ventas where pre_cod =  " + grillaBuscador.getValueAt(fila, 0).toString());
            if (detalles.isBeforeFirst()) {
                while (detalles.next()) {
                    return true;

                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(busPresupuestoParaVentas.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(busPresupuestoParaVentas.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;

    }  
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_buscar;
    private javax.swing.JTextField clientetxt;
    private com.toedter.calendar.JDateChooser fecha_dt;
    private javax.swing.JTable grillaBuscador;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
