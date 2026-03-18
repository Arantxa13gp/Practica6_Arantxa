import Combate.Combate;
import Personajes.Personaje;

import javax.management.modelmbean.InvalidTargetObjectTypeException;
import java.io.*;

public class GameLogger {
    public static void ficha(Personaje p) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter("./Ficheros/" + p.getNombre() + ".txt"));
        bw.write("Nombre:" + p.getNombre());
        bw.write("Clase:" + p.getClase());
        bw.write("Raza:" + p.getRaza());
        bw.write("Nivel:" + p.getNivel());
        bw.write("Vida:" +  p.getPv());
        bw.write("Ataque:" +  p.getAtq());
        bw.write("Armadura:" +  p.getArm());
        bw.write("Velocidad:" +  p.getVel());
        bw.write("Resistencia:" +  p.getRes());
        bw.close();
    }

        public static void fichasGrupo(Personaje [] grupo, String nombreFichero) throws IOException{
            BufferedWriter bw = new BufferedWriter(new FileWriter("./Ficheros/" + nombreFichero + ".txt"));

            for(int i = 0; i <= grupo.length; i++){
                bw.write("Nombre:" + grupo[i].getNombre());
                bw.write("Clase:" + grupo[i].getClase());
                bw.write("Raza:" + grupo[i].getRaza());
                bw.write("Nivel:" + grupo[i].getNivel());
                bw.write("Vida:" +  grupo[i].getPv());
                bw.write("Ataque:" +  grupo[i].getAtq());
                bw.write("Armadura:" +  grupo[i].getArm());
                bw.write("Velocidad:" +  grupo[i].getVel());
                bw.write("Resistencia:" +  grupo[i].getRes());
            }
            //Falta ordenarlos por la velocidad
            bw.close();
    }

    public static void verificarFicha() throws IOException{

    }

    public static void existePersonaje(File [] path, String nombre) throws IOException{
       for (int i= 0; i < path.length; i++ ) {
           BufferedReader br = new BufferedReader(new FileReader(path[i]));
           
           br.close();
       }
    }

    //Ejercicio 6
}
