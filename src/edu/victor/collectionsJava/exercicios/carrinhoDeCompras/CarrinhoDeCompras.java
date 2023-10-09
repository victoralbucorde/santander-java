package edu.victor.collectionsJava.exercicios.carrinhoDeCompras;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Item> listaDeCompras;

    public CarrinhoDeCompras() {
        this.listaDeCompras = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade){
        listaDeCompras.add(new Item(nome,preco,quantidade));
    }

    public void removerItem(String nome){
        List<Item> listaParaRemover = new ArrayList<>();

        if(!listaDeCompras.isEmpty()){
            for(Item i : listaDeCompras){
                if(i.getNome().equalsIgnoreCase(nome)){
                    listaParaRemover.add(i);
                }
            }
            listaDeCompras.removeAll(listaParaRemover);
        }else{
            System.out.println("Lista está vazia!");
        }
    }

    public double calcularValorTotal() {
        double sum = 0;
        if (!listaDeCompras.isEmpty()){
            for (Item i : listaDeCompras){
                sum += i.getPreco() * i.getQuantidade();
            }
            return sum;
        }else{
            throw new RuntimeException("A lista está vazia!");
        }
    }

    @Override
    public String toString() {
        return "CarrinhoDeCompras{" +
                "listaDeCompras=" + listaDeCompras +
                '}';
    }

    public void exibirItens(){
        if (!listaDeCompras.isEmpty()){
            System.out.println(listaDeCompras);
        }else{
            System.out.println("A lista está vazia");
        }
    }
}
