import java.util.Scanner;

public class Ejercicio7 {

	public static void main (String[] args) {

        /*VARIABLES: */

        int elec;

        int pc = (int)(Math.random()*3+1);

        /*ATAJOS: */

        Scanner sc = new Scanner(System.in);

        /*CODIGO: */

		System.out.println("\nBIENVENIDO A PIEDRA / PAPEL / TIJERAS\n");

        System.out.println(" REGLAS:\n PIEDRA > TIJERA \n PAPEL > PIEDRA \n TIJERA > PAPEL\n");

        System.out.print(" Escribe tu opción: \n 1) PIEDRA \n 2) PAPEL \n 3) TIJERA \n\n ELIJE ->");

        elec = sc.nextInt();

        if (elec < 1 || elec > 3){

            System.out.println("Porfavor elije una opcion válida");

        }else{

            System.out.println(" El ordenador ha elegido la opción (" + pc + ")");

            if (elec == 1 && pc == 1){

                System.out.println("\n EMPATE\n");

            }else if (elec == 1 && pc == 2){

                System.out.println("\n HAS PERDIDO\n");

            }else if (elec == 1 && pc == 3){

                System.out.println("\n HAS GANADO\n");

            }else if (elec == 2 && pc == 1){

                System.out.println("\n HAS GANADO\n");

            }else if (elec == 2 && pc == 2){

                System.out.println("\n EMPATE\n");

            }else if (elec == 2 && pc == 3){

                System.out.println("\n HAS PERDIDO\n");

            }else if (elec == 3 && pc == 1){

                System.out.println("\n HAS PERDIDO\n");

            }else if (elec == 3 && pc == 2){

                System.out.println("\n HAS GANADO\n");

            }else if (elec == 3 && pc == 3){

                System.out.println("\n EMPATE\n");

            }
        }





	}
}