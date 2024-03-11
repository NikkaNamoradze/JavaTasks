public class Task4 {
    public static void main(String[] args) {
        int[] aValues = {1, 2, 3, 4};

        System.out.println("a   a^2  a^3");

        for (int i = 0; i < aValues.length; i++) {
            int a = aValues[i];
            int aSquared = a * a;
            int aCubed = a * a * a;

            System.out.println(a + "   " + aSquared + "    " + aCubed);
        }
    }
}
