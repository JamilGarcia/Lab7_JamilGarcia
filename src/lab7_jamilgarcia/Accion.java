/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7_jamilgarcia;

import javax.swing.JOptionPane;
import javax.swing.JProgressBar;

/**
 *
 * @author JamilGarcía
 */
public class Accion extends Thread {
    private int tiempoE;
    private JProgressBar barra;
    private boolean avanzar;
    private boolean vive;

    public Accion() {
    }

    public Accion( int tiempoE, JProgressBar barra) {
        this.tiempoE = tiempoE;
        this.barra = barra;
        avanzar = true;
        vive = true;
    }
    
    public int getTiempoE() {
        return tiempoE;
    }

    public void setTiempoE(int tiempoE) {
        this.tiempoE = tiempoE;
    }

    public JProgressBar getBarra() {
        return barra;
    }

    public void setBarra(JProgressBar barra) {
        this.barra = barra;
    }

    public boolean isAvanzar() {
        return avanzar;
    }

    public void setAvanzar(boolean avanzar) {
        this.avanzar = avanzar;
    }

    public boolean isVive() {
        return vive;
    }

    public void setVive(boolean vive) {
        this.vive = vive;
    }

    @Override
    public void run() {
        while (vive) {
            if (avanzar) {
                barra.setValue(barra.getValue() + 1);
                if (barra.getValue() == tiempoE) {
                    vive = false;
                }
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {

                }
            }
        }
        JOptionPane.showMessageDialog(barra, "Completado con exito");
    }

}
