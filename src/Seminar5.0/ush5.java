/*5. Ndërtoni një metodë statike e cila kthen numrin e zanoreve në një string str.*/
import java.util.Scanner;
public class ush5 {

    public static int nrZanoreve(String str) {
        int count = 0;
        str = str.toLowerCase(); 
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c =='y' || c =='ë') {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Jepni nje string: ");
        String tekst = input.nextLine();

        int numriZanoreve = nrZanoreve(tekst);

        System.out.println("Numri i zanoreve: " + numriZanoreve);

  }
}

