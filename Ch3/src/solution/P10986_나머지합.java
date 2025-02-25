package solution;

import java.util.Scanner;

public class P10986_나머지합 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        long[] S = new long[N];
        long[] C = new long[M];

        long answer = 0;

        S[0] = sc.nextInt();
        for (int i =1; i<N; i++) {
            S[i] = S[i-1] + sc.nextInt();
        }
        for (int i = 0; i < N; i++) {
            int remainder = (int)(S[i] % M);
            // 0부터 i번째까지의 합에서의 나머지가 0일 때 정답에 추가하기
            if (remainder == 0) {
                answer++;
            }

            // 나머지가 같은 인덱스들 카운팅
            C[remainder]++;
        }
        for (int i = 0; i < M; i++) {
            if (C[i] > 1) {
                answer = answer + (C[i] * (C[i] -1) / 2);
            }
        }
        System.out.println(answer);
    }
}
