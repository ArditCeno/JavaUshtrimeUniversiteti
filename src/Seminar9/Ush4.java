/*4. Implementoni një klasë Rectangle. Një drejtkëndësh ka gjatësinë dhe gjerësinë. Ndërtoni
konstruktorin dhe metodat getArea(), getPerimeter() dhe isSquare() e cila kthen true nëse
drejtkëndëshi është katror. Ndërtoni një program testues që krijon disa objekte Rectangle dhe
afishon rezultatet.*/
import java.util.Scanner;

public class Ush4 {

    static class Rectangle {

        private double gjatesia;
        private double gjeresia;

        public Rectangle(double gja, double gjr) {
            gjatesia = gja;
            gjeresia = gjr;
        }

        public double getArea() {
            return gjatesia * gjeresia;
        }

        public double getPerimeter() {
            return 2 * (gjatesia + gjeresia);
        }

        public boolean isSquare() {
            return gjatesia == gjeresia;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Jep numrin e drejtkendesheve: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            System.out.println(" Drejtkendeshi " + i);

            System.out.print("Jep gjatesine: ");
            double gjatesia = sc.nextDouble();

            System.out.print("Jep gjeresine: ");
            double gjeresia = sc.nextDouble();

            Rectangle r = new Rectangle(gjatesia, gjeresia);

            System.out.println("Siperfaqja: " + r.getArea());
            System.out.println("Perimetri: " + r.getPerimeter());
            System.out.println("Eshte katror: " + r.isSquare());
        }

        sc.close();
    }
}
