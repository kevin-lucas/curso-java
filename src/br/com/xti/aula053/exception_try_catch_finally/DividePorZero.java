/*
 * Curso Java XTI
 * Aula 053
 * Exeções Exception, Try, Catch, Finally
 */
package br.com.xti.aula053.exception_try_catch_finally;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Kevin Lucas
 */
public class DividePorZero {

    public static void main(String[] args) {

        // Esssa instrução irá gerar uma exeção java.lang.ArithmeticException
        // int resultado = 1 / 0;
        // Tratamento de exeção
        Scanner leitor = new Scanner(System.in);
        boolean continua = true;
        do {
            // tenta realizar a instrução
            try {
                System.out.println("Informe um número");
                int numero = leitor.nextInt();
                System.out.println("Informe um divisor:");
                int divisor = leitor.nextInt();
                System.err.println(numero / divisor);
                continua = false;
            } // captura a execao e executa caso a intrução
            catch (InputMismatchException mismatchException) {
                System.err.println("mismatchException: > Informe um número inteiro");
                leitor.nextLine();
            } catch (ArithmeticException arithmeticException) {
                leitor.nextLine();
                System.err.println("arithmeticException : > Informe um divisor diferente de 0");
            } // execao generico 
            catch (Exception exception) {
                leitor.nextLine();
                System.err.println("exception: > Erro encontrado");
            } finally {
                System.out.println("finally executado!");
            }
        } while (continua);
    }
}
