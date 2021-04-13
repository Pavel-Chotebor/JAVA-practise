package Animal;

public class Animal {

     int hunger;
     int thirst;

    public Animal () {
        hunger = 50;
        thirst= 50;
    }



    public void eat() {
        hunger = hunger - 1;
        System.out.println("actual value of hunger is: " + hunger);
    }


    public void drink () {
        thirst = thirst -1;
        System.out.println("actual value of thirst is: " + thirst);

    }

    public void play () {
        thirst = thirst + 1;
        hunger = hunger + 1;
        System.out.println("actual value of hunger is : " + hunger + " and thirst: " + thirst);

    }

}
