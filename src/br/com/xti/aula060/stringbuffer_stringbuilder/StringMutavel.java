/*
 * Curso Java XTI
 * Aula 060
 * StringBuffer e StringBuilder
 */
package br.com.xti.aula060.stringbuffer_stringbuilder;

/**
 *
 * @author Kevin Lucas
 */
public class StringMutavel {

    public static void main(String[] args) {

        /* O objeto String não poder ser modificado, a concatenação da String cria
        novos objeto string, por isso existe as classes StringBuffer e StringBuilder
        os metodos são os mesmos a diferenca entre elas é que os metodos da 
        StringBuffer são sincronizados e as da StringBuilder não são sincronizados */
        // Ambos possuem os mesmos metodos.
        StringBuffer stringBuffer = new StringBuffer("Meu texto");

        System.out.println("--- StringBuffer ---");
        // Representacao string do texto
        System.out.println("stringBuffer.toString() = " + stringBuffer.toString());

        // Exibe a capacidade da string
        System.out.println("stringBuffer.capacity() = " + stringBuffer.capacity());

        // Metodo mais importante que concatena outros textos
        System.out.println("stringBuffer.append(\" é esse\") = " + stringBuffer.append(" é esse"));
        // Chamada do metodo várias vezes
        System.out.println("stringBuffer.append(\",\").append(\" mesmo\").append(\" ...\") = " + stringBuffer.append(",").append(" mesmo").append(" ..."));

        // Comparacao com a String
        String textoString = "Texto";
        System.out.println("textoString + \" string\" = " + textoString + " string");
        //StringBuffer
        System.out.println("stringBuffer.append(\"Texto\").append(\" stringBuffer\") = " + stringBuffer.append("Texto").append(" stringBuffer"));

        // Concatena com array de letras
        char[] letras = {'t', 'e', 'x', 't', 'o'};
        System.out.println("stringBuffer.append(letras) = " + stringBuffer.append(letras));

        // Reverte a ordem dos caracteres
        System.out.println("stringBuffer.reverse() = " + stringBuffer.reverse());

        // Manipulando a StringBuilder
        System.out.println("--- StringBuilder ---");
        StringBuilder stringBuilder = new StringBuilder("Meu texto");
        System.out.println(stringBuilder.toString());
        System.out.println(stringBuilder.capacity());
        System.out.println(stringBuilder.append(" é esse"));
        System.out.println(stringBuilder.reverse());
    }

}
