package clases;

import Acceso.Menu;
import com.toedter.calendar.JCalendar;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;
import ventanas.compras;
import ventanas.orden_produccion;

/**
 *
 * @author Carreño
 */
public class Metodos {

    public static String dameFechaFormateada(java.util.Date fecha) {
        SimpleDateFormat formateador = new SimpleDateFormat("dd-MM-yyyy");
        return formateador.format(fecha);
    }

    /**
     * Agregar marcar con clic derecho
     *
     * @param datos_tb
     */
    public static void agregarClicDerechoATabla(JTable datos_tb) {
        datos_tb.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                if (!SwingUtilities.isLeftMouseButton(e)) {
                    if (SwingUtilities.isRightMouseButton(e)) {
                        Point p = e.getPoint();
                        int rowNumber = datos_tb.rowAtPoint(p);
                        ListSelectionModel modelo = datos_tb.getSelectionModel();
                        modelo.setSelectionInterval(rowNumber, rowNumber);

                    }
                }
            }
        }
        );
    }

    public static void cargarTabla(JTable tabla, Object[] datos) {
        DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();
        modelo.addRow(datos);
    }

    public static void limpiarTabla(JTable tabla) {
        DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();
        modelo.setRowCount(0);
    }

    public static void eliminarFila(JTable tabla, int fila) {
        DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();
        modelo.removeRow(fila);
    }

    public static String siguienteCodigo(String campo, String tabla) {
        String cod = "";

        Conexion cn = new Conexion();
        try {
            cn.conectar();
            ResultSet codigo = cn.consultar("select coalesce (max(" + campo + "),0)+1 as codigo from " + tabla);
            codigo.next(); //hace pasar al registro 1.1 y no toma la cabecera de la tabla(nombre de la columna) como registro.
            cod = codigo.getString("codigo");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Metodos.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Metodos.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cod;
    }

    public static String ultimoCodigo(String campo, String tabla) {
        String cod = "";

        Conexion cn = new Conexion();
        try {
            cn.conectar();
            ResultSet codigo = cn.consultar("select coalesce (max(" + campo + "),0) as codigo from " + tabla);
            if (codigo.next()) {

                cod = codigo.getString("codigo");
            } else {
                cod = "0";

            }
            //hace pasar al registro 1.1 y no toma la cabecera de la tabla(nombre de la columna) como registro.
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Metodos.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Metodos.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cod;
    }

    public static boolean evitarDuplicado(String tabla, String campoBD, String dato, String pk, String codigo) {

        Conexion cn = new Conexion();
        try {
            cn.conectar();
            ResultSet duplicado = cn.consultar("select * from " + tabla + " where upper(" + campoBD + ") = '" + dato.toUpperCase() + "' and " + pk + " != " + codigo);
            return duplicado.isBeforeFirst(); // isBeforeFirst() retorna un valor true si hay registros despues de la cabecera y un valor false en caso contrario

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Metodos.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Metodos.class.getName()).log(Level.SEVERE, null, ex);
        }

        return false;
    }

    public static boolean evitarDuplicado2(String tabla, String campoBD, String dato, String pk, String codigo) {

        Conexion cn = new Conexion();
        try {
            cn.conectar();
            ResultSet duplicado = cn.consultar("select * from " + tabla + " where " + campoBD + " = '" + dato + "' and " + pk + " = " + codigo);
            return duplicado.isBeforeFirst(); // isBeforeFirst() retorna un valor true si hay registros despues de la cabecera y un valor false en caso contrario

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Metodos.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Metodos.class.getName()).log(Level.SEVERE, null, ex);
        }

        return false;
    }

    public static void cargarCombo(JComboBox combo, String campos, String tabla) {
        Conexion cn = new Conexion();
        try {
            cn.conectar();
            System.out.println("Select " + campos + " as datos from " + tabla);
            ResultSet datos = cn.consultar("Select " + campos + " as datos from " + tabla);

            combo.removeAllItems();
            if (datos.isBeforeFirst()) {
                while (datos.next()) {
                    combo.addItem(datos.getString("datos"));  //se le pasa por parametro el alias de la consulta sql "datos" pasado al resultSet
                }
            } else {
                JOptionPane.showMessageDialog(null, "No hay registros en " + tabla.toUpperCase());
            }

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Metodos.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Metodos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void cargarComboReferencia(JComboBox combo, String campos, String tabla, String refe, String dato) {
        Conexion cn = new Conexion();
        try {
            cn.conectar();
            System.out.println("Select " + campos + " as datos from " + tabla + " where " + refe + " = " + dato + "");
            ResultSet datos = cn.consultar("Select " + campos + " as datos from " + tabla + " where " + refe + " = " + dato + "");

            combo.removeAllItems();
            if (datos.isBeforeFirst()) {
                while (datos.next()) {
                    combo.addItem(datos.getString("datos"));  //se le pasa por parametro el alias de la consulta sql "datos" pasado al resultSet
                }
            } else {
                JOptionPane.showMessageDialog(null, "No hay registros en " + tabla.toUpperCase());
            }

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Metodos.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Metodos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static boolean evitarDuplicadoId(String tabla, String pk, String codigo) {

        Conexion cn = new Conexion();
        try {
            cn.conectar();
            ResultSet duplicado = cn.consultar("select * from " + tabla + " where " + pk + " = " + codigo);
            return duplicado.isBeforeFirst(); // isBeforeFirst() retorna un valor true si hay registros despues de la cabecera y un valor false en caso contrario

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Metodos.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Metodos.class.getName()).log(Level.SEVERE, null, ex);
        }

        return false;
    }

    public static String ultimoCodigoNormal(String campo, String tabla) {
        String cod = "";

        Conexion cn = new Conexion();
        try {
            cn.conectar();
            ResultSet codigo = cn.consultar("select coalesce (max(" + campo + "),0) as codigo from " + tabla);
            codigo.next(); //hace pasar al registro 1.1 y no toma la cabecera de la tabla(nombre de la columna) como registro.
            cod = codigo.getString("codigo");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Metodos.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Metodos.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cod;
    }

    public static java.sql.Date convertirFechaSql(Date fecha) {
        SimpleDateFormat formateador = new SimpleDateFormat("yyyy-MM-dd");
        if (fecha == null) {
            return java.sql.Date.valueOf(formateador.format(new JCalendar().getDate()));
        }
        return java.sql.Date.valueOf(formateador.format(fecha));
    }

    public static java.sql.Date convertirFechaSql(String fecha) {
        SimpleDateFormat formatoDelTexto = new SimpleDateFormat("yyyy-MM-dd");
        try {
            return convertirFechaSql(formatoDelTexto.parse(fecha));
        } catch (ParseException ex) {
            Logger.getLogger(Metodos.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public static String dameFechaFormateadaSql(java.util.Date fecha) {
        SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");
        return f.format(fecha);
    }

    /**
     * Retorna fecha formateada en yyyy-MM-dd
     *
     * @param fecha
     * @return
     */
    public static String dameFechaFormateadaSQL(java.util.Date fecha) {
        SimpleDateFormat formateador = new SimpleDateFormat("yyyy-MM-dd");
        return formateador.format(fecha);
    }

    public static int sumarColumna(JTable tabla, int columna) {
        int fila = tabla.getRowCount();
        int total = 0;
        for (int i = 0; i < fila; i++) {
            total += Integer.parseInt(String.valueOf(tabla.getValueAt(i, columna)));
        }
        return total;
    }

    public static boolean estadoStock(String depo, String sucu, String materia) {
        Conexion cn = new Conexion();

        try {
            cn.conectar();
            ResultSet stock = cn.consultar("select cantidad from stock_productos where cod_depo = " + depo + " and sucur_id = " + sucu + " and pro_cod = " + materia); //order by ordena de menor a mayor, si se quiere de mayor a menor se le agrega desc al final

            if (stock.isBeforeFirst()) {
                while (stock.next()) {
                    return true;
                }
            } else {
                JOptionPane.showMessageDialog(null, "No hay registros en la base de datos");
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Metodos.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "No se encuentra " + ex.getMessage());
        } catch (SQLException ex) {
            Logger.getLogger(Metodos.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        return false;
    }

    public static String traerIvaProducto(String cod) {
        try {
            Conexion cn = new Conexion();
            cn.conectar();
            ResultSet ivaa = cn.consultar("select pro_iva from producto where pro_cod = " + cod);
            if (ivaa.isBeforeFirst()) {
                while (ivaa.next()) {
                    String iva = ivaa.getString("pro_iva");
                    return iva;
                }
            } else {
                JOptionPane.showMessageDialog(null, "No hay registros en la base de datos");
            }

        } catch (SQLException ex) {
            Logger.getLogger(compras.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(compras.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "";
    }

    public static ResultSet getResulSet(String sql) {
        ResultSet resultados = null;
        Conexion cn = new Conexion();

        try {
            cn.conectar();
            resultados = cn.consultar(sql);
            return resultados;

        } catch (ClassNotFoundException ex) {

            Logger.getLogger(orden_produccion.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(orden_produccion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return resultados;

    }

    public static String dameDepositoDeProduccionDetalle(String cod_produccion, String cod_orden, String cod_producto) {
        ResultSet resultados = null;
        Conexion cn = new Conexion();

        try {
            cn.conectar();
            resultados = cn.consultar("SELECT cod_depo\n"
                    + "  FROM \"detalle_producción\" \n"
                    + "  where \"cod_producción\" = "+cod_produccion+" and cod_or_prod =  "+cod_orden+"\n"
                    + "   and pro_cod = "+cod_producto+";");
            
            if(resultados.first()){
                return String.valueOf(resultados.getInt("cod_depo"));
            }

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(orden_produccion.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(orden_produccion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "0";

    }
    
    
    
    
    
    public static int cajaAbierta() {
        Conexion cn = new Conexion();

        try {
            cn.conectar();
            ResultSet caja = cn.consultar("SELECT\n"
                    + "*\n"
                    + "FROM aper_cierre ac\n"
                    + "WHERE ac.cierre_fecha is null OR ac.cierre_fecha::CHARACTER = '' \n"
                    + "AND ac.usu_id = " + Menu.idUsuario + "\n"
                    + "and ac.sucur_id = " + Menu.idSucursal + "\n"
                    + "and ac.tipo = 'APERTURA'\n"
                    + "AND ac.estado = 'ACTIVO'\n"
                    + "LIMIT 1");

            //en el caso que exista una caja abierta
            if (caja.isBeforeFirst()) {
                while (caja.next()) {
                    return caja.getInt("cod_aper_cierre");

                }
            } else {
                //en el caso que no esta abierta
                return  0;

            }
        } catch (ClassNotFoundException ex) {

            Logger.getLogger(orden_produccion.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(orden_produccion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return  0 ;
  }
    public static int dameCodcaja() {
        Conexion cn = new Conexion();

        try {
            cn.conectar();
            ResultSet caja = cn.consultar("SELECT\n"
                    + "*\n"
                    + "FROM aper_cierre ac\n"
                    + "WHERE ac.cierre_fecha is null OR ac.cierre_fecha::CHARACTER = '' \n"
                    + "AND ac.usu_id = " + Menu.idUsuario + "\n"
                    + "and ac.sucur_id = " + Menu.idSucursal + "\n"
                    + "and ac.tipo = 'APERTURA'\n"
                    + "AND ac.estado = 'ACTIVO'\n"
                    + "LIMIT 1");

            //en el caso que exista una caja abierta
            if (caja.isBeforeFirst()) {
                while (caja.next()) {
                    return caja.getInt("cod_caja");

                }
            } else {
                //en el caso que no esta abierta
                return  0;

            }
        } catch (ClassNotFoundException ex) {

            Logger.getLogger(orden_produccion.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(orden_produccion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return  0 ;
  }
}
