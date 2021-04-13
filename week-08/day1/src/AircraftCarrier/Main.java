package AircraftCarrier;

import AircraftCarrier.Aircraft;
import AircraftCarrier.Carrier;
import AircraftCarrier.F16;
import AircraftCarrier.F35;

public class Main {
    public static void main(String[] args) {

        Aircraft f35 = new F35();
        Aircraft f16 = new F16();

        f35.refill(40);
        f16.refill(100);

        f35.fight();
        f16.fight();

        f16.getType();
        f35.getType();

        Carrier carrier = new Carrier(500, 100);
        Carrier carrier2 = new Carrier(150,20);

        carrier.add(f16);
        carrier.add(f35);

        //carrier.fill();  not ready

        carrier.fight(carrier2);

        carrier.getStatus();
        carrier2.getStatus();

    }
}
