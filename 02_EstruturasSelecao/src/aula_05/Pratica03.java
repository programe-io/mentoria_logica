package aula_05;

import java.util.Scanner;

public class Pratica03 {
    public static void main(String[] args) {

        /* Declaração das variáveis */
        int dividendo;
        int divisor;
        int quociente;
        Scanner input = new Scanner(System.in);

        /* Leitura dos dados de entrada */
        System.out.print("Informe o valor do dividendo: ");
        dividendo = input.nextInt();
        System.out.print("Informe o valor do divisor: ");
        divisor = input.nextInt();

        /* Processamento: Gerar o quociente */
        if(divisor != 0) {
            quociente = dividendo / divisor;
            System.out.println("O resultado foi: " + quociente);
        }
        else{
            System.out.println("Erro!!! Informe um divisor diferente de ZERO.");
        }
    }
}
