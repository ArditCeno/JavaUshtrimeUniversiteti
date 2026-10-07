/*8. Ndërtoni një program i cili pasi lexon disa Stringje nga përdoruesi i rendit ato nga ana leksikore duke i
vendosur në vendin e duhur në një arraylist. Përdoruesi përcakton fundin e stringjeve nëpërmjet numrit -1.*/
import java.util.ArrayList;
import java.util.Scanner;

public class ush8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> lista = new ArrayList<>();

        System.out.println("Jep stringjet perfundon me -1 ");

        while (true) {
            String s = sc.nextLine();

            if (s.equals("-1")) {
                break;
            }

            int poz = 0;
            while (poz < lista.size() && lista.get(poz).compareTo(s) < 0) {
                poz++;
            }

            lista.add(poz, s); 

            System.out.println(lista.isEmpty() ? "[Empty]" : lista);
        }

        System.out.println("Lista perfundimtare: " + (lista.isEmpty() ? "[Empty]" : lista));
    }
}