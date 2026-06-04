package ai0604.inheritance;

public class RunRabbit {
    public static void main(String[] args) {
        HouseRabbit hr1 = new HouseRabbit();
        hr1.shape = "동그라미";
        hr1.setLocation(30, 50);
        hr1.rightMoveTen();
        hr1.printInfo();
        hr1.masterName = "폴리";
        hr1.eatFeed("아주 좋은");

        MountainRabbit mr1 = new MountainRabbit();
        hr1.shape = "하트";
        hr1.setLocation(100, 80);
        hr1.rightMoveTen();
        hr1.printInfo();
        hr1.masterName = "보리";
        hr1.eatFeed("검은콩");
    }
}
