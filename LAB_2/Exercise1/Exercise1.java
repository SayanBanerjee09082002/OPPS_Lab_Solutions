import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise1 {
    static int adder(int[] numbers) {
        int sum = 0;

        for (int i = 0; i < 10; i++)
            sum = sum + numbers[i];

        return sum;
    }

    public static void main(String[] args) throws IOException {
        int[] numbers = new int[10];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter integer number " + (i + 1) + ":  ");
            String input = reader.readLine();

            try {
                numbers[i] = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("Only integers are accepted as input");
                i--;
            }
        }

        System.out.println("The sum of the integers are = " + adder(numbers));
    }
}
