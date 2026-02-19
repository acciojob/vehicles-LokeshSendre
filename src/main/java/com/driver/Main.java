package com.driver;

public class Main {
    public static void main(String[] args) {

        F1 mercedes = new F1("mercedes", false);
        mercedes.move(40, 0);
        mercedes.accelerate(20);
        mercedes.accelerate(-60);

        // FIXED
        Car ciaz = new Car("ciaz", 4, 5, 5, true, "sedan", 5);
        ciaz.changeGear(2);
        ciaz.changeSpeed(40, 45);

        Vehicle bus = new Vehicle("bus");
        bus.move(40, 20);
        bus.stop();

        // CORRECT WAY
        Boat boat = new Boat("boat", 5);
        System.out.println(boat.getVehicleName());
        System.out.println(boat.getVehicleCapacity());
    }
}
