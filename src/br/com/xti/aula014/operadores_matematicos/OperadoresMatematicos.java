/**
 * Curso Java XTI
 * Aula 14
 * Operadores Matemáticos
 */
package br.com.xti.aula014.operadores_matematicos;

/**
 *
 * @author Kevin Lucas
 *
 */
public class OperadoresMatematicos {

    public static void main(String[] args) {

        // Manipula os sinais dos valores
        double positivo = +5;
        System.out.println(positivo);
        double negativo = -5;
        System.out.println(negativo);

        // Operador de soma
        double soma = 10 + 5;
        System.out.println(soma);

        // Concatenação
        String texto = "Meu " + "Texto";
        System.out.println(texto);

        // Realiza a subtração
        double subtracao = 7 - 3;
        System.out.println(subtracao);

        // Realiza a multiplicacao
        double multiplicacao = 5 * 5;
        System.out.println(multiplicacao);

        // Realiza a divisao
        double divisao = 50 / 5;
        System.out.println(divisao);

        // Modulo da divisão
        double modulo = 30 % 5;
        System.out.println(modulo);

        // Pré Incremento ou Decremento de variáveis
        int pre = 1;
        // O valor da variável é 1
        System.out.println(pre);
        ++pre; // acresenta +1 a variável
        // O valor da variável é 2
        System.out.println(pre);

        System.out.println("-------------");

        // Pós drecremento de variáveis
        int pos = 1;
        // O valor da variável é 1
        System.out.println(pos);
        pos++; // acresenta +1 a variável
        // O valor da variável é 2
        System.out.println(pos);

    }
}
