/*3. Ndërtoni metodat e mëposhtme të cilat marrin si paramentër një tabelë dhe:
a. Zëvendëson elementin e parë me të fundit
b. Heq elementin në një pozicion të caktuar nga përdoruesi në një tabelë pa renditje
c. Kthen numrin më të madh në tabelë
d. Kthen true nëse tabela është e renditur në rendin rritës
e. Kthen true nëse tabela përban dy elementë fqinjë të dublikuar*/
import java.util.Scanner;
import java.util.Arrays;

public class ush3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Jep madhesine e tabeles: ");
        int madhesia = sc.nextInt();
        int[] tabela = new int[madhesia];

        for (int i = 0; i < madhesia; i++) {
            System.out.print("Jep vleren e elementit " + i + ": ");
            tabela[i] = sc.nextInt();
        }

        sc.nextLine(); 

        String input = "";
        while (true) {
            System.out.println("\nTabela aktuale: " + Arrays.toString(tabela));
            System.out.println("Zgjidh nje veprim:");
            System.out.println("1 - Nderrim i elementit te pare me te fundit");
            System.out.println("2 - Heq element ne nje pozicion te caktuar");
            System.out.println("3 - Numri me i madh ne tabele");
            System.out.println("4 - Kontrollo nese tabela eshte e renditur ne menyre rritese");
            System.out.println("5 - Kontrollo nese ka dy elemente fqinj te njejte");
            System.out.println("x - Dil nga programi");

            System.out.print("Zgjedh veprimin: ");
            input = sc.nextLine();

            if (input.equalsIgnoreCase("x")) {
                System.out.println("Programi u ndal.");
                break;
            }

            switch (input) {
                case "1":
                    nderrimiTeParinMeTeFundin(tabela);
                    System.out.println("Pas nderrimit: " + Arrays.toString(tabela));
                    break;

                case "2":
                    System.out.print("Jep pozicionin per te hequr: ");
                    int poz = sc.nextInt();
                    sc.nextLine(); 
                    tabela = hiqNePozicion(tabela, poz);
                    System.out.println("Pas heqjes: " + Arrays.toString(tabela));
                    break;

                case "3":
                    int max = numriMeIMadh(tabela);
                    System.out.println("Numri me i madh ne tabele eshte: " + max);
                    break;

                case "4":
                    boolean rend = eshteRendRrites(tabela);
                    System.out.println("A eshte tabela ne rend rritese? " + rend);
                    break;

                case "5":
                    boolean dublike = kaDyFqinjeTeNjejte(tabela);
                    System.out.println("A ka tabela dy elemente fqinj te njejte? " + dublike);
                    break;

                default:
                    System.out.println("Zgjedhje e pavlefshme!");
            }
        }

        sc.close();
    }

    // a. 
    public static void nderrimiTeParinMeTeFundin(int[] tabela) {
        if (tabela.length < 2) return;

        int temp = tabela[0];
        tabela[0] = tabela[tabela.length - 1];
        tabela[tabela.length - 1] = temp;
    }

    // b.
    public static int[] hiqNePozicion(int[] tabela, int pozicioni) {

        if (pozicioni < 0 || pozicioni >= tabela.length) {
            System.out.println("Pozicion i pavlefsshem!");
            return tabela;
        }

        int[] tabelaRe = new int[tabela.length - 1];
        for (int i = 0, j = 0; i < tabela.length; i++) {
            if (i != pozicioni) tabelaRe[j++] = tabela[i];
        }
        return tabelaRe;
    }

    // c.
    public static int numriMeIMadh(int[] tabela) {
        int max = tabela[0];
        for (int num : tabela) if (num > max) max = num;
        return max;
    }

    // d.
    public static boolean eshteRendRrites(int[] tabela) {
        for (int i = 0; i < tabela.length - 1; i++)
            if (tabela[i] > tabela[i + 1]) return false;
        return true;
    }

    // e.
    public static boolean kaDyFqinjeTeNjejte(int[] tabela) {
        for (int i = 0; i < tabela.length - 1; i++)
            if (tabela[i] == tabela[i + 1]) return true;
        return false;
    }

}