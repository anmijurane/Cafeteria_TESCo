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
public class Productos {

    private int idProducto;
    private String nombreProd;
    private double precio;
    private int cantBodega;
    private int idProvedor;

    public int getIdProducto() {
        Connection con = getConeccion();
        PreparedStatement prepared;
        ResultSet result;
        
        try {
        prepared = con.prepareStatement("SELECT max(id_producto) as idMaximo "
        + "FROM TBL_Producto");
        result = prepared.executeQuery();
        
        if (result.next()) {
        idProducto = result.getInt("idMaximo")+1;
        System.out.println("idProveedor: " +idProducto);
        }
        } catch (SQLException e) {
            System.out.println("ERROR getIdProveedor: " +e);
        }                
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public int getCantBodega() {
        return cantBodega;
    }

    public void setCantBodega(int cantBodega) {
        this.cantBodega = cantBodega;
    }

    public String getNombreProd() {
        return nombreProd;
    }

    public void setNombreProd(String nombreProd) {
        this.nombreProd = nombreProd.toUpperCase();
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    
    public int getIdProvedor() {
        return idProvedor;
    }

    public void setIdProvedor(int idProvedor) {
        this.idProvedor = idProvedor;
    }
    
    public String toQuerySQL(){
        return ""+getIdProducto()+ ", \"" + getNombreProd() +"\", "
                + getPrecio() + ", " 
                + getCantBodega() + ", " + getIdProvedor();
    }
    
    public String toUpdateSQL(){
        return "precio = \'" +getPrecio() + "\', cant_bodega = \'"
                + getCantBodega()+"\' WHERE nombre_prod = \"" 
                + getNombreProd()+"\"";
    }
    
    
}
