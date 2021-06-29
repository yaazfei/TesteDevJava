package ex3;

import java.util.stream.LongStream;

public class Fatorial {

    public long run(Integer n) {
        return LongStream.rangeClosed(1, n)
                .reduce(1, (long x, long y) -> x * y);

    }
}
