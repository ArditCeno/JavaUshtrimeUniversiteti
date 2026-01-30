/*7. Ndërtoni një metodë që kthen një ArrayList të re ku çdo element është ndryshuar në varësi të kushteve të
mëposhtme:
Nëse numri është çift → shumëzohet me 2
Nëse numri është tek → zëvendësohet me -1*/
import java.util.ArrayList;
import java.util.Scanner;

public class ush7 {

    public static ArrayList<Integer> transformoLista(ArrayList<Integer> lista) {
        ArrayList<Integer> listaRe = new ArrayList<>();

        for (int num : lista) {
            if (num % 2 == 0) {
                listaRe.add(num * 2);
            } else {
                listaRe.add(-1);
            }
        }
        return listaRe;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> lista = new ArrayList<>();

        System.out.print("Sa numra do te fusni? ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Jep numrin " + (i + 1) + ": ");
            lista.add(sc.nextInt());
        }

        ArrayList<Integer> rezultati = transformoLista(lista);

        System.out.println("Lista origjinale: " + lista);
        System.out.println("Lista e transformuar: " + rezultati);
    }
}