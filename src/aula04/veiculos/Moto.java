package aula04.veiculos;

public class Moto extends Veiculo {
    private Integer cilindradas;
    private String tipo;
    private Boolean eletrica;
    private Boolean flex;

    public Moto(
        String marca, 
        String cor, 
        String placa, 
        Integer ano, 
        Integer velocidadeMaxima, 
        Integer cilindradas,
        String tipo,
        Boolean eletrica,
        Boolean flex
    ) {
        super(marca, cor, placa, ano, velocidadeMaxima);
        this.cilindradas = cilindradas;
        this.tipo = tipo;
        this.eletrica = eletrica;
        this.flex = flex;
    }

    public Integer getCilindradas() {
        return this.cilindradas;
    }

    public void setCilindradas(Integer cilindradas) {
        this.cilindradas = cilindradas;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Boolean isEletrica() {
        return this.eletrica;
    }

    public Boolean getEletrica() {
        return this.eletrica;
    }

    public void setEletrica(Boolean eletrica) {
        this.eletrica = eletrica;
    }

    public Boolean isFlex() {
        return this.flex;
    }

    public Boolean getFlex() {
        return this.flex;
    }

    public void setFlex(Boolean flex) {
        this.flex = flex;
    }
}
