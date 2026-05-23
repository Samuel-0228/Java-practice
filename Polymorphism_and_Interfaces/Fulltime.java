public class Fulltime implements Payable {
    @Override
    public double CalculateSalary() {
        return 500 * 30;
    }

    public static void main(String[] args) {
        Fulltime f1 = new Fulltime();
        System.out.println("Fulltime Salary: " + f1.CalculateSalary());
    }

}
