import java.util.ArrayList;

public class ListIntroduction01 {
    public static void main(String[] args) {


        ArrayList<String> names = new ArrayList<>();

        names.add("William");
        names.add("John");
        names.add("Amanda");

        //printing names in list
        for (String i : names) {
            System.out.println(i);
        }


        //printing number of emelents?
        System.out.println("size of array list: " + names.size());


        //printing 3rd element:
        System.out.println(names.get(2));


        //remove 2th element:
        names.remove(1);


        //remove all elements

        //names.clear();

        //System.out.println(names);


        /* zjistit jak vytvorit 1.
                                2.

          a jak zobrazit elementy pozpátku
        */


        }
    }

