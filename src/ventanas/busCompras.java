
package ventanas;

import clases.Conexion;
import clases.Metodos;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class busCompras extends javax.swing.JFrame {

    public busCompras() {
        initComponents();
        iniciarComponentes();
        btn_buscar.doClick();
    }

     private void iniciarComponentes() {
        if(busqueda.equals("orden_compra") ){
            
            DefaultTableModel modelo = (DefaultTableModel) grillaBuscador.getModel();

            modelo.addColumn("Código Proveedor");
            grillaBuscador.setModel(modelo);
        }
        if(busqueda.equals("presupuesto_proveedor")){
            
            DefaultTableModel modelo = (DefaultTableModel) grillaBuscador.getModel();

            modelo.addColumn("Codigo Proveedor");
            grillaBuscador.setModel(modelo);
        }
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
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Código", "Nro factura", "Tipo", "Fecha", "Cuotas", "Cod. Sucursal", "Orden nro.", "Cod. Proveedor", "Cod. Usuario", "Cod. Empleado"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, true, false
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
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 591, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_buscar)
                        .addGap(0, 65, Short.MAX_VALUE)))
                .addContainerGap())
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
            case "compra":
                seleccionarCompra();
                break;
               
            

        }
      
    }//GEN-LAST:event_grillaBuscadorMouseClicked

    private void seleccionarPedidoDetalle(){
        int fila = grillaBuscador.getSelectedRow();

        String cod = grillaBuscador.getValueAt(fila, 0).toString();
        String fecha = grillaBuscador.getValueAt(fila, 1).toString();
        String descri = grillaBuscador.getValueAt(fila, 2).toString();
        String estado = grillaBuscador.getValueAt(fila, 3).toString();
        String codSucu = grillaBuscador.getValueAt(fila, 4).toString();
        String codUsu = grillaBuscador.getValueAt(fila, 5).toString();
        
        
        
        if(busqueda.equals("pedido_desdePresupuesto")){   //primero se realiza esta accion porque de otro modo vacia la variable "operacion"
           presupuesto_de_compra.txtPedido_compra.setText(cod);
           
           
           
           busqueda = "";
          
           Conexion cn=new Conexion();
        
        try {
            cn.conectar();
            ResultSet detalles=cn.consultar("select * from v_detalle_pedido_compra where ped_id = "+cod+""); //order by ordena de menor a mayor, si se quiere de mayor a menor se le agrega desc al final
            Metodos.limpiarTabla(presupuesto_de_compra.grilla);
            if(detalles.isBeforeFirst()){
                while(detalles.next()){
                    Metodos.cargarTabla(presupuesto_de_compra.grilla, new Object[]{
                        detalles.getString("cod_materia"),
                        detalles.getString("mat_desc"),
                        detalles.getString("cantidad"),
                        detalles.getString("precio"),
                        detalles.getString("precio"),
                        (Integer.parseInt(detalles.getString("precio"))*Integer.parseInt(detalles.getString("cantidad")))
                    });
                }
            }else{
                JOptionPane.showMessageDialog(null, "No hay registros en la base de datos");
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(busCompras.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "No se encuentra "+ex.getMessage());
        } catch (SQLException ex) {
            Logger.getLogger(busCompras.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,ex.getMessage());
        }  
        
        
        presupuesto_de_compra.txtTotal.setText(String.valueOf(Metodos.sumarColumna(presupuesto_de_compra.grilla, 4)));
        presupuesto_de_compra.txtPedido_compra.requestFocus();
        dispose();
       }
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
                new busCompras().setVisible(true);
            }
        });
    }
    
   public void getDatos() {

        switch (busqueda) {
            case "compra":
                buscarCompra();
                break;
           
            

        }
    }

    /**
     * busca la tabla con pedidos
     */
   

    /**
     * busca la tabla con pedidos
     */
    private void buscarCompra() {
        Conexion cn = new Conexion();
        try {
            cn.conectar();
            ResultSet pedi = cn.consultar("SELECT * from compra\n"
                    + "where compra_id::varchar(255) LIKE '%" + txtBuscar.getText() + "%' and estado != 'ANULADO'\n"
                    + "ORDER BY compra_id desc"); //order by ordena de menor a mayor, si se quiere de mayor a menor se le agrega desc al final
            Metodos.limpiarTabla(grillaBuscador);
//
//            System.out.println(grillaBuscador.getColumnCount());
//            if (grillaBuscador.getColumnCount() > 8) {
//                grillaBuscador.getColumnModel().removeColumn(grillaBuscador.getColumnModel().getColumn(grillaBuscador.getColumnCount() - 1));
//            }
            if (pedi.isBeforeFirst()) {
                while (pedi.next()) {
                    Metodos.cargarTabla(grillaBuscador, new Object[]{
                        pedi.getString("compra_id"),
                        pedi.getString("nro_factura"),
                        pedi.getString("tipo"),
                        pedi.getString("comp_fecha"),
                        pedi.getString("cuotas"),
                        pedi.getString("sucur_id"),
                        pedi.getString("ord_id"),
                        pedi.getString("pro_id"),
                        pedi.getString("pro_id"),
                        pedi.getString("usu_id"),
                        pedi.getString("emp_id")
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


    

    private String dameNombrePorCodido(String codigo){
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
            Logger.getLogger(busCompras.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(busCompras.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(busCompras.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(busCompras.class.getName()).log(Level.SEVERE, null, ex);
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
