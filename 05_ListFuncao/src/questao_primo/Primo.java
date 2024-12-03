package questao_primo;

public class Primo {

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
}
