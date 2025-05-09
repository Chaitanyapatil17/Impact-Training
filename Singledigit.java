// Write a program to find the sum of digits of a number until the sum is a single digit number.
import java.util.Scanner;
public class Singledigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int sum = 0;
            
            while (num > 9) {
                sum = 0;
                while (num != 0) {
                    sum += num % 10; 
                    num /= 10; 
                }
                num = sum; 
            }
    
            System.out.println("The single digit sum is: " + num);


    }
}
