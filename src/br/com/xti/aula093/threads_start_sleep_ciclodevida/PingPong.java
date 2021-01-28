/*
 * Curso Java XTI
 * Aula 093
 * Threads, start, sleep, Ciclo de Vida
 */
package br.com.xti.aula093.threads_start_sleep_ciclodevida;

/**
 *
 * @author Kevin Lucas
 */

/* Thread implementa a interface Runnable que define um objeto executado, todo 
objeto executavel pussui um metodo run(), todo programa java roda em uma Thread.
 */
public class PingPong extends Thread {

    /* Programa ira imprimir uma palavra de tempo em tempo */
    String palavra;
    long milissegundos;

    public PingPong(String palavra, long milissegundos) {
        this.palavra = palavra;

        // O tempo das Threads sao definidas em milessegundos
        this.milissegundos = milissegundos;
    }

    /* Metodo run() executa as Threads colocando-a no estado de pronto, o metodo
    deve ser chamado pela JVM */
    @Override
    public void run() {
        try {
            // Imprime a palavra por um numero determinado de vezes
            for (int i = 0; i < 5; i++) {
                System.out.println(palavra);
                /*  Faz com que a Thread aguarde no estado "esperando" determinado
            tempo para ser executada novamente, esse metodo lanca uma execao */
                Thread.sleep(milissegundos);
            }
        } catch (InterruptedException interruptedException) {
            /* Para a Thread quando a execao acontecer, a execao ocorre quando
            o run() para de ser executado */
            return;
        }
    }

    public static void main(String[] args) {
        // Cria uma instancia da classe Thread
        Thread thread = new Thread();

        // Roda na Thread principal
        System.out.println("Ver Thread");

        // ---------------------------------------------------------------------
        // Cria uma nova Thread e a coloca no estado de "pronto" com metodo start()
        new PingPong("ping", 1500).start();
        new PingPong("PONG", 2000).start();
    }
}
