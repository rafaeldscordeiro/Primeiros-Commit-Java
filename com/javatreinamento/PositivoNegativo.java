package com.javatreinamento;

import java.util.*;

public class PositivoNegativo {
    public static void main(String[] args) {
        String[] elementos = {"banana", "laranja", "maçã", "uva", "abacaxi"};

        // Ordenar o array em ordem alfabética
        Arrays.sort(elementos);

        // Exibir os elementos ordenados
        for (String elemento : elementos) {
            System.out.println(elemento);
        }
    }
}
