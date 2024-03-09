package medium;

public class Exercicio04_medium {
    public int[] multiplicaAteMilIteracoes() {

        int[] vetorMultiplicaAteMil = new int[1000];


        int multiplicacao = 1;

        for (int i = 1; i <= 1000; i++) {
            multiplicacao = i * multiplicacao;
            System.out.println(i +" X " + multiplicacao +" = " +multiplicacao);
            vetorMultiplicaAteMil[i-1] = multiplicacao;
            if (multiplicacao >= 1000) {
                multiplicacao = 1;
                vetorMultiplicaAteMil[i-1] = multiplicacao;
            }
        }

        System.out.println("Fim das multiplicações");
        return vetorMultiplicaAteMil;
    }
}