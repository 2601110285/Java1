package ai0402;

import java.util.Scanner;

public class CalculatorTest01 {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);

        System.out.print("정수1 입력 ==> ");
        int num1 = s.nextInt();

        System.out.print("정수2 입력 ==> ");
        int num2 = s.nextInt();

        System.out.printf("%d + %d = %d\n", num1, num2, num1 + num2);
        System.out.printf("%d - %d = %d\n", num1, num2, num1 - num2);
        System.out.printf("%d × %d = %d\n", num1, num2, num1 * num2);
        System.out.printf("%d ÷ %d = %.2f\n", num1, num2, (double)num1/num2);
        System.out.printf("%d %% %d = %d\n", num1, num2, num1 % num2);

        System.out.print("파운드 입력(lb) ==> ");
        double lb = s.nextDouble();
        System.out.print("킬로그램(kg) 입력 ==> ");
        double kg = s.nextDouble();

        System.out.printf(lb + "파운드(lb)는 %.3f킬로그램(kg)입니다.\n",lb*0.453592);
        System.out.printf(kg + "킬로그램(kg)은 %.3f파운드(lb)입니다.\n",kg*2.204623);

        int a = 1, b = 2;
        int result = a++ + b*3;
        System.out.print(result);

        int a1 = 2, b1 = 2;
        int result2 = ++a + b*3;
        System.out.print(result2);

        s.close();
    }
}
