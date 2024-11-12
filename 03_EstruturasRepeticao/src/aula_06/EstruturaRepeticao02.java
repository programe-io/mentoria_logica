package aula_06;

import java.util.Scanner;

public class EstruturaRepeticao02 {
    public static void main(String[] args) {

        int numeroN;
        int soma = 0;
        Scanner input = new Scanner(System.in);

        System.out.print("Informe um número N: ");
        numeroN = input.nextInt();

        for(int i = 1 ; i <= numeroN ; i++ ){
            if(i % 2 == 0){
                soma = soma + i;
            }
        }

        System.out.println(soma);
    }
}
