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
// A inteface Ponte representa a relacao entre as classes produtoras e consumidoras.
public interface Ponte {

    /* Imagine que tenha um  conjunto de Threads que executam vários metodos,
    onde que para executar 1 (um)  metodo outro metodo totalmente diferente
    precisa ser bloqueado., esse é em nivel de sincronizacao mais complexo
    que aparecem entre classes Produtoras e Consumidoras de informacao, nesse
    tipo de relacionamento a classe produtora armazena dados em um objeto que é 
    ccompartilhado com as classes consumidoras, e as classes consumidoras leem
    esses dados compartilhados e os processas. */
    // Metodo responsavel por inserir valores nas classes produtoras
    public void set(int valor) throws InterruptedException;

    // Metodo que recupera as informacoes da classes produtoras
    public int get() throws InterruptedException;
}
