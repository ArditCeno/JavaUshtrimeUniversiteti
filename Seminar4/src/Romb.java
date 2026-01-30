
import java.util.Scanner;


public class Romb {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Jepni numrin e rreshtave (p.sh. 4): ");
        int n = input.nextInt();

        // Gjysma e parë e rombit
        for (int i = 1; i <= n; i++) {
            // Printo hapësirat
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }
            // Printo yjet
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Gjysma e dytë e rombit
        for (int i = n - 1; i >= 1; i--) {
            // Printo hapësirat
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }
            // Printo yjet
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        input.close();
    }
}
