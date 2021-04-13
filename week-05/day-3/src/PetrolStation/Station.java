package PetrolStation;

import PetrolStation.Car;

public class Station {

    int gasAmountInStation;


    public Station () {
        gasAmountInStation = 1000;

    }

    public void refill (Car car) {

        gasAmountInStation = gasAmountInStation - car.capacity;
        car.gasAmount = car.capacity - car.gasAmount;

        System.out.println("You just reffiled your car! Amount of gas is now: " + car.gasAmount );
    }
}
