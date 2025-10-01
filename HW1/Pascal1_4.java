package HW1;
import java.util.*;

public class Pascal1_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {

            int number = 1;

            for (int j = 0; j <= i; j++) {
                System.out.print(number + " ");

                // C(i, j+1) = C(i, j) * (i - j) / (j + 1)
                number = number * (i - j) / (j + 1);
            }

            System.out.println();
        }



    }
}