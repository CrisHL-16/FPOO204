package Practica_No_5;
import java.util.*;
public class Num_entero_atras {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un numero entero positivo: ");
        int Num = sc.nextInt();
        sc.close();

        for (int i = Num; i >= 0; i--) {
            if (i < Num) {
                System.out.print(", ");
            }
            System.out.print(i);
        }
    }
}