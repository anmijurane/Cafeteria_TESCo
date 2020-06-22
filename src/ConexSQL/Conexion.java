package ConexSQL;

import java.awt.HeadlessException;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 * 
 * @author anmijurane <miguel.andres_sic@tesco.edu.mx>
 */

public class Conexion {

    public static final String URL = "jdbc:mysql://cafeteriatesco.cutnsruxkj7l.us-east-2.rds.amazonaws.com:3306/cafeteriatesco";
    public static final String USERNAME = "tesco_cafe";
    public static final String PASSWORD = "CMMI_tesco";    
    
    
    /*public static final String URL = "jdbc:mysql://127.0.0.1:3306/cafeteria_tsco";
    public static final String USERNAME = "root";
    public static final String PASSWORD = "rootroot";    */
    
  //  mysql -h cafeteriatesco.cutnsruxkj7l.us-east-2.rds.amazonaws.com -u tesco_cafe -p
    
    
    public static void coneccion(){
        try {
            Connection con = null;
            con = getConeccion();
            
            PreparedStatement ps;
            ResultSet res;
            
            ps = con.prepareStatement("SELECT * FROM tbl_usuario");
            
            res = ps.executeQuery();
            
            if (res.next()) {
                JOptionPane.showMessageDialog(null,res.getInt("id_usuario"+res.getString("nombre_usr")));
            }else{
                JOptionPane.showMessageDialog(null, "No existen datos");
            }
            con.close();
        } catch (HeadlessException | SQLException e) {
            System.out.println("Error:"+e);
        }
    }
    
    
    public static Connection getConeccion(){
        Connection con = null;
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = (Connection) DriverManager.getConnection(URL, USERNAME, PASSWORD); 
            System.out.println("Conexión exitosa");
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Error: " +e);
        }
        return con;
    }
    
    public static void main(String [] args){
        
        coneccion();
        
    }
    
}
