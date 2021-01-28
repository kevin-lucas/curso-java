/*
 * Curso Java XTI
 * Aula 37
 * Metodos com retorno
 */
package br.com.xti.aula037.metodos_retorno;

/**
 *
 * @author Kevin Lucas
 */
public class MatematicaTest {

    public static void main(String[] args) {

        Matematica matematica = new Matematica();
        System.out.println(matematica.somar(5, 5));
        System.out.println(matematica.divide(10, 5));
        System.out.println(matematica.maiorNumero(19, 2));
    }
}
