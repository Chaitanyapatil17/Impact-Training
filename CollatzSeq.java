import java.util.Scanner;

public class CollatzSeq {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        while (num / 2 == 0){
            int seq = num / 2;
            System.out.println(seq);
            num ++;
        }

       else (num / 2 != 0) {
            int seq = num * 3 + 1;
            System.out.println(seq);
            num ++;
        }
    
}
}
