/*
 * Curso Java XTI
 * Aula 042
 * Varargs
 */
package br.com.xti.aula042.varargs;

/**
 *
 * @author Kevin Lucas
 */
public class Matematica {

    // Com vargs é possivel passar a quantidade de argumentos indefinido para o metododo
    // Com isso o usuário pode informa a quantidade valores que seja para execucao
    double somar(double... numeros) {
        // o parametro numeros se torna um array
        double resultado = 0;
        for (double numero : numeros) {
            resultado += numero;
        }
        return resultado;
    }

    // Metodo com vargs e mais de um parametro
    double somatorio(String titulo, double... numeros) {
        System.out.println(titulo);
        double resultado = 0;
        for (double numero : numeros) {
            resultado += numero;
        }
        return resultado;
    }
}
