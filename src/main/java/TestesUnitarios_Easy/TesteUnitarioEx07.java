package TestesUnitarios_Easy;

import easy.Exercicio06_easy;
import easy.Exercicio07_easy;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TesteUnitarioEx07 {

    Exercicio07_easy  eercicio07_easy = new Exercicio07_easy();

    @Before
    public void before(){
        Exercicio07_easy  eercicio07_easy = new Exercicio07_easy();
    }

    @Test
    public void testeCalculaFaixaUm() {

         Assert.assertEquals("99.0",eercicio07_easy.calcularInns(1320.00).toString());
    }
    @Test
    public void testeCalculaFaixaDois() {

        Assert.assertEquals("118.8009",eercicio07_easy.calcularInns(1320.01).toString());
    }
    @Test
    public void testeCalculaFaixaTres() {

        Exercicio07_easy  eercicio07_easy = new Exercicio07_easy();
        Assert.assertEquals("308.556",eercicio07_easy.calcularInns(2571.30).toString());
    }
    @Test
    public void testeCalculaFaixaQuatro() {

       Assert.assertEquals("539.9730000000001",eercicio07_easy.calcularInns(3856.95).toString());
    }
    @Test
    public void testeCalculaFaixaFive() {

        Assert.assertEquals("1051.0486",eercicio07_easy.calcularInns(7507.49).toString());
    }




}