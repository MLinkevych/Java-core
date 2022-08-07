package homework4_1;

import java.util.ArrayList;

public class ColorsMain {
    public static void main(String[] args) {
        ArrayList<Point> line = new ArrayList<Point>();
        line.add(new Line(3,9));
        line.add(new Line(7,14));
        line.add(new ColorLine(6,8,"Blue"));
        line.add(new ColorLine(8,19,"Red"));

        for (Point i : line){
            System.out.println(line);

        }
    }
}
