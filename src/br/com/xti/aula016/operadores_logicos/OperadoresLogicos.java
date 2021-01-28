/**
 * Curso Java XTI
 * Aula 16
 * Operadores Lógicos
 */
package br.com.xti.aula016.operadores_logicos;

/**
 *
 * @author Kevin Lucas
 *
 */
public class OperadoresLogicos {

    public static void main(String[] args) {

        // AND
        // Verifica se expressoes são verdadeiras
        System.out.println((true) && (true));
        System.out.println((5 < 10) && (5 == 10));

        // OR
        // Verifica se pelo menos uma das expressoes é verdadeira e retorna true
        System.out.println((true) || (true));
        System.out.println((5 < 10) || (5 == 10));

        // NOT
        // Inverte o valor final da expressao
        System.out.println(!(true) && (true));
        System.out.println(!(5 < 10) && (5 == 10));
    }
}
