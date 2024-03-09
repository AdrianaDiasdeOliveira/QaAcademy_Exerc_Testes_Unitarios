package TestesUnitarios_Easy;

import easy.Exercicio06_easy;
import easy.Exercicio09_easy;
import easy.Exercicio10_1_easy_comWhile;
import easy.Exercicio10_easy;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TesteUnitarioEx10 {

    Exercicio10_1_easy_comWhile exercicio101Easy;

    @Before
    public void before() {
        exercicio101Easy = new Exercicio10_1_easy_comWhile();
    }

    @Test
    public void testCalcularInvestimentoJurosSimples() {
        Assert.assertEquals("2200.0", exercicio101Easy.calcularInvestimentoJurosSimples(1000.00).toString());
    }


    @Test
    public void testCalcularValorInvestimento() {
        Double valorTotal = exercicio101Easy.calcularInvestimentoJurosSimples(1000.00);
        Double valorInvestimento = 1000.0;
        Assert.assertEquals("1200.0",exercicio101Easy.calcularValorDeJuros(valorTotal, valorInvestimento).toString());
    }

}