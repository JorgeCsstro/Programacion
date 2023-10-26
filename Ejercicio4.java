import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {

        /*VARIABLES: */

        int num;

        boolean primo;

        int div;

        /*ATAJOS: */

        Scanner sc = new Scanner(System.in);

        /*CODIGO: */

        System.out.println("\n LOS NÚMEROS PRIMOS\n\n Este programa te dirá si el número introducido es primo o no (INTRODUCE NUMEROS ENTEROS)");

        System.out.print("Dime un número: ");

        num = sc.nextInt();

        primo = primo(num);

        if (num < 0){

            System.out.println("Porfavor dime un numero entero");

        }

        if (primo) {

            System.out.println(num + " es primo.");

        } else {

            System.out.println(num + " no es primo.");

        }
    }

    public static boolean primo(int num) {

        if (num <= 1) {

            return false;
        }
        
        if (num <= 3) {

            return true;

        }

        if (num % 2 == 0 || num % 3 == 0) {

            return false; 
        }

        
        int div = 5;

        while (div * div <= num) {

            if (num % div == 0 || num % (div + 2) == 0) {
                return false;
            }
            div += 6; 
        }

        return true;
    }
}