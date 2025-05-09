import java.util.*;

public class condition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
    
        int n = sc.nextInt();
        // if (n > 20 && n / 2 == 0) {
        //     System.out.println("Greater than 20 and even");

        // } else if (n > 20 && n / 2 != 0) {
        //     System.out.println("Greater than 20 and odd");

        // } else if (n < 20 && n / 2 == 0) {
        //     System.out.println("Less than 20 and even");

        // } else if (n < 20 && n / 2 != 0) {
        //     System.out.println("Less than 20 and odd");

        // } else {
        //     System.out.println("Equal to 20");
        // }

        if (n / 2 == 0 && n <=2 || n >= 5) {
            System.out.println("Not Werid");
        }
        else if (n / 2 == 0 && n <= 6 && n >= 20) {
            System.out.println("Weird");
        } 
        else if (n % 2 != 0){
            System.out.println("Odd number");
        }else {
            System.out.println("Even number");
        }

    }
}
