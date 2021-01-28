/*
 * Curso Java XTI
 * Aula 083
 * GUI, JTextArea e JFilechooser
 */
package br.com.xti.aula083.gui_jtextarea_jfilechooser;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 *
 * @author Kevin Lucas
 */
public class ControleTextArea extends JFrame implements ActionListener {
    
    JTextArea campoTexto;
    
    public ControleTextArea() {
        super("Editor de Textos");

        // Recupara a janela
        Container janela = getContentPane();

        // Criando uma campo de texto
        campoTexto = new JTextArea();
        campoTexto.setFont(new Font("serif", Font.PLAIN, 12));

        // Criando e adicionando uma barra de rolagem ao campo de texto
        JScrollPane barraRolagem = new JScrollPane(campoTexto);

        // Adiciona o campo de texto ao centro da janela
        janela.add(BorderLayout.CENTER, barraRolagem);

        // Adicionando arquivo de texto
        JButton botaoAbrirArquivo = new JButton("Abrir arquivo");
        botaoAbrirArquivo.setFont(new Font("serif", Font.PLAIN, 26));
        // Adicionado um evento ao botao
        botaoAbrirArquivo.addActionListener(this);

        // Adiciona o botao a janela
        janela.add(BorderLayout.SOUTH, botaoAbrirArquivo);

        // Operacoes pardrao
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(700, 700);
        setVisible(true);
    }
    
    public static void main(String[] args) {
        new ControleTextArea();
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {

        // Criando um selecionador de arquvivos
        JFileChooser selecionadorArquivo = new JFileChooser();
        // Exibe um selecionador de arquivos
        selecionadorArquivo.showOpenDialog(this);

        // Tratando o arquuivo selecionado
        File file = selecionadorArquivo.getSelectedFile();
        try {
            Path caminhoArquivo = Paths.get(file.getAbsolutePath());
            String arquivoLido = new String(Files.readAllBytes(caminhoArquivo));
            campoTexto.setText(arquivoLido);
        } catch (IOException exception) {
            JOptionPane.showMessageDialog(this, "Não foi possível abrir o arquivo");
            exception.printStackTrace();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
}
