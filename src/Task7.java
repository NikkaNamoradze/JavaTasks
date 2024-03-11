public class Task7 {
    public static void main(String[] args) {
        double sum = 0;
        final double trying = 10000.0;
        for (double i = 1; i <= (2 * trying - 1); i += 2) {
            sum += 1 / i;
            i += 2;
            sum -= 1 / i;
        }
        double pi = 4 * sum;

        System.out.println("PI: " + pi);

    }
}
