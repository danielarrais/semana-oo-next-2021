package aula06.animais;

public class Reptil extends Animal{
    private String corEscamas;

    public Reptil(Double peso, Integer idade, Integer quantidadeMembros,String corEscamas) {
        super(peso, idade, quantidadeMembros);
        this.corEscamas = corEscamas;
    }

    @Override
    public void locomover() {
        System.out.println("Se arrastou!!!");
    }

    @Override
    public void alimentar() {
        System.out.println("Comeu como um reptil");
    }

    @Override
    public void emitirSom() {
        System.out.println("Emitiu som um reptil");
    }


    public String getCorEscamas() {
        return this.corEscamas;
    }

    public void setCorEscamas(String corEscamas) {
        this.corEscamas = corEscamas;
    }
}
