import java.util.Scanner;

public class Difference {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("How many numbers do you want to subtract? ");
        int n = sc.nextInt();

        System.out.print("Enter number 1: ");
        int difference = sc.nextInt();

        for (int i = 2; i <= n; i++) {
            System.out.print("Enter number " + i + ": ");
            int number = sc.nextInt();

            difference = difference - number;
        }

        System.out.println("Difference of desired number is  = " + difference);

        sc.close();
    }
}