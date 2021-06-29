package ex3;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class FatorialTest {

    @Test
    public void tests() {
        assertEquals(1L, new Fatorial().run(0));
        assertEquals(1L, new Fatorial().run(1));
        assertEquals(2L, new Fatorial().run(2));
        assertEquals(6L, new Fatorial().run(3));
        assertEquals(120L, new Fatorial().run(5));
        assertEquals(720L, new Fatorial().run(6));
    }
}
