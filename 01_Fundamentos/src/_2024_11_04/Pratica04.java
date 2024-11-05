package _2024_11_04;

import java.util.Scanner;

public class Pratica04 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        /* Variável de Entrada */
        int numero;

        /* Variável de Processamento */
        String resultado;

        /* Entrada do(s) Dado(s) */
        System.out.print("Informe um número: ");
        numero = input.nextInt();

        /* Expressão Condicional Ternária */
        /* variavel = (expressão condicional) ? resultadoVerdadeiro : resultadoFalso */
        resultado = (numero >= 0) ? "Positivo" : "Negativo";

        System.out.println("O número informado é " + resultado);
    }
}
