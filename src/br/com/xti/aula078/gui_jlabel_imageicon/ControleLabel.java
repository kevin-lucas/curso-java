        /*
 * Curso Java XTI
 * Aula 078
 * GUI, JLabel, ImageIcon
 */
package br.com.xti.aula078.gui_jlabel_imageicon;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Kevin Lucas
 */
public class ControleLabel extends JFrame {

    public ControleLabel() {

        // Cria um texto
        JLabel texto = new JLabel("Texto");
        // Cria uma texto que exibido quando o mouse é passado por cima do elemento
        texto.setToolTipText("Texto Tooltip");

        // Texto mais elaborado
        // Criando a fonte
        Font fonte = new Font("serif", Font.ITALIC | Font.BOLD, 50);
        // Definindo a fonte
        texto.setFont(fonte);
        // Definindo uma cor
        texto.setForeground(Color.BLUE);
        
        // Label com imagem
        ImageIcon icone = new ImageIcon(getClass().getResource("img/lampada.png"));
        JLabel imagem = new JLabel(icone);
        
        // Represeta a janela
        Container janela = getContentPane();
        // Adiciona um layout a janela
        janela.setLayout(new FlowLayout());
        
        // Adiciona o texto a janela
        janela.add(texto);
        // Adiciona a imagem a janela
        janela.add(imagem);
        
        // Padrao da janela
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(700, 700);
        setVisible(true);
    }

    public static void main(String[] args) {
        new ControleLabel();
    }
}
