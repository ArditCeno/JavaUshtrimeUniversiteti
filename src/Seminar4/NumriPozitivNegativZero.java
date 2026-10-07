import java.util.Scanner;

public class NumriPozitivNegativZero {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Shkruaj nje sekuenc numrash :");
        String line = input.nextLine();
        
        // Ndajmë numrat sipas hapësirave
        String[] parts = line.split(" ");
        
        int pozitiv = 0;
        int negativ = 0;
        int zero = 0;
        
        for (int i = 0; i < parts.length; i++) {
            int numri = Integer.parseInt(parts[i]);
            
            if (numri > 0)
                pozitiv++;
            else if (numri < 0)
                negativ++;
            else
                zero++;
        }
        
        // Afishojmë rezultatin
        System.out.println("Pozitiv: " + pozitiv);
        System.out.println("Negativ: " + negativ);
        System.out.println("Zero: " + zero);
    }
}
