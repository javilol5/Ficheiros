package org.example;

public class Main {
    void main() {

        Metodos app = new Metodos();

        // Prueba 1: Comprobar si es directorio
        String resultado1 = app.eDirectorio("/home/dam26");
        System.out.println("E1: " + resultado1);

        // Prueba 2: Comprobar si es fichero
        String resultado2 = app.eFicheiro("/home/dam26/fichero.txt");
        System.out.println("E2: " + resultado2);

        // Prueba 3: Crear directorio
        app.creaDirectorio("/home/dam26/directorioNovo");
        System.out.println("E3: Directorio creado");

        // Prueba 4: Crear fichero
        app.creaFicheiro("/home/dam26/directorioNovo", "fichero.txt");
        System.out.println("E4: Fichero creado");

        // Prueba 5: Comprobar permisos
        System.out.println("E5:");
        app.modoAcceso("/home/dam26/directorioNovo", "fichero.txt");

        // Prueba 6: Comprobar Lonxitude
        System.out.println("E6:");
        app.calcularLonxitude("/home/dam26/directorioNovo", "fichero.txt");

        // Prueba 7: Pasar a Lectura
        System.out.println("E7:");
        app.facerLectura("/home/dam26/directorioNovo", "fichero.txt");

    }
}
