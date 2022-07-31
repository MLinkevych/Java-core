package homework4_1;

public abstract class Point {
    private int x;
    private int y;

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public String toString(){
        return String.format("x = %d and y = %d", x, y);
    }
    public void print(){
        System.out.println(this);
    }
}
