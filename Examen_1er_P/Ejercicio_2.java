//Escriba un porgrama que pida al usuario dos palabaras, y que indique cual de ellas es la mas larga y por cuantas letras lo es.
package Examen_1er_P;
import java.util.*;

public class Ejercicio_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese la primera palabra: ");
        String P1 = sc.nextLine();
        System.out.print("Ingrese la segunda palabra: ");
        String P2 = sc.nextLine();

        int longitud1 = P1.length();
        int longitud2 = P2.length();

        if (longitud1 > longitud2) {
            System.out.println("La palabra mas larga es: " + P1);
            System.out.println("Es más larga por " + (longitud1 - longitud2) + " letras.");
        } else if (longitud2 > longitud1) {
            System.out.println("La palabra más larga es: " + P2);
            System.out.println("Es más larga por " + (longitud2 - longitud1) + " letra(s).");
        } else {
            System.out.println("Ambas palabras tienen la misma longitud.");
        }

        sc.close();
    }
}
