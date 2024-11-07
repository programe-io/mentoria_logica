package aula_05;

import java.util.Scanner;

public class Pratica06 {
    public static void main(String[] args) {

        /* Declaração das Variáveis */
        char opcao;
        Scanner sc = new Scanner(System.in);

        /* Leitura dos dados de entrada */
        System.out.print("Informe sua opção: ");
        opcao = sc.next().charAt(0);

        switch(opcao){
            case 'a':
            case 'A':
                System.out.println("Opção de Alteração");
                break;
            case 'c':
            case 'C':
                System.out.println("Opção de Consulta");
                break;
            case 'e':
            case 'E':
                System.out.println("Opção de Exclusão");
                break;
            case 'i':
            case 'I':
                System.out.println("Opção de Inclusão");
                break;
            case 'f':
            case 'F':
                System.out.println("Opção de Finalização");
                break;
            default:
                System.out.println("Opção Inválida");
        }
    }
}
