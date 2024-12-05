package aula11;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ExemploData07 {
    public static void main(String[] args) {

        LocalDate data = LocalDate.now();
        DateTimeFormatter padraoData = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println(data.format(padraoData));
        System.out.println(padraoData.format(data));
    }
}

