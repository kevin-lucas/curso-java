/*
 * Curso Java XTI
 * Aula 36
 * Metodos com parametros 
 */
package br.com.xti.aula036.metodos_parametros;

/**
 *
 * @author Kevin Lucas
 */
public class Conta {

    // Atributos da conta
    String cliente;
    double saldo;

    // Metodo que exibe o saldo da conta do cliente
    void exibirSaldo() {
        System.out.println(cliente + " seu saldo é de: " + saldo);
    }

    // O parametro valor sera necessario ao chamar o metodo
    void sacar(double valor) {
        saldo -= valor;
    }

    // Metodo para depositar na conta
    void depositar(double valor) {
        saldo += valor;
    }

    // Metodo para realizar trasferencia
    void transferirPara(Conta contaDestino, double valor) {
        this.sacar(valor); // referencia a conta que chama o metodo
        contaDestino.depositar(valor);
    }
}
