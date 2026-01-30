/*4. Ndërtoni një metodë që merr si parametër një tabelë dhe heq vlerën më të vogël nga një tabelë e
mbushur pjesërisht. Testoni metodën.*/
import java.util.Scanner;
import java.util.Arrays;

public class ush4 {

    public static int[] heqVlerenMeTeVogel(int[] tabela) {
        if (tabela == null || tabela.length == 0) {
            return tabela; 
        }

        int minIndex = 0;
        int minValue = tabela[0];
        for (int i = 1; i < tabela.length; i++) {
            if (tabela[i] < minValue) {
                minValue = tabela[i];
                minIndex = i;
            }
        }

        int[] tabelaRe = new int[tabela.length - 1];
        int k = 0;
        for (int i = 0; i < tabela.length; i++) {
            if (i != minIndex) {
                tabelaRe[k++] = tabela[i];
            }
        }

        return tabelaRe;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Jep madhesine e tabeles: ");
        int n = scanner.nextInt();

        int[] tabela = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Jep vleren e tabeles ne indeksin " + i + ": ");
            tabela[i] = scanner.nextInt();
        }

        System.out.println("Tabela origjinale: " + Arrays.toString(tabela));

        tabela = heqVlerenMeTeVogel(tabela);

        System.out.println("Pas heqjes se vleres me te vogel: " + Arrays.toString(tabela));

        scanner.close();
    }
}