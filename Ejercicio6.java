import java.util.Scanner;

public class Ejercicio6 {

	public static void main (String[] args) {

        /*VARIABLES: */

        int dia1;

        int dia2;
        
        int h1;

        int h2;

        /*ATAJOS: */

        Scanner sc = new Scanner(System.in);

        /*CODIGO: */

        System.out.printf(" Los dias de la semana van de 1 a 7 succesivamente (Ej: Martes = 2).\n Y las horas van de 0 a 23 sin minutos o segundos.\n");

        System.out.print(" Cual es el día de inicio: ");

            dia1 = sc.nextInt();

        System.out.print(" Cual es su hora: ");

            h1 = sc.nextInt();

        System.out.print(" Cual es el siguiente dia: ");

            dia2 = sc.nextInt();

        System.out.print(" Cual es su hora: ");

            h2 = sc.nextInt();

        if (dia1 < 1 || dia1 > 7 || dia2 < 1 || dia2 > 7){

            System.out.println("Pon un dia valido que este entre el 1 y el 7");

        }else if (dia1 > dia2){

            System.out.println("El primer dia tiene que ser menor que el segundo");

        }else if (h1 < 0 || h1 > 23 || h2 < 0 || h2 > 23){

            System.out.println("Pon una hora válida que esté entre el 0 y el 23");

        }else {

            System.out.println("Entre las horas del primer dia ("+ h1 +":00) y el segundo dia ("+ h2 +":00) hay: " + ((dia2 - dia1)*24+(h2-h1))+" horas");

        }

            
        






	}
}