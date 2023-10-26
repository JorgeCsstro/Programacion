import java.util.Scanner;

public class Ejercicio2 {

	public static void main (String[] args) {


        double peso;
        double altura;


        Scanner sc = new Scanner(System.in);

        System.out.println("¿Cuanto pesas (kg)?");

            peso = sc.nextDouble();

            sc.nextLine();
            
        System.out.println("¿Cuanto mides (m)?");

            altura = sc.nextDouble();

        double imc = peso / (altura * altura);

            System.out.println("Tu masa corporal es: " + imc + " imc");

        

	}
}