package ai0402;

public class CalculatorTest03 {
    public static void main(String[] args) {
        int canCoffeeBuy = 500;
        int TriangularKimbapBuy = 900;
        int bananaMilkBuy = 800;
        int boxLunchBuy = 3500;
        int colaBUy = 700;
        int snackBuy = 1000;

        int canCoffeeSell = 500;
        int TriangularKimbapSell = 900;
        int bananaMilkSell = 800;
        int boxLunchSell = 3500;
        int colaBuySell = 700;
        int snackBuySell = 1000;

        int total = 0;
        total -= 900 * 10;
        total += 1800 * 2;
        total -= 3500 * 5;
        total += 4000 * 4;
        total += 1500;
        total += 2000 * 4;
        total += 1800 * 5;

        System.out.println("편의점의 총 매출액: " + total + "원");
    }
}
