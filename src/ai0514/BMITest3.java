package ai0514;

import java.util.Scanner;

public class BMITest3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Scanner s1 = new Scanner(System.in);
        System.out.println("===== BMI 계산 =====\n");

        while(true) {
            System.out.print("* 체중(kg)를 입력하시오. ");
            double weight = s.nextDouble();

            System.out.print("* 키(cm)를 입력하시오. ");
            double height = s.nextDouble();

            System.out.print("* 성명을 입력하시오. ");
            String name = s1.nextLine();
            if(name.equals("exit"))
                break;

            double bmi = weight / Math.pow((height / 100), 2);           // ((height/100)*(height)/100)
            String result;

            if (bmi < 18.5)
                result = "저체중";
            else if (bmi <= 22.9)
                result = "정상";
            else if (bmi <= 24.9)
                result = "과체중";
            else if (bmi <= 29.9)
                result = "비만";
            else if (bmi <= 34.9)
                result = "고도비만";
            else
                result = "초고도비만";


            System.out.println("\n" + name + "님의 BMI 지수는 " + bmi + "㎏/㎡로 " + result + "입니다.");
        }
        s.close();
        s1.close();
    }
}
