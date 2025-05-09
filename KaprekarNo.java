import java.util.*;
public class KaprekarNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();

        int square = num * num;
        int digits = String.valueOf(num).length();

        int divisor = (int) Math.pow(10, digits);


        
    }
}
