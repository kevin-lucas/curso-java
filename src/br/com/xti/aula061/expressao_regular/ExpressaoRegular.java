/*
 * Curso Java XTI
 * Aula 061
 * Regular Expression regex Expressão Regular
 */
package br.com.xti.aula061.expressao_regular;

/**
 *
 * @author Kevin Lucas
 */
public class ExpressaoRegular {

    public static void main(String[] args) {

        /* Espressoes regulares provê uma forma concisa e flexível de identificar
        cadeias de caracteres de interesse, como caracteres particulares, palavras 
        ou padrões de caracteres. */
        String padrao = "texto";
        String texto = "texto";

        // Compara a string com padrao estabelecido
        System.out.println("texto.matches(padrao) = " + texto.matches(padrao));

        // Modificadores
        System.out.println("--- Modificadores ---");
        // Ignora letras minisculas ou maiusculas
        System.out.println("\"Meu texto\".matches(\"(?i)MEU texto\") = " + "Meu texto".matches("(?i)MEU texto"));
        // Comentários regx
        System.out.println("\"Meu texto\".matches(\"(?x)MEU texto\") = " + "Meu texto".matches("(?x)Meu texto"));
    }

}
