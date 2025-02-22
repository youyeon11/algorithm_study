// 구간 합 구하기2
// 연습문제 004
// N*N개의 수가 N*N 크기의 표에 채워져 있을 때, 표에 채워져있는 수와 합을 구하는 연산 처리 프로그램


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Practice4 {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        // 첫번째 입력: N, M
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        System.out.println();

        int[][] matrix = new int[N][N];
        // 그 다음 줄 : NxN 구조의 행렬 입력받음
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                matrix[i][j] = Integer.parseInt(br.readLine());
            }
        }

        // 그 다음 줄 : M번의 구간합 구하라는 질의를 받음
        for (int i = 0; i < M; i++){
            st = new StringTokenizer(br.readLine());

        }
    }
}