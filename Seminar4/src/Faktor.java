import java.util.Scanner;

public class Faktor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Shkruani nje numer te plote: ");
        int n = scanner.nextInt();
        
        System.out.println("Faktoret e numrit " + n + ":");
        
        for (int i = 2; i <= n; i++) {
            while (n % i == 0) {
                System.out.println(i);
                n = n / i;
            }
        }
        
        scanner.close();
    }
}
