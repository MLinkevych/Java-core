package homework4;

import java.util.Scanner;

public class carsMain {
    public static void main(String[] args) {

        Car[] car = new Car[4];

        car[0] = new Truck("Buick", 200, 2019);
        car[1] = new Truck("GM", 210, 2020);
        car[2] = new Sedan("Ford", 250, 2021);
        car[3] = new Sedan("Honda", 240, 2022);

        for (int i = 0; i < 4; i++) {
            System.out.println(car[i]);
        }
    }

}
