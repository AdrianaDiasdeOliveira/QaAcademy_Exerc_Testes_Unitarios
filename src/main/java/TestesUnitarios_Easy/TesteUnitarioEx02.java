package TestesUnitarios_Easy;

import easy.Exercicio02_easy;
import org.junit.Assert;
import org.junit.Test;

public class TesteUnitarioEx02 {

    @Test
    public void testePalavraDigitada() {
        Exercicio02_easy exercicio02_easy = new Exercicio02_easy();
        String palavraDigitada ="TesteUnitario";
        Assert.assertEquals("Você Digitou:" + palavraDigitada,exercicio02_easy.exibirPalavra(palavraDigitada));



    }
}
