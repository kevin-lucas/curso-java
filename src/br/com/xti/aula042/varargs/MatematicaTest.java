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
public class MatematicaTest {

    public static void main(String[] args) {
        Matematica matematica = new Matematica();
        System.out.println(matematica.somar(10, 20, 6.9, 9.0, 5, 3, 4));
        System.out.println(matematica.somatorio("Multiplicar", 7, 2));
    }
}
