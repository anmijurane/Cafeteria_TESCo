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
    
    int idProveedor;
    private String nombreProv;
    private String telefono;    

    public proveedor(String nombreProv, String telefono) {
        this.nombreProv = nombreProv;
        this.telefono = telefono;
    }

    public int getIdProveedor() {        
        
        Connection con = getConeccion();
        PreparedStatement prepared;
        ResultSet result;
        
        try {
        prepared = con.prepareStatement("SELECT max(id_proveedor) as UsuarioMaximo "
        + "FROM TBL_Proveedor");
        result = prepared.executeQuery();
        
        if (result.next()) {
        idProveedor = result.getInt("UsuarioMaximo")+1;
        System.out.println("idProveedor: " +idProveedor);
        }
        } catch (SQLException e) {
            System.out.println("ERROR getIdProveedor: " +e);
        }
        
        return idProveedor;
    }    

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
        return ""+getIdProveedor()+", \""+nombreProv+"\", \""+telefono+"\"";
    }
    
}
