/*5. Implementoni një klasë Counter që vepron si një numërues. Numëruesi fillon nga vlera 0. Ndërtoni
metodat increment(), decrement(), reset() dhe getValue(). Ndërtoni një program i cili përdor klasën
Counter dhe afishon vlerën e saj pas çdo veprimi.*/
import java.util.Scanner;

public class Ush5 {

    // Klasa Counter
    static class Counter {

        private int value;
        public Counter() {
            value = 0;
        }

        public void increment() {
            value++;
        }

        public void decrement() {
            value--;
        }

        public void reset() {
            value = 0;
        }

        public int getValue() {
            return value;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Counter counter = new Counter();
        int zgjedhja;

        System.out.println("Vlera fillestare: " + counter.getValue());

        do {
            System.out.println(" MENU ");
            System.out.println("1. Increment");
            System.out.println("2. Decrement");
            System.out.println("3. Reset");
            System.out.println("4. Shfaq vleren");
            System.out.println("0. Dil");

            System.out.print("Zgjidh nje veprim: ");
            zgjedhja = sc.nextInt();

            if (zgjedhja == 1) {
                counter.increment();
                System.out.println("Vlera aktuale: " + counter.getValue());
            } 
            else if (zgjedhja == 2) {
                counter.decrement();
                System.out.println("Vlera aktuale: " + counter.getValue());
            } 
            else if (zgjedhja == 3) {
                counter.reset();
                System.out.println("Vlera aktuale: " + counter.getValue());
            } 
            else if (zgjedhja == 4) {
                System.out.println("Vlera aktuale: " + counter.getValue());
            } 
            else if (zgjedhja == 0) {
                System.out.println("Programi u mbyll.");
            } 
            else {
                System.out.println("Zgjedhje e gabuar.");
            }

        } while (zgjedhja != 0);

        sc.close();
    }
}
