/*7. Ndërtoni një metodë statike që krijon një array me 10 numra dhe kthen sa herë shfaqet një numër X në
array.*/
import java.util.Scanner;
import java.util.Arrays;

public class ush7 {

    public static int saHereShfaqet(int[] tabela, int x) {
        int count = 0;
        for (int num : tabela) {
            if (num == x){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] tabela = new int[10];

        System.out.println("Jep 10 numra per array-n:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Numri ne indeksin " + i + ": ");
            tabela[i] = scanner.nextInt();
        }

        System.out.println("Array i krijuar: " + Arrays.toString(tabela));

        System.out.print("Jep numrin X per te gjetur sa here shfaqet: ");
        int x = scanner.nextInt();

        int shfaqjet = saHereShfaqet(tabela, x);
        System.out.println("Numri " + x + " shfaqet " + shfaqjet + " here ne array.");

        scanner.close();
    }
}
