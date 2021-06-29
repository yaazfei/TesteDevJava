package ex1;

public class VotoEleitores {

    public double calcularPercentualVotosValidosTotais(Long total, Long votosValidos) {

        double percentual = votosValidos * 100 / total;
        return percentual;
    }

    public double calcularPercentualVotosBranco(Long total, Long votosBranco) {

        double percentual = votosBranco * 100 / total;
        return percentual;
    }

    public double calcularPercentualVotosNulo(Long total, Long votosNulo) {

        double percentual = votosNulo * 100 / total;
        return percentual;
    }
}
