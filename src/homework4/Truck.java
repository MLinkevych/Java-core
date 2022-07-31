package homework4;

public class Truck extends Car{


    public Truck(String model, int maxSpeed, int yearOfManufacture) {
        super(model, maxSpeed, yearOfManufacture);
    }

    @Override
    public void run() {
        System.out.println("the Truck starts");

    }

    @Override
    public void stop() {
        System.out.println("the Truck stops");
    }
}
