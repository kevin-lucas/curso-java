/*
 * Curso Java XTI
 * Aula 089
 * Collection Set
 */
package br.com.xti.aula089.collection_set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author Kevin Lucas
 */
public class ColecaoSet {

    public static void main(String[] args) {

        String[] cores = {"Verde", "Amarelo", "Azul", "Branco", "Azul", "Verde"};

        // Aceita valores duplicados
        List<String> listaCoresList = Arrays.asList(cores);
        System.out.println(listaCoresList.toString());

        // Set não aceita valores duplicados
        Set<String> listaCoresSet = new HashSet<String>(listaCoresList);
        System.out.println(listaCoresSet.toString());
    }
}
