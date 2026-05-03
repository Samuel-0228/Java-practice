public class UncheckedHandled {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30};

        try {
            System.out.println("The value at index 5 is: " + numbers[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: That index is out of range!");
        }

        System.out.println("Program continues normally...");
    }
}