/*
 * Curso Java XTI
 * Aula 045
 * Composição Tem um
 */
package br.com.xti.aula045.composicao_tem_um;

/**
 *
 * @author Kevin Lucas
 */
public class Carro {

    String modelo;
    int velocidadeMaxima;
    double segundosZeroACem;

    /* Composição significa uma objeto compondo o outro, utiliza um objeto para
    utlizalo como atributo do outro.
     */
    // Carro tem um Motor
    Motor motor;

    public Carro() {
    }

    public Carro(String modelo, int velocidadeMaxima, double segundosZeroACem) {
        this.modelo = modelo;
        this.velocidadeMaxima = velocidadeMaxima;
        this.segundosZeroACem = segundosZeroACem;
    }

    public Carro(String modelo, int velocidadeMaxima, double segundosZeroACemm, Motor motor) {
        this.modelo = modelo;
        this.velocidadeMaxima = velocidadeMaxima;
        this.segundosZeroACem = segundosZeroACem;
        this.motor = motor;
    }

    /* Forma enchuta de criar o contrutor 
    public Carro(String modelo, int velocidadeMaxima, double segundosZeroACem, Motor motor) {
        this(modelo, velocidadeMaxima, segundosZeroACem, null);
    } */
}
