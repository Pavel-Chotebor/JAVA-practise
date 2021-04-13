import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class NumberConverterTest {


    @Test
    public void convertMethodShouldConvertNumbertToSting() {
        assertEquals("Ninety Nine", NumberConverter.convert(99));
    }
}


