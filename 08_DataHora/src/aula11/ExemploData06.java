package aula11;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class ExemploData06 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Informe seu DIA de nascimento: ");
        Integer dia = input.nextInt();
        System.out.print("Informe seu MÊS de nascimento: ");
        Integer mes = input.nextInt();
        System.out.print("Informe seu ANO de nascimento: ");
        Integer ano = input.nextInt();

        LocalDate dataNasc = LocalDate.of(ano, mes, dia);

        System.out.println("A data de nascimento informada foi: " + dataNasc);
    }
}
