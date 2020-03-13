package lab7_jamilgarcia;

import java.io.Serializable;
import java.util.ArrayList;

public class Artistas implements Serializable {
    
    private String usuario;
    private String contra; 
    private String nombre;
    private String gmusical; 
    private ArrayList <Canciones> cn = new ArrayList();

    private static final long SerialVersionUID = 4443L;
    
    public Artistas() {
    }

    public Artistas(String usuario, String contra, String nombre, String gmusical) {
        this.usuario = usuario;
        this.contra = contra;
        this.nombre = nombre;
        this.gmusical = gmusical;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContra() {
        return contra;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGmusical() {
        return gmusical;
    }

    public void setGmusical(String gmusical) {
        this.gmusical = gmusical;
    }

    public ArrayList<Canciones> getCn() {
        return cn;
    }

    public void setCn(ArrayList<Canciones> cn) {
        this.cn = cn;
    }

    @Override
    public String toString() {
        return "Artistas{" + "usuario=" + usuario + ", contra=" + contra + ", nombre=" + nombre + ", gmusical=" + gmusical + ", cn=" + cn + '}';
    }
    
    
    
}
