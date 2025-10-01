package HW1;
import java.util.*;

public class ThreeSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int min    = Math.min(a, Math.min(b, c));

        int max    = Math.max(a, Math.max(b, c));
        int median = a + b + c - min - max;

        System.out.println(min);
        System.out.println(median);
        System.out.println(max);
    }
}