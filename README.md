# Sistema de Controle de Tarefas (To-Do List)

Este é um projeto simples de um Sistema de Controle de Tarefas (To-Do List) desenvolvido em **Java Puro**. O objetivo é demonstrar conceitos fundamentais de Programação Orientada a Objetos (POO), manipulação de coleções e interação básica via console.

---

## Funcionalidades

O sistema oferece as seguintes funcionalidades principais:

* **Adicionar Tarefa**: Permite ao usuário cadastrar novas tarefas com uma descrição.
* **Marcar Tarefa como Concluída**: Possibilita alterar o status de uma tarefa de "pendente" para "concluída" usando seu número na lista.
* **Listar Todas as Tarefas**: Exibe todas as tarefas cadastradas, indicando se estão pendentes ou concluídas.
* **Listar Tarefas Pendentes**: Mostra apenas as tarefas que ainda precisam ser realizadas.
* **Listar Tarefas Concluídas**: Exibe somente as tarefas que já foram finalizadas.

---

## Estrutura do Projeto

O projeto está organizado em dois pacotes principais para melhor modularização e separação de responsabilidades:

* **`model`**: Contém as classes que representam o **domínio do problema** e suas regras de negócio.
    * `Tarefa.java`: Representa uma única tarefa, com sua descrição e status (concluída/pendente).
    * `GerenciadorDeTarefas.java`: Gerencia a coleção de tarefas, contendo a lógica para adicionar, marcar como concluída e listar as tarefas de diferentes formas.
* **`application`**: Contém a classe principal que inicia a aplicação e lida com a **interação do usuário** via console.
    * `Main.java`: O ponto de entrada do programa, responsável por exibir o menu, ler a entrada do usuário e chamar os métodos apropriados do `GerenciadorDeTarefas`.
