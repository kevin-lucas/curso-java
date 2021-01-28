/*
 * Curso Java XTI
 * Aula 068 
 * IO - Serializacao e Transient de Contas
 */
package br.com.xti.aula068.serializacao_transient_contas;

import java.io.Serializable;

/**
 *
 * @author Kevin Lucas
 */
public class Conta implements Serializable {

    // Variáveis com transient e static não são serializaveis
    transient private int id;
    private static String tipo;
    private String cliente;
    private double saldo;

    public Conta() {
    }

    public Conta(int id, String cliente, double saldo) {
        this.id = id;
        this.cliente = cliente;
        this.saldo = saldo;
    }

    public void depositar(double valor) {
        this.saldo += valor;
    }

    public void sacar(double valor) {
        if (this.saldo < valor) {
            System.out.println("Saldo = " + this.saldo + " insuficiente para realizar a operação");
        } else {
            this.saldo -= valor;
        }
    }

    public void transferir(double valor, Conta destino) {
        this.sacar(valor);
        destino.depositar(valor);
    }

    public void exibirConta() {
        System.out.println("Id = " + this.id + " Cliente = " + this.cliente + " Saldo = " + this.saldo);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public static String getTipo() {
        return tipo;
    }

    public static void setTipo(String tipo) {
        Conta.tipo = tipo;
    }

}
