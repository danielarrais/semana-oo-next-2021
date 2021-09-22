package aula06.animais;

public class Tartaruga extends Reptil{

    public Tartaruga(Double peso, Integer idade, Integer quantidadeMembros, String corEscamas) {
        super(peso, idade, quantidadeMembros, corEscamas);
    }
    
    @Override
    public void locomover() {
        System.out.println("Andou lentamente");
    }
    
    @Override
    public void emitirSom() {
        System.out.println("Fez barulho com a boca");
    }
    
    @Override
    public void alimentar() {
        System.out.println("Comeu folhas");
    }
}
