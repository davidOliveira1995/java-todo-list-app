import model.Tarefa;

import java.util.ArrayList;
import java.util.List;

public class GerenciadorDeTarefas {

    private List<Tarefa> tarefas;

    public GerenciadorDeTarefas(List<Tarefa> tarefas) {
        this.tarefas = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao) {
        Tarefa novaTarefa = new Tarefa(descricao);
        this.tarefas.add(novaTarefa);
    }

    public boolean marcarTarefaComoConcluida(int indice) {

       int indiceReal = indice -1;

       if (indiceReal >= 0 && indiceReal < this.tarefas.size()) {
           Tarefa tarefaParaMarcar = this.tarefas.get(indiceReal);

           tarefaParaMarcar.marcarComoConcluida();

           System.out.println("Tarefa '" + tarefaParaMarcar.getDescricao() + "' marcada como concluída!");
           return true;
       } else {

           System.out.println("Erro: Tarefa não encontrada!");
           return false;
       }
    }

    public List<Tarefa> listarTodasAsTarefas() {
        List<Tarefa> todasAsTarefas = new ArrayList<>();

        for (Tarefa t : this.tarefas) {
            todasAsTarefas.add(t);
        }
        return todasAsTarefas;
    }

    public List<Tarefa> listarTarefasPendentes() {
        List<Tarefa> tarefasPendentes = new ArrayList<>();

        for (Tarefa t : this.tarefas) {
            if (!t.isConcluida()) {
                tarefasPendentes.add(t);
            }
        }
        return tarefasPendentes;
    }

    public  List<Tarefa> listarTarefasConcluidas() {
        List<Tarefa> tarefasConcluidas = new ArrayList<>();

        for (Tarefa t : this.tarefas) {
            if (t.isConcluida()) {
                tarefasConcluidas.add(t);
            }
        }
        return tarefasConcluidas;
    }

}
