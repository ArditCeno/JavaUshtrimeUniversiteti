import java.util.Scanner;

public class AnalizaStringut {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Lexojmë tekstin nga përdoruesi
        System.out.print("Shkruaj një tekst: ");
        String tekst = input.nextLine();

        // a) Vetëm shkronjat e mëdha
        System.out.print("a) Shkronjat e mëdha: ");
        for (int i = 0; i < tekst.length(); i++) {
            char c = tekst.charAt(i);
            if (Character.isUpperCase(c)) {
                System.out.print(c);
            }
        }
        System.out.println(); // për kalim rreshti

        // b) Zëvendëso zanoret me "_"
        String tekstPaZanore = tekst.replaceAll("[AEIOUaeiou]", "_");
        System.out.println("b) Teksti me zanoret e zëvendësuara: " + tekstPaZanore);

        // c) Numri i shifrave në string
        int numerShifrash = 0;
        for (int i = 0; i < tekst.length(); i++) {
            char c = tekst.charAt(i);
            if (Character.isDigit(c)) {
                numerShifrash++;
            }
        }
        System.out.println("c) Numri i shifrave: " + numerShifrash);
    }
}
