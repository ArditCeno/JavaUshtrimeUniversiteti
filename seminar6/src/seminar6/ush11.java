/*11. Jepet një array int[] arr. Ndërtoni një metodë që kthen numrin e segmenteve rritëse në array. Një
segment rritës është një pjesë e array-t ku çdo element është më i madh se ai para tij.*/
package seminar6;

import java.util.Scanner;
import java.util.ArrayList;

public class ush11 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Sa elemente do te kete array? ");
        int n = scanner.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Jep elementin ne indeksin " + i + ": ");
            arr[i] = scanner.nextInt();
        }

        int numriSegmente = 0;

        System.out.println("Segmentet rritese ne array jane:");

        int i = 0;
        while (i < n - 1) {
            if (arr[i + 1] > arr[i]) {
                ArrayList<Integer> segment = new ArrayList<>();
                segment.add(arr[i]);

                while (i < n - 1 && arr[i + 1] > arr[i]) {
                    i++;
                    segment.add(arr[i]);
                }

                System.out.println(segment);
                numriSegmente++;
            } else {
                i++; 
            }
        }

        System.out.println("Numri i segmenteve rritese ne array eshte: " + numriSegmente);

        scanner.close();
    }
}
