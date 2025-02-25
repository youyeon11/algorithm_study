package practice;// 구간 합 구하기2
// 연습문제 004
// N*N개의 수가 N*N 크기의 표에 채워져 있을 때, 표에 채워져있는 수와 합을 구하는 연산 처리 프로그램


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Prac4 {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int quizNo = sc.nextInt();
        int[][] A = new int[N+1][N+1];

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                A[i][j] = sc.nextInt();
            }
        }

        // 합 배열 채우기
        int[][] D = new int[N+1][N+1];
        D[1][1] = A[1][1];
        for (int i = 1; i <= N; i++) {
            D[i][1] = D[i-1][1] + A[i][1];
        }
        for (int i = 1; i <= N; i++) {
            D[1][i] = D[1][i-1] + A[1][i];
        }
        for (int i = 2; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                D[i][j] = D[i-1][j] + D[i][j-1] - D[i-1][j-1] + A[i][j];
            }
        }

//        for (int i = 1; i <= N; i++) {
//            for (int j = 1; j <= N; j++) {
//                System.out.print(D[i][j] + " ");
//            }
//            System.out.println();
//        }

        // 입력
        while (quizNo-- > 0) {
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();

            System.out.println(D[x2][y2] - D[x2][y1-1] - D[x1-1][y2] + D[x1-1][y1-1] );
        }
    }
}