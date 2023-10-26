import java.util.Scanner;

public class Ejercicio5 {

	public static void main (String[] args) {

       Scanner sc = new Scanner(System.in);

       System.out.println("¿Cuantos huevos caben en la cazuela?");

            double tcazuela;

            tcazuela = sc.nextInt();

            sc.nextLine();

       System.out.println("¿Cuantos huevos quieres cozer?");

            double huevos;

            huevos = sc.nextInt();

            sc.nextLine();

        double redondeo = Math.ceil(huevos / tcazuela);

        double tiempo = redondeo * 10;

        System.out.println("Tardarás "+ (int)tiempo + " minutos");
        

	}
}