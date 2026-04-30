package ai0430;

import java.util.Scanner;

public class ForTest3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("학생수를 입력하시오: ");
        int friends_num = s.nextInt();
        int fact = 1;

        for(int i = 1; i <= friends_num; i++) {
            fact = fact * i;
        }

        System.out.printf("%d명의 학생들을 순서대로 세우는 경우의 수 : %s", friends_num, fact);
    }
}
