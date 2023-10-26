public class Ejercicio6 {

	public static void main (String[] args) {

        String nombre = "Jorge Castro Tramoyeres";

            int index1 = nombre.indexOf(" ");// coje el index del espacio
            int index2 = nombre.indexOf(" ", index1 +1);// coje el index del 2o espacio


            String nomb = nombre.substring(0, index1);// coje a partir del index 0 (el inicio de la frase) hasta el 1er index, es decir, el primer espacio         
            String ape1 = nombre.substring(index1+1, index2);// coje lo que esta entre el 1er espacio y el 2o espacio / se pone +1 para que NO COJA EL ESPACIO
            String ape2 = nombre.substring(index2+1);// coje lo que esta a partir del 2o espacio

            System.out.println("El nombre tiene "+nomb.length()+" caracteres");
            System.out.println("El 1er apellido tiene "+ape1.length()+" caracteres");            
            System.out.println("El 2o apellido tiene "+ape2.length()+" caracteres");

        

	}
}