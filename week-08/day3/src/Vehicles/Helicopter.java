package Vehicles;

import Vehicles.Flyable;

public class Helicopter extends Vehicle implements Flyable {


    public Helicopter(int speed, int price, int consumption) {
        super(speed, price, consumption);
    }

    @Override
    public void fly () {
        System.out.println("flying");
    }


    @Override
    public void land () {
        System.out.println("landing");
    }


    @Override
    public void takeOff () {
        System.out.println(("take off"));
    }
}
