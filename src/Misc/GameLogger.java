package Misc;

import Personajes.Personaje;

import java.io.*;

public class GameLogger {
    public static void ficha(Personaje p) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter("./Ficheros/" + p.getNombre() + ".txt"));
        bw.write("Nombre:" + p.getNombre());
        bw.write("Clase:" + p.getClase());
        bw.write("Raza:" + p.getRaza());
        bw.write("Nivel:" + p.getNivel());
        bw.write("Vida:" + p.getPv());
        bw.write("Ataque:" + p.getAtq());
        bw.write("Armadura:" + p.getArm());
        bw.write("Velocidad:" + p.getVel());
        bw.write("Resistencia:" + p.getRes());
        bw.close();
    }

    public static void fichasGrupo(Personaje[] grupo, String nombreFichero) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter("./Ficheros/" + nombreFichero + ".txt"));

        for (int i = 0; i <= grupo.length; i++) {
            bw.write("Nombre:" + grupo[i].getNombre());
            bw.write("Clase:" + grupo[i].getClase());
            bw.write("Raza:" + grupo[i].getRaza());
            bw.write("Nivel:" + grupo[i].getNivel());
            bw.write("Vida:" + grupo[i].getPv());
            bw.write("Ataque:" + grupo[i].getAtq());
            bw.write("Armadura:" + grupo[i].getArm());
            bw.write("Velocidad:" + grupo[i].getVel());
            bw.write("Resistencia:" + grupo[i].getRes());
        }
        //Falta ordenarlos por la velocidad
        bw.close();
    }

    public static boolean existePersonaje(File[] paths, String nombre) throws IOException {
        boolean ver = true;

        for (int i = 0; i < paths.length; i++) {
            FileReader fr = new FileReader(paths[i]);
            BufferedReader br = new BufferedReader(fr);

            String linea = "";
            String[] campos = new String[2];

            campos = linea.split(":");
            if (campos[0].equals("Nombre") && nombre.equals(campos[1])) {
                ver = false;
            }
        }
        return ver;
    }

    public static boolean ExisteClase(File[] paths, String nombre, String clase) throws IOException {
        boolean ver = true;

        for (int i = 0; i < paths.length; i++) {
            FileReader fr = new FileReader(paths[i]);
            BufferedReader br = new BufferedReader(fr);

            String linea = "";
            String[] campos = new String[2];

            campos = linea.split(":");
            if (campos[0].equals("Nombre") && nombre.equals(campos[1])) {
                ver = false;
            }
            if (campos[0].equals("Raza") && clase.equals(campos[1])) {
                ver = false;
            }
        }
        return ver;
    }

}
