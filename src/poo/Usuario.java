package poo;

import java.util.Date;
import java.sql.Timestamp;

/**
 * 
 * @author anmijurane <miguel.andres_sic@tesco.edu.mx>
 */
public class Usuario {

    private int idUsuario;
    private String nombreUsuario;
    private String contrasenia;    
    private Date fecha;
    private int idRol;
    private int idArea;

    public Usuario(int idUsuario, String contrasenia, String nombreUsuario, int idRol, int idArea) {
        this.idUsuario = idUsuario;
        this.nombreUsuario = nombreUsuario;
        this.contrasenia = contrasenia;
        this.idRol = idRol;
        this.idArea = idArea;
    }
    
    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        Timestamp date = new Timestamp(fecha.getTime());
        this.fecha = date;
    }

    public int getIdRol() {
        return idRol;
    }

    public void setIdRol(int idRol) {
        this.idRol = idRol;
    }

    public int getIdArea() {
        return idArea;
    }

    public void setIdArea(int idArea) {
        this.idArea = idArea;
    }             

    public String toQuerySQL(){
        return ""+idUsuario+", \"" + nombreUsuario+"\", \""+contrasenia+"\", "+idRol+", "+idArea;
    }
    
    @Override
    public String toString() {
        return "Usuario{" + "\nidUsuario=" + idUsuario + ",\nnombreUsuario=" + nombreUsuario + ",\ncontrasenia=" + contrasenia 
                + ",\n idRol=" + idRol + ",\n idArea=" + idArea + '}';
    }

}
