package TestesUnitarios_Easy;

import easy.Exercicio03_easy;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TesteUnitarioEx03 {
    @Test
    public void testTrocaValoresDigitados() {
        Exercicio03_easy exercicio03_easy = new Exercicio03_easy();

        String mensagemEsperada = "Primeiro valor Digitado: segundoValor\nSegundo Valor digitado:primeiroValor";
        String mensagemAtual = exercicio03_easy.trocaValoresDigitados("primeiroValor", "segundoValor");
        Assert.assertEquals(mensagemEsperada,exercicio03_easy.trocaValoresDigitados(mensagemAtual));
        Assert.assertEquals(mensagemEsperada,exercicio03_easy.trocaValoresDigitados(mensagemAtual));

    }
}
