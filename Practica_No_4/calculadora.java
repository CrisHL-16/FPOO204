package Practica_No_4;
import java.util.*;
public class calculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el primer número: ");
        double n1 = sc.nextDouble();

        System.out.print("Introduce el segundo número: ");
        double n2 = sc.nextDouble();

        System.out.print("Introduce un operador (+, -, *, /): ");
        char operador = sc.next().charAt(0);

        switch (operador) {
            case '+':
                System.out.println("Resultado: " + (n1 + n2));
                break;
            case '-':
                System.out.println("Resultado: " + (n1 - n2));
                break;
            case '*':
                System.out.println("Resultado: " + (n1 * n2));
                break;
            case '/':
                if (n2 != 0) {
                    System.out.println("Resultado es: " + (n1 / n2));
                } else {
                    System.out.println("Error: División por cero.");
                }
                break;
            default:
                System.out.println("Error: Operador no válido.");
        }
    }
    
}
