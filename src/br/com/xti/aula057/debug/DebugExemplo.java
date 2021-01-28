/*
 * Curso Java XTI
 * Aula 057
 * Depuração Debug
 */
package br.com.xti.aula057.debug;

/**
 *
 * @author Kevin Lucas
 */
public class DebugExemplo {

    /* Depupar o codigo e verificar as execução do código passo a passo, visualizando
    as etapas, variáveis, atribuições etc que ocorrem durante a execução do programa.
     */
    double resultado;
    int teste[] = new int[0];

    double soma(double... numeros) {
        for (double numero : numeros) {
            resultado += numero;
        }
        return resultado;
    }

    public static void main(String[] args) {
        DebugExemplo debugExemplo = new DebugExemplo();
        double soma = debugExemplo.soma(1, 2, 3, 4);
        System.out.println(soma);

        if (soma == 10) {
            System.out.println("Resultado correto!");
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
    }
}
