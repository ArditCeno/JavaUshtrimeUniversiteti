import java.util.Scanner;

public class SubstringGjatesia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Shkruani nje fjale: ");
        String word = scanner.nextLine();
        
        int length = word.length();
        
        System.out.println("Te gjitha substringjet e fjales:");
        
        // Loop për gjatësinë e substring-ut
        for (int subLen = 1; subLen <= length; subLen++) {
            // Loop për fillimin e substring-ut
            for (int start = 0; start <= length - subLen; start++) {
                String sub = word.substring(start, start + subLen);
                System.out.println(sub);
            }
        }
        
        scanner.close();
    }
}
