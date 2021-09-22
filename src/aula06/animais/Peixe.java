package aula06.animais;

public class Peixe extends Animal{
    private String corEscamas;

    public Peixe(Double peso, Integer idade, Integer quantidadeMembros, String corEscamas) {
        super(peso, idade, quantidadeMembros);
        this.corEscamas = corEscamas;
    }

    public void soltarBolhas() {
        System.out.println("Soltou bolhas!!!");
    }

    @Override
    public void locomover() {
        System.out.println("Nadou!!!");
    }

    @Override
    public void alimentar() {
        System.out.println("Se alimentou com um peixe");
    }

    @Override
    public void emitirSom() {
        System.out.println("Emitiu som de um peixe");
    }

    public String getCorEscamas() {
        return this.corEscamas;
    }

    public void setCorEscamas(String corEscamas) {
        this.corEscamas = corEscamas;
    }
}
