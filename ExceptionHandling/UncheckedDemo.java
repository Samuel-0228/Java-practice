public class UncheckedDemo {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30};
        // Array has indices 0, 1, 2 only
        System.out.println("The value at index 5 is: " + numbers[5]); 
        // Throws ArrayIndexOutOfBoundsException at runtime
    }
}