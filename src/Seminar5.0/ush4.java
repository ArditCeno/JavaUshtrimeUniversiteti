/*4. Ndërtoni një metodë statike që merr si parametër një string str dhe një numër n dhe kthen
Stringun që përsëritet n herë.*/
import java.util.Scanner;
public class ush4 {

    public static String repeatString(String str, int n) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < n; i++) {
            result.append(str);
        }
        return result.toString();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Jepni nje string: ");
        String tekst = input.nextLine();

        System.out.print("Sa here e perserisni: ");
        int numri = input.nextInt();

        String iPerseritur = repeatString(tekst, numri);

        System.out.println("Rezultati: " + iPerseritur);

    }
}

