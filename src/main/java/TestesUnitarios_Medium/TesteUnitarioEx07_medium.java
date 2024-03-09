package TestesUnitarios_Medium;

import easy.Exercicio02_easy;
import easy.Exercicio06_easy;
import easy.Exercicio07_easy;
import medium.Exericio07_08_medium;
import org.junit.Assert;
import org.junit.Test;

public class TesteUnitarioEx07_medium {
    String[] vetorEsperado = new String[]{"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};

    @Test
    public void TesteUnitarioEx07_medium() {
            Exericio07_08_medium  exericio07_08_medium =new Exericio07_08_medium();
            Assert.assertEquals(vetorEsperado,exericio07_08_medium.exibirMesesDoAno());

    }

}
