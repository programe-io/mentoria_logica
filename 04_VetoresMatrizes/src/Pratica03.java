import java.util.Random;

public class Pratica03 {
    public static void main(String[] args) {

        int quantPares = 0;
        int[] vetor = new int[20];
        Random rand = new Random();

        /* Inserindo os valores no array/vetor */
        for(int i = 0; i < vetor.length; i++){
            vetor[i] = rand.nextInt(99) + 1;
        }

        /* Percorre o vetor usando o foreach, quantificando os pares */
        for(int item : vetor){
            if(item % 2 == 0){
                quantPares++;
            }
        }

        /* Exibir o resultado */
        System.out.println("A quant. de números pares foi: " + quantPares);
    }
}
