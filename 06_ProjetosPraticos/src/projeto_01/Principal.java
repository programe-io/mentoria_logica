package projeto_01;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        TarefaDiaria tarefaDia = new TarefaDiaria();

        System.out.println("---------------------");
        System.out.println("Sistema de Tarefas");
        System.out.println("---------------------");
        System.out.println("1 - Inserir Nova Tarefa");
        System.out.println("2 - Visualizar Tarefas");
        System.out.println("3 - Remover Tarefa");
        System.out.println("4 - Ordenar Tarefas");
        System.out.println("5 - Sair");

        while(true){
            System.out.println("---------------------");
            System.out.print("Informe a opção desejada: ");
            int opcao = sc.nextInt();

            /* Esse nextLine abaixo é para capturar o enter que estava "perdido"
            * no buffer */
            sc.nextLine();

            if(opcao == 1){
                System.out.print("Informe uma nova tarefa: ");
                String novaTarefa = sc.nextLine();

                tarefaDia.adicionarTarefa(novaTarefa);
            }
            else if(opcao == 2){
                if(tarefaDia.verTarefas().size() > 0){
                    System.out.println(tarefaDia.verTarefas());
                }
                else{
                    System.out.println("Não existe tarefas cadastradas.");
                }
            }
            else if(opcao == 3){
                System.out.print("Informe a tarefa a ser excluída: ");
                String tarefa = sc.nextLine();

                if(tarefaDia.removerTarefas(tarefa)){
                    System.out.println("Tarefa removida com sucesso");
                }
                else{
                    System.out.println("Tarefa não encontrada");
                }
            }
            else if(opcao == 4){
                System.out.println(tarefaDia.ordenarTarefas());
            }
            else if(opcao == 5){
                /* Frear (Parar) a execução do while /*/
                break;
            }
            else{
                System.out.println("Opção informada é INVÁLIDA");
            }
        }
    }
}

