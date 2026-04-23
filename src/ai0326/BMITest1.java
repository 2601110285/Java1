package ai0326;

import java.util.Scanner;

public class BMITest1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Scanner s1 = new Scanner(System.in);
        System.out.println("===== BMI 계산 =====\n");

        System.out.print("* 성명을 입력하시오. ");
        String name = s1.nextLine();

        System.out.print("* 체중(kg)를 입력하시오. ");
        double weight = s.nextDouble();

        System.out.print("* 키(cm)를 입력하시오. ");
        double height = s.nextDouble();

        double bmi = weight/Math.pow((height/100),2);           // ((height/100)*(height)/100)

        System.out.printf(("\n")+"%s님의 BMI 지수는 %.2f ㎏/㎡ 입니다.",name ,bmi);

        s.close();
        s1.close();
    }
}
