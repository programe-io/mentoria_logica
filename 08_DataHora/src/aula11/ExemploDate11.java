package aula11;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class ExemploDate11 {
    public static void main(String[] args) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Date data = sdf.parse("04/12/2024 20:12:25");

        /* Não precisa ser instanciada com o new */
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(data);

        System.out.println("Dia: " + calendar.get(Calendar.DATE));
        System.out.println("Mês: " + calendar.get(Calendar.MONTH));
        System.out.println("Ano: " + calendar.get(Calendar.YEAR));
    }
}

