import java.util.ArrayList;
import java.util.List;

class Main {
    // Function to calculate the sum of numbers in a list
    static int calculateSum(List<Integer> numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return sum;
    }

    public static void main(String[] args) {
        // Variables
        int num1 = 5;
        int num2 = 7;

        // Expressions
        int result = num1 + num2;

        // Conditionals
        if (result > 10) {
            System.out.println("Result is greater than 10");
        } else {
            System.out.println("Result is not greater than 10");
        }

        // Loops
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Function call
        int sum = calculateSum(numbers);
        System.out.println("Sum of numbers: " + sum);
    }
}
