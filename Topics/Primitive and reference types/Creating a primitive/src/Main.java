import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // put your code here
        printNumberOfArguments(1);
        printNumberOfArguments(1, 2);
        printNumberOfArguments(1, 2, 3);
        printNumberOfArguments(new int[] {});
        printNumberOfArguments(new int[] {1, 2});
        printNumberOfArguments(new int[10]);
    }
    public static void printNumberOfArguments(int... numbers) {
        System.out.println(numbers.length);
    }
}