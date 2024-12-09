package pratica01;

import java.util.Scanner;

public class Auxiliar {

    public void funcaoAuxiliar01(){
        funcaoAuxiliar02();
    }

    public void funcaoAuxiliar02(){
        int numero1;
        int numero2;
        int resultado;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe um número: ");
        numero1 = scanner.nextInt();
        System.out.print("Informe um outro número: ");
        numero2 = scanner.nextInt();

        try {
            resultado = numero1 / numero2;
            System.out.println("O resultado foi: " + resultado);
        }
        catch (ArithmeticException e){
            System.out.println("Erro na operação matemática");
        }
    }
}
