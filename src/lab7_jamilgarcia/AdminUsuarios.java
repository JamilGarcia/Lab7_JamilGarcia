/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7_jamilgarcia;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author JamilGarcía
 */
public class AdminUsuarios {
    
    private ArrayList <Usuarios> usua = new ArrayList();
    private File archivo; 
    
    public AdminUsuarios (String path) {
        archivo = new File(path);
    }

    public ArrayList<Usuarios> getUsua() {
        return usua;
    }

    public void setUsua(ArrayList<Usuarios> usua) {
        this.usua = usua;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    @Override
    public String toString() {
        return "AdminUsuarios{" + "usua=" + usua + ", archivo=" + archivo + '}';
    }
    
    public void setUsuario (Usuarios u){
        this.usua.add(u);
    }
    
    public void cargarArchivo() {
        try {
            usua = new ArrayList();
            Usuarios temp;
            if (archivo.exists()){
                FileInputStream entrada
                        = new FileInputStream (archivo);
                ObjectInputStream objeto
                        = new ObjectInputStream(entrada);
                try {
                    while ((temp = (Usuarios) objeto.readObject()) != null) {
                        usua.add(temp);
                    }
                } catch (EOFException e) {
                    //encontro el final del archivo
                }
                objeto.close();
                entrada.close();
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    public void escribirArchivo(){
        FileOutputStream fw = null;
        ObjectOutputStream bw = null; 
        try {
            fw = new FileOutputStream(archivo);
            bw = new ObjectOutputStream(fw);
            for (Usuarios t : usua) {
                bw.writeObject(t);
            }
            bw.flush();
        } catch (Exception ex) {
        }finally {
            try {
                bw.close();
                fw.close();
            } catch (Exception ex) {
            }
        }
    }
    
}
