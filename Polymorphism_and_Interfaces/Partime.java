public class Partime implements Payable {
    @Override
    public double CalculateSalary() {
        return 500 * 15;
    }

    public static void main(String[] args) {
        Partime p1 = new Partime();
        System.out.println("Parttime Salary: " + p1.CalculateSalary());
    }
}
