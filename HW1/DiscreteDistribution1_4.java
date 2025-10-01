package HW1;

public class DiscreteDistribution1_4 {
    public static void main(String[] args) {

        // lay freq
        int n = args.length;
        int[] f = new int[n];

        for (int i = 0; i < n; i++) {
            f[i] = Integer.parseInt(args[i]);
        }

        // sum freq
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += f[i];
        }

        // random cac so theo freq
        int r = (int) (sum * Math.random());   // [0, sum)
        int sum1 = 0;
        int e = -1;

        for (int i = 0; i < n && sum1 <= r; i++) {
            sum1 += f[i];
            e = i;
        }

        System.out.println(e);
    }
}
