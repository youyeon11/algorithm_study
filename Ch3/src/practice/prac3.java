package practice;

import java.util.Scanner;

public class prac3 {

    public static void main(String[] args) {
        // 첫번째 줄에  수의 개수 N, 합을 구해야하는 하는 횟수 M(M판)
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        int M = sc.nextInt();
        int[] S = new int[N];

        // N개의 수 입력받기
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
            if (i == 0) {
                S[i] = A[i];
            } else {
                S[i] = S[i-1] + A[i];
            }
        }

        // 구해야하는 k와 j가 주어진다
        for (int i = 0; i < M; i++) {
            int k = sc.nextInt();
            int j = sc.nextInt();
            if (k > j) {
                if (j == 1) {
                    System.out.println(S[k-1]);
                } else {
                    System.out.println(S[k-1] - S[j-2]);
                }
            } else {
                if (k == 1) {
                    System.out.println(S[j-1]);
                } else {
                    System.out.println(S[j-1] - S[k-2]);
                }
            }
        }
    }
}
