import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the subtotal and the gratuity rate: ");
        double subtotal = scan.nextDouble();
        double gratuity = scan.nextDouble();

        double gratuityRate = (gratuity / 100) * subtotal;
        double total = subtotal + gratuityRate;

        System.out.println("The gratuity is: $ " + gratuityRate + " and the total is: $" + total);
    }
}