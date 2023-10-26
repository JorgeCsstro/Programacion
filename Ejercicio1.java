import java.util.Scanner;

public class Ejercicio1 {

	public static void main (String[] args) {

        /*VARIABLES: */

        int[] ar = new int[15];

        int i;

        /*ATAJOS: */

        Scanner sc = new Scanner(System.in);

        /*CODIGO: */

        System.out.println("Introduce 15 números: ");

        for (i = 0; i < ar.length-1; i++) {

            System.out.print("Número " + (i+1) + ": ");
            ar[i] = ar[i+1];
            ar[i] = sc.nextInt();

        }

        for (i = 0; i < ar.length; i++){

            System.out.println(ar[i]);

        }

 


        

	}
}