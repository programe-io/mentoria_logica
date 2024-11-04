package _2024_10_30;

public class OperadoresLogicos {
    public static void main(String[] args) {

        int numero1 = 10;
        int numero2 = 12;
        int numero3 = 8;
        int numero4 = 10;

        /* Operadores lógicos servem para analisar duas ou mais expressões condicionais. No exemplo abaixo analisa-se  numero1 == numero2 e depois se numero3 < numero4.
         - Se o operador lógico usado for && (e), as duas expressões devem ser verdadeira, para o resultado ser verdadeiro.
         - Se o operador lógico usado foi || (ou), apenas uma expressão deve ser verdadeira, para o resultado ser verdadeiro. Se as duas forem verdadeira, prevalece o resultado verdadeiro.
        * */

        boolean resultado = (numero1 == numero2) || (numero3 < numero4);

        System.out.println(!resultado);
    }
}

