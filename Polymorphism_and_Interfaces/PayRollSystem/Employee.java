package PayRollSystem;

import java.util.Scanner;

public class Employee {
    protected String name;

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public class Fulltime implements Payable, Taxable {
        @Override
        public double CalculateSalary() {
            return 30000 - calculateTax();
        }

        @Override
        public double calculateTax() {
            return 30000 * 0.1;
        }
    }

    public class Parttime implements Payable {
        Scanner sc = new Scanner(System.in);

        @Override
        public double CalculateSalary() {
            System.out.print("Enter the number of hours worked: ");
            int hrs = sc.nextInt();
            sc.close();
            return 300 * hrs;
        }
    }

    public static void main(String[] args) {
        Employee emp1 = new Employee("sara");
        Parttime p1 = emp1.new Parttime();
        System.out.println("Parttime Salary: " + p1.CalculateSalary());
        Fulltime f1 = emp1.new Fulltime();
        System.out.println("Fulltime Salary: " + f1.CalculateSalary());
    }
}
