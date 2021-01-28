/*
 * Curso Java XTI
 * Aula 068 
 * IO - Serializacao e Transient de Contas
 */
package br.com.xti.aula068.serializacao_transient_contas;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author Kevin Lucas
 */
public class Serializa3 {

    public void armazenaConta(ArrayList<Conta> contas) throws IOException {
        try (FileOutputStream fileOutputStream = new FileOutputStream("src\\br\\com\\xti\\aula068\\serializacao_transient_contas\\files\\contas.ser")) {
            try (ObjectOutput objectOutput = new ObjectOutputStream(fileOutputStream)) {
                objectOutput.writeObject(contas);
            }
        }
    }

    public ArrayList<Conta> recuperarContas() throws IOException, ClassNotFoundException {
        try (FileInputStream fileInputStream = new FileInputStream("src\\br\\com\\xti\\aula068\\serializacao_transient_contas\\files\\contas.ser")) {
            try (ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)) {
                return (ArrayList<Conta>) objectInputStream.readObject();
            }
        }
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        ArrayList<Conta> contas = new ArrayList<>();
        Conta.setTipo("Salário");
        contas.add(new Conta(111, "Cliente A", 1000));
        contas.add(new Conta(222, "Cliente B", 2000));
        contas.add(new Conta(333, "Cliente C", 3000));

        Serializa3 serializa3 = new Serializa3();
        serializa3.armazenaConta(contas);
        ArrayList<Conta> contasLida = serializa3.recuperarContas();
        for (Conta conta : contasLida) {
            conta.exibirConta();
        }
    }
}
