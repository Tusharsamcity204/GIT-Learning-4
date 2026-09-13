import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("How many numbers do you want to add? ");
        int n = sc.nextInt();

        int sum = 0;

        for (int i = 1; i <= n; i++) {
            System.out.print("Enter number " + i + ": ");
            int number = sc.nextInt();

            sum = sum + number;
        }

        System.out.println("Sum of desired number is   = " + sum);

        sc.close();
    }
}