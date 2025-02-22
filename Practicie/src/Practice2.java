import java.util.*;

public class Practice2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[] A = new int[N];

        for (int i = 0; i < A.length; i++){
            A[i] = sc.nextInt();
        }

        int max = 0;
        int sum = 0;
        for (int i = 0; i<A.length; i ++){
            sum += A[i];
            if (A[i] > max){
                max = A[i];
            }
        }
        System.out.println(sum *100.0/ max /N);
    }
}