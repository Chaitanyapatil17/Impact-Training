import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");

        int num = scanner.nextInt();
        int sum = 0;

        while (num != 0) {
            int rev = num % 10;
            sum = sum + rev;
            num = num / 10;
        }
        System.out.println("The sum of digits is: " + sum);
    }
}
