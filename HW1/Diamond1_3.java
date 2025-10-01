package HW1;
import java.util.*;

public class Diamond1_3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();

        for (int i = -a; i <= a; i++) {
            for (int j = -a; j <= a; j++) {
                if (Math.abs(i) + Math.abs(j) <= a) System.out.print("* ");
                else System.out.print(". ");
            }
            System.out.println();
        }
    }
}