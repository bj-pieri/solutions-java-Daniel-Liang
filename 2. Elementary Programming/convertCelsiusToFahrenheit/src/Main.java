import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a degree in Celsius: ");
        double celsius = scan.nextDouble();
        double fahrenheit = (9.0 / 5.0 * celsius) + 32.0;
        System.out.println(celsius + " Celsius is " + fahrenheit + " Fahrenheit");
    }
}