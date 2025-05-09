import java.util.*;
public class ArmstrongNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        int originalNum = num;
        int sum = 0;
        int digits = String.valueOf(num).length(); 
        while (num != 0) {
            int digit = num %10;
            sum += Math.pow(digit, digits);
            num /= 10;
    }
}
