package edu.victor.sintaxeJava.exercicios.sistemaSmartTv;

public class SmartTv {
    boolean ligadoDesligado = false;
    int canal = 1;
    int volume = 0;

    public void ligarDesligar() {
        ligadoDesligado = !ligadoDesligado;
    }

    public void mudarCanal(int qualCanal){
        canal = qualCanal;
    }

    public void aumentarCanal() {
        canal++;
    }

    public void diminuirCanal() {
        if (canal != 1){
            canal--;
        }
    }

    public void aumentarVolume() {
        if (volume != 100){
            volume++;
        }
    }

    public void diminuirVolume() {
        if(volume != 0){
            volume--;
        }
    }
}
