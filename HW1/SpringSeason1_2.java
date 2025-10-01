package HW1;
import java.util.*;

public class SpringSeason1_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int month = scanner.nextInt();
        int day =  scanner.nextInt();

        boolean isSpring =  (month == 3 && day >= 20 && day <= 31)
                || (month == 4 && day >=  1 && day <= 30)
                || (month == 5 && day >=  1 && day <= 31)
                || (month == 6 && day >=  1 && day <= 20);

        System.out.println(isSpring);
    }
}