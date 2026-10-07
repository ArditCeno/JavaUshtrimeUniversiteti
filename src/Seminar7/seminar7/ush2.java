/*2. Ndërtoni një metodë që merr si parametra një ArrayList<String> dhe një String target, që kthen sa herë
përsëritet një element në ArrayList.*/
package seminar7;

import java.util.ArrayList;
import java.util.Scanner;

public class ush2 {

    public static int numeroPerseritjet(ArrayList<String> lista, String target) {
        int count = 0;

        for (String s : lista) {
            if (s.equals(target)) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> lista = new ArrayList<>();

        System.out.print("Sa elemente do te fusni? ");
        int n = sc.nextInt();
        sc.nextLine(); 

        for (int i = 0; i < n; i++) {
            System.out.print("Jep elementin " + (i + 1) + ": ");
            String s = sc.nextLine();
            lista.add(s);
        }

        System.out.print("Jep elementin qe dore te kontrollosh: ");
        String target = sc.nextLine();

        int rezultati = numeroPerseritjet(lista, target);

        System.out.println("Lista: " + lista);
        System.out.println("Elementi \"" + target + "\" perseritet " + rezultati + " here.");
    }
}
