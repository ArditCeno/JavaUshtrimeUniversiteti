/*7. Ndërtoni një program që lexon nga një skedar ku çdo rresht ka vetëm një numër (integer ose double).
Programi duhet të gjejë dhe afishojë numrin më të madh.*/
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Scanner;

public class ush7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Jep emrin e skedarit: ");
        String fileName = sc.nextLine();

        double max = Double.NEGATIVE_INFINITY;

        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            String line;

            while ((line = reader.readLine()) != null) {
                double number = Double.parseDouble(line.trim());

                if (number > max) {
                    max = number;
                }
            }

            reader.close();

            if (max != Double.NEGATIVE_INFINITY) {
                System.out.println("Numri m3 i madh eshte  " + max);
            } else {
                System.out.println("Skedari bosh");
            }

        } catch (IOException e) {
            System.out.println("Gabim gjat leximit të skedarit");
        } catch (NumberFormatException e) {
            System.out.println("Skedari mban vlera jo nr");
        }

        sc.close();
    }
}