import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);

       double a, b, c, root1, root2;
       a = input.nextDouble();
       b = input.nextDouble();
       c = input.nextDouble();
       double discriminant = Math.pow((Math.pow(b, 2) - 4 * a * c), 0.5);

/*
     if discriminant > 0 has 2 roots
     if discriminant = 0 has one root
     if discriminant < 0 has no real root
*/

        if (discriminant > 0) {
           root1 = ((-b + discriminant) / 2 * a);
           root2 = ((-b - discriminant) / 2 * a);
           System.out.println("The equation has two roots: " + root1 + " and " + root2);
       }
       if (discriminant == 0) {
           root1 = ((-b + discriminant) / 2 * a);
           System.out.println("The equation has one root: " + root1);
       }
       if (discriminant < 0 ) System.out.println("The equation has no real roots");
    }
}