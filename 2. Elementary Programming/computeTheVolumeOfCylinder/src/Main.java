import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the radius and lenght of the cylinder");
        double radius = scan.nextDouble();
        double lenght = scan.nextDouble();

        double area = radius * radius * Math.PI;
        double volume = area * lenght;

        System.out.println("The area is: " + (int)area);
        System.out.println("The volume is: " + (int)volume);
    }
}