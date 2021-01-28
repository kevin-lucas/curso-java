/**
 * Curso Java XTI
 * Aula 15
 * Operadores de Comparação
 */
package br.com.xti.aula015.operadores_comparacao;

/**
 *
 * @author Kevin Lucas
 *
 */
public class OperadoresComparacao {

    public static void main(String[] args) {
        /* Operadores realizam expressoes booleanas com valores */

        // Vefica se o valor é menor que o outro valor e retorna um valor booleano
        System.out.println(10 < 5);

        // Vefica se o valor é igual que o outro valor e retorna um valor booleano
        System.out.println(10 == 5);

        // Não é possível verificar devido a diferença entre os tipos
        //System.out.println(10 < "5");
        // Verificar se o valor são diferentes
        System.out.println(10 != 5);

        // Verifica se o valor é maior que o outro valor
        System.out.println(10 > 5);

        // Verifica se o valor é menor ou igual ao outro valor
        System.out.println(10 <= 5);

        // Verifica se o valor é maior ou igual a outro valor
        System.out.println(10 >= 5);

        // Verificar o tipo do valor
        Integer numero = 10;
        System.out.println(numero instanceof Integer);
    }
}
