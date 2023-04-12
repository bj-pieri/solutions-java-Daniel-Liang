import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the amount of water in Kilograms: ");
        double waterKg = scan.nextDouble();

        System.out.println("Enter the initial temperature: ");
        double initialTemperature = scan.nextDouble();

        System.out.println("Enter the final temperature: ");
        double finalTemperature = scan.nextDouble();

        double energy = waterKg * (finalTemperature - initialTemperature) * 4184;

        System.out.println("The energy needed is: " + energy);
    }
}