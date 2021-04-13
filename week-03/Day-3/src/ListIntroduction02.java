import java.util.ArrayList;
import java.util.Arrays;

public class ListIntroduction02 {
    public static void main(String[] args) {

        //making a new list
        ArrayList <String> listA = new ArrayList<>();
        listA.add("Apple");
        listA.add("Avocado");
        listA.add("Blueberries");
        listA.add("Durian");
        listA.add("Lychee");

        //making another list
        ArrayList <String> listB = new ArrayList<>();


        //copying list
        listB.addAll(listA);



        // contains Durian?
        if (listA.contains("Durian")) {
            System.out.println("List A contains a Durian");
        }


        listB.remove("Durian");



        // adding new element to index 3

        listA.add(3,"Kiwifruit");


        //length comparison

        if (listA.size() > listB.size()) {
            System.out.println("List A is bigger");
        }
        else System.out.println("List B is bigger");


        //index of avocado
        System.out.println(listA.indexOf("Avocado"));

        // index of Durian
        System.out.println(listB.indexOf("Durian"));


        // adding more elements in single statement
        listB.addAll(Arrays.asList("Passion Fruit", "Pomelo"));


        //printing 3rd element
        System.out.println("3rd elements is: " + listA.get(2));

        System.out.println("List A: " + listA);
        System.out.println();
        System.out.println("List B: :"  +listB);

    }



}
