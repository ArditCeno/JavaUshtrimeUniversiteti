/*2. Ndërtoni një program që inicializon një tabelë me dhjetë numra random me vlerë nga 1 deri në 10 dhe
afishon:
a. Elementët në pozion çift
b. Elementin e parë dhe elementin e fundit*/
import java.util.Random;

public class ush2 {
    public static void main(String[] args) {

        int[] array = new int[10];
        Random rand = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(10) + 1; 
        }

        System.out.println("Tabela:");
        for (int num : array) {
            System.out.print(num + " ");
        }

        System.out.println("\n\nElementet ne pozicion cift:");
        for (int i = 0; i < array.length; i += 2) {
            System.out.println("Pozicioni " + i + ": " + array[i]);
        }

        System.out.println("\nElementi i pare: " + array[0]);
        System.out.println("Elementi i fundit: " + array[array.length - 1]);
    }

}
