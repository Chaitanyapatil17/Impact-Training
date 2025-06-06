import java.util.Scanner;

public class DigiOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");

        int num = sc.nextInt();

        int even = 0;
        int odd = 0;

        while (num != 0) {
            int digit = num % 10;
            if (digit % 2 == 0) {
                even += digit;
            } else {
                odd += digit;
            }
            num /= 10;

        }
        System.out.println("Sum of even digits: " + even);
        System.out.println("Sum of odd digits: " + odd);

    }
}
