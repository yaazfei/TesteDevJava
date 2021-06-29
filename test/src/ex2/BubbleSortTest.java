package ex2;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class BubbleSortTest {


    @Test
    public void test() {
        assertArrayEquals(new int[]{11, 12, 22, 25,34, 64, 90}, new BubbleSort().run(new int[]{64, 34, 25, 12, 22, 11, 90}));
    }
}
