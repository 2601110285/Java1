package ai0521.Rabbit;

public class Rabbit {
    private String shape;
    private int xPos;
    private int yPos;

//    JVM은 클래스 내에 생성자가 하나도 없는 경우 기본생성자를 만들어서 사용한다.
//    그러나 클래스 내에 생성자가 선언 되어 있다면 선언된 생성자만 사용할 수 있다.
    public Rabbit() {
    }

    public Rabbit(String shape) {
        this.shape = shape;
    }

//    getter(필드값 변환), setter(필드값 설정)
    public void setShape(String shape) {
        this.shape = shape;         // 같은 이름 다른 쉐입
    }

    public void setXPos(int xPos) {
        this.xPos = xPos;
    }

    public void setYPos(int yPos) {
        this.yPos = yPos;
    }

    public String getShape() {
        return shape;
    }

    public int getXPos() {
        return xPos;
    }

    public int getYPos() {
        return yPos;
    }

//    토끼의 좌표(위치)값을 설정하는 매소드 구현
    public void setLocation(int xPos, int yPos){
        this.xPos = xPos;
        this.yPos = yPos;
    }

//    토끼의 모양, 위치 출력 매소드
    public void printInfo(){
        System.out.printf("%s 모양의 토끼는(%d, %d) 좌표에 위치하고 있다.\n", shape, xPos, yPos);
    }

//    x축으로 10씩 오른쪽으로 이동하는 매소드
    public void rightMoveTen(){
        xPos += 10 ;
    }

//    x축으로 10씩 왼쪽으로 이동하는 매소드
    public void leftMoveTen(){
        xPos -= 10;
    }
}
