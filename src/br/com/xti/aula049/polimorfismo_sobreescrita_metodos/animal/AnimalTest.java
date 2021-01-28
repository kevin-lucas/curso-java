/*
 * Curso Java XTI
 * Aula 049
 * Polimorfismo Sobreescrita de metodos
 */
package br.com.xti.aula049.polimorfismo_sobreescrita_metodos.animal;

/**
 *
 * @author Kevin Lucas
 */
public class AnimalTest {

    // Utilização sem polimorfismo
    static void barulhoSemPolimorfismo(String animal) {
        if (animal.equals("Cachorro")) {
            System.out.println("Au Au!");
        } else if (animal.equals("Galinha")) {
            System.out.println("Có Có");
        }
    }

    // Utilização sem polimorfismo
    static void barulhoComPolimorfismo(Animal animal) {
        animal.fazerBarulho();
    }

    public static void main(String[] args) {
        Animal generico = new Animal();
        Animal cachorro = new Cachorro();
        Animal galinha = new Galinha();

        //generico.fazerBarulho();
        //cachorro.fazerBarulho();
        //galinha.fazerBarulho();
        //barulhoSemPolimorfismo("Cachorro");
        //barulhoSemPolimorfismo("Galinha");
        barulhoComPolimorfismo(generico);
        barulhoComPolimorfismo(galinha);
        barulhoComPolimorfismo(cachorro);
    }
}
