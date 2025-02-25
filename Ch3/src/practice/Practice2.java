package practice;// 평균 구하기
// 받은 점수 중 최고 점수 : M
// 모든 점수를 점수/M*100으로 수정(점수 갱신)
// 수정한 점수로의 평균 구하기

import java.util.Scanner;

public class Practice2 {

    public static void main(String[] args) {
        // 변수 N에 과목의 수 입력받기
        System.out.print("과목의 수를 입력하세요: ");
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.println();

        // 길이가 N인 1차원 배열 A[] 선언하기
        int[] scores = new int[N];

        // 점수 저장을 위한 반복문 작성
        for (int i = 0; i < scores.length; i++) {
            System.out.print(i + "번째 과목의 점수를 입력하세요.: ");
            scores[i] = sc.nextInt();
        }
        System.out.println();

        int sum = 0;
        int max = 0;

        for (int i = 0; i < scores.length; i++) {
            max = Math.max(scores[i], max);
            sum += scores[i];
        }
        System.out.println("수정된 평균 값은 " + sum*100/max/N + "점 입니다.");

    }
}