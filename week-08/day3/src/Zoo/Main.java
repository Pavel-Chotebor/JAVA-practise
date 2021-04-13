package Zoo;

public class Main {

    public static void main(String[] args) {

        Bird bird1 = new Bird("Parrot");
        Mammal mammal1 = new Mammal("Koala");

        System.out.println("How do you breed?");
        System.out.println("A " + bird1.getName() + " is breeding by " + bird1.breed());
        System.out.println("A " + mammal1.getName() + " is breeding by " + mammal1.breed());

    }
}

