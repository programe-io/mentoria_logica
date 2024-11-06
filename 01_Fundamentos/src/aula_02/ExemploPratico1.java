package aula_02;

public class ExemploPratico1 {

    public static void main(String[] args) {

        /* Crie um algoritmo que receba 2 notas de um aluno e calcule
         a sua média. */

        // Variáveis de Entrada
        double nota1 = 8.0;
        double nota2 = 6.0;

        // Variável de Processamento
        /* Em linguagens de programação a divisão e a multiplicação são realizadas antes das somas e subtrações. Para mudar essa prioridade, coloca-se em parêntese aquilo que gostaria de ser executado primeiro. Nesse exemplo, forçamos a realizar primeiro a soma das duas notas, depois a divisão por 2. */
        double media = (nota1 + nota2) / 2;

        // Saída de dados
        System.out.println("A média do aluno foi " + media);
    }
}

