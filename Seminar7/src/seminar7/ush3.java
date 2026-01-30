/*2. Ndërtoni një metodë që merr si parametra një ArrayList<String> dhe një String target, që kthen sa herë
përsëritet një element në ArrayList.*/
import java.util.ArrayList;
import java.util.Scanner;

public class ush3 {

    public static ArrayList<Integer> merge(ArrayList<Integer> a, ArrayList<Integer> b) {
        ArrayList<Integer> result = new ArrayList<>();
        int max = Math.max(a.size(), b.size());
        for (int i = 0; i < max; i++) {
            if (i < a.size()) {
                result.add(a.get(i));
            }
            if (i < b.size()) {
                result.add(b.get(i));
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> lista1 = new ArrayList<>();
        ArrayList<Integer> lista2 = new ArrayList<>();

        System.out.print("Sa elemente ka lista e pare? ");
        int n1 = sc.nextInt();

        for (int i = 0; i < n1; i++) {
            System.out.print("Jep elementin " + (i + 1) + " te listes 1: ");
            lista1.add(sc.nextInt());
        }

        System.out.print("Sa elemente ka lista e dyte? ");
        int n2 = sc.nextInt();

        for (int i = 0; i < n2; i++) {
            System.out.print("Jep elementin " + (i + 1) + " te listes 2: ");
            lista2.add(sc.nextInt());
        }

        ArrayList<Integer> rezultati = merge(lista1, lista2);

        System.out.println("Lista 1: " + lista1);
        System.out.println("Lista 2: " + lista2);
        System.out.println("Lista e bashkuar : " + rezultati);
    }
}