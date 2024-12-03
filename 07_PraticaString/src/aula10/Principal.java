package aula10;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        /* Estoque */
        Estoque meuEstoque = new Estoque();
        Scanner input = new Scanner(System.in);
        int opcao;

        System.out.println("Sistema de Produtos");
        System.out.println("-------------------");
        System.out.println("1 - Adicionar Produto");
        System.out.println("2 - Exibir Produtos");
        System.out.println("3 - Consultar Produto");
        System.out.println("4 - Atualizar Estoque");
        System.out.println("5 - Sair");

        do {
            System.out.print("Informe a Opção Desejada: ");
            opcao = input.nextInt();

            // Limpar o buffer
            input.nextLine();

            if(opcao == 1){
                // Criar uma referência de produto
                Produto novoProduto = new Produto();

                // Receber os dados do usuário
                System.out.print("Descrição: ");
                novoProduto.descricao = input.nextLine();
                System.out.print("Valor: ");
                novoProduto.preco = input.nextDouble();
                System.out.print("Quantidade: ");
                novoProduto.quantidade = input.nextInt();

                // Adicionar esse novoProduto no estoque
                meuEstoque.adicionar(novoProduto);
            }
            else if(opcao == 2){
                System.out.println(meuEstoque.mostrarProdutos());
            }
            else if(opcao == 3){
                System.out.print("Informe a descrição do produto: ");
                String descricao = input.nextLine();

                if(meuEstoque.buscarProduto(descricao) != null){
                    System.out.println(meuEstoque.buscarProduto(descricao));
                }
                else{
                    System.out.println("Produto não encontrado.");
                }
            }
            else if(opcao == 4){
                System.out.print("Informe a descrição do produto: ");
                String descricao = input.nextLine();
                System.out.print("Informe a quantidade: ");
                Integer quant = input.nextInt();

                if(meuEstoque.atualizarEstoque(descricao, quant) != null){
                    System.out.println("Estoque atualizado.");
                }
                else{
                    System.out.println("Produto não encontrado.");
                }
            }

        } while (opcao != 5);
    }
}

