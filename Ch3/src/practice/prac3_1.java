package practice;

import java.util.Scanner;

public class prac3_1 {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int N = sc.nextInt(); // 수열의 수
            int M = sc.nextInt(); // 퀴즈의 수
            int[] S = new int[N]; // 누적 합의 배열만 저장

            // 누적 합 배열 생성
            S[0] = sc.nextInt(); // 합배열 초기의 값은 입력 값으로 채우기
            for (int i = 1; i < N; i++) { // i=1부터 시작
                S[i] = S[i-1] + sc.nextInt();
                //System.out.print(S[i] + " ");
            }

            // 구간합 출력
            while( M-- > 0) {
                int k = sc.nextInt() -1;
                int j = sc.nextInt() -1;
                System.out.println(k == 0 ? S[j] : S[j] - S[k-1]);
            }
        }
    }
}
