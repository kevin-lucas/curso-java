/*
 * Curso Java XTI
 * Aula 062
 * I O, Path, Leitura e Escrita
 */
package br.com.xti.aula062.io_path_leitura_escrita;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author Kevin Lucas
 */
public class Arquivo {

    public static void main(String[] args) throws IOException {
        // Cria o caminha do arquivo a ser manipulado */
        Path caminhoArquivo = Paths.get("src\\br\\com\\xti\\aula062\\io_path_leitura_escrita\\files\\texto.txt");

        // Informações 
        System.out.println("--- Informações ---");
        // Retorna o caminha absoluto do arquivo
        System.out.println("caminhoArquivo.toAbsolutePath() = " + caminhoArquivo.toAbsolutePath());
        // Retorna o diretorio pai do arquivo
        System.out.println("caminhoArquivo.getParent() = " + caminhoArquivo.getParent());
        // Retorna o nome do arquivo
        System.out.println("caminhoArquivo.getFileName() = " + caminhoArquivo.getFileName());
        // Retorna o diretorio raiz do arquivo
        System.out.println("caminhoArquivo.getRoot() = " + caminhoArquivo.getRoot());

        // Criação de Diretórios
        // Cria um diretório no diretorio pai do arquivo, gera uma execao
        Files.createDirectories(caminhoArquivo.getParent());

        // Leitura e escrita de arquivos
        System.out.println("---  Leitura e Escrita de Arquivos ---");
        // Escreve texto dentro do arquivo
        byte[] textoEmBytes = "Meu texto".getBytes();
        Files.write(caminhoArquivo, textoEmBytes);

        System.out.println("---  Leitura e Escrita de Arquivos ---");
        // Ler arquivos
        byte[] textoRecuperado = Files.readAllBytes(caminhoArquivo);
        System.out.println(new String(textoRecuperado));
    }
}
