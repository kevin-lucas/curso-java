/*
 * Curso Java XTI
 * Aula 095
 * Threads, synchronized
 */
package br.com.xti.aula095.threads_synchronized;

/**
 *
 * @author Kevin Lucas
 */
public class ContaConjunta {

    /* Imagine a situacao em que voce ja sabe trabalhar com Threads e foi contratado
    por um banco para contruir um sistema de saques de contas conjuntas, onde varias
    pessoas podem utilizar mesma conta ao mesmo tempo.
    Em uma conta conjunta varias pessoas podem tentar sacar uma valor ao mesmo tempo,
    caso a conta tenha 100 reais de saldo e 3 pessoa saquem essa valor ao mesmo tempo
    seria sacado 300 reais de uma saldo de 100, esse problema precisa ser resolvido.
    A ideia para resolver e que quando uma operacao de saque esteja em execusao ela seja
    bloqueada e quando finalizar ela desbloqueia para outras Threads executarem.
     */
    private int saldo = 100;

    public int getSaldo() {
        return saldo;
    }

    /* O modificador synchronized faz que as Threads sejam sincronizadas, isso significa
    que os blocos(if, for, metodos etc) não interfiram uma com as outras (Threads).
    */
    public synchronized void sacar(int valor, String cliente) {
        int saldoOriginal = saldo;
        if (saldo >= valor) {
            System.out.println(cliente + " vai sacar");
            try {
                // Simula o tempo para que o sistema verifique os dados necessarios para o saldo
                System.out.println(cliente + " ,aguardando o processamento!");
                Thread.sleep(1000);

            } catch (InterruptedException ex) {
            }
            saldo -= valor;
            String mensagem = cliente + " SACOU " + valor
                    + " [Saldo Original] =" + saldoOriginal + ", [Saldo Final]=" + saldo;
            System.out.println(mensagem);
        } else {
            System.out.println("Saldo insuficiente para " + cliente);
        }
    }
}
