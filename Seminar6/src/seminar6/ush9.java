/*9. Ndërtoni një program që gjeneron 20 numra rasti me vlerë midis 0 dhe 99 në një tabelë. Programi i rendit
ato dhe më pas afishon sekuencën e renditur. Përdorni metodën sort nga libraria e Javës.
package seminar6;*/

import java.util.Arrays;
import java.util.Random;

public class ush9 {

    public static void main(String[] args) {
        int[] tabela = new int[20];
        Random random = new Random();

        for (int i = 0; i < tabela.length; i++) {
            tabela[i] = random.nextInt(100); 
        }

        System.out.println("Numrat e gjeneruar rastesisht: " + Arrays.toString(tabela));

        Arrays.sort(tabela);

        System.out.println("Numrat e renditur: " + Arrays.toString(tabela));
    }
}
