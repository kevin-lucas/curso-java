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
public class Produtor implements Runnable {

    /* As classes produtoras e consumidoras precisam receber uma ponte para que 
    possam compartilhar informacoes, essas classes tambem seram executadas em Threads separadas */
    private final Ponte ponte;

    public Produtor(Ponte ponte) {
        this.ponte = ponte;
    }

    // Gera os numeros aleatorios
    Random tempo = new Random();

    @Override
    // Responsavel por gerar  informacoes para serem adicionanas a Ponte
    public void run() {
        int total = 0;
        for (int i = 0; i < 5; i++) {
            try {
                // Determina um tempo de espera para a Thread executar
                Thread.sleep(tempo.nextInt(3000));

                // Armazena o valor total gerado pelo Produtor
                total += i;

                // Seta as informacoes na ponte
                ponte.set(i);

                // Exibe o valor total gerado pelo Produtor
                System.out.println("\t" + total);
            } catch (InterruptedException ex) {
            }
        }
    }
}
