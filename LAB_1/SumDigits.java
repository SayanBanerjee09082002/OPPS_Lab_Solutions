package LAB_1;

public class SumDigits {
    static int SumDigit(String input) {
        try {
            int num = Integer.parseInt(input);
            int sum = 0;

            while (num > 0) {
                sum += num % 10;
                num /= 10;
            }
            return sum;

        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a positive integer.");
            return -1;
        }
    }

    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("No Inputs Given");
            return;
        }

        if (Integer.parseInt(args[0]) >= 0)
            System.out.println("Sum of all digits is = " + SumDigit(args[0]));
        else
            System.out.println("Invalid input. Please enter a positive integer.");
    }
}
