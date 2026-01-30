/*12. Një matrice NxN që mbushet me numra 1 , 2, 3 ...., n2 është një katror magjik nëse shuma e elementëve
në secilin rresht, në secilën kolonë dhe në dy diagonalet ka të njëjtën vlerë. Ndërtoni një program që lexon
16 vlera nga tastjera dhe teston nëse formohet katror magjik në një matricë 4x4. Ju duhet të kryeni testimet
e mëposhtme:
a. A ka dhënë përdoruesi numrat 1 ,2 , .....16?
b. Kur numrat vendosen në matricë, a është shuma e rreshtave, kolonave dhe diagonaleve e
barabartë?*/
package seminar6;
import java.util.HashSet;
import java.util.Scanner;

public class Ush12 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matrice = new int[4][4];
        HashSet<Integer> kontrolloNumrat = new HashSet<>();

        System.out.println("Jepni 16 numra nga 1 deri 16:");

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                int num;
                while (true) {
                    System.out.print("Numri [" + i + "][" + j + "]: ");
                    num = sc.nextInt();
                    if (num >= 1 && num <= 16 && !kontrolloNumrat.contains(num)) {
                        kontrolloNumrat.add(num);
                        break;
                    } else {
                        System.out.println("Numri duhet te jete unike dhe midis 1 dhe 16. Provoni perseri.");
                    }
                }
                matrice[i][j] = num;
            }
        }

        int shumaMagjike = 0;
        for (int j = 0; j < 4; j++) {
            shumaMagjike += matrice[0][j];
        }

        boolean eshteMagjik = true;

        for (int i = 1; i < 4; i++) {
            int shumaRreshti = 0;
            for (int j = 0; j < 4; j++) {
                shumaRreshti += matrice[i][j];
            }
            if (shumaRreshti != shumaMagjike) {
                eshteMagjik = false;
                break;
            }
        }

        if (eshteMagjik) {
            for (int j = 0; j < 4; j++) {
                int shumaKolone = 0;
                for (int i = 0; i < 4; i++) {
                    shumaKolone += matrice[i][j];
                }
                if (shumaKolone != shumaMagjike) {
                    eshteMagjik = false;
                    break;
                }
            }
        }

        if (eshteMagjik) {
            int shumaDiag1 = 0;
            int shumaDiag2 = 0;
            for (int i = 0; i < 4; i++) {
                shumaDiag1 += matrice[i][i];
                shumaDiag2 += matrice[i][3 - i];
            }
            if (shumaDiag1 != shumaMagjike || shumaDiag2 != shumaMagjike) {
                eshteMagjik = false;
            }
        }

        System.out.println("\nMatrica 4x4:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matrice[i][j] + "\t");
            }
            System.out.println();
        }

        if (eshteMagjik) {
            System.out.println("\nKjo matrice eshte katror magjik!");
            System.out.println("Shuma e magjike: " + shumaMagjike);
        } else {
            System.out.println("\nKjo matrice nuk eshte katror magjik.");
        }
    }
}
