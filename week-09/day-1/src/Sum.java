import java.util.ArrayList;

public class Sum {

    int sumTemp;

    public static int sumOfElements (ArrayList<Integer> list) {
        int sumTemp = 0;
        for (int i = 0; i < list.size(); i++) {
            sumTemp += list.get(i);
        }return sumTemp;
    }
}