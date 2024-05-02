package list.operacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {

    private List<Tarefa> listaTarefa;

    //inicialização da lista vazia
    public ListaTarefa() {
        this.listaTarefa = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao) {
    listaTarefa.add(new Tarefa(descricao));
    }
    public void removerTarefa(String descricao){
        List<Tarefa> tarefasRemove = new ArrayList<>();
        for(Tarefa t : listaTarefa){
            if(t.getDescricao().equalsIgnoreCase(descricao)) {
                tarefasRemove.add(t);
            }
        }
        listaTarefa.removeAll(tarefasRemove);
    }

    public int obterNumeroTotalTarefas () {
        return listaTarefa.size();
    }
    public void obterDescricoesTarefas() {
        System.out.println(listaTarefa.toString());
    }

    public static void main(String[] args) {
        ListaTarefa listaTarefa = new ListaTarefa();

        listaTarefa.adicionarTarefa("tarefa 1");
        listaTarefa.adicionarTarefa("tarefa 1");
        listaTarefa.adicionarTarefa("tarefa 2");
        System.out.println("numero de terefas na lista: "+ listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.removerTarefa("Tarefa 1");
        listaTarefa.removerTarefa("Tarefa 1");
        System.out.println("numero de terefas na lista: " + listaTarefa.obterNumeroTotalTarefas());
        listaTarefa.obterDescricoesTarefas();

    }
}
