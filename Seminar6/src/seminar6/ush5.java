/*5. Ndërtoni një program që llogarit shumën alternative të elementëve në tabelë.*/
import java.util.Scanner;

public class ush5{

    public static int llogaritShumenAlternative(int[] tabela) {
        int shuma = 0;
        for (int i = 0; i < tabela.length; i++) {
            if (i % 2 == 0) {
                shuma += tabela[i]; 
            } else {
                shuma -= tabela[i];
            }
        }
        return shuma;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Jep madhesine e tabeles: ");
        int n = scanner.nextInt();

        int[] tabela = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Jep elementin ne indeksin " + i + ": ");
            tabela[i] = scanner.nextInt();
        }

        int shumaAlternative = llogaritShumenAlternative(tabela);

        System.out.println("Shuma alternative e elementeve eshte: " + shumaAlternative);

        scanner.close();
    }
}