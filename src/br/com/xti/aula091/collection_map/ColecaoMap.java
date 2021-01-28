/*
 * Curso Java XTI
 * Aula 090
 * Collection Queue
 */
package br.com.xti.aula091.collection_map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author Kevin Lucas
 */
public class ColecaoMap {

    public static void main(String[] args) {

        /* As classes que implementam as inteface Map, associam chaves a valores.
        As chaves em um Map devem ser unicas, mas pode haver dados duplicados.
         */
        // tipo da chave e do valor
        Map<String, String> paises = new HashMap<String, String>();

        // Adicionado valores a lista
        paises.put("BR", "Brasil");
        paises.put("RU", "Russia");
        paises.put("IN", "India");
        paises.put("CH", "China");
        System.out.println("paises.toString() = " + paises.toString());

        // Verifica se a chave existe
        System.out.println("paises.containsKey(\"BR\") = " + paises.containsKey("BR"));

        // Verifica se um valor existe
        System.out.println("paises.containsValue(\"BR\") = " + paises.containsValue("Brasil"));

        // Recupera um conteudo pela chave 
        System.out.println("paises.get(\"CH\") = " + paises.get("CH"));

        // Remove o conteudo
        System.out.println("paises.remove(\"BR\") = " + paises.remove("BR"));
        System.out.println("paises.toString() = " + paises.toString());

        // Retorna uma colecao tipo Set, significa que não aceita valores duplicados
        Set<String> chaves = paises.keySet();
        System.out.println("Set<String> chaves = paises.keySet() = " + chaves);

        // Exibindo as chaves e os valores
        for (String chave : chaves) {
            System.out.println("for (String chave : chaves) = "
                    + chave + " : " + paises.get(chave));
        }
    }
}
