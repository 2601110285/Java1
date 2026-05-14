package ai0514;

import java.util.Scanner;

public class whileTest02 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int sum = 0;
        int num1, num2;

//        사용자의 첫번째 정수 입렵 값이 -1이면 프로그램을 종료
        while (true){
            System.out.print("숫자1 ==> ");
            num1 = s.nextInt();
            if(num1 == -1)
                break;

            System.out.print("숫자2 ==> ");
            num2 = s.nextInt();

            sum = num1 + num2;
            System.out.printf("%d + %d = %d\n", num1, num2, sum);
        }

        s.close();
    }
}
