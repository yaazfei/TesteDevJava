package ex1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VotosEleitoresTest {

    @Test
    public void test(){

        assertEquals(80.0, new VotoEleitores().calcularPercentualVotosValidosTotais(1000L, 800L), 0);
        assertEquals(15.0, new VotoEleitores().calcularPercentualVotosBranco(1000L, 150L), 0);
        assertEquals(5.0, new VotoEleitores().calcularPercentualVotosNulo(1000L, 50L), 0);
    }
}
