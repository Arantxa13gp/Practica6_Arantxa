import Personajes.Personaje;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class GameLogger {
    public static void ficha(Personaje p) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter("./Ficheros/" + p.getNombre() + ".txt"));
        bw.write("nombre:" + p.getNombre());
        bw.write("Clase:" + p.getClase());
        bw.write("Raza:" + p.getRaza());
        bw.write("Nivel:" + p.getNivel());
        bw.write("PV:" + p.getPv());
        bw.write("ATQ:" + p.getAtq());
        bw.write("ARM:" + p.getArm());
        bw.write("VEL:" + p.getVel());
        bw.write("RES:" + p.getRes());
        bw.close();
    }


}
