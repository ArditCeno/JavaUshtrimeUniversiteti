import java.util.Scanner;

public class NrFjaleve {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Shkruani nje fjali: ");
        String sentence = scanner.nextLine();
        
        // Ndajmë fjali në fjalë duke përdorur hapësirën si ndarës
        String[] words = sentence.trim().split("\\s+");
        
        System.out.println("Fjalia ka " + words.length + " fjal.");
        scanner.close();
    }
}
