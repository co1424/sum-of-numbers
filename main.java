import java.util.ArrayList;
import java.util.List;

class Main {
    // Function to calculate the sum of numbers in a list
    static int calculateSum(List<Integer> numbers) {
        int sum = 0;
        // for loop to go through every number and add it up.
        for (int num : numbers) {
            sum += num;
        }
        return sum;
    }

    public static void main(String[] args) {
        // Setting Variables
        int num1 = 5;
        int num2 = 7;

        // Expressions to compare the number attained from the sum.
        int result = num1 + num2;

        // Conditionals. Is the summed number < or >10?
        if (result > 10) {
            System.out.println("Result is greater than 10");
        } else {
            System.out.println("Result is not greater than 10");
        }

        // Loops to go through the provided numbers in a list:
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

        // Function call to deliver final result.
        int sum = calculateSum(numbers);
        System.out.println("Sum of numbers: " + sum);
    }
}
