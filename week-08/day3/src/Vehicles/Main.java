package Vehicles;

import Vehicles.Helicopter;

public class Main {

    public static void main(String[] args) {

        Helicopter helicopter = new Helicopter(200,9000000, 60);

        helicopter.fly();
        helicopter.land();
        helicopter.takeOff();

    }
}
