import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class SumTest {

    Sum sum;
    ArrayList<Integer> list;


    @Before
    public void setup() {
        sum = new Sum();
        list = new ArrayList<>();
    }


    @Test
    public void sumOfElementsShouldReturnSumOfEachElement() {
        list.add(2);
        list.add(3);
        assertEquals(5, sum.sumOfElements(list));
    }

    @Test
    public void sumOfElementWhileListIsEmpty () {
        assertEquals(0,sum.sumOfElements(list));
    }

    @Test
    public void sumOfElementsWhileListHaveOnlyOneVarialbe () {
        list.add(4);
        assertEquals(4, sum.sumOfElements(list));
    }

    @Test(expected = NullPointerException.class)
    public void sumOfElementsWithNull () {
        list.add(null);
        assertEquals(0, sum.sumOfElements(list));
    }
}