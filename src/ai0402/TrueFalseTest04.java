package ai0402;

import java.util.Scanner;

public class TFTest04 {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        System.out.println("===== 운전면허 필기시험 합격여부 확인 =====");

        System.out.print("시험 점수를 입력하세요 : ");
        int score = s.nextInt();
        String result = "";         // empty String  문자열 초기화 할 때 주로 쓰임

        if(score >= 70)
            result = "합격";
        else
            result = "블합격";

        System.out.print(result);

        s.close();
    }
}
