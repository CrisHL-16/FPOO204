//
package Examen_1er_P;
import java.util.Scanner;

public class Ejercicio_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese los grados que quiera conventir: ");
        double G = sc.nextDouble();

        System.out.println("Seleccione a que los quiere convertir: Centigrados:C, Fahrenheit:F, Kelvin:K");
        int N = sc.nextInt();

        switch (N) {
            case 'C':
                System.out.println("En grados centigrados: " + (G-32 *5/9));
                break;
            case 'F':
                System.out.println("En grados Fahrenheit: ");
        }

        }
        
    }
    

