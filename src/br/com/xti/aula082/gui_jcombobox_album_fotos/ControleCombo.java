/*
 * Curso Java XTI
 * Aula 082
 * GUI, JComboBox e Álbum de Fotos
 */
package br.com.xti.aula082.gui_jcombobox_album_fotos;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Kevin Lucas
 */
public class ControleCombo extends JFrame implements ItemListener {

    // Declaração dos componentes
    JComboBox<String> seletorImagem;
    JLabel imagem;

    // Criando as imagens
    ImageIcon[] imagens = {
        new ImageIcon(getClass().getResource("img/xicara1.png")),
        new ImageIcon(getClass().getResource("img/xicara2.png")),
        new ImageIcon(getClass().getResource("img/xicara3.png")),
        new ImageIcon(getClass().getResource("img/xicara4.png"))
    };

    public ControleCombo() {
        super("Album de fotos");

        // Recupera o layout
        Container janela = getContentPane();

        // Cria o comboBox
        seletorImagem = new JComboBox<String>();
        // Adiciona uma fonte
        seletorImagem.setFont(new Font("serif", Font.PLAIN, 26));
        // Adiciona itens ao combo
        seletorImagem.addItem("Xicara 1");
        seletorImagem.addItem("Xicara 2");
        seletorImagem.addItem("Xicara 3");
        seletorImagem.addItem("Xicara 4");

        // Definindo um ouvite para o combo
        seletorImagem.addItemListener(this);

        // Cria o texto
        imagem = new JLabel(imagens[0]);

        // Adiciona o comboBox a janela
        janela.add(BorderLayout.NORTH, seletorImagem);
        // Adiciona o texto no centro
        janela.add(BorderLayout.CENTER, imagem);
        // Operacoes padroes
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Largura, altura
        setSize(500, 500);
        setVisible(true);
    }

    public static void main(String[] args) {
        new ControleCombo();
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        // Recupera o tipo de evento que ocorreu
        if (e.getStateChange() == ItemEvent.SELECTED) {
            // Altera a imagem utilizando a posicao do combo
            imagem.setIcon(imagens[seletorImagem.getSelectedIndex()]);
        }
    }
}
