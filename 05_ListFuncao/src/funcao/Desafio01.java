package funcao;

import java.util.Scanner;

public class Desafio01 {

    Scanner input = new Scanner(System.in);

    public int somarNumeros(int num1, int num2){
        return num1 + num2;
    }


    /* Função */
    public static void main(String[] args) {
        Desafio01 d1 = new Desafio01();
        System.out.println(d1.somarNumeros(21, 30));
    }
}

