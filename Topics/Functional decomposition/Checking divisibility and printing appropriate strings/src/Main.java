import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        // function calls of isDivByThree, isDivByFive, isDivByThreeAndFive will be here
        String result = isDivByThreeAndFive(num) ? "FizzBuzz" :
                isDivByFive(num) ? "Buzz" :
                        isDivThree(num) ? "Fizz" : "None";
        System.out.println(result);
    }
    // function isDivByThree will be here
    public static boolean isDivThree(int number) {
        return number % 3 == 0;
    }

    // function isDivByFive will be here
    public static boolean isDivByFive(int number) {
        return  number % 5 == 0;
    }

    // function isDivByThreeAndFive will be here
    public static boolean isDivByThreeAndFive(int number) {
        return isDivThree(number) && isDivByFive(number);
    }
}