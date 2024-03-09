package TestesUnitarios_Easy;

import easy.Exercicio05_easy;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TesteUnitarioEx05 {
    Exercicio05_easy exercicio05_easy = new Exercicio05_easy();
    @Before
    public void before(){
        Exercicio05_easy exercicio05_easy = new Exercicio05_easy();
    }
    @Test
    public void testcalcularSoma(){

       Assert.assertEquals("6",exercicio05_easy.calcularSoma(1,2,3).toString());

    }
    @Test
    public void calcularSubtracao() {

        Assert.assertEquals("0", exercicio05_easy.calcularSubtracao(2, 2, 2).toString());

    }
    @Test
    public void calcularMultiplicacao() {

        Assert.assertEquals("6", exercicio05_easy.calcularMultiplicacao(1, 2, 3).toString());

    }

    @Test
    public void calcularMedia() {

        Assert.assertEquals("5", exercicio05_easy.calcularMedia(5, 5, 5).toString());

    }

    }
