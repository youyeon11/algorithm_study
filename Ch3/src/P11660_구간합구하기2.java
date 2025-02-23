// 구간합구하기2 답안

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P11660_구간합구하기2 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int A[][] = new int[N + 1][N + 1]; // N+1로 지정해줘야하는 것 주의하기!!

        for (int i = 1; i <= N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 1; j <= N; j++) {
                A[i][j] = Integer.parseInt(st.nextToken());
            }
        } // 여기까지는 N+1 구조로 세우지 않았던 점만 제외하면 내가 만든 방식과 동일!
        // 이렇게 입력으로 받아들일 때에는 BufferedReader와 StringTokenizer의 형식을 사용하는 것이 편함

        // 답안에서 사용한 방식: 구간합을 구하기 위한 행렬 따로 생성!
        int D[][] = new int[N + 1][N + 1]; // 새로운 행렬 추가 -> 구간합으로만 이루어진 행렬 새로 추가
        for (int i = 1; i <= N; i++) { // D는 입력받아서 생성하는 것이 아니므로 st 사용안해도됨
            for (int j = 1; j <= N; j++) {
                // 구간합 공식을 이용하기
                D[i][j] = D[i][j - 1] + D[i - 1][j] - D[i - 1][j - 1] + A[i][j];
            }
        }


        for (int i = 0; i < M; i++) { // 질의 수만큼 입력받음
            st = new StringTokenizer(br.readLine());
            // 다음으로 입력받는 한 줄 : x1, y1, x2, y2
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());

            int result = D[x2][y2] - D[x1 - 1][y2] - D[x2][y1 - 1] + D[x1 - 1] D[y1 - 1];
            System.out.println(result);
        }

    }
}