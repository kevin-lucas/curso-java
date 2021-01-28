/**
 * Curso de Java XTI
 * Aula 013
 * Operadores
 */
package br.com.xti.aula013.operadores;

/**
 *
 * @author Kevin Lucas
 *
 */
public class Operadores {

    public static void main(String[] args) {
        //-2 operador unário
        //2 + 3 operador binário
        //true? "Sim" : "Não" operador ternário // Realiza a soma entre dois operandos

        // Realiza a soma entre dois operandos
        int soma = 9 + 1;
        System.out.println(soma);

        // Realiza a operação respetando a ordem de precedencia matematica
        double operacao = 7 - 4 + 3 * 2;
        System.out.println(operacao);

        // Outro exemplo 
        double operacao2 = (40 / 5) * 2;
        System.out.println(operacao2);
    }
}
