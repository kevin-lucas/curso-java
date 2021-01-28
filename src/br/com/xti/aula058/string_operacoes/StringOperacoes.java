/*
 * Curso Java XTI
 * Aula 058
 * String Operações
 */
package br.com.xti.aula058.string_operacoes;

/**
 *
 * @author Kevin Lucas
 */
public class StringOperacoes {

    public static void main(String[] args) {

        // Formas de criar strings
        String texto = "Meu texto";
        String texto2 = texto + "2";
        String texto3 = new String("Meu texto 3");
        char[] texto4 = {'T', 'e', 'x', 't', 'o'};
        String texto5 = new String(texto4);

        System.out.println(texto);
        System.out.println(texto2);
        System.out.println(texto3);
        System.out.println(texto4);
        System.out.println(texto5);

        /* Obtendo Informações */
        System.out.println("--- Informações ---");
        // Exibe o tamanho do array
        System.out.println("length = " + texto.length());
        // Exibe a letra que está nessa posição
        System.out.println("charAt = " + texto.charAt(2));
        // Retorna a representação literal do texto
        System.out.println("toString = " + texto.toString());

        /* Obtem informações sobre a localização */
        System.out.println("--- Localização ---");
        // Retorna a posição onde o texto se encontra
        System.out.println("indexOf: " + texto.indexOf("e"));
        // Retorna a ultima ocorrencia do texto
        System.out.println("lastIndexOf: " + texto.lastIndexOf("e"));
        // Verifica se o texto está vazio
        System.out.println("isEmpty: " + texto.isEmpty());

        /* Comparando strings */
        System.out.println("--- Comparação ---");
        // Compara se o texto é igual ao outro
        System.out.println("equals(\"Meu texto\") = " + texto.equals("Meu texto"));
        // Compara se o texto é igual ao outro ignorando se é maiusculas ou minisculas
        System.out.println("texto.equalsIgnoreCase(\"MEU TEXTO\") = " + texto.equalsIgnoreCase("MEU TEXTO"));
        // Verifica se a string começa com determidado texto
        System.out.println("texto.startsWith(\"Meu\") = " + texto.startsWith("Meu"));
        // Verifica se a string termina com determidado texto
        System.out.println("texto.endsWith(\"texto\") = " + texto.endsWith("texto"));
        // Compara as string de acordo com a ordem alfabetica 
        System.out.println("compareTo(\"a\") = " + "a".compareTo("a"));
        System.out.println("compareTo(\"234\") = " + "123".compareTo("234"));
        // O método regionMatches()testa se as duas Strings são iguais.
        System.out.println("regionMatches(0, \"Meu\", 0, 2) = " + texto.regionMatches(0, "Meu", 0, 2));
        //O método regionMatches() testa se as duas Strings são iguais ignorando letras maiusculas ou minisculas
        System.out.println("regionMatches(true, 0, \"MEU\", 0, 2) = " + texto.regionMatches(true, 0, "MEU", 0, 2));

        /* Extração de texto */
        System.out.println("--- Extração ---");
        // Recupera o texto apartir da posicao
        System.out.println("substring(5) = " + texto.substring(5));
        // Recupera o texto da posicao tal ate a posicao tal
        System.out.println("substring(3, 7) = " + texto.substring(3, 7));

         /* Modificação de texto */
        System.out.println("--- Modificação ---");
        // Junta ou concatena as strings
        System.out.println("texto + \"é esse.\" = " + texto + " é esse.");
        System.out.println("concat(\" é esse.\") = " + texto.concat(" é esse."));
        // Substitui um texto por outro
        System.out.println("replace(\"texto\", \"texto modificado\") = " + texto.replace("texto", "texto modificado"));
        // Substitui um texto por outro na primeira ocorrencia
        System.out.println("replaceFirst(\"e\", \"é\") = " + texto.replaceFirst("e", "é"));
        // Substitui um texto por outro em todas as ocorrencia
        System.out.println("replaceAll(\"é\", \"é\") = " + texto.replaceAll("e", "é"));
        // Tranforma o texto em maiusculas
        System.out.println("toUpperCase() = " + texto.toUpperCase());
        // Tranforma o texto em minusculas
        System.out.println("toLowerCase() = " + texto.toLowerCase());
        // Remove todos os espacos presentes depois do fim do texto
        System.out.println("Meu texto    ".trim());
    }
}
