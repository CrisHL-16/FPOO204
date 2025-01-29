package Practica_No_5;
import java.util.*;
public class Num_entero_impar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa un numero entero que sea positivo: ");
        int Num = sc.nextInt();
        sc.close();

        for (int i = 1; i <= Num; i += 2 ) {
            if (i > 1) {
                System.out.print(", ");
            }
            System.out.print(i);
        }
    }
}