package aula11;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ExemploData05 {
    public static void main(String[] args) {

        DateTimeFormatter padraoFormatacao = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");


        LocalDateTime dataHora = LocalDateTime.parse("02/12/2024 20:48:10", padraoFormatacao);
        LocalDate data = LocalDate.parse("02/12/2024 20:48:10", padraoFormatacao);

        System.out.println(dataHora);
        System.out.println(data);
    }
}
