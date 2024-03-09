package easy;

public class Exercicio10_1_easy_comWhile {// incio classe

    public Double calcularInvestimentoJurosSimples(double valorInvestimento) {// inico main

        double taxaJuros = 0.12;
        int tempoInvestido = 10;
        double taxaJurosTotal = 0.0;

        for (int i = 1; i <= tempoInvestido; i++) {
            taxaJurosTotal = taxaJurosTotal + taxaJuros;
        }
        double valorTotal = (valorInvestimento * taxaJurosTotal) + valorInvestimento;

        return valorTotal;
    }// fim

    public Double calcularValorDeJuros(double valorTotal, double valorInvestimento){
        return (valorTotal - valorInvestimento);
    }

}// fim da classe
