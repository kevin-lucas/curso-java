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
public class ContaTest {

    public static void main(String[] args) {

        // Cria uma conta
        Conta conta1 = new Conta();
        
        // Atribuir infomações a conta
        conta1.cliente = "Fulano";
        conta1.saldo = 10_000;
        
        // Realiza um saque na conta
        conta1.sacar(2_000);
        
        // Realiza um deposito na conta
        conta1.depositar(12_000);
       
        Conta conta2 = new Conta();
        conta2.cliente = "Ciclano";
        conta2.saldo = 5_000;
        
        // Realizar transferencia
        conta1.transferirPara(conta2, 1_000);
        
        // Exibir informações
        conta1.exibirSaldo();
        conta2.exibirSaldo();

    }
}
