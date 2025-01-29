package Practica_No_5;
import java.util.*;
public class Tablas_1_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num;
        System.out.print("ingrese el numero de la tabla a imprimir: ");
        num= sc.nextInt();
        System.out.println("tabla de multiplicar del numero "+num);
        for (int i = 1; i <= 10; i++) {
            int t= num*i;
            System.out.println(num+" x "+i+" = "+t);
}

    }
}