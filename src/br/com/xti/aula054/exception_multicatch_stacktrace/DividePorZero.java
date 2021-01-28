/*
 * Curso Java XTI
 * Aula 054
 * Exeções Exception, Multicatch, StackTrace
 */
package br.com.xti.aula054.exception_multicatch_stacktrace;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Kevin Lucas
 */
public class DividePorZero {

    // throws defini que o metodo pode lancar alguma exeção, faz parte da assinatura do metodo.
    public static void dividir(Scanner leitor) throws InputMismatchException, ArithmeticException {
        System.out.println("Informe um número");
        int numero = leitor.nextInt();
        System.out.println("Informe um divisor:");
        int divisor = leitor.nextInt();
        System.err.println(numero / divisor);
    }

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        boolean continua = true;
        do {
            try {
                dividir(leitor);
                continua = false;
            } catch (InputMismatchException | ArithmeticException exception) { // Trata varias execoes em um catch
                // Informa a pilha de erros
                // exception.printStackTrace();
                // recupera um array contendo os erros
                // exception.getStackTrace();
                // Retorna o erro como string
                System.out.println(exception.getMessage());
                leitor.nextLine();
            }
        } while (continua);
    }
}
