
package clases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Carreño
 */
public class Conexion {
    public Connection conexion;
    public Statement sentencia;
    public ResultSet resultado;
    
    
    
    public static String host="localhost";
    public static String user="postgres";
    public static String bd="tesis_pro1";
    public static String pss="123";
    public static String puerto="5432";
    
    public Connection conectar() throws ClassNotFoundException, SQLException{
        Class.forName("org.postgresql.Driver");
        conexion=DriverManager.getConnection("jdbc:postgresql://"+host+":"+puerto+"/"+bd+"", user, pss);
        return conexion;
    }
    public ResultSet consultar(String sql) throws SQLException{
        sentencia=conexion.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
        resultado=sentencia.executeQuery(sql);
        return resultado;
    }
    public void actualizar(String sql) throws SQLException{
        sentencia=conexion.createStatement();
        sentencia.executeUpdate(sql);
    }
    public void desconectar() throws SQLException{
        sentencia.close();
        conexion.close();
    }
    
    
    
    
    
    
   
    
    
}
