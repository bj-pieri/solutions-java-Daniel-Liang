import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the number os minutes: ");
        int minutes = scan.nextInt();
        int hours = minutes / 60;
        int day = hours / 24;
        int year = day / 365;
        int dayRemaining = day % 365;


        System.out.println(minutes + " minutes is approximately " + year + " years and " + dayRemaining + " days");

    }
}