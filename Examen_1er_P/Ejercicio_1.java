//Programa con fuinciones y un menu que nos permita convenrtir temperaturas a decision del usuario: centigrados (f-32)* 5/9 | fahrenheit (c* 9/5) +32 | kelvin (c + 273.15)
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
    

