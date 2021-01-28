/*
 * Curso Java XTI
 * Aula 20
 * Array Simples
 */
package br.com.xti.aula020.array_simples;

import java.util.Arrays;

/**
 *
 * @author Kevin Lucas
 */
public class ArraySimples {

    public static void main(String[] args) {
        // Criando um array e incluindo valores
        String[] paises = {"Brasil", "Russia", "India", "China"};
        
        // Exibe o id do array na memoria
        System.out.println(paises);  
        
        // Exibe o elemento que esta nesse posicao no array
        System.out.println(paises[0]);

        // Modificando elementos do array
        paises[0] = "Brazil";
        System.out.println(paises[0]);

        // Outra forma de criar um array
        int[] impares = new int[5];
        impares[0] = 1;
        impares[1] = 3;
        impares[2] = 5;
        impares[3] = 7;
        impares[4] = 9;
        
        // Exibe o tamanho do array
        System.out.println(paises.length);
        System.out.println(impares.length);
        
        // Exibe os todos os elementos do array de forma literal
        System.out.println(Arrays.toString(paises));
        System.out.println(Arrays.toString(impares));
        
        // Pesquisa o elemento no array e retorna a posicao dele
        System.out.println(Arrays.binarySearch(paises, "Brazil"));
        
        // Ordena os elementos apartir da posição 0
        Arrays.sort(paises, 0, paises.length);
        System.out.println(Arrays.toString(paises));
    
        // Retorna o valor double da posicao 0
        Double[] valores = {12.0, 66.77};
        System.out.println(valores[0].doubleValue());
        System.out.println(valores[1].doubleValue());
    }
}
