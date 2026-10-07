/*1. Ndërtoni metodat e mëposhtme dhe testojini ato:
a. double average(double x, double y, double z) kthen mesataren e vlerave.
b. boolean allTheSame (double x, double y, double z) kthen true nëse te gjitha vlerat janë të
njëjta.
c. boolean allDifferent(double x, double y, double z) kthen true nëse të gjitha vlerat janë të
ndryshme.
d. boolean sorted (double x, double y, double z) kthen true nëse të gjitha vlerat janë të
renditura duke filluar nga më e vogla.*/
import java.util.Scanner;

public class ush1 {

    public static double average(double x, double y, double z) {
        return (x + y + z) / 3;
    }
    public static boolean allTheSame(double x, double y, double z) {
        return x == y && y == z;
    }
    public static boolean allDifferent(double x, double y, double z) {
        return x != y && x != z && y != z;
    }
    public static boolean sorted(double x, double y, double z) {
        return x <= y && y <= z;
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Shkruaj vleren e pare: ");
        double x = in.nextDouble();

        System.out.print("Shkruaj vleren e dyte: ");
        double y = in.nextDouble();

        System.out.print("Shkruaj vleren e trete: ");
        double z = in.nextDouble();

        System.out.println("Mesatarja: " + average(x, y, z));
        System.out.println("Jane te gjitha te njejta? " + allTheSame(x, y, z));
        System.out.println("Jane te gjitha te ndryshme? " + allDifferent(x, y, z));
        System.out.println("Jane te renditura? " + sorted(x, y, z));

    }
}

