import java.util.Scanner;

public class WordAnalysis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Shkruani nje fjal: ");
        String word = scanner.nextLine();
        
        int vowelCount = 0;
        String vowels = "aeiouAEIOU";
        
        System.out.println("Karakteret e fjales:");
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            System.out.println(ch);  // Afishon karakterin në rresht të ri
            
            // Kontrollon nëse karakteri është zanore
            if (vowels.indexOf(ch) != -1) {
                vowelCount++;
            }
        }
        
        System.out.println("Numri i zanoreve: " + vowelCount);
        scanner.close();
    }
}
