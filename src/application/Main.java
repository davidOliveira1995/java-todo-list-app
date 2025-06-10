package application;

import model.GerenciadorDeTarefas;
import model.Tarefa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        GerenciadorDeTarefas tarefas = new GerenciadorDeTarefas();

        boolean programaFinalizado = false;
        do {

            System.out.println("\n---- Menu ToDo-List ----\n");

            System.out.println("1. Adicionar tarefa.");
            System.out.println("2. Marca tarefa como concluida.");
            System.out.println("3. Listar todas as tarefas.");
            System.out.println("4. Listar tarefas pendentes.");
            System.out.println("5. Listar tarefas concluidas.");
            System.out.println("6. Sair.");

            pulaLinha();

            System.out.print("Opção: ");
            int opcao = scan.nextInt();

            scan.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("Opção 1: Adicionar tarefa!");
                    System.out.println("Descrição da tarefa: ");

                    String descricao = scan.nextLine();
                    tarefas.adicionarTarefa(descricao);
                    break;
                case 2:
                    System.out.println("Opção 2: Marca tarefa como concluida.");

                    System.out.print("Número da tarefa: ");
                    int indice  = scan.nextInt();
                    scan.nextLine();

                    tarefas.marcarTarefaComoConcluida(indice);
                    break;
                case 3:
                    System.out.println("Opção 3: Listar todas as tarefas.\n");
                    // Chama o método que retorna TODAS as tarefas
                    List<model.Tarefa> todasAsTarefas = tarefas.listarTodasAsTarefas();

                    if (todasAsTarefas.isEmpty()) {
                        System.out.println("Nenhuma tarefa cadastrada ainda.");
                    } else {
                        System.out.println("--- TODAS AS TAREFAS ---");
                        for (int i = 0; i < todasAsTarefas.size(); i++) {
                            model.Tarefa tarefaAtual = todasAsTarefas.get(i);
                            String status = tarefaAtual.isConcluida() ? "[CONCLUÍDA]" : "[PENDENTE]";
                            System.out.println((i + 1) + ". " + tarefaAtual.getDescricao() + " " + status);
                        }
                        System.out.println("-------------------------\n");
                    }
                    break; // Não esqueça o break!

                case 4:
                    System.out.println("Opção 4: Listar tarefas pendentes.\n");
                    // Chama o método que retorna APENAS as tarefas pendentes
                    List<model.Tarefa> tarefasPendentes = tarefas.listarTarefasPendentes();

                    if (tarefasPendentes.isEmpty()) {
                        System.out.println("Nenhuma tarefa pendente cadastrada ainda.");
                    } else {
                        System.out.println("--- TAREFAS PENDENTES ---");
                        for (int i = 0; i < tarefasPendentes.size(); i++) {
                            model.Tarefa tarefaAtual = tarefasPendentes.get(i);
                            // Para tarefas pendentes, o status será sempre [PENDENTE] aqui
                            String status = "[PENDENTE]";
                            System.out.println((i + 1) + ". " + tarefaAtual.getDescricao() + " " + status);
                        }
                        System.out.println("--------------------------\n");
                    }
                    break; // Não esqueça o break!

                case 5:
                    System.out.println("Opção 5: Listar tarefas concluídas.\n");
                    // Chama o método que retorna APENAS as tarefas concluídas
                    List<model.Tarefa> tarefasConcluidas = tarefas.listarTarefasConcluidas();

                    if (tarefasConcluidas.isEmpty()) {
                        System.out.println("Nenhuma tarefa concluída cadastrada ainda.");
                    } else {
                        System.out.println("--- TAREFAS CONCLUÍDAS ---");
                        for (int i = 0; i < tarefasConcluidas.size(); i++) {
                            model.Tarefa tarefaAtual = tarefasConcluidas.get(i);
                            // Para tarefas concluídas, o status será sempre [CONCLUÍDA] aqui
                            String status = "[CONCLUÍDA]";
                            System.out.println((i + 1) + ". " + tarefaAtual.getDescricao() + " " + status);
                        }
                        System.out.println("--------------------------\n");
                    }
                    break; // Não esqueça o break!

                case 6:
                    System.out.println("Saindo do programa. Até a próxima.");
                    programaFinalizado = true;
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, digite um número entre 1 e 6.");
                    break;
            }

        } while(!programaFinalizado);
        System.out.println("Programa finalizado! Até a próxima.");

        scan.close();
    }

    public static void pulaLinha() {
        System.out.println();
    }
}