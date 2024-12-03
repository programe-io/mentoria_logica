package funcao;

public class Desafio02 {

    public boolean isPrimo(int numero){
        /* Guardar a quant. de divisões do número */
        int contDivisoes = 0;

        /* Repetição de 1 até o número, vendo se tem divisões */
        for(int i = 1; i <= numero; i++){
            if(numero % i == 0){
                /* Se tiver divisão exata, soma +1 */
                contDivisoes++;
            }
        }
        /* Configurar o retorno da função */
        if(contDivisoes == 2)
            return true;
        else
            return false;
    }



    /* Método de Execução */
    public static void main(String[] args) {
        Desafio02 def02 = new Desafio02();
        boolean resultado = def02.isPrimo(6);

        /* Exibir o Resultado */
        System.out.println(resultado);
    }
}

