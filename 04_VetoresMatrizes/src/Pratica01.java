import java.util.Scanner;

public class Pratica01 {
    public static void main(String[] args) {

        /* Declaração do Array */
        int[] numeros = new int[10];
        Scanner sc = new Scanner(System.in);

        /* Inserção dos valores no array */
        for(int i = 0; i < numeros.length; i++){
            System.out.printf("Informe um indice[%d] do vetor: ", i);
            numeros[i] = sc.nextInt();
        }

        /* Exibição dos valores */
        for(int i = 0; i < numeros.length; i++){
            System.out.printf("numeros[%d]: %d \n", i, numeros[i]);
        }
    }
}
