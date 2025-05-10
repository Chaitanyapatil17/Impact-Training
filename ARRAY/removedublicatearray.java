import java.util.*;
public class removedublicatearray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            set.add(arr[i]);
        }
        
        int[] uniqueArr = new int[set.size()];
        int index = 0;
        for (Integer num : set) {
            uniqueArr[index++] = num;
        }
        
        System.out.println("Array after removing duplicates: " + Arrays.toString(uniqueArr));
    }
}
