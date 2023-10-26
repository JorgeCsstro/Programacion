import java.util.Scanner;

public class Ejercicio4 {

	public static void main (String[] args) {

        int insectos = 6;
        int arácnidos = 8;
        int crustáceos = 10;

        Scanner sc = new Scanner(System.in);

        System.out.println("¿Cuantos insectos hay?");

            insectos = sc.nextInt();

            sc.nextLine();

        System.out.println("¿Cuantos arácnidos hay?");

            arácnidos = sc.nextInt();

            sc.nextLine();

        System.out.println("¿Cuantos crustáceos hay?");

            crustáceos = sc.nextInt();

            sc.nextLine();

        System.out.println("¿Cuantos segmentos tienen los ciempies?");

            int segmentosciempies;

            segmentosciempies = sc.nextInt();

            sc.nextLine();

        System.out.println("¿Cuantos ciempies hay?");

            int patasciempies = 2 * segmentosciempies;

            patasciempies = sc.nextInt();

            sc.nextLine();

        System.out.println("¿Cuantos segmentos tienen los milpies?");

            int segmentosmilpies;
            
            segmentosmilpies = sc.nextInt();

            sc.nextLine();

        System.out.println("¿Cuantos milpies hay?");

            int patasmilpies = 4 * segmentosmilpies;

            patasmilpies = sc.nextInt();

            sc.nextLine();

        System.out.println("*Voz de niño de 7 años* Profe, yo se la respuesta, entre todos los artrópodos hay: " + insectos + arácnidos + crustáceos + patasciempies + patasmilpies + " patitas");

	}
}