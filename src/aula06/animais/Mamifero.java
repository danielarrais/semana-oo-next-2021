package aula06.animais;

public class Mamifero extends Animal{
    private String corPelo;

    public Mamifero(Double peso, Integer idade, Integer quantidadeMembros, String corPelo) {
        super(peso, idade, quantidadeMembros);
        this.corPelo = corPelo;
    }

    @Override
    public void locomover() {
        System.out.println("Andou!!!");
    }

    @Override
    public void alimentar() {
        System.out.println("Comeu como mamifero!!!");
    }

    @Override
    public void emitirSom() {
        System.out.println("Emitiu som de mamifero!!!");
    }

    public String getCorPelo() {
        return this.corPelo;
    }

    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }
}
