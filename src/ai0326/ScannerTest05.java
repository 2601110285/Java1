package ai0326;

import java.util.Scanner;

public class ScannerTest05 {
    public static void main(String[] args) {
        System.out.println("===== 택배 보내기입니다. 다음을 각각 입력하세요 =====");
        Scanner s1 = new Scanner(System.in);        // 문자열 입력용
        Scanner s2 = new Scanner(System.in);        // 숫자 입력용

        System.out.print("받는 사람 :  ");
        String name = s1.nextLine();

        System.out.print("주소 :  ");
        String address = s1.nextLine();

        System.out.print("무게(g) :  ");
        int weight = s2.nextInt();

        System.out.printf("** 받는 사람 ==> %s \n",name);
        System.out.printf("** 주소 ==> %s \n",address);
        System.out.printf("** 배송비 ==> %d 원",weight*5);

        s1.close();
        s2.close();
    }
}
