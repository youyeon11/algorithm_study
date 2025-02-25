package practice;

import java.util.Scanner;

public class Practice5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 입력 받기
        int N = sc.nextInt();
        int M = sc.nextInt();
        long[] prefixMod = new long[M]; // 나머지 카운트 배열
        long sum = 0, ans = 0;

        // 누적 합 계산 및 나머지 카운트
        for (int i = 0; i < N; i++) {
            sum += sc.nextInt();  // 누적합 계산
            int mod = (int) (sum % M);
            if (mod == 0) ans++;  // 0부터 i까지의 구간이 M으로 나누어 떨어지는 경우
            prefixMod[mod]++;  // 해당 나머지 개수 증가
        }

        // (나머지가 같은 두 구간을 조합하여 만들 수 있는 경우의 수)
        for (int i = 0; i < M; i++) {
            if (prefixMod[i] > 1) {
                ans += (prefixMod[i] * (prefixMod[i] - 1)) / 2;  // 조합 공식 nC2 = n(n-1)/2
            }
        }

        System.out.println(ans);
        sc.close();
    }
}
