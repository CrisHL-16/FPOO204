package Practica_No_3;
import java.util.*;
public class Nombre_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa tu nombre: ");
        String numero = sc.nextLine();
        
        String numeroM = numero.toUpperCase();
        int NumeroL = numero.replace(" ", " ").length();

        System.out.println(numeroM + " tiene: " + NumeroL + " letras" );

    }
}
