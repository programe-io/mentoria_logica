package aula_03;

import java.util.Scanner;

public class Pratica01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        /* Variáveis de Entrada */
        int quantidadeAndares;
        double alturaAndar;
        /* Variáveis de Processamento */
        double alturaTotal;

        /* Entradas dos dados */
        System.out.print("Informe a quant. de andares: ");
        quantidadeAndares = sc.nextInt();
        System.out.print("Informe a altura padrão dos andares: ");
        alturaAndar = sc.nextDouble();

        /* Processamento: Gerar os dados para o resultado */
        alturaTotal = quantidadeAndares * alturaAndar;

        /* Exibir a saída */
        System.out.printf("A altura total do prédio é %.1f metros", alturaTotal);
    }
}
