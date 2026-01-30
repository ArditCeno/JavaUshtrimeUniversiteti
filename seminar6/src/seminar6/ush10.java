/*10. Shkruani një metodë që merr një array me numra int dhe kthen numrin e elementëve çift që ndodhen në
array.*/
package seminar6;

import java.util.Scanner;

public class ush10 {

    public static int numroElementetCift(int[] tabela) {
        int count = 0;
        for (int num : tabela) {
            if (num % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Sa elemente do te kete tabela? ");
        int n = scanner.nextInt();

        int[] tabela = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Jep elementin ne indeksin " + i + ": ");
            tabela[i] = scanner.nextInt();
        }

        int numriCift = numroElementetCift(tabela);
        System.out.println("Numri i elementeve cift ne tabela eshte: " + numriCift);

        scanner.close();
    }
}
