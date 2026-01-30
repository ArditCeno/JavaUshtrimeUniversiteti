/*8. Ndërtoni një metodë statike që merr si parametër një String dhe një char dhe kthen sa herë
ndodhet ai karakter brenda stringut.*/
import java.util.Scanner;
public class ush8 {
 
    public static int numeroChar(String str, char c) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == c) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Jepni nje string: ");
        String tekst = input.nextLine();

        System.out.print("Jepni nje karakter: ");
        char karakter = input.next().charAt(0); 

        int numri = numeroChar(tekst, karakter);
        System.out.println("Karakteri '" + karakter + "' ndodhet " + numri + " here ne string.");
    }

}