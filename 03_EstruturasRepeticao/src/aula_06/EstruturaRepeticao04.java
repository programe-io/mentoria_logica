package aula_06;

import java.util.Scanner;

public class EstruturaRepeticao04 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int caixaPequena = 0, caixaMedia = 0, caixaGrande = 0, caixaExtraGrande = 0;

        System.out.print("Informe a quant. de produtos: ");
        int quantProdutos = input.nextInt();

        while(quantProdutos != 0){
            if(quantProdutos >= 50){
                caixaExtraGrande++;
                quantProdutos -= 50;
            }
            else if(quantProdutos >= 20){
                caixaGrande++;
                quantProdutos -= 20;
            }
            else if(quantProdutos >= 5){
                caixaMedia++;
                quantProdutos -= 5;
            }
            else{
                caixaPequena++;
                quantProdutos -= 1;
            }
        }

        System.out.println("Caixa Extra-Grande: " + caixaExtraGrande);
        System.out.println("Caixa Grande: " + caixaGrande);
        System.out.println("Caixa Média: " + caixaMedia);
        System.out.println("Caixa Pequena: " + caixaPequena);
    }
}
