/*
 * Curso Java XTI
 * Aula 044
 * Construtores
 */
package br.com.xti.aula044.construtores;

/**
 *
 * @author Kevin Lucas
 */
public class Carro {

    /* Construtores são "metodos" executados quando a classe é instanciada no programa,
    com eles é possivel definir valores ou executar metodos diretamete para 
    classe ao instancia-lá.
     */
    String modelo;
    int velocidadeMaxima;
    double segundosZeroACem;

    /* Construtor vazio é o padrão a se instanciar a classe e pode ficar 
     oculta caso não tenha outro contrutor */
    public Carro() {
    }

    // Contrutor que incia valores ao intanciar a classe.
    public Carro(String modelo, int velocidadeMaxima, double segundosZeroACem) {
        this.modelo = modelo;
        this.velocidadeMaxima = velocidadeMaxima;
        this.segundosZeroACem = segundosZeroACem;
    }
}
