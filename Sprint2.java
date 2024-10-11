/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sprint2;

/**
 *
 * @author sebas
 */
public class Sprint2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Declaración de variables constantes para Largo y Ancho de la piscina 1
        final int Largo_P1 = 300;   // Largo de la piscina 1 en metros
        final int Ancho_P1 = 150;   // Ancho de la piscina 1 en metros
        int Profundidad_P1 = 20;    // Profundidad de la piscina 1 en metros (variable)

        // Declaración de variables constantes para Largo y Ancho de la piscina 2
        final int Largo_P2 = 300;   // Largo de la piscina 2 en metros
        final int Ancho_P2 = 80;    // Ancho de la piscina 2 en metros
        int Profundidad_P2 = 35;    // Profundidad de la piscina 2 en metros (variable)

        // Cálculo del área de la piscina 1 y piscina 2 (Área = Largo * Ancho)
        double Area_P1 = Largo_P1 * Ancho_P1;   // Área de la piscina 1
        double Area_P2 = Largo_P2 * Ancho_P2;   // Área de la piscina 2

        // Impresión de los resultados del área de ambas piscinas
        System.out.println("1.");
        System.out.println("El área de la piscina 1 es de " + Area_P1 + " metros cuadrados.");
        System.out.println("El área de la piscina 2 es de " + Area_P2 + " metros cuadrados.");
        System.out.println("");

        // Cálculo del volumen de ambas piscinas (Volumen = Área * Profundidad)
        double Volumen_P1 = Area_P1 * Profundidad_P1;   // Volumen de la piscina 1
        double Volumen_P2 = Area_P2 * Profundidad_P2;   // Volumen de la piscina 2

        // Impresión de los resultados del volumen de ambas piscinas
        System.out.println("2.");
        System.out.println("El volumen de la piscina 1 es de " + Volumen_P1 + " metros cúbicos.");
        System.out.println("El volumen de la piscina 2 es de " + Volumen_P2 + " metros cúbicos.");
        System.out.println("");

        // Cálculo de las dimensiones cuando las dos piscinas están lado a lado (mismo largo)
        int Largo_P2P1 = Largo_P1;                      // El largo se mantiene igual
        int Ancho_P2P1 = Ancho_P1 + Ancho_P2;           // Los anchos se suman

        // Impresión del ancho y largo combinados de ambas piscinas lado a lado
        System.out.println("3.");
        System.out.println("El ancho de las dos piscinas una al lado de la otra es de " + Ancho_P2P1 + " metros.");
        System.out.println("El largo de las dos piscinas una al lado de la otra es de " + Largo_P2P1 + " metros.");
        System.out.println("");

        // Cálculo del área total de ambas piscinas juntas (Área total = Área P1 + Área P2)
        double AreaP1P2 = Area_P1 + Area_P2;

        // Impresión del área total combinada de las dos piscinas
        System.out.println("4.");
        System.out.println("El área que ocupan las dos piscinas una al lado de la otra es de " + AreaP1P2 + " metros cuadrados.");
        System.out.println("");

        // Cálculo del volumen total de las dos piscinas juntas (Volumen total = Volumen P1 + Volumen P2)
        double VolumenP1P2 = Volumen_P1 + Volumen_P2;

        // Impresión del volumen total que contienen ambas piscinas
        System.out.println("5.");
        System.out.println("El volumen que contienen entre las dos es de " + VolumenP1P2 + " metros cúbicos.");
        System.out.println("");

        // Intercambio de profundidades entre las dos piscinas
        int aux = Profundidad_P1;   // Variable auxiliar para guardar temporalmente la profundidad
        Profundidad_P1 = Profundidad_P2;   // Profundidad de P1 toma el valor de P2
        Profundidad_P2 = aux;              // Profundidad de P2 toma el valor guardado de P1

        // Recalculo de los volúmenes con las profundidades intercambiadas
        Volumen_P1 = Area_P1 * Profundidad_P1;   // Nuevo volumen para piscina 1
        Volumen_P2 = Area_P2 * Profundidad_P2;   // Nuevo volumen para piscina 2

        // Impresión de los nuevos volúmenes tras el intercambio de profundidades
        System.out.println("6.");
        System.out.println("El volumen que contiene la piscina 1 es de " + Volumen_P1 + " metros cúbicos.");
        System.out.println("");

        System.out.println("7.");
        System.out.println("El volumen que contiene la piscina 2 es de " + Volumen_P2 + " metros cúbicos.");
        System.out.println("");
    }
}

