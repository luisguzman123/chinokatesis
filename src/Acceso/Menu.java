package Acceso;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import ventanas.ajuste_stock;
import ventanas.bancos;
import ventanas.cajas;
import ventanas.ciudad;
import ventanas.clientes;
import ventanas.compras;
import ventanas.deposito;
import ventanas.empleados;
import ventanas.etapasDeProduccion;
import ventanas.formaDePago;
import ventanas.materiaPrima;
import ventanas.motivo_mermas;
import ventanas.motivos;
import ventanas.notaCreditoCompra;
import ventanas.notaRemision;
import ventanas.orden_compra;
import ventanas.pedidoDeVenta;
import ventanas.pedido_de_compra;
import ventanas.presupuesto_de_compra;
import ventanas.presupuesto_produccion;
import ventanas.producto;
import ventanas.proveedor;
import ventanas.sucursal;
import ventanas.tarjeta;
import ventanas.tipoDeProducto;
import ventanas.vehiculos;

//import referenciales.Cargos;
//import referenciales.Ciudades;
//import referenciales.Clientes;
//import referenciales.Sucursales;
public class Menu extends javax.swing.JFrame {

    public static String usuario;
    public static String empleado;
    public static String nivel;
    public static String idUsuario;
    public static String idEmpleado;
    public static String idSucursal;
    public static String Sucursal;

    public Menu() {
        initComponents();
        this.setExtendedState(Menu.MAXIMIZED_BOTH);
        JOptionPane.showMessageDialog(null, "Bienvenido al sistema " + empleado);
        menus();
        niveles();

    }

    public void menus() {
        menuReferenciales.setEnabled(false);
        refeCompras.setEnabled(false);
        refe_Produccion.setEnabled(false);
        refe_ventas.setEnabled(false);
        menuCompras.setEnabled(false);
        menuProduccion.setEnabled(false);
        menuVentas.setEnabled(false);
        infoCompras.setEnabled(false);
        infoProduccion.setEnabled(false);
        infoVentas.setEnabled(false);
    }

