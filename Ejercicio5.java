import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        
        /*VARIABLES: */

        int num;

        int i = 1;

        int j = i;

        /*ATAJOS: */

        Scanner sc = new Scanner(System.in);

        /*CODIGO: */

        System.out.println("\n LOS PARES ENTEROS\n");
        
        System.out.print("Dime un número entero: ");

        num = sc.nextInt();

        
        if (num <= 0) {

            System.out.println("DIME UN NÚMERO ENTERO");

        } else {
            
            System.out.println("\n Los numeros pares del entro son: ");

            for (i = 1; i <= num; i++) {

                for (j = i; j <= num; j++) {

                    int resu = i + j + i * j;

                    System.out.println("(" + i + ", " + j + ") = " + resu);

                }
            }
        }
    }
}