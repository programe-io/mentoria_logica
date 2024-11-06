package aula_01;

public class Tipagem {
    public static void main(String[] args) {

        /* Criação de uma variável do tipo double (número fracionado), chamada valor1 e armazena o valor 3.14 */
        double valor1 = 3.14;

        /* Variável valor2 do tipo inteiro (int), que recebe o valor contido na variável valor1. Porém o Java não atribui diretamente um valor/variavel do tipo double em inteiros (pelo fato de haver a perda da fração).  */
        int valor2 = (int)valor1;

        /* As variáveis do tipo char armazenam um único caractere, que pode ser uma letra, um número na forma textual, ou um símbolo especial. Importante lembrar que os valores atribuidos a uma variável char devem está dentro de aspas simples ' ' */
        char letra = '*';

        /* Variáveis do tipo boolean armazenam valores lógicos: verdadeiro (true) ou falso (false), que são resultantes sempre de uma avaliação condicional ou lógica */
        boolean resultado = 1 < 3;

    }
}

