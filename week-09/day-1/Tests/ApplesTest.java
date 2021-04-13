import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ApplesTest {

    Apples apple = new Apples();

    @Before
    public void setup() {
        apple = new Apples();
    }

    @Test
    public void getAppleShouldReturnStringApple() {
        assertEquals("apple", apple.getApple());
    }

   /*
    @Test
    public void getAppleWithDifferentStringShouldNotWork () {
        assertEquals("applee", apple.getApple());
    }
    */

    @Test
    public void getAppleWithDifferentStringShouldItIsNotEqual () {
        assertNotEquals("applee", apple.getApple());
    }
}