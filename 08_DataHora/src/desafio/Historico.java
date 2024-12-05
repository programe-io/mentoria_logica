package desafio;

import java.util.ArrayList;
import java.util.Calendar;

public class Historico {

    ArrayList<Contrato> listaContrato = new ArrayList<>();

    public void adicionarContrato(Contrato novoContrato){
        listaContrato.add(novoContrato);
    }

    public ArrayList verContratos(){
        return listaContrato;
    }

    public Double verValoresMes(int mes, int ano){
        Double valor = 0.0;
        Calendar calendar = Calendar.getInstance();

        for(int i = 0; i < listaContrato.size(); i++){
            Contrato contratoAnalisado = listaContrato.get(i);
            calendar.setTime(contratoAnalisado.data);

            if(calendar.get(Calendar.MONTH) == mes && calendar.get(Calendar.YEAR) == ano){
                valor += contratoAnalisado.valorContrato();
            }
        }
        return valor;
    }
}
