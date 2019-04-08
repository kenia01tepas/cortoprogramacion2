//contiene nombre, apellido, grado, carnet
//declarar lista estudiantes
package corto;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.util.Collections;

public class estudiante extends registro {

    private final ArrayList<estudiante> mocos = new ArrayList<>();

    String nombre;
    String apellido;
    String grado;
    String carnet;
    
    public estudiante(){
        
    }
    
    public estudiante(String nombre, String apellido, String grado, String carnet) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.grado = grado;
        this.carnet=carnet;

    }

    public String nombre() {
        return nombre;
    }

    public void arreglarnombre(String nombre) {
        this.nombre = nombre;
    }

    public String apellido() {
        return apellido;
    }

    public void arreglarapellido(String apellido) {
        this.apellido = apellido;
    }

    public String grado() {
        return grado;
    }

    public void arreglarGrado(String grado) {
        this.grado = grado;
    }
    public String Carnet(){
        return carnet;
    }
    public void arreglarCarnet(String carnet){
        this.carnet=carnet;
    }

    public String Carnet(String nombre, String apellido) {
        char L1 = nombre.charAt(0);
        char L2 = apellido.charAt(0);
        int numero = 0;
        carnet = L1 + L2 + "00" + (numero++);
        return carnet;
    }

    Object getCarnet() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void setNombre(String nombre) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void setApellido(String apellido) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void setGrado(String grado) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}  
