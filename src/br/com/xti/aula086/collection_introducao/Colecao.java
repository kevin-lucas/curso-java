/*
 * Curso Java XTI
 * Aula 085
 * Collection Introdução
 */
package br.com.xti.aula086.collection_introducao;

import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author Kevin Lucas
 */
public class Colecao {

    public static void main(String[] args) {

        /* Coleções */
        //Criando uma coleção
        Collection<String> colecao = new ArrayList<String>();

        // Adicionando dados a colecao
        colecao.add("A");
        colecao.add("E");
        colecao.add("I");

        // Exibindo a colecao
        System.out.println("colecao.toString() = " + colecao.toString());

        // Verifica se a colecao está vazia
        System.out.println("colecao.isEmpty() = " + colecao.isEmpty());

        // Verifica se existe o dado na colecao
        System.out.println("colecao.contains(\"A\") = " + colecao.contains("A"));

        // Removendo dados da colecao
        colecao.remove("I");
        System.out.println("colecao.remove(\"I\") = " + colecao.toString());

        /* Grupo de elementos */
        // Crindo outra colecao
        Collection<String> colecao2 = new ArrayList<String>();
        // Adicionando dados a outra colecao
        colecao2.add("I");
        colecao2.add("O");
        colecao2.add("U");
        System.out.println("colecao2.toString() = " + colecao2.toString());

        // Adicionando uma colecao em outra
        colecao.addAll(colecao2);
        System.out.println("colecao.addAll(colecao2) = " + colecao);

        // Verifica se existe um conjunto de elementos
        System.out.println("colecao.containsAll(colecao2) = " + colecao.containsAll(colecao2));

        // Remove todos os elemento da colecao2 da colecao
        colecao.removeAll(colecao2);
        System.out.println("colecao.removeAll(colecao2) = " + colecao.toString());

        // Percorre a colecao
        for (String texto : colecao) {
            System.out.println("for (String texto : colecao) = " + texto);
        }
    }
}