    public void niveles() {
        if (nivel.equals("1")) {
            menuReferenciales.setEnabled(true);
            menuCompras.setEnabled(true);
            infoCompras.setEnabled(true);
            refeCompras.setEnabled(true);
        } else if (nivel.equals("2")) {
            menuReferenciales.setEnabled(true);
            menuProduccion.setEnabled(true);
            infoProduccion.setEnabled(true);
            refe_Produccion.setEnabled(true);
        } else if (nivel.equals("3")) {
            menuReferenciales.setEnabled(true);
            menuVentas.setEnabled(true);
            infoVentas.setEnabled(true);
            refe_ventas.setEnabled(true);
        } else if (nivel.equals("4")) {
            menuReferenciales.setEnabled(true);
            refe_ventas.setEnabled(true);
            refe_Produccion.setEnabled(true);
            refeCompras.setEnabled(true);
            menuVentas.setEnabled(true);
            menuCompras.setEnabled(true);
            menuProduccion.setEnabled(true);
            infoVentas.setEnabled(true);
            infoProduccion.setEnabled(true);
            infoCompras.setEnabled(true);
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        contenedor = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuReferenciales = new javax.swing.JMenu();
        refeCompras = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem13 = new javax.swing.JMenuItem();
        refe_Produccion = new javax.swing.JMenu();
        jMenuItem14 = new javax.swing.JMenuItem();
        jMenuItem15 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem17 = new javax.swing.JMenuItem();
        refe_ventas = new javax.swing.JMenu();
        jMenuItem19 = new javax.swing.JMenuItem();
        jMenuItem20 = new javax.swing.JMenuItem();
        jMenuItem31 = new javax.swing.JMenuItem();
        jMenuItem32 = new javax.swing.JMenuItem();
        jMenuItem33 = new javax.swing.JMenuItem();
        jMenuItem34 = new javax.swing.JMenuItem();
        jMenuItem35 = new javax.swing.JMenuItem();
        jMenuItem36 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        menuCompras = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenuItem16 = new javax.swing.JMenuItem();
        jMenuItem21 = new javax.swing.JMenuItem();
        jMenuItem22 = new javax.swing.JMenuItem();
        jMenuItem23 = new javax.swing.JMenuItem();
        menuProduccion = new javax.swing.JMenu();
        jMenuItem7 = new javax.swing.JMenuItem();
        orden_de_produccion = new javax.swing.JMenuItem();
        produccion_item = new javax.swing.JMenuItem();
        control_calidad = new javax.swing.JMenuItem();
        menuVentas = new javax.swing.JMenu();
        jMenuItem30 = new javax.swing.JMenuItem();
        jMenuItem24 = new javax.swing.JMenuItem();
        jMenuItem18 = new javax.swing.JMenuItem();
        menuInformes = new javax.swing.JMenu();
        infoReferenciales = new javax.swing.JMenuItem();
        infoCompras = new javax.swing.JMenuItem();
        infoProduccion = new javax.swing.JMenuItem();
        infoVentas = new javax.swing.JMenuItem();
        menuAyuda = new javax.swing.JMenu();

        jMenuItem1.setText("jMenuItem1");

        jMenuItem2.setText("jMenuItem2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menú Principal");

        contenedor.setBackground(new java.awt.Color(1, 112, 140));

        menuReferenciales.setText("Referenciales");

        refeCompras.setText("Compras");

        jMenuItem6.setText("Proveedor");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        refeCompras.add(jMenuItem6);

        jMenuItem4.setText("Vehiculo");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        refeCompras.add(jMenuItem4);

        jMenuItem9.setText("Ciudad");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        refeCompras.add(jMenuItem9);

        jMenuItem10.setText("Sucursal");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        refeCompras.add(jMenuItem10);

        jMenuItem13.setText("Depósito");
        jMenuItem13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem13ActionPerformed(evt);
            }
        });
        refeCompras.add(jMenuItem13);

        menuReferenciales.add(refeCompras);

        refe_Produccion.setText("Produccion");

        jMenuItem14.setText("Motivo de mermas");
        jMenuItem14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem14ActionPerformed(evt);
            }
        });
        refe_Produccion.add(jMenuItem14);

        jMenuItem15.setText("Materia prima");
        jMenuItem15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem15ActionPerformed(evt);
            }
        });
        refe_Produccion.add(jMenuItem15);

        jMenuItem8.setText("Empleado");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        refe_Produccion.add(jMenuItem8);

        jMenuItem17.setText("Etapas de producción");
        jMenuItem17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem17ActionPerformed(evt);
            }
        });
        refe_Produccion.add(jMenuItem17);

        menuReferenciales.add(refe_Produccion);

        refe_ventas.setText("Ventas");

        jMenuItem19.setText("Clientes");
        jMenuItem19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem19ActionPerformed(evt);
            }
        });
        refe_ventas.add(jMenuItem19);

        jMenuItem20.setText("Tarjetas");
        jMenuItem20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem20ActionPerformed(evt);
            }
        });
        refe_ventas.add(jMenuItem20);

        jMenuItem31.setText("Bancos");
        jMenuItem31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem31ActionPerformed(evt);
            }
        });
        refe_ventas.add(jMenuItem31);

        jMenuItem32.setText("Formas de pago");
        jMenuItem32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem32ActionPerformed(evt);
            }
        });
        refe_ventas.add(jMenuItem32);

        jMenuItem33.setText("Productos");
        jMenuItem33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem33ActionPerformed(evt);
            }
        });
        refe_ventas.add(jMenuItem33);

        jMenuItem34.setText("Tipo de producto");
        jMenuItem34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem34ActionPerformed(evt);
            }
        });
        refe_ventas.add(jMenuItem34);

        jMenuItem35.setText("Motivos");
        jMenuItem35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem35ActionPerformed(evt);
            }
        });
        refe_ventas.add(jMenuItem35);

        jMenuItem36.setText("Cajas");
        jMenuItem36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem36ActionPerformed(evt);
            }
        });
        refe_ventas.add(jMenuItem36);

        menuReferenciales.add(refe_ventas);

        jMenuItem3.setText("Usuarios");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        menuReferenciales.add(jMenuItem3);

        jMenuBar1.add(menuReferenciales);

        menuCompras.setText("Gestión de compras");

        jMenuItem5.setText("Pedido de compras");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        menuCompras.add(jMenuItem5);

        jMenuItem11.setText("Presupuesto de proveedor");
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        menuCompras.add(jMenuItem11);

        jMenuItem12.setText("Orden de compras");
        jMenuItem12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem12ActionPerformed(evt);
            }
        });
        menuCompras.add(jMenuItem12);

        jMenuItem16.setText("Compras");
        jMenuItem16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem16ActionPerformed(evt);
            }
        });
        menuCompras.add(jMenuItem16);

        jMenuItem21.setText("Notas de compras");
        jMenuItem21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem21ActionPerformed(evt);
            }
        });
        menuCompras.add(jMenuItem21);

        jMenuItem22.setText("Ajuste de Stock");
        jMenuItem22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem22ActionPerformed(evt);
            }
        });
        menuCompras.add(jMenuItem22);

        jMenuItem23.setText("Nota de remisión");
        jMenuItem23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem23ActionPerformed(evt);
            }
        });
        menuCompras.add(jMenuItem23);

        jMenuBar1.add(menuCompras);

        menuProduccion.setText("Gestión de producción");

        jMenuItem7.setText("A implementar");
        menuProduccion.add(jMenuItem7);

        orden_de_produccion.setText("Orden de Producción");
        orden_de_produccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orden_de_produccionActionPerformed(evt);
            }
        });
        menuProduccion.add(orden_de_produccion);

        produccion_item.setText("Producción");
        produccion_item.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                produccion_itemActionPerformed(evt);
            }
        });
        menuProduccion.add(produccion_item);

        control_calidad.setText(" Control de Calidad");
        control_calidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                control_calidadActionPerformed(evt);
            }
        });
        menuProduccion.add(control_calidad);

        jMenuBar1.add(menuProduccion);

        menuVentas.setText("Gestión de ventas");

        jMenuItem30.setText("A implementar");
        jMenuItem30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem30ActionPerformed(evt);
            }
        });
        menuVentas.add(jMenuItem30);

        jMenuItem24.setText("Pedido de Venta");
        jMenuItem24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem24ActionPerformed(evt);
            }
        });
        menuVentas.add(jMenuItem24);

        jMenuItem18.setText("Presupuesto");
        jMenuItem18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem18ActionPerformed(evt);
            }
        });
        menuVentas.add(jMenuItem18);

        jMenuBar1.add(menuVentas);

        menuInformes.setText("Informes");

        infoReferenciales.setText("Informes referenciales");
        infoReferenciales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                infoReferencialesActionPerformed(evt);
            }
        });
        menuInformes.add(infoReferenciales);

        infoCompras.setText("Informes de compras");
        infoCompras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                infoComprasActionPerformed(evt);
            }
        });
        menuInformes.add(infoCompras);

        infoProduccion.setText("Informes de producción");
        menuInformes.add(infoProduccion);

        infoVentas.setText("Informes de ventas");
        menuInformes.add(infoVentas);

        jMenuBar1.add(menuInformes);

        menuAyuda.setText("Ayuda");
        jMenuBar1.add(menuAyuda);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contenedor, javax.swing.GroupLayout.DEFAULT_SIZE, 922, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contenedor, javax.swing.GroupLayout.DEFAULT_SIZE, 459, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        new proveedor().setVisible(true);

