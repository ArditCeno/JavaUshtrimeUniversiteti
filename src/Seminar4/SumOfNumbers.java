import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int number;

        System.out.println("Shkruani numra (0 për të ndaluar):");

        // Loop deri sa përdoruesi të fusë 0
        do {
            number = scanner.nextInt();
            sum += number; // Shton numrin në sum
        } while (number != 0);

        // Hiq 0 nga shuma
        sum -= 0; // opsionale, nuk ndryshon diçka sepse 0 nuk e ndryshon shumën

        System.out.println("Shuma e numrave të futur është: " + sum);
        scanner.close();
    }
}
