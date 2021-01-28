/*
 * Curso Java XTI
 * Aula 23
 * Estrutura If Else
 */
package br.com.xti.aula023.estrutura_if_else;

import java.util.Scanner;

/**
 *
 * @author Kevin Lucas
 */
public class EstruturaIfElse {

    public static void main(String[] args) {

        // Se a expressao booleana é verdadeira excuta a instrução senão executa a outra.
        if (10 < 5) {
            System.out.println("Verdadeiro");
        } else {
            System.out.println("Falso");
        }

        // Verifica se o  número é par ou impar
        if (11 % 2 == 0) {
            System.out.println("Número é par");
        } else {
            System.out.println("Número é ímpar");
        }

        // Verifica se a idade passada pelo usuário é maior ou menor de idade
        // idade >= 18 Maior de Idade
        // idade <= 18 Menor de Idade
        Scanner leitor = new Scanner(System.in);
        System.out.print("Informe sua idade: ");
        int idade = leitor.nextInt();

        if (idade < 11) {
            System.out.println("Criança");
        } else if (idade > 11 && idade <= 18) {
            System.out.println("Adolecente");
        } else if (idade > 18 && idade <= 60) {
            System.out.println("Adulto");
        } else {
            System.out.println("Melhor Idade");
        }

        // Verifica a situação do aluno de acordo com sua nota
        int nota = 6;
        if (nota >= 7) {
            System.out.println("Passou");
        } else {
            System.out.println("Reprovou");
            if (nota >= 6) {
                System.out.println("Mais pode ficar de recuperacao");
            }
        }
    }
}
