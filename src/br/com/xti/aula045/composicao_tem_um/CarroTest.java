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
public class CarroTest {

    public static void main(String[] args) {

        // Cria um carro
        Carro ferrari = new Carro();
        ferrari.modelo = "Ferrari Enzo";
        ferrari.velocidadeMaxima = 349;
        ferrari.segundosZeroACem = 3.2;
        // Cria um motor
        Motor v12 = new Motor();
        v12.tipo = "V12";
        v12.potencia = 660;
        // Adiciona o motor ao carro
        ferrari.motor = v12;

        // Cria um novo carro
        Carro koenigsegg = new Carro("Koenigsegg CCXR", 430, 3.1);
        System.out.println(koenigsegg.modelo);
        System.out.println(koenigsegg.velocidadeMaxima);
        System.out.println(koenigsegg.segundosZeroACem);
        // Cria um novo motor
        Motor v8 = new Motor("V8", 1018);
        koenigsegg.motor = v8;
        System.out.println(koenigsegg.motor.potencia);

        // Criando e adicionado um novo motor ao carro pelo contrutor
        Carro bugatti = new Carro("Bugatti Veyron", 430, 2.2, new Motor("W16", 1200));
        System.out.println(bugatti.motor.potencia);
        System.out.println(bugatti.motor.tipo);
    }
}
