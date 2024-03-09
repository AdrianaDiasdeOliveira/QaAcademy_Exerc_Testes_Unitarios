package medium;

public class Exercicio03_medium {
    public int [] somaAteMil() {
        int [] somaVetor = new int[1000];
        int soma = 0;
        int limite = 1500;
        for (int i = 0; i <= 1000; i++) {
            soma = i + soma;
            System.out.println("Iteração : " + i + " | Soma: " + soma);
            somaVetor[i] = soma;
            if (soma >= limite) {
                break;
            }
        }

        System.out.println("Limite Atingido!!!");
        return somaVetor;
    }
}