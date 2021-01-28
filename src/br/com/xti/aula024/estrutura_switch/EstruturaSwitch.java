/*
 * Curso Java XTI
 * Aula 24
 * Estrutura Switch
 */
package br.com.xti.aula024.estrutura_switch;

/**
 *
 * @author Kevin Lucas
 */
public class EstruturaSwitch {

    public static void main(String[] args) {

        // Verifica os casos do switch de acordo com o valor passado e excuta a instucao caso seja verdadeiro
        switch ('M') {
            case 'M':
                System.out.println("Masculino");
                break;
            case 'F':
                System.out.println("Feminico");
                break;
            default:
                System.out.println("Hemafrodita");
                break;
        }

        String tecnologia = "postgresql";
        switch (tecnologia) {
            case "java":
            case "c++":
            case "cobol":
                System.out.println("Linguagem de programacao");
                break;
            case "oracle":
            case "sqlserver":
            case "postgresql":
                System.out.println("Banco de dados");
                break;
            default:
                System.out.println("Outra tecnologia");
                break;
        }
    }
}
