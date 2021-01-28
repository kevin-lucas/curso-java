/*
 * Curso Java XTI
 * Aula 067
 * IO - Serializacao, Transient
 */
package br.com.xti.aula067.serializacao.serializa2;

import com.sun.corba.se.impl.io.IIOPInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author Kevin Lucas
 */
public class Serializa2 {

    public static void main(String[] args) throws Exception {
        // Criando as contas que implementam Serializable
        Conta conta1 = new Conta(111, "Cliente 1", 1000.00);
        Conta conta2 = new Conta(222, "Cliente 2", 2000.00);

        // Escrita do objeto
        FileOutputStream fileOutputStream = new FileOutputStream("src\\br\\com\\xti\\aula067\\serializacao\\serializa2\\files\\objeto.ser");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        // Escreve as contas no arquivo
        /* As variáveis do objeto são armazenadas, as variáveis estaticas e
        com a palavra chave transient não são armazenadas no arquivo.
         */
        objectOutputStream.writeObject(conta1);
        objectOutputStream.writeObject(conta2);

        // Fecha a conexao
        objectOutputStream.close();

        // Leitura do objeto
        FileInputStream fileInputStream = new FileInputStream("src\\br\\com\\xti\\aula067\\serializacao\\serializa2\\files\\objeto.ser");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

        // Ler o armazena em um objeto as informações armazenadas no arquivo
        Conta conta1Lida = (Conta) objectInputStream.readObject(); // Retorna um obejto
        Conta conta2Lida = (Conta) objectInputStream.readObject();

        // Fecha a conexao com o arquivo
        objectInputStream.close();

        // Exibe as informações
        conta1Lida.exibirConta();
        conta2Lida.exibirConta();

    }

}
