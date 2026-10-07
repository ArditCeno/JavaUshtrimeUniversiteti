import java.util.Scanner;

public class NumriPrim {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Shkruani një numër të plotë: ");
        int num = scanner.nextInt();
        
        if (num <= 1) {
            System.out.println(num + " nuk është numër prim.");
        } else {
            boolean isPrime = true;
            
            // Kontrollojmë faktorët nga 2 deri te rrënja katrore e numrit
            for (int i = 2; i * i <= num; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            
            if (isPrime) {
                System.out.println(num + " është numër prim.");
            } else {
                System.out.println(num + " nuk është numër prim.");
            }
        }
        
        scanner.close();
    }
}
