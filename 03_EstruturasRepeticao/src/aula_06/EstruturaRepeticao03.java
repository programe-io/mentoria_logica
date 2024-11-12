package aula_06;

import java.util.Scanner;

public class EstruturaRepeticao03 {
    public static void main(String[] args) {

        int numeroN;
        int soma = 0;
        Scanner input = new Scanner(System.in);

        System.out.print("Informe a quant. de números: ");
        numeroN = input.nextInt();

        for(int i = 1 ; i <= numeroN ; i++ ){
            System.out.printf("Informe o %dº número: ", i);
            int num = input.nextInt();

            soma += num;  // O mesmo que: "soma = soma + num"
        }

        System.out.println("A soma dos valores recebidos foi: " + soma);
    }
}

