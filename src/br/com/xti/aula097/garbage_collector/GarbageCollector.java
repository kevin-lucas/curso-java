/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.xti.aula097.garbage_collector;

import java.util.ArrayList;
import java.util.List;
import javax.xml.transform.Source;

/**
 *
 * @author Kevin Lucas
 */
public class GarbageCollector {

    /* Objetos sao criados com a palavra chave new, mais nao existe nenhuma
    operacao de delete para apagar esse objetos da memoria, quando termina
    de utilizar um objeto simplesmente para de acessa-lo e atribui null
    a ele, nesse momento o coletor de lixo realiza a limpeza dos dados, divido
    em duas partes, a primeira e a parte que separa objetos vivos de objetos mortos
    e depois limpa a memoria dos objetos mortos, os objetos vivos sao aqueles 
    alcansaveis por um codigo em execucao e os objetos mortos sao aqueles a serem
    colectados pelo coletor de lixo.
     */
    
    // Sobrecarregando a memoria
    public static long carregarMemoria() {
        List<Integer> lista = new ArrayList<>();
        for (int i = 0; i < 100_000; i++) {
            lista.add(i);
        }
        return Runtime.getRuntime().freeMemory();
    }

    public static void main(String[] args) {

        // Utilizandos os metodos
        Runtime runtime = Runtime.getRuntime();

        // Retorna a quantidade de memoria disponivel para a JVM executar (em bytes)
        System.out.println("runtime.maxMemory() = " + runtime.maxMemory());
        // Recuperando em megabytes
        int MB = 1_048_576;
        System.out.println("runtime.maxMemory()/MB = " + runtime.maxMemory() / MB);

        // Verificando a memoria antes e depois da execucao do metodo que sobrecarrega a memoria
        System.out.println("Inicio = " + runtime.maxMemory() / MB);
        System.out.println("Fim = " + ((runtime.maxMemory() / MB) - (carregarMemoria() / MB)));

        // Limpando a memoria
        runtime.runFinalization();
        runtime.gc();
        System.out.println("Fim = " + (runtime.freeMemory() / MB));

    }
}
