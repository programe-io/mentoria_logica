package aula_06;

import java.util.Scanner;

public class EstruturaRepeticao05 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int numero = 0;

        do{
            System.out.println("Informe um número: ");
            numero = input.nextInt();

        }while(numero != 0);
    }
}

