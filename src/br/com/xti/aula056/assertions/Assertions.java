/*
 * Curso Java XTI
 * Aula 056
 * Assertions
 */
package br.com.xti.aula056.assertions;

import java.util.Scanner;

/**
 *
 * @author Kevin Lucas
 */
public class Assertions {

    public static void main(String[] args) {

        /* Assertions são utilizados para testa o codigo em tempo de desenvolvimento *
        Para utiliza as Assertions deve ativa-lás utlizando o prompt (-ae) ou a ide.
        Para ativar assert no Netbeans - Propiedades do projeto > Executar 
        > Opções da VM > -ea. Por padrão as assertions vem desabilitadas */
        Scanner leitor = new Scanner(System.in);
        System.out.println("Entre com numero de 0 a 10");
        int numero = leitor.nextInt();

        // Verifica a expressão e retorna um erro caso seja negativa 
        // java.lang.AssertionError
        assert (numero >= 0 && numero <= 10) : "Numero invalido " + numero; // primeiro parametro obrigatorio
        System.out.println("Voce entrou " + numero);
    }
}
