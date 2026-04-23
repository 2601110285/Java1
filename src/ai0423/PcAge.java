package ai0423;

import java.util.Scanner;

public class PcAge {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("나이를 입력하시오: ");
        int age = s.nextInt();

        if(age > 19)
            System.out.println("10시 이후 Pc방 사용이 가능합니다.");
        else
            System.out.println("10시 이후 Pc방 사용이 불가능합니다.");

        s.close();
    }
}
