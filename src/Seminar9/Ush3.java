/*3. Implementoni një klasë Product. Një produkt ka një emër dhe një çmim, për shembull new Product
(“Salmon”, 28.95). Ndërtoni metodat getName, getPrice dhe reducePrice. Ndërtoni një program
ProductPrinter i cili do afishojë emrat dhe çmimet e dy produkteve, do të reduktojë çmimin e tyre me
5$ dhe do të afishojë përsëri çmimet e tyre.*/
import java.util.Scanner;

public class Ush3 {

    static class Product {

        private String name;
        private double price;

        public Product(String n, double p) {
            name = n;
            price = p;
        }

        public String getName() {
            return name;
        }
        public double getPrice() {
            return price;
        }

        public void reducePrice(double amount) {
            if (amount > 0) {
                price = price - amount;
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Jep emrin e produktit te pare: ");
        String name1 = sc.nextLine();

        System.out.print("Jep cmimin e produktit te pare: ");
        double price1 = sc.nextDouble();
        sc.nextLine(); 

        System.out.print("Jep emrin e produktit te dyte: ");
        String name2 = sc.nextLine();

        System.out.print("Jep cmimin e produktit te dyte: ");
        double price2 = sc.nextDouble();

        Product p1 = new Product(name1, price1);
        Product p2 = new Product(name2, price2);

        System.out.println("Produkte pa ulje");
        System.out.println(p1.getName() + " - $" + p1.getPrice());
        System.out.println(p2.getName() + " - $" + p2.getPrice());

        p1.reducePrice(5);
        p2.reducePrice(5);

        System.out.println("Pas uljes");
        System.out.println(p1.getName() + " - $" + p1.getPrice());
        System.out.println(p2.getName() + " - $" + p2.getPrice());

        sc.close();
    }
}
