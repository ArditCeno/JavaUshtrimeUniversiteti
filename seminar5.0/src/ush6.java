/*6. Ndërtoni një metodë statike e cila numëron fjalët në një string str. Fjalët janë të ndara me
hapësira ndërmjet tyre. Përdorni metodën trim() për të hequr hapësirat majtas dhe djathtas
inputit dhe përdorni metodën isEmpty() për të kontrolluar nëse stringu është bosh ose jo.*/
import java.util.Scanner;
public class ush6 {

    public static int numeroFjalet(String str) {
        str = str.trim();

        if (str.isEmpty()) {
            return 0;
        }

        String[] words = str.split("\\s+"); 
        return words.length;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Jepni nje string: ");
        String tekst = input.nextLine();

        int numriFjaleve = numeroFjalet(tekst);

        System.out.println("Nr i  fjalve: " + numriFjaleve);

 }
}
