/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.xti.aula096.threads_wait_notifyall;

/**
 *
 * @author kevin.fonseca
 */
public class PonteTest {

    public static void main(String[] args) {
        
        // Exemplo nao sincronizado
        // Ponte compartilhada entre os produtores e comsumidores
        // Ponte ponte = new PonteNaoSincronizada();
       
        // Exemplo sincronizado
        Ponte ponte = new PonteSincronizada();
        
        // Cria os consumidores e os produtores
        new Thread(new Produtor(ponte)).start();
        new Thread(new Consumidor(ponte)).start();
    }
}
