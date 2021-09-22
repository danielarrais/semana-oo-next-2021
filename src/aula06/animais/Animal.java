package aula06.animais;

public abstract class Animal {
    private Double peso;
    private Integer idade;
    private Integer quantidadeMembros;

    public Animal(Double peso, Integer idade, Integer quantidadeMembros) {
        this.peso = peso;
        this.idade = idade;
        this.quantidadeMembros = quantidadeMembros;
    }

    public abstract void locomover();
    public abstract void alimentar();
    public abstract void emitirSom();

    public Double getPeso() {
        return this.peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public Integer getIdade() {
        return this.idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public Integer getQuantidadeMembros() {
        return this.quantidadeMembros;
    }

    public void setQuantidadeMembros(Integer quantidadeMembros) {
        this.quantidadeMembros = quantidadeMembros;
    }
}
