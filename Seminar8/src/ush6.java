/*6. Ndërtoni një program që zëvendëson çdo rresht të skedarit me të anasjelltin e tij.*/
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;

public class ush6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Jep emrin e skedarit: ");
        String fileName = sc.nextLine();

        ArrayList<String> reversedLines = new ArrayList<>();

        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            String line;

            while ((line = reader.readLine()) != null) {
                String reversed = new StringBuilder(line).reverse().toString();
                reversedLines.add(reversed);
            }
            reader.close();

            FileWriter writer = new FileWriter(fileName);
            for (String l : reversedLines) {
                writer.write(l + "\n");
            }
            writer.close();

            System.out.println("Skedari u kthye");

        } catch (IOException e) {
            System.out.println("Gabim pune");
        }

        sc.close();
    }
}
