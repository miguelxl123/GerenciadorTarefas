package service;

import model.Tarefa;

import java.util.ArrayList;
import java.util.List;

public class GerenciadorTarefas {
    private List<Tarefa> tarefas = new ArrayList<>();

    public void adicionarTarefa(String descricao) {
        Tarefa t = new Tarefa(descricao);
        tarefas.add(t);
        System.out.println("Tarefa adicionada!");
    }

    public void listarTarefas() {
        if (tarefas.isEmpty()) {
            System.out.println("Nenhuma tarefa encontrada.");
            return;
        }
        for (Tarefa t : tarefas) {
            System.out.println(t);
        }
    }

    public void concluirTarefa(int id) {
        for (Tarefa t : tarefas) {
            if (t.getId() == id) {
                t.concluir();
                System.out.println("Tarefa concluída!");
                return;
            }
        }
        System.out.println("Tarefa não encontrada.");
    }

    public void removerTarefa(int id) {
        tarefas.removeIf(t -> t.getId() == id);
        System.out.println("Tarefa removida.");
    }
}
