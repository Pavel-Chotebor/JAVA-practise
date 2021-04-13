package FleetOfThings;

public class FleetOfThings {

    public static void main(String[] args) {
        Fleet fleet = new Fleet();
        // - You have the `Thing` class
        // - You have the `Fleet` class
        // - You have the `FleetOfThings` class with a `main` method
        // - Download those, use those
        // - In the main method create a fleet
        // - Achieve this output:
        // Create a fleet of things to have this output:
        // 1. [ ] Get milk
        // 2. [ ] Remove the obstacles
        // 3. [x] Stand up
        // 4. [x] Eat lunch


        Fleet fleet1 = new Fleet();


        fleet1.add(new Thing("get milk"));
        fleet1.add(new Thing("remove obstacles"));
        fleet1.add(new Thing("Stand up"));
        fleet1.add( new Thing("Eat lunch"));




       System.out.println(fleet1);

    }
}