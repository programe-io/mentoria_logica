package aula11;

import java.text.ParseException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ExemploData05 {
    public static void main(String[] args) {

        DateTimeFormatter padraoFormatacao01 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

        LocalDateTime dataHora = LocalDateTime.parse("02/12/2024 20:48:10", padraoFormatacao01);

        System.out.println(dataHora);
    }
}
