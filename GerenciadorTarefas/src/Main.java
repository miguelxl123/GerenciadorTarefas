import service.GerenciadorTarefas;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        GerenciadorTarefas manager = new GerenciadorTarefas();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n--- Gerenciador de Tarefas ---");
            System.out.println("1. Adicionar tarefa");
            System.out.println("2. Listar tarefas");
            System.out.println("3. Concluir tarefa");
            System.out.println("4. Remover tarefa");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // consumir quebra de linha

            switch (opcao) {
                case 1:
                    System.out.print("Descrição da tarefa: ");
                    String desc = scanner.nextLine();
                    manager.adicionarTarefa(desc);
                    break;
                case 2:
                    manager.listarTarefas();
                    break;
                case 3:
                    System.out.print("ID da tarefa para concluir: ");
                    int idConcluir = scanner.nextInt();
                    manager.concluirTarefa(idConcluir);
                    break;
                case 4:
                    System.out.print("ID da tarefa para remover: ");
                    int idRemover = scanner.nextInt();
                    manager.removerTarefa(idRemover);
                    break;
                case 0:
                    System.out.println("Encerrando...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 0);

        scanner.close();
    }
}
