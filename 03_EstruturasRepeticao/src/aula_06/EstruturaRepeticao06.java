package aula_06;

import java.util.Scanner;

public class EstruturaRepeticao06 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Informe a quant. de linhas e colunas: ");
        int numeroN = input.nextInt();

        /* Responsável pelas linhas */
        for(int x = 1 ; x <= numeroN ; x++){
            /* Responsável pelas colunas, e pelo desenho */
            for(int y = 1 ; y <= numeroN ; y++){
                if(x == y){
                    System.out.print(" * ");
                }
                else{
                    System.out.print(" . ");
                }
            }
            System.out.print("\n");
        }
    }
}

