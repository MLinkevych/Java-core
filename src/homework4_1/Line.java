package homework4_1;

public class Line extends Point{

    public Line() {
        super();
    }

    public Line(int x, int y) {
        super(x, y);
    }

    @Override
    public int getX() {
        return super.getX();
    }

    @Override
    public int getY() {
        return super.getY();
    }

     public String toString(){
            return String.format("Line %d, %d", getX(), getY());
    }
    public void print(){
        System.out.println();
    }

}
