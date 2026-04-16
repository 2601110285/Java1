package ai0409;

import java.util.Scanner;

public class Average01 {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);

        System.out.println("===== 학점 입력값은 0 ~ 4.5 사이입니다. =====");

        System.out.print("프로그래밍언어실습(3) 학점을 입력하세요 : ");
        double a = s.nextDouble();
        System.out.print("웹프로그래밍기초(3) 학점을 입력하세요 : ");
        double b = s.nextDouble();
        System.out.print("프롬포트엔지니어링(2) 학점을 입력하세요 : ");
        double c = s.nextDouble();

        double average = (a*3+b*3+c*2)/(3+3+2);         // 학점이 달라서

        System.out.printf("평균 %.1f점입니다.", average);

        s.close();
    }
}
