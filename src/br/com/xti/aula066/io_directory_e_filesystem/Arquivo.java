/*
 * Curso Java XTI
 * Aula 066
 * IO - Directory e FileSystem
 */
package br.com.xti.aula066.io_directory_e_filesystem;

import java.io.IOException;
import java.nio.file.FileStore;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Path;

/**
 *
 * @author Kevin Lucas
 */
public class Arquivo {

    public static void main(String[] args) throws IOException {

        // Listar os diretorios
        Iterable<Path> diretorios = FileSystems.getDefault().getRootDirectories();
        for (Path diretorio : diretorios) {
            System.out.println(diretorio);
        }

        // Exibir a quantidade de espaco
        FileSystem fileSystems = FileSystems.getDefault();
        for (FileStore fileStore : fileSystems.getFileStores()) {
            System.out.println("Unidade = " + fileStore.toString());
            System.out.println("Total = " + fileStore.getTotalSpace());
            System.out.println("Disponível = " + fileStore.getUsableSpace());
            System.out.println("Utilizada = " + (fileStore.getTotalSpace() - fileStore.getUsableSpace()));
        }
    }
}
