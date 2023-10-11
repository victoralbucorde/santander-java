package edu.victor.collectionsJava.exercicios.listaDeTarefas;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {
    private Set<Tarefa> listaTarefa;

    public ListaTarefas() {
        this.listaTarefa = new HashSet<>();
    }

    public void adicionarTarefa(String descricao){
        listaTarefa.add(new Tarefa(descricao,false));
    }

    public void removerTarefa(String descricao){
        if(!listaTarefa.isEmpty()){
            for(Tarefa t : listaTarefa){
                if(t.getDescricao().equalsIgnoreCase(descricao)){
                    listaTarefa.remove(t);
                    break;
                }
            }
        }else {
            throw new RuntimeException("Lista de tarefas vazia");
        }
    }

    public void exibirTarefas(){
        if (!listaTarefa.isEmpty()){
            System.out.println(listaTarefa);
        }else{
            throw new RuntimeException("Lista de tarefas vazia");
        }
    }

    public void contarTarefas(){
        System.out.println(listaTarefa.size());
    }

    public Set<Tarefa> obterTarefasConcluidas(){
        if (!listaTarefa.isEmpty()){
            Set<Tarefa> listaConcluida = new HashSet<>();
            for (Tarefa t : listaTarefa){
                if (t.getConcluida()){
                    listaConcluida.add(t);
                }
            }
            return listaConcluida;
        }else {
            throw new RuntimeException("Lista de tarefas vazia");
        }
    }

    public Set<Tarefa> obterTarefasPendentes(){
        if (!listaTarefa.isEmpty()){
            Set<Tarefa> listaPendente = new HashSet<>();
            for (Tarefa t : listaTarefa){
                if (!t.getConcluida()){
                    listaPendente.add(t);
                }
            }
            return listaPendente;
        }else {
            throw new RuntimeException("Lista de tarefas vazia");
        }
    }

    public void marcarTarefaConcluida(String descricao){
        for (Tarefa t : listaTarefa){
            if (t.getDescricao().equalsIgnoreCase(descricao)){
                t.setConcluida(true);
            }
        }
    }

    public void marcarTarefaPendente(String descricao){
        for(Tarefa t : listaTarefa){
            if (t.getDescricao().equalsIgnoreCase(descricao)){
                t.setConcluida(false);
            }
        }
    }

    public void limparListaTarefas(){
        if(listaTarefa.isEmpty()) {
            System.out.println("A lista de tarefas já é vazia");
        } else {
            listaTarefa.clear();
        }
    }
}
