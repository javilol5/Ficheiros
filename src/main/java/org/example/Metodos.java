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

    //6
    public static void calculaLonxitude(String dirName, String fileName) {
        File ficheiro = new File(dirName, fileName);

        if (ficheiro.exists() && ficheiro.isFile()) {
            long lonxitude = ficheiro.length();
            System.out.println("Lonxitude: " + lonxitude + " bytes");
        } else {
            System.out.println("O ficheiro non existe ou non é válido.");
        }
    }

    //7
    public static void mLectura(String dirName, String fileName) {
        File ficheiro = new File(dirName, fileName);

        if (ficheiro.exists()) {
            ficheiro.setWritable(false);
            System.out.println("O ficheiro e so de lectura");
        }
    }

    //8
    public static void mEscritura(String dirName, String fileName) {
        File ficheiro = new File(dirName, fileName);

        if (ficheiro.exists()) {
            ficheiro.setWritable(true);
            System.out.println("Podese escribir no ficheiro");
        }
    }

    //9
    public static void borraFicheiro(String dirName, String fileName) {
        File ficheiro = new File(dirName, fileName);

        if (ficheiro.exists()) {
            ficheiro.delete();
            System.out.println("Ficheiro eliminado");
        } else {
            System.out.println("Ficheiro non encontrado");
        }
    }

    //10
    public static void borraDirectorio(String dirName) {
        File directorio = new File(dirName);

        if (directorio.exists()) {
            directorio.delete();
            System.out.println("Directorio eliminado");
        } else {
            System.out.println("ruta inexistente ou con descencencia");
        }
    }

    //11
    public static void mContido(String dirName) {
        File directorio = new File(dirName);

        File[] contenido = directorio.listFiles();

        if (contenido != null) {
            for (File ficheiro : contenido) {
                System.out.println(ficheiro.getName());
            }
        }
    }

}

