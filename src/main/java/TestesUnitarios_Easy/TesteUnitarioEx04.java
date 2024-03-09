package TestesUnitarios_Easy;

import easy.Exercicio04_easy;
import org.junit.Assert;
import org.junit.Test;

public class TesteUnitarioEx04 {
    @Test

    public void TestcalcularDobro() {
        Exercicio04_easy exercicio04_easy = new Exercicio04_easy();
        Assert.assertEquals("4", exercicio04_easy.calcularDobro(2).toString());
    }
}
