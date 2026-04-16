package ai0409;

public class DataTypeTest {
    public static void main(String[] args) {
        // 1. 숫자형 : 정수형
        byte bt = -128;      // 범위 : -128 ~ 127 (범위 넘는 거 : 오버플로우 / 작으면 : 언더플로우)
        short st = 300;     // 범위 : -2^16 ~ 2^16-1
        st = bt;            // st 가 bt 를 포함하는 범위니까 가능, 반대 불가
        int it = st;
        System.out.println("it변수의 저장된 값: " + it);
        long lg = 70000000;

        // 1. 숫자형 : 실수형
        float f1 = 1000;
        f1 = lg;
        f1 = 1000.f;
        f1 = 1000.F;
        f1 = (float) 1000.0;

        double d1 = 20000;
        d1 = f1;
        d1 = bt;
        d1 = 207.999;

        // 2. 숫자가 아닌 자료형 : 문자형
        char c = 'A';
        System.out.println(c);
        System.out.println((int)c);
        System.out.println((char)(c+3));          // unicode 값을 연산할 수 있다.

        // 2. 숫자가 아닌 자료형 : 논리형
        boolean b = true;

        System.out.println(b);
        System.out.println(!b);

        System.out.println(bt == st);

    }
}
