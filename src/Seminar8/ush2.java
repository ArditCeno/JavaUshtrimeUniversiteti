/*2. Ndërtoni një program që lexon një skedar tekst. Lexoni secilin rresht të skedarit dhe shkruajeni atë
në skedarin output të ndjekur nga numri i rreshtit.*/
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Scanner;

public class ush2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Jep emrin e skedarit input: ");
        String inputFile = in.nextLine();

        System.out.print("Jep emrin e skedarit output: ");
        String outputFile = in.nextLine();

        try {
            BufferedReader lexues = new BufferedReader(new FileReader(inputFile));
            FileWriter writer = new FileWriter(outputFile);

            String line;
            int lineNumber = 1;

            while ((line = lexues.readLine()) != null) {
                writer.write("/* " + lineNumber + " */ " + line + "\n");
                lineNumber++;
            }

            lexues.close();
            writer.close();

            System.out.println("Skedari output u krijua me sukses!");

        } catch (IOException e) {
            System.out.println("Gabim leximi ose shkrim.");
        }

        in.close();
    }
}
