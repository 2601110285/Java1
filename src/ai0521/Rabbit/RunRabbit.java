package ai0521.Rabbit;

public class RunRabbit {
    public static void main(String[] args) {
        Rabbit rabbit1 = new Rabbit();
        Rabbit rabbit2 = new Rabbit("좁은 네모");

        rabbit1.setLocation(50, 50);
        rabbit2.setLocation(150, 70);

        rabbit1.setShape("기본");
        rabbit1.printInfo();
        rabbit2.printInfo();

//        기본 모양의 토끼를 다이아몬드 모양의 토끼로 변경, 위치는 현재 x좌표에서 오른쪽으로 60 이동, y좌표는 아래쪽으로 20 이동한 후 출력
        rabbit1.setShape("다이아몬드");
        rabbit1.setXPos(rabbit1.getXPos() + 60);
        rabbit1.setYPos(rabbit1.getYPos() + 20);

        rabbit1.printInfo();

//        좀은 네모 모양의 토끼가 현재 위치에서 오른쪽으로 50만큼, 왼쪽으로 20만큼 이동
        System.out.print("현재는 ");
        rabbit2.printInfo();        // 좁은 네모 모양 토끼의 현재 위치 출력
        for (int i = 0; i < 5; i++) {
            rabbit2.rightMoveTen();         // 10씩 오른쪽으로 5번 이동
        }
        rabbit2.printInfo();
        for (int i = 0; i < 2; i++) {
            rabbit2.leftMoveTen();          // 10씩 왼쪽으로 2번 이동
        }
        rabbit2.printInfo();
    }
}
