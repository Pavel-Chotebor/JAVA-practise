import java.util.HashMap;

public class MapIntroduction01 {

    public static void main(String[] args) {

        HashMap <Integer, String> hm = new HashMap <Integer, String>();

        hm.put(97,"a");
        hm.put(98,"b");
        hm.put(99,"c");
        hm.put(65,"A");
        hm.put(66,"B");
        hm.put(67,"C");


        //printing a table

       for (Integer key: hm.keySet())
           System.out.println(key + ":" + hm.get(key));

       //add new value and key

       hm.put(68,"D");


        // size of value:

        System.out.println("Size of values: " + hm.size());

        // printing value associated to key 99:


        System.out.println("Value associated with key 99: " + hm.get(99));


        //remove

        hm.remove(97);


        System.out.println("Any value associated with key 100?: " + hm.get(100));

        hm.clear();





    }

}