//        Actividad acti=new Actividad();
//        contenedor.add(acti);
//        acti.setVisible(true);
//        
//        acti.setLocation(
//               (contenedor.getSize().width-acti.getSize().width)/2,   
//               (contenedor.getSize().height-acti.getSize().height)/2 
//        );
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        new vehiculos().setVisible(true);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        new ciudad().setVisible(true);
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
        new sucursal().setVisible(true);
    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void jMenuItem13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem13ActionPerformed
        new deposito().setVisible(true);
    }//GEN-LAST:event_jMenuItem13ActionPerformed

    private void jMenuItem19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem19ActionPerformed
        new clientes().setVisible(true);
    }//GEN-LAST:event_jMenuItem19ActionPerformed

    private void jMenuItem20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem20ActionPerformed
        new tarjeta().setVisible(true);
    }//GEN-LAST:event_jMenuItem20ActionPerformed

    private void jMenuItem30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem30ActionPerformed
//        try {
//            new llamadorReferenciales().setVisible(true);
//        } catch (ClassNotFoundException ex) {
//            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (SQLException ex) {
//            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
//        }
    }//GEN-LAST:event_jMenuItem30ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        new pedido_de_compra().setVisible(true);
        pedido_de_compra.txtUsuarioCod.setText(idUsuario);
        pedido_de_compra.txtUsuario.setText(usuario);
        pedido_de_compra.txtSucursal.setText(Sucursal);
        pedido_de_compra.idSucursal = idSucursal;
        pedido_de_compra.idUsuario = idUsuario;
        pedido_de_compra.idPersonal = idEmpleado;
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void infoReferencialesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_infoReferencialesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_infoReferencialesActionPerformed

    private void infoComprasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_infoComprasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_infoComprasActionPerformed

    private void jMenuItem15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem15ActionPerformed
        new materiaPrima().setVisible(true);
    }//GEN-LAST:event_jMenuItem15ActionPerformed

    private void jMenuItem14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem14ActionPerformed
        new motivo_mermas().setVisible(true);
    }//GEN-LAST:event_jMenuItem14ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed

    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        new empleados().setVisible(true);
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem31ActionPerformed
        new bancos().setVisible(true);
    }//GEN-LAST:event_jMenuItem31ActionPerformed

    private void jMenuItem32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem32ActionPerformed
        new formaDePago().setVisible(true);
    }//GEN-LAST:event_jMenuItem32ActionPerformed

    private void jMenuItem33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem33ActionPerformed
        new producto().setVisible(true);
    }//GEN-LAST:event_jMenuItem33ActionPerformed

    private void jMenuItem34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem34ActionPerformed
        new tipoDeProducto().setVisible(true);
    }//GEN-LAST:event_jMenuItem34ActionPerformed

    private void jMenuItem35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem35ActionPerformed
        new motivos().setVisible(true);
    }//GEN-LAST:event_jMenuItem35ActionPerformed

    private void jMenuItem36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem36ActionPerformed
        new cajas().setVisible(true);
    }//GEN-LAST:event_jMenuItem36ActionPerformed

    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
        new presupuesto_de_compra().setVisible(true);
        presupuesto_de_compra.txtUsuarioCod.setText(idUsuario);
        presupuesto_de_compra.txtUsuario.setText(usuario);
        presupuesto_de_compra.txtSucursal.setText(Sucursal);
        presupuesto_de_compra.idSucursal = idSucursal;
        presupuesto_de_compra.idUsuario = idUsuario;
        presupuesto_de_compra.idPersonal = idEmpleado;
    }//GEN-LAST:event_jMenuItem11ActionPerformed

    private void jMenuItem12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem12ActionPerformed
        new orden_compra().setVisible(true);
        orden_compra.txtUsuarioCod.setText(idUsuario);
        orden_compra.txtUsuario.setText(usuario);
        orden_compra.txtSucursal.setText(Sucursal);
        orden_compra.idSucursal = idSucursal;
        orden_compra.idUsuario = idUsuario;
        orden_compra.idPersonal = idEmpleado;
    }//GEN-LAST:event_jMenuItem12ActionPerformed

    private void jMenuItem16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem16ActionPerformed
        new compras().setVisible(true);
        compras.txtCodUsuario.setText(idUsuario);
        compras.txtUsuario.setText(usuario);
        compras.txtSucursal.setText(Sucursal);
        compras.idSucursal = idSucursal;
        compras.idUsuario = idUsuario;
        compras.idPersonal = idEmpleado;
    }//GEN-LAST:event_jMenuItem16ActionPerformed

    private void jMenuItem17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem17ActionPerformed
        // TODO add your handling code here:
        new etapasDeProduccion().setVisible(true);


    }//GEN-LAST:event_jMenuItem17ActionPerformed

    private void jMenuItem18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem18ActionPerformed
        // TODO add your handling code here:
        new presupuesto_produccion().setVisible(true);
    }//GEN-LAST:event_jMenuItem18ActionPerformed

    private void orden_de_produccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orden_de_produccionActionPerformed
        // TODO add your handling code here:
        new ventanas.orden_produccion().setVisible(true);
    }//GEN-LAST:event_orden_de_produccionActionPerformed

    private void produccion_itemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_produccion_itemActionPerformed
        // TODO add your handling code here:
        new ventanas.produccion().setVisible(true);
    }//GEN-LAST:event_produccion_itemActionPerformed

    private void jMenuItem21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem21ActionPerformed
        new notaCreditoCompra().setVisible(true);
        notaCreditoCompra.txtUsuarioCod.setText(idUsuario);
        notaCreditoCompra.txtUsuario.setText(usuario);
        notaCreditoCompra.txtSucursal.setText(Sucursal);
        notaCreditoCompra.idSucursal = idSucursal;
        notaCreditoCompra.idUsuario = idUsuario;
        notaCreditoCompra.idPersonal = idEmpleado;
    }//GEN-LAST:event_jMenuItem21ActionPerformed

    private void jMenuItem22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem22ActionPerformed
        new ajuste_stock().setVisible(true);
        ajuste_stock.txtCodUsuario.setText(idUsuario);
        ajuste_stock.txtUsuario.setText(usuario);
        ajuste_stock.txtSucu.setText(Sucursal);
        ajuste_stock.idSucursal = idSucursal;
        ajuste_stock.idUsuario = idUsuario;
        ajuste_stock.idPersonal = idEmpleado;
    }//GEN-LAST:event_jMenuItem22ActionPerformed

    private void jMenuItem23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem23ActionPerformed
        new notaRemision().setVisible(true);
        notaRemision.txtCodUsuario.setText(idUsuario);
        notaRemision.txtUsuario.setText(usuario);
        notaRemision.txtSucu.setText(Sucursal);
        notaRemision.idSucursal = idSucursal;
        notaRemision.idUsuario = idUsuario;
        notaRemision.idPersonal = idEmpleado;
    }//GEN-LAST:event_jMenuItem23ActionPerformed

    private void control_calidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_control_calidadActionPerformed
        // TODO add your handling code here:
        new ventanas.control_de_calidad().setVisible(true);
    }//GEN-LAST:event_control_calidadActionPerformed

    private void jMenuItem24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem24ActionPerformed
        new pedidoDeVenta().setVisible(true);
        pedidoDeVenta.txtUsuarioCod.setText(idUsuario);
        pedidoDeVenta.txtUsuario.setText(usuario);
        pedidoDeVenta.txtSucursal.setText(Sucursal);
        pedidoDeVenta.idSucursal= idSucursal;
        pedidoDeVenta.idUsuario= idUsuario;
        pedidoDeVenta.idPersonal=idEmpleado;
    }//GEN-LAST:event_jMenuItem24ActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JDesktopPane contenedor;
    private javax.swing.JMenuItem control_calidad;
    private javax.swing.JMenuItem infoCompras;
    private javax.swing.JMenuItem infoProduccion;
    private javax.swing.JMenuItem infoReferenciales;
    private javax.swing.JMenuItem infoVentas;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem15;
    private javax.swing.JMenuItem jMenuItem16;
    private javax.swing.JMenuItem jMenuItem17;
    private javax.swing.JMenuItem jMenuItem18;
    private javax.swing.JMenuItem jMenuItem19;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem20;
    private javax.swing.JMenuItem jMenuItem21;
    private javax.swing.JMenuItem jMenuItem22;
    private javax.swing.JMenuItem jMenuItem23;
    private javax.swing.JMenuItem jMenuItem24;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem30;
    private javax.swing.JMenuItem jMenuItem31;
    private javax.swing.JMenuItem jMenuItem32;
    private javax.swing.JMenuItem jMenuItem33;
    private javax.swing.JMenuItem jMenuItem34;
    private javax.swing.JMenuItem jMenuItem35;
    private javax.swing.JMenuItem jMenuItem36;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JMenu menuAyuda;
    private javax.swing.JMenu menuCompras;
    private javax.swing.JMenu menuInformes;
    private javax.swing.JMenu menuProduccion;
    public static javax.swing.JMenu menuReferenciales;
    private javax.swing.JMenu menuVentas;
    private javax.swing.JMenuItem orden_de_produccion;
    private javax.swing.JMenuItem produccion_item;
    private javax.swing.JMenu refeCompras;
    private javax.swing.JMenu refe_Produccion;
    private javax.swing.JMenu refe_ventas;
    // End of variables declaration//GEN-END:variables
}
