package homework4;

public class Sedan extends Car{
    public Sedan(String model, int maxSpeed, int yearOfManufacture) {
        super(model, maxSpeed, yearOfManufacture);
    }

    @Override
    public void run() {
        System.out.println("the Sedan starts");
    }

    @Override
    public void stop() {
        System.out.println("the Sedan stops");
    }
}
