package pratica05;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        /* Variáveis */
        Integer opcao;
        Scanner scanner = new Scanner(System.in);
        Conta minhaConta = new Conta();

        System.out.println("Sistema Bancário");
        System.out.println("----------------");
        System.out.println("1 - Ver o Saldo");
        System.out.println("2 - Depositar");
        System.out.println("3 - Sacar");
        System.out.println("4 - Sair");

        do{
            System.out.print("Informe a Opção: ");
            opcao = scanner.nextInt();

            if(opcao == 1){
                System.out.println(minhaConta.verSaldo());
            }
            else if(opcao == 3){
                System.out.print("Informe o valor do saque: ");
                Double valorSaque = scanner.nextDouble();

                try {
                    minhaConta.sacar(valorSaque);
                }
                catch (ExceptionSaldo e){
                    System.out.println(e.getMessage());
                }
            }

        }while(opcao != 4);
    }
}
