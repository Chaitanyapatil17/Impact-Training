import java.util.*;

public class Distinctelements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            
        }
        
        Set<Integer> distinctElements = new HashSet<>();
        for (int i = 0; i < n; i++) {
            distinctElements.add(arr[i]);
        }
        
        // System.out.println("Distinct elements are: " + distinctElements);
        System.out.println("Count of distinct elements: " + distinctElements.size());
    }
}
