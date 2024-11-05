package list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {

    // Atributo
    private List<Tarefa> tarefaList;

    // Construtor
    public ListaTarefa() {
        this.tarefaList = new ArrayList<>();
    }

    // Adicionar Tarefa
    public void adicionarTarefa(String descricao){
        tarefaList.add(new Tarefa(descricao));
    }

    // Remover Tarefa
    public void removerTarefa(String descricao){
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        for(Tarefa t : tarefaList){
            if(t.getDescricao().equalsIgnoreCase(descricao)){
                tarefasParaRemover.add(t);
            }
        }
        tarefaList.removeAll(tarefasParaRemover);
    }

    // Obter número Total
    public int obterNumeroTotalTarefa(){
        return tarefaList.size();
    }

    // Obter Descrição de Tarefas
    public void obterDescricoesTarefas(){
        System.out.println(tarefaList);
    }

    // Testando os métodos
    public static void main(String[] args) {
        ListaTarefa listaTarefa = new ListaTarefa();

        // Obter Número Total
        System.out.println(" O Número total de elementos na lista é: " + listaTarefa.obterNumeroTotalTarefa());

        // Adicionando Tarefa na Lista
        listaTarefa.adicionarTarefa("Tarefa 1");
        listaTarefa.adicionarTarefa("Tarefa 2");
        System.out.println(" O Número total de elementos na lista é: " + listaTarefa.obterNumeroTotalTarefa());

        // Removendo Tarefa da lista
        listaTarefa.removerTarefa("Tarefa 1");
        System.out.println(" O Número total de elementos na lista é: " + listaTarefa.obterNumeroTotalTarefa());

        // Obter Descrição
        listaTarefa.obterDescricoesTarefas();
    }
}
