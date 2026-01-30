/*4. Ndërtoni një program që kërkon nga përdoruesi emrin e skedarit dhe afishon numrin e
karaktereve, fjalëve dhe rreshtave në skedar.*/
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Scanner;

public class ush4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Jep emrin e skedarit: ");
        String fileName = sc.nextLine();

        int lines = 0;
        int words = 0;
        int characters = 0;

        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            String line;

            while ((line = reader.readLine()) != null) {
                lines++;

                characters += line.length();

                if (!line.trim().isEmpty()) {
                    String[] wordArray = line.trim().split("\\s+");
                    words += wordArray.length;
                }
            }

            reader.close();

            System.out.println("Numri i rreshtave: " + lines);
            System.out.println("Numri i fjaleve: " + words);
            System.out.println("Numri i karaktereve: " + characters);

        } catch (IOException e) {
            System.out.println("Gabim gjat leximit");
        }

        sc.close();
    }
}
