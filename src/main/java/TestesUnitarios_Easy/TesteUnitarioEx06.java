package TestesUnitarios_Easy;

import easy.Exercicio06_easy;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TesteUnitarioEx06 {

@Test
    public void TestverificarAprovacaoAluno(){
    Exercicio06_easy exercicio06Easy = new Exercicio06_easy();
    Assert.assertEquals("Você está aprovado!!!", exercicio06Easy.verificarAprovacaoAluno(5,6));
    Assert.assertEquals("Você está de exame!!!", exercicio06Easy.verificarAprovacaoAluno(5,5));
    Assert.assertEquals("Você está reprovado!!!", exercicio06Easy.verificarAprovacaoAluno(4,4));
  }
}
