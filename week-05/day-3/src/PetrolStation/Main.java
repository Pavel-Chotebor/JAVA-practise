package PetrolStation;

import PetrolStation.Car;

public class Main {
    public static void main(String[] args) {

        Station station = new Station();
        Car car = new Car();

        station.refill(car);

        //Create Station and Car classes
        //Station
        //gasAmount
        //refill(car) -> decreases the gasAmount by the capacity of the car and increases the cars gasAmount
        //Car
        //gasAmount
        //capacity
        //create constructor for Car where:
        //initialize gasAmount -> 0
        //initialize capacity -> 100

    }
}
