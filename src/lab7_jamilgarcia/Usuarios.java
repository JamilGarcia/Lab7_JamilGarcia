/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7_jamilgarcia;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author JamilGarcía
 */
public class Usuarios implements Serializable{
    
    private String usuario; 
    private String Contraseña; 
    private String nombreU; 
    private int edadU; 
    private ArrayList <Eventos> evn = new ArrayList();
    private ArrayList <Artistas> art = new ArrayList();

    private static final long SerialVersionUID = 4444L;

    public Usuarios(String usuario, String Contraseña, String nombreU, int edadU) {
        this.usuario = usuario;
        this.Contraseña = Contraseña;
        this.nombreU = nombreU;
        this.edadU = edadU;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return Contraseña;
    }

    public void setContraseña(String Contraseña) {
        this.Contraseña = Contraseña;
    }

    public String getNombreU() {
        return nombreU;
    }

    public void setNombreU(String nombreU) {
        this.nombreU = nombreU;
    }

    public int getEdadU() {
        return edadU;
    }

    public void setEdadU(int edadU) {
        this.edadU = edadU;
    }

    public ArrayList<Eventos> getEvn() {
        return evn;
    }

    public void setEvn(ArrayList<Eventos> evn) {
        this.evn = evn;
    }

    public ArrayList<Artistas> getArt() {
        return art;
    }

    public void setArt(ArrayList<Artistas> art) {
        this.art = art;
    }

    @Override
    public String toString() {
        return usuario;
    }
    
    
    
}
