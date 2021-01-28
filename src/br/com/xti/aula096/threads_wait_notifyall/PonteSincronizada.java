/*
 * Curso Java XTI
 * Aula 096
 * Threads, wait e notifyAll
 */
package br.com.xti.aula096.threads_wait_notifyall;

/**
 *
 * @author Kevin Lucas
 */
public class PonteSincronizada implements Ponte {

    /* O Produtor deve produzir um valor e a Consumir deve consumir esse valor em
    seguida.
     */
    int valor = -1;

    /* As Threads devem esperar por uma condicao pre-determinada para que executem
    os metodos get ou set. Os Produtor deve gerar um novo valor quando a Ponte esteja
    vazia ou desocupada, e o Consumidor deve consumir quando a Ponte nao estiver vazia
    ou ocupada. */
    // Representa que a ponte esta vazia ou disponivel
    private boolean ocupada = false;

    // Implementacao da sincronizacao
    // synchronized para definir que os metodos devem ser executado uma de cada vez
    @Override
    public synchronized void set(int valor) throws InterruptedException {
        // Verifica se a Ponte esta oucupada ou cheia
        while (ocupada) {
            // Informa que a Ponte está ocupada
            System.out.println("Ponte cheia. Produto aguardando!");
            // wait() faz a Thread que esta executando o metodo aguardar
            wait(); // pertence a classe Object
        }
        // Caso a Ponte esteja disponivel o Produtor produz um valor
        System.out.print("Produziu " + valor);
        this.valor = valor;

        // Coloca a Ponte no estado de ocupada
        ocupada = true;

        /* Informa ou notifica para Thread que esta aguardando que pode ser 
        executado */
        notifyAll(); // pertence a classe Object
    }

    @Override
    public synchronized int get() throws InterruptedException {
        while (!ocupada) {
            System.out.println("Ponte vazia. Consumidor aguardando");
            wait();
        }

        System.err.print("Consumiu " + valor);
        ocupada = false;
        // Indica para Thread que estao aguardando a continuacao da execucao
        notifyAll();
        return valor;
    }
}
