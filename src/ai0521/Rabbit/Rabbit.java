package ai0521.Rabbit;

public class Rabbit {
    private String shape;
    private int xPos;
    private int yPos;

    public Rabbit() {
    }

    public Rabbit(String shape) {
        this.shape = shape;
    }

    public void setShape(String shape) {
        this.shape = shape;
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
}
