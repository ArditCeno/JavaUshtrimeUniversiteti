/*5. Ndërtoni një program i cili mbush një ArrayList me vlera nga përdoruesi. Përdoruesi gjithashtu jep dy
indekse. Programi duhet të afishojë arraylistën duke hequr nga lista të gjithë elementët indeksi i të cilëve
është midis indeksit më të vogël të dhënë nga përdoruesi deri tek indeksi më të madh.*/
import java.util.ArrayList;
import java.util.Scanner;

public class ush5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> lista = new ArrayList<>();

        System.out.print("Sa elemente do te fusni? ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Jep elementin " + i + ": ");
            lista.add(sc.nextInt());
        }
        System.out.print("Jep indeksin e pare: ");
        int ind1 = sc.nextInt();
        System.out.print("Jep indeksin e dyte: ");
        int ind2 = sc.nextInt();

        int minInd = Math.min(ind1, ind2);
        int maxInd = Math.max(ind1, ind2);

        if (minInd < 0) minInd = 0;
        if (maxInd >= lista.size()) maxInd = lista.size() - 1;

        for (int i = maxInd; i >= minInd; i--) {
            lista.remove(i);
        }

        System.out.println("Lista pas heqjes: " + lista);
    }
}