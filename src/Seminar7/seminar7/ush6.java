/*6. Ndërtoni një metodë që numëron numrin e elementëve të ndryshëm në një tabelë me stringje pa
modifikuar arraylistën.*/
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class ush6 {

    public static int numroElementeNdryshe(ArrayList<String> lista) {
        HashSet<String> set = new HashSet<>(lista);
        return set.size();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> lista = new ArrayList<>();

        System.out.print("Sa stringje do te fusni? ");
        int n = sc.nextInt();
        sc.nextLine(); 

        for (int i = 0; i < n; i++) {
            System.out.print("Jep string-un " + (i + 1) + ": ");
            String s = sc.nextLine();
            lista.add(s);
        }

        int unik = numroElementeNdryshe(lista);

        System.out.println("Lista e dhene: " + lista);
        System.out.println("Numri i elementeve unik: " + unik);
    }
}