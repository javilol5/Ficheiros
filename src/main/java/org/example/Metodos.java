package org.example;
import java.io.File;
import java.io.IOException;

public class Metodos {

    // 1
    public static String eDirectorio(String cadea) {
        File ficheiro = new File(cadea);

        if (ficheiro.isDirectory()) {
            return "é directorio";
        } else {
            return "non é directorio";
        }
    }

    // 2
    public static String eFicheiro(String cadea) {
        File ficheiro = new File(cadea);

        if (ficheiro.isFile()) {
            return "é ficheiro";
        } else {
            return "non é ficheiro";
        }
    }

    // 3
    public static void creaDirectorio(String cadea) {
        File directorio = new File(cadea);

        if (!directorio.exists()) {
            directorio.mkdir();
        }
    }

    // 4
    public static void creaFicheiro(String dirName, String fileName) {
        File directorio = new File(dirName);

        if (directorio.isDirectory()) {

            File ficheiro = new File(dirName, fileName);

            if (!ficheiro.exists()) {
                try {
                    ficheiro.createNewFile();
                } catch (IOException e) {
                    System.out.println("Erro ao crear o ficheiro");
                }
            }
        }
    }

    // 5
    public static void modoAcceso(String dirName, String fileName) {
        File ficheiro = new File(dirName, fileName);

        if (ficheiro.canWrite()) {
            System.out.println("escritura si");
        } else {
            System.out.println("escritura non");
        }

        if (ficheiro.canRead()) {
            System.out.println("lectura si");
        } else {
            System.out.println("lectura non");
        }
    }
}