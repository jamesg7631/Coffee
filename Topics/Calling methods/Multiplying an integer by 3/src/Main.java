import java.util.Scanner;

public class Main {
    // Method to be created here that multiplies a given integer by 3

    public static int multiplyByThree(int number) {
        return  3 * number;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input from user using scanner
        int n = scanner.nextInt();

        // Call the multiply method here with 'n' as argument and print result
        System.out.println(multiplyByThree(n));
    }
}