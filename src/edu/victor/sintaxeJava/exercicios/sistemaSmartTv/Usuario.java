package edu.victor.sintaxeJava.exercicios.sistemaSmartTv;

import java.util.Locale;
import java.util.Scanner;

public class Usuario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        SmartTv smartTv = new SmartTv();

        smartTv.canal = scanner.nextInt();

    }
}
