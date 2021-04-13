package Count;

import Count.Count;

public class Main {

    public static void main(String[] args) {

        Count count1 = new Count();
        Count count2 = new Count(10);


        count1.add();
        count1.add(5);
        count1.get();

        count2.add();
        count2.add(8);
        count2.get();

        count2.reset();
        count2.get();


    }

}
