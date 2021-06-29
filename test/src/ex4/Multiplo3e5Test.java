package ex4;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Multiplo3e5Test {

    @Test
    public void test() {
        assertEquals(23L, new Multiplos3e5().run(10), 0);
    }
}
