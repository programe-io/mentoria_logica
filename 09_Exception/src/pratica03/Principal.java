package pratica03;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] meuArray = new int[5];

        /* Populando o Array */
        meuArray[0] = 5;
        meuArray[1] = 7;
        meuArray[2] = 3;
        meuArray[3] = 9;
        meuArray[4] = 2;

        try{
            System.out.print("Informe um índice a ser consultado: ");
            int indice = scanner.nextInt();
            System.out.println(meuArray[indice]);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Você tentou acessar um índice inexistente no array.");
        }
        catch (InputMismatchException e){
            System.out.println("Informe um valor númerico referente ao índice");
        }
    }
}
