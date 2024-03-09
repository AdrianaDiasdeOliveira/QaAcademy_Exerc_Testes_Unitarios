package TestesUnitarios_Easy;

import easy.Exercicio06_easy;
import easy.Exercicio07_easy;
import easy.Exercicio08_easy;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TesteUnitarioEx08 {
    Exercicio08_easy  exercicio08_easy_easy = new Exercicio08_easy();

@Before
      public void before(){
    Exercicio08_easy  exercicio08_easy_easy = new Exercicio08_easy();
   }

   @Test
    public void testcalcularIRPrimeiraFaixa(){
    Assert.assertEquals("0.0",exercicio08_easy_easy.calcularIR(2112.00).toString());
   }
    @Test
    public void testcalcularIRSegundaFaixa(){
        Assert.assertEquals("0.0",exercicio08_easy_easy.calcularIR(2112.01).toString());
    }
    @Test
    public void testcalcularIRTerceiraFaixa(){
        Assert.assertEquals("53.59899999999999",exercicio08_easy_easy.calcularIR(2826.66).toString());
    }
    @Test
    public void testcalcularIRQuartaQFaixa(){
        Assert.assertEquals("192.25850000000003",exercicio08_easy_easy.calcularIR(3751.06).toString());
    }
    @Test
    public void testcalcularIRQuintaFaixa(){
        Assert.assertEquals("397.8297499999999",exercicio08_easy_easy.calcularIR(4664.69).toString());
    }
}
