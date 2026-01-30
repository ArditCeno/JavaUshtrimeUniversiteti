/*1. Krijoni një metodë që merr si parametër një ArrayList<Integer> që heq çdo numër negativ nga lista, dhe
kthen listën e re.*/
import java.util.ArrayList;
import java.util.Scanner;

public class ush1 {

    public static ArrayList<Integer> hiqNegativet(ArrayList<Integer> lista) {
        ArrayList<Integer> listaRe = new ArrayList<>();

        for (int num : lista) {
            if (num >= 0) {
                listaRe.add(num);
            }
        }
        return listaRe;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numra = new ArrayList<>();

        System.out.print("Sa numra do te fusni? ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Jep numrin " + (i + 1) + ": ");
            int x = sc.nextInt();
            numra.add(x);
        }

        ArrayList<Integer> rezultati = hiqNegativet(numra);

        System.out.println("Lista fillestare: " + numra);
        System.out.println("Lista pa numra negativ: " + rezultati);
    }
}
