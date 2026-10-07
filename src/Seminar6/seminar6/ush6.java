/*6. Ndërtoni një metodë statike që merr si parametër një tabelë dhe kthen mbrapsht sekuencën e
elementëve.*/
import java.util.Scanner;
import java.util.Arrays;

public class ush6 {

    public static int[] ktheMbrapsht(int[] tabela) {
        int n = tabela.length;
        int[] tabelaKthyer = new int[n];

        for (int i = 0; i < n; i++) {
            tabelaKthyer[i] = tabela[n - 1 - i];
        }

        return tabelaKthyer;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Jep madhesine e tabeles: ");
        int n = scanner.nextInt();

        int[] tabela = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Jep vleren ne indeksin " + i + ": ");
            tabela[i] = scanner.nextInt();
        }

        System.out.println("Tabela origjinale: " + Arrays.toString(tabela));

        int[] tabelaKthyer = ktheMbrapsht(tabela);

        System.out.println("Tabela e kthyer: " + Arrays.toString(tabelaKthyer));

        scanner.close();
    }
}