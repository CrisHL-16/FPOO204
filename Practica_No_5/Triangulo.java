package Practica_No_5;
import java.util.Scanner;

public class Triangulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
        System.out.print("Ingresa la altura del triangulo (entero y positivo): ");
        int altura = sc.nextInt();

        for (int i = 1; i <= altura; i += 2) { 
            for (int j = i; j > 0; j -= 2) {  
                System.out.print(j + " ");
            }
            System.out.println(); 
        }
        
        sc.close();
}
}
