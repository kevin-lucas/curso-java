/*
 * Curso Java XTI
 * Aula 090
 * Collection Queue
 */
package br.com.xti.aula090.collection_queue;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author Kevin Lucas
 */
public class ColecaoQueue {

    public static void main(String[] args) {
        /* Coleções Queue representam filas de esperas */
        // As filas em geral obedecem a regra FIFO - First IN First OUT
        Queue<String> fila = new LinkedList<String>();

        // Elemento são adicionados ao final da fila
        fila.add("Fulano 1");
        fila.add("Fulano 2");
        fila.add("Fulano 3");

        // Oferece um elemento a fila, ambos adiciona elemento ao final da fila
        fila.add("Fulano 4");
        fila.offer("Fulano 5");

        // Informa o proximo elemento da fila
        System.out.println("fila.peek() = " + fila.peek());

        // Remove o proximo elemento da fila
        System.out.println("fila.poll() = " + fila.poll());

        // Exibe a fila
        System.out.println("fila.toString() = " + fila.toString());

        /* Outros metodos diponiveis em LinkedList */
        LinkedList<String> linkedList = (LinkedList<String>) fila;

        // Adiciona o elemento ao inicio da fila
        linkedList.addFirst("Fulano 0");

        // Adiciona o elemento ao final da fila
        linkedList.addLast("Fulano 6");

        // Exibe a fila
        System.out.println("fila.toString() = " + fila.toString());

        // Informa elementos do incio e do final da fila
        System.out.println("linkedList.peekFirst() = " + linkedList.peekFirst());
        System.out.println("linkedList.peekLast() = " + linkedList.peekLast());

         // Remove elementos do incio e do final da fila
        System.out.println("linkedList.pollFirst() = " + linkedList.pollFirst());
        System.out.println("linkedList.pollLast() = " + linkedList.pollLast());
        
        // Exibe a fila
        System.out.println("fila.toString() = " + fila.toString());
    }
}
