import java.util.Scanner;

public class EjercicioE3 {

	public static void main (String[] args) {

        int hora;

        Scanner sc = new Scanner(System.in);

        System.out.println("Que hora es?");

        hora = sc.nextInt();

        sc.nextLine();

        if (hora >= 8 && hora < 12) {

            System.out.println("Buenos dias princesita");

        }else if (hora >= 12 && hora < 21){

            System.out.println("Benas tardes");

        }else if (hora >= 21 && hora < 24){

            System.out.println("Buenas noches");

        }else{

            System.out.println("Que coño haces despierto");

        }
    }
}