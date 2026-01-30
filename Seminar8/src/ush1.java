/*1. Shkruani një program që kryen detyrat e mëposhtme:
Hap skedarin me emrin hello.txt.
Ruaj mesazhin “Hello World!” në skedar.
Mbyll skedarin.
Hap përsëri skedarin.
Lexo mesazhin në një variabël string dhe afishojeni atë.*/
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class ush1 {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("hello.txt");
            writer.write("Hello World!");
            writer.close();

            FileReader reader = new FileReader("hello.txt");
            BufferedReader br = new BufferedReader(reader);
            String message = br.readLine();
            br.close();

            System.out.println(message);

        } catch (IOException e) {
            System.out.println("Ndodhi nje gabim.");
        }
    }
}