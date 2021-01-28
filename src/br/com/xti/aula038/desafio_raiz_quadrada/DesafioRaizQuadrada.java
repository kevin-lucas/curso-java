/*
 * Curso Java XTI
 * Aula 38
 * Desafio Raiz Quadrada
 */
package br.com.xti.aula038.desafio_raiz_quadrada;

/**
 *
 * @author Kevin Lucas
 */
public class DesafioRaizQuadrada {

    // Realiza o calculo da raiz quadrada
    int raizQuadrada(int numero) {
        
        int impar = 1;
        int raiz = 0;

        do {
            numero -= impar;
            impar += 2;
            ++raiz;
        } while (numero >= impar);
        return raiz;
    }

}
