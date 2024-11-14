import java.util.Random;

public class Pratica02 {
    public static void main(String[] args) {

        int indiceMenorValor = 0;
        int menorValor = Integer.MAX_VALUE;

        int[] vetorInteiros = new int[50];
        Random aleatorio = new Random();

        /* Percorrer para inserir os valores do array */
        for(int indice = 0; indice < vetorInteiros.length; indice++){
            vetorInteiros[indice] = aleatorio.nextInt(100) + 1;
        }

        /* Encontrando o menor valor */
        for(int indice = 0; indice < vetorInteiros.length; indice++){
            if(vetorInteiros[indice] < menorValor){
                menorValor = vetorInteiros[indice];
                indiceMenorValor = indice;
            }
        }

        System.out.println("O menor valor encontrado foi: " + menorValor);
        System.out.println("O índice do menor valor foi: " + indiceMenorValor);

    }
}

