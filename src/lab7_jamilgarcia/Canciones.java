/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7_jamilgarcia;

/**
 *
 * @author JamilGarcía
 */
public class Canciones {
    
    private String nombreC; 
    private int tiemDura; 

    public Canciones() {
    }

    public Canciones(String nombreC, int tiemDura) {
        this.nombreC = nombreC;
        this.tiemDura = tiemDura;
    }

    public String getNombreC() {
        return nombreC;
    }

    public void setNombreC(String nombreC) {
        this.nombreC = nombreC;
    }

    public int getTiemDura() {
        return tiemDura;
    }

    public void setTiemDura(int tiemDura) {
        this.tiemDura = tiemDura;
    }

    @Override
    public String toString() {
        return  nombreC +  " "  + tiemDura + 's';
    }
    
}
