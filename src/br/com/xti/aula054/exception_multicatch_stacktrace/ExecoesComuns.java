/*
 * Curso Java XTI
 * Aula 054
 * Exeções Exception, Multicatch, StackTrace
 */
package br.com.xti.aula054.exception_multicatch_stacktrace;

/**
 *
 * @author Kevin Lucas
 */
public class ExecoesComuns {

    //static int[] arrayNull; // NullPointerException
    // Não inicializar um array
    static int[] arrayVazio = new int[0];

    public static void main(String[] args) {
        // Tentar acessar um atributo ou metodo de um array vazio;
        //System.out.println(arrayVazio.length); // NullPointerException

        // Tentar acessar uma posição que não existe em um array
        //System.out.println(arrayVazio[1]); // ArrayIndexOutOfBoundsException

        // Tentar dividir um número por 0
        //int divisao = 5 / 0; // ArithmeticException
        //System.out.println(divisao);
        
        // Tipos diferentes
        Animal animal = new Galinha();
        // Fazendo um cast para corrigir
        Galinha galinha = (Galinha) animal;

        // Tentando fazer um cast de um tipo incompativel
        //Cachorro cachorro = (Cachorro) animal;
        // Tentando passar um valor incompativel
        //double valor = Double.parseDouble("x"); // NumberFormatException
        //System.out.println(valor);
    }
}
