package ex1;

public class Main {

    public static void main(String args[]) {
        VotoEleitores votoEleitores = new VotoEleitores();
        System.out.println("Votos totais: " + votoEleitores.calcularPercentualVotosValidosTotais(1000L, 800L) + "%");
        System.out.println("Votos branco: " + votoEleitores.calcularPercentualVotosValidosTotais(1000L, 150L) + "%");
        System.out.println("Votos nulo: " + votoEleitores.calcularPercentualVotosValidosTotais(1000L, 50L) + "%");
    }
}
