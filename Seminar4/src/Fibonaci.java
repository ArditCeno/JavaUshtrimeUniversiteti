import java.util.Scanner;

public class Fibonaci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Shkruani numrin n: ");
        int n = scanner.nextInt();
        
        if (n <= 0) {
            System.out.println("Numri duhet te jete me i madh se 0.");
        } else {
            long f1 = 1, f2 = 1;
            
            System.out.println("Numrat e Fibonacit:");
            
            for (int i = 1; i <= n; i++) {
                if (i == 1 || i == 2) {
                    System.out.print("1 ");
                } else {
                    long fn = f1 + f2;
                    System.out.print(fn + " ");
                    f1 = f2;
                    f2 = fn;
                }
            }
        }
        
        scanner.close();
    }
}
