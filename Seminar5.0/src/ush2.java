/*2. Ndërtoni një metodë që merr si parametër një numër dhe kthen
a. Shifrën e parë
b. Shifrën e fundit
c. Numrin e shifrave
Ndërtoni programin testues të metodave.*/
import java.util.Scanner;
public class ush2 {
// a. 
    public static int shifraEpare(int nr) {
        nr = Math.abs(nr); 
        while (nr >= 10) {
            nr /= 10;
        }
        return nr;
    }

    // b. 
    public static int shifraFundit(int nr) {
        nr = Math.abs(nr);
        return nr % 10;
    }

    // c. 
    public static int numriShifrave(int nr) {
        nr = Math.abs(nr);

        if (nr == 0) return 1;

        int count = 0;
        while (nr > 0) {
            nr /= 10;
            count++;
        }
        return count;
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Shkruaj nje numer: ");
        int nr = in.nextInt();
        System.out.println("Shifra e pare: " + shifraEpare(nr));
        System.out.println("Shifra e fundit: " + shifraFundit(nr));
        System.out.println("Numri i shifrave: " + numriShifrave(nr));

    }
}
