/*
 * Curso Java XTI
 * Aula 25
 * Desafio Dado
 */
package br.com.xti.aula025.desafio_dados;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Kevin Lucas
 */
public class DesafioDado {

    public static void main(String[] args) {

        Random randomico = new Random();
        Scanner leitor = new Scanner(System.in);
        int[] dado = {1, 2, 3, 4, 5, 6};
        int valorDado = randomico.nextInt(dado.length + 1);
        System.out.print("Informe o valor do dado: ");
        int valorInfomado = leitor.nextInt();

        if (valorInfomado == valorDado) {
            System.out.println("Acertou: " + valorDado);
        } else {
            System.out.println("Errou: " + valorDado);
        }
    }
}
