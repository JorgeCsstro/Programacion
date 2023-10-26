import java.util.Scanner;

public class Ejercicio1 {

	public static void main (String[] args) {

        int num;

        System.out.println("¿Que número quieres multiplicar?");

        Scanner introducido = new Scanner(System.in);

        num = introducido.nextInt();

            System.out.println(num + " X 0 = " + num * 0);

            System.out.println(num + " X 1 = " + num * 1);

            System.out.println(num + " X 2 = " + num * 2);

            System.out.println(num + " X 3 = " + num * 3);

            System.out.println(num + " X 4 = " + num * 4);

            System.out.println(num + " X 5 = " + num * 5);

            System.out.println(num + " X 6 = " + num * 6);

            System.out.println(num + " X 7 = " + num * 7);

            System.out.println(num + " X 8 = " + num * 8);

            System.out.println(num + " X 9 = " + num * 9);

            System.out.println(num + " X 10 = " + num * 10);
	}
}