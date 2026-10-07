/*2. Krijoni një klasë Book, e cila do ketë si fusha: titull, autor, numër faqesh dhe çmim. Ndërtoni
konstruktorin për inicializimin e të dhënave. Ndërtoni metodat getTitle(), getAuthor(), getPrice() dhe
një metodë applyDiscount(double percent) që redukton çmimin sipas përqindjes së dhënë. Testoni të
gjitha metodat e klasës Book.*/
import java.util.Scanner;

public class Ush2 {

    private String titull;
    private String autor;
    private int numerFaqesh;
    private double cmim;

    public Ush2(String t, String a, int n, double c) {
        titull = t;
        autor = a;
        numerFaqesh = n;
        cmim = c;
    }

    public String getTitullin() {
        return titull;
    }

    public String getAuthor() {
        return autor;
    }

    public double getPrice() {
        return cmim;
    }

    public void applyDiscount(double percent) {
        if (percent > 0) {
            cmim = cmim - (cmim * percent / 100);
        }
    }
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Titulli i librit: ");
        String titull = sc.nextLine();

        System.out.print("Jep autorin: ");
        String autor = sc.nextLine();

        System.out.print("Jep nr e faqeve: ");
        int faqet = sc.nextInt();

        System.out.print("Jep vlerem e librit: ");
        double cmimi = sc.nextDouble();

        Ush2 book = new Ush2(titull, autor, faqet, cmimi);

        System.out.println("Te dhenat> ");
        System.out.println("Titulli: " + book.getTitullin());
        System.out.println("Autori: " + book.getAuthor());
        System.out.println("Cmimi fillestar: " + book.getPrice());

        System.out.print("Jep zbritjen: ");
        double zbritja = sc.nextDouble();

        book.applyDiscount(zbritja);

        System.out.println("Cmimi pas zbritjes: " + book.getPrice());

        sc.close();
    }
}