package Practica_No_4;
import java.util.*;
public class videojuegos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa tu edad: ");
        int edad = sc.nextInt();

        if (edad < 4) {
            System.out.print("No paga, entra gratis:)");
        } else if (edad<=18) {
            System.out.print("Usted tiene que pagar $110");
        } else {
            System.out.print("Usted paga $190");
        }
    }
    
}



