
package ventanas;

import clases.Conexion;
import clases.Metodos;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Nestors
 */
public class producto extends javax.swing.JFrame {

    
    public static String operacion="";
    String confirmar="";
    String mensaje="";
    boolean duplicado;
    
    public static String busqueda = "";

    public producto() {
        initComponents();
        btnCancelar.doClick();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtBuscador = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        grillaBanco = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnGrabar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JTextField();
        btnReporte = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtTipoProducto = new javax.swing.JTextField();
        btn_buscar_tipo = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtIva = new javax.swing.JTextField();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tekton Pro Cond", 0, 36)); // NOI18N
        jLabel1.setText("Articulos");

        jLabel2.setText("Descripción");

        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });

        txtBuscador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscadorActionPerformed(evt);
            }
        });

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        grillaBanco.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Código", "Descripción", "Precio", "IVA", "Tipo de articulo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        grillaBanco.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                grillaBancoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(grillaBanco);

        jLabel3.setText("Código");

        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnGrabar.setText("Grabar");
        btnGrabar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGrabarActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        jLabel4.setText("Precio");

        txtPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecioActionPerformed(evt);
            }
        });

        btnReporte.setText("Reporte");
        btnReporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReporteActionPerformed(evt);
            }
        });

        jLabel6.setText("Tipo de articulo");

        txtTipoProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTipoProductoActionPerformed(evt);
            }
        });

        btn_buscar_tipo.setText("...");
        btn_buscar_tipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscar_tipoActionPerformed(evt);
            }
        });

        jLabel5.setText("IVA");

        txtIva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIvaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnBuscar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtBuscador))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnReporte))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(34, 34, 34)
                                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAgregar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEditar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEliminar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnGrabar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCancelar)
                        .addGap(4, 4, 4)
                        .addComponent(btnSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(txtTipoProducto)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_buscar_tipo, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtIva, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtIva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtTipoProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_buscar_tipo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBuscador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnReporte)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEliminar)
                    .addComponent(btnGrabar)
                    .addComponent(btnCancelar)
                    .addComponent(btnSalir)
                    .addComponent(btnEditar)
                    .addComponent(btnAgregar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        txtNombre.setEditable(true);
        txtNombre.requestFocus();
        txtBuscador.setEditable(false);
        txtCodigo.setEditable(false);
        btnAgregar.setEnabled(false);
        btnEditar.setEnabled(false);
        btnEliminar.setEnabled(false);
        btnSalir.setEnabled(false);
        btnReporte.setEnabled(false);
        btnBuscar.setEnabled(false);
        
        btnGrabar.setEnabled(true);
        btnCancelar.setEnabled(true);
        
        txtCodigo.setText(Metodos.siguienteCodigo("pro_cod", "producto"));
        
        operacion="agregar";
        confirmar="¿Desea grabar el nuevo registro?";
        mensaje="Registro grabado con exito";
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void txtBuscadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscadorActionPerformed
        btnBuscar.doClick();
    }//GEN-LAST:event_txtBuscadorActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        txtBuscador.setEditable(true);
        txtBuscador.requestFocus();
        txtCodigo.setEditable(false);
        btnAgregar.setEnabled(false);
        btnEditar.setEnabled(false);
        btnEliminar.setEnabled(false);
        btnSalir.setEnabled(false);
        btnReporte.setEnabled(false);
        btnBuscar.setEnabled(true);
        
        txtNombre.setEditable(true);
        btnGrabar.setEnabled(true);
        btnCancelar.setEnabled(true);
        
        operacion="modificar";
        confirmar="Desea modificar el registro";
        mensaje="Registro modificado con exito";
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        txtBuscador.setEditable(true);
        txtBuscador.requestFocus();
        txtCodigo.setEditable(false);
        btnAgregar.setEnabled(false);
        btnEditar.setEnabled(false);
        btnEliminar.setEnabled(false);
        btnSalir.setEnabled(false);
        btnReporte.setEnabled(false);
        btnBuscar.setEnabled(true);
        
        txtNombre.setEditable(true);
        btnGrabar.setEnabled(true);
        btnCancelar.setEnabled(true);
        
        operacion="borrar";
        confirmar="Desea borrar el registro";
        mensaje="Registro eliminado con exito";
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        
        txtNombre.setEditable(false);
        txtPrecio.setEditable(false);
        txtIva.setEditable(false);
        txtTipoProducto.setEditable(false);
        txtBuscador.setEditable(true);
        txtCodigo.setEditable(false);
        btnAgregar.setEnabled(true);
        btnEditar.setEnabled(true);
        btnEliminar.setEnabled(true);
        btnSalir.setEnabled(true);
        btnReporte.setEnabled(true);
        btnBuscar.setEnabled(true);
        
        btnGrabar.setEnabled(false);
        btnCancelar.setEnabled(false);
        
        txtBuscador.setText("");
        txtNombre.setText("");
        txtPrecio.setText("");
        txtIva.setText("");
        txtTipoProducto.setText("");
        txtCodigo.setText("");
        
        operacion="";
        confirmar="";
        mensaje="";
        
        getDatos();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnGrabarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGrabarActionPerformed
        int respuesta = 5;
        duplicado = Metodos.evitarDuplicado("producto", "pro_desc", txtNombre.getText().trim(), "pro_cod", txtCodigo.getText());
        if (duplicado && (!operacion.equals("borrar"))) {
            JOptionPane.showMessageDialog(null, "Este registro ya esta en la base de datos");
            btnCancelar.doClick();
        }else{
            respuesta=JOptionPane.showConfirmDialog(null, confirmar);
        }
        if (respuesta==0) {
             String sql="";
            if(operacion.equals("agregar")){
                sql="Insert into producto (pro_desc, precio, pro_iva, cod_tipo_pro) "
                + "values ('"+txtNombre.getText().toUpperCase().trim()+"', "+txtPrecio.getText().trim()+", "+txtIva.getText().trim()+", split_part('"+txtTipoProducto.getText()+"','-',1)::integer" +")";
            }
            
            if(operacion.equals("modificar")){
                sql="update producto set pro_desc = '"+txtNombre.getText().toUpperCase().trim()+"', precio = "+txtPrecio.getText().trim()+", pro_iva = "+txtIva.getText().trim()+ ", cod_tipo_pro = split_part('"+txtTipoProducto.getText()+"','-',1)::integer where pro_cod = "+txtCodigo.getText()+";";
            }
            
            if(operacion.equals("borrar")){
                sql="Delete from producto where pro_cod = "+txtCodigo.getText();
            }
            
            Conexion cn=new Conexion();
            try {
                cn.conectar();
                System.out.println(sql);
                cn.actualizar(sql);
                JOptionPane.showMessageDialog(null, mensaje);
                btnCancelar.doClick();

                
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(producto.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, ex.getMessage());
                
            } catch (SQLException ex) {
                Logger.getLogger(producto.class.getName()).log(Level.SEVERE, null, ex);
                if(operacion.equals("borrar") && txtCodigo.getText().equals("")){
                    JOptionPane.showMessageDialog(null, "Primero debe seleccionar una Producto");
                }
                if (operacion.equals("borrar") && !txtCodigo.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "No se puede eliminar, registro referenciado");
                }
                if (operacion.equals("modificar")) {
                    JOptionPane.showMessageDialog(null, "Primero debe seleccionar un Producto");
                }
//                JOptionPane.showMessageDialog(null, ex.getMessage());
            }
        }else if(respuesta==1 || respuesta==2){
            JOptionPane.showMessageDialog(null, "Cancelado");
            btnCancelar.doClick();
        }
    }//GEN-LAST:event_btnGrabarActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        txtNombre.setEditable(false);
        txtPrecio.setEditable(true);
        txtPrecio.requestFocus();
    }//GEN-LAST:event_txtNombreActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void grillaBancoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_grillaBancoMouseClicked
       int fila=grillaBanco.getSelectedRow();
        
       String cod= grillaBanco.getValueAt(fila, 0).toString();
       String nombre= grillaBanco.getValueAt(fila, 1).toString();
       String precio= grillaBanco.getValueAt(fila, 2).toString();
       String iva= grillaBanco.getValueAt(fila, 3).toString();
       String tipo= grillaBanco.getValueAt(fila, 4).toString();
       
       if(busqueda.equals("pediVenta") && operacion.equals("")){   //primero se realiza esta accion porque de otro modo vacia la variable "operacion"
           pedidoDeVenta.txtCodArti.setText(cod);
           pedidoDeVenta.txtArti.setText(nombre);
           pedidoDeVenta.txtArti.requestFocus();
           busqueda = "";
           dispose();
       }
       if(busqueda.equals("pediCompra") && operacion.equals("")){   //primero se realiza esta accion porque de otro modo vacia la variable "operacion"
           pedido_de_compra.txtCodArti.setText(cod);
           pedido_de_compra.txtArti.setText(nombre);
           pedido_de_compra.txtArti.requestFocus();
           busqueda = "";
           dispose();
       }
       if(busqueda.equals("presuCompra") && operacion.equals("")){   //primero se realiza esta accion porque de otro modo vacia la variable "operacion"
           presupuesto_de_compra.txtCodArti.setText(cod);
           presupuesto_de_compra.txtArti.setText(nombre);
           presupuesto_de_compra.txtPrecio.setText(precio);
           presupuesto_de_compra.txtPrecio.requestFocus();
           busqueda = "";
           dispose();
       }
       if(busqueda.equals("compra") && operacion.equals("")){   //primero se realiza esta accion porque de otro modo vacia la variable "operacion"
           compras.txt_cod_arti.setText(cod);
           compras.txt_arti.setText(nombre);
           compras.txt_precio.setText(precio);
           compras.txt_precio.requestFocus();
           busqueda = "";
           dispose();
       }
       if(busqueda.equals("presupuestoServicios") && operacion.equals("")){   //primero se realiza esta accion porque de otro modo vacia la variable "operacion"
           presupuestoServicios.txtCodArti.setText(cod);
           presupuestoServicios.txtArticuloDesc.setText(nombre);
           presupuestoServicios.txtCodArti.requestFocus();
           busqueda = "";
           dispose();
       }
       if(busqueda.equals("venta") && operacion.equals("")){   //primero se realiza esta accion porque de otro modo vacia la variable "operacion"
           ventas.txt_cod_arti.setText(cod);
           ventas.txt_arti.setText(nombre);
           ventas.txt_arti.requestFocus();
           busqueda = "";
           dispose();
       }
       if(busqueda.equals("trabajo_terminado") ){   //primero se realiza esta accion porque de otro modo vacia la variable "operacion"
           TrabajoTerminado.txtCodArti.setText(cod);
           TrabajoTerminado.txtArticuloDesc.setText(nombre);
           TrabajoTerminado.txtCantidadInsumo.requestFocus();
           busqueda = "";
           dispose();
       }
       
       if(busqueda.equals("ajuste") ){   //primero se realiza esta accion porque de otro modo vacia la variable "operacion"
           TrabajoTerminado.txtCodArti.setText(cod);
           TrabajoTerminado.txtArticuloDesc.setText(nombre);
           TrabajoTerminado.txtCantidadInsumo.requestFocus();
           busqueda = "";
           dispose();
       }
       
       

       
       if(operacion.equals("modificar") || operacion.equals("borrar")){
           txtCodigo.setText(cod);
           txtNombre.setText(nombre);
           txtPrecio.setText(precio);
           txtIva.setText(iva);
           txtTipoProducto.setText(tipo);
       }
       
       if(operacion.equals("modificar")){
           txtNombre.requestFocus();
           
       }
       if(operacion.equals("borrar")){
           btnGrabar.doClick();
       }
       //operacion de tipo presupuesto 
       if(operacion.equals("presupuesto")){
          
           
           
           
           dispose();
       }
       //operacion de tipo orden de produccion
       if(operacion.equals("orden_produccion")){
           
           
           
           
           dispose();
       }
        
    }//GEN-LAST:event_grillaBancoMouseClicked

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        getDatos();
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void txtPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecioActionPerformed
        txtPrecio.setEditable(false);
        txtIva.setEditable(true);
        txtIva.requestFocus();
    }//GEN-LAST:event_txtPrecioActionPerformed

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped
        char c = evt.getKeyChar();
        if (Character.isDigit(c)) {
           getToolkit().beep();
           evt.consume();
           JOptionPane.showMessageDialog(null, "Ingrese solo letras");
           txtNombre.setCursor(null);
        }
    }//GEN-LAST:event_txtNombreKeyTyped

    private void btnReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReporteActionPerformed
        vehiculos.reporteImprimir("reporteProductos.jasper");
    }//GEN-LAST:event_btnReporteActionPerformed

    private void txtTipoProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTipoProductoActionPerformed
        btnGrabar.doClick();
    }//GEN-LAST:event_txtTipoProductoActionPerformed

    private void btn_buscar_tipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscar_tipoActionPerformed
        tipoDeProducto.busqueda="producto";
        new tipoDeProducto().setVisible(true);
    }//GEN-LAST:event_btn_buscar_tipoActionPerformed

    private void txtIvaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIvaActionPerformed
        txtIva.setEditable(false);
        btn_buscar_tipo.doClick();
    }//GEN-LAST:event_txtIvaActionPerformed

    public void getDatos(){
        Conexion cn=new Conexion();
        
        try {
            cn.conectar();
            ResultSet sucursal=cn.consultar("select * from v_producto where pro_desc ilike '%"+txtBuscador.getText()+"%' order by pro_cod"); //order by ordena de menor a mayor, si se quiere de mayor a menor se le agrega desc al final
            Metodos.limpiarTabla(grillaBanco);
            if(sucursal.isBeforeFirst()){
                while(sucursal.next()){
                    Metodos.cargarTabla(grillaBanco, new Object[]{sucursal.getString("pro_cod"), sucursal.getString("pro_desc"), sucursal.getString("precio"), sucursal.getString("pro_iva"), sucursal.getString("tipo")});
                }
            }else{
                JOptionPane.showMessageDialog(null, "No hay registros en la base de datos");
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(producto.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "No se encuentra "+ex.getMessage());
        } catch (SQLException ex) {
            Logger.getLogger(producto.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,ex.getMessage());
        }
    }
    
    
    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Metal".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(producto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(producto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(producto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(producto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new producto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGrabar;
    private javax.swing.JButton btnReporte;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btn_buscar_tipo;
    private javax.swing.JTable grillaBanco;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField txtBuscador;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtIva;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPrecio;
    public static javax.swing.JTextField txtTipoProducto;
    // End of variables declaration//GEN-END:variables
}
