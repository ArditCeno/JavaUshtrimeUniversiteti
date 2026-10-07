/*10. Ndërtoni një metodë statike invertCase që merr një String dhe kthen të njëjtin string ku çdo
shkronjë e madhe bëhet e vogël dhe çdo shkronjë e vogël bëhet e madhe.*/
import java.util.Scanner;
public class ush10 {

    public static String invertCase(String str) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if (Character.isUpperCase(c)) {
                result.append(Character.toLowerCase(c));
            } else if (Character.isLowerCase(c)) {
                result.append(Character.toUpperCase(c));
            } else {
                result.append(c);
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Jepni nje string: ");
        String tekst = input.nextLine();

        String inverted = invertCase(tekst);

        System.out.println("Stringu me shkronjat e inverzuara: " + inverted);
        
    }
}