package Practica_No_3;
import java.util.Scanner;

public class Frase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce una frase: ");
        String frase = sc.nextLine();

        String fraseI = new StringBuilder(frase).reverse().toString();

        System.out.println("La frase invertida es: " + fraseI);
    }
    
}
