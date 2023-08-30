import java.io.IOException;
import java.util.Scanner;

public class Exercise2 {
    public static void main(String args[]) throws IOException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Your First Name: ");
        String name = scanner.nextLine();

        scanner.close();

        System.out.println("Yourname is: " + name);
    }
}
