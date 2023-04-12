import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter speed and aceleration: ");
        double speed = scan.nextDouble();
        double aceleration = scan.nextDouble();

        double lenght = Math.pow(speed, 2) / (2*aceleration);

        System.out.println("The minimum runway for this airplane is: " + String.format("%.3f", lenght));
    }
}