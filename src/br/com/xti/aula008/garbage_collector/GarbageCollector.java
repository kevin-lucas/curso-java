/**
 * Curso Java XTI
 * Aula 008
 * Garbage Collector
 *
 */
package br.com.xti.aula008.garbage_collector;

/**
 *
 * @author Kevin Lucas
 *
 */
public class GarbageCollector {

    public static void main(String[] args) {

        // Variável primitiva contém o valor 10
        int numero = 10;
        // Variável contém o valor 5 e o valor 10 não existe mais na memória.
        numero = 5;

        // Garbage Collector
        String texto = "Olá";

        // Valor da variável é "Mundo" porém o valor "Olá" ainda existe na memória
        texto = "Mundo";

        // O coletor de lixo é acionado para limpar os valores que não estão sendo mais utilizados.
        texto = null;

        System.out.println(numero);
        System.out.println(texto);
    }
}
