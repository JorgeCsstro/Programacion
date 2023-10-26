public class Ejercicio2 {

	public static void main (String[] args) {

        float a = 8.0f;

        double b = 3;

        char c = '5';

        // a)

            int resintA = (int)(a - b + c);
            double resdoubleA = (a - b + c);

                System.out.println("System.println = "+(a - b + c)+ " resint = "+ resintA + " resdouble = "+resdoubleA);

        // b)

            int resintB = (int)(2 * b + 3 * (a - c));
            double resdoubleB = (2 * b + 3 * (a - c));

                System.out.println("System.println = "+(2 * b + 3 * (a - c))+ " resint = "+ resintB + " resdouble = "+resdoubleB);

        // c)

            int resintC = (int)(a / b);
            double resdoubleC = (a / b);

                System.out.println("System.println = "+(a / b)+ " resint = "+ resintC + " resdouble = "+resdoubleC);

        // d)

            int resintD = (int)(a % b);
            double resdoubleD = (a % b);

                System.out.println("System.println = "+(a % b)+ " resint = "+ resintD + " resdouble = "+resdoubleD);

        // e)

            int resintE = (int)(a / c - 2);
            double resdoubleE = (a / c - 2);

                System.out.println("System.println = "+(a / c - 2)+ " resint = "+ resintE + " resdouble = "+resdoubleE);

        // f)

            int resintF = (int)(a * b / c);
            double resdoubleF = (a * b / c);

                System.out.println("System.println = "+(a * b / c)+ " resint = "+ resintF + " resdouble = "+resdoubleF);

        // g)

            int resintG = (int)(a * (c % b));
            double resdoubleG = (a * (c % b));

                System.out.println("System.println = "+(a * (c % b))+ " resint = "+ resintG + " resdouble = "+resdoubleG);

        // h)

            int resintH = (int)((3 * a - 2 * b) % (2 * a - c));
            double resdoubleH = ((3 * a - 2 * b) % (2 * a - c));

                System.out.println("System.println = "+((3 * a - 2 * b) % (2 * a - c))+ " resint = "+ resintH + " resdouble = "+resdoubleH);

        // i)

            int resintI = (int)((a - 3 * b) % (c + 2 * a) / (a - c));
            double resdoubleI = ((a - 3 * b) % (c + 2 * a) / (a - c));

                System.out.println("System.println = "+((a - 3 * b) % (c + 2 * a) / (a - c))+ " resint = "+ resintI + " resdouble = "+resdoubleI);

        // j)

            int resintJ = (int)(a - b - c * 2);
            double resdoubleJ = (a - b - c * 2);

                System.out.println("System.println = "+(a - b - c * 2)+ " resint = "+ resintJ + " resdouble = "+resdoubleJ);


	}
}