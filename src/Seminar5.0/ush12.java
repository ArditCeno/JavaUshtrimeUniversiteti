/*12. Ndërtoni një program që kontrollon nëse një fjalëkalim i përmbush rregullat e mëposhtme:
• fjalëkalimi duhet të ketë të paktën 8 karaktere.
• fjalëkalimi duhet të ketë të paktën një shkronjë të madhe dhe një shkronjë të vogël
• fjalëkalimi duhet të ketë të paktën një numër.
Ndërtoni metodat përkatëse. Nëse rregullat e fjalëkalimit nuk përputhen i kërkohet
përdoruesit që ti vendosë përsëri të dhënat.*/
import java.util.Scanner;
public class ush12 {
    public static boolean checkLength(String password) {
        return password.length() >= 8;
    }

    public static boolean hasUpperCase(String password) {
        for (int i = 0; i < password.length(); i++) {
            if (Character.isUpperCase(password.charAt(i))) {
                return true;
            }
        }
        return false;
    }

    public static boolean hasLowerCase(String password) {
        for (int i = 0; i < password.length(); i++) {
            if (Character.isLowerCase(password.charAt(i))) {
                return true;
            }
        }
        return false;
    }

    public static boolean hasDigit(String password) {
        for (int i = 0; i < password.length(); i++) {
            if (Character.isDigit(password.charAt(i))) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String password;

        while (true) {
            System.out.print("Vendosni pass: ");
            password = input.nextLine();

            boolean lengthOk = checkLength(password);
            boolean upperOk = hasUpperCase(password);
            boolean lowerOk = hasLowerCase(password);
            boolean digitOk = hasDigit(password);

            if (lengthOk && upperOk && lowerOk && digitOk) {
                System.out.println("pass eshte i vlefshem!");
                break; 
            } else {
                System.out.println("kodi nuk permbush rregullat:");
                if (!lengthOk) {
                    System.out.println("Duhet te kete te pakten 8 karaktere.");
                }
                if (!upperOk) {
                    System.out.println("Duhet te kete te pakten nje shkronj te madhe.");
                }
                if (!lowerOk) {
                    System.out.println("Duhet te kete te pakten nje shkronje te vogel.");
                }
                if (!digitOk) {
                    System.out.println("Duhet te kete te pakten nje nr.");
                }
                System.out.println("Ju lutem provoni prap.\n");
            }
        }
    }
}