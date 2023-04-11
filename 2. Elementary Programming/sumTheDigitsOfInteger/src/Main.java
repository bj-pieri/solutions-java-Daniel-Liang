import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a number between 0 and 1000");

        int number = scan.nextInt();

        int lastDigit = number % 10;
        int midleDigitRemainder = number / 10;
        int midleDigit = midleDigitRemainder % 10;
        int firstDigitRemainder = midleDigitRemainder / 10;
        int firstDigit = firstDigitRemainder % 10;

        int sum = lastDigit + midleDigit + firstDigit;

        System.out.println("The sum of the digits is: " + sum);

    }
}