/**
 * Curso Java XTI
 * Aula 009
 * Constantes
 *
 */
package br.com.xti.aula009.constantes;

/**
 *
 * @author Kevin Lucas
 *
 */
public class Constantes {

    public static void main(String[] args) {
        // Para definir uma constantes utiliza a palavra reservada final
        final double PI = 3.14;
        // PI = 10.0; // Não é possível alterar valores das constantes.
        System.out.println(PI);

        // Exemplos
        final char SEXO_MASCULINO = 'M';
        final char SEXO_FEMININO = 'F';
        System.out.println(SEXO_MASCULINO);
        System.out.println(SEXO_FEMININO);
    }

}
