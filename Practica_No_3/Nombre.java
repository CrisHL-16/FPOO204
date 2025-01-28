package Practica_No_3;
import java.util.Scanner;

public class Nombre {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa tu(s) nombre(s): ");
        String nombre = sc.nextLine();
        System.out.print("Ingresa tu apellido paterno: ");
        String AP = sc.nextLine();
        System.out.print("Ingresa tu apellido paterno: ");
        String AM = sc.nextLine();
        String NC = nombre  + " "+ AP + " " + AM;

        String minusculas = NC.toLowerCase();
        String mayusculas = NC.toUpperCase();

        System.out.println("Su nombre en minusculas: " + minusculas);
        System.out.println("Su nombre en mayusculas: " + mayusculas);

        String[] palabras = NC.split(" ");
        String capitalizado = " ";

        for (String palabra : palabras) {
            if (palabra.length() > 0) {
                capitalizado += Character.toUpperCase(palabra.charAt(0))
                                + palabra.substring(1).toLowerCase()
                                + " ";
            }
        }
        System.out.println("Su nombre bien escrito: " + capitalizado.trim());
    }
}
