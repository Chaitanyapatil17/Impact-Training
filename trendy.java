import java.util.*;

public class trendy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num >= 100 || num <= 999) {
            System.out.println("Trendy number");
        }
        int middleDigit = (number / 10) % 10;

        if (middleDigit % 3 == 0) {
            System.out.println("Trendy number");
        } else {
            System.out.println("Not a trendy number");
        }
    }
}
