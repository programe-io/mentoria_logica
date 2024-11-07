package aula_05;

import java.util.Scanner;

public class Pratica02 {
    public static void main(String[] args) {
        /* declaração das variáveis */
        int valor1;
        int valor2;
        int valor3;
        Scanner input = new Scanner(System.in);

        /* Leitura dos dados de entrada */
        System.out.print("Informe o 1º valor: ");
        valor1 = input.nextInt();
        System.out.print("Informe o 2º valor: ");
        valor2 = input.nextInt();
        System.out.print("Informe o 3º valor: ");
        valor3 = input.nextInt();

        /* Estruturas de seleção */
        if(valor1 <= valor2 && valor1 <= valor3){
            System.out.printf("O valor %d foi o menor", valor1);
        }
        else if(valor2 <= valor1 && valor2 <= valor3){
            System.out.printf("O valor %d foi o menor", valor2);
        }
        else{
            System.out.printf("O valor %d foi o menor", valor3);
        }
    }
}
