import java.util.Scanner;

public class EvenNr {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Marrim kufijtë a dhe b nga përdoruesi
        System.out.print("Jepni vleren e a: ");
        int a = input.nextInt();

        System.out.print("Jepni vleren e b: ");
        int b = input.nextInt();

        // Sigurohemi që a <= b
        if (a > b) {
            int temp = a;
            a = b;
            b = temp;
        }

        int sum = 0;

        // Llogarisim shumën e numrave çift
        for (int i = a; i <= b; i++) {
            if (i % 2 == 0) {  // Kontrollon nëse numri është çift
                sum += i;
            }
        }

        System.out.println("Shuma e numrave cift midis " + a + " dhe " + b + " ehte: " + sum);

        input.close();
    }
}
