package projeto_01;

/* Importar os pacotes */
import java.util.ArrayList;
import java.util.Collections;

public class TarefaDiaria {

    /* Criando o ArrayList para guardar as tarefas */
    ArrayList<String> listaTarefas = new ArrayList<>();

    public void adicionarTarefa(String tarefa){
        listaTarefas.add(tarefa);
    }

    public ArrayList verTarefas(){
        return listaTarefas;
    }

    public boolean removerTarefas(String tarefa){
        boolean resultado = listaTarefas.remove(tarefa);
        return resultado;
    }

    public ArrayList ordenarTarefas(){
        ArrayList<String> listaOrdenada = new ArrayList<>(listaTarefas);
        Collections.sort(listaOrdenada);
        return listaOrdenada;
    }
}

