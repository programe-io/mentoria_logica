import java.util.Random;
import java.util.Scanner;

public class Pratica05 {
    public static void main(String[] args) {

        int quantPares = 0;
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        /* Pegar a ordem da matriz com o usuário */
        System.out.print("Informe a ordem da matriz: ");
        int quant = sc.nextInt();

        /* Declarando e criando a matriz */
        int[][] matriz = new int[quant][quant];

        /* Percorrer a matriz para a inserção dos valores */
        for(int linha = 0; linha < quant; linha++){
            for(int coluna = 0; coluna < quant; coluna++){
                matriz[linha][coluna] = rand.nextInt(99) + 1;
            }
        }

        /* Percorrer a matriz para mostrar os valores */
        for(int linha = 0; linha < quant; linha++){
            for(int coluna = 0; coluna < quant; coluna++){
                System.out.printf("%03d ", matriz[linha][coluna]);
            }
            /* Gerando uma nova linha após criar todos as colunas */
            System.out.print("\n");
        }

        System.out.print("\n --------------------------------- \n");

        /* Exibir os resultados */
        /* 1: Mostrar os valores da diagonal principal */
        for(int linha = 0; linha < quant; linha++){
            for(int coluna = 0; coluna < quant; coluna++) {
                if(matriz[linha][coluna] % 2 == 0){
                    quantPares++;
                }

                if(linha == coluna){
                    System.out.printf("%03d  ", matriz[linha][coluna]);
                }
            }
        }


        /* Exibir os resultados */
        System.out.println("\nA quant. de pares foi: " + quantPares);
    }
}


