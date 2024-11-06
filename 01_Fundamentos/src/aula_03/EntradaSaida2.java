package aula_03;

import java.util.Scanner;

public class EntradaSaida2 {
    public static void main(String[] args) {

        /* 1: Criar um objeto do tipo Scanner */
        int numero;
        Scanner input = new Scanner(System.in);

        /*
        System.out.print("Informe um número: ");
        numero = input.nextInt();
        System.out.println("O número informado foi: " + numero);

        double altura;
        System.out.print("Informe sua altura: ");
        altura = input.nextDouble();
        System.out.printf("A altura informada foi %.2f", altura);
        String nome;
        System.out.print("Informe seu nome: ");
        nome = input.nextLine();
        System.out.println("O nome informado foi: " + nome); */

        char opcao;
        System.out.println("I: Incluir / E: Excluir / A: Adicionar");

        System.out.print("Informe uma opção válida: ");
        opcao = input.next().charAt(0);

        System.out.println("A opção informada foi: " + opcao);
    }
}

