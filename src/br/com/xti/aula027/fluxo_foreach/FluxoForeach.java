/*
 * Curso Java XTI
 * Aula 27
 * Floxo Foreach
 */
package br.com.xti.aula027.fluxo_foreach;

import java.util.ArrayList;

/**
 *
 * @author Kevin Lucas
 */
public class FluxoForeach {

    public static void main(String[] args) {

        /* Utlizando para pecorre arrays */
        int[] numeros = {1, 2, 3, 4, 5};

        // Pecorre cada elemento do array e excuta a instução
        for (int numero : numeros) {
            System.out.println(numero);
        }

        System.out.println("----------------------");

        String[] times = {"Cruzeiro", "São Paulo", "Bahia"};
        for (String time : times) {
            System.out.println(time.toUpperCase());
        }

        System.out.println("----------------------");

        ArrayList<Integer> lista = new ArrayList<>();
        for (int i = 0; i <= 10; i++) {
            lista.add(i);
        }
        System.out.println(lista.toString());

    }
}
