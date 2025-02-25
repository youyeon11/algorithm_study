package solution;

import java.util.Scanner;

public class P11720_숫자의합 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // 길이 고정을 위한
        // 입력값 N을 String 형태로 저장
        String sNum = sc.next();
        char[] cNum = sNum.toCharArray(); // 받은 문자열을 하나하나 문자의 배열로 변형
        int sum = 0;
        for (int i = 0; i < cNum.length; i++) {
            sum += cNum[i] -'0'; // cNum[i]를 정수형으로 변환하면서 sum에 대하여 합을 누적
        }
        System.out.println(sum);
    }
}
