package homework4_2;

public class Penguin extends NonFlyingBird{

    public Penguin(String feathers, String layEggs) {
        super(feathers, layEggs);
    }
    public String toString(){
        return "Penguin : " + getFeathers() + "," + getLayEggs();
    }
    @Override
    public void fly() {
        System.out.println();;

    }
}
