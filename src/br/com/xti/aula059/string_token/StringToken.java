/*
 * Curso Java XTI
 * Aula 058
 * String Operações
 */
package br.com.xti.aula059.string_token;

import java.util.Arrays;

/**
 *
 * @author Kevin Lucas
 */
public class StringToken {

    public static void main(String[] args) {

        // Texto com separador ;
        String texto = "Java;HTML;CSS;JavaScript";
        System.out.println(texto);

        // Retorna um array com os textos
        String[] tokens = texto.split(";");
        System.out.println("texto.split(\";\") = " + Arrays.toString(tokens));

        System.out.println("--- Textos separados ---");
        // Exibe os texto da string
        for (String token : tokens) {
            System.out.println(token);
        }
    }
}
