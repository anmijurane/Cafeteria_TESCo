package poo;

import static ConexSQL.Conexion.getConeccion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * 
 * @author anmijurane <miguel.andres_sic@tesco.edu.mx>
 */
public class proveedor {
    
    private int idProveedor;
    private String nombreProv;
    private String telefono;    

    public int getIdProveedor() {
        int id = 0;
        
        Connection con = getConeccion();
        PreparedStatement prepared;
        ResultSet result;
        
        try {
            prepared = con.prepareStatement("SELECT max(id_proveedor) "
                    + "FORM TBL_Proveedor");
            result = prepared.executeQuery();
            
            if (result.next()) {
                id = result.getInt("id_proveedor");
            }
        } catch (SQLException e) {
        }
        
        return idProveedor;
    }
    int id_Proveedor = getIdProveedor();

    public void setIdProveedor(int idProveedor) {                
        this.idProveedor = idProveedor;
    }

    public String getNombreProv() {        
        return nombreProv;
    }

    public void setNombreProv(String nombreProv) {
        this.nombreProv = nombreProv;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    public String toQuerySQL(){
        return ""+idProveedor+1+", \""+nombreProv+"\", \""+telefono+"\"";
    }
    
}
