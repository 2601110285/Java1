package ai0514;

import java.util.Random;
import java.util.Scanner;

public class numberGame {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int i = 1;
        int num1 = 0;
        int num2 = 0;

        Random random = new Random();

        while (true){
            num2 = random.nextInt(5) + 1;
            System.out.println("게임 " + i + "회: 컴퓨터가 생각한 숫자는 무엇을까요?");
            num1 = s.nextInt();

            if(num1 == num2) {
                System.out.println("오 정답입니다^^");
                break;
            }

            System.out.println("아쉽네요 " + num2 + "이었는데.. 다시 도전해보세요.");
            i++;
        }
        System.out.println("게임을 종료합니다.");
        s.close();
    }
}
