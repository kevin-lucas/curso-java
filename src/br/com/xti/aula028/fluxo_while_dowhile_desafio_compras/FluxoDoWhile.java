/*
 * Curso Java XTI
 * Aula 28
 * Floxo Do While
 */
package br.com.xti.aula028.fluxo_while_dowhile_desafio_compras;

/**
 *
 * @author Kevin Lucas
 */
public class FluxoDoWhile {

    public static void main(String[] args) {

        /* Executa a instrucao enquanto determinada codição não seja atendida, 
        porem executa a instrucao pelo menos uma vez */
        int numero = 0;

        do {
            System.out.println(numero);
            numero++;
        } while (numero <= 10);

    }
}
