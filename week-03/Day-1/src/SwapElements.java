import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SwapElements {
    public static void main(String[] args) {


        // - Create an array variable named `orders`
        //   with the following content: `["first", "second", "third"]`
        // - Swap the first and the third element of `orders`

        String[] orders = {"first", "second", "third"};
        List <String> ordersAList = Arrays.asList(orders);

        System.out.println(ordersAList);

        Collections.swap(ordersAList, 0,2);

        System.out.println(ordersAList);

    }
}
