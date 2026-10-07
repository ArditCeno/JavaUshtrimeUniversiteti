/*11. Ndërtoni një metodë statike public static double readDouble(String prompt) e cila i shfaq një
String përdoruesit, lexon numrin dhe më pas e kthen atë.*/
import java.util.Scanner;
public class ush11 {
    public static double lexDouble(String prompt) {
        Scanner input = new Scanner(System.in);
        double value = 0;
        boolean valid = false;

        while (!valid) {
            System.out.print("Vendos dicka."); 
            try {
                value = Double.parseDouble(input.nextLine());
                valid = true; 
            } catch (NumberFormatException e) {
                System.out.println("Input koti. shtypni nje nr tjeter.");
            }
        }

        return value;
    }

    public static void main(String[] args) {
        double numri = lexDouble("Jepni nje nr : ");
                System.out.println("Numri i futur eshte: " +numri);

    }
}