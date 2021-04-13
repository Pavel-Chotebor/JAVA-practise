package AircraftCarrier;

public class Aircraft {

    protected int maxAmmo;
    protected int actualAmmo;
    protected int baseDemage;
    protected boolean isPriority;
    protected int ammoToFill;
    protected int ammoToReturn = (ammoToFill - maxAmmo);
    protected int allDamage = actualAmmo * baseDemage;

    public Aircraft() {

    }

    public void fight() {
        System.out.println("damage: " + actualAmmo * baseDemage + "!");
        actualAmmo = 0;
    }

    public void refill (int ammoToFill) {
        if (ammoToFill > maxAmmo) {
            actualAmmo = maxAmmo;
            ammoToReturn = (ammoToFill - maxAmmo);
            System.out.println("Refilling... Ammo to return: " + (ammoToReturn) + ".");
        } else if (ammoToFill < maxAmmo) {
            actualAmmo = actualAmmo + ammoToFill;
            System.out.println("Refilling... No ammo to return");
        }
    }

    public boolean isPriority() {
        System.out.println(isPriority);
        return isPriority;
        }

    public void getType() {
        System.out.println("type: " + getClass().getSimpleName());
    }

    public int getActualAmmo() {
        return actualAmmo;
    }
}
