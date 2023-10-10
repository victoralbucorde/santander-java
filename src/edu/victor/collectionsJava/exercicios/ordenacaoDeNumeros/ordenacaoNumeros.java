package edu.victor.collectionsJava.exercicios.ordenacaoDeNumeros;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ordenacaoNumeros {
    private List<Integer> integerList;

    public ordenacaoNumeros() {
        this.integerList = new ArrayList<>();
    }

    public void adicionarNumero(int numero){
        this.integerList.add(numero);
    }

    public List<Integer> ordenarCrescente(){
        List<Integer> numerosCrescentes = new ArrayList<>(this.integerList);
        if (!integerList.isEmpty()){
            Collections.sort(numerosCrescentes);
            return numerosCrescentes;
        }else{
            throw new RuntimeException("Lista vazia.");
        }
    }

    public List<Integer> ordenarDecrescente(){
        List<Integer> numerosDecrescentes = new ArrayList<>(this.integerList);
        if(!integerList.isEmpty()){
            numerosDecrescentes.sort(Collections.reverseOrder());
            return numerosDecrescentes;
        }else {
            throw new RuntimeException("Lista vazia");
        }
    }
}
