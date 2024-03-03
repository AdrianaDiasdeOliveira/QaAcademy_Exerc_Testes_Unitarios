package TestesUnitarios_Easy;

import easy.Exercicio04_easy;
import org.junit.Test;

public class TesteUnitarioEx04 {
    @Test

    public void TestcalcularDobro() {
        Exercicio04_easy exercicio04_easy = new Exercicio04_easy();
        Integer numeroDigitado = 100;
        System.out.println(exercicio04_easy.calcularDobro(numeroDigitado));
    }
}
