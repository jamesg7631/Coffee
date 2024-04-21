import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the volumes of water, milk, and coffee beans
        int currentWaterVolume = scanner.nextInt();
        int currentMilkVolume = scanner.nextInt();
        int currentCoffeeBeans = scanner.nextInt();

        // Input the number of cups of coffee needed
        int coffeeRequest = scanner.nextInt();

        // Calculate how many cups of coffee the machine can make
        int machineCanMake = howManyCoffee(currentWaterVolume, currentMilkVolume, currentCoffeeBeans);

        // Output based on the comparison between requested and available cups
        if (coffeeRequest == machineCanMake) {
            System.out.println("Yes, I can make that amount of coffee");
        } else if (coffeeRequest < machineCanMake) {
            System.out.println("Yes, I can make that amount of coffee (and even " + (machineCanMake - coffeeRequest) + " more than that)");
        } else {
            System.out.println("No, I can make only " + machineCanMake + " cup(s) of coffee");
        }
    }

    // Method to calculate how many cups of coffee can be made with the given resources
    public static int howManyCoffee(int currentWaterVolume, int currentMilkVolume, int currentCoffeeBeans) {
        int waterUnit = 200;
        int milkUnit = 50;
        int coffeeUnit = 15;

        // Calculate how many cups can be made based on each resource
        int enoughWaterNumber = currentWaterVolume / waterUnit;
        int enoughMilkUnit = currentMilkVolume / milkUnit;
        int enoughCoffeeUnit = currentCoffeeBeans / coffeeUnit;

        // Determine the limiting factor (resource) for the number of cups
        int numberOfCoffees = enoughWaterNumber;
        if (enoughMilkUnit < numberOfCoffees) {
            numberOfCoffees = enoughMilkUnit;
        }
        if (enoughCoffeeUnit < numberOfCoffees) {
            numberOfCoffees = enoughCoffeeUnit;
        }
        return numberOfCoffees;
    }
}
