package TestesUnitarios_Medium;

import easy.Exercicio06_easy;
import medium.Exercicio01_medium;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TesteUnitarioEx01_medium {
         Exercicio01_medium exercicio01Medium;

        @Before
        public void before() {
            exercicio01Medium = new Exercicio01_medium();
        }

        @Test
        public void testeVerificaPar() {
            String msgEsperada = "O Numero: 2 - é Par";
            String msgValorAtual = exercicio01Medium.verificaParOuImpar(2);
            Assert.assertEquals(msgEsperada, msgValorAtual);
        }

        @Test
        public void testeVerificaImpar() {
            String msgEsperada = "O Numero: 1 - é ímpar";
            String msgValorAtual = exercicio01Medium.verificaParOuImpar(1);
            Assert.assertEquals(msgEsperada, msgValorAtual);
        }
    }

