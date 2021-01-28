/*
 * Curso Java XTI
 * Aula 065
 * IO - Check, Delete, Create, Copy, Move
 */
package br.com.xti.aula065.io_check_delete_create_copy_move;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

/**
 *
 * @author Kevin Lucas
 */
public class Arquivo {

    public static void main(String[] args) throws IOException {
        Path caminhoArquivo = Paths.get("src\\br\\com\\xti\\aula065\\io_check_delete_create_copy_move\\files\\texto.txt");

        System.out.println("--- Informações ---");
        // Verifica se o arquivo existe
        System.out.println("Files.exists(caminhoArquivo) = " + Files.exists(caminhoArquivo));
        // Verifica se o arquivo é um diretorio
        System.out.println("Files.isDirectory(caminhoArquivo) = " + Files.isDirectory(caminhoArquivo));
        // Verifica se o arquivo é um arquivo especial
        System.out.println("Files.isRegularFile(caminhoArquivo) = " + Files.isRegularFile(caminhoArquivo));
        // Verifica se o arquivo é legível
        System.out.println("Files.isReadable(caminhoArquivo) = " + Files.isReadable(caminhoArquivo));
        // Verifica se o arquivo é executável
        System.out.println("Files.isExecutable(caminhoArquivo) = " + Files.isExecutable(caminhoArquivo));
        // Exibe o tamanho do arquivo
        // System.out.println("Files.size(caminhoArquivo) = " + Files.size(caminhoArquivo));
        // Retorna o proprietário do arquivo.
        //System.out.println("Files.getOwner(caminhoArquivo) = " + Files.getOwner(caminhoArquivo));
        // Detecta o tipo de conteúdo do arquivo
        //System.out.println("Files.probeContentType(caminhoArquivo) = " + Files.probeContentType(caminhoArquivo));

        /* Exclusão  */
        // Deleta o arquivo
        //Files.delete(caminhoArquivo);
        // Deleta o arquivo caso ela exista
        Files.deleteIfExists(caminhoArquivo);

        /* Criação */
        // Cria o arquivo no caminho
        Files.createFile(caminhoArquivo);
        // Escreve o texto no arquivo
        Files.write(caminhoArquivo, "Texto".getBytes());
        
        
        /* Copia */
        Path copiaArquivo = Paths.get("src\\br\\com\\xti\\aula065\\io_check_delete_create_copy_move\\files\\copia.txt");
        // Cria e copia o arquivo para o arquivo
        Files.copy(caminhoArquivo, copiaArquivo, StandardCopyOption.REPLACE_EXISTING);
        
        /* Move */
        //Path moveArquivo = Paths.get("src\\br\\com\\xti\\aula065\\io_check_delete_create_copy_move\\files\\move\\movido.txt");
        //Files.createDirectories(moveArquivo.getParent());
        //Files.move(caminhoArquivo, moveArquivo, StandardCopyOption.REPLACE_EXISTING);
    }
}
