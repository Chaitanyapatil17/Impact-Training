// implement the following function 
//Int NearrestInteger(int num, int m); 
// the function accepts two positive integers num and m as its argument. Implement the function to findand return a number which satisfies the following conditions: 
// 1. The number is divisible by m.
// 2. The number is greater than or equal to num.

import java.util.Scanner;

public class Divisibilitytest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        System.out.print("Enter a divisor: ");
        int m = sc.nextInt();

        int result = nearestInteger(num, m);
        System.out.println("The nearest integer is: " + result);
        }
    public static int nearestInteger(int num, int m) {
        int result = num + (m - num % m);
        if (num % m == 0) {
            return num;
        } else {
            return result;
        }
        // return num + (m - num % m) % m;
        // This line ensures that if num is already divisible by m, it returns num itself.
        



    }
}
