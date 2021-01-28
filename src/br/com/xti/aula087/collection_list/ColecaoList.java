/*
 * Curso Java XTI
 * Aula 087
 * Collection List
 */
package br.com.xti.aula087.collection_list;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Kevin Lucas
 */
public class ColecaoList {

    public static void main(String[] args) {

        // Criando uma colecao
        List<String> listaEsportes = new ArrayList<String>();

        // Adicionando dados a lista
        listaEsportes.add("Futebol");
        listaEsportes.add("Vôlei");
        listaEsportes.add("Tênis");
        listaEsportes.add("Boxe");
        listaEsportes.add("Natação");

        // Exibindo a lista
        System.out.println("listaEsportes.toString() = " + listaEsportes.toString());

        /* Trasforma as letras da lista em maíusculas */
        for (int i = 0; i < listaEsportes.size(); i++) {
            // Pega o texto da posicao i da lista
            String letra = listaEsportes.get(i);
            // Trasforma o texto da posicao i em maiusculo
            listaEsportes.set(i, letra.toUpperCase());
        }

        // Retorna a posição do elemento caso exista na lista
        // Retorna -1 caso o elemento não exista na lista
        System.out.println("listaEsportes.indexOf(\"Boxe\")" + listaEsportes.indexOf("Boxe"));

        // Exibe uma parte determinada da lista
        System.out.println(listaEsportes.subList(2, 4));

        // Limpa determinada parte da lista
        listaEsportes.subList(2, 4).clear();

        // Exibindo a lista
        System.out.println("listaEsportes.toString() = " + listaEsportes.toString());
    }
}
