/*
 * Curso Java XTI
 * Aula 081
 * GUI, JCheckBox e ItemListeners
 */
package br.com.xti.aula081.gui_jcheckbox_itemlistener;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Kevin Lucas
 */
public class ControleCheck extends JFrame {

    // Declarando os componentes
    JLabel texto;
    JCheckBox opcaoNegrito, opcaoItalico;

    public ControleCheck() {
        super("Ckeckbox");

        // Criando a janela
        Container janela = getContentPane();
        // Adicionando o layout
        janela.setLayout(new FlowLayout());

        // Adicionando os componentes
        // Criando o texto
        texto = new JLabel("Veja o texto mudar");
        texto.setFont(new Font("serif", Font.PLAIN, 26));

        // Criando as opcoes de checkbox
        opcaoNegrito = new JCheckBox("Negrito");
        opcaoItalico = new JCheckBox("Italico");

        // Adicionando os ouvintes de metodos as opcoes
        opcaoNegrito.addItemListener(new ItemCheckListener());
        opcaoItalico.addItemListener(new ItemCheckListener());

        // Adicionando os componentes a janela
        janela.add(texto);
        janela.add(opcaoNegrito);
        janela.add(opcaoItalico);

        // Operacoes padrao da janela
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 200);
        setVisible(true);
    }

    // Classe ouvinte dos eventos dos componentes checkbox
    class ItemCheckListener implements ItemListener {

        @Override
        public void itemStateChanged(ItemEvent e) {
            // Modificando o texto de acordo com a opcao escolhida
            if (opcaoNegrito.isSelected() && opcaoItalico.isSelected()) {
                // Define as fontes para texto
                texto.setFont(new Font("serif", Font.BOLD | Font.ITALIC, 26));
            } else if (opcaoNegrito.isSelected()) {
                // Define as fontes para texto
                texto.setFont(new Font("serif", Font.BOLD, 26));
            } else if (opcaoItalico.isSelected()) {
                // Define as fontes para texto
                texto.setFont(new Font("serif", Font.ITALIC, 26));
            } else {
                // Define as fontes para texto
                texto.setFont(new Font("serif", Font.PLAIN, 26));
            }
        }

    }

    public static void main(String[] args) {
        new ControleCheck();
    }
}
