package LAB_1;

public class HarmonicSum {
    static double SumLTR(int n) {
        double sum = 0;
        for (int i = 1; i <= n; i++)
            sum = sum + 1.0 / i;
        return sum;
    }

    static double SumRTL(int n) {
        double sum = 0;
        for (int i = n; i >= 1; i--)
            sum = sum + 1.0 / i;
        return sum;
    }

    public static void main(String[] args) {
        int n = 50000;
        double difference = SumRTL(n) - SumLTR(n);
        System.out.println("Sum from left to right = " + SumLTR(n));
        System.out.println("Sum from right to left = " + SumRTL(n));
        System.out.println("Difference = " + difference);
    }
}
