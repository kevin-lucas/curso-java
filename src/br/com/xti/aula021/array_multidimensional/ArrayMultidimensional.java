/*
 * Curso Java XTI
 * Aula 21
 * Array Multidimensional
 */
package br.com.xti.aula021.array_multidimensional;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author Kevin Lucas
 */
public class ArrayMultidimensional {

    public static void main(String[] args) {

        // Array com uma dimensão
        String[] uma = {"Texto", "Outro Texto"};
        
        // Array com duas dimensões
        int[][] duas = {{2, 4, 6, 8}, {1, 3, 5, 7}};
        System.out.println(Arrays.toString(duas[0]));
        System.out.println(Arrays.toString(duas[1]));
        
        // Exibe o tamanho do array
        System.out.println(duas.length);
        
        // Alterando valor do array
        duas[1][3] = 9;
        System.out.println(Arrays.toString(duas[1]));
        
        
        // Jogo de Cartas
        String[] faces = {"A", "2", "3", "4", "7", "8", "9", "10", "Valete", "Dama", "Rei"};
        String[] nipes = {"Espadas", "Paus", "Copas", "Ouros"};
        
        // Gera valores aleatórios
        Random randomico = new Random();
        System.out.println(randomico.nextInt(10) + 1);
        
        // Cria a face da carta
        String face = faces[randomico.nextInt(faces.length)];
        
        // Cria o nipe da carta
        String nipe = nipes[randomico.nextInt(nipes.length)];
    
        // Exibe a carta
        String carta = face + " de " + nipe;
        System.out.println(carta);
    }
}
