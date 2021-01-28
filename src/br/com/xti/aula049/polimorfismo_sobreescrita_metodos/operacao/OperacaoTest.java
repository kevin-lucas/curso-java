/*
 * Curso Java XTI
 * Aula 049
 * Polimorfismo Sobreescrita de metodos
 */
package br.com.xti.aula049.polimorfismo_sobreescrita_metodos.operacao;

/**
 *
 * @author Kevin Lucas
 */
public class OperacaoTest {

    public static void calcule(OperacaoMatematica operacaoMatematica, double x, double y) {
        System.out.println(operacaoMatematica.calcular(x, y));
    }

    public static void calculeSemPolimorfismo(String operacaoMatematica, double x, double y) {
        if (operacaoMatematica.equals("Soma")) {
            System.out.println(x + y);
        } else if (operacaoMatematica.equals("Multiplicacao")) {
            System.out.println(x * y);
        }
    }

    public static void main(String[] args) {

        calcule(new Soma(), 5, 5);
        calcule(new Multiplicacao(), 5, 5);

        calculeSemPolimorfismo("Soma", 8, 6);
        calculeSemPolimorfismo("Multiplicacao", 10, 4);
    }
}
