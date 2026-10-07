/*4. Ndërtoni një metodë që modifikon një ArrayList me stringje, duke zhvendosur të gjitha stringjet që fillojnë
me shkronjë të madhe në fillim, pa ndryshuar renditjen e elementëve të tjerë.*/
import java.util.ArrayList;
import java.util.Scanner;

public class ush4 {

    public static void zhvendosMeShkronjeMadhe(ArrayList<String> lista) {
        ArrayList<String> teMedha = new ArrayList<>();
        ArrayList<String> teTjerat = new ArrayList<>();

        for (String s : lista) {
            if (!s.isEmpty() && Character.isUpperCase(s.charAt(0))) {
                teMedha.add(s);
            } else {
                teTjerat.add(s);
            }
        }
        lista.clear();
        lista.addAll(teMedha);
        lista.addAll(teTjerat);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> lista = new ArrayList<>();

        System.out.print("Sa stringje do te fusni? ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.print("Jep string-un " + (i + 1) + ": ");
            lista.add(sc.nextLine());
        }
        System.out.println("Para modifikimit: " + lista);
        zhvendosMeShkronjeMadhe(lista);
        System.out.println("Pas modifikimit:  " + lista);
    }
}
