/*
 * Curso Java XTI
 * Aula 088
 * Collection Utilitário Collections
 */
package br.com.xti.aula088.collection_utilitario_collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Kevin Lucas
 */
public class ColecaoUtilitario {

    public static void main(String[] args) {

        // Collections é um dos utilitários utilizado para a manipulacão de coleções java,
        // Criada para manipulacao de todo tipo de lista 
        List<String> frutas = new ArrayList<String>();
        frutas.add("Guaraná");
        frutas.add("Açai");
        frutas.add("Manga");
        frutas.add("Cocô");
        frutas.add("Banana");
        System.out.println(frutas);

        // Ordena a lista em ordem alfabetica
        Collections.sort(frutas);
        System.out.println("Collections.sort(frutas) = " + frutas);

        // Inverte a ordem dos dados
        Collections.reverse(frutas);
        System.out.println("Collections.reverse(frutas) = " + frutas);

        // Coloca a ordem de forma aleatoria
        Collections.shuffle(frutas);
        System.out.println("Collections.shuffle(frutas) = " + frutas);

        // Adiciona elementos a lista
        Collections.addAll(frutas, "Cupuaçú", "Laranja", "Manga");
        System.out.println("Collections.addAll(frutas, \"Cupuaçú\", \"Laranja\", \"Manga\") = " + frutas);

        // Verifica quantas vezes o elemento aparece na lista
        System.out.println("Collections.frequency(frutas, \"Manga\") = " + Collections.frequency(frutas, "Manga"));

        // Verifica se na lista existe um conjunto de palavras
        List<String> frutas2 = Arrays.asList("Acerola", "Graviola");
        System.out.println("Collections.disjoint(frutas, frutas2) = " + Collections.disjoint(frutas, frutas2));

        // Exibe o indice de um elemento
        Collections.sort(frutas);
        System.out.println("Collections.binarySearch(frutas, \"Laranja\") = " + Collections.binarySearch(frutas, "Laranja"));

        // Preenche todas as posicoes com a string 
        Collections.fill(frutas, "fruta");
        System.out.println("Collections.fill(frutas, \"fruta\") = " + frutas);

        // Criando uma colecao imutavel ou seja constante (tipo final)
        Collections.unmodifiableCollection(frutas);
        System.out.println("Collections.unmodifiableCollection(frutas)" + frutas);
    }
}
