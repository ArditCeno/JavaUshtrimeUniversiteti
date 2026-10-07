/*7. Ndërtoni një metodë rekursive statike reverse e cila merr si parametër një string dhe kthen
mbrapsht stringun. Për të kthyer mbrapsht një string duhet të fillohet në karakterin e dytë, dhe
më pas të shtosh të parin në fund. Për shembull për të kthyer mbrapsht fjalën flow, së pari
kthejmë mbrapsht low në wol dhe më pas shtojmë f në fund.*/
import java.util.Scanner;
public class ush7 {
    public static String reverse(String str) {
        if (str.length() <= 1) {
            return str;
        }

        String pjesaMbrapsht = reverse(str.substring(1));

        return pjesaMbrapsht + str.charAt(0);
    }

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Jepni nje string: ");
            String tekst = input.nextLine();
            
            String reversed = reverse(tekst);
            
            System.out.println("Stringu i kthyer mbrapsht: " + reversed);
        }
    }
}
