/*
 * Curso Java XTI
 * Aula 043
 * Metodos Sobrecarregados
 */
package br.com.xti.aula043.metodos_sobrecarregados;

/**
 *
 * @author Kevin Lucas
 */
public class MatematicaTest {

    public static void main(String[] args) {
        Matematica matematica = new Matematica();
        System.out.println(matematica.soma(3, 2));
        System.out.println(matematica.soma(3, 2, 4));
        System.out.println(matematica.media(3, 2));
        System.out.println(matematica.media(3, 2, 4));
    }
}
