package edu.victor.collectionsJava.exercicios.somaDeNumeros;

import javax.naming.InterruptedNamingException;
import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {

    private List<Integer> integerList;

    public SomaNumeros() {
        this.integerList = new ArrayList<>();
    }

    public void adicionarNumero(int numero){
        this.integerList.add(numero);
    }

    public int calcularSoma(){
        int sum = 0;
        if(!integerList.isEmpty()){
            for(int i : integerList){
                sum += i;
            }
            return sum;
        }else{
            throw new RuntimeException("Lista vazia");
        }
    }

    public int encontrarMaiorNumero(){
        int maior = Integer.MIN_VALUE;
        if(!integerList.isEmpty()){
            for(Integer i : integerList){
                if(i >= maior){
                    maior = i;
                }
            }
            return maior;
        }else {
            throw new RuntimeException("Lista vazia.");
        }
    }

    public int encontrarMenorNumero(){
        int menor = Integer.MAX_VALUE;
        if(!integerList.isEmpty()){
            for(Integer i : integerList){
                if(i <= menor){
                    menor = i;
                }
            }
            return menor;
        }else {
            throw new RuntimeException("Lista vazia.");
        }
    }

    public void exibirNumeros(){
        if(!integerList.isEmpty()){
            System.out.println(integerList);
        }else {
            throw new RuntimeException("lista vazia");
        }
    }
}
