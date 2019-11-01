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

public class busControlCalidad extends javax.swing.JFrame {

    public busControlCalidad() {
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
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Código", "Codigo orden", "Fecha", "Estado", "Empleado"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
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
            case "control_calidad":
                seleccionarControlCalidad();
                break;

        }

    }//GEN-LAST:event_grillaBuscadorMouseClicked

    

    private void seleccionarControlCalidad() {

        int fila = grillaBuscador.getSelectedRow();

        String cod = grillaBuscador.getValueAt(fila, 0).toString();
        String fecha = grillaBuscador.getValueAt(fila, 1).toString();
        String estado = grillaBuscador.getValueAt(fila, 2).toString();

        control_de_calidad.codigo_control_calidad_txt.setText(cod);
       
        dispose();
    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new busControlCalidad().setVisible(true);
            }
        });
    }

    public void getDatos() {

        switch (busqueda) {
            case "control_calidad":
                buscarControlCalidad();
                break;

        }
    }

    /**
     * busca la tabla con pedidos
     */
    private void buscarControlCalidad() {
        Conexion cn = new Conexion();
        try {
            cn.conectar();
            
            ResultSet pedi = cn.consultar("SELECT \n"
                    + "cc.cod_control_cali,\n"
                    + "cc.cod_producción,\n"
                    + "cc.fecha,\n"
                    + "cc.estado,\n"
                    + "e.emp_nom ||' '||e.emp_ape as empleado "
                    + "FROM control_calidad cc \n"
                    + "JOIN empleado e \n"
                    + "ON e.emp_id = cc.emp_id where cc.fecha BETWEEN '" +
                    Metodos.dameFechaFormateadaSQL(DESDE.getDate()) +
                    "' and '" + Metodos.dameFechaFormateadaSQL(HASTA.getDate()) +
                    "' and cc.estado <> 'ANULADO' order by cc.cod_control_cali "); //order by ordena de menor a mayor, si se quiere de mayor a menor se le agrega desc al final
            Metodos.limpiarTabla(grillaBuscador);
            if (pedi.isBeforeFirst()) {
                while (pedi.next()) {

                    Metodos.cargarTabla(grillaBuscador, new Object[]{
                        pedi.getInt("cod_control_cali"), 
                        pedi.getInt("cod_producción"), 
                        pedi.getDate("fecha"), 
                        pedi.getString("empleado")});
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
            Logger.getLogger(busControlCalidad.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(busControlCalidad.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(busControlCalidad.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(busControlCalidad.class.getName()).log(Level.SEVERE, null, ex);
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
