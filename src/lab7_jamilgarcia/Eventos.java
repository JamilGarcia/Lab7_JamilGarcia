/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7_jamilgarcia;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author JamilGarcía
 */
public class Eventos {
    
    private Date fecha; 
    private String ciudad; 
    private String lugar; 
    private int capacidadP; 
    private ArrayList <Canciones> setlist = new ArrayList();

    public Eventos() {
    }

    public Eventos(Date fecha, String ciudad, String lugar, int capacidadP) {
        this.fecha = fecha;
        this.ciudad = ciudad;
        this.lugar = lugar;
        this.capacidadP = capacidadP;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public int getCapacidadP() {
        return capacidadP;
    }

    public void setCapacidadP(int capacidadP) {
        this.capacidadP = capacidadP;
    }

    public ArrayList<Canciones> getSetlist() {
        return setlist;
    }

    public void setSetlist(ArrayList<Canciones> setlist) {
        this.setlist = setlist;
    }

    @Override
    public String toString() {
        return "Eventos{" + "fecha=" + fecha + ", ciudad=" + ciudad + ", lugar=" + lugar + ", capacidadP=" + capacidadP + ", setlist=" + setlist + '}';
    }
    
    
    
}
