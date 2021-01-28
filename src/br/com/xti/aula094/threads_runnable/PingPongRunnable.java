/*
 * Curso Java XTI
 * Aula 094
 * Threads, runnable
 */
package br.com.xti.aula094.threads_runnable;

/**
 *
 * @author Kevin Lucas
 */
public class PingPongRunnable implements Runnable {

    /* Toda Thread implementa a classe Runnable, o unico metodo obrigatorio que 
    a classe deve implementar e o metodo run(), por isso para tornar a classe uma
    Thread pode ser implementado somente a classe Runnable.
     */
    String palavra;
    long milissegundos;

    public PingPongRunnable(String palavra, long milissegundos) {
        this.palavra = palavra;
        this.milissegundos = milissegundos;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println(palavra);
                Thread.sleep(milissegundos);
            }
        } catch (InterruptedException interruptedException) {
            return;
        }
    }

    public static void main(String[] args) {

        // Utilizando o metodo run()
        Runnable ping = new PingPongRunnable("ping", 1500);
        Runnable pong = new PingPongRunnable("PONG", 1500);

        // Executando os objetos
        new Thread(ping, "ping").start();
        new Thread(pong, "pong").start();

        System.out.println("Ver Threads");
    }
}
