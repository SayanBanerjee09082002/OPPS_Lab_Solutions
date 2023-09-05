import java.util.Scanner;

class TaxOnSalary {
    private double salary = 0;
    private boolean isPANsubmitted = false;

    TaxOnSalary(boolean isPANsubmitted) {
        this.isPANsubmitted = isPANsubmitted;
        this.salary = 1000.00;
    }

    TaxOnSalary() {
    }

    public double calculateTax() {
        if (salary < 180000 && isPANsubmitted == true)
            return 0;
        else if (salary < 180000 && isPANsubmitted == false)
            return salary * 0.05;
        else if (salary < 500000)
            return salary * 0.1;
        else if (salary < 1000000)
            return salary * 0.2;
        else
            return salary * 0.3;
    }

    public void inputSalary(double salary) {
        this.salary = salary;
    }

    public double viewSalary() {
        return this.salary;
    }

    public boolean isPANsubmitted() {
        return this.isPANsubmitted;
    }
}

public class TestTax {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        TaxOnSalary tax1 = new TaxOnSalary(true);
        System.out.print("Enter salary for tax1: ");
        double salary1 = scanner.nextDouble();
        tax1.inputSalary(salary1);
        double taxAmount1 = tax1.calculateTax();
        System.out.println("Tax on salary1 of $" + salary1 + " is $" + taxAmount1);

        TaxOnSalary tax2 = new TaxOnSalary();
        System.out.print("Enter salary for tax2: ");
        double salary2 = scanner.nextDouble();
        tax2.inputSalary(salary2);
        double taxAmount2 = tax2.calculateTax();
        System.out.println("Tax on salary2 of $" + salary2 + " is $" + taxAmount2);

        scanner.close();
    }
}
