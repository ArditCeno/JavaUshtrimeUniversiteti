/*6. Implementoni një klasë LibraryBook që ruan emrin e librit dhe një listë me emrat e huazuesve
(ArrayList<String>). Ndërtoni metodat borrow(String person) për të shtuar një person që e huazon
librin, returnBook(String person) për të larguar një person nga lista dhe printBorrowers() për të
afishuar të gjithë huazuesit aktualë. Testoni klasën.*/
import java.util.ArrayList;
import java.util.Scanner;

public class Ush6 {

    static class LibraryBook {

        private String emriLibrit;
        private ArrayList<String> huazuesit;

        public LibraryBook(String emri) {
            emriLibrit = emri;
            huazuesit = new ArrayList<>();
        }

        public void borrow(String person) {
            huazuesit.add(person);
            System.out.println(person + " e huazoi librin.");
        }

        public void returnBook(String person) {
            if (huazuesit.remove(person)) {
                System.out.println(person + " e ktheu librin.");
            } else {
                System.out.println(person + " nuk ishte ne listen e huazuesve.");
            }
        }

        public void printBorrowers() {
            System.out.println("\nHuazuesit aktuale te librit \"" + emriLibrit + "\":");

            if (huazuesit.isEmpty()) {
                System.out.println("Asnje huazues.");
            } else {
                for (String person : huazuesit) {
                    System.out.println("- " + person);
                }
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Jep emrin e librit: ");
        String emriLibrit = sc.nextLine();

        LibraryBook book = new LibraryBook(emriLibrit);
        int zgjedhja;

        do {   
            System.out.println("<<MENU>>");
            System.out.println("0.Dil");
            System.out.println("1.Huazo liber");
            System.out.println("2.Kthe liber");
            System.out.println("3.Shfaq huazuesit");

            System.out.print("Zgjidh nje opsion: ");
            zgjedhja = sc.nextInt();
            sc.nextLine(); 

            if (zgjedhja == 1) {
                System.out.print("Jep emrin e personit: ");
                String person = sc.nextLine();
                book.borrow(person);
            } 
            else if (zgjedhja == 2) {
                System.out.print("Jep emrin e personit: ");
                String person = sc.nextLine();
                book.returnBook(person);
            } 
            else if (zgjedhja == 3) {
                book.printBorrowers();
            } 
            else if (zgjedhja == 0) {
                System.out.println("Programi u mbyll.");
            } 
            else {
                System.out.println("Opsion i gabuar.");
            }

        } while (zgjedhja != 0);

        sc.close();
    }
}
