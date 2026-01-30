
import java.util.Scanner;


public class KontrollPolindrom {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Shkruani një fjalë: ");
        String word = scanner.nextLine();
       
        String lowerWord = word.toLowerCase();
        String reversedWord = "";
        
        for (int i = lowerWord.length() - 1; i >= 0; i--) {
            reversedWord += lowerWord.charAt(i);
        }
        
        
        if (lowerWord.equals(reversedWord)) {
            System.out.println("Fjala është palindrome.");
        } else {
            System.out.println("Fjala nuk është palindrome.");
        }
        
        scanner.close();
    }
}
