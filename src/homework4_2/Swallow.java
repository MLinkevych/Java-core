package homework4_2;

public class Swallow extends FlyingBird{
    public Swallow(String feathers, String layEggs) {
        super(feathers, layEggs);
    }
    public String toString(){
        return "Swallow : " + getFeathers() + "," + getLayEggs();
    }
    @Override
    public void fly() {
        System.out.println();;

    }
}
