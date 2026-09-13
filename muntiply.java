import java.util.Scanner;

public class Multiply {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("How many numbers do you want to multiply? ");
        int n = sc.nextInt();

        System.out.print("Enter number 1: ");
        int multiply = sc.nextInt();

        for (int i = 2; i <= n; i++) {
            System.out.print("Enter number " + i + ": ");
            int number = sc.nextInt();

            multiply = multiply * number;
        }

        System.out.println("Multiplication = " + multiply);

        sc.close();
    }
}