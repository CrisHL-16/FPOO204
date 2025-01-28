package Practica_No_4;
import java.util.*;

public class cadena_contra {
    public static void main(String[] args) {
        String ContraC = "Arriba las Chivas ALV";
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduce la contraseña: ");
        String ContraU = sc.nextLine();

        if (ContraC.equalsIgnoreCase(ContraU)) {
            System.out.print("La contra es correcta:)");
        } else {
            System.out.print("La contra esta mal mijo:(");
        }
        sc.close();

    }
    
}
