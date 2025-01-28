package Practica_No_3;
import java.util.Scanner;

public class Jugueteria {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int pesoP = 112;
        int pesoM = 75;

        System.out.print("Ingresa la cantidad de payasos: ");
        int cantidadP = sc.nextInt();

        System.out.print("Ingresa la cantidad de muñecas: ");
        int cantidadM = sc.nextInt();

        int pesoTotal = (cantidadP * pesoP) + (cantidadM * pesoM);

        System.out.println("El peso total del paquete es: " + pesoTotal + " gramos.");
    }
    
}
