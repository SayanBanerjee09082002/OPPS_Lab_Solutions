package LAB_1;
package Fibonacci;

public class Fibonacci {

    static int[] fib(int num) {
        int series[] = new int[num + 2];

        series[0] = 1;
        series[1] = 1;

        for (int i = 2; i < num; i++)
            series[i] = series[i - 1] + series[i - 2];

        return series;
    }

    public static void main(String[] args) {
        int num = 20;
        double sum = 0;

        int series[] = fib(num);

        System.out.print("Required Fibonacci Series: ");

        for (int i = 0; i < num; i++) {
            sum += series[i];
            System.out.print(series[i] + " ");
            if (i == num - 1)
                System.out.println("\nRequired average = " + sum / num);
        }
    }

}
