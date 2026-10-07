/*9. Ndërtoni një metodë rekursive statike ështëPalindromë e cila merr si parametër një String dhe
kthen true nëse stringu është palindromë. Testojeni metodën.*/
import java.util.Scanner;
public class ush9 {

    public static boolean eshtePalindrom(String str) {
        if (str.length() <= 1) {
            return true;
        }

        if (str.charAt(0) != str.charAt(str.length() - 1)) {
            return false;
        }

        return eshtePalindrom(str.substring(1, str.length() - 1));
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Jepni nje string: ");
        String tekst = input.nextLine();

        boolean palindrom = eshtePalindrom(tekst);

        if (palindrom) {
            System.out.println("Stringu eshte palindrom.");
        } else {
            System.out.println("Stringu nuk eshte palindrom.");
        }

  }
}

