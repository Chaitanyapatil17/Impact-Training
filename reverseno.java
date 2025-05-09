import java.util.*;

public class reverseno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a 3-digit number: ");
        int threedigitNo = sc.nextInt();

        int num1 = threedigitNo / 100;
        int num2 = (threedigitNo / 10) % 10;
        int num3 = threedigitNo % 10;

        int reversedNumber = num3 * 100 + num2 * 10 + num1;
        System.out.println("Reversed number: " + reversedNumber);
        
    }

}
