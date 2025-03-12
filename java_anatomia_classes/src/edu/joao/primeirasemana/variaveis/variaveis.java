package edu.joao.primeirasemana.variaveis;

import java.util.Scanner;

public class variaveis {
    public static void main(String[] args) {
        String meuNome;

        int anoFabricacao = 2022;

        boolean sim = true;
        boolean nao = false;

        Scanner sc = new Scanner(System.in);

        System.out.println("digite seu nome:");
        meuNome = sc.next();
        System.out.println(meuNome);
    }
}
