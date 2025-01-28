package Practica_No_4;
import java.util.*;
public class Par_impar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un numero de su agrado: ");
        int Num = sc.nextInt();

        if(Num % 2 == 0) {
            System.out.print("El " + Num + " es numero par");
        } else {
            System.out.print("El " + Num + " es numero impar");
        }
    }
    
}
