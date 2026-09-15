package org.example;

public class Main {
    void main() {

        Metodos app = new Metodos();

        String DIRECTORIO = "/home/dam26/Documentos/AD/Ficheiros";

        //1
        //app.creaDirectorio(DIRECTORIO+"/arquivosdir");
        //System.out.println("E1: Directorio creado");

        //2
        app.creaFicheiro(DIRECTORIO+"/arquivosdir", "Productos1.txt");
        System.out.println("E2: Fichero creado");


    }

}




// Prueba 1: Comprobar si es directorio                             | eDirectorio()
// Prueba 2: Comprobar si es fichero                                | eFicheiro()
// Prueba 3: Crear directorio                                       | creaDirectorio()
// Prueba 4: Crear fichero                                          | creaFicheiro()
// Prueba 5: Comprobar permisos                                     | modoAcceso()
// Prueba 6: Comprobar Lonxitude                                    | calculaLonxitude()
// Prueba 7: Pasar a Lectura                                        | mLectura()
// Prueba 8: Pasar a Escritura                                      | mEscritura()
// Prueba 9: Borrar Ficheiro                                        | borraFicheiro()
// Prueba 10: Borrar Directorio                                     | borraDirectorio()
// Prueba 11: Mostrar contenido Directorio                          | mContido()
// Prueba 12: Muestra contenido de Direcotorios y Subdirectorios    | recur()




//import java.io.File;
//
//public class Main {
//    void main() {
//
//        Metodos app = new Metodos();
//
//        String DIRECTORIO = "/home/dam26/Documentos";
//        String FICHERO = "";
//
//        // Prueba 1: Comprobar si es directorio
//        String resultado1 = app.eDirectorio(DIRECTORIO);
//        System.out.println("E1: " + resultado1);
//
//        // Prueba 2: Comprobar si es fichero
//        String resultado2 = app.eFicheiro("/home/dam26/fichero.txt");
//        System.out.println("E2: " + resultado2);
//
//        // Prueba 3: Crear directorio
//        app.creaDirectorio(DIRECTORIO+"/nuevo");
//        System.out.println("E3: Directorio creado");
//
//        // Prueba 4: Crear fichero
//        app.creaFicheiro(DIRECTORIO+"/nuevo", "fichero.txt");
//        System.out.println("E4: Fichero creado");
//
//        // Prueba 5: Comprobar permisos
//        System.out.println("E5:");
//        app.modoAcceso(DIRECTORIO, "fichero.txt");
//
//        // Prueba 6: Comprobar Lonxitude
//        System.out.println("E6:");
//        app.calculaLonxitude(DIRECTORIO, "fichero.txt");
//
//        // Prueba 7: Pasar a Lectura
//        System.out.println("E7:");
//        app.mLectura(DIRECTORIO, "fichero.txt");
//
//        //Prueba 8: Pasar a Escritura
//        System.out.println("E8:");
//        app.mEscritura(DIRECTORIO, "fichero.txt");
//
//        //Prueba 9: Borrar Ficheiro
//        System.out.println("E9:");
//        app.borraFicheiro(DIRECTORIO, "fichero.txt");
//
//        //Prueba 10: Borrar Directorio
//        System.out.println("E10:");
//        app.borraDirectorio(DIRECTORIO);
//
//        //Prueba 11: Mostrar contenido Directorio
//        System.out.println("E11:");
//        app.mContido(DIRECTORIO);
//
//        //Prueba 12: Muestra contenido de Direcotorios y Subdirectorios
//        System.out.println("E12:");
//        app.recur(new File(DIRECTORIO));
//
//
//    }
//}
