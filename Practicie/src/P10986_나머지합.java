import java.util.Scanner;

public class P10986_나머지합 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        long[] S = new long[N];
        long[] C = new long[M];

        long answer = 0;

        // 수열 합에 대한 배열 만들기
        S[0] = sc.nextInt();
        for (int i = 1; i < N; i++) {
            S[i] = S[i-1] + sc.nextInt(); // 따로 입력받은 배열 생성하지 않고 바로 합배열로 만들어줌으로써 공간 복잡도 줄임

        }
    }
}