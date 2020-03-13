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
public class Banda  extends Artistas{
    
    private int nIntegrantes; 

    public Banda() {
        super();
    }

    public Banda(int nIntegrantes, String usuario, String contra, String nombre, String gmusical) {
        super(usuario, contra, nombre, gmusical);
        this.nIntegrantes = nIntegrantes;
    }

    public int getnIntegrantes() {
        return nIntegrantes;
    }

    public void setnIntegrantes(int nIntegrantes) {
        this.nIntegrantes = nIntegrantes;
    }

    @Override
    public String toString() {
        return super.toString() + "Banda{" + "nIntegrantes=" + nIntegrantes + '}';
    }
    
}
