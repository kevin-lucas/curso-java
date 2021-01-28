/*
 * Curso Java XTI
 * Aula 064
 * Desafio Armazenar Contas Arquivo Seguencial
 */
package br.com.xti.aula064.io_desafio_armazenar_contas_arquivo_seguencial;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

/**
 *
 * @author Kevin Lucas
 */
public class Arquivo {

    Path caminhoArquivo = Paths.get("src\\br\\com\\xti\\aula064\\desafio_armazenar_contas_arquivo_seguencial\\files\\contas.txt");
    Charset utf8 = StandardCharsets.UTF_8;

    public void armazenarContaArquivo(ArrayList<Conta> contas) throws IOException {
        try (BufferedWriter bufferWriter = Files.newBufferedWriter(caminhoArquivo, utf8)) {
            for (Conta conta : contas) {
                bufferWriter.write(conta.getId() + ";" + conta.getCliente() + ";" + conta.getSaldo() + "\n");
            }
        } catch (IOException iOException) {
            iOException.printStackTrace();
        }
    }

    public ArrayList<Conta> recupararContas() {
        ArrayList contas = new ArrayList<Conta>();
        try (BufferedReader bufferReader = Files.newBufferedReader(caminhoArquivo)) {
            String linhaArquivo = null;
            while ((linhaArquivo = bufferReader.readLine()) != null) {
                String[] contaLinha = linhaArquivo.split(";");
                Conta conta = new Conta(Integer.parseInt(contaLinha[0]), contaLinha[1], Double.parseDouble(contaLinha[2]));
                contas.add(conta);
            }
        } catch (IOException iOException) {
            iOException.printStackTrace();
        }
        return contas;
    }

    public static void main(String[] args) throws IOException {
//        ArrayList<Conta> contas = new ArrayList<Conta>();
//        contas.add(new Conta(111, "Teste 1", 1000));
//        contas.add(new Conta(222, "Teste 2", 2000));
//        contas.add(new Conta(333, "Teste 3", 3000));
//        contas.add(new Conta(444, "Teste 4", 4000));
//        contas.add(new Conta(555, "Teste 5", 5000));
//        Arquivo contaArquivo = new Arquivo();
//        contaArquivo.armazenarContaArquivo(contas);

        Arquivo contaArquivo = new Arquivo();
        ArrayList<Conta> contas = contaArquivo.recupararContas();
        for (Conta conta : contas) {
            conta.exibirConta();
        }

    }
}
