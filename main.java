//1. importaciones
import java.util.*;
import java.util.Scanner;

class Sintaxis{

    //Metodo main
    public static void main(String[] args) {

        /*Arriba 
        las
        chivas!! */

        //2. Cadenas
        /*System.out.println("hello, Cristian");
        String cadenas = "Cristian" + "Hurtado" + "Lucas";

        System.out.println(cadenas);
        System.out.println(cadenas.length());

        System.out.println(cadenas.substring(2,5));
        System.out.println(cadenas.substring(2));
        System.out.println(cadenas.substring(0,5));

        // 3. Variables
        int x = 5, x2;
        double y = 1.25;
        String z = "204", z1;

        x2 = Integer.parseInt(z);
        z1 = String.valueOf(y);
        //Conversion de int a double
        double asd = Double.valueOf(x); 

        //Conversion imolicita
        int num = 12;
        double numD = num;
        System.out.println("Conversion Implicita: "+x2);

        System.out.println(x2);
        System.out.println(z1);
        System.out.println(asd);

        //Creamos un objeto rdn de clase Random
        Random rdn = new Random();

        //Generamos numeros y los guardamos 
        int numAleatorio = rdn.nextInt(num);
        double numDouble = rdn.nextDouble();

        System.out.println("Aleatorio entero: "+ numAleatorio);
        System.out.println("Aleatorio double: "+ numDouble); 

        4. Solicitud de datos y lectura de los mismos

        Scanner NJR = new Scanner(System.in);
        System.out.print("Introduce cualquier dato: ");
        String dato = NJR.nextLine();

        System.out.print("Introduce un dato entero: ");
        int datoentero = NJR.nextInt();

        System.out.print("Introduce dato con decimales: ");
        Double datodecimal = NJR.nextDouble();

        System.out.println("Cualquier dato: "+ dato);
        System.out.println("Dato entero: "+ datoentero);
        System.out.println("Dato decimal: "+ datodecimal);*/

        //5. Boolean, operadores logicos y operdores de comparacion

        System.out.println(10 > 9);
        System.out.println(10 == 9);
        System.out.println(10 < 9);
        System.out.println(10 >= 9);
        System.out.println(10 <= 9);
        System.out.println(10 != 9);

        int x = 3;
        System.out.println(x< 5 && x>10);
        System.out.println(x< 5 || x>10);
        System.out.println(!(x< 5 && x>10));


    }
}
