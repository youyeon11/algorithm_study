// 구간 합 구하기 답안

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P11659_구간합구하기 {

    public static void main(String[] args) throws IOException { // BufferedReader의 readLine 메소드를 사용할 것이기 때문에 예외처리


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // Scanner와 유사한 BufferedReader를 사용
        StringTokenizer st = new StringTokenizer(br.readLine()); // readLine() 메소드를 사용하는 방법: st = ... 이런식으로 읽을 줄에 대하여 입력

        // BufferedReader를 사용하였으니 enter가 아닌 space로 token됨 (readline 참고)
        int suNo = Integer.parseInt(st.nextToken()); // 입력 받은 것 중 수 개수
        int quizNo = Integer.parseInt(st.nextToken()); // 입력 받은 것 중 질의 개수
        // 한 줄에서 Integer를 찾음! space 단위로 token
        long[] S = new long[suNo + 1]; // 배열 생성
        st = new StringTokenizer(br.readLine()); // 새로 줄을 입력받음

        for (int i = 1; i <= suNo; i++){
            S[i] = S[i-1] + Integer.parseInt(st.nextToken());
        } // 한 줄에서 넣을 데이터들 구해서 입력

        for (int q = 0; q <quizNo; q++){ // 여기서 q는 질의 개수로, 즉 구간합 구하기를 몇 번 할 것인지에 대한 수
            st = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());
            System.out.println(S[j] - S[i-1]); // 구간합을 구하는 공식을 이용하여 구함
        }
    }
}