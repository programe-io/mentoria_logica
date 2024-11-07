package aula_05;

import java.util.Scanner;

public class Exemplo01 {
    public static void main(String[] args) {

        int numero;
        Scanner input = new Scanner(System.in);

        System.out.print("Informe o valor do número: ");
        numero = input.nextInt();

        if(numero > 10){
            System.out.println("O número informado é maior que 10");
        }
        else if(numero < 10){
            System.out.println("O número informado é menor que 10");
        }
        else{
            System.out.println("O número informado é igual a 10");
        }
    }
}
