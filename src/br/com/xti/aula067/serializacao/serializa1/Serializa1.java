/*
 * Curso Java XTI
 * Aula 067
 * IO - Serializacao, Transient
 */
package br.com.xti.aula067.serializacao.serializa1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;

/**
 *
 * @author Kevin Lucas
 */
public class Serializa1 {

    /* A serialização em Java é o processo no qual a instância de um objeto é
    transformada em uma sequência de bytes e é útil quando precisamos enviar 
    objetos pela rede, salvar no disco, ou comunicar de uma JVM com outra. 
    Isso porque o estado atual do objeto é “congelado” e na outra “ponta” nós 
    podemos “descongelar” este objeto sem perder nenhuma informação. */
    public static void main(String[] args) throws Exception {

        // Array de String, a classe String implementa a interface Serializable
        String[] nomes = {"Fulano 1, Fulano 2", "Fulano 3"};

        /* Escrita do objeto */
        FileOutputStream fileOutputStream = new FileOutputStream("src\\br\\com\\xti\\aula067\\serializacao\\serializa1\\files\\objeto.ser");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        // Grava o array no objeto
        objectOutputStream.writeObject(nomes);
        // Fecha a conexao do objeto
        objectOutputStream.close();

        /* Leitura do objeto */
        FileInputStream fileInputStream = new FileInputStream("src\\br\\com\\xti\\aula067\\serializacao\\serializa1\\files\\objeto.ser");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

        // Ler as informações contidados no arquivo e converte para um array de String
        String[] nomesLido = (String[]) objectInputStream.readObject();

        // Fecha a conexao do arquivo
        objectInputStream.close();

        // Apresenta as informações
        System.out.println(Arrays.toString(nomesLido));
    }
}
