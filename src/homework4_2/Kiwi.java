package homework4_2;

public class Kiwi extends NonFlyingBird {
    public Kiwi(String feathers, String layEggs) {
        super(feathers, layEggs);
    }
    public String toString(){
        return "Kiwi : " + getFeathers() + "," + getLayEggs();
    }
    @Override
    public void fly() {
        System.out.println();;

    }
}
