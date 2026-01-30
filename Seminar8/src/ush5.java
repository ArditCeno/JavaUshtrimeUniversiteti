/*5. Ndërtoni një program që kërkon nga përdoruesi emrin e një skedari burim (source) dhe një skedari
destinacion (target).
Programi duhet të lexojë çdo rresht nga skedari burim dhe ta shkruajë identikisht në skedarin destinacion.*/
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Scanner;

public class ush5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Jep emrin e skedarit burim: ");
        String sourceFile = sc.nextLine();

        System.out.print("Jep emrin e skedarit destinacion: ");
        String targetFile = sc.nextLine();

        try {
            BufferedReader reader = new BufferedReader(new FileReader(sourceFile));
            FileWriter writer = new FileWriter(targetFile);

            String line;

            while ((line = reader.readLine()) != null) {
                writer.write(line + "\n");
            }

            reader.close();
            writer.close();

            System.out.println("Skedari u kopjua me sukses!");

        } catch (IOException e) {
            System.out.println("Gabim gjat kopjimit të skedarit.");
        }

        sc.close();
    }
}
