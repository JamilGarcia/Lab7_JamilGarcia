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
public class Solistas extends Artistas{
    
    private int edad; 

    public Solistas() {
        super();
    }

    public Solistas(int edad, String usuario, String contra, String nombre, String gmusical) {
        super(usuario, contra, nombre, gmusical);
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return super.toString() + "Solistas{" + "edad=" + edad + '}';
    }
    
    
    
}
