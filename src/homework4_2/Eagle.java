package homework4_2;

public class Eagle extends FlyingBird{
    public Eagle(String feathers, String layEggs) {
        super(feathers, layEggs);
    }
    public String toString(){
        return "Eagle : " + getFeathers() + "," + getLayEggs();
    }
    @Override
    public void fly() {
        System.out.println();;

    }
}
