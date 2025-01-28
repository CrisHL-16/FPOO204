package Practica_No_4;
import java.util.*;
public class palindromo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese una cadena: ");
        String cadena = sc.nextLine();

        String reverso = new StringBuilder(cadena).reverse().toString();

        if (cadena.equals(reverso)) {
            System.out.println("La cadena es un palíndromo.");
        } else {
            System.out.println("La cadena no es un palíndromo.");
}

}

}
