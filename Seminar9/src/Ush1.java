/*1. Implementoni një klasë Employee. Një punonjës ka emrin, pagën mujore dhe numrin e muajve të
punës. Ndërtoni metodat aksesuese dhe ndryshuese për fushat e dhëna. Testoni klasën Employee
me disa objekte.*/
import java.util.Scanner;

public class Ush1 {

    private String emri;
    private double pagaMujore;
    private int muajtEPunes;

    public Ush1(String e, double p, int m) {
        emri = e;
        pagaMujore = p;
        muajtEPunes = m;
    }

    public double llogaritPagenTotale() {
        return pagaMujore * muajtEPunes;
    }

    public void afishoTeDhenat() {
        System.out.println("Te dhenat e punonjesit");
        System.out.println("Emri: " + emri);
        System.out.println("Paga mujore: " + pagaMujore);
        System.out.println("Muajt e punes: " + muajtEPunes);
        System.out.println("Paga totale: " + llogaritPagenTotale());
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Jep emrin e punetorit: ");
        String emri = sc.nextLine();

        System.out.print("Jep pagen mujore: ");
        double paga = sc.nextDouble();

        System.out.print("Jep numrin e muajve te punes: ");
        int muajt = sc.nextInt();

        Ush1 emp = new Ush1(emri, paga, muajt);
        emp.afishoTeDhenat();

        sc.close();
    }
}
