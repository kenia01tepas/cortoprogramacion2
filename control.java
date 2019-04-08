
//metodos buscar, eleminar, editar, agregar, ordenar
package corto;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class control extends estudiante{
    
    private final ArrayList<estudiante> mocos = new ArrayList<>();

public ArrayList<estudiante> Guardar(String nombre, String apellido,String grado) {

      
//        }
           estudiante es = new estudiante();
           mocos.add(new estudiante(nombre,apellido,grado,es.Carnet(nombre,apellido)));
     return mocos;
    }   

    ArrayList<estudiante> Buscar(String text, String text0, String text1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
//public class buscar1 {
//    public String Buscar (String carnet){
        
//    }
//       estudiante e = new estudiante();
//       mocos.add(new estudiante(nombre, apellido,grado,e.Carnet(nombre,apellido)));
//       return mocos;
//         for (int i=0;i<mocos.size();i++){
//             if (mocos.get(i).getName().equals(carnet)){
//               JOptionPane.showMessageDialog(null, (mocos.get(i).nombre)+(mocos.get(i).apellido)+(mocos.get(i).grado));
//             }else{
//                 JOptionPane.showMessageDialog(null,"El carnet que ingreso no existe");
//             }
//         }
//    return ""; 
//}
public estudiante buscar(String carnet) {
        for (estudiante c : mocos) {
            //revisar xq da error el getCarnet
            if (c.getCarnet().equals(carnet)) {
                return c;
            } else {
            }
        }
        return null;
    }

public ArrayList<estudiante> editar(estudiante c, String nombre, String apellido, String grado) {

        int indice = mocos.indexOf(c);
        c.setNombre(nombre);
        c.setApellido(apellido);
        c.setGrado(grado);

        mocos.set(indice, c);

        return mocos;
    }

    public ArrayList<estudiante> eliminar(estudiante e) {

        mocos.remove(mocos.indexOf(e));

        return mocos;
    }

    void Buscar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void editar(control editar) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void editar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    }
        
    
    
    

          
      

 

