package aula_05;

import java.util.Scanner;

public class Pratica01 {
    public static void main(String[] args) {

        /* declaração das variáveis */
        int valor1;
        int valor2;
        Scanner input = new Scanner(System.in);

        /* Leitura dos dados de entrada */
        System.out.print("Informe o 1º valor: ");
        valor1 = input.nextInt();
        System.out.print("Informe o 2º valor: ");
        valor2 = input.nextInt();

        /* Estruturas de seleção */
        if(valor1 > valor2){
            System.out.printf("%d é maior que %d", valor1, valor2);
        }
        else if(valor2 > valor1){
            System.out.printf("%d é maior que %d", valor2, valor1);
        }
        else{
            System.out.printf("Foi informado duas vezes o valor %d", valor1);
        }
    }
}
