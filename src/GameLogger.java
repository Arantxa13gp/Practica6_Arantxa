import Personajes.Personaje;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class GameLogger {
    public static void ficha(Personaje p) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter("./Ficheros/" + p.getNombre() + ".txt"));
        bw.write("Nombre:" + p.getNombre());
        bw.write("Clase:" + p.getClase());
        bw.write("Raza:" + p.getRaza());
        bw.write("Nivel:" + p.getNivel());
        bw.close();
    }

        public static void fichasGrupo(Personaje [] grupo, String nombreFichero) throws IOException{
            BufferedWriter bw = new BufferedWriter(new FileWriter("./Ficheros/" + nombreFichero + ".txt"));

            for(int i = 0; i <= grupo.length; i++){
                bw.write("Nombre:" + grupo[i].getNombre());
                bw.write("Clase:" + grupo[i].getClase());
                bw.write("Raza:" + grupo[i].getRaza());
                bw.write("Nivel:" + grupo[i].getNivel());
            }
            bw.close();
    }



}
