import java.util.*;


public class SumofArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the size of the array: ");
        int size1 = sc.nextInt();
        int size2 = sc.nextInt();
        int[] arr1 = new int[size];
        int[] arr2 = new int[size];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < size; i++) {
            arr1[i] = sc.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum += arr[i];
        }
        for (int j = 0; j < size; j++) {
            arr2[j] = sc.nextInt();
        }
        int sum = 0;
        for (int j = 0; j < size; j++) {
            sum += arr[j];
        }
        if (arr1.length == arr2.length) {
            System.out.println("The arrays are of the same size.");
            return;
        }
        
        // System.out.println("The sum of the array elements is: " + sum);

    }
}
