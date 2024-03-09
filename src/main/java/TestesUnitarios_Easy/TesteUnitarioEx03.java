package TestesUnitarios_Easy;

import easy.Exercicio03_easy;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TesteUnitarioEx03 {

    @Test
        public void testTrocaValoresDigitados() {

        Exercicio03_easy exercicio03_easy = new Exercicio03_easy();

       String msgTrocada = exercicio03_easy.trocaValoresDigitados("1", "3");
        Assert.assertEquals("Primeiro valor : 3 | Segundo valor: 1", msgTrocada);


    }
}
