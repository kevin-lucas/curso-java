/*
 * Curso Java XTI
 * Aula 22
 * Array Lista
 */
package br.com.xti.aula022.array_list;

import java.util.ArrayList;

/**
 *
 * @author Kevin Lucas
 */
public class ArrayLista {

    public static void main(String[] args) {
        // Cria uma lista 
        ArrayList<String> cores = new ArrayList<>();
        cores.add("Azul");
        cores.add("Verde");
        cores.add("Vermelho");
        cores.add("Branco");
        System.out.println(cores.toString());

        // Informações da lista
        // Tamanho do array
        System.out.println(cores.size());

        // Elemento que está na posicao
        System.out.println(cores.get(2));

        // Posicao do elemento no array
        System.out.println(cores.indexOf("Branco"));

        // Manipulação na lista
        // Remove elemento da lista
        System.out.println(cores.remove("Branco"));
        System.out.println(cores.toString());

        // Verificacoes na lista
        // Vefifica se existe na lista
        System.out.println(cores.contains("Branco"));
    }
}
