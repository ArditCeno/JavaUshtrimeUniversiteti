/*6. Ndërtoni një program testues ku:
• krijohen objekte Person, Student, Punonjës dhe Menaxher
• thirret metoda shfaqInfo() për secilin objekt*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Krijo Person");
        System.out.print("Emri: ");
        String emriP = sc.nextLine();
        System.out.print("Mosha: ");
        int moshaP = sc.nextInt();
        sc.nextLine();

        Person p = new Person(emriP, moshaP);

        System.out.println("\n Krijo Student ");
        System.out.print("Emri: ");
        String emriS = sc.nextLine();
        System.out.print("Mosha: ");
        int moshaS = sc.nextInt();
        System.out.print("Nota: ");
        double notaS = sc.nextDouble();
        sc.nextLine();

        Student s = new Student(emriS, moshaS, notaS);

        System.out.println("\n Krijo Punonjes ");
        System.out.print("Emri: ");
        String emriPu = sc.nextLine();
        System.out.print("Mosha: ");
        int moshaPu = sc.nextInt();
        System.out.print("Paga mujore: ");
        double pagaPu = sc.nextDouble();
        sc.nextLine();

        Punonjes pu = new Punonjes(emriPu, moshaPu, pagaPu);

        System.out.println("\n Krijo Menaxher");
        System.out.print("Emri: ");
        String emriM = sc.nextLine();
        System.out.print("Mosha: ");
        int moshaM = sc.nextInt();
        System.out.print("Paga mujore: ");
        double pagaM = sc.nextDouble();
        System.out.print("Bonus vjetor: ");
        double bonusM = sc.nextDouble();

        Menaxher m = new Menaxher(emriM, moshaM, pagaM, bonusM);

        System.out.println("AFISHIMI I TE DHENAVE");
        p.shfaqInfo();
        s.shfaqInfo();
        pu.shfaqInfo();
        m.shfaqInfo();

        sc.close();
    }
}
