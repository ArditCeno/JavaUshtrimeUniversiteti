/*3. Ndërtoni një program që lexon një skedar nga përdoruesi. Skedari ka dy kolona me numra me
presje dhjetore. Afishoni mesataren e secilit rresht.*/
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Scanner;

public class ush3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Jep emrin e skedarit: ");
        String fileName = sc.nextLine();

        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            String line;
            int lineNumber = 1;

            while ((line = reader.readLine()) != null) {
                String[] parts = line.split("\\s+");

                double num1 = Double.parseDouble(parts[0]);
                double num2 = Double.parseDouble(parts[1]);

                double average = (num1 + num2) / 2;

                System.out.println("Rreshti " + lineNumber + " - Mesatarja: " + average);

                lineNumber++;
            }

            reader.close();

        } catch (IOException e) {
            System.out.println("Gabim ne lexim");
        } catch (NumberFormatException e) {
            System.out.println("Gabim ne formatim");
        }

        sc.close();
    }
}
