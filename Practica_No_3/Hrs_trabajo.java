package Practica_No_3;
import java.util.*;

public class Hrs_trabajo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce tu numero de hrs trabajadas: ");
        double ht = sc.nextDouble();
        System.out.print("Ingresa el costo por hr: ");
        double CPH = sc.nextDouble();
        System.out.println("Su nomina es de: $" + ht * CPH);
    }
    
}
