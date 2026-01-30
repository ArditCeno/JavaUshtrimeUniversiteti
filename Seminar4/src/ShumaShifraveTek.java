import java.util.Scanner;

public class ShumaShifraveTek {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Marrim numrin nga përdoruesi
        System.out.print("Jep një numër: ");
        int numri = input.nextInt();
        
        int shuma = 0;
        
        // Përpunojmë çdo shifër të numrit
        while (numri > 0) {
            int shifer = numri % 10; // marrim shifrën e fundit
            if (shifer % 2 != 0) {   // nëse është tek
                shuma += shifer;
            }
            numri = numri / 10;      // heqim shifrën e fundit
        }
        
        // Afishojmë rezultatin
        System.out.println("Shuma e shifrave tek është: " + shuma);
    }
}
