package AircraftCarrier;

import java.util.ArrayList;

public class Carrier {

    ArrayList <Aircraft> aircrafts = new ArrayList<>();
    int storedAmmo;
    int healthPoint;
    int refillAmount = 70;
    int totalDamage;


    public Carrier (int storedAmmo, int healthPoint) {
        this.storedAmmo = storedAmmo;
        this.healthPoint = healthPoint;

    }

    public void add (Aircraft aircraft) {
        aircrafts.add(aircraft);
    }

    /* not ready:

    public void fill () {
        if (storedAmmo > refillAmount) {
            for (Aircraft aircraft : aircrafts) {
                aircraft.refill(refillAmount);
                this.storedAmmo = storedAmmo - refillAmount;
            }
        } else if (refillAmount > storedAmmo) {
            for (Aircraft aircraft : aircrafts) {
                if (aircraft.isPriority()) {
                    aircraft.refill(storedAmmo);
                    this.storedAmmo = storedAmmo - refillAmount;
                    System.out.println(aircraft.ammoToReturn);
                }
                for ( Aircraft aircraft1 : aircrafts) {
                    if (!aircraft1.isPriority()) {
                        aircraft1.refill(aircraft1.ammoToReturn);
                        this.storedAmmo = storedAmmo - aircraft1.ammoToReturn;
                    }
                }
            }
        }
    }
*/

    public void fight (Carrier carrier) {
        for (Aircraft aircraft : aircrafts) {
            carrier.healthPoint =  carrier.healthPoint - aircraft.getActualAmmo();
            System.out.println(carrier.healthPoint);
        }
        if (carrier.healthPoint == 0) {
            System.out.println("It's dead Jim");
        }
    }


    public void getStatus () {

        System.out.println("HP: " + this.healthPoint + ", Aircraft count: " + this.aircrafts.size() + " Ammo Storage: " + this.storedAmmo  + " Total damage: ");
        System.out.println("Aircrafts:");
        for (Aircraft aircraft : aircrafts) {
            System.out.println( aircraft.getClass().getSimpleName() + " Ammo: " + aircraft.actualAmmo + "," + " base damage: "+ aircraft.baseDemage + ", all damage: " + aircraft.allDamage);

        }
    }
}
