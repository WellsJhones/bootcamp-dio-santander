package edu.wells.operadores;

public class Operadores {
    int num = 1;
    int num2 = -num;

    public void operadoresAritmeticos() {
        int soma = 1 + 1;
        int subtracao = 1 - 1;
        int multiplicacao = 2 * 2;
        int divisao = 4 / 2;
        int resto = 5 % 2;
        System.out.println("Soma: " + soma);
        System.out.println("Subtração: " + subtracao);
        System.out.println("Multiplicação: " + multiplicacao);
        System.out.println("Divisão: " + divisao);
        System.out.println("Resto: " + resto);

    }

    public void ternario() {
        int a = 1;
        int b = 2;
        int c = 3;
        int maior = (a > b) ? a : b;
        int maior2 = (a > b) ? ((a > c) ? a : c) : ((b > c) ? b : c);
        System.out.println("Maior: " + maior);
        System.out.println("Maior2: " + maior2);
    }

}
