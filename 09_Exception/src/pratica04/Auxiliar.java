package pratica04;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Auxiliar {

    public void mostrarData() throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date minhaData = sdf.parse("09/12/2024");
        System.out.println(minhaData);
    }
}

