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
public class ComprasEmFamilia implements Runnable {

    // Conta compartilhada por todos
    ContaConjunta contaConjunta = new ContaConjunta();

    public static void main(String[] args) {

        ComprasEmFamilia irAsCompras = new ComprasEmFamilia();

        // Realizando as compras
        new Thread(irAsCompras, "Pai").start();
        new Thread(irAsCompras, "Filha").start();
        new Thread(irAsCompras, "Babá").start();
        new Thread(irAsCompras, "Mãe").start();
    }

    @Override
    public void run() {

        String cliente = Thread.currentThread().getName();

        for (int i = 0; i < 5; i++) {
            // Responsavel pela compra
            contaConjunta.sacar(20, cliente);
            if (contaConjunta.getSaldo() < 0) {
                System.out.println("Conta estorou!");
            }
        }
    }

}
