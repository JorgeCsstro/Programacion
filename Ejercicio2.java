import java.util.Scanner;

public class Ejercicio2 {

	public static void main (String[] args) {

        /*VARIABLES: 
         * Al principio había puesto "int" en result pero me ha dado error POR EL MATH.POW (linea 41) y lo he cambiado a "double"
        */

        int base;

        int exponente;

        double result;

        /*ATAJOS: */

        Scanner sc = new Scanner(System.in);

        /*CODIGO: */

        System.out.print("Introduce la BASE: ");

            base = sc.nextInt();

        System.out.print("Introduce el EXPONENTE: ");

            exponente = sc.nextInt();

        if (base < 0){

            System.out.println("Introduce tu BASE con un numero entero positivo");

        }else if (exponente < 0) {

            System.out.println("Introduce tu EXPONENTE con un numero entero positivo");

        }else {

            result = Math.pow((double)base, (double)exponente);

            System.out.println(base + " elevado a " + exponente + " es igual a " + (int)result);

        }



	}
}