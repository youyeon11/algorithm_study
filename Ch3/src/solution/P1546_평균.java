package solution;// 평균 구하기 답안

import java.util.Scanner;

public class P1546_평균 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 저장할 과목의 수
        int score[] = new int[N]; // 배열로 과목 점수 배열 저장
        for (int i = 0; i < N; i++){
            score[i] = sc.nextInt();
        }
        long sum = 0;
        long max =0; // 최고점을 구하기 위한 max의 인덱스
        for (int i = 0; i < N; i++){
            if (score[i] > max) {
                max = score[i]; // 최고점 갱신
            }
            sum = sum + score[i];
        }
        System.out.println(sum * 100.0 / max / N);
    }
}