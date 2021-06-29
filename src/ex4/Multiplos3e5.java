package ex4;

public class Multiplos3e5 {

    static final Integer TRES = 3;
    static final Integer CINCO = 5;
    
    public Long run(Integer limit) {

        long somax = 0;
        long somaz = 0;
        Long res;

        somax = soma(TRES, limit);
        somaz = soma(CINCO, limit);
        res = somax + somaz;
        return res;
    }

    private long soma(long value, int limit) {
        long total = 0;
        for(int i = 1; i < limit; i++) {
            if(i % value == 0) {
                total += i;
            }
        }
        return total;
    }
}
