package Yrok_04_12_2023;

public class Truck extends Trasport {
    @Override
    void gas () {
        System.out.println("Truck has started");
    }

    void brake () {
        System.out.println("Truck has stopped");
    }
}
