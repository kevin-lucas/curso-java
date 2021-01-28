/*
 * Curso Java XTI
 * Aula 063
 * I O, Hierarquia, Buffer, try, Closable Interface
 */
package br.com.xti.aula063.io_hierarquia_buffer_try_closable_interface;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author Kevin Lucas
 */
public class Arquivo {

    public static void main(String[] args) {

        /* Escrita do arquivo */
        // Cria o caminho
        Path caminhoArquivo = Paths.get("src\\br\\com\\xti\\aula063\\io_hierarquia_buffer_try_closable_interface\\files\\texto.txt");

        // Tratamento de caracteres
        Charset utf8 = StandardCharsets.UTF_8;

        // Escrevendo no arquivo
        //BufferedWriter bufferedWriter = Files.newBufferedWriter(caminhoArquivo, utf8);
        // Nova forma de escreve o try cath podendo declarar variaveis dentro do try e tratando a execao
        // Com a nova forma a conexao com arquivo é fechada automaticamente
        try (BufferedWriter bufferedWriter = Files.newBufferedWriter(caminhoArquivo, utf8)) {
            // Escrevendo no arquivo
            bufferedWriter.write("Texto número 1\n");
            bufferedWriter.write("Texto número 2\n");
            bufferedWriter.write("Texto número 3\n");
            bufferedWriter.write("Texto número 4\n");
            bufferedWriter.write("Texto número 5\n");
        } catch (IOException iOException) {
            iOException.printStackTrace();
        }
        /*
        // Antes era preciso fechar a conexão com arquivo
        finally {
            // Fechando a conexão
            if (bufferedWriter != null){
                BufferedWriter.close();
            }
         */

        /* Leitura de Arquivos */
        try (BufferedReader bufferedReader = Files.newBufferedReader(caminhoArquivo, utf8)) {
            // Variável que armazena o valor lido da linha do arquivo 
            String linha = null;
            while ((linha = bufferedReader.readLine()) != null) {
                System.out.println(linha);
            }
        } catch (IOException iOException) {
            iOException.printStackTrace();
        }
    }
}
