package homework4_1;

public class ColorLine extends Line{
    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = String.valueOf(color);
    }

    @Override
    public int getX() {
        return super.getX();
    }

    @Override
    public int getY() {
        return super.getY();
    }

    public ColorLine(int x, int y, String color) {
        super(x, y);

    }

    public String toString(){
        return String.format("Line coordinates are x = %d, y = %d and x = %d, y = %d, and the color is - ",
                getX(), getY(),getX(), getY(), getColor());
    }
    public void print(){
        System.out.println();
    }
}
