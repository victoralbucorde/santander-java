package edu.victor.collectionsJava.exercicios.Set.conjuntoDePalvrasUnicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoDePalavrasUnicas {
    private Set<String> conjuntoPalavra;

    public ConjuntoDePalavrasUnicas() {
        this.conjuntoPalavra = new HashSet<>();
    }

    public void adicionarPalavra(String palavra){
        this.conjuntoPalavra.add(palavra);
    }

    public void removerPalavra(String palavra){
        if (!conjuntoPalavra.isEmpty()){
            if(conjuntoPalavra.contains(palavra)){
                conjuntoPalavra.remove(palavra);
            }else{
                System.out.println("Palavra nao encontrada.");
            }
        }else{
            throw new RuntimeException("Conjunto vazio");
        }
    }

    public boolean verificarPalavra(String palavra){
        return conjuntoPalavra.contains(palavra);
    }

    public void exibirPalavrasUnicas(){
        if(!conjuntoPalavra.isEmpty()){
            System.out.println(conjuntoPalavra);
        }else {
            throw new RuntimeException("Conjunto vazio");
        }
    }

}
