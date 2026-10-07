import java.util.Scanner;

public class ShumaNr {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Shkruaj një sekuenc numrash (ndarë me hapësirë):");
        String line = input.nextLine();
        
        // Ndahet vargu në pjesë sipas hapësirave
        String[] parts = line.split(" ");
        
        int shuma = 0;
        System.out.print("Rezultati: ");
        
        for (int i = 0; i < parts.length; i++) {
            int numri = Integer.parseInt(parts[i]);
            shuma += numri;
            System.out.print(shuma + " ");
        }
    }
}
