import java.util.Scanner;

public class KtheFjalen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Shkruani një fjalë: ");
        String word = scanner.nextLine();
        
        String reversedWord = "";
        
        // Ndërtojmë fjalën e përmbysur
        for (int i = word.length() - 1; i >= 0; i--) {
            reversedWord += word.charAt(i);
        }
        
        System.out.println("Fjala mbrapsht: " + reversedWord);
        scanner.close();
    }
}
