/*
 * Curso Java XTI
 * Aula 29
 * Desafio Fibonacci
 */
package br.com.xti.aula029.fibonacci;

/**
 *
 * @author Kevin Lucas
 */
public class DesafioFibonacci {

    public static void main(String[] args) {
        int anterior = 1;
        int proximo = 2;
        System.out.println(anterior);
        
        while (proximo < 100) {            
            System.out.println(proximo);
            proximo = proximo + anterior;
            anterior = proximo - anterior;
        }
    }
}
