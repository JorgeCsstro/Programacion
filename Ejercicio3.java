import java.util.Scanner;

public class Ejercicio3 {

	public static void main (String[] args) {

        /*VARIABLES: */

        int num;

        int cifras = 0;

        /*ATAJOS: */

        Scanner sc = new Scanner(System.in);

        /*CODIGO: */

        System.out.print("Introduce un número: ");
        
            num = sc.nextInt();

        if (num >= 1000000 || num <= -1000000){

            System.out.println("No se puede un numero con mas de 6 dígitos/cifras");

        }else if (num == 0){

                num++;
        }else{

            while (num != 0){

                num = num/10;
                cifras++;

            }
            System.out.println("El número introducido tiene: " + cifras + " cifras");

        }

	}
}