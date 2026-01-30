/*3. Ndërtoni një metodë statike që merr si parametër një String dhe kthen një String që përmban
karakterin e mesit nëse stringu ka karaktere tek dhe kthen të dy karakteret e mesit nëse
stringu ka numër çift karakteresh.*/
import java.util.Scanner;

public class ush3 {
    public static String middleChar(String text) {
        int length = text.length();
        int mid = length / 2;

        if (length % 2 == 1) {
            return String.valueOf(text.charAt(mid));
        }
        
        else {
            return text.substring(mid - 1, mid + 1);
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Shkruaj nje string: ");
        String input = in.nextLine();

        String result = middleChar(input);

        System.out.println("Karakteret e mesit: " + result);

   }
}
