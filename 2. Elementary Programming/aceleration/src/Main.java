import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter v0, v1 and t: ");
        double v0 = scan.nextDouble();
        double v1 = scan.nextDouble();
        double time = scan.nextDouble();

        double aceleration = (v1 - v0) / time;

        System.out.println("The average aceleration is: " + String.format("%.2f", aceleration));



    }
}