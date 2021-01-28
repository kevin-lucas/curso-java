/*
 * Curso Java XTI
 * Aula 043
 * Metodos Sobrecarregados
 */
package br.com.xti.aula043.metodos_sobrecarregados;

/**
 *
 * @author Kevin Lucas
 */
public class Matematica {

    /* Metodos sobre carregados são metodos com mesmos nomes porem com assinaturas
    diferentes, isto siginifica que sao metetodos possuem o mesmo nome e paramentros
    diferentes.
     */
    
    // Soma possui dois parametros
    public double soma(double numero, double numero2) {
        System.out.print("soma(double numero, double numero2): ");
        return numero + numero2;
    }

    // Soma possui tres parametros
    public double soma(double numero, double numero2, double numero3) {
        System.out.print("soma(double numero, double numero2, double numero3): ");
        return numero + numero2 + numero3;
    }

    public double media(double nota1, double nota2) {
        System.out.print("media(double nota1, double nota2): ");
        return nota1 + nota2 / 2;
    }

    public double media(double nota1, double nota2, double nota3) {
        System.out.print("media(double nota1, double nota2, double nota3): ");
        return nota1 + nota2 + nota3 / 2;
    }
}
