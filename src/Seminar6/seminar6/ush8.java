/*8. Ndërtoni një program që krijon një matricë 3x3, ku lexon numra nga përdoruesi dhe i vendos në tabelë, e
cila do kthejë shumën e çdo rreshti në matricë.*/
import java.util.Scanner;

public class ush8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matrica = new int[3][3];

        System.out.println("Jep vlerat per matricen 3x3:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Elementi ne pozicionin [" + i + "][" + j + "]: ");
                matrica[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < 3; i++) {
            int shumaRresht = 0;
            for (int j = 0; j < 3; j++) {
                shumaRresht += matrica[i][j];
            }
            System.out.println("Shuma e rreshtit " + i + " eshte: " + shumaRresht);
        }

        scanner.close();
    }
}
