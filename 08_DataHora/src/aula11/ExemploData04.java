package aula11;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class ExemploData04 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        DateTimeFormatter padraoFormatacao01 = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.print("Informe sua data de nascimento (dd/mm/aaaa): ");
        String dataNasc = input.nextLine();

        LocalDate minhaData = LocalDate.parse(dataNasc, padraoFormatacao01);

        System.out.println("A data de nascimento informada foi " + minhaData);
    }
}

