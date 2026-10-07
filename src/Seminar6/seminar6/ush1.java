/*1. Ndërtoni një program që mbush tabelën me 10 numra të rastësishëm të ndryshëm midis 1 dhe 100.*/
import java.util.Random;

public class ush1 {
    public static void main(String[] args) {

        int[] array = new int[10];
        Random rand = new Random();

        for (int i = 0; i < array.length; i++) {
            int randomNumber;
            boolean exists;

            do {
                exists = false;
                randomNumber = rand.nextInt(100) + 1; 

                for (int j = 0; j < i; j++) {
                    if (array[j] == randomNumber) {
                        exists = true;
                        break;
                    }
                }
            } while (exists);

            array[i] = randomNumber;
        }

        System.out.println("Numrat e rastesishem te ndryshem:");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}
