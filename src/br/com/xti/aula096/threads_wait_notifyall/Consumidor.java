/*
 * Curso Java XTI
 * Aula 096
 * Threads, wait e notifyAll
 */
package br.com.xti.aula096.threads_wait_notifyall;

import java.util.Random;

/**
 *
 * @author Kevin Lucas
 */
public class Consumidor implements Runnable {

    /* As classes produtoras e consumidoras precisam receber uma ponte para que 
    possam compartilhar informacoes, essas classes tambem seram executadas em Threads separadas */
    private Ponte ponte;

    public Consumidor(Ponte ponte) {
        this.ponte = ponte;
    }

    // Gera os numeros aleatorios
    Random tempo = new Random();

    @Override
    // Responsavel por ler as informacoes gerados pelo Produtor
    public void run() {
        int total = 0;
        for (int i = 0; i < 5; i++) {
            try {
                // Determina um tempo de espera para a Thread executar
                Thread.sleep(tempo.nextInt(3000));

                // Le as informacoes geradas pelo Produtor e armazena.
                total += ponte.get();
                System.err.println("\t" + total);
            } catch (InterruptedException ex) {
            }
        }
    }
}
