package edu.victor.collectionsJava.exercicios.listaDeAlunos;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class ListaAlunos {
    private Set<Aluno> alunoSet;

    public ListaAlunos() {
        this.alunoSet = new HashSet<>();
    }

    public void adicionarAluno(String nome, Long matricula, double media){
        this.alunoSet.add(new Aluno(nome,matricula,media));
    }

    public void removerAluno(long matricula){
        Aluno alunoRemover = null;
        if(!alunoSet.isEmpty()){
            for(Aluno a : alunoSet){
                if (a.getMatricula() == matricula){
                    alunoRemover = a;
                    break;
                }
            }
            alunoSet.remove(alunoRemover);
        }else{
            throw new RuntimeException("Lista de alunos vazia");
        }
        if (alunoRemover == null ){
            System.out.println("Matricula nao encontrada");
        }
    }

    public void exibirAlunosPorNome(){
        Set<Aluno> alunosPorNome = new TreeSet<>(alunoSet);
        if (!alunosPorNome.isEmpty()){
            System.out.println(alunosPorNome);
        }else{
            System.out.println("Lista de alunos vazia");
        }
    }

    public void exibirAlunosPorNota() {
        Set<Aluno> alunosPorNota = new TreeSet<>(new ComparatorNota());
        if (!alunoSet.isEmpty()) {
            alunosPorNota.addAll(alunoSet);
            System.out.println(alunosPorNota);
        } else {
            System.out.println("O conjunto está vazio!");
        }
    }
}
