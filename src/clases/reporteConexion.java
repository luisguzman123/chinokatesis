package clases;

import static clases.Conexion.bd;
import static clases.Conexion.host;
import static clases.Conexion.pss;
import static clases.Conexion.puerto;
import static clases.Conexion.user;

import java.sql.*;
import javax.swing.JOptionPane;

public class reporteConexion
{
    
    public Connection conexion = null; 
    public Statement sentencia;
    public ResultSet resultado;
  
    public reporteConexion()
    {
        try
        {  
            Class.forName("org.postgresql.Driver");
            conexion = DriverManager.getConnection("jdbc:postgresql://"+host+":"+puerto+"/"+bd+"", user, pss);  
//            JOptionPane.showMessageDialog(null, "hasta aca se conecta");
        }
         catch (Exception e)
        {
             JOptionPane.showMessageDialog(null, "Hubo un problema con los parametros de conexion" , "Verifiquelo",JOptionPane.INFORMATION_MESSAGE);
             System.exit(0);
        }
    }
    public static void main(String[] args)
    {
		new reporteConexion();
    }
 }




