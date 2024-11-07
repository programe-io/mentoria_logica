package aula_05;

import java.util.Scanner;

public class Pratica07 {
    public static void main(String[] args) {

        /* Declaração de Variáveis */
        int valorP, valorA, valorB, valorC;
        Scanner input = new Scanner(System.in);

        /* Leitura dos dados de entrada */
        System.out.print("Informe o valor de P: ");
        valorP = input.nextInt();
        System.out.print("Informe o valor de A: ");
        valorA = input.nextInt();
        System.out.print("Informe o valor de B: ");
        valorB = input.nextInt();
        System.out.print("Informe o valor de C: ");
        valorC = input.nextInt();

        switch(valorP){
            case 1:
                double media = (valorA + valorB + valorC) / 3;
                System.out.println("A média foi " + media);
                break;
            case 2:
                int soma = valorA + valorB + valorC;
                System.out.println("A soma foi: " + soma);
                break;
            case 3:
                if(valorB % 2 == 0){
                    System.out.printf("O valor %d é PAR", valorB);
                    break;
                }
                else{
                    System.out.printf("O valor %d é IMPAR", valorB);
                    break;
                }
            default:
                System.out.println("Informe uma opção válida.");
        }
    }
}
