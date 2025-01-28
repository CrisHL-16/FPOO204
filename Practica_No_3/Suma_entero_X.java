package Practica_No_3;
import java.util.*;

public class Suma_entero_X {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese cualquier numero: ");
        int N = sc.nextInt();

        int suma = 0;
        System.out.println("Proceso de suma:");

        for (int i = 1; i <= N; i++) {
            System.out.println(suma + " + " + i + " = " + (suma + i));
            suma += i;
        }

        System.out.println("La suma desde el 1 hasta el " + N + " es: " + suma);

        sc.close();
    }
}
